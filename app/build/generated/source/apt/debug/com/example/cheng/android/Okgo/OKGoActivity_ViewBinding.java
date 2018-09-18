// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Okgo;

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

public class OKGoActivity_ViewBinding implements Unbinder {
  private OKGoActivity target;

  private View view2131755328;

  @UiThread
  public OKGoActivity_ViewBinding(OKGoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OKGoActivity_ViewBinding(final OKGoActivity target, View source) {
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
  }

  @Override
  @CallSuper
  public void unbind() {
    OKGoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textview1 = null;

    view2131755328.setOnClickListener(null);
    view2131755328 = null;
  }
}
