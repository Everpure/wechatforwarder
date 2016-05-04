package com.fkzhang.wechatforwarder.a;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.fkzhang.wechatforwarder.c.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class f
  extends Filter
{
  f(d paramd) {}
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    ArrayList localArrayList = new ArrayList();
    if (d.b(this.a) == null) {
      d.a(this.a, d.c(this.a));
    }
    if (paramCharSequence != null)
    {
      if ((d.b(this.a) != null) && (d.b(this.a).size() > 0))
      {
        Iterator localIterator = d.b(this.a).iterator();
        while (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          if (locala.b().toLowerCase().contains(paramCharSequence.toString())) {
            localArrayList.add(locala);
          }
        }
      }
      localFilterResults.values = localArrayList;
    }
    return localFilterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    d.b(this.a, (ArrayList)paramFilterResults.values);
    d.a(this.a, new boolean[d.c(this.a).size()]);
    int i = 0;
    while (i < d.c(this.a).size())
    {
      if (d.d(this.a).contains(((a)d.c(this.a).get(i)).a())) {
        this.a.a(i, true);
      }
      i += 1;
    }
    this.a.notifyDataSetChanged();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */