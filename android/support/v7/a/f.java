package android.support.v7.a;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

class f
  implements View.OnClickListener
{
  f(e parame) {}
  
  public void onClick(View paramView)
  {
    if ((paramView == e.a(this.a)) && (e.b(this.a) != null)) {
      paramView = Message.obtain(e.b(this.a));
    }
    for (;;)
    {
      if (paramView != null) {
        paramView.sendToTarget();
      }
      e.h(this.a).obtainMessage(1, e.g(this.a)).sendToTarget();
      return;
      if ((paramView == e.c(this.a)) && (e.d(this.a) != null)) {
        paramView = Message.obtain(e.d(this.a));
      } else if ((paramView == e.e(this.a)) && (e.f(this.a) != null)) {
        paramView = Message.obtain(e.f(this.a));
      } else {
        paramView = null;
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */