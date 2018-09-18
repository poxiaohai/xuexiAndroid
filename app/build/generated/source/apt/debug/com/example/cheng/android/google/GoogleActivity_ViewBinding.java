// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.google;

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

public class GoogleActivity_ViewBinding implements Unbinder {
  private GoogleActivity target;

  private View view2131755287;

  private View view2131755288;

  private View view2131755289;

  private View view2131755286;

  @UiThread
  public GoogleActivity_ViewBinding(GoogleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GoogleActivity_ViewBinding(final GoogleActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.dingwei, "field 'dingwei' and method 'onViewClicked'");
    target.dingwei = Utils.castView(view, R.id.dingwei, "field 'dingwei'", TextView.class);
    view2131755287 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ditu, "field 'ditu' and method 'onViewClicked'");
    target.ditu = Utils.castView(view, R.id.ditu, "field 'ditu'", TextView.class);
    view2131755288 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.luxian, "field 'luxian' and method 'onViewClicked'");
    target.luxian = Utils.castView(view, R.id.luxian, "field 'luxian'", TextView.class);
    view2131755289 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.didianxuanqu, "field 'didianxuanqu' and method 'onViewClicked'");
    target.didianxuanqu = Utils.castView(view, R.id.didianxuanqu, "field 'didianxuanqu'", TextView.class);
    view2131755286 = view;
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
    GoogleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.dingwei = null;
    target.ditu = null;
    target.luxian = null;
    target.didianxuanqu = null;

    view2131755287.setOnClickListener(null);
    view2131755287 = null;
    view2131755288.setOnClickListener(null);
    view2131755288 = null;
    view2131755289.setOnClickListener(null);
    view2131755289 = null;
    view2131755286.setOnClickListener(null);
    view2131755286 = null;
  }
}
