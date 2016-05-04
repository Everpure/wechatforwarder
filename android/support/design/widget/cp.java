package android.support.design.widget;

import android.os.Build.VERSION;
import android.support.v4.i.bu;
import android.view.View;
import android.view.ViewParent;

class cp
{
  private final View a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public cp(View paramView)
  {
    this.a = paramView;
  }
  
  private static void a(View paramView)
  {
    float f = bu.n(paramView);
    bu.b(paramView, 1.0F + f);
    bu.b(paramView, f);
  }
  
  private void c()
  {
    bu.e(this.a, this.d - (this.a.getTop() - this.b));
    bu.f(this.a, this.e - (this.a.getLeft() - this.c));
    if (Build.VERSION.SDK_INT < 23)
    {
      a(this.a);
      ViewParent localViewParent = this.a.getParent();
      if ((localViewParent instanceof View)) {
        a((View)localViewParent);
      }
    }
  }
  
  public void a()
  {
    this.b = this.a.getTop();
    this.c = this.a.getLeft();
    c();
  }
  
  public boolean a(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      c();
      return true;
    }
    return false;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public boolean b(int paramInt)
  {
    if (this.e != paramInt)
    {
      this.e = paramInt;
      c();
      return true;
    }
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */