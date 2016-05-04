package com.fkzhang.wechatforwarder.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;

public class c
{
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f1 = paramInt2 / i;
    float f2 = paramInt1 / j;
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(f1, f2);
    return Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, false);
  }
  
  public static Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramBitmap1 == null) {
      return null;
    }
    int k = paramBitmap1.getWidth();
    int j = paramBitmap1.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(k, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap1, 0.0F, 0.0F, null);
    paramBitmap1 = new Paint();
    int i;
    int m;
    int n;
    if (paramBitmap2 != null)
    {
      i = paramBitmap2.getWidth();
      m = paramBitmap2.getHeight();
      paramBitmap1.setAlpha(paramInt2);
      float f1 = j / 5.0F;
      float f2 = m / f1;
      n = (int)(i / f2);
      m = (int)f1;
      paramBitmap2 = a(paramBitmap2, n, m);
      i = 0;
      paramInt2 = 0;
    }
    switch (paramInt3)
    {
    default: 
      paramInt3 = i;
      localCanvas.drawBitmap(paramBitmap2, paramInt3, paramInt2, paramBitmap1);
      if (!TextUtils.isEmpty(paramString))
      {
        paramBitmap2 = Typeface.create("宋体", 1);
        paramBitmap1 = new TextPaint();
        paramBitmap1.setTypeface(paramBitmap2);
        paramBitmap1.setTextSize(paramInt5);
        paramBitmap1.setColor(paramInt1);
        paramBitmap2 = new StaticLayout(paramString, paramBitmap1, k, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
        paramInt5 = (int)paramBitmap1.measureText(paramString);
        paramInt3 = paramBitmap2.getHeight();
        paramInt2 = 0;
        paramInt1 = 0;
        switch (paramInt4)
        {
        }
      }
      break;
    }
    for (;;)
    {
      localCanvas.translate(paramInt2, paramInt1);
      paramBitmap2.draw(localCanvas);
      localCanvas.translate(-paramInt2, -paramInt1);
      localCanvas.save(31);
      localCanvas.restore();
      return localBitmap;
      paramInt3 = 5;
      paramInt2 = 5;
      break;
      paramInt3 = k - n - 5;
      paramInt2 = 5;
      break;
      paramInt3 = 5;
      paramInt2 = j - m - 5;
      break;
      paramInt3 = k - n - 5;
      paramInt2 = j - m - 5;
      break;
      paramInt2 = 20;
      paramInt1 = 20;
      continue;
      paramInt2 = k - paramInt5 - 20;
      paramInt1 = 20;
      continue;
      paramInt2 = 20;
      paramInt1 = j - paramInt3 - 20;
      continue;
      paramInt2 = k - paramInt5 - 20;
      paramInt1 = j - paramInt3 - 20;
    }
  }
  
  private static Bitmap a(File paramFile)
  {
    if (!paramFile.exists()) {
      return null;
    }
    try
    {
      paramFile = BitmapFactory.decodeStream(new FileInputStream(paramFile));
      return paramFile;
    }
    catch (Exception paramFile)
    {
      paramFile.printStackTrace();
    }
    return null;
  }
  
  public static void a(Context paramContext, String paramString, TextView paramTextView)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    paramString = new File(paramContext.getCacheDir(), paramString);
    if (paramString.exists())
    {
      paramString = a(paramString);
      paramString = new BitmapDrawable(paramContext.getResources(), paramString);
      paramContext = a.a(paramContext, 2130837581);
      paramString.setBounds(0, 0, paramContext.getIntrinsicWidth(), paramContext.getIntrinsicHeight());
      paramTextView.setCompoundDrawables(paramString, null, null, null);
      return;
    }
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(2130837581, 0, 0, 0);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */