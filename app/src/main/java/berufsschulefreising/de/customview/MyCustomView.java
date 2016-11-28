package berufsschulefreising.de.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Albrecht on 28.11.2016.
 */

public class MyCustomView extends RelativeLayout {

    View rootView;
    TextView valueTextView;
    View minusButton;
    View plusButton;

    public MyCustomView(Context context) {
        super(context);
        init(context);
    }

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        //do setup work here
    }
}
