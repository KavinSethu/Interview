package blackdots.t.interview.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class CustomTextView extends androidx.appcompat.widget.AppCompatTextView {

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextView(Context context) {
        super(context);
        init();
    }

    @Override
    public void setTypeface(Typeface tf, int style) {

        if( style == Typeface.BOLD ){
            super.setTypeface( Typeface.createFromAsset(getContext().getAssets(), "Nunito-SemiBold.ttf" ) );
        }else{
            super.setTypeface( Typeface.createFromAsset(getContext().getAssets(), "Nunito-Regular.ttf" ) );
        }

    }

    public void init() {

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Nunito-Regular.ttf" );
        setTypeface(tf);

    }
}
