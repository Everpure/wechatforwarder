package android.support.v4.i;

import android.view.View;
import java.lang.ref.WeakReference;

class dl
  implements Runnable
{
  WeakReference a;
  di b;
  
  private dl(dk paramdk, di paramdi, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramdi;
  }
  
  public void run()
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      dk.a(this.c, this.b, localView);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */