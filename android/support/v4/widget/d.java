package android.support.v4.widget;

import android.support.v4.i.bu;

class d
  implements Runnable
{
  private d(a parama) {}
  
  public void run()
  {
    if (!a.a(this.a)) {
      return;
    }
    if (a.b(this.a))
    {
      a.a(this.a, false);
      a.c(this.a).a();
    }
    c localc = a.c(this.a);
    if ((localc.c()) || (!a.d(this.a)))
    {
      a.b(this.a, false);
      return;
    }
    if (a.e(this.a))
    {
      a.c(this.a, false);
      a.f(this.a);
    }
    localc.d();
    int i = localc.g();
    int j = localc.h();
    this.a.a(i, j);
    bu.a(a.g(this.a), this);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */