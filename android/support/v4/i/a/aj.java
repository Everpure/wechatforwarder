package android.support.v4.i.a;

import android.os.Build.VERSION;

public class aj
{
  private static final am a = new ao();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new an();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new al();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new ak();
      return;
    }
  }
  
  public aj(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }
  
  public void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public void c(int paramInt)
  {
    a.e(this.b, paramInt);
  }
  
  public void d(int paramInt)
  {
    a.c(this.b, paramInt);
  }
  
  public void e(int paramInt)
  {
    a.d(this.b, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (aj)paramObject;
        if (this.b != null) {
          break;
        }
      } while (((aj)paramObject).b == null);
      return false;
    } while (this.b.equals(((aj)paramObject).b));
    return false;
  }
  
  public void f(int paramInt)
  {
    a.f(this.b, paramInt);
  }
  
  public void g(int paramInt)
  {
    a.g(this.b, paramInt);
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/a/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */