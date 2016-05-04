package android.support.v7.widget;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.j;
import android.view.MenuItem;

class x
  implements j
{
  private x(ActionMenuView paramActionMenuView) {}
  
  public void a(i parami)
  {
    if (ActionMenuView.b(this.a) != null) {
      ActionMenuView.b(this.a).a(parami);
    }
  }
  
  public boolean a(i parami, MenuItem paramMenuItem)
  {
    return (ActionMenuView.a(this.a) != null) && (ActionMenuView.a(this.a).a(paramMenuItem));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */