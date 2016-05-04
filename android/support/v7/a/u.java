package android.support.v7.a;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.bc;
import android.support.v4.b.bk;
import android.support.v4.b.bl;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.gq;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class u
  extends android.support.v4.b.w
  implements bl, v
{
  private w l;
  private int m = 0;
  private boolean n;
  private Resources o;
  
  public Intent a()
  {
    return bc.a(this);
  }
  
  public b a(c paramc)
  {
    return null;
  }
  
  public void a(bk parambk)
  {
    parambk.a(this);
  }
  
  public void a(b paramb) {}
  
  public void a(Toolbar paramToolbar)
  {
    i().a(paramToolbar);
  }
  
  public boolean a(Intent paramIntent)
  {
    return bc.a(this, paramIntent);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    i().b(paramView, paramLayoutParams);
  }
  
  public void b(Intent paramIntent)
  {
    bc.b(this, paramIntent);
  }
  
  public void b(bk parambk) {}
  
  public void b(b paramb) {}
  
  public void d()
  {
    i().e();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 19)
    {
      int i = paramKeyEvent.getAction();
      if (i == 0)
      {
        if (android.support.v4.i.v.a(paramKeyEvent, 2))
        {
          a locala = f();
          if ((locala != null) && (locala.b()) && (locala.g()))
          {
            this.n = true;
            return true;
          }
        }
      }
      else if ((i == 1) && (this.n))
      {
        this.n = false;
        return true;
      }
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public a f()
  {
    return i().a();
  }
  
  public View findViewById(int paramInt)
  {
    return i().a(paramInt);
  }
  
  public boolean g()
  {
    Object localObject = a();
    if (localObject != null)
    {
      if (a((Intent)localObject))
      {
        localObject = bk.a(this);
        a((bk)localObject);
        b((bk)localObject);
        ((bk)localObject).a();
      }
      for (;;)
      {
        try
        {
          android.support.v4.b.a.a(this);
          return true;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
          continue;
        }
        b(localIllegalStateException);
      }
    }
    return false;
  }
  
  public MenuInflater getMenuInflater()
  {
    return i().b();
  }
  
  public Resources getResources()
  {
    if (this.o == null) {
      this.o = new gq(this, super.getResources());
    }
    return this.o;
  }
  
  @Deprecated
  public void h() {}
  
  public w i()
  {
    if (this.l == null) {
      this.l = w.a(this, this);
    }
    return this.l;
  }
  
  public void invalidateOptionsMenu()
  {
    i().e();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    i().a(paramConfiguration);
    if (this.o != null) {
      this.o.updateConfiguration(paramConfiguration, null);
    }
  }
  
  public void onContentChanged()
  {
    h();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    w localw = i();
    localw.g();
    localw.a(paramBundle);
    if ((localw.h()) && (this.m != 0))
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label55;
      }
      onApplyThemeResource(getTheme(), this.m, false);
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label55:
      setTheme(this.m);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    i().f();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    a locala = f();
    if ((paramMenuItem.getItemId() == 16908332) && (locala != null) && ((locala.a() & 0x4) != 0)) {
      return g();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    i().b(paramBundle);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    i().d();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    i().c(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    i().c();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    i().a(paramCharSequence);
  }
  
  public void setContentView(int paramInt)
  {
    i().b(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    i().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    i().a(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.m = paramInt;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */