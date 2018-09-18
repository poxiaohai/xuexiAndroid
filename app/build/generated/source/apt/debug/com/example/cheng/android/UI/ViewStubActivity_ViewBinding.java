// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.UI;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ViewStubActivity_ViewBinding implements Unbinder {
  private ViewStubActivity target;

  @UiThread
  public ViewStubActivity_ViewBinding(ViewStubActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ViewStubActivity_ViewBinding(ViewStubActivity target, View source) {
    this.target = target;

    target.errorStub = Utils.findRequiredViewAsType(source, R.id.error_stub, "field 'errorStub'", ViewStub.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ViewStubActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.errorStub = null;
  }
}
