package android.support.v7.view;

import android.content.Context;
import android.support.v4.e.a.a;
import android.support.v4.h.q;
import android.support.v7.view.menu.ab;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class h
  implements c
{
  final ActionMode.Callback a;
  final Context b;
  final ArrayList c;
  final q d;
  
  public h(Context paramContext, ActionMode.Callback paramCallback)
  {
    this.b = paramContext;
    this.a = paramCallback;
    this.c = new ArrayList();
    this.d = new q();
  }
  
  private Menu a(Menu paramMenu)
  {
    Menu localMenu2 = (Menu)this.d.get(paramMenu);
    Menu localMenu1 = localMenu2;
    if (localMenu2 == null)
    {
      localMenu1 = ab.a(this.b, (a)paramMenu);
      this.d.put(paramMenu, localMenu1);
    }
    return localMenu1;
  }
  
  public void a(b paramb)
  {
    this.a.onDestroyActionMode(b(paramb));
  }
  
  public boolean a(b paramb, Menu paramMenu)
  {
    return this.a.onCreateActionMode(b(paramb), a(paramMenu));
  }
  
  public boolean a(b paramb, MenuItem paramMenuItem)
  {
    return this.a.onActionItemClicked(b(paramb), ab.a(this.b, (android.support.v4.e.a.b)paramMenuItem));
  }
  
  public ActionMode b(b paramb)
  {
    int j = this.c.size();
    int i = 0;
    while (i < j)
    {
      g localg = (g)this.c.get(i);
      if ((localg != null) && (localg.b == paramb)) {
        return localg;
      }
      i += 1;
    }
    paramb = new g(this.b, paramb);
    this.c.add(paramb);
    return paramb;
  }
  
  public boolean b(b paramb, Menu paramMenu)
  {
    return this.a.onPrepareActionMode(b(paramb), a(paramMenu));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */