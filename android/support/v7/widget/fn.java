package android.support.v7.widget;

class fn
{
  private int a = 0;
  private int b = 0;
  private int c = Integer.MIN_VALUE;
  private int d = Integer.MIN_VALUE;
  private int e = 0;
  private int f = 0;
  private boolean g = false;
  private boolean h = false;
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = true;
    if (this.g)
    {
      if (paramInt2 != Integer.MIN_VALUE) {
        this.a = paramInt2;
      }
      if (paramInt1 != Integer.MIN_VALUE) {
        this.b = paramInt1;
      }
    }
    do
    {
      return;
      if (paramInt1 != Integer.MIN_VALUE) {
        this.a = paramInt1;
      }
    } while (paramInt2 == Integer.MIN_VALUE);
    this.b = paramInt2;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean == this.g) {
      return;
    }
    this.g = paramBoolean;
    if (this.h)
    {
      if (paramBoolean)
      {
        if (this.d != Integer.MIN_VALUE)
        {
          i = this.d;
          this.a = i;
          if (this.c == Integer.MIN_VALUE) {
            break label72;
          }
        }
        label72:
        for (i = this.c;; i = this.f)
        {
          this.b = i;
          return;
          i = this.e;
          break;
        }
      }
      if (this.c != Integer.MIN_VALUE)
      {
        i = this.c;
        this.a = i;
        if (this.d == Integer.MIN_VALUE) {
          break label127;
        }
      }
      label127:
      for (int i = this.d;; i = this.f)
      {
        this.b = i;
        return;
        i = this.e;
        break;
      }
    }
    this.a = this.e;
    this.b = this.f;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.h = false;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      this.e = paramInt1;
      this.a = paramInt1;
    }
    if (paramInt2 != Integer.MIN_VALUE)
    {
      this.f = paramInt2;
      this.b = paramInt2;
    }
  }
  
  public int c()
  {
    if (this.g) {
      return this.b;
    }
    return this.a;
  }
  
  public int d()
  {
    if (this.g) {
      return this.a;
    }
    return this.b;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */