package com.fkzhang.wechatforwarder;

import android.view.View;
import android.view.View.OnClickListener;

class bf
  implements View.OnClickListener
{
  bf(MainActivity paramMainActivity) {}
  
  public void onClick(View paramView)
  {
    MainActivity.a(this.a, AutoForwardActivity.class);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */