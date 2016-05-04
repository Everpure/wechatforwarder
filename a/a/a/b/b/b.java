package a.a.a.b.b;

public class b
{
  private static final int[] b = new int['Ā'];
  private final int[] a = new int[3];
  
  static
  {
    int i = 0;
    int k;
    int j;
    for (;;)
    {
      if (i >= 256) {
        return;
      }
      k = 0;
      j = i;
      if (k < 8) {
        break;
      }
      b[i] = j;
      i += 1;
    }
    if ((j & 0x1) == 1) {
      j = j >>> 1 ^ 0xEDB88320;
    }
    for (;;)
    {
      k += 1;
      break;
      j >>>= 1;
    }
  }
  
  private int a(int paramInt, byte paramByte)
  {
    return paramInt >>> 8 ^ b[((paramInt ^ paramByte) & 0xFF)];
  }
  
  public byte a()
  {
    int i = this.a[2] | 0x2;
    return (byte)(i * (i ^ 0x1) >>> 8);
  }
  
  public void a(byte paramByte)
  {
    this.a[0] = a(this.a[0], paramByte);
    int[] arrayOfInt = this.a;
    arrayOfInt[1] += (this.a[0] & 0xFF);
    this.a[1] = (this.a[1] * 134775813 + 1);
    this.a[2] = a(this.a[2], (byte)(this.a[1] >> 24));
  }
  
  public void a(char[] paramArrayOfChar)
  {
    int i = 0;
    this.a[0] = 305419896;
    this.a[1] = 591751049;
    this.a[2] = 878082192;
    for (;;)
    {
      if (i >= paramArrayOfChar.length) {
        return;
      }
      a((byte)(paramArrayOfChar[i] & 0xFF));
      i += 1;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/b/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */