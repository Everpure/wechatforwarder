package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

class dq
  implements AbsListView.OnScrollListener
{
  private dq(dg paramdg) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.l()) && (dg.b(this.a).getContentView() != null))
    {
      dg.d(this.a).removeCallbacks(dg.c(this.a));
      dg.c(this.a).run();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */