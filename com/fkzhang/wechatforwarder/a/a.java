package com.fkzhang.wechatforwarder.a;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.eg;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.c.c;
import com.fkzhang.wechatforwarder.d.d;
import java.util.ArrayList;

public class a
  extends eg
{
  private final Activity a;
  private com.fkzhang.wechatforwarder.c.b b;
  private c c;
  private ArrayList d;
  
  public a(Activity paramActivity, ArrayList paramArrayList)
  {
    this.d = paramArrayList;
    this.a = paramActivity;
  }
  
  public int a()
  {
    return this.d.size();
  }
  
  public void a(b paramb, int paramInt)
  {
    Object localObject2 = (d)this.d.get(paramInt);
    paramb.m.setText(((d)localObject2).e());
    if (TextUtils.isEmpty(((d)localObject2).h())) {}
    for (Object localObject1 = ((d)localObject2).c();; localObject1 = ((d)localObject2).c() + "|" + ((d)localObject2).h())
    {
      paramb.o.setText(com.fkzhang.wechatforwarder.e.a.b((String)localObject1));
      paramb.n.setText(com.fkzhang.wechatforwarder.e.a.b(((d)localObject2).d()));
      if (((d)localObject2).f() == 1) {
        paramb.p.setCardBackgroundColor(-520554497);
      }
      localObject1 = ((d)localObject2).i();
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        break;
      }
      return;
    }
    localObject1 = ((String)localObject1).split(",");
    localObject2 = new StringBuilder();
    int i = localObject1.length;
    paramInt = 0;
    if (paramInt < i)
    {
      switch (Integer.parseInt(localObject1[paramInt]))
      {
      }
      for (;;)
      {
        paramInt += 1;
        break;
        ((StringBuilder)localObject2).append(this.a.getString(2131099763)).append(",");
        continue;
        ((StringBuilder)localObject2).append(this.a.getString(2131099721)).append(",");
        continue;
        ((StringBuilder)localObject2).append(this.a.getString(2131099779)).append(",");
        continue;
        ((StringBuilder)localObject2).append(this.a.getString(2131099777)).append(",");
        continue;
        ((StringBuilder)localObject2).append(this.a.getString(2131099675)).append(",");
        continue;
        ((StringBuilder)localObject2).append(this.a.getString(2131099717)).append(",");
      }
    }
    paramb.l.setText(((StringBuilder)localObject2).toString());
  }
  
  public void a(com.fkzhang.wechatforwarder.c.b paramb)
  {
    this.b = paramb;
  }
  
  public void a(c paramc)
  {
    this.c = paramc;
  }
  
  public b c(ViewGroup paramViewGroup, int paramInt)
  {
    return new b(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968605, paramViewGroup, false), this.b, this.c);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */