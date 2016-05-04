package com.fkzhang.wechatforwarder;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.fkzhang.wechatforwarder.a.d;

class q
  implements AdapterView.OnItemClickListener
{
  q(AutoForwardListActivity paramAutoForwardListActivity, d paramd) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.b(paramInt);
    this.a.notifyDataSetChanged();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */