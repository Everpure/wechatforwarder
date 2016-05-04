package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class bm
{
  private static bm a;
  private final Object b = new Object();
  private final Handler c = new Handler(Looper.getMainLooper(), new bn(this));
  private bp d;
  private bp e;
  
  static bm a()
  {
    if (a == null) {
      a = new bm();
    }
    return a;
  }
  
  private void a(bp parambp)
  {
    if (bp.b(parambp) == -2) {
      return;
    }
    int i = 2750;
    if (bp.b(parambp) > 0) {
      i = bp.b(parambp);
    }
    for (;;)
    {
      this.c.removeCallbacksAndMessages(parambp);
      this.c.sendMessageDelayed(Message.obtain(this.c, 0, parambp), i);
      return;
      if (bp.b(parambp) == -1) {
        i = 1500;
      }
    }
  }
  
  private boolean a(bp parambp, int paramInt)
  {
    bo localbo = (bo)bp.a(parambp).get();
    if (localbo != null)
    {
      this.c.removeCallbacksAndMessages(parambp);
      localbo.a(paramInt);
      return true;
    }
    return false;
  }
  
  private void b()
  {
    if (this.e != null)
    {
      this.d = this.e;
      this.e = null;
      bo localbo = (bo)bp.a(this.d).get();
      if (localbo != null) {
        localbo.a();
      }
    }
    else
    {
      return;
    }
    this.d = null;
  }
  
  private void b(bp parambp)
  {
    synchronized (this.b)
    {
      if ((this.d == parambp) || (this.e == parambp)) {
        a(parambp, 2);
      }
      return;
    }
  }
  
  private boolean f(bo parambo)
  {
    return (this.d != null) && (this.d.a(parambo));
  }
  
  private boolean g(bo parambo)
  {
    return (this.e != null) && (this.e.a(parambo));
  }
  
  public void a(bo parambo)
  {
    synchronized (this.b)
    {
      if (f(parambo))
      {
        this.d = null;
        if (this.e != null) {
          b();
        }
      }
      return;
    }
  }
  
  public void a(bo parambo, int paramInt)
  {
    synchronized (this.b)
    {
      if (f(parambo)) {
        a(this.d, paramInt);
      }
      while (!g(parambo)) {
        return;
      }
      a(this.e, paramInt);
    }
  }
  
  public void b(bo parambo)
  {
    synchronized (this.b)
    {
      if (f(parambo)) {
        a(this.d);
      }
      return;
    }
  }
  
  public void c(bo parambo)
  {
    synchronized (this.b)
    {
      if (f(parambo)) {
        this.c.removeCallbacksAndMessages(this.d);
      }
      return;
    }
  }
  
  public void d(bo parambo)
  {
    synchronized (this.b)
    {
      if (f(parambo)) {
        a(this.d);
      }
      return;
    }
  }
  
  public boolean e(bo parambo)
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if (!f(parambo))
        {
          if (!g(parambo)) {
            break label40;
          }
          break label35;
          return bool;
        }
      }
      label35:
      boolean bool = true;
      continue;
      label40:
      bool = false;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */