package com.rarepebble.colorpicker;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;

public class ColorPickerView
  extends FrameLayout
{
  private final AlphaView a;
  private final EditText b;
  private final e c = new e(0);
  private final SwatchView d;
  
  public ColorPickerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ColorPickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(j.picker, this);
    this.d = ((SwatchView)findViewById(i.swatchView));
    this.d.a(this.c);
    ((HueSatView)findViewById(i.hueSatView)).a(this.c);
    ((ValueView)findViewById(i.valueView)).a(this.c);
    this.a = ((AlphaView)findViewById(i.alphaView));
    this.a.a(this.c);
    this.b = ((EditText)findViewById(i.hexEdit));
    a.a(this.b, this.c);
    a(paramAttributeSet);
  }
  
  void a(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().getTheme().obtainStyledAttributes(paramAttributeSet, k.ColorPicker, 0, 0);
      a(paramAttributeSet.getBoolean(k.ColorPicker_colorpicker_showAlpha, true));
      b(paramAttributeSet.getBoolean(k.ColorPicker_colorpicker_showHex, true));
    }
  }
  
  public void a(boolean paramBoolean)
  {
    AlphaView localAlphaView = this.a;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localAlphaView.setVisibility(i);
      a.a(this.b, paramBoolean);
      return;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    EditText localEditText = this.b;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localEditText.setVisibility(i);
      return;
    }
  }
  
  public int getColor()
  {
    return this.c.a();
  }
  
  public void setColor(int paramInt)
  {
    setOriginalColor(paramInt);
    setCurrentColor(paramInt);
  }
  
  public void setCurrentColor(int paramInt)
  {
    this.c.b(paramInt, null);
  }
  
  public void setOriginalColor(int paramInt)
  {
    this.d.setOriginalColor(paramInt);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/rarepebble/colorpicker/ColorPickerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */