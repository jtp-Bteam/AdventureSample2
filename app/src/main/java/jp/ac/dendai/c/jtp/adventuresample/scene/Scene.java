package jp.ac.dendai.c.jtp.adventuresample.scene;
import jp.ac.dendai.c.jtp.adventuresample.Handler;
import android.view.View.OnClickListener;
public interface Scene extends OnClickListener {
    GameState next(int no);
    void start(Handler hand);
    int getMessageId();
    int getImageId();
    int getQuestionId();
    int getDateId();
}