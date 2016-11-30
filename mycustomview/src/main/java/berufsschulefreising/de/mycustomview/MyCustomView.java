package berufsschulefreising.de.mycustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
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
    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;

    public MyCustomView(Context context) {
        super(context);
        Log.e("init","initxx");
        init(context);
    }

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e("init","inityy");
        init(context);
    }
    private void init(Context context)
    {
        Log.e("init","init00");
        rootView = inflate(context, R.layout.custom_view, this);
        Log.e("init1","init111");
        valueTextView = (TextView) rootView.findViewById(R.id.valueTextView);
        Log.e("init2","init22");
        minusButton = rootView.findViewById(R.id.minusButton);
        plusButton = rootView.findViewById(R.id.plusButton);

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               decrementValue();
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              incrementValue();        }
            
        });
    }
    private void incrementValue() {
        int currentVal = Integer.valueOf(valueTextView.getText().toString());
        if(currentVal < maxValue) {
            valueTextView.setText(String.valueOf(currentVal + 1));
        }
    }
    private void decrementValue() {
        int currentVal = Integer.valueOf(valueTextView.getText().toString());
        if(currentVal < maxValue) {
            valueTextView.setText(String.valueOf(currentVal - 1));
        }
    }


    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getValue() {
        return Integer.valueOf(valueTextView.getText().toString());
    }

    public void setValue(int newValue) {
        int value = newValue;
        if(newValue < minValue) {
            value = minValue;
        } else if (newValue > maxValue) {
            value = maxValue;
        }

        valueTextView.setText(String.valueOf(value));
    }

}

