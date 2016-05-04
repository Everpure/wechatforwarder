package android.support.v7.widget;

class ef
  implements aj
{
  ef(RecyclerView paramRecyclerView) {}
  
  public fh a(int paramInt)
  {
    fh localfh = this.a.a(paramInt, true);
    if (localfh == null) {}
    while (this.a.c.c(localfh.a)) {
      return null;
    }
    return localfh;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, true);
    this.a.h = true;
    fe.a(this.a.g, paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a.a(paramInt1, paramInt2, paramObject);
    this.a.i = true;
  }
  
  public void a(ak paramak)
  {
    c(paramak);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
    this.a.h = true;
  }
  
  public void b(ak paramak)
  {
    c(paramak);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.a.f(paramInt1, paramInt2);
    this.a.h = true;
  }
  
  void c(ak paramak)
  {
    switch (paramak.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      return;
    case 1: 
      this.a.e.a(this.a, paramak.b, paramak.d);
      return;
    case 2: 
      this.a.e.b(this.a, paramak.b, paramak.d);
      return;
    case 4: 
      this.a.e.a(this.a, paramak.b, paramak.d, paramak.c);
      return;
    }
    this.a.e.a(this.a, paramak.b, paramak.d, 1);
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    this.a.e(paramInt1, paramInt2);
    this.a.h = true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */