package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

class bn
  implements Handler.Callback
{
  bn(bm parambm) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    bm.a(this.a, (bp)paramMessage.obj);
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */