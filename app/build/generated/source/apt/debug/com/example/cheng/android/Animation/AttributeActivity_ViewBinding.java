// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Animation;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AttributeActivity_ViewBinding implements Unbinder {
  private AttributeActivity target;

  private View view2131755266;

  private View view2131755267;

  private View view2131755268;

  private View view2131755269;

  private View view2131755271;

  private View view2131755270;

  @UiThread
  public AttributeActivity_ViewBinding(AttributeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AttributeActivity_ViewBinding(final AttributeActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.Alpha, "field 'Alpha' and method 'onViewClicked'");
    target.Alpha = Utils.castView(view, R.id.Alpha, "field 'Alpha'", TextView.class);
    view2131755266 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.Rotate, "field 'Rotate' and method 'onViewClicked'");
    target.Rotate = Utils.castView(view, R.id.Rotate, "field 'Rotate'", TextView.class);
    view2131755267 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.Translate, "field 'Translate' and method 'onViewClicked'");
    target.Translate = Utils.castView(view, R.id.Translate, "field 'Translate'", TextView.class);
    view2131755268 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.Scale, "field 'Scale' and method 'onViewClicked'");
    target.Scale = Utils.castView(view, R.id.Scale, "field 'Scale'", TextView.class);
    view2131755269 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.AnimationSet, "field 'AnimationSet' and method 'onViewClicked'");
    target.AnimationSet = Utils.castView(view, R.id.AnimationSet, "field 'AnimationSet'", TextView.class);
    view2131755271 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.imageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'imageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.mObjectAnimator, "method 'onViewClicked'");
    view2131755270 = view;
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
    AttributeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.Alpha = null;
    target.Rotate = null;
    target.Translate = null;
    target.Scale = null;
    target.AnimationSet = null;
    target.imageView = null;

    view2131755266.setOnClickListener(null);
    view2131755266 = null;
    view2131755267.setOnClickListener(null);
    view2131755267 = null;
    view2131755268.setOnClickListener(null);
    view2131755268 = null;
    view2131755269.setOnClickListener(null);
    view2131755269 = null;
    view2131755271.setOnClickListener(null);
    view2131755271 = null;
    view2131755270.setOnClickListener(null);
    view2131755270 = null;
  }
}
