package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.v4.c.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yalantis.ucrop.c;
import com.yalantis.ucrop.d;
import com.yalantis.ucrop.j;

public class AspectRatioTextView
  extends TextView
{
  private final Rect a = new Rect();
  private Paint b;
  private int c;
  private float d;
  private String e;
  private float f;
  private float g;
  
  public AspectRatioTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AspectRatioTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AspectRatioTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext.obtainStyledAttributes(paramAttributeSet, j.ucrop_AspectRatioTextView));
  }
  
  @TargetApi(21)
  public AspectRatioTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext.obtainStyledAttributes(paramAttributeSet, j.ucrop_AspectRatioTextView));
  }
  
  private void a()
  {
    if (this.d != 0.0F)
    {
      float f1 = this.f;
      this.f = this.g;
      this.g = f1;
      this.d = (this.f / this.g);
    }
  }
  
  private void a(int paramInt)
  {
    if (this.b != null) {
      this.b.setColor(paramInt);
    }
    int[] arrayOfInt1 = { 16842913 };
    int[] arrayOfInt2 = { 0 };
    int i = a.b(getContext(), c.ucrop_color_widget);
    setTextColor(new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2 }, new int[] { paramInt, i }));
  }
  
  private void a(TypedArray paramTypedArray)
  {
    setGravity(1);
    this.e = paramTypedArray.getString(j.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
    this.f = paramTypedArray.getFloat(j.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0F);
    this.g = paramTypedArray.getFloat(j.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0F);
    if ((this.f == 0.0F) || (this.g == 0.0F)) {}
    for (this.d = 0.0F;; this.d = (this.f / this.g))
    {
      this.c = getContext().getResources().getDimensionPixelSize(d.ucrop_size_dot_scale_text_view);
      this.b = new Paint(1);
      this.b.setStyle(Paint.Style.FILL);
      b();
      a(getResources().getColor(c.ucrop_color_widget_active));
      paramTypedArray.recycle();
      return;
    }
  }
  
  private void b()
  {
    if (!TextUtils.isEmpty(this.e))
    {
      setText(this.e);
      return;
    }
    setText(String.format("%d:%d", new Object[] { Integer.valueOf((int)this.f), Integer.valueOf((int)this.g) }));
  }
  
  public float a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a();
      b();
    }
    return this.d;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (isSelected())
    {
      paramCanvas.getClipBounds(this.a);
      paramCanvas.drawCircle((this.a.right - this.a.left) / 2.0F, this.a.bottom - this.c, this.c / 2, this.b);
    }
  }
  
  public void setActiveColor(int paramInt)
  {
    a(paramInt);
    invalidate();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/widget/AspectRatioTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */