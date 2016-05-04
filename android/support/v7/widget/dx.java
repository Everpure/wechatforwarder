package android.support.v7.widget;

import android.view.View;

public abstract class dx
{
  protected final eq a;
  private int b = Integer.MIN_VALUE;
  
  private dx(eq parameq)
  {
    this.a = parameq;
  }
  
  public static dx a(eq parameq)
  {
    return new dy(parameq);
  }
  
  public static dx a(eq parameq, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("invalid orientation");
    case 0: 
      return a(parameq);
    }
    return b(parameq);
  }
  
  public static dx b(eq parameq)
  {
    return new dz(parameq);
  }
  
  public abstract int a(View paramView);
  
  public void a()
  {
    this.b = f();
  }
  
  public abstract void a(int paramInt);
  
  public int b()
  {
    if (Integer.MIN_VALUE == this.b) {
      return 0;
    }
    return f() - this.b;
  }
  
  public abstract int b(View paramView);
  
  public abstract int c();
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int d(View paramView);
  
  public abstract int e();
  
  public abstract int f();
  
  public abstract int g();
  
  public abstract int h();
  
  public abstract int i();
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */