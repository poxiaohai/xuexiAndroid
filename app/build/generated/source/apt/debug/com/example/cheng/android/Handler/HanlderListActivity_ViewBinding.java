// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Handler;

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

public class HanlderListActivity_ViewBinding implements Unbinder {
  private HanlderListActivity target;

  private View view2131755314;

  private View view2131755032;

  private View view2131755315;

  @UiThread
  public HanlderListActivity_ViewBinding(HanlderListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HanlderListActivity_ViewBinding(final HanlderListActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.text1, "field 'text1' and method 'onViewClicked'");
    target.text1 = Utils.castView(view, R.id.text1, "field 'text1'", TextView.class);
    view2131755314 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.text2, "field 'text2' and method 'onViewClicked'");
    target.text2 = Utils.castView(view, R.id.text2, "field 'text2'", TextView.class);
    view2131755032 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.suiji, "method 'onViewClicked'");
    view2131755315 = view;
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
    HanlderListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.text1 = null;
    target.text2 = null;

    view2131755314.setOnClickListener(null);
    view2131755314 = null;
    view2131755032.setOnClickListener(null);
    view2131755032 = null;
    view2131755315.setOnClickListener(null);
    view2131755315 = null;
  }
}
