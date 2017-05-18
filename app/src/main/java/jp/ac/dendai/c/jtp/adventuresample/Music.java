package jp.ac.dendai.c.jtp.adventuresample;

import android.app.Activity;
import android.media.MediaPlayer;

import jp.ac.dendai.c.jtp.adventuresample.scene.Scene;

/**
 * Created by yuuki on 2017/05/18.
 */

public class Music {
    public MediaPlayer mp = new MediaPlayer();

    public void MusicStop(){
        mp.stop();
        mp.reset();
        // リソースの解放
        mp.release();
    }

    public void music(Activity activity, Scene scene){
        if(mp != null) {
            MusicStop();
        }
        mp = MediaPlayer.create(activity, scene.getMusicId());
        mp.start();
    }
}
