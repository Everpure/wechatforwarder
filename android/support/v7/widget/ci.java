package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class ci
  implements Runnable
{
  ci(cg paramcg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      cp localcp = (cp)localIterator.next();
      cg.a(this.b, localcp);
    }
    this.a.clear();
    cg.b(this.b).remove(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */