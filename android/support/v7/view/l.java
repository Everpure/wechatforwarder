package android.support.v7.view;

import android.support.v4.i.di;
import android.support.v4.i.dz;
import android.support.v4.i.ea;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class l
{
  private final ArrayList a = new ArrayList();
  private long b = -1L;
  private Interpolator c;
  private dz d;
  private boolean e;
  private final ea f = new m(this);
  
  private void c()
  {
    this.e = false;
  }
  
  public l a(long paramLong)
  {
    if (!this.e) {
      this.b = paramLong;
    }
    return this;
  }
  
  public l a(di paramdi)
  {
    if (!this.e) {
      this.a.add(paramdi);
    }
    return this;
  }
  
  public l a(di paramdi1, di paramdi2)
  {
    this.a.add(paramdi1);
    paramdi2.b(paramdi1.a());
    this.a.add(paramdi2);
    return this;
  }
  
  public l a(dz paramdz)
  {
    if (!this.e) {
      this.d = paramdz;
    }
    return this;
  }
  
  public l a(Interpolator paramInterpolator)
  {
    if (!this.e) {
      this.c = paramInterpolator;
    }
    return this;
  }
  
  public void a()
  {
    if (this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      di localdi = (di)localIterator.next();
      if (this.b >= 0L) {
        localdi.a(this.b);
      }
      if (this.c != null) {
        localdi.a(this.c);
      }
      if (this.d != null) {
        localdi.a(this.f);
      }
      localdi.c();
    }
    this.e = true;
  }
  
  public void b()
  {
    if (!this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((di)localIterator.next()).b();
    }
    this.e = false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */