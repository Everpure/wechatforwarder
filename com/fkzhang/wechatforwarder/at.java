package com.fkzhang.wechatforwarder;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.fkzhang.wechatforwarder.e.d;

class at
  implements RadioGroup.OnCheckedChangeListener
{
  at(MainActivity paramMainActivity) {}
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2131493077: 
      MainActivity.a(this.a).b("watermark_text_place", 1);
      return;
    case 2131493078: 
      MainActivity.a(this.a).b("watermark_text_place", 2);
      return;
    case 2131493079: 
      MainActivity.a(this.a).b("watermark_text_place", 3);
      return;
    }
    MainActivity.a(this.a).b("watermark_text_place", 4);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */