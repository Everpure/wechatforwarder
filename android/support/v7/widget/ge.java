package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ge
{
  int[] a;
  List b;
  
  private void c(int paramInt1, int paramInt2)
  {
    if (this.b == null) {
      return;
    }
    int i = this.b.size() - 1;
    label20:
    gf localgf;
    if (i >= 0)
    {
      localgf = (gf)this.b.get(i);
      if (localgf.a >= paramInt1) {
        break label55;
      }
    }
    for (;;)
    {
      i -= 1;
      break label20;
      break;
      label55:
      if (localgf.a < paramInt1 + paramInt2) {
        this.b.remove(i);
      } else {
        localgf.a -= paramInt2;
      }
    }
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    if (this.b == null) {
      return;
    }
    int i = this.b.size() - 1;
    label20:
    gf localgf;
    if (i >= 0)
    {
      localgf = (gf)this.b.get(i);
      if (localgf.a >= paramInt1) {
        break label55;
      }
    }
    for (;;)
    {
      i -= 1;
      break label20;
      break;
      label55:
      localgf.a += paramInt2;
    }
  }
  
  private int g(int paramInt)
  {
    if (this.b == null) {
      return -1;
    }
    gf localgf = f(paramInt);
    if (localgf != null) {
      this.b.remove(localgf);
    }
    int j = this.b.size();
    int i = 0;
    if (i < j) {
      if (((gf)this.b.get(i)).a < paramInt) {}
    }
    for (;;)
    {
      if (i != -1)
      {
        localgf = (gf)this.b.get(i);
        this.b.remove(i);
        return localgf.a;
        i += 1;
        break;
      }
      return -1;
      i = -1;
    }
  }
  
  int a(int paramInt)
  {
    if (this.b != null)
    {
      int i = this.b.size() - 1;
      while (i >= 0)
      {
        if (((gf)this.b.get(i)).a >= paramInt) {
          this.b.remove(i);
        }
        i -= 1;
      }
    }
    return b(paramInt);
  }
  
  public gf a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      return (gf)localObject;
    }
    int j = this.b.size();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label117;
      }
      gf localgf = (gf)this.b.get(i);
      if (localgf.a >= paramInt2) {
        return null;
      }
      if (localgf.a >= paramInt1)
      {
        localObject = localgf;
        if (paramInt3 == 0) {
          break;
        }
        localObject = localgf;
        if (localgf.b == paramInt3) {
          break;
        }
        if (paramBoolean)
        {
          localObject = localgf;
          if (localgf.d) {
            break;
          }
        }
      }
      i += 1;
    }
    label117:
    return null;
  }
  
  void a()
  {
    if (this.a != null) {
      Arrays.fill(this.a, -1);
    }
    this.b = null;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length)) {
      return;
    }
    e(paramInt1 + paramInt2);
    System.arraycopy(this.a, paramInt1 + paramInt2, this.a, paramInt1, this.a.length - paramInt1 - paramInt2);
    Arrays.fill(this.a, this.a.length - paramInt2, this.a.length, -1);
    c(paramInt1, paramInt2);
  }
  
  void a(int paramInt, gj paramgj)
  {
    e(paramInt);
    this.a[paramInt] = paramgj.d;
  }
  
  public void a(gf paramgf)
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      gf localgf = (gf)this.b.get(i);
      if (localgf.a == paramgf.a) {
        this.b.remove(i);
      }
      if (localgf.a >= paramgf.a)
      {
        this.b.add(i, paramgf);
        return;
      }
      i += 1;
    }
    this.b.add(paramgf);
  }
  
  int b(int paramInt)
  {
    if (this.a == null) {}
    while (paramInt >= this.a.length) {
      return -1;
    }
    int i = g(paramInt);
    if (i == -1)
    {
      Arrays.fill(this.a, paramInt, this.a.length, -1);
      return this.a.length;
    }
    Arrays.fill(this.a, paramInt, i + 1, -1);
    return i + 1;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if ((this.a == null) || (paramInt1 >= this.a.length)) {
      return;
    }
    e(paramInt1 + paramInt2);
    System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt2, this.a.length - paramInt1 - paramInt2);
    Arrays.fill(this.a, paramInt1, paramInt1 + paramInt2, -1);
    d(paramInt1, paramInt2);
  }
  
  int c(int paramInt)
  {
    if ((this.a == null) || (paramInt >= this.a.length)) {
      return -1;
    }
    return this.a[paramInt];
  }
  
  int d(int paramInt)
  {
    int i = this.a.length;
    while (i <= paramInt) {
      i *= 2;
    }
    return i;
  }
  
  void e(int paramInt)
  {
    if (this.a == null)
    {
      this.a = new int[Math.max(paramInt, 10) + 1];
      Arrays.fill(this.a, -1);
    }
    while (paramInt < this.a.length) {
      return;
    }
    int[] arrayOfInt = this.a;
    this.a = new int[d(paramInt)];
    System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
    Arrays.fill(this.a, arrayOfInt.length, this.a.length, -1);
  }
  
  public gf f(int paramInt)
  {
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      return (gf)localObject;
    }
    int i = this.b.size() - 1;
    for (;;)
    {
      if (i < 0) {
        break label61;
      }
      gf localgf = (gf)this.b.get(i);
      localObject = localgf;
      if (localgf.a == paramInt) {
        break;
      }
      i -= 1;
    }
    label61:
    return null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */