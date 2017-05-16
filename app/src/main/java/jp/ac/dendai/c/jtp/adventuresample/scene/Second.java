
package jp.ac.dendai.c.jtp.adventuresample.scene;
import jp.ac.dendai.c.jtp.adventuresample.R;
public class Second extends AbstractScene {
    @Override
    public GameState next(int no) {
        switch(no){
            case 0:
                return GameState.ending;
            case 1:
                return GameState.badend;
        }
        return null;
    }
    @Override
    public int getImageId() {
        return R.drawable.second;
    }
    @Override
    public int getMessageId() {
        return R.array.message2;
    }
    @Override
    public int getQuestionId() {
        return R.array.question2;
    }
    @Override
    public int getDateId() {
        return R.string.date2;
    }
}