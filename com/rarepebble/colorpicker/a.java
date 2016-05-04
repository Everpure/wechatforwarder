package com.rarepebble.colorpicker;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.widget.EditText;

class a
{
  private static InputFilter[] a = { new d(null) };
  private static InputFilter[] b = { new InputFilter.LengthFilter(8) };
  
  public static void a(EditText paramEditText, e parame)
  {
    c localc = new c(paramEditText, parame);
    paramEditText.addTextChangedListener(localc);
    parame.a(localc);
    a(paramEditText, true);
  }
  
  public static void a(EditText paramEditText, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (InputFilter[] arrayOfInputFilter = b;; arrayOfInputFilter = a)
    {
      paramEditText.setFilters(arrayOfInputFilter);
      paramEditText.setText(paramEditText.getText());
      return;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */