package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

class dr
  implements View.OnTouchListener
{
  private dr(dg paramdg) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (dg.b(this.a) != null) && (dg.b(this.a).isShowing()) && (j >= 0) && (j < dg.b(this.a).getWidth()) && (k >= 0) && (k < dg.b(this.a).getHeight())) {
      dg.d(this.a).postDelayed(dg.c(this.a), 250L);
    }
    for (;;)
    {
      return false;
      if (i == 1) {
        dg.d(this.a).removeCallbacks(dg.c(this.a));
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */