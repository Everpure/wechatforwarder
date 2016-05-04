package android.support.v7.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class bo
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  bo(bm parambm) {}
  
  public void onGlobalLayout()
  {
    if (!bm.a(this.a, this.a.a))
    {
      this.a.i();
      return;
    }
    this.a.b();
    bm.b(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */