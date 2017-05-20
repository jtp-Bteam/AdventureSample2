package jp.ac.dendai.c.jtp.adventuresample

import jp.ac.dendai.c.jtp.adventuresample.scene.GameState
import jp.ac.dendai.c.jtp.adventuresample.scene.Scene

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.support.v7.app.ActionBarActivity
import android.view.View
import android.view.View.OnClickListener

class Game(private val activity: ActionBarActivity) : Handler {
    private val title: Title
    private var scene: Scene? = null

    private val music = Music()

    init {
        title = Title()
    }

    override fun step(s: Scene) {
        scene = s
        start()

    }

    fun start() {
        if (scene == null) {
            activity.setContentView(title.contentView)
            title.init(activity, OnStartButtonClickListener(true), OnStartButtonClickListener(false))
        } else {
            activity.setContentView(R.layout.activity_main)
            music.music(activity, scene!!)
            scene!!.start(this)
        }
    }

    internal inner class OnStartButtonClickListener(private val intialize: Boolean) : OnClickListener {
        override fun onClick(v: View) {
            if (intialize || scene == null) {
                scene = GameState.initialScene
            }
            start()
        }
    }
}