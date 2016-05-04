package com.fkzhang.wechatforwarder;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.fkzhang.wechatforwarder.e.a;

class bk
  implements AdapterView.OnItemClickListener
{
  bk(SupportActivity paramSupportActivity, Activity paramActivity) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Intent();
    paramAdapterView.setFlags(268435456);
    a.a(this.a, this.b.getString(2131099727), 1);
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramAdapterView.setClassName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
      paramAdapterView.putExtra("fkzhang", true);
      try
      {
        this.b.startActivity(paramAdapterView);
        return;
      }
      catch (Throwable paramAdapterView)
      {
        return;
      }
    case 1: 
      ((ClipboardManager)this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", "#吱口令#L4nvxp69Ix"));
      paramAdapterView.setClassName("com.eg.android.AlipayGphone", "com.alipay.mobile.quinox.LauncherActivity");
      try
      {
        this.b.startActivity(paramAdapterView);
        return;
      }
      catch (Throwable paramAdapterView)
      {
        return;
      }
    }
    a.a(this.a, Uri.parse("https://www.paypal.me/fkzhang"));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */