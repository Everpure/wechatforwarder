package com.fkzhang.wechatforwarder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.Switch;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.d.d;
import com.fkzhang.wechatforwarder.d.g;
import com.fkzhang.wechatforwarder.e.a;
import java.util.ArrayList;
import java.util.HashMap;

class k
  implements DialogInterface.OnClickListener
{
  k(AutoForwardListActivity paramAutoForwardListActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (g)AutoForwardListActivity.b(this.a).get(AutoForwardListActivity.a(this.a));
    AutoForwardListActivity.c(this.a).setText(a.b(paramDialogInterface.b()));
    paramInt = AutoForwardListActivity.b(this.a, AutoForwardListActivity.a(this.a));
    if (paramInt != -1)
    {
      d locald = (d)AutoForwardListActivity.d(this.a).get(paramInt);
      if ((!AutoForwardListActivity.e(this.a)) && (AutoForwardListActivity.a(this.a).endsWith("@chatroom")))
      {
        AutoForwardListActivity.c(this.a, locald.g());
        AutoForwardListActivity.d(this.a, locald.h());
        AutoForwardListActivity.f(this.a).setVisibility(0);
        AutoForwardListActivity.g(this.a).setVisibility(0);
        TextView localTextView = AutoForwardListActivity.f(this.a);
        if (TextUtils.isEmpty(AutoForwardListActivity.h(this.a)))
        {
          paramDialogInterface = this.a.getString(2131099683);
          localTextView.setText(paramDialogInterface);
          label185:
          AutoForwardListActivity.e(this.a, locald.a());
          AutoForwardListActivity.f(this.a, locald.d());
          if (TextUtils.isEmpty(AutoForwardListActivity.i(this.a))) {
            break label319;
          }
          AutoForwardListActivity.j(this.a).setText(a.b(AutoForwardListActivity.i(this.a)));
          label244:
          AutoForwardListActivity.g(this.a, locald.i());
          paramDialogInterface = AutoForwardListActivity.k(this.a);
          if (locald.f() != 1) {
            break label334;
          }
        }
      }
      label319:
      label334:
      for (boolean bool = true;; bool = false)
      {
        paramDialogInterface.setChecked(bool);
        return;
        paramDialogInterface = AutoForwardListActivity.h(this.a);
        break;
        AutoForwardListActivity.f(this.a).setVisibility(8);
        AutoForwardListActivity.g(this.a).setVisibility(8);
        break label185;
        AutoForwardListActivity.j(this.a).setText(2131099683);
        break label244;
      }
    }
    AutoForwardListActivity.j(this.a).setText(2131099683);
    AutoForwardListActivity.e(this.a, null);
    AutoForwardListActivity.f(this.a, null);
    if ((!AutoForwardListActivity.e(this.a)) && (paramDialogInterface.a().endsWith("@chatroom")))
    {
      AutoForwardListActivity.f(this.a).setVisibility(0);
      AutoForwardListActivity.g(this.a).setVisibility(0);
      AutoForwardListActivity.f(this.a).setText(2131099683);
      return;
    }
    AutoForwardListActivity.f(this.a).setVisibility(8);
    AutoForwardListActivity.g(this.a).setVisibility(8);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */