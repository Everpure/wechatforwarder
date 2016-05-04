package android.support.v7.widget;

class cp
{
  public fh a;
  public fh b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  private cp(fh paramfh1, fh paramfh2)
  {
    this.a = paramfh1;
    this.b = paramfh2;
  }
  
  private cp(fh paramfh1, fh paramfh2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramfh1, paramfh2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }
  
  public String toString()
  {
    return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */