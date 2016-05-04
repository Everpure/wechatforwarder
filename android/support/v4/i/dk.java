package android.support.v4.i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class dk
  implements ds
{
  WeakHashMap a = null;
  
  private void a(View paramView)
  {
    if (this.a != null)
    {
      Runnable localRunnable = (Runnable)this.a.get(paramView);
      if (localRunnable != null) {
        paramView.removeCallbacks(localRunnable);
      }
    }
  }
  
  private void d(di paramdi, View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dz)) {}
    for (localObject = (dz)localObject;; localObject = null)
    {
      Runnable localRunnable1 = di.a(paramdi);
      Runnable localRunnable2 = di.b(paramdi);
      di.b(paramdi, null);
      di.a(paramdi, null);
      if (localRunnable1 != null) {
        localRunnable1.run();
      }
      if (localObject != null)
      {
        ((dz)localObject).a(paramView);
        ((dz)localObject).b(paramView);
      }
      if (localRunnable2 != null) {
        localRunnable2.run();
      }
      if (this.a != null) {
        this.a.remove(paramView);
      }
      return;
    }
  }
  
  private void e(di paramdi, View paramView)
  {
    if (this.a != null) {}
    for (Runnable localRunnable = (Runnable)this.a.get(paramView);; localRunnable = null)
    {
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new dl(this, paramdi, paramView, null);
        if (this.a == null) {
          this.a = new WeakHashMap();
        }
        this.a.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
      return;
    }
  }
  
  public long a(di paramdi, View paramView)
  {
    return 0L;
  }
  
  public void a(di paramdi, View paramView, float paramFloat)
  {
    e(paramdi, paramView);
  }
  
  public void a(di paramdi, View paramView, long paramLong) {}
  
  public void a(di paramdi, View paramView, dz paramdz)
  {
    paramView.setTag(2113929216, paramdz);
  }
  
  public void a(di paramdi, View paramView, eb parameb) {}
  
  public void a(di paramdi, View paramView, Interpolator paramInterpolator) {}
  
  public void b(di paramdi, View paramView)
  {
    e(paramdi, paramView);
  }
  
  public void b(di paramdi, View paramView, float paramFloat)
  {
    e(paramdi, paramView);
  }
  
  public void b(di paramdi, View paramView, long paramLong) {}
  
  public void c(di paramdi, View paramView)
  {
    a(paramView);
    d(paramdi, paramView);
  }
  
  public void c(di paramdi, View paramView, float paramFloat)
  {
    e(paramdi, paramView);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */