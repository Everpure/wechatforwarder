package android.support.v7.widget;

import android.view.View;

final class dz
  extends dx
{
  dz(eq parameq)
  {
    super(parameq, null);
  }
  
  public int a(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    return this.a.i(paramView) - locales.topMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.j(paramInt);
  }
  
  public int b(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    int i = this.a.k(paramView);
    return locales.bottomMargin + i;
  }
  
  public int c()
  {
    return this.a.y();
  }
  
  public int c(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    int i = this.a.g(paramView);
    int j = locales.topMargin;
    return locales.bottomMargin + (i + j);
  }
  
  public int d()
  {
    return this.a.w() - this.a.A();
  }
  
  public int d(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    int i = this.a.f(paramView);
    int j = locales.leftMargin;
    return locales.rightMargin + (i + j);
  }
  
  public int e()
  {
    return this.a.w();
  }
  
  public int f()
  {
    return this.a.w() - this.a.y() - this.a.A();
  }
  
  public int g()
  {
    return this.a.A();
  }
  
  public int h()
  {
    return this.a.u();
  }
  
  public int i()
  {
    return this.a.t();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */