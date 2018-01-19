package com.oursky.skeleton.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.oursky.skeleton.R;
import com.oursky.skeleton.helper.LP;
import com.oursky.skeleton.ui.base.AppController;

import static com.oursky.skeleton.helper.ResourceHelper.font;

public class SplashScreen extends AppController {
    @Override
    protected @NonNull View onCreateView(Context context) {
        FrameLayout layout = new FrameLayout(context);
        TextView tv = new TextView(context);
        tv.setTypeface(font(R.font.barlow_condensed_thin));
        tv.setTextSize(32);
        tv.setText(R.string.splash_title);
        layout.addView(tv, LP.frame(LP.WRAP_CONTENT, LP.WRAP_CONTENT, Gravity.CENTER).build());
        return layout;
    }
}
