package android.support.v7.widget;

import android.support.v7.view.menu.ad;
import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.view.MenuItem;

class s
  implements y
{
  private s(k paramk) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    if ((parami instanceof ad)) {
      ((ad)parami).p().a(false);
    }
    y localy = this.a.a();
    if (localy != null) {
      localy.a(parami, paramBoolean);
    }
  }
  
  public boolean a(i parami)
  {
    if (parami == null) {
      return false;
    }
    this.a.h = ((ad)parami).getItem().getItemId();
    y localy = this.a.a();
    if (localy != null) {}
    for (boolean bool = localy.a(parami);; bool = false) {
      return bool;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */