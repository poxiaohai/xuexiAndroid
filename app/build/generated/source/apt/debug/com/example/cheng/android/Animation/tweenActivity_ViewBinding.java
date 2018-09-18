// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Animation;

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

public class tweenActivity_ViewBinding implements Unbinder {
  private tweenActivity target;

  private View view2131755341;

  private View view2131755340;

  @UiThread
  public tweenActivity_ViewBinding(tweenActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public tweenActivity_ViewBinding(final tweenActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.mAlphaAnimation, "field 'mAlphaAnimation' and method 'onViewClicked'");
    target.mAlphaAnimation = Utils.castView(view, R.id.mAlphaAnimation, "field 'mAlphaAnimation'", TextView.class);
    view2131755341 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tiaozhuan, "method 'onViewClicked'");
    view2131755340 = view;
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
    tweenActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAlphaAnimation = null;

    view2131755341.setOnClickListener(null);
    view2131755341 = null;
    view2131755340.setOnClickListener(null);
    view2131755340 = null;
  }
}
