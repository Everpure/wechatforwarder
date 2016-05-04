package android.support.v7.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.i.ar;
import android.support.v4.i.n;
import android.support.v7.b.l;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

class k
{
  private Menu b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private CharSequence l;
  private CharSequence m;
  private int n;
  private char o;
  private char p;
  private int q;
  private boolean r;
  private boolean s;
  private boolean t;
  private int u;
  private int v;
  private String w;
  private String x;
  private String y;
  private n z;
  
  public k(i parami, Menu paramMenu)
  {
    this.b = paramMenu;
    a();
  }
  
  private char a(String paramString)
  {
    if (paramString == null) {
      return '\000';
    }
    return paramString.charAt(0);
  }
  
  private Object a(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramArrayOfClass = i.a(this.a).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
      return paramArrayOfClass;
    }
    catch (Exception paramArrayOfClass)
    {
      Log.w("SupportMenuInflater", "Cannot instantiate class: " + paramString, paramArrayOfClass);
    }
    return null;
  }
  
  private void a(MenuItem paramMenuItem)
  {
    int i1 = 1;
    Object localObject = paramMenuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t);
    if (this.q >= 1) {}
    for (boolean bool = true;; bool = false)
    {
      ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
      if (this.u >= 0) {
        ar.a(paramMenuItem, this.u);
      }
      if (this.y == null) {
        break label162;
      }
      if (!i.a(this.a).isRestricted()) {
        break;
      }
      throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
    }
    paramMenuItem.setOnMenuItemClickListener(new j(i.c(this.a), this.y));
    label162:
    if ((paramMenuItem instanceof m)) {
      localObject = (m)paramMenuItem;
    }
    if (this.q >= 2)
    {
      if ((paramMenuItem instanceof m)) {
        ((m)paramMenuItem).a(true);
      }
    }
    else
    {
      if (this.w == null) {
        break label297;
      }
      ar.a(paramMenuItem, (View)a(this.w, i.b(), i.d(this.a)));
    }
    for (;;)
    {
      if (this.v > 0)
      {
        if (i1 != 0) {
          break label286;
        }
        ar.b(paramMenuItem, this.v);
      }
      for (;;)
      {
        if (this.z != null) {
          ar.a(paramMenuItem, this.z);
        }
        return;
        if (!(paramMenuItem instanceof o)) {
          break;
        }
        ((o)paramMenuItem).a(true);
        break;
        label286:
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
      label297:
      i1 = 0;
    }
  }
  
  public void a()
  {
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = true;
    this.h = true;
  }
  
  public void a(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = i.a(this.a).obtainStyledAttributes(paramAttributeSet, l.MenuGroup);
    this.c = paramAttributeSet.getResourceId(l.MenuGroup_android_id, 0);
    this.d = paramAttributeSet.getInt(l.MenuGroup_android_menuCategory, 0);
    this.e = paramAttributeSet.getInt(l.MenuGroup_android_orderInCategory, 0);
    this.f = paramAttributeSet.getInt(l.MenuGroup_android_checkableBehavior, 0);
    this.g = paramAttributeSet.getBoolean(l.MenuGroup_android_visible, true);
    this.h = paramAttributeSet.getBoolean(l.MenuGroup_android_enabled, true);
    paramAttributeSet.recycle();
  }
  
  public void b()
  {
    this.i = true;
    a(this.b.add(this.c, this.j, this.k, this.l));
  }
  
  public void b(AttributeSet paramAttributeSet)
  {
    int i2 = 1;
    paramAttributeSet = i.a(this.a).obtainStyledAttributes(paramAttributeSet, l.MenuItem);
    this.j = paramAttributeSet.getResourceId(l.MenuItem_android_id, 0);
    this.k = (paramAttributeSet.getInt(l.MenuItem_android_menuCategory, this.d) & 0xFFFF0000 | paramAttributeSet.getInt(l.MenuItem_android_orderInCategory, this.e) & 0xFFFF);
    this.l = paramAttributeSet.getText(l.MenuItem_android_title);
    this.m = paramAttributeSet.getText(l.MenuItem_android_titleCondensed);
    this.n = paramAttributeSet.getResourceId(l.MenuItem_android_icon, 0);
    this.o = a(paramAttributeSet.getString(l.MenuItem_android_alphabeticShortcut));
    this.p = a(paramAttributeSet.getString(l.MenuItem_android_numericShortcut));
    int i1;
    if (paramAttributeSet.hasValue(l.MenuItem_android_checkable)) {
      if (paramAttributeSet.getBoolean(l.MenuItem_android_checkable, false))
      {
        i1 = 1;
        this.q = i1;
        label156:
        this.r = paramAttributeSet.getBoolean(l.MenuItem_android_checked, false);
        this.s = paramAttributeSet.getBoolean(l.MenuItem_android_visible, this.g);
        this.t = paramAttributeSet.getBoolean(l.MenuItem_android_enabled, this.h);
        this.u = paramAttributeSet.getInt(l.MenuItem_showAsAction, -1);
        this.y = paramAttributeSet.getString(l.MenuItem_android_onClick);
        this.v = paramAttributeSet.getResourceId(l.MenuItem_actionLayout, 0);
        this.w = paramAttributeSet.getString(l.MenuItem_actionViewClass);
        this.x = paramAttributeSet.getString(l.MenuItem_actionProviderClass);
        if (this.x == null) {
          break label333;
        }
        i1 = i2;
        label264:
        if ((i1 == 0) || (this.v != 0) || (this.w != null)) {
          break label338;
        }
      }
    }
    for (this.z = ((n)a(this.x, i.a(), i.b(this.a)));; this.z = null)
    {
      paramAttributeSet.recycle();
      this.i = false;
      return;
      i1 = 0;
      break;
      this.q = this.f;
      break label156;
      label333:
      i1 = 0;
      break label264;
      label338:
      if (i1 != 0) {
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
      }
    }
  }
  
  public SubMenu c()
  {
    this.i = true;
    SubMenu localSubMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
    a(localSubMenu.getItem());
    return localSubMenu;
  }
  
  public boolean d()
  {
    return this.i;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */