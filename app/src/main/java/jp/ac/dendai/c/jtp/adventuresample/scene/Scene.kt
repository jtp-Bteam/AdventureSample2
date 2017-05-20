package jp.ac.dendai.c.jtp.adventuresample.scene

import jp.ac.dendai.c.jtp.adventuresample.Handler
import android.view.View.OnClickListener

interface Scene : OnClickListener {
    fun next(no: Int): GameState?
    fun start(hand: Handler)
    val messageId: Int
    val imageId: Int
    val questionId: Int
    val dateId: Int
    val musicId: Int
}