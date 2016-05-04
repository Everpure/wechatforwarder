package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.c.b;
import android.support.v7.c.d;
import android.support.v7.c.e;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
  implements bu
{
  private static final int[] a = { 16842801 };
  private static final bx b;
  private boolean c;
  private boolean d;
  private int e;
  private int f;
  private final Rect g = new Rect();
  private final Rect h = new Rect();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      b = new bt();
    }
    for (;;)
    {
      b.a();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        b = new by();
      } else {
        b = new bv();
      }
    }
  }
  
  public CardView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, e.CardView, paramInt, d.CardView);
    if (paramAttributeSet.hasValue(e.CardView_cardBackgroundColor))
    {
      paramInt = paramAttributeSet.getColor(e.CardView_cardBackgroundColor, 0);
      float f4 = paramAttributeSet.getDimension(e.CardView_cardCornerRadius, 0.0F);
      float f2 = paramAttributeSet.getDimension(e.CardView_cardElevation, 0.0F);
      float f3 = paramAttributeSet.getDimension(e.CardView_cardMaxElevation, 0.0F);
      this.c = paramAttributeSet.getBoolean(e.CardView_cardUseCompatPadding, false);
      this.d = paramAttributeSet.getBoolean(e.CardView_cardPreventCornerOverlap, true);
      int i = paramAttributeSet.getDimensionPixelSize(e.CardView_contentPadding, 0);
      this.g.left = paramAttributeSet.getDimensionPixelSize(e.CardView_contentPaddingLeft, i);
      this.g.top = paramAttributeSet.getDimensionPixelSize(e.CardView_contentPaddingTop, i);
      this.g.right = paramAttributeSet.getDimensionPixelSize(e.CardView_contentPaddingRight, i);
      this.g.bottom = paramAttributeSet.getDimensionPixelSize(e.CardView_contentPaddingBottom, i);
      float f1 = f3;
      if (f2 > f3) {
        f1 = f2;
      }
      this.e = paramAttributeSet.getDimensionPixelSize(e.CardView_android_minWidth, 0);
      this.f = paramAttributeSet.getDimensionPixelSize(e.CardView_android_minHeight, 0);
      paramAttributeSet.recycle();
      b.a(this, paramContext, paramInt, f4, f2, f1);
      return;
    }
    Object localObject = getContext().obtainStyledAttributes(a);
    paramInt = ((TypedArray)localObject).getColor(0, 0);
    ((TypedArray)localObject).recycle();
    localObject = new float[3];
    Color.colorToHSV(paramInt, (float[])localObject);
    if (localObject[2] > 0.5F) {}
    for (paramInt = getResources().getColor(b.cardview_light_background);; paramInt = getResources().getColor(b.cardview_dark_background)) {
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.e) {
      super.setMinimumWidth(paramInt1);
    }
    if (paramInt2 > this.f) {
      super.setMinimumHeight(paramInt2);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h.set(paramInt1, paramInt2, paramInt3, paramInt4);
    super.setPadding(this.g.left + paramInt1, this.g.top + paramInt2, this.g.right + paramInt3, this.g.bottom + paramInt4);
  }
  
  public float getCardElevation()
  {
    return b.e(this);
  }
  
  public int getContentPaddingBottom()
  {
    return this.g.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.g.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.g.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.g.top;
  }
  
  public float getMaxCardElevation()
  {
    return b.a(this);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.d;
  }
  
  public float getRadius()
  {
    return b.d(this);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(b instanceof bt))
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      switch (i)
      {
      default: 
        i = View.MeasureSpec.getMode(paramInt2);
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(b.b(this)), View.MeasureSpec.getSize(paramInt1)), i);
        break;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(b.c(this)), View.MeasureSpec.getSize(paramInt2)), i);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    b.a(this, paramInt);
  }
  
  public void setCardElevation(float paramFloat)
  {
    b.c(this, paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    b.b(this, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.f = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.e = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean == this.d) {
      return;
    }
    this.d = paramBoolean;
    b.h(this);
  }
  
  public void setRadius(float paramFloat)
  {
    b.a(this, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.c == paramBoolean) {
      return;
    }
    this.c = paramBoolean;
    b.g(this);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */