package com.rarepebble.colorpicker;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class c
  implements TextWatcher, f
{
  c(EditText paramEditText, e parame) {}
  
  private String a(int paramInt)
  {
    if (a()) {
      return String.format("%06x", new Object[] { Integer.valueOf(0xFFFFFF & paramInt) });
    }
    return String.format("%08x", new Object[] { Integer.valueOf(paramInt) });
  }
  
  private boolean a()
  {
    return this.a.getFilters() == a.a();
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void b(e parame)
  {
    parame = a(parame.a());
    this.a.removeTextChangedListener(this);
    this.a.setText(parame);
    this.a.addTextChangedListener(this);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramInt2 = (int)(Long.parseLong(paramCharSequence.toString(), 16) & 0xFFFFFFFFFFFFFFFF);
      paramInt1 = paramInt2;
      if (a()) {
        paramInt1 = paramInt2 | 0xFF000000;
      }
      this.b.b(paramInt1, this);
      return;
    }
    catch (NumberFormatException paramCharSequence)
    {
      this.b.b(0, this);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */