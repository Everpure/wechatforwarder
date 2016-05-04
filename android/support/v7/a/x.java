package android.support.v7.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.support.v7.view.i;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class x
  extends w
{
  final Context a;
  final Window b;
  final Window.Callback c;
  final Window.Callback d;
  final v e;
  a f;
  MenuInflater g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  private CharSequence m;
  private boolean n;
  
  x(Context paramContext, Window paramWindow, v paramv)
  {
    this.a = paramContext;
    this.b = paramWindow;
    this.e = paramv;
    this.c = this.b.getCallback();
    if ((this.c instanceof y)) {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    this.d = a(this.c);
    this.b.setCallback(this.d);
  }
  
  public a a()
  {
    j();
    return this.f;
  }
  
  abstract b a(c paramc);
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new y(this, paramCallback);
  }
  
  abstract void a(int paramInt, Menu paramMenu);
  
  public final void a(CharSequence paramCharSequence)
  {
    this.m = paramCharSequence;
    b(paramCharSequence);
  }
  
  abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean a(KeyEvent paramKeyEvent);
  
  public MenuInflater b()
  {
    if (this.g == null)
    {
      j();
      if (this.f == null) {
        break label43;
      }
    }
    label43:
    for (Context localContext = this.f.c();; localContext = this.a)
    {
      this.g = new i(localContext);
      return this.g;
    }
  }
  
  abstract void b(CharSequence paramCharSequence);
  
  abstract boolean b(int paramInt, Menu paramMenu);
  
  public void c(Bundle paramBundle) {}
  
  public void f()
  {
    this.n = true;
  }
  
  public boolean h()
  {
    return false;
  }
  
  abstract void j();
  
  final a k()
  {
    return this.f;
  }
  
  final Context l()
  {
    Context localContext = null;
    Object localObject = a();
    if (localObject != null) {
      localContext = ((a)localObject).c();
    }
    localObject = localContext;
    if (localContext == null) {
      localObject = this.a;
    }
    return (Context)localObject;
  }
  
  public boolean m()
  {
    return false;
  }
  
  final boolean n()
  {
    return this.n;
  }
  
  final Window.Callback o()
  {
    return this.b.getCallback();
  }
  
  final CharSequence p()
  {
    if ((this.c instanceof Activity)) {
      return ((Activity)this.c).getTitle();
    }
    return this.m;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */