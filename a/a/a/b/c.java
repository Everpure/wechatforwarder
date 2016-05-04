package a.a.a.b;

import a.a.a.c.a;
import a.a.a.e.f;

public class c
  implements b
{
  private f a;
  private byte[] b = new byte[4];
  private a.a.a.b.b.b c;
  
  public c(f paramf, byte[] paramArrayOfByte)
  {
    if (paramf == null) {
      throw new a("one of more of the input parameters were null in StandardDecryptor");
    }
    this.a = paramf;
    this.c = new a.a.a.b.b.b();
    a(paramArrayOfByte);
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt2 < 0)) {
      throw new a("one of the input parameters were null in standard decrpyt data");
    }
    int i = paramInt1;
    for (;;)
    {
      if (i >= paramInt1 + paramInt2) {
        return paramInt2;
      }
      try
      {
        int j = (paramArrayOfByte[i] & 0xFF ^ this.c.a()) & 0xFF;
        this.c.a((byte)j);
        paramArrayOfByte[i] = ((byte)j);
        i += 1;
      }
      catch (Exception paramArrayOfByte)
      {
        throw new a(paramArrayOfByte);
      }
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = this.a.o();
    this.b[3] = ((byte)(arrayOfByte[3] & 0xFF));
    this.b[2] = ((byte)(arrayOfByte[3] >> 8 & 0xFF));
    this.b[1] = ((byte)(arrayOfByte[3] >> 16 & 0xFF));
    this.b[0] = ((byte)(arrayOfByte[3] >> 24 & 0xFF));
    if ((this.b[2] > 0) || (this.b[1] > 0) || (this.b[0] > 0)) {
      throw new IllegalStateException("Invalid CRC in File Header");
    }
    if ((this.a.n() == null) || (this.a.n().length <= 0)) {
      throw new a("Wrong password!", 5);
    }
    this.c.a(this.a.n());
    int i = paramArrayOfByte[0];
    int j = 0;
    while (j < 12) {
      try
      {
        this.c.a((byte)(this.c.a() ^ i));
        if (j + 1 != 12) {
          i = paramArrayOfByte[(j + 1)];
        }
        j += 1;
      }
      catch (Exception paramArrayOfByte)
      {
        throw new a(paramArrayOfByte);
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */