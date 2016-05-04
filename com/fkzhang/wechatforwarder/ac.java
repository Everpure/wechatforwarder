package com.fkzhang.wechatforwarder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.Switch;
import com.fkzhang.wechatforwarder.d.a;
import com.fkzhang.wechatforwarder.d.d;
import com.fkzhang.wechatforwarder.d.e;
import com.fkzhang.wechatforwarder.d.g;
import java.util.HashMap;

class ac
  implements DialogInterface.OnClickListener
{
  ac(AutoForwardListActivity paramAutoForwardListActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = 0;
    if (TextUtils.isEmpty(AutoForwardListActivity.a(this.a))) {}
    String str1;
    do
    {
      do
      {
        return;
        str1 = AutoForwardListActivity.q(this.a);
      } while (TextUtils.isEmpty(str1));
      if (!AutoForwardListActivity.e(this.a)) {
        break;
      }
      paramInt = 0;
      if ((AutoForwardListActivity.e(this.a)) || (paramInt != -1)) {
        break label288;
      }
    } while (TextUtils.isEmpty(AutoForwardListActivity.l(this.a)));
    if (AutoForwardListActivity.a(this.a).endsWith("@chatroom")) {}
    for (paramDialogInterface = ((e)AutoForwardListActivity.r(this.a).get(AutoForwardListActivity.a(this.a))).b();; paramDialogInterface = ((g)AutoForwardListActivity.b(this.a).get(AutoForwardListActivity.a(this.a))).b())
    {
      String str2 = this.a.j();
      String str3 = AutoForwardListActivity.a(this.a);
      String str4 = AutoForwardListActivity.l(this.a);
      String str5 = AutoForwardListActivity.i(this.a);
      String str6 = ((a)AutoForwardListActivity.s(this.a).get(this.a.j())).b();
      String str7 = AutoForwardListActivity.t(this.a);
      String str8 = AutoForwardListActivity.h(this.a);
      paramInt = i;
      if (AutoForwardListActivity.k(this.a).isChecked()) {
        paramInt = 1;
      }
      paramDialogInterface = new d(str2, str3, str4, paramDialogInterface, str5, str6, str7, str8, str1, paramInt);
      AutoForwardListActivity.a(this.a, paramDialogInterface);
      return;
      paramInt = AutoForwardListActivity.b(this.a, AutoForwardListActivity.a(this.a));
      break;
    }
    label288:
    if ((!AutoForwardListActivity.e(this.a)) && (TextUtils.isEmpty(AutoForwardListActivity.l(this.a))))
    {
      AutoForwardListActivity.a(this.a, paramInt);
      return;
    }
    AutoForwardListActivity.c(this.a, paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */