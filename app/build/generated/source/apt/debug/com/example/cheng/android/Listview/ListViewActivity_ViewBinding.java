// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Listview;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListViewActivity_ViewBinding implements Unbinder {
  private ListViewActivity target;

  @UiThread
  public ListViewActivity_ViewBinding(ListViewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListViewActivity_ViewBinding(ListViewActivity target, View source) {
    this.target = target;

    target.listview = Utils.findRequiredViewAsType(source, R.id.listview, "field 'listview'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListViewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listview = null;
  }
}
