package com.yalantis.ucrop.a;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

public class a
{
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int m = paramOptions.outHeight;
    int n = paramOptions.outWidth;
    int j = 1;
    int k = 1;
    int i = k;
    if (m <= paramInt2)
    {
      if (n > paramInt1) {
        i = k;
      }
    }
    else {
      for (;;)
      {
        if (m / i <= paramInt2)
        {
          j = i;
          if (n / i <= paramInt1) {
            break;
          }
        }
        i *= 2;
      }
    }
    return j;
  }
  
  public static Bitmap a(Bitmap paramBitmap, Matrix paramMatrix)
  {
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramMatrix, true);
      paramMatrix = paramBitmap;
      if (paramBitmap != localBitmap)
      {
        paramBitmap.recycle();
        paramMatrix = localBitmap;
      }
      return paramMatrix;
    }
    catch (OutOfMemoryError paramMatrix)
    {
      Log.e("BitmapLoadUtils", "transformBitmap: ", paramMatrix);
    }
    return paramBitmap;
  }
  
  public static void a(Context paramContext, Uri paramUri, int paramInt1, int paramInt2, b paramb)
  {
    new d(paramContext, paramUri, paramInt1, paramInt2, paramb).execute(new Void[0]);
  }
  
  public static void a(Closeable paramCloseable)
  {
    if ((paramCloseable != null) && ((paramCloseable instanceof Closeable))) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable) {}
  }
  
  private static int b(Context paramContext, Uri paramUri)
  {
    int j = 0;
    int i = j;
    try
    {
      paramContext = paramContext.getContentResolver().openInputStream(paramUri);
      if (paramContext == null) {
        return 0;
      }
      i = j;
      j = new g(paramContext).a();
      i = j;
      a(paramContext);
      return j;
    }
    catch (IOException paramContext)
    {
      Log.e("BitmapLoadUtils", "getExifOrientation: " + paramUri.toString(), paramContext);
    }
    return i;
  }
  
  private static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 5: 
    case 6: 
      return 90;
    case 3: 
    case 4: 
      return 180;
    }
    return 270;
  }
  
  private static int d(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 6: 
    default: 
      return 1;
    }
    return -1;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */