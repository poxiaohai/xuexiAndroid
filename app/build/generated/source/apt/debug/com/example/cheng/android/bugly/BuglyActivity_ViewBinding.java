// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.bugly;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BuglyActivity_ViewBinding implements Unbinder {
  private BuglyActivity target;

  @UiThread
  public BuglyActivity_ViewBinding(BuglyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BuglyActivity_ViewBinding(BuglyActivity target, View source) {
    this.target = target;

    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BuglyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
  }
}
