package com.fkzhang.wechatforwarder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.d.g;
import com.fkzhang.wechatforwarder.e.a;
import java.util.HashMap;

class p
  implements DialogInterface.OnClickListener
{
  p(AutoForwardListActivity paramAutoForwardListActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (g)AutoForwardListActivity.b(this.a).get(AutoForwardListActivity.l(this.a));
    AutoForwardListActivity.e(this.a, paramDialogInterface.a());
    AutoForwardListActivity.f(this.a, paramDialogInterface.b());
    AutoForwardListActivity.j(this.a).setText(a.b(AutoForwardListActivity.i(this.a)));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */