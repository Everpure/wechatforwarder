package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.d;
import android.support.v7.view.menu.ad;
import android.support.v7.view.menu.i;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.x;
import android.view.View;
import android.widget.ImageButton;

class gv
  implements x
{
  i a;
  m b;
  
  private gv(Toolbar paramToolbar) {}
  
  public void a(Context paramContext, i parami)
  {
    if ((this.a != null) && (this.b != null)) {
      this.a.d(this.b);
    }
    this.a = parami;
  }
  
  public void a(i parami, boolean paramBoolean) {}
  
  public boolean a(ad paramad)
  {
    return false;
  }
  
  public boolean a(i parami, m paramm)
  {
    Toolbar.b(this.c);
    if (Toolbar.c(this.c).getParent() != this.c) {
      this.c.addView(Toolbar.c(this.c));
    }
    this.c.a = paramm.getActionView();
    this.b = paramm;
    if (this.c.a.getParent() != this.c)
    {
      parami = this.c.i();
      parami.a = (0x800003 | Toolbar.d(this.c) & 0x70);
      parami.b = 2;
      this.c.a.setLayoutParams(parami);
      this.c.addView(this.c.a);
    }
    this.c.j();
    this.c.requestLayout();
    paramm.e(true);
    if ((this.c.a instanceof d)) {
      ((d)this.c.a).a();
    }
    return true;
  }
  
  public void b(boolean paramBoolean)
  {
    int k = 0;
    int j;
    int m;
    int i;
    if (this.b != null)
    {
      j = k;
      if (this.a != null)
      {
        m = this.a.size();
        i = 0;
      }
    }
    for (;;)
    {
      j = k;
      if (i < m)
      {
        if (this.a.getItem(i) == this.b) {
          j = 1;
        }
      }
      else
      {
        if (j == 0) {
          b(this.a, this.b);
        }
        return;
      }
      i += 1;
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean b(i parami, m paramm)
  {
    if ((this.c.a instanceof d)) {
      ((d)this.c.a).b();
    }
    this.c.removeView(this.c.a);
    this.c.removeView(Toolbar.c(this.c));
    this.c.a = null;
    this.c.k();
    this.b = null;
    this.c.requestLayout();
    paramm.e(false);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */