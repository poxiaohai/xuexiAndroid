// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Animation;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class frameActivity_ViewBinding implements Unbinder {
  private frameActivity target;

  private View view2131755129;

  private View view2131755284;

  @UiThread
  public frameActivity_ViewBinding(frameActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public frameActivity_ViewBinding(final frameActivity target, View source) {
    this.target = target;

    View view;
    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.start, "field 'start' and method 'onViewClicked'");
    target.start = Utils.castView(view, R.id.start, "field 'start'", Button.class);
    view2131755129 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.stop, "field 'stop' and method 'onViewClicked'");
    target.stop = Utils.castView(view, R.id.stop, "field 'stop'", Button.class);
    view2131755284 = view;
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
    frameActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.start = null;
    target.stop = null;

    view2131755129.setOnClickListener(null);
    view2131755129 = null;
    view2131755284.setOnClickListener(null);
    view2131755284 = null;
  }
}
