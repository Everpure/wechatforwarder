package android.support.v7.widget;

import android.support.v7.view.menu.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

class hb
  implements View.OnClickListener
{
  final a a = new a(ha.a(this.b).getContext(), 0, 16908332, 0, 0, ha.b(this.b));
  
  hb(ha paramha) {}
  
  public void onClick(View paramView)
  {
    if ((ha.c(this.b) != null) && (ha.d(this.b))) {
      ha.c(this.b).onMenuItemSelected(0, this.a);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */