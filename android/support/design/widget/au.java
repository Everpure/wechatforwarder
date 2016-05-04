package android.support.design.widget;

import android.support.v4.i.bu;
import android.view.View;

class au
  implements Runnable
{
  private final CoordinatorLayout b;
  private final View c;
  
  au(at paramat, CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    this.b = paramCoordinatorLayout;
    this.c = paramView;
  }
  
  public void run()
  {
    if ((this.c != null) && (at.a(this.a) != null))
    {
      if (at.a(this.a).g())
      {
        this.a.a_(this.b, this.c, at.a(this.a).c());
        bu.a(this.c, this);
      }
    }
    else {
      return;
    }
    this.a.a(this.b, this.c);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */