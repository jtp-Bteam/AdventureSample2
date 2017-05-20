package jp.ac.dendai.c.jtp.adventuresample

import android.support.v7.app.ActionBarActivity
import android.view.View.OnClickListener
import android.widget.Button

class Title {
    fun init(activity: ActionBarActivity, onStartButtonClickListener: OnClickListener, onContinueButtonClickListener: OnClickListener) {
        val startButton = activity.findViewById(R.id.startbutton) as Button
        val continueButton = activity.findViewById(R.id.continuebutton) as Button
        startButton.setOnClickListener(onStartButtonClickListener)
        continueButton.setOnClickListener(onContinueButtonClickListener)
    }

    val contentView: Int
        get() = R.layout.title
}