// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Thead;

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

public class SubTheadMessageActivity_ViewBinding implements Unbinder {
  private SubTheadMessageActivity target;

  private View view2131755338;

  @UiThread
  public SubTheadMessageActivity_ViewBinding(SubTheadMessageActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubTheadMessageActivity_ViewBinding(final SubTheadMessageActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn2, "field 'btn2' and method 'onViewClicked'");
    target.btn2 = Utils.castView(view, R.id.btn2, "field 'btn2'", TextView.class);
    view2131755338 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SubTheadMessageActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn2 = null;

    view2131755338.setOnClickListener(null);
    view2131755338 = null;
  }
}
