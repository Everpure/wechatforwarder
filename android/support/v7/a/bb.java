package android.support.v7.a;

import android.support.v7.view.n;
import android.support.v7.widget.cf;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class bb
  extends n
{
  public bb(av paramav, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    switch (paramInt)
    {
    }
    Menu localMenu;
    do
    {
      return super.onCreatePanelView(paramInt);
      localMenu = av.c(this.a).r();
    } while ((!onPreparePanel(paramInt, null, localMenu)) || (!onMenuOpened(paramInt, localMenu)));
    return av.a(this.a, localMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
    if ((bool) && (!av.b(this.a)))
    {
      av.c(this.a).m();
      av.a(this.a, true);
    }
    return bool;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */