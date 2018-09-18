// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.RecyclerView;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RecyclerViewActivity_ViewBinding implements Unbinder {
  private RecyclerViewActivity target;

  @UiThread
  public RecyclerViewActivity_ViewBinding(RecyclerViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RecyclerViewActivity_ViewBinding(RecyclerViewActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.mRecyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecyclerViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
