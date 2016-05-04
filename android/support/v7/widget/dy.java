package android.support.v7.widget;

import android.view.View;

final class dy
  extends dx
{
  dy(eq parameq)
  {
    super(parameq, null);
  }
  
  public int a(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    return this.a.h(paramView) - locales.leftMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.i(paramInt);
  }
  
  public int b(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    int i = this.a.j(paramView);
    return locales.rightMargin + i;
  }
  
  public int c()
  {
    return this.a.x();
  }
  
  public int c(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    int i = this.a.f(paramView);
    int j = locales.leftMargin;
    return locales.rightMargin + (i + j);
  }
  
  public int d()
  {
    return this.a.v() - this.a.z();
  }
  
  public int d(View paramView)
  {
    es locales = (es)paramView.getLayoutParams();
    int i = this.a.g(paramView);
    int j = locales.topMargin;
    return locales.bottomMargin + (i + j);
  }
  
  public int e()
  {
    return this.a.v();
  }
  
  public int f()
  {
    return this.a.v() - this.a.x() - this.a.z();
  }
  
  public int g()
  {
    return this.a.z();
  }
  
  public int h()
  {
    return this.a.t();
  }
  
  public int i()
  {
    return this.a.u();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */