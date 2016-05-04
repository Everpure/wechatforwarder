package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.e.a.a;
import android.support.v4.e.a.b;
import android.support.v4.e.a.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class ab
{
  public static Menu a(Context paramContext, a parama)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return new ac(paramContext, parama);
    }
    throw new UnsupportedOperationException();
  }
  
  public static MenuItem a(Context paramContext, b paramb)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return new t(paramContext, paramb);
    }
    if (Build.VERSION.SDK_INT >= 14) {
      return new o(paramContext, paramb);
    }
    throw new UnsupportedOperationException();
  }
  
  public static SubMenu a(Context paramContext, c paramc)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return new ae(paramContext, paramc);
    }
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */