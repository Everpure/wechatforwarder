package com.yalantis.ucrop.a;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;

class d
  extends AsyncTask
{
  private final Context a;
  private final Uri b;
  private final int c;
  private final int d;
  private final b e;
  
  public d(Context paramContext, Uri paramUri, int paramInt1, int paramInt2, b paramb)
  {
    this.a = paramContext;
    this.b = paramUri;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramb;
  }
  
  protected c a(Void... paramVarArgs)
  {
    int i = 0;
    if (this.b == null) {
      return new c(null, new NullPointerException("Uri cannot be null"));
    }
    ParcelFileDescriptor localParcelFileDescriptor;
    for (;;)
    {
      try
      {
        localParcelFileDescriptor = this.a.getContentResolver().openFileDescriptor(this.b, "r");
        if (localParcelFileDescriptor == null) {
          break label140;
        }
        localFileDescriptor = localParcelFileDescriptor.getFileDescriptor();
        localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(localFileDescriptor, null, localOptions);
        localOptions.inSampleSize = a.a(localOptions, this.c, this.d);
        localOptions.inJustDecodeBounds = false;
        paramVarArgs = null;
      }
      catch (FileNotFoundException paramVarArgs)
      {
        try
        {
          FileDescriptor localFileDescriptor;
          Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(localFileDescriptor, null, localOptions);
          paramVarArgs = localBitmap;
          i = 1;
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          BitmapFactory.Options localOptions;
          Log.e("BitmapLoadUtils", "doInBackground: BitmapFactory.decodeFileDescriptor: ", localOutOfMemoryError);
          localOptions.inSampleSize += 1;
        }
        paramVarArgs = paramVarArgs;
        return new c(null, paramVarArgs);
      }
      if (i != 0) {
        break;
      }
      label140:
      return new c(null, new NullPointerException("ParcelFileDescriptor was null for given Uri"));
    }
    if (Build.VERSION.SDK_INT >= 16) {
      a.a(localParcelFileDescriptor);
    }
    int j = a.a(this.a, this.b);
    i = a.a(j);
    j = a.b(j);
    Matrix localMatrix = new Matrix();
    if (i != 0) {
      localMatrix.preRotate(i);
    }
    if (j != 1) {
      localMatrix.postScale(j, 1.0F);
    }
    if (!localMatrix.isIdentity()) {
      return new c(a.a(paramVarArgs, localMatrix), null);
    }
    return new c(paramVarArgs, null);
  }
  
  protected void a(c paramc)
  {
    if (paramc.b == null)
    {
      this.e.a(paramc.a);
      return;
    }
    this.e.a(paramc.b);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */