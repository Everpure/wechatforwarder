package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.i.ct;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.e;
import android.support.v7.b.h;
import android.support.v7.b.l;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class a
{
  private Context a;
  
  private a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public int a()
  {
    return this.a.getResources().getInteger(h.abc_max_action_buttons);
  }
  
  public boolean b()
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    while (!ct.b(ViewConfiguration.get(this.a))) {
      return true;
    }
    return false;
  }
  
  public int c()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }
  
  public boolean d()
  {
    if (this.a.getApplicationInfo().targetSdkVersion >= 16) {
      return this.a.getResources().getBoolean(c.abc_action_bar_embed_tabs);
    }
    return this.a.getResources().getBoolean(c.abc_action_bar_embed_tabs_pre_jb);
  }
  
  public int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, l.ActionBar, b.actionBarStyle, 0);
    int j = localTypedArray.getLayoutDimension(l.ActionBar_height, 0);
    Resources localResources = this.a.getResources();
    int i = j;
    if (!d()) {
      i = Math.min(j, localResources.getDimensionPixelSize(e.abc_action_bar_stacked_max_height));
    }
    localTypedArray.recycle();
    return i;
  }
  
  public boolean f()
  {
    return this.a.getApplicationInfo().targetSdkVersion < 14;
  }
  
  public int g()
  {
    return this.a.getResources().getDimensionPixelSize(e.abc_action_bar_stacked_tab_max_width);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */