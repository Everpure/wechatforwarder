package android.support.v7.widget;

import android.support.v4.h.o;
import android.support.v4.h.p;
import java.util.ArrayList;
import java.util.List;

class ai
  implements dw
{
  final ArrayList a = new ArrayList();
  final ArrayList b = new ArrayList();
  final aj c;
  Runnable d;
  final boolean e;
  final dv f;
  private o g = new p(30);
  private int h = 0;
  
  ai(aj paramaj)
  {
    this(paramaj, false);
  }
  
  ai(aj paramaj, boolean paramBoolean)
  {
    this.c = paramaj;
    this.e = paramBoolean;
    this.f = new dv(this);
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    int j = this.b.size() - 1;
    ak localak;
    if (j >= 0)
    {
      localak = (ak)this.b.get(j);
      int k;
      int i;
      if (localak.a == 8) {
        if (localak.b < localak.d)
        {
          k = localak.b;
          i = localak.d;
          label66:
          if ((paramInt1 < k) || (paramInt1 > i)) {
            break label201;
          }
          if (k != localak.b) {
            break label157;
          }
          if (paramInt2 != 1) {
            break label137;
          }
          localak.d += 1;
          label104:
          paramInt1 += 1;
          label108:
          i = paramInt1;
        }
      }
      for (;;)
      {
        j -= 1;
        paramInt1 = i;
        break;
        k = localak.d;
        i = localak.b;
        break label66;
        label137:
        if (paramInt2 != 2) {
          break label104;
        }
        localak.d -= 1;
        break label104;
        label157:
        if (paramInt2 == 1) {
          localak.b += 1;
        }
        for (;;)
        {
          paramInt1 -= 1;
          break;
          if (paramInt2 == 2) {
            localak.b -= 1;
          }
        }
        label201:
        if (paramInt1 < localak.b)
        {
          if (paramInt2 == 1)
          {
            localak.b += 1;
            localak.d += 1;
            break label108;
          }
          if (paramInt2 == 2)
          {
            localak.b -= 1;
            localak.d -= 1;
          }
        }
        break label108;
        if (localak.b <= paramInt1)
        {
          if (localak.a == 1)
          {
            i = paramInt1 - localak.d;
          }
          else
          {
            i = paramInt1;
            if (localak.a == 2) {
              i = paramInt1 + localak.d;
            }
          }
        }
        else if (paramInt2 == 1)
        {
          localak.b += 1;
          i = paramInt1;
        }
        else
        {
          i = paramInt1;
          if (paramInt2 == 2)
          {
            localak.b -= 1;
            i = paramInt1;
          }
        }
      }
    }
    paramInt2 = this.b.size() - 1;
    if (paramInt2 >= 0)
    {
      localak = (ak)this.b.get(paramInt2);
      if (localak.a == 8) {
        if ((localak.d == localak.b) || (localak.d < 0))
        {
          this.b.remove(paramInt2);
          a(localak);
        }
      }
      for (;;)
      {
        paramInt2 -= 1;
        break;
        if (localak.d <= 0)
        {
          this.b.remove(paramInt2);
          a(localak);
        }
      }
    }
    return paramInt1;
  }
  
  private void b(ak paramak)
  {
    g(paramak);
  }
  
  private void c(ak paramak)
  {
    int i2 = paramak.b;
    int k = paramak.b + paramak.d;
    int j = -1;
    int i = paramak.b;
    int n = 0;
    if (i < k) {
      if ((this.c.a(i) != null) || (d(i)))
      {
        if (j != 0) {
          break label216;
        }
        e(a(2, i2, n, null));
      }
    }
    label97:
    label211:
    label216:
    for (int m = 1;; m = 0)
    {
      j = 1;
      if (m != 0)
      {
        m = i - n;
        i = k - n;
        k = 1;
        n = k;
        k = i;
        i = m + 1;
        break;
        if (j != 1) {
          break label211;
        }
        g(a(2, i2, n, null));
      }
      for (j = 1;; j = 0)
      {
        int i1 = 0;
        m = j;
        j = i1;
        break;
        n += 1;
        m = i;
        i = k;
        k = n;
        break label97;
        ak localak = paramak;
        if (n != paramak.d)
        {
          a(paramak);
          localak = a(2, i2, n, null);
        }
        if (j == 0)
        {
          e(localak);
          return;
        }
        g(localak);
        return;
      }
    }
  }
  
  private void d(ak paramak)
  {
    int k = paramak.b;
    int i2 = paramak.b;
    int i3 = paramak.d;
    int i = paramak.b;
    int i1 = -1;
    int j = 0;
    if (i < i2 + i3)
    {
      int m;
      int n;
      if ((this.c.a(i) != null) || (d(i)))
      {
        m = j;
        n = k;
        if (i1 == 0)
        {
          e(a(4, k, j, paramak.c));
          m = 0;
          n = i;
        }
        k = n;
      }
      for (j = 1;; j = 0)
      {
        i += 1;
        m += 1;
        i1 = j;
        j = m;
        break;
        m = j;
        n = k;
        if (i1 == 1)
        {
          g(a(4, k, j, paramak.c));
          m = 0;
          n = i;
        }
        k = n;
      }
    }
    Object localObject = paramak;
    if (j != paramak.d)
    {
      localObject = paramak.c;
      a(paramak);
      localObject = a(4, k, j, localObject);
    }
    if (i1 == 0)
    {
      e((ak)localObject);
      return;
    }
    g((ak)localObject);
  }
  
  private boolean d(int paramInt)
  {
    int k = this.b.size();
    int i = 0;
    while (i < k)
    {
      ak localak = (ak)this.b.get(i);
      if (localak.a == 8)
      {
        if (a(localak.d, i + 1) == paramInt) {
          return true;
        }
      }
      else if (localak.a == 1)
      {
        int m = localak.b;
        int n = localak.d;
        int j = localak.b;
        while (j < m + n)
        {
          if (a(j, i + 1) == paramInt) {
            return true;
          }
          j += 1;
        }
      }
      i += 1;
    }
    return false;
  }
  
  private void e(ak paramak)
  {
    if ((paramak.a == 1) || (paramak.a == 8)) {
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    int i1 = b(paramak.b, paramak.a);
    int j = paramak.b;
    int k;
    int n;
    int m;
    label112:
    int i2;
    switch (paramak.a)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("op should be remove or update." + paramak);
    case 4: 
      k = 1;
      n = 1;
      m = 1;
      if (m >= paramak.d) {
        break label298;
      }
      i2 = b(paramak.b + k * m, paramak.a);
      switch (paramak.a)
      {
      case 3: 
      default: 
        i = 0;
        label174:
        if (i == 0) {}
        break;
      }
      break;
    }
    for (int i = n + 1;; i = n)
    {
      m += 1;
      n = i;
      break label112;
      k = 0;
      break;
      if (i2 == i1 + 1)
      {
        i = 1;
        break label174;
      }
      i = 0;
      break label174;
      if (i2 == i1)
      {
        i = 1;
        break label174;
      }
      i = 0;
      break label174;
      localObject = a(paramak.a, i1, n, paramak.c);
      a((ak)localObject, j);
      a((ak)localObject);
      i = j;
      if (paramak.a == 4) {
        i = j + n;
      }
      n = 1;
      i1 = i2;
      j = i;
    }
    label298:
    Object localObject = paramak.c;
    a(paramak);
    if (n > 0)
    {
      paramak = a(paramak.a, i1, n, localObject);
      a(paramak, j);
      a(paramak);
    }
  }
  
  private void f(ak paramak)
  {
    g(paramak);
  }
  
  private void g(ak paramak)
  {
    this.b.add(paramak);
    switch (paramak.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new IllegalArgumentException("Unknown update op type for " + paramak);
    case 1: 
      this.c.c(paramak.b, paramak.d);
      return;
    case 8: 
      this.c.d(paramak.b, paramak.d);
      return;
    case 2: 
      this.c.b(paramak.b, paramak.d);
      return;
    }
    this.c.a(paramak.b, paramak.d, paramak.c);
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int k = this.b.size();
    int j = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = paramInt2;
    ak localak;
    if (j < k)
    {
      localak = (ak)this.b.get(j);
      if (localak.a == 8) {
        if (localak.b == paramInt2) {
          paramInt1 = localak.d;
        }
      }
    }
    for (;;)
    {
      j += 1;
      paramInt2 = paramInt1;
      break;
      int i = paramInt2;
      if (localak.b < paramInt2) {
        i = paramInt2 - 1;
      }
      paramInt1 = i;
      if (localak.d <= i)
      {
        paramInt1 = i + 1;
        continue;
        paramInt1 = paramInt2;
        if (localak.b <= paramInt2) {
          if (localak.a == 2)
          {
            if (paramInt2 < localak.b + localak.d)
            {
              paramInt1 = -1;
              return paramInt1;
            }
            paramInt1 = paramInt2 - localak.d;
          }
          else
          {
            paramInt1 = paramInt2;
            if (localak.a == 1) {
              paramInt1 = paramInt2 + localak.d;
            }
          }
        }
      }
    }
  }
  
  public ak a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    ak localak = (ak)this.g.a();
    if (localak == null) {
      return new ak(paramInt1, paramInt2, paramInt3, paramObject);
    }
    localak.a = paramInt1;
    localak.b = paramInt2;
    localak.d = paramInt3;
    localak.c = paramObject;
    return localak;
  }
  
  void a()
  {
    a(this.a);
    a(this.b);
    this.h = 0;
  }
  
  public void a(ak paramak)
  {
    if (!this.e)
    {
      paramak.c = null;
      this.g.a(paramak);
    }
  }
  
  void a(ak paramak, int paramInt)
  {
    this.c.a(paramak);
    switch (paramak.a)
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 2: 
      this.c.a(paramInt, paramak.d);
      return;
    }
    this.c.a(paramInt, paramak.d, paramak.c);
  }
  
  void a(List paramList)
  {
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      a((ak)paramList.get(i));
      i += 1;
    }
    paramList.clear();
  }
  
  boolean a(int paramInt)
  {
    return (this.h & paramInt) != 0;
  }
  
  int b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  void b()
  {
    this.f.a(this.a);
    int j = this.a.size();
    int i = 0;
    if (i < j)
    {
      ak localak = (ak)this.a.get(i);
      switch (localak.a)
      {
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.run();
        }
        i += 1;
        break;
        f(localak);
        continue;
        c(localak);
        continue;
        d(localak);
        continue;
        b(localak);
      }
    }
    this.a.clear();
  }
  
  public int c(int paramInt)
  {
    int m = this.a.size();
    int k = 0;
    int i = paramInt;
    paramInt = i;
    ak localak;
    if (k < m)
    {
      localak = (ak)this.a.get(k);
      switch (localak.a)
      {
      default: 
        paramInt = i;
      }
    }
    for (;;)
    {
      k += 1;
      i = paramInt;
      break;
      paramInt = i;
      if (localak.b <= i)
      {
        paramInt = i + localak.d;
        continue;
        paramInt = i;
        if (localak.b <= i)
        {
          if (localak.b + localak.d > i)
          {
            paramInt = -1;
            return paramInt;
          }
          paramInt = i - localak.d;
          continue;
          if (localak.b == i)
          {
            paramInt = localak.d;
          }
          else
          {
            int j = i;
            if (localak.b < i) {
              j = i - 1;
            }
            paramInt = j;
            if (localak.d <= j) {
              paramInt = j + 1;
            }
          }
        }
      }
    }
  }
  
  void c()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      this.c.b((ak)this.b.get(i));
      i += 1;
    }
    a(this.b);
    this.h = 0;
  }
  
  boolean d()
  {
    return this.a.size() > 0;
  }
  
  void e()
  {
    c();
    int j = this.a.size();
    int i = 0;
    if (i < j)
    {
      ak localak = (ak)this.a.get(i);
      switch (localak.a)
      {
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.run();
        }
        i += 1;
        break;
        this.c.b(localak);
        this.c.c(localak.b, localak.d);
        continue;
        this.c.b(localak);
        this.c.a(localak.b, localak.d);
        continue;
        this.c.b(localak);
        this.c.a(localak.b, localak.d, localak.c);
        continue;
        this.c.b(localak);
        this.c.d(localak.b, localak.d);
      }
    }
    a(this.a);
    this.h = 0;
  }
  
  boolean f()
  {
    return (!this.b.isEmpty()) && (!this.a.isEmpty());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */