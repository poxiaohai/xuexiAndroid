// Generated code from Butter Knife. Do not modify!
package com.example.cheng.GreenDao;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GreenDaoActivity_ViewBinding implements Unbinder {
  private GreenDaoActivity target;

  private View view2131755290;

  private View view2131755291;

  private View view2131755292;

  private View view2131755293;

  @UiThread
  public GreenDaoActivity_ViewBinding(GreenDaoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GreenDaoActivity_ViewBinding(final GreenDaoActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.save, "field 'save' and method 'onViewClicked'");
    target.save = Utils.castView(view, R.id.save, "field 'save'", TextView.class);
    view2131755290 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.delete, "field 'delete' and method 'onViewClicked'");
    target.delete = Utils.castView(view, R.id.delete, "field 'delete'", TextView.class);
    view2131755291 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.update, "field 'update' and method 'onViewClicked'");
    target.update = Utils.castView(view, R.id.update, "field 'update'", TextView.class);
    view2131755292 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.select, "field 'select' and method 'onViewClicked'");
    target.select = Utils.castView(view, R.id.select, "field 'select'", TextView.class);
    view2131755293 = view;
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
    GreenDaoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.save = null;
    target.delete = null;
    target.update = null;
    target.select = null;

    view2131755290.setOnClickListener(null);
    view2131755290 = null;
    view2131755291.setOnClickListener(null);
    view2131755291 = null;
    view2131755292.setOnClickListener(null);
    view2131755292 = null;
    view2131755293.setOnClickListener(null);
    view2131755293 = null;
  }
}
