package com.rarepebble.colorpicker;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public class SwatchView
  extends n
  implements f
{
  private final Paint a;
  private final Path b;
  private final Paint c;
  private final Path d;
  private final Path e;
  private final Paint f;
  private final Paint g;
  private final float h;
  
  public SwatchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwatchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet != null) {}
    for (this.h = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, k.SwatchView, 0, 0).getDimension(k.SwatchView_radialMargin, 0.0F);; this.h = 0.0F)
    {
      this.a = l.a(paramContext);
      this.c = l.b(paramContext);
      this.f = new Paint();
      this.g = new Paint();
      this.b = new Path();
      this.d = new Path();
      this.e = new Path();
      return;
    }
  }
  
  private static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramPath.reset();
    paramPath.moveTo(paramFloat1, paramFloat1);
    a(paramPath, paramFloat2, paramFloat1, paramFloat3 - paramFloat1, 0.0F, paramFloat4);
  }
  
  private static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    RectF localRectF = new RectF(-paramFloat3, -paramFloat3, paramFloat3, paramFloat3);
    localRectF.offset(paramFloat1, paramFloat2);
    paramPath.arcTo(localRectF, paramFloat4, paramFloat5);
  }
  
  private static void b(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(paramPath, paramFloat1, paramFloat2, paramFloat3 - paramFloat1, 90.0F - paramFloat4, paramFloat4);
    paramPath.lineTo(paramFloat1, paramFloat1);
    paramPath.close();
  }
  
  private static void c(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat2 = paramFloat1 + paramFloat2;
    RectF localRectF = new RectF(-paramFloat2, -paramFloat2, paramFloat2, paramFloat2);
    localRectF.offset(paramFloat1, paramFloat1);
    paramPath.arcTo(localRectF, paramFloat3, paramFloat4);
  }
  
  void a(e parame)
  {
    parame.a(this);
  }
  
  public void b(e parame)
  {
    this.g.setColor(parame.a());
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawPath(this.b, this.c);
    paramCanvas.drawPath(this.d, this.f);
    paramCanvas.drawPath(this.e, this.g);
    paramCanvas.drawPath(this.b, this.a);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = this.a.getStrokeWidth() / 2.0F;
    float f2 = Math.min(paramInt1, paramInt2);
    float f3 = this.h;
    float f4 = 2.0F * f3 + f2;
    float f5 = (float)Math.sqrt(f4 * f4 - f2 * f2);
    f4 = f2 - f5;
    float f7 = (float)Math.toDegrees(Math.atan2(f5, f2));
    f5 = 270.0F - f7;
    float f6 = f7 - 45.0F;
    f7 = 90.0F - f7;
    a(this.b, f1, f4, f3, f7);
    c(this.b, f2, f3, f5, 2.0F * f6);
    b(this.b, f1, f4, f3, f7);
    this.d.reset();
    this.d.moveTo(f1, f1);
    c(this.d, f2, f3, 225.0F, f6);
    b(this.d, f1, f4, f3, f7);
    a(this.e, f1, f4, f3, f7);
    c(this.e, f2, f3, f5, f6);
    this.e.lineTo(f1, f1);
    this.e.close();
  }
  
  void setOriginalColor(int paramInt)
  {
    this.f.setColor(paramInt);
    invalidate();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/SwatchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */