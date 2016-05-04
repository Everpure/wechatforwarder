package com.fkzhang.wechatforwarder.a;

import android.support.v7.widget.CardView;
import android.support.v7.widget.fh;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.c.c;

public class b
  extends fh
  implements View.OnClickListener, View.OnLongClickListener
{
  public TextView l;
  public TextView m;
  public TextView n;
  public TextView o;
  public CardView p;
  private com.fkzhang.wechatforwarder.c.b q;
  private c r;
  
  public b(View paramView, com.fkzhang.wechatforwarder.c.b paramb, c paramc)
  {
    super(paramView);
    this.p = ((CardView)paramView.findViewById(2131492971));
    this.o = ((TextView)paramView.findViewById(2131492975));
    this.n = ((TextView)paramView.findViewById(2131492977));
    this.m = ((TextView)paramView.findViewById(2131492973));
    this.l = ((TextView)paramView.findViewById(2131492979));
    this.q = paramb;
    this.r = paramc;
    paramView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (this.q != null) {
      this.q.a(paramView, e());
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    if (this.r != null) {
      this.r.a(paramView, e());
    }
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */