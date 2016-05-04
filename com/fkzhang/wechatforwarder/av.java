package com.fkzhang.wechatforwarder;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.fkzhang.wechatforwarder.e.d;

class av
  implements SeekBar.OnSeekBarChangeListener
{
  av(MainActivity paramMainActivity) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    paramInt = (int)(paramInt / 100.0D * 254.0D);
    MainActivity.a(this.a).b("watermark_img_alpha", paramInt);
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */