package com.fkzhang.wechatforwarder.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.e.c;
import java.util.ArrayList;
import java.util.HashSet;

public class d
  extends BaseAdapter
  implements Filterable
{
  private HashSet a;
  private boolean b;
  private ArrayList c;
  private LayoutInflater d;
  private Activity e;
  private g f;
  private boolean[] g;
  private ArrayList h;
  
  public d(Activity paramActivity, ArrayList paramArrayList)
  {
    this.c = paramArrayList;
    this.e = paramActivity;
    this.g = new boolean[this.c.size()];
    this.b = true;
    this.a = new HashSet();
  }
  
  public void a()
  {
    this.b = false;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.g[paramInt] = paramBoolean;
    com.fkzhang.wechatforwarder.c.a locala = (com.fkzhang.wechatforwarder.c.a)this.c.get(paramInt);
    if (paramBoolean)
    {
      this.a.add(locala.a());
      return;
    }
    this.a.remove(locala.a());
  }
  
  public void a(ArrayList paramArrayList)
  {
    int j = 0;
    HashSet localHashSet = new HashSet();
    if (this.g != null)
    {
      i = 0;
      while (i < this.g.length)
      {
        if (a(i)) {
          localHashSet.add(((com.fkzhang.wechatforwarder.c.a)this.c.get(i)).a());
        }
        i += 1;
      }
    }
    this.a = new HashSet();
    this.c = paramArrayList;
    this.g = new boolean[this.c.size()];
    int i = j;
    while (i < this.g.length)
    {
      if (localHashSet.contains(((com.fkzhang.wechatforwarder.c.a)this.c.get(i)).a())) {
        a(i, true);
      }
      i += 1;
    }
    notifyDataSetChanged();
  }
  
  public boolean a(int paramInt)
  {
    return this.g[paramInt];
  }
  
  public ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.g.length)
    {
      if (a(i)) {
        localArrayList.add(this.c.get(i));
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public void b(int paramInt)
  {
    if (!a(paramInt)) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool);
      notifyDataSetChanged();
      return;
    }
  }
  
  public boolean c()
  {
    boolean bool2 = false;
    boolean[] arrayOfBoolean = this.g;
    int j = arrayOfBoolean.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (arrayOfBoolean[i] != 0) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public int getCount()
  {
    return this.c.size();
  }
  
  public Filter getFilter()
  {
    return new f(this);
  }
  
  public Object getItem(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.d == null) {
      this.d = ((LayoutInflater)this.e.getSystemService("layout_inflater"));
    }
    if (paramView == null)
    {
      paramView = this.d.inflate(2130968631, null);
      paramViewGroup = new h(null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131493052));
      paramViewGroup.b = ((CheckBox)paramView.findViewById(2131492946));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      com.fkzhang.wechatforwarder.c.a locala = (com.fkzhang.wechatforwarder.c.a)this.c.get(paramInt);
      String str2 = locala.b();
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = locala.a();
      }
      paramViewGroup.a.setText(com.fkzhang.wechatforwarder.e.a.b(str1));
      if (this.b) {
        c.a(this.e, locala.a(), paramViewGroup.a);
      }
      paramViewGroup.b.setChecked(a(paramInt));
      paramViewGroup.b.setOnClickListener(new e(this, paramInt));
      return paramView;
      paramViewGroup = (h)paramView.getTag();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */