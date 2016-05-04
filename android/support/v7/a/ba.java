package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.view.Window.Callback;

final class ba
  implements y
{
  private ba(av paramav) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    if (av.a(this.a) != null) {
      av.a(this.a).onPanelClosed(0, parami);
    }
  }
  
  public boolean a(i parami)
  {
    if ((parami == null) && (av.a(this.a) != null)) {
      av.a(this.a).onMenuOpened(0, parami);
    }
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */