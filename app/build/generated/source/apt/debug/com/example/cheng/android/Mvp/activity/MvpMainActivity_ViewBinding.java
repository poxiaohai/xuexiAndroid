// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Mvp.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MvpMainActivity_ViewBinding implements Unbinder {
  private MvpMainActivity target;

  @UiThread
  public MvpMainActivity_ViewBinding(MvpMainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MvpMainActivity_ViewBinding(MvpMainActivity target, View source) {
    this.target = target;

    target.nav = Utils.findRequiredViewAsType(source, R.id.nav, "field 'nav'", NavigationView.class);
    target.activityNa = Utils.findRequiredViewAsType(source, R.id.activity_na, "field 'activityNa'", DrawerLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MvpMainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nav = null;
    target.activityNa = null;
    target.toolbar = null;
  }
}
