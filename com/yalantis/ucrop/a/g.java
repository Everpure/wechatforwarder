package com.yalantis.ucrop.a;

import android.util.Log;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class g
{
  private static final byte[] a = "Exif\000\000".getBytes(Charset.forName("UTF-8"));
  private static final int[] b = { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
  private final i c;
  
  public g(InputStream paramInputStream)
  {
    this.c = new j(paramInputStream);
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 + 2 + paramInt2 * 12;
  }
  
  private static int a(h paramh)
  {
    int i = "Exif\000\000".length();
    int j = paramh.b(i);
    ByteOrder localByteOrder;
    label48:
    int n;
    int m;
    if (j == 19789)
    {
      localByteOrder = ByteOrder.BIG_ENDIAN;
      paramh.a(localByteOrder);
      j = i + paramh.a(i + 4);
      int k = paramh.b(j);
      i = 0;
      if (i >= k) {
        break label486;
      }
      n = a(j, i);
      m = paramh.b(n);
      if (m == 274) {
        break label140;
      }
    }
    for (;;)
    {
      i += 1;
      break label48;
      if (j == 18761)
      {
        localByteOrder = ByteOrder.LITTLE_ENDIAN;
        break;
      }
      if (Log.isLoggable("ImageHeaderParser", 3)) {
        Log.d("ImageHeaderParser", "Unknown endianness = " + j);
      }
      localByteOrder = ByteOrder.BIG_ENDIAN;
      break;
      label140:
      int i1 = paramh.b(n + 2);
      if ((i1 < 1) || (i1 > 12))
      {
        if (Log.isLoggable("ImageHeaderParser", 3)) {
          Log.d("ImageHeaderParser", "Got invalid format code = " + i1);
        }
      }
      else
      {
        int i2 = paramh.a(n + 4);
        if (i2 < 0)
        {
          if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Negative tiff component count");
          }
        }
        else
        {
          if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Got tagIndex=" + i + " tagType=" + m + " formatCode=" + i1 + " componentCount=" + i2);
          }
          i2 += b[i1];
          if (i2 > 4)
          {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
              Log.d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + i1);
            }
          }
          else
          {
            n += 8;
            if ((n < 0) || (n > paramh.a()))
            {
              if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + n + " tagType=" + m);
              }
            }
            else
            {
              if ((i2 >= 0) && (n + i2 <= paramh.a())) {
                break label479;
              }
              if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + m);
              }
            }
          }
        }
      }
    }
    label479:
    return paramh.b(n);
    label486:
    return -1;
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = this.c.a(paramArrayOfByte, paramInt);
    if (i != paramInt) {
      if (Log.isLoggable("ImageHeaderParser", 3)) {
        Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + paramInt + ", actually read: " + i);
      }
    }
    do
    {
      return -1;
      if (b(paramArrayOfByte, paramInt)) {
        return a(new h(paramArrayOfByte, paramInt));
      }
    } while (!Log.isLoggable("ImageHeaderParser", 3));
    Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
    return -1;
  }
  
  private static boolean a(int paramInt)
  {
    return ((paramInt & 0xFFD8) == 65496) || (paramInt == 19789) || (paramInt == 18761);
  }
  
  private int b()
  {
    int i = this.c.b();
    if (i != 255) {
      if (Log.isLoggable("ImageHeaderParser", 3)) {
        Log.d("ImageHeaderParser", "Unknown segmentId=" + i);
      }
    }
    int j;
    long l;
    do
    {
      do
      {
        do
        {
          return -1;
          i = this.c.b();
        } while (i == 218);
        if (i != 217) {
          break;
        }
      } while (!Log.isLoggable("ImageHeaderParser", 3));
      Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
      return -1;
      j = this.c.a() - 2;
      if (i == 225) {
        return j;
      }
      l = this.c.a(j);
      if (l == j) {
        break;
      }
    } while (!Log.isLoggable("ImageHeaderParser", 3));
    Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + i + ", wanted to skip: " + j + ", but actually skipped: " + l);
    return -1;
    return j;
  }
  
  private boolean b(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool;
    if ((paramArrayOfByte != null) && (paramInt > a.length))
    {
      bool = true;
      if (bool) {
        paramInt = 0;
      }
    }
    else
    {
      for (;;)
      {
        if (paramInt >= a.length) {
          return bool;
        }
        if (paramArrayOfByte[paramInt] != a[paramInt])
        {
          return false;
          bool = false;
          break;
        }
        paramInt += 1;
      }
    }
    return bool;
  }
  
  public int a()
  {
    int i = this.c.a();
    if (!a(i)) {
      if (Log.isLoggable("ImageHeaderParser", 3)) {
        Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + i);
      }
    }
    do
    {
      return -1;
      i = b();
      if (i != -1) {
        break;
      }
    } while (!Log.isLoggable("ImageHeaderParser", 3));
    Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
    return -1;
    return a(new byte[i], i);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */