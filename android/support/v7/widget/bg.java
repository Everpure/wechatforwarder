package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.i.bu;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.widget.RatingBar;

public class bg
  extends RatingBar
{
  private be a = new be(this, this.b);
  private ar b = ar.a();
  
  public bg(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.ratingBarStyle);
  }
  
  public bg(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap localBitmap = this.a.a();
      if (localBitmap != null) {
        setMeasuredDimension(bu.a(localBitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */