// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.shijian.Activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScrollViewForListViewActivity_ViewBinding implements Unbinder {
  private ScrollViewForListViewActivity target;

  @UiThread
  public ScrollViewForListViewActivity_ViewBinding(ScrollViewForListViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ScrollViewForListViewActivity_ViewBinding(ScrollViewForListViewActivity target,
      View source) {
    this.target = target;

    target.listview = Utils.findRequiredViewAsType(source, R.id.listview, "field 'listview'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ScrollViewForListViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listview = null;
  }
}
