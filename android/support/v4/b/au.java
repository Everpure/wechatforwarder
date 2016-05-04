package android.support.v4.b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class au
  extends Transition.EpicenterCallback
{
  private Rect b;
  
  au(aw paramaw) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    if ((this.b == null) && (this.a.a != null)) {
      this.b = ar.b(this.a.a);
    }
    return this.b;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */