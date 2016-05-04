package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.i.n;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class p
  extends n
{
  final ActionProvider a;
  
  public p(o paramo, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramContext);
    this.a = paramActionProvider;
  }
  
  public View a()
  {
    return this.a.onCreateActionView();
  }
  
  public void a(SubMenu paramSubMenu)
  {
    this.a.onPrepareSubMenu(this.b.a(paramSubMenu));
  }
  
  public boolean d()
  {
    return this.a.onPerformDefaultAction();
  }
  
  public boolean e()
  {
    return this.a.hasSubMenu();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */