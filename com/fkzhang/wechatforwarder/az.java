package com.fkzhang.wechatforwarder;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.fkzhang.wechatforwarder.e.d;
import com.rarepebble.colorpicker.ColorPickerView;

class az
  implements DialogInterface.OnClickListener
{
  az(MainActivity paramMainActivity, ColorPickerView paramColorPickerView) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MainActivity.a(this.b).b("watermark_text_color", this.a.getColor());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */