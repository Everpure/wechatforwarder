package android.support.v4.h;

import java.util.Iterator;
import java.util.Map.Entry;

final class l
  implements Iterator, Map.Entry
{
  int a;
  int b;
  boolean c = false;
  
  l(h paramh)
  {
    this.a = (paramh.a() - 1);
    this.b = -1;
  }
  
  public Map.Entry a()
  {
    this.b += 1;
    this.c = true;
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    if ((c.a(((Map.Entry)paramObject).getKey(), this.d.a(this.b, 0))) && (c.a(((Map.Entry)paramObject).getValue(), this.d.a(this.b, 1)))) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public Object getKey()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, 0);
  }
  
  public Object getValue()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, 1);
  }
  
  public boolean hasNext()
  {
    return this.b < this.a;
  }
  
  public final int hashCode()
  {
    int j = 0;
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    Object localObject1 = this.d.a(this.b, 0);
    Object localObject2 = this.d.a(this.b, 1);
    int i;
    if (localObject1 == null)
    {
      i = 0;
      if (localObject2 != null) {
        break label69;
      }
    }
    for (;;)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69:
      j = localObject2.hashCode();
    }
  }
  
  public void remove()
  {
    if (!this.c) {
      throw new IllegalStateException();
    }
    this.d.a(this.b);
    this.b -= 1;
    this.a -= 1;
    this.c = false;
  }
  
  public Object setValue(Object paramObject)
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, paramObject);
  }
  
  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/h/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */