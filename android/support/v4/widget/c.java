package android.support.v4.widget;

import android.view.animation.AnimationUtils;

class c
{
  private int a;
  private int b;
  private float c;
  private float d;
  private long e = Long.MIN_VALUE;
  private long f = 0L;
  private int g = 0;
  private int h = 0;
  private long i = -1L;
  private float j;
  private int k;
  
  private float a(float paramFloat)
  {
    return -4.0F * paramFloat * paramFloat + 4.0F * paramFloat;
  }
  
  private float a(long paramLong)
  {
    if (paramLong < this.e) {
      return 0.0F;
    }
    if ((this.i < 0L) || (paramLong < this.i)) {
      return a.a((float)(paramLong - this.e) / this.a, 0.0F, 1.0F) * 0.5F;
    }
    long l = this.i;
    float f1 = this.j;
    float f2 = this.j;
    return a.a((float)(paramLong - l) / this.k, 0.0F, 1.0F) * f2 + (1.0F - f1);
  }
  
  public void a()
  {
    this.e = AnimationUtils.currentAnimationTimeMillis();
    this.i = -1L;
    this.f = this.e;
    this.j = 0.5F;
    this.g = 0;
    this.h = 0;
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.c = paramFloat1;
    this.d = paramFloat2;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void b()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.k = a.a((int)(l - this.e), 0, this.b);
    this.j = a(l);
    this.i = l;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public boolean c()
  {
    return (this.i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > this.i + this.k);
  }
  
  public void d()
  {
    if (this.f == 0L) {
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    float f1 = a(a(l1));
    long l2 = l1 - this.f;
    this.f = l1;
    this.g = ((int)((float)l2 * f1 * this.c));
    this.h = ((int)((float)l2 * f1 * this.d));
  }
  
  public int e()
  {
    return (int)(this.c / Math.abs(this.c));
  }
  
  public int f()
  {
    return (int)(this.d / Math.abs(this.d));
  }
  
  public int g()
  {
    return this.g;
  }
  
  public int h()
  {
    return this.h;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */