package android.support.v7.widget;

import android.support.v4.i.bu;
import android.widget.PopupWindow;

class ds
  implements Runnable
{
  private ds(dg paramdg) {}
  
  public void run()
  {
    if ((dg.a(this.a) != null) && (bu.C(dg.a(this.a))) && (dg.a(this.a).getCount() > dg.a(this.a).getChildCount()) && (dg.a(this.a).getChildCount() <= this.a.b))
    {
      dg.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */