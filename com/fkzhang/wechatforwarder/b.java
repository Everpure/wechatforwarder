package com.fkzhang.wechatforwarder;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.e.d;

class b
  implements CompoundButton.OnCheckedChangeListener
{
  b(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AutoForwardActivity.c(this.a).b(this.a.j() + "_autoforward_enable", paramBoolean);
    if (!AutoForwardActivity.d(this.a))
    {
      if (paramBoolean)
      {
        AutoForwardActivity.e(this.a).setVisibility(0);
        AutoForwardActivity.f(this.a).setVisibility(0);
      }
    }
    else {
      return;
    }
    AutoForwardActivity.e(this.a).setVisibility(8);
    AutoForwardActivity.f(this.a).setVisibility(8);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */