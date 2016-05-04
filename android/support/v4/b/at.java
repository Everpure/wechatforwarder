package android.support.v4.b;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class at
  implements ViewTreeObserver.OnPreDrawListener
{
  at(View paramView1, Transition paramTransition, View paramView2, ax paramax, Map paramMap1, Map paramMap2, ArrayList paramArrayList) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null) {
      this.b.removeTarget(this.c);
    }
    View localView = this.d.a();
    if (localView != null)
    {
      if (!this.e.isEmpty())
      {
        ar.a(this.f, localView);
        this.f.keySet().retainAll(this.e.values());
        Iterator localIterator = this.e.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          Object localObject = (String)localEntry.getValue();
          localObject = (View)this.f.get(localObject);
          if (localObject != null) {
            ((View)localObject).setTransitionName((String)localEntry.getKey());
          }
        }
      }
      if (this.b != null)
      {
        ar.a(this.g, localView);
        this.g.removeAll(this.f.values());
        this.g.add(this.c);
        ar.b(this.b, this.g);
      }
    }
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */