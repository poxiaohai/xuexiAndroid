// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import com.example.cheng.android.view.SubView.FlowGroupView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FlayoutActivity_ViewBinding implements Unbinder {
  private FlayoutActivity target;

  @UiThread
  public FlayoutActivity_ViewBinding(FlayoutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FlayoutActivity_ViewBinding(FlayoutActivity target, View source) {
    this.target = target;

    target.FlowGroupView = Utils.findRequiredViewAsType(source, R.id.FlowGroupView, "field 'FlowGroupView'", FlowGroupView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FlayoutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.FlowGroupView = null;
  }
}
