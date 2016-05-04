package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.support.v7.widget.cf;
import android.view.Window.Callback;

final class ay
  implements y
{
  private boolean b;
  
  private ay(av paramav) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    if (this.b) {
      return;
    }
    this.b = true;
    av.c(this.a).n();
    if (av.a(this.a) != null) {
      av.a(this.a).onPanelClosed(108, parami);
    }
    this.b = false;
  }
  
  public boolean a(i parami)
  {
    if (av.a(this.a) != null)
    {
      av.a(this.a).onMenuOpened(108, parami);
      return true;
    }
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */