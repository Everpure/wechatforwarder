package com.fkzhang.wechatforwarder.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class e
  implements View.OnClickListener
{
  e(d paramd, int paramInt) {}
  
  public void onClick(View paramView)
  {
    boolean bool = ((CheckBox)paramView).isChecked();
    if (d.a(this.b) != null) {
      d.a(this.b).a(this.a, bool);
    }
    this.b.a(this.a, bool);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */