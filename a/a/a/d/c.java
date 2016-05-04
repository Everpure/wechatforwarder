package a.a.a.d;

import a.a.a.b.b;
import a.a.a.e.f;
import a.a.a.e.l;
import java.io.IOException;
import java.io.RandomAccessFile;

public class c
  extends a
{
  private RandomAccessFile a;
  private long b;
  private long c;
  private a.a.a.g.c d;
  private b e;
  private byte[] f = new byte[1];
  private byte[] g = new byte[16];
  private int h = 0;
  private boolean i = false;
  private int j = -1;
  
  public c(RandomAccessFile paramRandomAccessFile, long paramLong1, long paramLong2, a.a.a.g.c paramc)
  {
    this.a = paramRandomAccessFile;
    this.d = paramc;
    this.e = paramc.e();
    this.b = 0L;
    this.c = paramLong2;
    if ((paramc.d().l()) && (paramc.d().m() == 99)) {}
    for (;;)
    {
      this.i = bool;
      return;
      bool = false;
    }
  }
  
  public a.a.a.g.c a()
  {
    return this.d;
  }
  
  public int available()
  {
    long l = this.c - this.b;
    if (l > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    return (int)l;
  }
  
  protected void b()
  {
    if ((!this.i) || (this.e == null) || (!(this.e instanceof a.a.a.b.a)) || (((a.a.a.b.a)this.e).d() != null)) {
      return;
    }
    byte[] arrayOfByte = new byte[10];
    int k = this.a.read(arrayOfByte);
    if (k != 10)
    {
      if (this.d.f().c())
      {
        this.a.close();
        this.a = this.d.c();
        this.a.read(arrayOfByte, k, 10 - k);
      }
    }
    else
    {
      ((a.a.a.b.a)this.d.e()).a(arrayOfByte);
      return;
    }
    throw new IOException("Error occured while reading stored AES authentication bytes");
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public int read()
  {
    if (this.b >= this.c) {}
    label79:
    do
    {
      do
      {
        return -1;
        if (!this.i) {
          break label79;
        }
        if ((this.h != 0) && (this.h != 16)) {
          break;
        }
      } while (read(this.g) == -1);
      this.h = 0;
      byte[] arrayOfByte = this.g;
      int k = this.h;
      this.h = (k + 1);
      return arrayOfByte[k] & 0xFF;
    } while (read(this.f, 0, 1) == -1);
    return this.f[0] & 0xFF;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = paramInt2;
    if (paramInt2 > this.c - this.b)
    {
      paramInt2 = (int)(this.c - this.b);
      k = paramInt2;
      if (paramInt2 == 0)
      {
        b();
        return -1;
      }
    }
    paramInt2 = k;
    if ((this.d.e() instanceof a.a.a.b.a))
    {
      paramInt2 = k;
      if (this.b + k < this.c)
      {
        paramInt2 = k;
        if (k % 16 != 0) {
          paramInt2 = k - k % 16;
        }
      }
    }
    synchronized (this.a)
    {
      this.j = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
      if ((this.j < paramInt2) && (this.d.f().c()))
      {
        this.a.close();
        this.a = this.d.c();
        if (this.j < 0) {
          this.j = 0;
        }
        paramInt2 = this.a.read(paramArrayOfByte, this.j, paramInt2 - this.j);
        if (paramInt2 > 0) {
          this.j = (paramInt2 + this.j);
        }
      }
      if (this.j > 0) {
        if (this.e == null) {}
      }
    }
  }
  
  public long skip(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException();
    }
    long l = paramLong;
    if (paramLong > this.c - this.b) {
      l = this.c - this.b;
    }
    this.b += l;
    return l;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */