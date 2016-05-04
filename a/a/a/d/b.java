package a.a.a.d;

import a.a.a.e.f;
import a.a.a.e.g;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class b
  extends c
{
  private Inflater a = new Inflater(true);
  private byte[] b = new byte['က'];
  private byte[] c = new byte[1];
  private a.a.a.g.c d;
  private long e;
  private long f;
  
  public b(RandomAccessFile paramRandomAccessFile, long paramLong1, long paramLong2, a.a.a.g.c paramc)
  {
    super(paramRandomAccessFile, paramLong1, paramLong2, paramc);
    this.d = paramc;
    this.e = 0L;
    this.f = paramc.d().e();
  }
  
  private void c()
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    while (super.read(arrayOfByte, 0, 1024) != -1) {}
    b();
  }
  
  private void d()
  {
    int i = super.read(this.b, 0, this.b.length);
    if (i == -1) {
      throw new EOFException("Unexpected end of ZLIB input stream");
    }
    this.a.setInput(this.b, 0, i);
  }
  
  public a.a.a.g.c a()
  {
    return super.a();
  }
  
  public int available()
  {
    if (this.a.finished()) {
      return 0;
    }
    return 1;
  }
  
  public void close()
  {
    this.a.end();
    super.close();
  }
  
  public int read()
  {
    if (read(this.c, 0, 1) == -1) {
      return -1;
    }
    return this.c[0] & 0xFF;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("input buffer is null");
    }
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("input buffer is null");
    }
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1)) {
      throw new IndexOutOfBoundsException();
    }
    if (paramInt2 == 0) {
      return 0;
    }
    try
    {
      if (this.e >= this.f)
      {
        c();
        return -1;
      }
    }
    catch (DataFormatException localDataFormatException)
    {
      paramArrayOfByte = "Invalid ZLIB data format";
      if (localDataFormatException.getMessage() != null) {
        paramArrayOfByte = localDataFormatException.getMessage();
      }
      Object localObject = paramArrayOfByte;
      if (this.d != null)
      {
        localObject = paramArrayOfByte;
        if (this.d.g().h())
        {
          localObject = paramArrayOfByte;
          if (this.d.g().i() == 0) {
            localObject = paramArrayOfByte + " - Wrong Password?";
          }
        }
      }
      throw new IOException((String)localObject);
    }
    int i;
    do
    {
      if ((this.a.finished()) || (this.a.needsDictionary()))
      {
        c();
        return -1;
      }
      if (this.a.needsInput()) {
        d();
      }
      i = this.a.inflate(paramArrayOfByte, paramInt1, paramInt2);
    } while (i == 0);
    this.e += i;
    return i;
  }
  
  public long skip(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("negative skip length");
    }
    int m = (int)Math.min(paramLong, 2147483647L);
    byte[] arrayOfByte = new byte['Ȁ'];
    int j;
    for (int i = 0;; i = j + i)
    {
      if (i >= m) {}
      do
      {
        return i;
        int k = m - i;
        j = k;
        if (k > arrayOfByte.length) {
          j = arrayOfByte.length;
        }
        j = read(arrayOfByte, 0, j);
      } while (j == -1);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */