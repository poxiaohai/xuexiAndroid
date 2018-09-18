// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.ipc;

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

public class AidlActivity_ViewBinding implements Unbinder {
  private AidlActivity target;

  private View view2131755258;

  @UiThread
  public AidlActivity_ViewBinding(AidlActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AidlActivity_ViewBinding(final AidlActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.adidl, "field 'adidl' and method 'onViewClicked'");
    target.adidl = Utils.castView(view, R.id.adidl, "field 'adidl'", TextView.class);
    view2131755258 = view;
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
    AidlActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.adidl = null;

    view2131755258.setOnClickListener(null);
    view2131755258 = null;
  }
}
