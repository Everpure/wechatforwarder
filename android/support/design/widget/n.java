package android.support.design.widget;

import android.support.v4.i.bu;
import android.support.v4.widget.bk;
import android.view.View;

class n
  implements Runnable
{
  private final View b;
  private final int c;
  
  n(BottomSheetBehavior paramBottomSheetBehavior, View paramView, int paramInt)
  {
    this.b = paramView;
    this.c = paramInt;
  }
  
  public void run()
  {
    if ((BottomSheetBehavior.j(this.a) != null) && (BottomSheetBehavior.j(this.a).a(true)))
    {
      bu.a(this.b, this);
      return;
    }
    BottomSheetBehavior.b(this.a, this.c);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */