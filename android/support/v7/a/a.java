package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.view.KeyEvent;

public abstract class a
{
  public abstract int a();
  
  public b a(c paramc)
  {
    return null;
  }
  
  public void a(float paramFloat)
  {
    if (paramFloat != 0.0F) {
      throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
    }
  }
  
  public void a(Configuration paramConfiguration) {}
  
  public void a(CharSequence paramCharSequence) {}
  
  public abstract void a(boolean paramBoolean);
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public void b(boolean paramBoolean) {}
  
  public abstract boolean b();
  
  public Context c()
  {
    return null;
  }
  
  public void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }
  }
  
  public int d()
  {
    return 0;
  }
  
  public void d(boolean paramBoolean) {}
  
  public void e(boolean paramBoolean) {}
  
  public boolean e()
  {
    return false;
  }
  
  public void f(boolean paramBoolean) {}
  
  public boolean f()
  {
    return false;
  }
  
  boolean g()
  {
    return false;
  }
  
  void h() {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */