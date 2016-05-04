package android.support.v7.widget;

import android.support.v4.f.h;
import android.support.v4.i.bu;
import android.support.v4.widget.at;
import android.view.animation.Interpolator;
import java.util.ArrayList;

class fg
  implements Runnable
{
  private int b;
  private int c;
  private at d;
  private Interpolator e = RecyclerView.q();
  private boolean f = false;
  private boolean g = false;
  
  public fg(RecyclerView paramRecyclerView)
  {
    this.d = at.a(paramRecyclerView.getContext(), RecyclerView.q());
  }
  
  private float a(float paramFloat)
  {
    return (float)Math.sin((float)((paramFloat - 0.5F) * 0.4712389167638204D));
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = Math.abs(paramInt1);
    int k = Math.abs(paramInt2);
    int i;
    if (j > k)
    {
      i = 1;
      paramInt3 = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4);
      paramInt2 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
      if (i == 0) {
        break label140;
      }
    }
    label140:
    for (paramInt1 = this.a.getWidth();; paramInt1 = this.a.getHeight())
    {
      paramInt4 = paramInt1 / 2;
      float f3 = Math.min(1.0F, paramInt2 * 1.0F / paramInt1);
      float f1 = paramInt4;
      float f2 = paramInt4;
      f3 = a(f3);
      if (paramInt3 <= 0) {
        break label151;
      }
      paramInt1 = Math.round(1000.0F * Math.abs((f3 * f2 + f1) / paramInt3)) * 4;
      return Math.min(paramInt1, 2000);
      i = 0;
      break;
    }
    label151:
    if (i != 0) {}
    for (paramInt2 = j;; paramInt2 = k)
    {
      paramInt1 = (int)((paramInt2 / paramInt1 + 1.0F) * 300.0F);
      break;
    }
  }
  
  private void c()
  {
    this.g = false;
    this.f = true;
  }
  
  private void d()
  {
    this.f = false;
    if (this.g) {
      a();
    }
  }
  
  void a()
  {
    if (this.f)
    {
      this.g = true;
      return;
    }
    this.a.removeCallbacks(this);
    bu.a(this.a, this);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.a, 2);
    this.c = 0;
    this.b = 0;
    this.d.a(0, 0, paramInt1, paramInt2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    a();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, RecyclerView.q());
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramInt2, b(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    if (this.e != paramInterpolator)
    {
      this.e = paramInterpolator;
      this.d = at.a(this.a.getContext(), paramInterpolator);
    }
    RecyclerView.b(this.a, 2);
    this.c = 0;
    this.b = 0;
    this.d.a(0, 0, paramInt1, paramInt2, paramInt3);
    a();
  }
  
  public void b()
  {
    this.a.removeCallbacks(this);
    this.d.h();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, 0, 0);
  }
  
  public void run()
  {
    if (this.a.e == null)
    {
      b();
      return;
    }
    c();
    RecyclerView.c(this.a);
    at localat = this.d;
    fc localfc = this.a.e.r;
    int i6;
    int i7;
    int i4;
    int i5;
    int i1;
    int k;
    int j;
    int i3;
    int i;
    int n;
    int m;
    if (localat.g())
    {
      i6 = localat.b();
      i7 = localat.c();
      i4 = i6 - this.b;
      i5 = i7 - this.c;
      i1 = 0;
      k = 0;
      i2 = 0;
      j = 0;
      this.b = i6;
      this.c = i7;
      i3 = 0;
      i = 0;
      n = 0;
      m = 0;
      if (RecyclerView.f(this.a) == null) {
        break label723;
      }
      this.a.b();
      RecyclerView.g(this.a);
      h.a("RV Scroll");
      if (i4 != 0)
      {
        k = this.a.e.a(i4, this.a.a, this.a.g);
        i = i4 - k;
      }
      if (i5 != 0)
      {
        j = this.a.e.b(i5, this.a.a, this.a.g);
        m = i5 - j;
      }
      h.a();
      RecyclerView.h(this.a);
      RecyclerView.i(this.a);
      this.a.a(false);
      n = m;
      i2 = j;
      i3 = i;
      i1 = k;
      if (localfc == null) {
        break label723;
      }
      n = m;
      i2 = j;
      i3 = i;
      i1 = k;
      if (localfc.b()) {
        break label723;
      }
      n = m;
      i2 = j;
      i3 = i;
      i1 = k;
      if (!localfc.c()) {
        break label723;
      }
      n = this.a.g.e();
      if (n != 0) {
        break label655;
      }
      localfc.a();
      n = j;
      j = i;
      if (!RecyclerView.j(this.a).isEmpty()) {
        this.a.invalidate();
      }
      if (bu.a(this.a) != 2) {
        RecyclerView.a(this.a, i4, i5);
      }
      if ((j != 0) || (m != 0))
      {
        i1 = (int)localat.f();
        if (j == i6) {
          break label795;
        }
        if (j >= 0) {
          break label740;
        }
        i = -i1;
      }
    }
    label406:
    label425:
    label552:
    label578:
    label598:
    label655:
    label723:
    label740:
    label773:
    label778:
    label783:
    label795:
    for (int i2 = i;; i2 = 0)
    {
      if (m != i7) {
        if (m < 0) {
          i = -i1;
        }
      }
      for (;;)
      {
        if (bu.a(this.a) != 2) {
          this.a.c(i2, i);
        }
        if (((i2 != 0) || (j == i6) || (localat.d() == 0)) && ((i != 0) || (m == i7) || (localat.e() == 0))) {
          localat.h();
        }
        if ((k != 0) || (n != 0)) {
          this.a.h(k, n);
        }
        if (!RecyclerView.k(this.a)) {
          this.a.invalidate();
        }
        if ((i5 != 0) && (this.a.e.e()) && (n == i5))
        {
          i = 1;
          if ((i4 == 0) || (!this.a.e.d()) || (k != i4)) {
            break label773;
          }
          j = 1;
          if (((i4 != 0) || (i5 != 0)) && (j == 0) && (i == 0)) {
            break label778;
          }
          i = 1;
          if ((!localat.a()) && (i != 0)) {
            break label783;
          }
          RecyclerView.b(this.a, 0);
        }
        for (;;)
        {
          if (localfc != null)
          {
            if (localfc.b()) {
              fc.a(localfc, 0, 0);
            }
            if (!this.g) {
              localfc.a();
            }
          }
          d();
          return;
          if (localfc.d() >= n)
          {
            localfc.a(n - 1);
            fc.a(localfc, i4 - i, i5 - m);
            n = j;
            j = i;
            break;
          }
          fc.a(localfc, i4 - i, i5 - m);
          i1 = k;
          i3 = i;
          i2 = j;
          n = m;
          j = i3;
          m = n;
          n = i2;
          k = i1;
          break;
          if (j > 0)
          {
            i = i1;
            break label406;
          }
          i = 0;
          break label406;
          i = i1;
          if (m > 0) {
            break label425;
          }
          i = 0;
          break label425;
          i = 0;
          break label552;
          j = 0;
          break label578;
          i = 0;
          break label598;
          a();
        }
        i = 0;
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */