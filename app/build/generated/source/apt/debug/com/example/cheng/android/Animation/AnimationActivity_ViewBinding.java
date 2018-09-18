// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Animation;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AnimationActivity_ViewBinding implements Unbinder {
  private AnimationActivity target;

  private View view2131755260;

  private View view2131755262;

  private View view2131755263;

  private View view2131755261;

  private View view2131755264;

  @UiThread
  public AnimationActivity_ViewBinding(AnimationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AnimationActivity_ViewBinding(final AnimationActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.frame, "field 'frame' and method 'onViewClicked'");
    target.frame = Utils.castView(view, R.id.frame, "field 'frame'", TextView.class);
    view2131755260 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tween, "field 'tween' and method 'onViewClicked'");
    target.tween = Utils.castView(view, R.id.tween, "field 'tween'", TextView.class);
    view2131755262 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.mAnimatorListener, "field 'mAnimatorListener' and method 'onViewClicked'");
    target.mAnimatorListener = Utils.castView(view, R.id.mAnimatorListener, "field 'mAnimatorListener'", TextView.class);
    view2131755263 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mlayout = Utils.findRequiredViewAsType(source, R.id.mlayout, "field 'mlayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.shuxing, "method 'onViewClicked'");
    view2131755261 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.layout, "method 'onViewClicked'");
    view2131755264 = view;
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
    AnimationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.frame = null;
    target.tween = null;
    target.mAnimatorListener = null;
    target.mlayout = null;

    view2131755260.setOnClickListener(null);
    view2131755260 = null;
    view2131755262.setOnClickListener(null);
    view2131755262 = null;
    view2131755263.setOnClickListener(null);
    view2131755263 = null;
    view2131755261.setOnClickListener(null);
    view2131755261 = null;
    view2131755264.setOnClickListener(null);
    view2131755264 = null;
  }
}
