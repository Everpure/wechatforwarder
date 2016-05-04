package android.support.a.a;

import android.graphics.Path;

class q
{
  protected i[] m = null;
  String n;
  int o;
  
  public q() {}
  
  public q(q paramq)
  {
    this.n = paramq.n;
    this.o = paramq.o;
    this.m = f.a(paramq.m);
  }
  
  public void a(Path paramPath)
  {
    paramPath.reset();
    if (this.m != null) {
      i.a(this.m, paramPath);
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public String b()
  {
    return this.n;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */