package com.fkzhang.wechatforwarder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.u;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class AutoForwardActivity
  extends u
{
  private Button A;
  private com.fkzhang.wechatforwarder.d.b l;
  private ArrayList m;
  private String n;
  private Switch o;
  private Switch p;
  private Switch q;
  private EditText r;
  private boolean s;
  private Switch t;
  private TextView u;
  private EditText v;
  private TextView w;
  private TextView x;
  private EditText y;
  private com.fkzhang.wechatforwarder.e.d z;
  
  private void k()
  {
    Object localObject1 = (Spinner)findViewById(2131492983);
    this.m = this.l.a();
    if (this.m.isEmpty())
    {
      if (this.z.a("disable_contentprovider", false)) {}
      for (localObject1 = getString(2131099691);; localObject1 = getString(2131099738))
      {
        com.fkzhang.wechatforwarder.e.a.a(this, (String)localObject1);
        return;
      }
    }
    Object localObject2 = new ArrayList();
    int i = 0;
    while (i < this.m.size())
    {
      ((List)localObject2).add(((com.fkzhang.wechatforwarder.d.a)this.m.get(i)).b());
      i += 1;
    }
    localObject2 = new ArrayAdapter(this, 2130968644, (List)localObject2);
    ((ArrayAdapter)localObject2).setDropDownViewResource(17367049);
    ((Spinner)localObject1).setAdapter((SpinnerAdapter)localObject2);
    ((Spinner)localObject1).setSelection(0, false);
    ((Spinner)localObject1).setOnItemSelectedListener(new a(this));
    if (!this.m.isEmpty()) {
      a(((com.fkzhang.wechatforwarder.d.a)this.m.get(0)).a());
    }
    this.o = ((Switch)findViewById(2131492986));
    this.o.setOnCheckedChangeListener(new b(this));
    this.p = ((Switch)findViewById(2131492984));
    this.p.setOnCheckedChangeListener(new c(this));
    this.q = ((Switch)findViewById(2131492985));
    this.q.setOnCheckedChangeListener(new d(this));
    this.r = ((EditText)findViewById(2131492987));
    this.w = ((TextView)findViewById(2131492988));
    this.r.addTextChangedListener(new e(this));
    this.t = ((Switch)findViewById(2131492989));
    this.t.setOnCheckedChangeListener(new f(this));
    this.x = ((TextView)findViewById(2131492993));
    this.y = ((EditText)findViewById(2131492992));
    this.y.addTextChangedListener(new g(this));
    this.u = ((TextView)findViewById(2131492991));
    this.v = ((EditText)findViewById(2131492990));
    this.v.addTextChangedListener(new h(this));
    this.A = ((Button)findViewById(2131492994));
    this.A.setOnClickListener(new i(this));
    l();
  }
  
  private void l()
  {
    if (TextUtils.isEmpty(j())) {}
    label525:
    label546:
    label565:
    for (;;)
    {
      return;
      this.o.setChecked(this.z.a(j() + "_autoforward_enable", false));
      this.p.setChecked(this.z.a(j() + "_auto_scan_contacts_enable", true));
      this.t.setChecked(this.z.a(j() + "_resend_enable", false));
      this.q.setChecked(this.z.a(j() + "_avatar_enable", true));
      this.r.setText(String.valueOf(this.z.a(j() + "_autoforward_delay", 5000) / 1000.0D));
      this.v.setText(String.valueOf(this.z.a(j() + "_resend_delay", 5000) / 1000.0D));
      this.y.setText(String.valueOf(this.z.a(j() + "_resend_max", 5)));
      if (this.z.a(j() + "_resend_enable", false))
      {
        this.u.setVisibility(0);
        this.v.setVisibility(0);
        this.y.setVisibility(0);
        this.x.setVisibility(0);
        if (this.s) {
          break label546;
        }
        if (!this.z.a(j() + "_autoforward_enable", false)) {
          break label525;
        }
        this.w.setVisibility(0);
        this.r.setVisibility(0);
      }
      for (;;)
      {
        if (!this.z.a("disable_contentprovider", false)) {
          break label565;
        }
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.w.setVisibility(8);
        this.r.setVisibility(8);
        this.A.setVisibility(8);
        return;
        this.u.setVisibility(8);
        this.v.setVisibility(8);
        this.y.setVisibility(8);
        this.x.setVisibility(8);
        break;
        this.w.setVisibility(8);
        this.r.setVisibility(8);
        continue;
        this.w.setVisibility(8);
        this.r.setVisibility(8);
      }
    }
  }
  
  private void m()
  {
    Intent localIntent = new Intent(this, AutoForwardListActivity.class);
    localIntent.putExtra("account", j());
    startActivity(localIntent);
  }
  
  public void a(String paramString)
  {
    this.n = paramString;
  }
  
  public String j()
  {
    return this.n;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968601);
    a((Toolbar)findViewById(2131492969));
    this.l = new com.fkzhang.wechatforwarder.d.b(this, new com.fkzhang.wechatforwarder.Data.a("com.fkzhang.wechatforwarder").c());
    this.z = new com.fkzhang.wechatforwarder.e.d(this, "com.fkzhang.wechatforwarder");
    this.s = true;
    k();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/AutoForwardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */