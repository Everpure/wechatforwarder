package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.view.Window.Callback;

final class ar
  implements y
{
  private ar(ae paramae) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    i locali = parami.p();
    if (locali != parami) {}
    for (int i = 1;; i = 0)
    {
      ae localae = this.a;
      if (i != 0) {
        parami = locali;
      }
      parami = ae.a(localae, parami);
      if (parami != null)
      {
        if (i == 0) {
          break;
        }
        ae.a(this.a, parami.a, parami, locali);
        ae.a(this.a, parami, true);
      }
      return;
    }
    ae.a(this.a, parami, paramBoolean);
  }
  
  public boolean a(i parami)
  {
    if ((parami == null) && (this.a.h))
    {
      Window.Callback localCallback = this.a.o();
      if ((localCallback != null) && (!this.a.n())) {
        localCallback.onMenuOpened(108, parami);
      }
    }
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */