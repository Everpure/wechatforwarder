package android.support.v4.h;

import java.util.Iterator;

final class i
  implements Iterator
{
  final int a;
  int b;
  int c;
  boolean d = false;
  
  i(h paramh, int paramInt)
  {
    this.a = paramInt;
    this.b = paramh.a();
  }
  
  public boolean hasNext()
  {
    return this.c < this.b;
  }
  
  public Object next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c += 1;
    this.d = true;
    return localObject;
  }
  
  public void remove()
  {
    if (!this.d) {
      throw new IllegalStateException();
    }
    this.c -= 1;
    this.b -= 1;
    this.d = false;
    this.e.a(this.c);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */