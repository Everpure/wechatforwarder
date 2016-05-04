package android.support.v7.widget;

import android.view.View;

public abstract class ga
  extends ek
{
  boolean a = true;
  
  public final void a(fh paramfh, boolean paramBoolean)
  {
    d(paramfh, paramBoolean);
    e(paramfh);
  }
  
  public abstract boolean a(fh paramfh);
  
  public abstract boolean a(fh paramfh, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(fh paramfh, en paramen1, en paramen2)
  {
    int k = paramen1.a;
    int m = paramen1.b;
    paramen1 = paramfh.a;
    int i;
    if (paramen2 == null)
    {
      i = paramen1.getLeft();
      if (paramen2 != null) {
        break label103;
      }
    }
    label103:
    for (int j = paramen1.getTop();; j = paramen2.b)
    {
      if ((paramfh.q()) || ((k == i) && (m == j))) {
        break label112;
      }
      paramen1.layout(i, j, paramen1.getWidth() + i, paramen1.getHeight() + j);
      return a(paramfh, k, m, i, j);
      i = paramen2.a;
      break;
    }
    label112:
    return a(paramfh);
  }
  
  public abstract boolean a(fh paramfh1, fh paramfh2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(fh paramfh1, fh paramfh2, en paramen1, en paramen2)
  {
    int k = paramen1.a;
    int m = paramen1.b;
    int i;
    if (paramfh2.c()) {
      i = paramen1.a;
    }
    for (int j = paramen1.b;; j = paramen2.b)
    {
      return a(paramfh1, paramfh2, k, m, i, j);
      i = paramen2.a;
    }
  }
  
  public final void b(fh paramfh, boolean paramBoolean)
  {
    c(paramfh, paramBoolean);
  }
  
  public abstract boolean b(fh paramfh);
  
  public boolean b(fh paramfh, en paramen1, en paramen2)
  {
    if ((paramen1 != null) && ((paramen1.a != paramen2.a) || (paramen1.b != paramen2.b))) {
      return a(paramfh, paramen1.a, paramen1.b, paramen2.a, paramen2.b);
    }
    return b(paramfh);
  }
  
  public void c(fh paramfh, boolean paramBoolean) {}
  
  public boolean c(fh paramfh, en paramen1, en paramen2)
  {
    if ((paramen1.a != paramen2.a) || (paramen1.b != paramen2.b)) {
      return a(paramfh, paramen1.a, paramen1.b, paramen2.a, paramen2.b);
    }
    i(paramfh);
    return false;
  }
  
  public void d(fh paramfh, boolean paramBoolean) {}
  
  public boolean g(fh paramfh)
  {
    return (!this.a) || (paramfh.n());
  }
  
  public final void h(fh paramfh)
  {
    o(paramfh);
    e(paramfh);
  }
  
  public final void i(fh paramfh)
  {
    s(paramfh);
    e(paramfh);
  }
  
  public final void j(fh paramfh)
  {
    q(paramfh);
    e(paramfh);
  }
  
  public final void k(fh paramfh)
  {
    n(paramfh);
  }
  
  public final void l(fh paramfh)
  {
    r(paramfh);
  }
  
  public final void m(fh paramfh)
  {
    p(paramfh);
  }
  
  public void n(fh paramfh) {}
  
  public void o(fh paramfh) {}
  
  public void p(fh paramfh) {}
  
  public void q(fh paramfh) {}
  
  public void r(fh paramfh) {}
  
  public void s(fh paramfh) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */