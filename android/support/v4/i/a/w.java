package android.support.v4.i.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class w
{
  private static final x a = new ac();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new aa();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new y();
      return;
    }
  }
  
  public w()
  {
    this.b = a.a(this);
  }
  
  public w(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public g a(int paramInt)
  {
    return null;
  }
  
  public Object a()
  {
    return this.b;
  }
  
  public List a(String paramString, int paramInt)
  {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  public g b(int paramInt)
  {
    return null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */