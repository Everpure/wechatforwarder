package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class ap
  extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private ar b;
  private bq c = bq.a(this);
  
  public ap(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public ap(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(go.a(paramContext), paramAttributeSet, paramInt);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
    this.b = ar.a();
    paramContext = gr.a(getContext(), paramAttributeSet, a, paramInt, 0);
    setCheckMarkDrawable(paramContext.a(0));
    paramContext.a();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    if (this.b != null)
    {
      setCheckMarkDrawable(this.b.a(getContext(), paramInt));
      return;
    }
    super.setCheckMarkDrawable(paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.c != null) {
      this.c.a(paramContext, paramInt);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */