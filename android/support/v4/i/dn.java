package android.support.v4.i;

import android.os.Build.VERSION;
import android.view.View;

class dn
  implements dz
{
  di a;
  boolean b;
  
  dn(di paramdi)
  {
    this.a = paramdi;
  }
  
  public void a(View paramView)
  {
    this.b = false;
    if (di.c(this.a) >= 0) {
      bu.a(paramView, 2, null);
    }
    if (di.a(this.a) != null)
    {
      localObject = di.a(this.a);
      di.b(this.a, null);
      ((Runnable)localObject).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dz)) {}
    for (localObject = (dz)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((dz)localObject).a(paramView);
      }
      return;
    }
  }
  
  public void b(View paramView)
  {
    if (di.c(this.a) >= 0)
    {
      bu.a(paramView, di.c(this.a), null);
      di.a(this.a, -1);
    }
    if ((Build.VERSION.SDK_INT >= 16) || (!this.b))
    {
      if (di.b(this.a) != null)
      {
        localObject = di.b(this.a);
        di.a(this.a, null);
        ((Runnable)localObject).run();
      }
      localObject = paramView.getTag(2113929216);
      if (!(localObject instanceof dz)) {
        break label115;
      }
    }
    label115:
    for (Object localObject = (dz)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((dz)localObject).b(paramView);
      }
      this.b = true;
      return;
    }
  }
  
  public void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof dz)) {}
    for (localObject = (dz)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((dz)localObject).c(paramView);
      }
      return;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */