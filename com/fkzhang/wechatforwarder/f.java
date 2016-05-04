package com.fkzhang.wechatforwarder;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.e.d;

class f
  implements CompoundButton.OnCheckedChangeListener
{
  f(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AutoForwardActivity.c(this.a).b(this.a.j() + "_resend_enable", paramBoolean);
    if (paramBoolean)
    {
      AutoForwardActivity.g(this.a).setVisibility(0);
      AutoForwardActivity.h(this.a).setVisibility(0);
      AutoForwardActivity.i(this.a).setVisibility(0);
      AutoForwardActivity.j(this.a).setVisibility(0);
      return;
    }
    AutoForwardActivity.g(this.a).setVisibility(8);
    AutoForwardActivity.h(this.a).setVisibility(8);
    AutoForwardActivity.i(this.a).setVisibility(8);
    AutoForwardActivity.j(this.a).setVisibility(8);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */