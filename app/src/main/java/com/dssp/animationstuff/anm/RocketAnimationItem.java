package com.dssp.animationstuff.anm;

import android.content.Intent;

public class RocketAnimationItem {
  private final String mTitle;
  private final Intent mIntent;

  public RocketAnimationItem(String title, Intent intent) {
    mTitle = title;
    mIntent = intent;
  }

  public Intent getIntent() {
    return mIntent;
  }

  public String getTitle() {
    return mTitle;
  }
}
