package android.support.v7.a;

import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

class an
  implements c
{
  private c b;
  
  public an(ae paramae, c paramc)
  {
    this.b = paramc;
  }
  
  public void a(b paramb)
  {
    this.b.a(paramb);
    if (this.a.o != null) {
      this.a.b.getDecorView().removeCallbacks(this.a.p);
    }
    if (this.a.n != null)
    {
      ae.c(this.a);
      this.a.q = bu.q(this.a.n).a(0.0F);
      this.a.q.a(new ao(this));
    }
    if (this.a.e != null) {
      this.a.e.b(this.a.m);
    }
    this.a.m = null;
  }
  
  public boolean a(b paramb, Menu paramMenu)
  {
    return this.b.a(paramb, paramMenu);
  }
  
  public boolean a(b paramb, MenuItem paramMenuItem)
  {
    return this.b.a(paramb, paramMenuItem);
  }
  
  public boolean b(b paramb, Menu paramMenu)
  {
    return this.b.b(paramb, paramMenu);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */