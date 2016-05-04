package android.support.v4.h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
  extends q
  implements Map
{
  h a;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  private h b()
  {
    if (this.a == null) {
      this.a = new b(this);
    }
    return this.a;
  }
  
  public boolean a(Collection paramCollection)
  {
    return h.c(this, paramCollection);
  }
  
  public Set entrySet()
  {
    return b().d();
  }
  
  public Set keySet()
  {
    return b().e();
  }
  
  public void putAll(Map paramMap)
  {
    a(this.h + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection values()
  {
    return b().f();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */