package android.support.v4.h;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class g
{
  private final LinkedHashMap a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  public g(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    this.c = paramInt;
    this.a = new LinkedHashMap(0, 0.75F, true);
  }
  
  private int c(Object paramObject1, Object paramObject2)
  {
    int i = b(paramObject1, paramObject2);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramObject1 + "=" + paramObject2);
    }
    return i;
  }
  
  public final Object a(Object paramObject)
  {
    if (paramObject == null) {
      throw new NullPointerException("key == null");
    }
    Object localObject1;
    try
    {
      localObject1 = this.a.get(paramObject);
      if (localObject1 != null)
      {
        this.g += 1;
        return localObject1;
      }
      this.h += 1;
      localObject1 = b(paramObject);
      if (localObject1 == null) {
        return null;
      }
    }
    finally {}
    try
    {
      this.e += 1;
      Object localObject2 = this.a.put(paramObject, localObject1);
      if (localObject2 != null) {
        this.a.put(paramObject, localObject2);
      }
      for (;;)
      {
        if (localObject2 == null) {
          break;
        }
        a(false, paramObject, localObject1, localObject2);
        return localObject2;
        this.b += c(paramObject, localObject1);
      }
      a(this.c);
    }
    finally {}
    return localObject1;
  }
  
  public final Object a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.d += 1;
      this.b += c(paramObject1, paramObject2);
      Object localObject = this.a.put(paramObject1, paramObject2);
      if (localObject != null) {
        this.b -= c(paramObject1, localObject);
      }
      if (localObject != null) {
        a(false, paramObject1, localObject, paramObject2);
      }
      a(this.c);
      return localObject;
    }
    finally {}
  }
  
  public void a(int paramInt)
  {
    Object localObject3;
    Object localObject2;
    try
    {
      if ((this.b < 0) || ((this.a.isEmpty()) && (this.b != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((this.b <= paramInt) || (this.a.isEmpty())) {
        return;
      }
      localObject3 = (Map.Entry)this.a.entrySet().iterator().next();
      localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      this.a.remove(localObject2);
      this.b -= c(localObject2, localObject3);
      this.f += 1;
    }
  }
  
  protected void a(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  protected int b(Object paramObject1, Object paramObject2)
  {
    return 1;
  }
  
  protected Object b(Object paramObject)
  {
    return null;
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.g + this.h;
      if (j != 0) {
        i = this.g * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */