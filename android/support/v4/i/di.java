package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class di
{
  static final ds a = new dk();
  private WeakReference b;
  private Runnable c = null;
  private Runnable d = null;
  private int e = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new dr();
      return;
    }
    if (i >= 19)
    {
      a = new dq();
      return;
    }
    if (i >= 18)
    {
      a = new do();
      return;
    }
    if (i >= 16)
    {
      a = new dp();
      return;
    }
    if (i >= 14)
    {
      a = new dm();
      return;
    }
  }
  
  di(View paramView)
  {
    this.b = new WeakReference(paramView);
  }
  
  public long a()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      return a.a(this, localView);
    }
    return 0L;
  }
  
  public di a(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public di a(long paramLong)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramLong);
    }
    return this;
  }
  
  public di a(dz paramdz)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramdz);
    }
    return this;
  }
  
  public di a(eb parameb)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, parameb);
    }
    return this;
  }
  
  public di a(Interpolator paramInterpolator)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramInterpolator);
    }
    return this;
  }
  
  public di b(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public di b(long paramLong)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView, paramLong);
    }
    return this;
  }
  
  public void b()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView);
    }
  }
  
  public di c(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.c(this, localView, paramFloat);
    }
    return this;
  }
  
  public void c()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.c(this, localView);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */