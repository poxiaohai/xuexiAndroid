// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.BaseBottom;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseBottomViewActivity_ViewBinding implements Unbinder {
  private BaseBottomViewActivity target;

  private View view2131755272;

  @UiThread
  public BaseBottomViewActivity_ViewBinding(BaseBottomViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseBottomViewActivity_ViewBinding(final BaseBottomViewActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.BaseBottomView, "method 'onViewClicked'");
    view2131755272 = view;
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
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131755272.setOnClickListener(null);
    view2131755272 = null;
  }
}
