package jp.ac.dendai.c.jtp.adventuresample.scene

import jp.ac.dendai.c.jtp.adventuresample.Handler
import jp.ac.dendai.c.jtp.adventuresample.Music
import jp.ac.dendai.c.jtp.adventuresample.R
import android.app.Activity
import android.app.AlertDialog
import android.app.AlertDialog.Builder
import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.media.MediaPlayer
import android.view.View
import android.widget.ImageView
import android.widget.TextView

abstract class AbstractScene(private val act: Activity) : Scene {
    private var index: Int = 0
    private var handler: Handler? = null
    protected fun size(): Int {
        return message.size
    }

    override fun onClick(v: View) {
        index++
        if (index < size()) {
            writeMessage()
        } else {
            if (questionId != 0) {
                val imageView = act!!.findViewById(R.id.imageView1) as ImageView
                imageView.setOnClickListener(null)
                askQuestion()
            } else {
                val n = next(0)
                val scene = n?.scene
                handler!!.step(scene!!)
            }
        }
    }

    private fun askQuestion() {
        val builder = Builder(act)
        builder.setCancelable(false)
        builder.setPositiveButton(question[0], Answer(0))
        builder.setNegativeButton(question[1], Answer(1))
        builder.setNeutralButton(question[2], Answer(2))
        val alert = builder.create()
        alert.show()
    }

    private inner class Answer(private val no: Int) : OnClickListener {
        override fun onClick(dialog: DialogInterface, which: Int) {
            handler!!.step(next(no)!!.scene)
        }
    }

    override fun start(h: Handler) {
        handler = h
        index = 0
        act!!.setContentView(R.layout.activity_main)
        val imageView = act!!.findViewById(R.id.imageView1) as ImageView
        imageView.setOnClickListener(this)
        imageView.setImageResource(imageId)
        writeMessage()
    }

    private fun writeMessage() {
        val textView = act!!.findViewById(R.id.textarea) as TextView
        textView.text = message[index]
        val textdate = act!!.findViewById(R.id.textdate) as TextView
        textdate.text = act!!.resources.getString(dateId)

    }

    protected val message: Array<String>
        get() = getStringArrayById(messageId)
    protected val question: Array<String>
        get() = getStringArrayById(questionId)

    protected fun getStringArrayById(id: Int): Array<String> {
        return act!!.resources.getStringArray(id)
    }

}