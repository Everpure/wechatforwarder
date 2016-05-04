package com.yalantis.ucrop.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class h
{
  private final ByteBuffer a;
  
  public h(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = ((ByteBuffer)ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).limit(paramInt));
  }
  
  public int a()
  {
    return this.a.remaining();
  }
  
  public int a(int paramInt)
  {
    return this.a.getInt(paramInt);
  }
  
  public void a(ByteOrder paramByteOrder)
  {
    this.a.order(paramByteOrder);
  }
  
  public short b(int paramInt)
  {
    return this.a.getShort(paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */