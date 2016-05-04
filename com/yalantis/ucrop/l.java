package com.yalantis.ucrop;

import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;

public class l
{
  private final Bundle a = new Bundle();
  
  public Bundle a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a.putInt("com.yalantis.ucrop.CompressionQuality", paramInt);
  }
  
  public void a(Bitmap.CompressFormat paramCompressFormat)
  {
    this.a.putString("com.yalantis.ucrop.CompressionFormatName", paramCompressFormat.name());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */