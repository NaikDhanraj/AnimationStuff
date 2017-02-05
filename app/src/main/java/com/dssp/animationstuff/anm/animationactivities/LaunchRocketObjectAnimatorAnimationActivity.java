package com.dssp.animationstuff.anm.animationactivities;

import android.animation.ObjectAnimator;

public class LaunchRocketObjectAnimatorAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {

        //1 : Creating an instance of ObjectAnimator
        //2 params :
        //A) mRocket is the object to animate
        //B)  The object must have a setter method of the form set"propertyName"(),
        // and the property you want to change is “translationY”.
        // You’re able to do this because mRocket is an object of class View,
        // which has an accessible setter with setTranslationY().
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mRocket, "translationY", 0, -mScreenHeight);//object|propertyname string | value float(from/to)

        //2
        objectAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
        objectAnimator.start();
        /**
         *
         The rocket behaves the same as it did with ValueAnimator, but with less coding
         */
    }
}
