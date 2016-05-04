package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v4.c.a;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.widget.ImageView;

public class az
{
  private final ImageView a;
  private final ar b;
  
  public az(ImageView paramImageView, ar paramar)
  {
    this.a = paramImageView;
    this.b = paramar;
  }
  
  public void a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.b != null) {}
      for (Drawable localDrawable = this.b.a(this.a.getContext(), paramInt);; localDrawable = a.a(this.a.getContext(), paramInt))
      {
        if (localDrawable != null) {
          cs.a(localDrawable);
        }
        this.a.setImageDrawable(localDrawable);
        return;
      }
    }
    this.a.setImageDrawable(null);
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = gr.a(this.a.getContext(), paramAttributeSet, l.AppCompatImageView, paramInt, 0);
    try
    {
      Drawable localDrawable = paramAttributeSet.b(l.AppCompatImageView_android_src);
      if (localDrawable != null) {
        this.a.setImageDrawable(localDrawable);
      }
      paramInt = paramAttributeSet.g(l.AppCompatImageView_srcCompat, -1);
      if (paramInt != -1)
      {
        localDrawable = this.b.a(this.a.getContext(), paramInt);
        if (localDrawable != null) {
          this.a.setImageDrawable(localDrawable);
        }
      }
      localDrawable = this.a.getDrawable();
      if (localDrawable != null) {
        cs.a(localDrawable);
      }
      return;
    }
    finally
    {
      paramAttributeSet.a();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */