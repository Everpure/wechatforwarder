package com.rarepebble.colorpicker;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;

class d
  implements InputFilter
{
  private final InputFilter a = new InputFilter.LengthFilter(6);
  
  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    if ((paramInt2 - paramInt1 == 8) && (paramInt4 - paramInt3 == paramSpanned.length())) {
      return paramCharSequence.subSequence(2, 8);
    }
    return this.a.filter(paramCharSequence, paramInt1, paramInt2, paramSpanned, paramInt3, paramInt4);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */