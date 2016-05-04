package com.fkzhang.wechatforwarder;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import java.io.File;

class bg
  implements View.OnLongClickListener
{
  bg(MainActivity paramMainActivity) {}
  
  public boolean onLongClick(View paramView)
  {
    if ((MainActivity.c(this.a) != null) && (MainActivity.c(this.a).exists())) {
      MainActivity.c(this.a).delete();
    }
    MainActivity.d(this.a).setImageResource(17170445);
    MainActivity.a(this.a, null);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */