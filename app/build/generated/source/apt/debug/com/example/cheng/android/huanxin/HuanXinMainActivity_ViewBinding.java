// Generated code from Butter Knife. Do not modify!
package com.example.cheng.android.huanxin;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.cheng.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HuanXinMainActivity_ViewBinding implements Unbinder {
  private HuanXinMainActivity target;

  private View view2131755319;

  private View view2131755321;

  private View view2131755320;

  @UiThread
  public HuanXinMainActivity_ViewBinding(HuanXinMainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HuanXinMainActivity_ViewBinding(final HuanXinMainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.zhuce, "field 'zhuce' and method 'onViewClicked'");
    target.zhuce = Utils.castView(view, R.id.zhuce, "field 'zhuce'", TextView.class);
    view2131755319 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.logout, "field 'logout' and method 'onViewClicked'");
    target.logout = Utils.castView(view, R.id.logout, "field 'logout'", TextView.class);
    view2131755321 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.login, "field 'login' and method 'onViewClicked'");
    target.login = Utils.castView(view, R.id.login, "field 'login'", TextView.class);
    view2131755320 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.username = Utils.findRequiredViewAsType(source, R.id.username, "field 'username'", EditText.class);
    target.password = Utils.findRequiredViewAsType(source, R.id.password, "field 'password'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HuanXinMainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.zhuce = null;
    target.logout = null;
    target.login = null;
    target.username = null;
    target.password = null;

    view2131755319.setOnClickListener(null);
    view2131755319 = null;
    view2131755321.setOnClickListener(null);
    view2131755321 = null;
    view2131755320.setOnClickListener(null);
    view2131755320 = null;
  }
}
