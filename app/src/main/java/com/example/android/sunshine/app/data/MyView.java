package com.example.android.sunshine.app.data;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by MOHIMRON on 28-Feb-17.
 */
public class MyView extends View {

public MyView (Context context){
    super(context);
}

public MyView(Context context, AttributeSet attrs){
    super(context, attrs);
}


    public MyView(Context context,AttributeSet attrs,int Defaultstyle){
    super(context, attrs,Defaultstyle);

    }

//    @Override
//    protected void onMeasure(int wMeasureSpec, int hMeasureSpec) {
//        //super(wMeasureSpec,hMeasureSpec);
//        super(wMeasureSpec,hMeasureSpec);
//    }
}
