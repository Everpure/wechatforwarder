package android.support.v4.b;

import android.os.Handler;
import android.os.Message;

class x
  extends Handler
{
  x(w paramw) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
    case 1: 
      do
      {
        return;
      } while (!this.a.e);
      this.a.a(false);
      return;
    }
    this.a.b();
    this.a.b.o();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */