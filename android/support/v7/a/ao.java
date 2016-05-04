package android.support.v7.a;

import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.support.v4.i.ea;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

class ao
  extends ea
{
  ao(an paraman) {}
  
  public void b(View paramView)
  {
    this.a.a.n.setVisibility(8);
    if (this.a.a.o != null) {
      this.a.a.o.dismiss();
    }
    for (;;)
    {
      this.a.a.n.removeAllViews();
      this.a.a.q.a(null);
      this.a.a.q = null;
      return;
      if ((this.a.a.n.getParent() instanceof View)) {
        bu.s((View)this.a.a.n.getParent());
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */