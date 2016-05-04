package android.support.v4.b;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class m
  implements ViewTreeObserver.OnPreDrawListener
{
  m(j paramj, View paramView, o paramo, int paramInt, Object paramObject) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    j.a(this.e, this.b, this.c, this.d);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */