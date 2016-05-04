package android.support.v4.c;

import android.support.v4.h.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class l
{
  int a;
  n b;
  m c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  
  public String a(Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(paramObject, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void a()
  {
    this.d = true;
    this.f = false;
    this.e = false;
    b();
  }
  
  public void a(int paramInt, n paramn)
  {
    if (this.b != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.b = paramn;
    this.a = paramInt;
  }
  
  public void a(m paramm)
  {
    if (this.c != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.c = paramm;
  }
  
  public void a(n paramn)
  {
    if (this.b == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.b != paramn) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.b = null;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if ((this.d) || (this.g) || (this.h))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.d);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.g);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.h);
    }
    if ((this.e) || (this.f))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.f);
    }
  }
  
  protected void b() {}
  
  public void b(m paramm)
  {
    if (this.c == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.c != paramm) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.c = null;
  }
  
  public void c()
  {
    this.d = false;
    d();
  }
  
  protected void d() {}
  
  public void e()
  {
    f();
    this.f = true;
    this.d = false;
    this.e = false;
    this.g = false;
    this.h = false;
  }
  
  protected void f() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */