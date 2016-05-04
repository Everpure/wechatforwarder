package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.view.Window.Callback;

final class am
  implements y
{
  private am(ae paramae) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    ae.a(this.a, parami);
  }
  
  public boolean a(i parami)
  {
    Window.Callback localCallback = this.a.o();
    if (localCallback != null) {
      localCallback.onMenuOpened(108, parami);
    }
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */