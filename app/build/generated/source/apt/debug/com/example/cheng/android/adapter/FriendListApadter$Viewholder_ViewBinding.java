// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FriendListApadter$Viewholder_ViewBinding implements Unbinder {
  private FriendListApadter.Viewholder target;

  @UiThread
  public FriendListApadter$Viewholder_ViewBinding(FriendListApadter.Viewholder target,
      View source) {
    this.target = target;

    target.username = Utils.findRequiredViewAsType(source, R.id.username, "field 'username'", TextView.class);
    target.BtnCallPhone = Utils.findRequiredViewAsType(source, R.id.Btn_callPhone, "field 'BtnCallPhone'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FriendListApadter.Viewholder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.username = null;
    target.BtnCallPhone = null;
  }
}
