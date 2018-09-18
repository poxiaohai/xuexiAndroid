// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.UI;

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

public class UIActivity_ViewBinding implements Unbinder {
  private UIActivity target;

  private View view2131755342;

  private View view2131755343;

  private View view2131755344;

  private View view2131755345;

  private View view2131755346;

  @UiThread
  public UIActivity_ViewBinding(UIActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UIActivity_ViewBinding(final UIActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.Include, "field 'Include' and method 'onViewClicked'");
    target.Include = Utils.castView(view, R.id.Include, "field 'Include'", TextView.class);
    view2131755342 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ViewStub, "field 'ViewStub' and method 'onViewClicked'");
    target.ViewStub = Utils.castView(view, R.id.ViewStub, "field 'ViewStub'", TextView.class);
    view2131755343 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.merge, "field 'merge' and method 'onViewClicked'");
    target.merge = Utils.castView(view, R.id.merge, "field 'merge'", TextView.class);
    view2131755344 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.compoundDrawable, "field 'compoundDrawable' and method 'onViewClicked'");
    target.compoundDrawable = Utils.castView(view, R.id.compoundDrawable, "field 'compoundDrawable'", TextView.class);
    view2131755345 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.lit, "field 'lit' and method 'onViewClicked'");
    target.lit = Utils.castView(view, R.id.lit, "field 'lit'", TextView.class);
    view2131755346 = view;
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
    UIActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.Include = null;
    target.ViewStub = null;
    target.merge = null;
    target.compoundDrawable = null;
    target.lit = null;

    view2131755342.setOnClickListener(null);
    view2131755342 = null;
    view2131755343.setOnClickListener(null);
    view2131755343 = null;
    view2131755344.setOnClickListener(null);
    view2131755344 = null;
    view2131755345.setOnClickListener(null);
    view2131755345 = null;
    view2131755346.setOnClickListener(null);
    view2131755346 = null;
  }
}
