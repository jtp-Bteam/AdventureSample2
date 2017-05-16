
package jp.ac.dendai.c.jtp.adventuresample.scene;
import jp.ac.dendai.c.jtp.adventuresample.R;
public class Ending extends AbstractScene {
    @Override
    public int getImageId() {
        return R.drawable.ending;
    }
    @Override
    public int getMessageId() {
        return R.array.messageending;
    }
    @Override
    public int getQuestionId() {
        return 0;
    }
    @Override
    public GameState next(int no) {
        return null;
    }
    @Override
    public int getDateId() {
        return R.string.dateending;
    }
}