package android.support.v7.widget;

import android.view.View;
import java.util.List;

class dd
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  boolean i = false;
  int j;
  List k = null;
  boolean l;
  
  private View b()
  {
    int n = this.k.size();
    int m = 0;
    if (m < n)
    {
      View localView = ((fh)this.k.get(m)).a;
      es locales = (es)localView.getLayoutParams();
      if (locales.c()) {}
      while (this.d != locales.e())
      {
        m += 1;
        break;
      }
      a(localView);
      return localView;
    }
    return null;
  }
  
  View a(ex paramex)
  {
    if (this.k != null) {
      return b();
    }
    paramex = paramex.c(this.d);
    this.d += this.e;
    return paramex;
  }
  
  public void a()
  {
    a(null);
  }
  
  public void a(View paramView)
  {
    paramView = b(paramView);
    if (paramView == null)
    {
      this.d = -1;
      return;
    }
    this.d = ((es)paramView.getLayoutParams()).e();
  }
  
  boolean a(fe paramfe)
  {
    return (this.d >= 0) && (this.d < paramfe.e());
  }
  
  public View b(View paramView)
  {
    int i2 = this.k.size();
    Object localObject = null;
    int m = Integer.MAX_VALUE;
    int n = 0;
    if (n < i2)
    {
      View localView = ((fh)this.k.get(n)).a;
      es locales = (es)localView.getLayoutParams();
      if (localView != paramView) {
        if (!locales.c()) {}
      }
      for (;;)
      {
        n += 1;
        break;
        int i1 = (locales.e() - this.d) * this.e;
        if (i1 >= 0) {
          if (i1 < m)
          {
            if (i1 == 0) {
              return localView;
            }
            localObject = localView;
            m = i1;
          }
        }
      }
    }
    return (View)localObject;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */