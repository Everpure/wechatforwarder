package android.support.v7.a;

import android.support.v7.view.b;
import android.support.v7.view.h;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;

class ab
  extends y
{
  ab(aa paramaa, Window.Callback paramCallback)
  {
    super(paramaa, paramCallback);
  }
  
  final ActionMode a(ActionMode.Callback paramCallback)
  {
    paramCallback = new h(this.b.a, paramCallback);
    b localb = this.b.b(paramCallback);
    if (localb != null) {
      return paramCallback.b(localb);
    }
    return null;
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    if (this.b.m()) {
      return a(paramCallback);
    }
    return super.onWindowStartingActionMode(paramCallback);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */