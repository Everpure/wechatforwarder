package android.support.v7.widget;

import android.view.View;

class di
  implements Runnable
{
  di(dg paramdg) {}
  
  public void run()
  {
    View localView = this.a.e();
    if ((localView != null) && (localView.getWindowToken() != null)) {
      this.a.c();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */