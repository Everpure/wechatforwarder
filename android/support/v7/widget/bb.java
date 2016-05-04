package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.i.bo;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

public class bb
  extends MultiAutoCompleteTextView
  implements bo
{
  private static final int[] a = { 16843126 };
  private ar b = ar.a();
  private am c;
  private bq d;
  
  public bb(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.autoCompleteTextViewStyle);
  }
  
  public bb(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(go.a(paramContext), paramAttributeSet, paramInt);
    paramContext = gr.a(getContext(), paramAttributeSet, a, paramInt, 0);
    if (paramContext.f(0)) {
      setDropDownBackgroundDrawable(paramContext.a(0));
    }
    paramContext.a();
    this.c = new am(this, this.b);
    this.c.a(paramAttributeSet, paramInt);
    this.d = bq.a(this);
    this.d.a(paramAttributeSet, paramInt);
    this.d.a();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.c != null) {
      this.c.c();
    }
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.c != null) {
      return this.c.a();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.c != null) {
      return this.c.b();
    }
    return null;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.c != null) {
      this.c.a(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.c != null) {
      this.c.a(paramInt);
    }
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    if (this.b != null)
    {
      setDropDownBackgroundDrawable(this.b.a(getContext(), paramInt));
      return;
    }
    super.setDropDownBackgroundResource(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.c != null) {
      this.c.a(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.c != null) {
      this.c.a(paramMode);
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.d != null) {
      this.d.a(paramContext, paramInt);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */