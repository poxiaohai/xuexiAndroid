// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Volley;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VolleyActivity_ViewBinding implements Unbinder {
  private VolleyActivity target;

  private View view2131755352;

  private View view2131755353;

  private View view2131755354;

  @UiThread
  public VolleyActivity_ViewBinding(VolleyActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VolleyActivity_ViewBinding(final VolleyActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.stringTv, "field 'stringTv' and method 'onViewClicked'");
    target.stringTv = Utils.castView(view, R.id.stringTv, "field 'stringTv'", TextView.class);
    view2131755352 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.imageView = Utils.findRequiredViewAsType(source, R.id.image1, "field 'imageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.JsonObjectRequest, "method 'onViewClicked'");
    view2131755353 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.loadimage, "method 'onViewClicked'");
    view2131755354 = view;
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
    VolleyActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.stringTv = null;
    target.imageView = null;

    view2131755352.setOnClickListener(null);
    view2131755352 = null;
    view2131755353.setOnClickListener(null);
    view2131755353 = null;
    view2131755354.setOnClickListener(null);
    view2131755354 = null;
  }
}
