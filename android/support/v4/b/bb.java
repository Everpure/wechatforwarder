package android.support.v4.b;

import android.os.Bundle;
import android.support.v4.c.l;
import android.support.v4.c.m;
import android.support.v4.c.n;
import android.support.v4.h.d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class bb
  implements m, n
{
  final int a;
  final Bundle b;
  az c;
  l d;
  boolean e;
  boolean f;
  Object g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  bb n;
  
  void a()
  {
    if ((this.i) && (this.j)) {
      this.h = true;
    }
    do
    {
      do
      {
        return;
      } while (this.h);
      this.h = true;
      if (ba.a) {
        Log.v("LoaderManager", "  Starting: " + this);
      }
      if ((this.d == null) && (this.c != null)) {
        this.d = this.c.a(this.a, this.b);
      }
    } while (this.d == null);
    if ((this.d.getClass().isMemberClass()) && (!Modifier.isStatic(this.d.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
    }
    if (!this.m)
    {
      this.d.a(this.a, this);
      this.d.a(this);
      this.m = true;
    }
    this.d.a();
  }
  
  void a(l paraml, Object paramObject)
  {
    String str;
    if (this.c != null)
    {
      if (ba.a(this.o) == null) {
        break label158;
      }
      str = ba.a(this.o).d.v;
      ba.a(this.o).d.v = "onLoadFinished";
    }
    for (;;)
    {
      try
      {
        if (ba.a) {
          Log.v("LoaderManager", "  onLoadFinished in " + paraml + ": " + paraml.a(paramObject));
        }
        this.c.a(paraml, paramObject);
        if (ba.a(this.o) != null) {
          ba.a(this.o).d.v = str;
        }
        this.f = true;
        return;
      }
      finally
      {
        if (ba.a(this.o) != null) {
          ba.a(this.o).d.v = str;
        }
      }
      label158:
      str = null;
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mArgs=");
    paramPrintWriter.println(this.b);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCallbacks=");
    paramPrintWriter.println(this.c);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    paramPrintWriter.println(this.d);
    if (this.d != null) {
      this.d.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if ((this.e) || (this.f))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHaveData=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print("  mDeliveredData=");
      paramPrintWriter.println(this.f);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(this.g);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mReportNextStart=");
    paramPrintWriter.print(this.k);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.l);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetaining=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mRetainingStarted=");
    paramPrintWriter.print(this.j);
    paramPrintWriter.print(" mListenerRegistered=");
    paramPrintWriter.println(this.m);
    if (this.n != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.n);
      paramPrintWriter.println(":");
      this.n.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  void b()
  {
    if (ba.a) {
      Log.v("LoaderManager", "  Retaining: " + this);
    }
    this.i = true;
    this.j = this.h;
    this.h = false;
    this.c = null;
  }
  
  void c()
  {
    if (this.i)
    {
      if (ba.a) {
        Log.v("LoaderManager", "  Finished Retaining: " + this);
      }
      this.i = false;
      if ((this.h != this.j) && (!this.h)) {
        e();
      }
    }
    if ((this.h) && (this.e) && (!this.k)) {
      a(this.d, this.g);
    }
  }
  
  void d()
  {
    if ((this.h) && (this.k))
    {
      this.k = false;
      if (this.e) {
        a(this.d, this.g);
      }
    }
  }
  
  void e()
  {
    if (ba.a) {
      Log.v("LoaderManager", "  Stopping: " + this);
    }
    this.h = false;
    if ((!this.i) && (this.d != null) && (this.m))
    {
      this.m = false;
      this.d.a(this);
      this.d.b(this);
      this.d.c();
    }
  }
  
  void f()
  {
    if (ba.a) {
      Log.v("LoaderManager", "  Destroying: " + this);
    }
    this.l = true;
    boolean bool = this.f;
    this.f = false;
    String str;
    if ((this.c != null) && (this.d != null) && (this.e) && (bool))
    {
      if (ba.a) {
        Log.v("LoaderManager", "  Reseting: " + this);
      }
      if (ba.a(this.o) == null) {
        break label277;
      }
      str = ba.a(this.o).d.v;
      ba.a(this.o).d.v = "onLoaderReset";
    }
    for (;;)
    {
      try
      {
        this.c.a(this.d);
        if (ba.a(this.o) != null) {
          ba.a(this.o).d.v = str;
        }
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null)
        {
          if (this.m)
          {
            this.m = false;
            this.d.a(this);
            this.d.b(this);
          }
          this.d.e();
        }
        if (this.n != null) {
          this.n.f();
        }
        return;
      }
      finally
      {
        if (ba.a(this.o) != null) {
          ba.a(this.o).d.v = str;
        }
      }
      label277:
      str = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    d.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */