package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class cj
  implements Runnable
{
  cj(cg paramcg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      fh localfh = (fh)localIterator.next();
      cg.a(this.b, localfh);
    }
    this.a.clear();
    cg.c(this.b).remove(this.a);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */