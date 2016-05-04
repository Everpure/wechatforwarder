package a.a.a.h;

import a.a.a.c.a;
import java.io.DataInput;
import java.io.IOException;

public class b
{
  public static int a(DataInput paramDataInput, byte[] paramArrayOfByte)
  {
    try
    {
      paramDataInput.readFully(paramArrayOfByte, 0, 4);
      return paramArrayOfByte[0] & 0xFF | (paramArrayOfByte[1] & 0xFF) << 8 | (paramArrayOfByte[2] & 0xFF | (paramArrayOfByte[3] & 0xFF) << 8) << 16;
    }
    catch (IOException paramDataInput)
    {
      throw new a(paramDataInput);
    }
  }
  
  public static long a(byte[] paramArrayOfByte, int paramInt)
  {
    return (((((((0L | paramArrayOfByte[(paramInt + 7)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 6)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 5)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 4)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 3)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | paramArrayOfByte[paramInt] & 0xFF;
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[0] = ((byte)paramInt1);
    paramArrayOfByte[1] = ((byte)(paramInt1 >> 8));
    paramArrayOfByte[2] = ((byte)(paramInt1 >> 16));
    paramArrayOfByte[3] = ((byte)(paramInt1 >> 24));
    paramArrayOfByte[4] = 0;
    paramArrayOfByte[5] = 0;
    paramArrayOfByte[6] = 0;
    paramArrayOfByte[7] = 0;
    paramArrayOfByte[8] = 0;
    paramArrayOfByte[9] = 0;
    paramArrayOfByte[10] = 0;
    paramArrayOfByte[11] = 0;
    paramArrayOfByte[12] = 0;
    paramArrayOfByte[13] = 0;
    paramArrayOfByte[14] = 0;
    paramArrayOfByte[15] = 0;
  }
  
  public static byte[] a(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      throw new NullPointerException();
    }
    byte[] arrayOfByte = new byte[paramArrayOfChar.length];
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfChar.length) {
        return arrayOfByte;
      }
      arrayOfByte[i] = ((byte)paramArrayOfChar[i]);
      i += 1;
    }
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8;
  }
  
  public static final short c(byte[] paramArrayOfByte, int paramInt)
  {
    return (short)((short)((short)(0x0 | paramArrayOfByte[paramInt] & 0xFF) << 8) | paramArrayOfByte[(paramInt + 1)] & 0xFF);
  }
  
  public static int d(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 8) << 16;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */