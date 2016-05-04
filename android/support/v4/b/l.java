package android.support.v4.b;

import android.support.v4.h.a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

class l
  implements ViewTreeObserver.OnPreDrawListener
{
  l(j paramj, View paramView, Object paramObject, ArrayList paramArrayList, o paramo, boolean paramBoolean, t paramt1, t paramt2) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      ar.a(this.b, this.c);
      this.c.clear();
      a locala = j.a(this.h, this.d, this.e, this.f);
      ar.a(this.b, this.d.d, locala, this.c);
      j.a(this.h, locala, this.d);
      j.a(this.h, this.d, this.f, this.g, this.e, locala);
    }
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */