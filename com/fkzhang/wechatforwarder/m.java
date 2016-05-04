package com.fkzhang.wechatforwarder;

import android.text.TextUtils;
import android.widget.ListView;
import android.widget.SearchView.OnQueryTextListener;

class m
  implements SearchView.OnQueryTextListener
{
  m(AutoForwardListActivity paramAutoForwardListActivity, ListView paramListView) {}
  
  public boolean onQueryTextChange(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      this.a.clearTextFilter();
    }
    for (;;)
    {
      return true;
      this.a.setFilterText(paramString);
    }
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */