package android.support.v7.a;

import android.support.v4.i.bm;
import android.support.v4.i.bu;
import android.support.v4.i.ec;
import android.view.View;

class ag
  implements bm
{
  ag(ae paramae) {}
  
  public ec a(View paramView, ec paramec)
  {
    int i = paramec.b();
    int j = ae.c(this.a, i);
    ec localec = paramec;
    if (i != j) {
      localec = paramec.a(paramec.a(), j, paramec.c(), paramec.d());
    }
    return bu.a(paramView, localec);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */