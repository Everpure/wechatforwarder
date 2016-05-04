package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import com.yalantis.ucrop.c;
import com.yalantis.ucrop.d;
import com.yalantis.ucrop.j;

public class OverlayView
  extends View
{
  protected int a;
  protected int b;
  private final RectF c = new RectF();
  private int d;
  private int e;
  private float f;
  private float[] g = null;
  private boolean h;
  private boolean i;
  private boolean j;
  private int k;
  private Path l = new Path();
  private Paint m = new Paint(1);
  private Paint n = new Paint(1);
  private Paint o = new Paint(1);
  
  public OverlayView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public OverlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public OverlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private void b(TypedArray paramTypedArray)
  {
    int i1 = paramTypedArray.getDimensionPixelSize(j.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(d.ucrop_default_crop_frame_stoke_width));
    int i2 = paramTypedArray.getColor(j.ucrop_UCropView_ucrop_frame_color, getResources().getColor(c.ucrop_color_default_crop_frame));
    this.o.setStrokeWidth(i1);
    this.o.setColor(i2);
    this.o.setStyle(Paint.Style.STROKE);
  }
  
  private void c(TypedArray paramTypedArray)
  {
    int i1 = paramTypedArray.getDimensionPixelSize(j.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(d.ucrop_default_crop_grid_stoke_width));
    int i2 = paramTypedArray.getColor(j.ucrop_UCropView_ucrop_grid_color, getResources().getColor(c.ucrop_color_default_crop_grid));
    this.n.setStrokeWidth(i1);
    this.n.setColor(i2);
    this.d = paramTypedArray.getInt(j.ucrop_UCropView_ucrop_grid_row_count, 2);
    this.e = paramTypedArray.getInt(j.ucrop_UCropView_ucrop_grid_column_count, 2);
  }
  
  public void a()
  {
    int i1 = (int)(this.a / this.f);
    int i2;
    if (i1 > this.b)
    {
      i1 = (int)(this.b * this.f);
      i2 = (this.a - i1) / 2;
      this.c.set(getPaddingLeft() + i2, getPaddingTop(), i1 + getPaddingLeft() + i2, getPaddingTop() + this.b);
    }
    for (;;)
    {
      this.g = null;
      this.l.reset();
      this.l.addOval(this.c, Path.Direction.CW);
      return;
      i2 = (this.b - i1) / 2;
      this.c.set(getPaddingLeft(), getPaddingTop() + i2, getPaddingLeft() + this.a, i1 + getPaddingTop() + i2);
    }
  }
  
  protected void a(TypedArray paramTypedArray)
  {
    this.j = paramTypedArray.getBoolean(j.ucrop_UCropView_ucrop_oval_dimmed_layer, false);
    this.k = paramTypedArray.getColor(j.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(c.ucrop_color_default_dimmed));
    this.m.setColor(this.k);
    this.m.setStyle(Paint.Style.STROKE);
    this.m.setStrokeWidth(1.0F);
    b(paramTypedArray);
    this.h = paramTypedArray.getBoolean(j.ucrop_UCropView_ucrop_show_frame, true);
    c(paramTypedArray);
    this.i = paramTypedArray.getBoolean(j.ucrop_UCropView_ucrop_show_grid, true);
  }
  
  protected void a(Canvas paramCanvas)
  {
    paramCanvas.save();
    if (this.j) {
      paramCanvas.clipPath(this.l, Region.Op.DIFFERENCE);
    }
    for (;;)
    {
      paramCanvas.drawColor(this.k);
      paramCanvas.restore();
      if (this.j) {
        paramCanvas.drawOval(this.c, this.m);
      }
      return;
      paramCanvas.clipRect(this.c, Region.Op.DIFFERENCE);
    }
  }
  
  protected void b()
  {
    if ((Build.VERSION.SDK_INT < 18) && (Build.VERSION.SDK_INT >= 11)) {
      setLayerType(1, null);
    }
  }
  
  protected void b(Canvas paramCanvas)
  {
    int i5 = 0;
    if (this.i)
    {
      if ((this.g == null) && (!this.c.isEmpty()))
      {
        this.g = new float[this.d * 4 + this.e * 4];
        int i2 = 0;
        int i1 = 0;
        int i3;
        int i4;
        float[] arrayOfFloat;
        for (;;)
        {
          i3 = i5;
          i4 = i1;
          if (i2 >= this.d) {
            break;
          }
          arrayOfFloat = this.g;
          i3 = i1 + 1;
          arrayOfFloat[i1] = this.c.left;
          arrayOfFloat = this.g;
          i1 = i3 + 1;
          arrayOfFloat[i3] = (this.c.height() * ((i2 + 1.0F) / (this.d + 1)) + this.c.top);
          arrayOfFloat = this.g;
          i3 = i1 + 1;
          arrayOfFloat[i1] = this.c.right;
          arrayOfFloat = this.g;
          i1 = i3 + 1;
          arrayOfFloat[i3] = (this.c.height() * ((i2 + 1.0F) / (this.d + 1)) + this.c.top);
          i2 += 1;
        }
        while (i3 < this.e)
        {
          arrayOfFloat = this.g;
          i1 = i4 + 1;
          arrayOfFloat[i4] = (this.c.width() * ((i3 + 1.0F) / (this.e + 1)) + this.c.left);
          arrayOfFloat = this.g;
          i2 = i1 + 1;
          arrayOfFloat[i1] = this.c.top;
          arrayOfFloat = this.g;
          i1 = i2 + 1;
          arrayOfFloat[i2] = (this.c.width() * ((i3 + 1.0F) / (this.e + 1)) + this.c.left);
          arrayOfFloat = this.g;
          i4 = i1 + 1;
          arrayOfFloat[i1] = this.c.bottom;
          i3 += 1;
        }
      }
      if (this.g != null) {
        paramCanvas.drawLines(this.g, this.n);
      }
    }
    if (this.h) {
      paramCanvas.drawRect(this.c, this.o);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
    b(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      paramInt1 = getPaddingLeft();
      paramInt2 = getPaddingTop();
      paramInt3 = getWidth();
      paramInt4 = getPaddingRight();
      int i1 = getHeight();
      int i2 = getPaddingBottom();
      this.a = (paramInt3 - paramInt4 - paramInt1);
      this.b = (i1 - i2 - paramInt2);
      a();
    }
  }
  
  public void setCropFrameColor(int paramInt)
  {
    this.o.setColor(paramInt);
  }
  
  public void setCropFrameStrokeWidth(int paramInt)
  {
    this.o.setStrokeWidth(paramInt);
  }
  
  public void setCropGridColor(int paramInt)
  {
    this.n.setColor(paramInt);
  }
  
  public void setCropGridColumnCount(int paramInt)
  {
    this.e = paramInt;
    this.g = null;
  }
  
  public void setCropGridRowCount(int paramInt)
  {
    this.d = paramInt;
    this.g = null;
  }
  
  public void setCropGridStrokeWidth(int paramInt)
  {
    this.n.setStrokeWidth(paramInt);
  }
  
  public void setDimmedColor(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void setOvalDimmedLayer(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public void setShowCropFrame(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void setShowCropGrid(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void setTargetAspectRatio(float paramFloat)
  {
    this.f = paramFloat;
    a();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/OverlayView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */