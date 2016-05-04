package android.support.v7.widget;

import java.util.List;

class dv
{
  final dw a;
  
  public dv(dw paramdw)
  {
    this.a = paramdw;
  }
  
  private void a(List paramList, int paramInt1, int paramInt2)
  {
    ak localak1 = (ak)paramList.get(paramInt1);
    ak localak2 = (ak)paramList.get(paramInt2);
    switch (localak2.a)
    {
    case 3: 
    default: 
      return;
    case 2: 
      a(paramList, paramInt1, localak1, paramInt2, localak2);
      return;
    case 1: 
      c(paramList, paramInt1, localak1, paramInt2, localak2);
      return;
    }
    b(paramList, paramInt1, localak1, paramInt2, localak2);
  }
  
  private int b(List paramList)
  {
    int i = 0;
    int j = paramList.size() - 1;
    if (j >= 0)
    {
      if (((ak)paramList.get(j)).a == 8)
      {
        if (i == 0) {
          break label50;
        }
        return j;
      }
      i = 1;
    }
    label50:
    for (;;)
    {
      j -= 1;
      break;
      return -1;
    }
  }
  
  private void c(List paramList, int paramInt1, ak paramak1, int paramInt2, ak paramak2)
  {
    int i = 0;
    if (paramak1.d < paramak2.b) {
      i = -1;
    }
    int j = i;
    if (paramak1.b < paramak2.b) {
      j = i + 1;
    }
    if (paramak2.b <= paramak1.b) {
      paramak1.b += paramak2.d;
    }
    if (paramak2.b <= paramak1.d) {
      paramak1.d += paramak2.d;
    }
    paramak2.b = (j + paramak2.b);
    paramList.set(paramInt1, paramak2);
    paramList.set(paramInt2, paramak1);
  }
  
  void a(List paramList)
  {
    for (;;)
    {
      int i = b(paramList);
      if (i == -1) {
        break;
      }
      a(paramList, i, i + 1);
    }
  }
  
  void a(List paramList, int paramInt1, ak paramak1, int paramInt2, ak paramak2)
  {
    int j = 0;
    int i;
    if (paramak1.b < paramak1.d)
    {
      if ((paramak2.b != paramak1.b) || (paramak2.d != paramak1.d - paramak1.b)) {
        break label623;
      }
      i = 1;
    }
    for (;;)
    {
      label70:
      ak localak;
      if (paramak1.d < paramak2.b)
      {
        paramak2.b -= 1;
        if (paramak1.b > paramak2.b) {
          break label241;
        }
        paramak2.b += 1;
        localak = null;
      }
      for (;;)
      {
        label97:
        if (i != 0)
        {
          paramList.set(paramInt1, paramak2);
          paramList.remove(paramInt2);
          this.a.a(paramak1);
        }
        label241:
        label596:
        label606:
        for (;;)
        {
          return;
          if ((paramak2.b != paramak1.d + 1) || (paramak2.d != paramak1.b - paramak1.d)) {
            break label614;
          }
          j = 1;
          i = 1;
          break;
          if (paramak1.d >= paramak2.b + paramak2.d) {
            break label70;
          }
          paramak2.d -= 1;
          paramak1.a = 2;
          paramak1.d = 1;
          if (paramak2.d == 0)
          {
            paramList.remove(paramInt2);
            this.a.a(paramak2);
            return;
            if (paramak1.b >= paramak2.b + paramak2.d) {
              break label608;
            }
            int k = paramak2.b;
            int m = paramak2.d;
            int n = paramak1.b;
            localak = this.a.a(2, paramak1.b + 1, k + m - n, null);
            paramak2.d = (paramak1.b - paramak2.b);
            break label97;
            if (j != 0)
            {
              if (localak != null)
              {
                if (paramak1.b > localak.b) {
                  paramak1.b -= localak.d;
                }
                if (paramak1.d > localak.b) {
                  paramak1.d -= localak.d;
                }
              }
              if (paramak1.b > paramak2.b) {
                paramak1.b -= paramak2.d;
              }
              if (paramak1.d > paramak2.b) {
                paramak1.d -= paramak2.d;
              }
              paramList.set(paramInt1, paramak2);
              if (paramak1.b == paramak1.d) {
                break label596;
              }
              paramList.set(paramInt2, paramak1);
            }
            for (;;)
            {
              if (localak == null) {
                break label606;
              }
              paramList.add(paramInt1, localak);
              return;
              if (localak != null)
              {
                if (paramak1.b >= localak.b) {
                  paramak1.b -= localak.d;
                }
                if (paramak1.d >= localak.b) {
                  paramak1.d -= localak.d;
                }
              }
              if (paramak1.b >= paramak2.b) {
                paramak1.b -= paramak2.d;
              }
              if (paramak1.d < paramak2.b) {
                break;
              }
              paramak1.d -= paramak2.d;
              break;
              paramList.remove(paramInt2);
            }
          }
        }
        label608:
        localak = null;
      }
      label614:
      i = 0;
      j = 1;
      continue;
      label623:
      i = 0;
    }
  }
  
  void b(List paramList, int paramInt1, ak paramak1, int paramInt2, ak paramak2)
  {
    Object localObject2 = null;
    Object localObject1;
    if (paramak1.d < paramak2.b)
    {
      paramak2.b -= 1;
      localObject1 = null;
    }
    for (;;)
    {
      if (paramak1.b <= paramak2.b)
      {
        paramak2.b += 1;
        label54:
        paramList.set(paramInt2, paramak1);
        if (paramak2.d <= 0) {
          break label243;
        }
        paramList.set(paramInt1, paramak2);
      }
      for (;;)
      {
        if (localObject1 != null) {
          paramList.add(paramInt1, localObject1);
        }
        if (localObject2 != null) {
          paramList.add(paramInt1, localObject2);
        }
        return;
        if (paramak1.d >= paramak2.b + paramak2.d) {
          break label265;
        }
        paramak2.d -= 1;
        localObject1 = this.a.a(4, paramak1.b, 1, paramak2.c);
        break;
        if (paramak1.b >= paramak2.b + paramak2.d) {
          break label54;
        }
        int i = paramak2.b + paramak2.d - paramak1.b;
        localObject2 = this.a.a(4, paramak1.b + 1, i, paramak2.c);
        paramak2.d -= i;
        break label54;
        label243:
        paramList.remove(paramInt1);
        this.a.a(paramak2);
      }
      label265:
      localObject1 = null;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */