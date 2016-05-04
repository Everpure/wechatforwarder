package com.fkzhang.wechatforwarder;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.e.d;

class bd
  implements View.OnLongClickListener
{
  bd(MainActivity paramMainActivity, TextView paramTextView) {}
  
  public boolean onLongClick(View paramView)
  {
    MainActivity.a(this.b).b("disable_xposed_check", true);
    this.a.setVisibility(8);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */