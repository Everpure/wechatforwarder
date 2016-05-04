package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class ek
{
  private em a = null;
  private ArrayList b = new ArrayList();
  private long c = 120L;
  private long d = 120L;
  private long e = 250L;
  private long f = 250L;
  
  static int d(fh paramfh)
  {
    int j = fh.f(paramfh) & 0xE;
    int i;
    if (paramfh.n()) {
      i = 4;
    }
    int k;
    int m;
    do
    {
      do
      {
        do
        {
          do
          {
            return i;
            i = j;
          } while ((j & 0x4) != 0);
          k = paramfh.f();
          m = paramfh.e();
          i = j;
        } while (k == -1);
        i = j;
      } while (m == -1);
      i = j;
    } while (k == m);
    return j | 0x800;
  }
  
  public en a(fe paramfe, fh paramfh)
  {
    return i().a(paramfh);
  }
  
  public en a(fe paramfe, fh paramfh, int paramInt, List paramList)
  {
    return i().a(paramfh);
  }
  
  public abstract void a();
  
  void a(em paramem)
  {
    this.a = paramem;
  }
  
  public abstract boolean a(fh paramfh, en paramen1, en paramen2);
  
  public abstract boolean a(fh paramfh1, fh paramfh2, en paramen1, en paramen2);
  
  public boolean a(fh paramfh, List paramList)
  {
    return g(paramfh);
  }
  
  public abstract boolean b();
  
  public abstract boolean b(fh paramfh, en paramen1, en paramen2);
  
  public abstract void c();
  
  public abstract void c(fh paramfh);
  
  public abstract boolean c(fh paramfh, en paramen1, en paramen2);
  
  public long d()
  {
    return this.e;
  }
  
  public long e()
  {
    return this.c;
  }
  
  public final void e(fh paramfh)
  {
    f(paramfh);
    if (this.a != null) {
      this.a.a(paramfh);
    }
  }
  
  public long f()
  {
    return this.d;
  }
  
  public void f(fh paramfh) {}
  
  public long g()
  {
    return this.f;
  }
  
  public boolean g(fh paramfh)
  {
    return true;
  }
  
  public final void h()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      ((el)this.b.get(i)).a();
      i += 1;
    }
    this.b.clear();
  }
  
  public en i()
  {
    return new en();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */