package android.support.v4.b;

import android.view.View;

class u
  extends aa
{
  u(t paramt) {}
  
  public View a(int paramInt)
  {
    if (this.a.I == null) {
      throw new IllegalStateException("Fragment does not have a view");
    }
    return this.a.I.findViewById(paramInt);
  }
  
  public boolean a()
  {
    return this.a.I != null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */