package com.fkzhang.wechatforwarder;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.ArrayList;

class a
  implements AdapterView.OnItemSelectedListener
{
  a(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a(((com.fkzhang.wechatforwarder.d.a)AutoForwardActivity.a(this.a).get(paramInt)).a());
    AutoForwardActivity.b(this.a);
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */