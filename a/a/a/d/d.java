package a.a.a.d;

import a.a.a.g.c;
import java.io.IOException;
import java.io.InputStream;

public class d
  extends InputStream
{
  private a a;
  
  public d(a parama)
  {
    this.a = parama;
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.a.close();
      if ((!paramBoolean) && (this.a.a() != null)) {
        this.a.a().b();
      }
      return;
    }
    catch (a.a.a.c.a locala)
    {
      throw new IOException(locala.getMessage());
    }
  }
  
  public int available()
  {
    return this.a.available();
  }
  
  public void close()
  {
    a(false);
  }
  
  public int read()
  {
    int i = this.a.read();
    if (i != -1) {
      this.a.a().a(i);
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt2 = this.a.read(paramArrayOfByte, paramInt1, paramInt2);
    if ((paramInt2 > 0) && (this.a.a() != null)) {
      this.a.a().a(paramArrayOfByte, paramInt1, paramInt2);
    }
    return paramInt2;
  }
  
  public long skip(long paramLong)
  {
    return this.a.skip(paramLong);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */