package a.a.a.b;

import a.a.a.b.a.c;
import a.a.a.e.g;
import java.util.Arrays;

public class a
  implements b
{
  private g a;
  private a.a.a.b.b.a b;
  private a.a.a.b.a.a c;
  private final int d = 2;
  private int e;
  private int f;
  private int g;
  private byte[] h;
  private byte[] i;
  private byte[] j;
  private byte[] k;
  private int l = 1;
  private byte[] m;
  private byte[] n;
  private int o = 0;
  
  public a(g paramg, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramg == null) {
      throw new a.a.a.c.a("one of the input parameters is null in AESDecryptor Constructor");
    }
    this.a = paramg;
    this.k = null;
    this.m = new byte[16];
    this.n = new byte[16];
    a(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  private void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (this.a == null) {
      throw new a.a.a.c.a("invalid file header in init method of AESDecryptor");
    }
    a.a.a.e.a locala = this.a.l();
    if (locala == null) {
      throw new a.a.a.c.a("invalid aes extra data record - in init method of AESDecryptor");
    }
    switch (locala.a())
    {
    default: 
      throw new a.a.a.c.a("invalid aes key strength for file: " + this.a.f());
    case 1: 
      this.e = 16;
      this.f = 16;
      this.g = 8;
    }
    while ((this.a.j() == null) || (this.a.j().length <= 0))
    {
      throw new a.a.a.c.a("empty or null password provided for AES Decryptor");
      this.e = 24;
      this.f = 24;
      this.g = 12;
      continue;
      this.e = 32;
      this.f = 32;
      this.g = 16;
    }
    paramArrayOfByte1 = a(paramArrayOfByte1, this.a.j());
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length != this.e + this.f + 2)) {
      throw new a.a.a.c.a("invalid derived key");
    }
    this.h = new byte[this.e];
    this.i = new byte[this.f];
    this.j = new byte[2];
    System.arraycopy(paramArrayOfByte1, 0, this.h, 0, this.e);
    System.arraycopy(paramArrayOfByte1, this.e, this.i, 0, this.f);
    System.arraycopy(paramArrayOfByte1, this.e + this.f, this.j, 0, 2);
    if (this.j == null) {
      throw new a.a.a.c.a("invalid derived password verifier for AES");
    }
    if (!Arrays.equals(paramArrayOfByte2, this.j)) {
      throw new a.a.a.c.a("Wrong Password for file: " + this.a.f(), 5);
    }
    this.b = new a.a.a.b.b.a(this.h);
    this.c = new a.a.a.b.a.a("HmacSHA1");
    this.c.b(this.i);
  }
  
  private byte[] a(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    try
    {
      paramArrayOfByte = new a.a.a.b.a.b(new c("HmacSHA1", "ISO-8859-1", paramArrayOfByte, 1000)).a(paramArrayOfChar, this.e + this.f + 2);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      throw new a.a.a.c.a(paramArrayOfByte);
    }
  }
  
  public int a()
  {
    return 2;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.b == null) {
      throw new a.a.a.c.a("AES not initialized properly");
    }
    int i1 = paramInt1;
    if (i1 >= paramInt1 + paramInt2) {
      return paramInt2;
    }
    int i2;
    if (i1 + 16 <= paramInt1 + paramInt2) {
      i2 = 16;
    }
    for (;;)
    {
      try
      {
        this.o = i2;
        this.c.a(paramArrayOfByte, i1, this.o);
        a.a.a.h.b.a(this.m, this.l, 16);
        this.b.a(this.m, this.n);
        i2 = 0;
        if (i2 >= this.o)
        {
          this.l += 1;
          i1 += 16;
          break;
        }
        paramArrayOfByte[(i1 + i2)] = ((byte)(paramArrayOfByte[(i1 + i2)] ^ this.n[i2]));
        i2 += 1;
        continue;
        i2 = paramInt1 + paramInt2 - i1;
      }
      catch (a.a.a.c.a paramArrayOfByte)
      {
        throw paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        throw new a.a.a.c.a(paramArrayOfByte);
      }
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.k = paramArrayOfByte;
  }
  
  public int b()
  {
    return this.g;
  }
  
  public byte[] c()
  {
    return this.c.a();
  }
  
  public byte[] d()
  {
    return this.k;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */