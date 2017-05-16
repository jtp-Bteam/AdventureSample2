package jp.ac.dendai.c.jtp.adventuresample;
import android.support.v7.app.ActionBarActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
public class Title {
    public void init(ActionBarActivity activity, OnClickListener onStartButtonClickListener, OnClickListener onContinueButtonClickListener) {
        Button startButton = (Button) activity.findViewById(R.id.startbutton);
        Button continueButton = (Button) activity.findViewById(R.id.continuebutton);
        startButton.setOnClickListener(onStartButtonClickListener);
        continueButton.setOnClickListener(onContinueButtonClickListener);
    }
    public int getContentView() {
        return R.layout.title;
    }
}