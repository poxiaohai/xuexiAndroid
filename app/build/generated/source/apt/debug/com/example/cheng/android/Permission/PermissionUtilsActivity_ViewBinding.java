// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Permission;

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

public class PermissionUtilsActivity_ViewBinding implements Unbinder {
  private PermissionUtilsActivity target;

  private View view2131755330;

  @UiThread
  public PermissionUtilsActivity_ViewBinding(PermissionUtilsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PermissionUtilsActivity_ViewBinding(final PermissionUtilsActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.call_phone, "field 'callPhone' and method 'onViewClicked'");
    target.callPhone = Utils.castView(view, R.id.call_phone, "field 'callPhone'", TextView.class);
    view2131755330 = view;
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
    PermissionUtilsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.callPhone = null;

    view2131755330.setOnClickListener(null);
    view2131755330 = null;
  }
}
