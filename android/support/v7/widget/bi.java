package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

class bi
  extends be
{
  private static final int[] b = { 16843074 };
  private final SeekBar c;
  
  bi(SeekBar paramSeekBar, ar paramar)
  {
    super(paramSeekBar, paramar);
    this.c = paramSeekBar;
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    paramAttributeSet = gr.a(this.c.getContext(), paramAttributeSet, b, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.b(0);
    if (localDrawable != null) {
      this.c.setThumb(localDrawable);
    }
    paramAttributeSet.a();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */