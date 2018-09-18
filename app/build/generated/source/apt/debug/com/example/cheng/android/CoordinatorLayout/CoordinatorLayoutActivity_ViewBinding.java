// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.CoordinatorLayout;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CoordinatorLayoutActivity_ViewBinding implements Unbinder {
  private CoordinatorLayoutActivity target;

  @UiThread
  public CoordinatorLayoutActivity_ViewBinding(CoordinatorLayoutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CoordinatorLayoutActivity_ViewBinding(CoordinatorLayoutActivity target, View source) {
    this.target = target;

    target.imageview = Utils.findRequiredViewAsType(source, R.id.imageview, "field 'imageview'", ImageView.class);
    target.imageviewT = Utils.findRequiredViewAsType(source, R.id.imageviewT, "field 'imageviewT'", ImageView.class);
    target.recyclerview = Utils.findRequiredViewAsType(source, R.id.recyclerview, "field 'recyclerview'", RecyclerView.class);
    target.activityMain = Utils.findRequiredViewAsType(source, R.id.activity_main, "field 'activityMain'", CoordinatorLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CoordinatorLayoutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageview = null;
    target.imageviewT = null;
    target.recyclerview = null;
    target.activityMain = null;
  }
}
