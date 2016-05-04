package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class ch
  implements Runnable
{
  ch(cg paramcg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      cq localcq = (cq)localIterator.next();
      cg.a(this.b, localcq.a, localcq.b, localcq.c, localcq.d, localcq.e);
    }
    this.a.clear();
    cg.a(this.b).remove(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */