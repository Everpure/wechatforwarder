package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v4.h.q;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class ac
  extends aa
{
  private final Activity a;
  final Context b;
  final int c;
  final af d = new af();
  private final Handler e;
  private q f;
  private boolean g;
  private ba h;
  private boolean i;
  private boolean j;
  
  ac(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramContext;
    this.e = paramHandler;
    this.c = paramInt;
  }
  
  ac(w paramw)
  {
    this(paramw, paramw, paramw.a, 0);
  }
  
  ba a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f == null) {
      this.f = new q();
    }
    ba localba = (ba)this.f.get(paramString);
    if (localba == null)
    {
      if (paramBoolean2)
      {
        localba = new ba(paramString, this, paramBoolean1);
        this.f.put(paramString, localba);
      }
      return localba;
    }
    localba.a(this);
    return localba;
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  void a(q paramq)
  {
    this.f = paramq;
  }
  
  void a(String paramString)
  {
    if (this.f != null)
    {
      ba localba = (ba)this.f.get(paramString);
      if ((localba != null) && (!localba.f))
      {
        localba.h();
        this.f.remove(paramString);
      }
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (this.h == null) {}
    while (!this.j) {
      return;
    }
    this.j = false;
    if (paramBoolean)
    {
      this.h.d();
      return;
    }
    this.h.c();
  }
  
  public boolean a()
  {
    return true;
  }
  
  public boolean a(t paramt)
  {
    return true;
  }
  
  public LayoutInflater b()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }
  
  void b(t paramt) {}
  
  void b(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.j);
    if (this.h != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
      paramPrintWriter.println(":");
      this.h.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public void c() {}
  
  public boolean d()
  {
    return true;
  }
  
  public int e()
  {
    return this.c;
  }
  
  Activity f()
  {
    return this.a;
  }
  
  Context g()
  {
    return this.b;
  }
  
  Handler h()
  {
    return this.e;
  }
  
  af i()
  {
    return this.d;
  }
  
  boolean j()
  {
    return this.g;
  }
  
  void k()
  {
    if (this.j) {
      return;
    }
    this.j = true;
    if (this.h != null) {
      this.h.b();
    }
    for (;;)
    {
      this.i = true;
      return;
      if (!this.i)
      {
        this.h = a("(root)", this.j, false);
        if ((this.h != null) && (!this.h.e)) {
          this.h.b();
        }
      }
    }
  }
  
  void l()
  {
    if (this.h == null) {
      return;
    }
    this.h.h();
  }
  
  void m()
  {
    if (this.f != null)
    {
      int m = this.f.size();
      ba[] arrayOfba = new ba[m];
      int k = m - 1;
      while (k >= 0)
      {
        arrayOfba[k] = ((ba)this.f.c(k));
        k -= 1;
      }
      k = 0;
      while (k < m)
      {
        ba localba = arrayOfba[k];
        localba.e();
        localba.g();
        k += 1;
      }
    }
  }
  
  q n()
  {
    int m = 0;
    int n;
    if (this.f != null)
    {
      int i1 = this.f.size();
      ba[] arrayOfba = new ba[i1];
      int k = i1 - 1;
      while (k >= 0)
      {
        arrayOfba[k] = ((ba)this.f.c(k));
        k -= 1;
      }
      k = 0;
      n = k;
      if (m < i1)
      {
        ba localba = arrayOfba[m];
        if (localba.f) {
          k = 1;
        }
        for (;;)
        {
          m += 1;
          break;
          localba.h();
          this.f.remove(localba.d);
        }
      }
    }
    else
    {
      n = 0;
    }
    if (n != 0) {
      return this.f;
    }
    return null;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */