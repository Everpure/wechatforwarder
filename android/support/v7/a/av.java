package android.support.v7.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v4.i.bu;
import android.support.v7.b.b;
import android.support.v7.b.k;
import android.support.v7.view.menu.g;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.cf;
import android.support.v7.widget.gx;
import android.support.v7.widget.ha;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.ListAdapter;
import java.util.ArrayList;

class av
  extends a
{
  private cf a;
  private boolean b;
  private Window.Callback c;
  private boolean d;
  private boolean e;
  private ArrayList f = new ArrayList();
  private g g;
  private final Runnable h = new aw(this);
  private final gx i = new ax(this);
  
  public av(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    this.a = new ha(paramToolbar, false);
    this.c = new bb(this, paramCallback);
    this.a.a(this.c);
    paramToolbar.setOnMenuItemClickListener(this.i);
    this.a.a(paramCharSequence);
  }
  
  private View a(Menu paramMenu)
  {
    b(paramMenu);
    if ((paramMenu == null) || (this.g == null)) {}
    while (this.g.a().getCount() <= 0) {
      return null;
    }
    return (View)this.g.a(this.a.a());
  }
  
  private void b(Menu paramMenu)
  {
    Object localObject;
    Resources.Theme localTheme;
    if ((this.g == null) && ((paramMenu instanceof android.support.v7.view.menu.i)))
    {
      paramMenu = (android.support.v7.view.menu.i)paramMenu;
      localObject = this.a.b();
      TypedValue localTypedValue = new TypedValue();
      localTheme = ((Context)localObject).getResources().newTheme();
      localTheme.setTo(((Context)localObject).getTheme());
      localTheme.resolveAttribute(b.actionBarPopupTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0) {
        localTheme.applyStyle(localTypedValue.resourceId, true);
      }
      localTheme.resolveAttribute(b.panelMenuListTheme, localTypedValue, true);
      if (localTypedValue.resourceId == 0) {
        break label170;
      }
      localTheme.applyStyle(localTypedValue.resourceId, true);
    }
    for (;;)
    {
      localObject = new ContextThemeWrapper((Context)localObject, 0);
      ((Context)localObject).getTheme().setTo(localTheme);
      this.g = new g((Context)localObject, android.support.v7.b.i.abc_list_menu_item_layout);
      this.g.a(new ba(this, null));
      paramMenu.a(this.g);
      return;
      label170:
      localTheme.applyStyle(k.Theme_AppCompat_CompactMenu, true);
    }
  }
  
  private Menu k()
  {
    if (!this.d)
    {
      this.a.a(new ay(this, null), new az(this, null));
      this.d = true;
    }
    return this.a.r();
  }
  
  public int a()
  {
    return this.a.o();
  }
  
  public void a(float paramFloat)
  {
    bu.d(this.a.a(), paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int j = this.a.o();
    this.a.c(j & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.a.a(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int j = 8;; j = 0)
    {
      a(j, 8);
      return;
    }
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = k();
    int j;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label56;
      }
      j = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(j).getKeyboardType() == 1) {
        break label61;
      }
    }
    label56:
    label61:
    for (boolean bool = true;; bool = false)
    {
      localMenu.setQwertyMode(bool);
      localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return true;
      j = -1;
      break;
    }
  }
  
  public void b(boolean paramBoolean) {}
  
  public boolean b()
  {
    return this.a.q() == 0;
  }
  
  public Context c()
  {
    return this.a.b();
  }
  
  public void d(boolean paramBoolean) {}
  
  public void e(boolean paramBoolean) {}
  
  public boolean e()
  {
    this.a.a().removeCallbacks(this.h);
    bu.a(this.a.a(), this.h);
    return true;
  }
  
  public void f(boolean paramBoolean)
  {
    if (paramBoolean == this.e) {}
    for (;;)
    {
      return;
      this.e = paramBoolean;
      int k = this.f.size();
      int j = 0;
      while (j < k)
      {
        ((c)this.f.get(j)).a(paramBoolean);
        j += 1;
      }
    }
  }
  
  public boolean f()
  {
    if (this.a.c())
    {
      this.a.d();
      return true;
    }
    return false;
  }
  
  public boolean g()
  {
    ViewGroup localViewGroup = this.a.a();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  void h()
  {
    this.a.a().removeCallbacks(this.h);
  }
  
  public Window.Callback i()
  {
    return this.c;
  }
  
  void j()
  {
    Menu localMenu = k();
    if ((localMenu instanceof android.support.v7.view.menu.i)) {}
    for (locali = (android.support.v7.view.menu.i)localMenu;; locali = null)
    {
      if (locali != null) {
        locali.g();
      }
      try
      {
        localMenu.clear();
        if ((!this.c.onCreatePanelMenu(0, localMenu)) || (!this.c.onPreparePanel(0, null, localMenu))) {
          localMenu.clear();
        }
        return;
      }
      finally
      {
        if (locali == null) {
          break;
        }
        locali.h();
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */