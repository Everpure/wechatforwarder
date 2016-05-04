package com.fkzhang.wechatforwarder;

import android.view.View;
import android.view.View.OnClickListener;

class aa
  implements View.OnClickListener
{
  aa(AutoForwardListActivity paramAutoForwardListActivity) {}
  
  public void onClick(View paramView)
  {
    if (AutoForwardListActivity.e(this.a))
    {
      AutoForwardListActivity.o(this.a);
      return;
    }
    AutoForwardListActivity.p(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */