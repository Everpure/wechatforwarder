package android.support.v7.widget;

import android.support.v4.h.a;
import android.support.v4.h.f;

class hd
{
  final a a = new a();
  final f b = new f();
  
  private en a(fh paramfh, int paramInt)
  {
    Object localObject2 = null;
    int i = this.a.a(paramfh);
    Object localObject1;
    if (i < 0) {
      localObject1 = localObject2;
    }
    he localhe;
    do
    {
      do
      {
        return (en)localObject1;
        localhe = (he)this.a.c(i);
        localObject1 = localObject2;
      } while (localhe == null);
      localObject1 = localObject2;
    } while ((localhe.a & paramInt) == 0);
    localhe.a &= (paramInt ^ 0xFFFFFFFF);
    if (paramInt == 4) {}
    for (paramfh = localhe.b;; paramfh = localhe.c)
    {
      localObject1 = paramfh;
      if ((localhe.a & 0xC) != 0) {
        break;
      }
      this.a.d(i);
      he.a(localhe);
      return paramfh;
      if (paramInt != 8) {
        break label129;
      }
    }
    label129:
    throw new IllegalArgumentException("Must provide flag PRE or POST");
  }
  
  fh a(long paramLong)
  {
    return (fh)this.b.a(paramLong);
  }
  
  void a()
  {
    this.a.clear();
    this.b.c();
  }
  
  void a(long paramLong, fh paramfh)
  {
    this.b.b(paramLong, paramfh);
  }
  
  void a(fh paramfh, en paramen)
  {
    he localhe2 = (he)this.a.get(paramfh);
    he localhe1 = localhe2;
    if (localhe2 == null)
    {
      localhe1 = he.a();
      this.a.put(paramfh, localhe1);
    }
    localhe1.b = paramen;
    localhe1.a |= 0x4;
  }
  
  void a(hf paramhf)
  {
    int i = this.a.size() - 1;
    if (i >= 0)
    {
      fh localfh = (fh)this.a.b(i);
      he localhe = (he)this.a.d(i);
      if ((localhe.a & 0x3) == 3) {
        paramhf.a(localfh);
      }
      for (;;)
      {
        he.a(localhe);
        i -= 1;
        break;
        if ((localhe.a & 0x1) != 0)
        {
          if (localhe.b == null) {
            paramhf.a(localfh);
          } else {
            paramhf.a(localfh, localhe.b, localhe.c);
          }
        }
        else if ((localhe.a & 0xE) == 14) {
          paramhf.b(localfh, localhe.b, localhe.c);
        } else if ((localhe.a & 0xC) == 12) {
          paramhf.c(localfh, localhe.b, localhe.c);
        } else if ((localhe.a & 0x4) != 0) {
          paramhf.a(localfh, localhe.b, null);
        } else if ((localhe.a & 0x8) != 0) {
          paramhf.b(localfh, localhe.b, localhe.c);
        } else if ((localhe.a & 0x2) == 0) {}
      }
    }
  }
  
  boolean a(fh paramfh)
  {
    paramfh = (he)this.a.get(paramfh);
    return (paramfh != null) && ((paramfh.a & 0x1) != 0);
  }
  
  en b(fh paramfh)
  {
    return a(paramfh, 4);
  }
  
  void b() {}
  
  void b(fh paramfh, en paramen)
  {
    he localhe2 = (he)this.a.get(paramfh);
    he localhe1 = localhe2;
    if (localhe2 == null)
    {
      localhe1 = he.a();
      this.a.put(paramfh, localhe1);
    }
    localhe1.a |= 0x2;
    localhe1.b = paramen;
  }
  
  en c(fh paramfh)
  {
    return a(paramfh, 8);
  }
  
  void c(fh paramfh, en paramen)
  {
    he localhe2 = (he)this.a.get(paramfh);
    he localhe1 = localhe2;
    if (localhe2 == null)
    {
      localhe1 = he.a();
      this.a.put(paramfh, localhe1);
    }
    localhe1.c = paramen;
    localhe1.a |= 0x8;
  }
  
  boolean d(fh paramfh)
  {
    paramfh = (he)this.a.get(paramfh);
    return (paramfh != null) && ((paramfh.a & 0x4) != 0);
  }
  
  void e(fh paramfh)
  {
    he localhe2 = (he)this.a.get(paramfh);
    he localhe1 = localhe2;
    if (localhe2 == null)
    {
      localhe1 = he.a();
      this.a.put(paramfh, localhe1);
    }
    localhe1.a |= 0x1;
  }
  
  void f(fh paramfh)
  {
    paramfh = (he)this.a.get(paramfh);
    if (paramfh == null) {
      return;
    }
    paramfh.a &= 0xFFFFFFFE;
  }
  
  void g(fh paramfh)
  {
    int i = this.b.b() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (paramfh == this.b.c(i)) {
          this.b.a(i);
        }
      }
      else
      {
        paramfh = (he)this.a.remove(paramfh);
        if (paramfh != null) {
          he.a(paramfh);
        }
        return;
      }
      i -= 1;
    }
  }
  
  public void h(fh paramfh)
  {
    f(paramfh);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */