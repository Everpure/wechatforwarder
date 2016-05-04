package android.support.v7.a;

import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.support.v4.i.ea;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

class al
  extends ea
{
  al(ae paramae) {}
  
  public void a(View paramView)
  {
    this.a.n.setVisibility(0);
    this.a.n.sendAccessibilityEvent(32);
    if (this.a.n.getParent() != null) {
      bu.s((View)this.a.n.getParent());
    }
  }
  
  public void b(View paramView)
  {
    bu.c(this.a.n, 1.0F);
    this.a.q.a(null);
    this.a.q = null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */