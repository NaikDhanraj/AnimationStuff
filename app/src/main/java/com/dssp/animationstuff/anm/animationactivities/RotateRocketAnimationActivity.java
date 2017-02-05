package com.dssp.animationstuff.anm.animationactivities;

import android.animation.ValueAnimator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

public class RotateRocketAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {

    //1:Change the animator values to go from 0 to 360 because you
    // want the rocket to make a full turn. Note that you could create a U-turn effect with 0 to 180.
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(0,360);
    //of int
  //  ValueAnimator valueAnimator = ValueAnimator.ofInt(0,360);
    //ofObject is also possible

    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator animation) {
        float value = (float) animation.getAnimatedValue();

        //2 : Instead of setTranslationY, you call setRotation because that’s what needs to change.
        mRocket.setRotation(value);
      }
    });

    valueAnimator.setInterpolator(new LinearInterpolator());
    //valueAnimator.setInterpolator(new AnticipateOvershootInterpolator(1f));
    valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
    valueAnimator.start();

  }
}
