package a.a.a.f;

public class a
{
  private int a;
  private long b;
  private long c;
  private int d;
  private int e;
  private String f;
  private int g;
  private Throwable h;
  private boolean i;
  private boolean j;
  
  public a()
  {
    c();
    this.d = 0;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public void a(Throwable paramThrowable)
  {
    c();
    this.g = 2;
    this.h = paramThrowable;
  }
  
  public void b()
  {
    c();
    this.g = 0;
  }
  
  public void b(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.c += paramLong;
    if (this.b > 0L)
    {
      this.d = ((int)(this.c * 100L / this.b));
      if (this.d > 100) {
        this.d = 100;
      }
    }
    for (;;)
    {
      if (!this.j) {
        return;
      }
      try
      {
        Thread.sleep(150L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public void c()
  {
    this.e = -1;
    this.a = 0;
    this.f = null;
    this.b = 0L;
    this.c = 0L;
    this.d = 0;
  }
  
  public void c(int paramInt)
  {
    this.e = paramInt;
  }
  
  public boolean d()
  {
    return this.i;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */