package com.fkzhang.wechatforwarder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.a.d;
import java.util.ArrayList;
import java.util.Iterator;

class s
  implements DialogInterface.OnClickListener
{
  s(AutoForwardListActivity paramAutoForwardListActivity, d paramd) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (!this.a.c())
    {
      AutoForwardListActivity.c(this.b, null);
      AutoForwardListActivity.d(this.b, null);
      AutoForwardListActivity.f(this.b).setText(2131099683);
      return;
    }
    paramDialogInterface = new StringBuilder();
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.a.b().iterator();
    while (localIterator.hasNext())
    {
      com.fkzhang.wechatforwarder.c.a locala = (com.fkzhang.wechatforwarder.c.a)localIterator.next();
      paramDialogInterface.append(locala.a()).append(";");
      localStringBuilder.append(locala.b()).append(";");
    }
    paramDialogInterface.deleteCharAt(paramDialogInterface.lastIndexOf(";"));
    localStringBuilder.deleteCharAt(localStringBuilder.lastIndexOf(";"));
    AutoForwardListActivity.c(this.b, paramDialogInterface.toString());
    AutoForwardListActivity.d(this.b, localStringBuilder.toString());
    AutoForwardListActivity.f(this.b).setText(com.fkzhang.wechatforwarder.e.a.b(AutoForwardListActivity.h(this.b)));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */