package com.fkzhang.wechatforwarder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.d.b;
import com.fkzhang.wechatforwarder.d.e;
import com.fkzhang.wechatforwarder.d.f;
import com.fkzhang.wechatforwarder.d.g;
import com.fkzhang.wechatforwarder.d.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AutoForwardListActivity
  extends android.support.v7.a.u
{
  private TextView A;
  private String B;
  private String C;
  private String D;
  private CheckBox E;
  private CheckBox F;
  private CheckBox G;
  private CheckBox H;
  private CheckBox I;
  private CheckBox J;
  private h K;
  private ArrayList L;
  private HashMap M;
  private String N;
  private String O;
  private boolean P;
  private com.fkzhang.wechatforwarder.e.d Q;
  private com.fkzhang.wechatforwarder.d.c l;
  private f m;
  private b n;
  private HashMap o;
  private HashMap p;
  private ArrayList q;
  private String r;
  private RecyclerView s;
  private ArrayList t;
  private ArrayList u;
  private com.fkzhang.wechatforwarder.a.a v;
  private Switch w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  private void a(int paramInt)
  {
    com.fkzhang.wechatforwarder.d.d locald = (com.fkzhang.wechatforwarder.d.d)this.u.get(paramInt);
    if (!TextUtils.isEmpty(locald.b())) {
      this.l.b(locald);
    }
    this.u.remove(paramInt);
    if (this.v != null) {
      this.v.c();
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    this.q = this.n.a();
    if (this.q.isEmpty())
    {
      com.fkzhang.wechatforwarder.e.a.a(this, getString(2131099738));
      return;
    }
    View localView = getLayoutInflater().inflate(2130968624, null);
    this.x = ((TextView)localView.findViewById(2131492975));
    this.y = ((TextView)localView.findViewById(2131492977));
    this.z = ((TextView)localView.findViewById(2131493043));
    this.z.setVisibility(8);
    this.A = ((TextView)localView.findViewById(2131493042));
    this.A.setVisibility(8);
    this.w = ((Switch)localView.findViewById(2131493041));
    this.E = ((CheckBox)localView.findViewById(2131493045));
    this.F = ((CheckBox)localView.findViewById(2131493046));
    this.G = ((CheckBox)localView.findViewById(2131493047));
    this.H = ((CheckBox)localView.findViewById(2131493048));
    this.I = ((CheckBox)localView.findViewById(2131493049));
    this.J = ((CheckBox)localView.findViewById(2131493050));
    this.p.clear();
    Object localObject1 = this.q.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.fkzhang.wechatforwarder.d.a)((Iterator)localObject1).next();
      this.p.put(((com.fkzhang.wechatforwarder.d.a)localObject2).a(), localObject2);
    }
    this.B = null;
    this.C = null;
    this.D = null;
    this.N = null;
    this.O = null;
    if (paramInt2 != -1)
    {
      localObject1 = (com.fkzhang.wechatforwarder.d.d)this.u.get(paramInt2);
      this.x.setText(com.fkzhang.wechatforwarder.e.a.b(((com.fkzhang.wechatforwarder.d.d)localObject1).c()));
      if (!TextUtils.isEmpty(((com.fkzhang.wechatforwarder.d.d)localObject1).h()))
      {
        this.z.setVisibility(0);
        this.A.setVisibility(0);
        this.z.setText(com.fkzhang.wechatforwarder.e.a.b(((com.fkzhang.wechatforwarder.d.d)localObject1).h()));
        this.B = ((com.fkzhang.wechatforwarder.d.d)localObject1).g();
        this.O = ((com.fkzhang.wechatforwarder.d.d)localObject1).h();
      }
      this.y.setText(com.fkzhang.wechatforwarder.e.a.b(((com.fkzhang.wechatforwarder.d.d)localObject1).d()));
      this.C = ((com.fkzhang.wechatforwarder.d.d)localObject1).b();
      this.D = ((com.fkzhang.wechatforwarder.d.d)localObject1).a();
      this.N = ((com.fkzhang.wechatforwarder.d.d)localObject1).d();
      if ((!this.P) && (!TextUtils.isEmpty(this.C)) && (this.C.endsWith("@chatroom")) && (TextUtils.isEmpty(this.B)))
      {
        this.z.setVisibility(0);
        this.A.setVisibility(0);
        this.z.setText(2131099683);
      }
      if (!this.P)
      {
        localObject2 = this.w;
        if (((com.fkzhang.wechatforwarder.d.d)localObject1).f() != 1) {
          break label686;
        }
      }
    }
    for (;;)
    {
      ((Switch)localObject2).setChecked(bool);
      c(((com.fkzhang.wechatforwarder.d.d)localObject1).i());
      if (this.P) {
        this.w.setVisibility(8);
      }
      if (TextUtils.isEmpty(this.C)) {
        this.x.setText(2131099683);
      }
      if (TextUtils.isEmpty(this.D)) {
        this.y.setText(2131099683);
      }
      this.z.setOnClickListener(new y(this));
      this.x.setOnClickListener(new z(this));
      this.y.setOnClickListener(new aa(this));
      new android.support.v7.a.t(this).b(localView).a(paramInt1).a(17039379, new ac(this)).b(17039369, new ab(this)).b().show();
      return;
      label686:
      bool = false;
    }
  }
  
  private void a(com.fkzhang.wechatforwarder.d.d paramd)
  {
    this.u.add(paramd);
    if (!TextUtils.isEmpty(paramd.b())) {
      this.l.c(paramd);
    }
    if (this.v != null) {
      this.v.c();
    }
  }
  
  private int b(String paramString)
  {
    int i = 0;
    while (i < this.u.size())
    {
      com.fkzhang.wechatforwarder.d.d locald = (com.fkzhang.wechatforwarder.d.d)this.u.get(i);
      if ((!TextUtils.isEmpty(locald.b())) && (locald.b().equals(paramString))) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  private void b(int paramInt)
  {
    new android.support.v7.a.t(this).a(2131099688).b(2131099689).a(17039379, new af(this, paramInt)).b(17039369, new ae(this)).b().show();
  }
  
  private void c(int paramInt)
  {
    com.fkzhang.wechatforwarder.d.d locald = (com.fkzhang.wechatforwarder.d.d)this.u.get(paramInt);
    if (this.C.endsWith("@chatroom")) {}
    for (String str = ((e)this.o.get(this.C)).b();; str = ((g)this.M.get(this.C)).b())
    {
      locald.b(this.C);
      locald.c(str);
      locald.a(this.D);
      locald.d(this.N);
      locald.e(this.B);
      locald.f(this.O);
      locald.g(r());
      if (!this.P) {
        break;
      }
      locald.a(1);
      this.l.a(locald);
      this.v.c();
      return;
    }
    if (this.w.isChecked()) {}
    for (paramInt = 1;; paramInt = 0)
    {
      locald.a(paramInt);
      break;
    }
  }
  
  private void c(String paramString)
  {
    int i = 0;
    this.E.setChecked(false);
    this.F.setChecked(false);
    this.H.setChecked(false);
    this.G.setChecked(false);
    this.I.setChecked(false);
    this.J.setChecked(false);
    if (TextUtils.isEmpty(paramString)) {}
    int j;
    do
    {
      return;
      paramString = paramString.split(",");
      j = paramString.length;
    } while (i >= j);
    switch (Integer.parseInt(paramString[i]))
    {
    }
    for (;;)
    {
      i += 1;
      break;
      this.E.setChecked(true);
      continue;
      this.F.setChecked(true);
      continue;
      this.H.setChecked(true);
      continue;
      this.G.setChecked(true);
      continue;
      this.I.setChecked(true);
      continue;
      this.J.setChecked(true);
    }
  }
  
  private void k()
  {
    this.s = ((RecyclerView)findViewById(2131492995));
    LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager(this);
    this.s.setLayoutManager(localLinearLayoutManager);
    m();
  }
  
  private void l()
  {
    if ((this.P) && (!TextUtils.isEmpty(j())) && (this.u.isEmpty()))
    {
      this.p.clear();
      Iterator localIterator = this.q.iterator();
      while (localIterator.hasNext())
      {
        com.fkzhang.wechatforwarder.d.a locala = (com.fkzhang.wechatforwarder.d.a)localIterator.next();
        this.p.put(locala.a(), locala);
      }
      a(new com.fkzhang.wechatforwarder.d.d(j(), null, null, null, null, ((com.fkzhang.wechatforwarder.d.a)this.p.get(j())).b(), null, null, null, 1));
    }
  }
  
  private void m()
  {
    Object localObject1 = j();
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return;
    }
    this.l.a((String)localObject1);
    this.K.a((String)localObject1);
    this.L = this.K.a();
    this.M.clear();
    Object localObject2 = this.L.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      g localg = (g)((Iterator)localObject2).next();
      this.M.put(localg.a(), localg);
    }
    this.o.clear();
    this.m.a((String)localObject1);
    this.t = this.m.a();
    localObject1 = this.t.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (e)((Iterator)localObject1).next();
      this.o.put(((e)localObject2).a(), localObject2);
    }
    this.u = this.l.a();
    if (this.P)
    {
      int i;
      if (this.u.size() > 1)
      {
        i = 1;
        while (i < this.u.size())
        {
          a(i);
          i += 1;
        }
      }
      localObject1 = this.u.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.fkzhang.wechatforwarder.d.d)((Iterator)localObject1).next();
        i = ((com.fkzhang.wechatforwarder.d.d)localObject2).a().indexOf(",");
        if (i != -1) {
          ((com.fkzhang.wechatforwarder.d.d)localObject2).a(((com.fkzhang.wechatforwarder.d.d)localObject2).a().substring(0, i));
        }
        i = ((com.fkzhang.wechatforwarder.d.d)localObject2).d().indexOf(",");
        if (i != -1) {
          ((com.fkzhang.wechatforwarder.d.d)localObject2).d(((com.fkzhang.wechatforwarder.d.d)localObject2).d().substring(0, i));
        }
        ((com.fkzhang.wechatforwarder.d.d)localObject2).e(null);
        ((com.fkzhang.wechatforwarder.d.d)localObject2).f(null);
        this.l.a((com.fkzhang.wechatforwarder.d.d)localObject2);
      }
    }
    this.v = new com.fkzhang.wechatforwarder.a.a(this, this.u);
    this.v.a(new u(this));
    if (!this.P) {
      this.v.a(new ad(this));
    }
    if (this.v != null) {
      this.s.setAdapter(this.v);
    }
    l();
  }
  
  private void n()
  {
    if (TextUtils.isEmpty(j())) {
      return;
    }
    View localView = getLayoutInflater().inflate(2130968626, null);
    ListView localListView = (ListView)localView.findViewById(2131493058);
    Object localObject1 = (TextView)localView.findViewById(2131493052);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject2 = this.L.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (g)((Iterator)localObject2).next();
      localArrayList1.add(localObject3);
      if (((g)localObject3).a().endsWith("@chatroom")) {
        localArrayList2.add(localObject3);
      } else {
        localArrayList3.add(localObject3);
      }
    }
    localObject2 = this.C;
    Object localObject3 = new com.fkzhang.wechatforwarder.a.c(this, localArrayList1);
    if (!s()) {
      ((com.fkzhang.wechatforwarder.a.c)localObject3).a();
    }
    localListView.setAdapter((ListAdapter)localObject3);
    localListView.setOnItemClickListener(new ag(this, (TextView)localObject1, (com.fkzhang.wechatforwarder.a.c)localObject3));
    localObject1 = (SearchView)localView.findViewById(2131493057);
    ((SearchView)localObject1).setIconifiedByDefault(false);
    ((SearchView)localObject1).setSubmitButtonEnabled(true);
    ((SearchView)localObject1).setQueryHint(getString(2131099741));
    localListView.setTextFilterEnabled(true);
    ((SearchView)localObject1).setOnQueryTextListener(new ah(this, localListView));
    ((RadioGroup)localView.findViewById(2131493053)).setOnCheckedChangeListener(new ai(this, (com.fkzhang.wechatforwarder.a.c)localObject3, localArrayList3, localArrayList2, localArrayList1));
    new android.support.v7.a.t(this).b(localView).a(2131099745).a(17039379, new k(this)).b(17039369, new aj(this, (String)localObject2)).b().show();
  }
  
  private void o()
  {
    if ((TextUtils.isEmpty(this.C)) || (TextUtils.isEmpty(j())))
    {
      com.fkzhang.wechatforwarder.e.a.a(this, getString(2131099740));
      return;
    }
    View localView = getLayoutInflater().inflate(2130968626, null);
    ListView localListView = (ListView)localView.findViewById(2131493058);
    Object localObject1 = (TextView)localView.findViewById(2131493052);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject2 = this.L.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (g)((Iterator)localObject2).next();
      if ((!((g)localObject3).a().equals(j())) && (!((g)localObject3).a().equals(this.C)))
      {
        localArrayList1.add(localObject3);
        if (((g)localObject3).a().endsWith("@chatroom")) {
          localArrayList2.add(localObject3);
        } else {
          localArrayList3.add(localObject3);
        }
      }
    }
    localObject2 = this.D;
    Object localObject3 = new com.fkzhang.wechatforwarder.a.c(this, localArrayList1);
    if (!s()) {
      ((com.fkzhang.wechatforwarder.a.c)localObject3).a();
    }
    localListView.setAdapter((ListAdapter)localObject3);
    localListView.setOnItemClickListener(new l(this, (TextView)localObject1, (com.fkzhang.wechatforwarder.a.c)localObject3));
    localObject1 = (SearchView)localView.findViewById(2131493057);
    ((SearchView)localObject1).setIconifiedByDefault(false);
    ((SearchView)localObject1).setSubmitButtonEnabled(true);
    ((SearchView)localObject1).setQueryHint(getString(2131099741));
    localListView.setTextFilterEnabled(true);
    ((SearchView)localObject1).setOnQueryTextListener(new m(this, localListView));
    ((RadioGroup)localView.findViewById(2131493053)).setOnCheckedChangeListener(new n(this, (com.fkzhang.wechatforwarder.a.c)localObject3, localArrayList3, localArrayList2, localArrayList1));
    new android.support.v7.a.t(this).b(localView).a(2131099746).a(17039379, new p(this)).b(17039369, new o(this, (String)localObject2)).b().show();
  }
  
  private void p()
  {
    int j = 0;
    if ((TextUtils.isEmpty(this.C)) || (TextUtils.isEmpty(j())))
    {
      com.fkzhang.wechatforwarder.e.a.a(this, getString(2131099740));
      return;
    }
    View localView = getLayoutInflater().inflate(2130968626, null);
    ListView localListView = (ListView)localView.findViewById(2131493058);
    ((TextView)localView.findViewById(2131493052)).setVisibility(8);
    localView.findViewById(2131493057).setVisibility(8);
    localView.findViewById(2131493053).setVisibility(8);
    Object localObject1 = (e)this.o.get(this.C);
    Object localObject2 = ((e)localObject1).d().split(";");
    String[] arrayOfString = ((e)localObject1).c().split(";");
    localObject1 = new ArrayList();
    ((ArrayList)localObject1).add(this.p.get(j()));
    int i = 0;
    while (i < localObject2.length)
    {
      ((ArrayList)localObject1).add(new g(arrayOfString[i], localObject2[i]));
      i += 1;
    }
    localObject2 = new com.fkzhang.wechatforwarder.a.d(this, (ArrayList)localObject1);
    if (!s()) {
      ((com.fkzhang.wechatforwarder.a.d)localObject2).a();
    }
    localListView.setAdapter((ListAdapter)localObject2);
    if (!TextUtils.isEmpty(this.B))
    {
      arrayOfString = this.B.split(";");
      HashSet localHashSet = new HashSet();
      Collections.addAll(localHashSet, arrayOfString);
      i = j;
      while (i < ((ArrayList)localObject1).size())
      {
        if (localHashSet.contains(((com.fkzhang.wechatforwarder.c.a)((ArrayList)localObject1).get(i)).a())) {
          ((com.fkzhang.wechatforwarder.a.d)localObject2).a(i, true);
        }
        i += 1;
      }
      ((com.fkzhang.wechatforwarder.a.d)localObject2).notifyDataSetChanged();
    }
    localListView.setOnItemClickListener(new q(this, (com.fkzhang.wechatforwarder.a.d)localObject2));
    new android.support.v7.a.t(this).b(localView).a(2131099745).a(17039379, new s(this, (com.fkzhang.wechatforwarder.a.d)localObject2)).b(17039369, new r(this)).b().show();
  }
  
  private void q()
  {
    if ((TextUtils.isEmpty(this.C)) || (TextUtils.isEmpty(j())))
    {
      com.fkzhang.wechatforwarder.e.a.a(this, getString(2131099740));
      return;
    }
    View localView = getLayoutInflater().inflate(2130968626, null);
    ListView localListView = (ListView)localView.findViewById(2131493058);
    localListView.setTextFilterEnabled(true);
    ((TextView)localView.findViewById(2131493052)).setVisibility(8);
    localView.findViewById(2131493057).setVisibility(8);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject1 = this.L.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (g)((Iterator)localObject1).next();
      if ((!((g)localObject2).a().equals(j())) && (!((g)localObject2).a().equals(this.C)))
      {
        localArrayList1.add(localObject2);
        if (((g)localObject2).a().endsWith("@chatroom")) {
          localArrayList2.add(localObject2);
        } else {
          localArrayList3.add(localObject2);
        }
      }
    }
    localObject1 = new com.fkzhang.wechatforwarder.a.d(this, localArrayList1);
    if (!s()) {
      ((com.fkzhang.wechatforwarder.a.d)localObject1).a();
    }
    localListView.setAdapter((ListAdapter)localObject1);
    if (!TextUtils.isEmpty(this.D))
    {
      localObject2 = this.D.split(",");
      HashSet localHashSet = new HashSet();
      Collections.addAll(localHashSet, (Object[])localObject2);
      int i = 0;
      while (i < localArrayList1.size())
      {
        if (localHashSet.contains(((com.fkzhang.wechatforwarder.c.a)localArrayList1.get(i)).a())) {
          ((com.fkzhang.wechatforwarder.a.d)localObject1).a(i, true);
        }
        i += 1;
      }
      ((com.fkzhang.wechatforwarder.a.d)localObject1).notifyDataSetChanged();
    }
    localListView.setOnItemClickListener(new t(this, (com.fkzhang.wechatforwarder.a.d)localObject1));
    ((RadioGroup)localView.findViewById(2131493053)).setOnCheckedChangeListener(new v(this, (com.fkzhang.wechatforwarder.a.d)localObject1, localArrayList3, localArrayList2, localArrayList1));
    new android.support.v7.a.t(this).b(localView).a(2131099746).a(17039379, new x(this, (com.fkzhang.wechatforwarder.a.d)localObject1)).b(17039369, new w(this)).b().show();
  }
  
  private String r()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.E.isChecked()) {
      localStringBuilder.append("0,");
    }
    if (this.F.isChecked()) {
      localStringBuilder.append("1,");
    }
    if (this.H.isChecked()) {
      localStringBuilder.append("2,");
    }
    if (this.G.isChecked()) {
      localStringBuilder.append("3,");
    }
    if (this.I.isChecked()) {
      localStringBuilder.append("4,");
    }
    if (this.J.isChecked()) {
      localStringBuilder.append("5,");
    }
    return localStringBuilder.toString();
  }
  
  private boolean s()
  {
    return this.Q.a(j() + "_avatar_enable", true);
  }
  
  public void a(String paramString)
  {
    this.r = paramString;
  }
  
  public String j()
  {
    return this.r;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968602);
    a((Toolbar)findViewById(2131492969));
    paramBundle = new com.fkzhang.wechatforwarder.Data.a("com.fkzhang.wechatforwarder");
    this.l = new com.fkzhang.wechatforwarder.d.c(this, paramBundle.d());
    this.m = new f(this, paramBundle.b());
    this.n = new b(this, paramBundle.c());
    this.K = new h(this, paramBundle.a());
    this.o = new HashMap();
    this.p = new HashMap();
    this.M = new HashMap();
    this.Q = new com.fkzhang.wechatforwarder.e.d(this, "com.fkzhang.wechatforwarder");
    this.P = true;
    a(getIntent().getStringExtra("account"));
    k();
    paramBundle = (FloatingActionButton)findViewById(2131492970);
    if (this.P)
    {
      paramBundle.setVisibility(8);
      return;
    }
    paramBundle.setOnClickListener(new j(this));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/AutoForwardListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */