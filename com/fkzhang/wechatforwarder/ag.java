package com.fkzhang.wechatforwarder;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.a.c;
import java.util.ArrayList;

class ag
  implements AdapterView.OnItemClickListener
{
  ag(AutoForwardListActivity paramAutoForwardListActivity, TextView paramTextView, c paramc) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.setText(com.fkzhang.wechatforwarder.e.a.b(String.format(this.c.getString(2131099747), new Object[] { ((com.fkzhang.wechatforwarder.c.a)this.b.b().get(paramInt)).b() })));
    AutoForwardListActivity.a(this.c, ((com.fkzhang.wechatforwarder.c.a)this.b.b().get(paramInt)).a());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */