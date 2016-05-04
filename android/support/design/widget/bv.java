package android.support.design.widget;

import android.support.v4.widget.bk;
import android.view.View;

class bv
  implements Runnable
{
  private final View b;
  private final boolean c;
  
  bv(SwipeDismissBehavior paramSwipeDismissBehavior, View paramView, boolean paramBoolean)
  {
    this.b = paramView;
    this.c = paramBoolean;
  }
  
  public void run()
  {
    if ((SwipeDismissBehavior.b(this.a) != null) && (SwipeDismissBehavior.b(this.a).a(true))) {
      android.support.v4.i.bu.a(this.b, this);
    }
    while ((!this.c) || (SwipeDismissBehavior.a(this.a) == null)) {
      return;
    }
    SwipeDismissBehavior.a(this.a).a(this.b);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */