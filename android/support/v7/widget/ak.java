package android.support.v7.widget;

class ak
{
  int a;
  int b;
  Object c;
  int d;
  
  ak(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramInt3;
    this.c = paramObject;
  }
  
  String a()
  {
    switch (this.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      return "??";
    case 1: 
      return "add";
    case 2: 
      return "rm";
    case 4: 
      return "up";
    }
    return "mv";
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        do
        {
          return true;
          if ((paramObject == null) || (getClass() != paramObject.getClass())) {
            return false;
          }
          paramObject = (ak)paramObject;
          if (this.a != ((ak)paramObject).a) {
            return false;
          }
        } while ((this.a == 8) && (Math.abs(this.d - this.b) == 1) && (this.d == ((ak)paramObject).b) && (this.b == ((ak)paramObject).d));
        if (this.d != ((ak)paramObject).d) {
          return false;
        }
        if (this.b != ((ak)paramObject).b) {
          return false;
        }
        if (this.c == null) {
          break;
        }
      } while (this.c.equals(((ak)paramObject).c));
      return false;
    } while (((ak)paramObject).c == null);
    return false;
  }
  
  public int hashCode()
  {
    return (this.a * 31 + this.b) * 31 + this.d;
  }
  
  public String toString()
  {
    return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */