package android.support.v4.b;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.h.q;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ab
{
  private final ac a;
  
  private ab(ac paramac)
  {
    this.a = paramac;
  }
  
  public static final ab a(ac paramac)
  {
    return new ab(paramac);
  }
  
  public ad a()
  {
    return this.a.i();
  }
  
  t a(String paramString)
  {
    return this.a.d.b(paramString);
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.d.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public List a(List paramList)
  {
    if (this.a.d.f == null) {
      return null;
    }
    Object localObject = paramList;
    if (paramList == null) {
      localObject = new ArrayList(b());
    }
    ((List)localObject).addAll(this.a.d.f);
    return (List)localObject;
  }
  
  public void a(Configuration paramConfiguration)
  {
    this.a.d.a(paramConfiguration);
  }
  
  public void a(Parcelable paramParcelable, List paramList)
  {
    this.a.d.a(paramParcelable, paramList);
  }
  
  public void a(t paramt)
  {
    this.a.d.a(this.a, this.a, paramt);
  }
  
  public void a(q paramq)
  {
    this.a.a(paramq);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.b(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public boolean a(Menu paramMenu)
  {
    return this.a.d.a(paramMenu);
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    return this.a.d.a(paramMenu, paramMenuInflater);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return this.a.d.a(paramMenuItem);
  }
  
  public int b()
  {
    ArrayList localArrayList = this.a.d.f;
    if (localArrayList == null) {
      return 0;
    }
    return localArrayList.size();
  }
  
  public void b(Menu paramMenu)
  {
    this.a.d.b(paramMenu);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return this.a.d.b(paramMenuItem);
  }
  
  public void c()
  {
    this.a.d.h();
  }
  
  public Parcelable d()
  {
    return this.a.d.g();
  }
  
  public List e()
  {
    return this.a.d.f();
  }
  
  public void f()
  {
    this.a.d.i();
  }
  
  public void g()
  {
    this.a.d.j();
  }
  
  public void h()
  {
    this.a.d.k();
  }
  
  public void i()
  {
    this.a.d.l();
  }
  
  public void j()
  {
    this.a.d.m();
  }
  
  public void k()
  {
    this.a.d.n();
  }
  
  public void l()
  {
    this.a.d.o();
  }
  
  public void m()
  {
    this.a.d.q();
  }
  
  public void n()
  {
    this.a.d.r();
  }
  
  public boolean o()
  {
    return this.a.d.d();
  }
  
  public void p()
  {
    this.a.k();
  }
  
  public void q()
  {
    this.a.l();
  }
  
  public void r()
  {
    this.a.m();
  }
  
  public q s()
  {
    return this.a.n();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */