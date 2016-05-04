package com.fkzhang.wechatforwarder;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.fkzhang.wechatforwarder.e.c;
import com.fkzhang.wechatforwarder.e.d;

class ba
  implements Runnable
{
  ba(MainActivity paramMainActivity) {}
  
  public void run()
  {
    if (MainActivity.f(this.a) == null) {
      return;
    }
    int i = MainActivity.a(this.a).a("watermark_text_size", 50);
    int j = MainActivity.a(this.a).a("watermark_text_color", -65436);
    String str = MainActivity.a(this.a).a("img_watermark_text", "");
    int k = MainActivity.a(this.a).a("watermark_text_place", 1);
    int m = MainActivity.a(this.a).a("watermark_img_place", 4);
    int n = MainActivity.a(this.a).a("watermark_img_alpha", 100);
    Bitmap localBitmap = MainActivity.g(this.a);
    if (MainActivity.a(this.a).a("disable_contentprovider", false)) {
      localBitmap = null;
    }
    localBitmap = c.a(MainActivity.f(this.a), localBitmap, str, j, n, m, k, i);
    MainActivity.h(this.a).setImageBitmap(localBitmap);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */