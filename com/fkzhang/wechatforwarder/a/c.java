package com.fkzhang.wechatforwarder.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class c
  extends BaseAdapter
{
  private ArrayList a;
  private Activity b;
  private LayoutInflater c;
  private boolean d;
  
  public c(Activity paramActivity, ArrayList paramArrayList)
  {
    this.a = paramArrayList;
    this.b = paramActivity;
    this.d = true;
  }
  
  public void a()
  {
    this.d = false;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.a = paramArrayList;
    notifyDataSetChanged();
  }
  
  public ArrayList b()
  {
    return this.a;
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.c == null) {
      this.c = ((LayoutInflater)this.b.getSystemService("layout_inflater"));
    }
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = this.c.inflate(2130968630, null);
    }
    com.fkzhang.wechatforwarder.c.a locala = (com.fkzhang.wechatforwarder.c.a)this.a.get(paramInt);
    TextView localTextView = (TextView)paramViewGroup.findViewById(2131493052);
    String str = locala.b();
    paramView = str;
    if (TextUtils.isEmpty(str)) {
      paramView = locala.a();
    }
    localTextView.setText(com.fkzhang.wechatforwarder.e.a.b(paramView));
    if (this.d) {
      com.fkzhang.wechatforwarder.e.c.a(this.b, locala.a(), localTextView);
    }
    return paramViewGroup;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */