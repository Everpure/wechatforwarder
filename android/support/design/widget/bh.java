package android.support.design.widget;

import android.support.v4.i.ea;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

class bh
  extends ea
{
  boolean a = false;
  
  bh(Snackbar paramSnackbar, int paramInt) {}
  
  public void a(View paramView)
  {
    if (!Snackbar.d(this.c).isEnabled()) {
      Snackbar.c(this.c).b(0, 180);
    }
  }
  
  public void b(View paramView)
  {
    Snackbar.b(this.c, this.b);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */