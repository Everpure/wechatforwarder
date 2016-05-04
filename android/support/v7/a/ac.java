package android.support.v7.a;

import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class ac
  extends aa
{
  ac(Context paramContext, Window paramWindow, v paramv)
  {
    super(paramContext, paramWindow, paramv);
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new ad(this, paramCallback);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */