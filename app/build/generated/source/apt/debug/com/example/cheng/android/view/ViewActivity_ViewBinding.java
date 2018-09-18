// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ViewActivity_ViewBinding implements Unbinder {
  private ViewActivity target;

  private View view2131755349;

  private View view2131755338;

  private View view2131755350;

  @UiThread
  public ViewActivity_ViewBinding(ViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ViewActivity_ViewBinding(final ViewActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn1, "field 'btn1' and method 'onViewClicked'");
    target.btn1 = Utils.castView(view, R.id.btn1, "field 'btn1'", TextView.class);
    view2131755349 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn2, "method 'onViewClicked'");
    view2131755338 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.Flayout, "method 'onViewClicked'");
    view2131755350 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn1 = null;

    view2131755349.setOnClickListener(null);
    view2131755349 = null;
    view2131755338.setOnClickListener(null);
    view2131755338 = null;
    view2131755350.setOnClickListener(null);
    view2131755350 = null;
  }
}
