// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.CheckVersion;

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

public class CheckVersionActivity_ViewBinding implements Unbinder {
  private CheckVersionActivity target;

  private View view2131755275;

  @UiThread
  public CheckVersionActivity_ViewBinding(CheckVersionActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CheckVersionActivity_ViewBinding(final CheckVersionActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.Tvshenji, "field 'Tvshenji' and method 'onViewClicked'");
    target.Tvshenji = Utils.castView(view, R.id.Tvshenji, "field 'Tvshenji'", TextView.class);
    view2131755275 = view;
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
    CheckVersionActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.Tvshenji = null;

    view2131755275.setOnClickListener(null);
    view2131755275 = null;
  }
}
