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

public class Looper3Activity_ViewBinding implements Unbinder {
  private Looper3Activity target;

  private View view2131755323;

  private View view2131755324;

  @UiThread
  public Looper3Activity_ViewBinding(Looper3Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Looper3Activity_ViewBinding(final Looper3Activity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.sendmsg, "field 'sendmsg' and method 'onViewClicked'");
    target.sendmsg = Utils.castView(view, R.id.sendmsg, "field 'sendmsg'", TextView.class);
    view2131755323 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.shownub, "field 'shownub' and method 'onViewClicked'");
    target.shownub = Utils.castView(view, R.id.shownub, "field 'shownub'", TextView.class);
    view2131755324 = view;
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
    Looper3Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sendmsg = null;
    target.shownub = null;

    view2131755323.setOnClickListener(null);
    view2131755323 = null;
    view2131755324.setOnClickListener(null);
    view2131755324 = null;
  }
}
