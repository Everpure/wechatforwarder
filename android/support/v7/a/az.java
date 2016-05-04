package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.j;
import android.support.v7.widget.cf;
import android.view.MenuItem;
import android.view.Window.Callback;

final class az
  implements j
{
  private az(av paramav) {}
  
  public void a(i parami)
  {
    if (av.a(this.a) != null)
    {
      if (!av.c(this.a).i()) {
        break label41;
      }
      av.a(this.a).onPanelClosed(108, parami);
    }
    label41:
    while (!av.a(this.a).onPreparePanel(0, null, parami)) {
      return;
    }
    av.a(this.a).onMenuOpened(108, parami);
  }
  
  public boolean a(i parami, MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */