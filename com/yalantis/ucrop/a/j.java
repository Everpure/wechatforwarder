package com.yalantis.ucrop.a;

import java.io.InputStream;

class j
  implements i
{
  private final InputStream a;
  
  public j(InputStream paramInputStream)
  {
    this.a = paramInputStream;
  }
  
  public int a()
  {
    return this.a.read() << 8 & 0xFF00 | this.a.read() & 0xFF;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    while (i > 0)
    {
      int j = this.a.read(paramArrayOfByte, paramInt - i, i);
      if (j == -1) {
        break;
      }
      i -= j;
    }
    return paramInt - i;
  }
  
  public long a(long paramLong)
  {
    if (paramLong < 0L) {
      return 0L;
    }
    long l1 = paramLong;
    for (;;)
    {
      if (l1 > 0L)
      {
        long l2 = this.a.skip(l1);
        if (l2 > 0L)
        {
          l1 -= l2;
          continue;
        }
        if (this.a.read() != -1) {}
      }
      else
      {
        return paramLong - l1;
      }
      l1 -= 1L;
    }
  }
  
  public short b()
  {
    return (short)(this.a.read() & 0xFF);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */