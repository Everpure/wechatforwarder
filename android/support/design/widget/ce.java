package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

class ce
  extends cb
{
  private static final Handler a = new Handler(Looper.getMainLooper());
  private long b;
  private boolean c;
  private final int[] d = new int[2];
  private final float[] e = new float[2];
  private int f = 200;
  private Interpolator g;
  private cc h;
  private cd i;
  private float j;
  private final Runnable k = new cf(this);
  
  private void g()
  {
    if (this.c)
    {
      float f2 = (float)(SystemClock.uptimeMillis() - this.b) / this.f;
      float f1 = f2;
      if (this.g != null) {
        f1 = this.g.getInterpolation(f2);
      }
      this.j = f1;
      if (this.i != null) {
        this.i.a();
      }
      if (SystemClock.uptimeMillis() >= this.b + this.f)
      {
        this.c = false;
        if (this.h != null) {
          this.h.b();
        }
      }
    }
    if (this.c) {
      a.postDelayed(this.k, 10L);
    }
  }
  
  public void a()
  {
    if (this.c) {
      return;
    }
    if (this.g == null) {
      this.g = new AccelerateDecelerateInterpolator();
    }
    this.b = SystemClock.uptimeMillis();
    this.c = true;
    if (this.h != null) {
      this.h.a();
    }
    a.postDelayed(this.k, 10L);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.e[0] = paramFloat1;
    this.e[1] = paramFloat2;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.d[0] = paramInt1;
    this.d[1] = paramInt2;
  }
  
  public void a(cd paramcd)
  {
    this.i = paramcd;
  }
  
  public void a(Interpolator paramInterpolator)
  {
    this.g = paramInterpolator;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public int c()
  {
    return a.a(this.d[0], this.d[1], f());
  }
  
  public float d()
  {
    return a.a(this.e[0], this.e[1], f());
  }
  
  public void e()
  {
    this.c = false;
    a.removeCallbacks(this.k);
    if (this.h != null) {
      this.h.c();
    }
  }
  
  public float f()
  {
    return this.j;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */