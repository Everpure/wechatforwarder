package android.support.v7.widget;

import android.support.v7.view.menu.i;
import android.view.View;

class o
  implements Runnable
{
  private r b;
  
  public o(k paramk, r paramr)
  {
    this.b = paramr;
  }
  
  public void run()
  {
    k.g(this.a).f();
    View localView = (View)k.h(this.a);
    if ((localView != null) && (localView.getWindowToken() != null) && (this.b.d())) {
      k.a(this.a, this.b);
    }
    k.a(this.a, null);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */