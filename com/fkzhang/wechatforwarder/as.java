package com.fkzhang.wechatforwarder;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.fkzhang.wechatforwarder.e.d;

class as
  implements RadioGroup.OnCheckedChangeListener
{
  as(MainActivity paramMainActivity) {}
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2131493066: 
      MainActivity.a(this.a).b("watermark_img_place", 1);
      return;
    case 2131493067: 
      MainActivity.a(this.a).b("watermark_img_place", 2);
      return;
    case 2131493068: 
      MainActivity.a(this.a).b("watermark_img_place", 3);
      return;
    }
    MainActivity.a(this.a).b("watermark_img_place", 4);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */