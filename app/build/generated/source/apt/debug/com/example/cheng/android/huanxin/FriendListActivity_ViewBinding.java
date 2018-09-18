// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.huanxin;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FriendListActivity_ViewBinding implements Unbinder {
  private FriendListActivity target;

  @UiThread
  public FriendListActivity_ViewBinding(FriendListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FriendListActivity_ViewBinding(FriendListActivity target, View source) {
    this.target = target;

    target.LvFriendList = Utils.findRequiredViewAsType(source, R.id.Lv_FriendList, "field 'LvFriendList'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FriendListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.LvFriendList = null;
  }
}
