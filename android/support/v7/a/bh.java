package android.support.v7.a;

import android.support.v4.i.bu;
import android.support.v4.i.ea;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

class bh
  extends ea
{
  bh(bg parambg) {}
  
  public void b(View paramView)
  {
    if ((bg.a(this.a)) && (bg.b(this.a) != null))
    {
      bu.b(bg.b(this.a), 0.0F);
      bu.b(bg.c(this.a), 0.0F);
    }
    bg.c(this.a).setVisibility(8);
    bg.c(this.a).setTransitioning(false);
    bg.a(this.a, null);
    this.a.i();
    if (bg.d(this.a) != null) {
      bu.s(bg.d(this.a));
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */