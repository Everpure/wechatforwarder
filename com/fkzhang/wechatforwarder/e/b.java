package com.fkzhang.wechatforwarder.e;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Locale;

final class b
  implements View.OnClickListener
{
  b(Activity paramActivity) {}
  
  public void onClick(View paramView)
  {
    if (Locale.getDefault().getLanguage().equals("zh"))
    {
      a.a(this.a, Uri.parse("http://www.baidu.com/s?wd=" + a.a() + " 安装xposed框架"));
      return;
    }
    a.a(this.a, Uri.parse("http://www.google.com/search?q=" + a.a() + " install xposed framework"));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */