package android.support.v4.i;

import android.view.WindowInsets;

class ed
  extends ec
{
  private final WindowInsets a;
  
  ed(WindowInsets paramWindowInsets)
  {
    this.a = paramWindowInsets;
  }
  
  public int a()
  {
    return this.a.getSystemWindowInsetLeft();
  }
  
  public ec a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new ed(this.a.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public int b()
  {
    return this.a.getSystemWindowInsetTop();
  }
  
  public int c()
  {
    return this.a.getSystemWindowInsetRight();
  }
  
  public int d()
  {
    return this.a.getSystemWindowInsetBottom();
  }
  
  public boolean e()
  {
    return this.a.isConsumed();
  }
  
  WindowInsets f()
  {
    return this.a;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */