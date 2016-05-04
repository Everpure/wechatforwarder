package com.rarepebble.colorpicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Shader.TileMode;
import android.util.TypedValue;

class l
{
  public static float a(Context paramContext, float paramFloat)
  {
    return TypedValue.applyDimension(1, paramFloat, paramContext.getResources().getDisplayMetrics());
  }
  
  public static Paint a(Context paramContext)
  {
    Paint localPaint = new Paint();
    localPaint.setColor(-8355712);
    localPaint.setStrokeWidth(a(paramContext, 1.5F));
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setAntiAlias(true);
    return localPaint;
  }
  
  public static Paint b(Context paramContext)
  {
    Paint localPaint = new Paint();
    localPaint.setShader(new BitmapShader(BitmapFactory.decodeResource(paramContext.getResources(), h.checker_background), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
    localPaint.setStrokeWidth(a(paramContext, 1.5F));
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setAntiAlias(true);
    return localPaint;
  }
  
  public static Path c(Context paramContext)
  {
    Path localPath = new Path();
    localPath.addCircle(0.0F, 0.0F, a(paramContext, 7.0F), Path.Direction.CW);
    return localPath;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */