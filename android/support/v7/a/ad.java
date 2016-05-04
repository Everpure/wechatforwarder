package android.support.v7.a;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;

class ad
  extends ab
{
  ad(ac paramac, Window.Callback paramCallback)
  {
    super(paramac, paramCallback);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    if (this.c.m()) {}
    switch (paramInt)
    {
    default: 
      return super.onWindowStartingActionMode(paramCallback, paramInt);
    }
    return a(paramCallback);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */