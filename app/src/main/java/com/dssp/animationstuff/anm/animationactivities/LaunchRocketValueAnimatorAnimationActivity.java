package com.dssp.animationstuff.anm.animationactivities;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.animation.LinearInterpolator;

public class LaunchRocketValueAnimatorAnimationActivity extends BaseAnimationActivity {
    private static final String TAG = LaunchRocketValueAnimatorAnimationActivity.class.getSimpleName();

    @Override
    protected void onStartAnimation() {

        //1 : Create an instance of ValueAnimator by calling the static method ofFloat.
        // It accepts the floating point numbers that’ll apply to the specified property of the animated object over time.
        // In this case, the values start at 0 and end with -mScreenHeight. Android starts screen coordinates at the top-left corner,
        // so the rocket’s Y translation changes from 0 to the negative of the screen height — it moves bottom to top
        Log.e(TAG, "onStartAnimation: mScreenHeight" + mScreenHeight);
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, -mScreenHeight);

        //2 : Call addUpdateListener() and pass in a listener.
        // ValueAnimator calls this listener with every update to the animated value — remember the default delay of 10 ms
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

                //3 :Get the current value from the animator and cast it to float;
                // current value type is float because you created the ValueAnimator with ofFloat.
                float value = (float) animation.getAnimatedValue();
                Log.e(TAG, "onAnimationUpdate: value : " + value + " currentplayedtime : " + animation.getCurrentPlayTime());
                //4 : Change the rocket’s position by using the setTranslationY()
                mRocket.setTranslationY(value);


            }
        });

        //5 : Set up the animator’s duration and interpolator
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);

        //6 : start the animation
        valueAnimator.start();


        /**
         * you can animate any property of view
         */
    /*
    setScaleX(float) and setScaleY(float)
    – these allow you to scale the view by x-axis or y-axis independently, or you can call both with the same value to animate the view’s size.
    setTranslationX(float) and setTranslationY(float)
    – these allow you to change the view’s on-screen position.
    setAlpha(float)
    – animate view’s transparency; 0 stands for completely transparent and 1 for completely opaque.
    setRotation(float)
     – rotates the view on screen; the argument is in degrees, so 360 means a full clockwise turn. You may specify negative values as well, for instance, -90 means a counterclockwise quarter-turn.
    setRotationX(float) and setRotationY(float)
    – the same as setRotation but along the x-axis and y-axis. These allow you to rotate in 3D.
    setBackgroundColor(int)
        – lets you set a color. The integer argument must specify a color as Android constants Color.YELLOW, Color.BLUE do.
     */

    }
}
