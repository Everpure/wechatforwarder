package a.a.a.b.a;

public class b
{
  protected c a;
  protected d b;
  
  public b()
  {
    this.a = null;
    this.b = null;
  }
  
  public b(c paramc)
  {
    this.a = paramc;
    this.b = null;
  }
  
  protected int a(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (paramInt1 % paramInt2 > 0) {
      i = 1;
    }
    return i + paramInt1 / paramInt2;
  }
  
  protected void a(byte[] paramArrayOfByte)
  {
    if (this.b == null) {
      this.b = new a(this.a.c());
    }
    this.b.b(paramArrayOfByte);
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 / 16777216));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 / 65536));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 / 256));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)paramInt2);
  }
  
  protected void a(byte[] paramArrayOfByte1, int paramInt1, d paramd, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    int i = paramd.b();
    byte[] arrayOfByte2 = new byte[i];
    byte[] arrayOfByte1 = new byte[paramArrayOfByte2.length + 4];
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, 0, paramArrayOfByte2.length);
    a(arrayOfByte1, paramArrayOfByte2.length, paramInt3);
    paramArrayOfByte2 = arrayOfByte1;
    paramInt3 = 0;
    for (;;)
    {
      if (paramInt3 >= paramInt2)
      {
        System.arraycopy(arrayOfByte2, 0, paramArrayOfByte1, paramInt1, i);
        return;
      }
      paramArrayOfByte2 = paramd.a(paramArrayOfByte2);
      a(arrayOfByte2, paramArrayOfByte2);
      paramInt3 += 1;
    }
  }
  
  protected void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte1.length) {
        return;
      }
      paramArrayOfByte1[i] = ((byte)(paramArrayOfByte1[i] ^ paramArrayOfByte2[i]));
      i += 1;
    }
  }
  
  protected byte[] a(d paramd, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    for (;;)
    {
      int k = paramd.b();
      int m = a(paramInt2, k);
      byte[] arrayOfByte = new byte[m * k];
      int i = 1;
      int j = 0;
      for (;;)
      {
        if (i > m)
        {
          paramd = arrayOfByte;
          if (paramInt2 - (m - 1) * k < k)
          {
            paramd = new byte[paramInt2];
            System.arraycopy(arrayOfByte, 0, paramd, 0, paramInt2);
          }
          return paramd;
        }
        a(arrayOfByte, j, paramd, paramArrayOfByte, paramInt1, i);
        j += k;
        i += 1;
      }
    }
  }
  
  public byte[] a(char[] paramArrayOfChar, int paramInt)
  {
    byte[] arrayOfByte = (byte[])null;
    arrayOfByte = (byte[])null;
    if (paramArrayOfChar == null) {
      throw new NullPointerException();
    }
    a(a.a.a.h.b.a(paramArrayOfChar));
    int i = paramInt;
    if (paramInt == 0) {
      i = this.b.b();
    }
    return a(this.b, this.a.b(), this.a.a(), i);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */