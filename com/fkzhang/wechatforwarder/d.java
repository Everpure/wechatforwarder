package com.fkzhang.wechatforwarder;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class d
  implements CompoundButton.OnCheckedChangeListener
{
  d(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AutoForwardActivity.c(this.a).b(this.a.j() + "_avatar_enable", paramBoolean);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */