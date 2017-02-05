package com.dssp.animationstuff.anm.animationactivities;

import android.animation.ValueAnimator;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

public class AccelerateRocketAnimationActivity extends BaseAnimationActivity {
  private static final String TAG = AccelerateRocketAnimationActivity.class.getSimpleName();

  @Override
  protected void onStartAnimation() {


    //1
    Log.e(TAG, "onStartAnimation: mScreenHeight"+mScreenHeight );
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(0,-mScreenHeight);

    //2
    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator animation) {

        //3
        float value = (float) animation.getAnimatedValue();
        //4 :
        mRocket.setTranslationY(value);

      }
    });

    //// TODO: 5here
    //5 : here you set your favourate interpolator ;uncomment one at a time and try each wt it does with changing value
//    valueAnimator.setInterpolator(new AccelerateInterpolator(2.1f));
//    valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
//    valueAnimator.setInterpolator(new AnticipateInterpolator(1f));//here view first animate down little and then animate upwards
//    valueAnimator.setInterpolator(new AnticipateOvershootInterpolator(1f));
    valueAnimator.setInterpolator(new BounceInterpolator());//ANIMATE UP AND BOUNCE BACK AT TOP
//    valueAnimator.setInterpolator(new CycleInterpolator(1f));
//    valueAnimator.setInterpolator(new DecelerateInterpolator(1f));
//    valueAnimator.setInterpolator(new FastOutLinearInInterpolator());
//    valueAnimator.setInterpolator(new FastOutSlowInInterpolator());
//    valueAnimator.setInterpolator(new PathInterpolator(2f));
    valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
    valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);

    //6
    valueAnimator.start();


  }
}
