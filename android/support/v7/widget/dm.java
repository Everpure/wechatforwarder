package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

class dm
  implements Runnable
{
  private dm(dl paramdl) {}
  
  public void run()
  {
    dl.a(this.a).getParent().requestDisallowInterceptTouchEvent(true);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */