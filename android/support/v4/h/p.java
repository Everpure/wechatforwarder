package android.support.v4.h;

public class p
  implements o
{
  private final Object[] a;
  private int b;
  
  public p(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("The max pool size must be > 0");
    }
    this.a = new Object[paramInt];
  }
  
  private boolean b(Object paramObject)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.b)
      {
        if (this.a[i] == paramObject) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public Object a()
  {
    if (this.b > 0)
    {
      int i = this.b - 1;
      Object localObject = this.a[i];
      this.a[i] = null;
      this.b -= 1;
      return localObject;
    }
    return null;
  }
  
  public boolean a(Object paramObject)
  {
    if (b(paramObject)) {
      throw new IllegalStateException("Already in the pool!");
    }
    if (this.b < this.a.length)
    {
      this.a[this.b] = paramObject;
      this.b += 1;
      return true;
    }
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/h/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */