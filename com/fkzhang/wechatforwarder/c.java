package com.fkzhang.wechatforwarder;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.fkzhang.wechatforwarder.e.d;

class c
  implements CompoundButton.OnCheckedChangeListener
{
  c(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AutoForwardActivity.c(this.a).b(this.a.j() + "_auto_scan_contacts_enable", paramBoolean);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */