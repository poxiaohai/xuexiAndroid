// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.Service;

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

public class ServiceActivity_ViewBinding implements Unbinder {
  private ServiceActivity target;

  private View view2131755334;

  private View view2131755335;

  private View view2131755336;

  private View view2131755337;

  @UiThread
  public ServiceActivity_ViewBinding(ServiceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ServiceActivity_ViewBinding(final ServiceActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.startservice, "field 'startservice' and method 'onViewClicked'");
    target.startservice = Utils.castView(view, R.id.startservice, "field 'startservice'", TextView.class);
    view2131755334 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.BindService, "field 'BindService' and method 'onViewClicked'");
    target.BindService = Utils.castView(view, R.id.BindService, "field 'BindService'", TextView.class);
    view2131755335 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.huoqusuijishu, "method 'onViewClicked'");
    view2131755336 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.transact, "method 'onViewClicked'");
    view2131755337 = view;
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
    ServiceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.startservice = null;
    target.BindService = null;

    view2131755334.setOnClickListener(null);
    view2131755334 = null;
    view2131755335.setOnClickListener(null);
    view2131755335 = null;
    view2131755336.setOnClickListener(null);
    view2131755336 = null;
    view2131755337.setOnClickListener(null);
    view2131755337 = null;
  }
}
