package jp.ac.dendai.c.jtp.adventuresample

import android.app.Activity
import android.media.MediaPlayer

import jp.ac.dendai.c.jtp.adventuresample.scene.Scene

/**
 * Created by yuuki on 2017/05/18.
 */

class Music {
    var activity: Activity? = null
    var scene: Scene? = null

    var mp: MediaPlayer? = MediaPlayer()

    fun MusicStart() {
        mp = MediaPlayer.create(activity, scene!!.musicId)
        mp!!.start()
    }

    fun MusicStop() {
        mp!!.stop()
        mp!!.reset()
        // リソースの解放
        mp!!.release()
    }

    fun music(activity: Activity, scene: Scene) {
        this.activity = activity
        this.scene = scene

        if (mp != null) {
            MusicStop()
        }
        MusicStart()
    }
}
