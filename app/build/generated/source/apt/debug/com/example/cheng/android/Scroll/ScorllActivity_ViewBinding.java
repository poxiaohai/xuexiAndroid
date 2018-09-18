// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Scroll;

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

public class ScorllActivity_ViewBinding implements Unbinder {
  private ScorllActivity target;

  private View view2131755328;

  private View view2131755333;

  @UiThread
  public ScorllActivity_ViewBinding(ScorllActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ScorllActivity_ViewBinding(final ScorllActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.textview1, "field 'textview1' and method 'onViewClicked'");
    target.textview1 = Utils.castView(view, R.id.textview1, "field 'textview1'", TextView.class);
    view2131755328 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.textview2, "field 'textview2' and method 'onViewClicked'");
    target.textview2 = Utils.castView(view, R.id.textview2, "field 'textview2'", TextView.class);
    view2131755333 = view;
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
    ScorllActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textview1 = null;
    target.textview2 = null;

    view2131755328.setOnClickListener(null);
    view2131755328 = null;
    view2131755333.setOnClickListener(null);
    view2131755333 = null;
  }
}
