package android.support.v4.h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class k
  implements Set
{
  k(h paramh) {}
  
  public boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public void clear()
  {
    this.a.c();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.a.a(paramObject) >= 0;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return h.a(this.a.b(), paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    return h.a(this, paramObject);
  }
  
  public int hashCode()
  {
    int i = this.a.a() - 1;
    int j = 0;
    if (i >= 0)
    {
      Object localObject = this.a.a(i, 0);
      if (localObject == null) {}
      for (int k = 0;; k = localObject.hashCode())
      {
        j += k;
        i -= 1;
        break;
      }
    }
    return j;
  }
  
  public boolean isEmpty()
  {
    return this.a.a() == 0;
  }
  
  public Iterator iterator()
  {
    return new i(this.a, 0);
  }
  
  public boolean remove(Object paramObject)
  {
    int i = this.a.a(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return h.b(this.a.b(), paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return h.c(this.a.b(), paramCollection);
  }
  
  public int size()
  {
    return this.a.a();
  }
  
  public Object[] toArray()
  {
    return this.a.b(0);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 0);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/h/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */