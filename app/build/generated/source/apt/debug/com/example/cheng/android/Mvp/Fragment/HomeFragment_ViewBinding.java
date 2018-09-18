// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Mvp.Fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.fangx.haorefresh.HaoRecyclerView;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  @UiThread
  public HomeFragment_ViewBinding(HomeFragment target, View source) {
    this.target = target;

    target.swiperefresh = Utils.findRequiredViewAsType(source, R.id.swiperefresh, "field 'swiperefresh'", SwipeRefreshLayout.class);
    target.hao_recycleview = Utils.findRequiredViewAsType(source, R.id.hao_recycleview, "field 'hao_recycleview'", HaoRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swiperefresh = null;
    target.hao_recycleview = null;
  }
}
