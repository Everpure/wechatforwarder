package android.support.v7.view.menu;

import android.support.v4.i.aw;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class r
  extends f
  implements aw
{
  r(o paramo, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    super(paramOnActionExpandListener);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionExpand(this.a.a(paramMenuItem));
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionCollapse(this.a.a(paramMenuItem));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */