package android.support.v4.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class y
  extends ac
{
  public y(w paramw)
  {
    super(paramw);
  }
  
  public View a(int paramInt)
  {
    return this.a.findViewById(paramInt);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public boolean a()
  {
    Window localWindow = this.a.getWindow();
    return (localWindow != null) && (localWindow.peekDecorView() != null);
  }
  
  public boolean a(t paramt)
  {
    return !this.a.isFinishing();
  }
  
  public LayoutInflater b()
  {
    return this.a.getLayoutInflater().cloneInContext(this.a);
  }
  
  public void b(t paramt)
  {
    this.a.a(paramt);
  }
  
  public void c()
  {
    this.a.d();
  }
  
  public boolean d()
  {
    return this.a.getWindow() != null;
  }
  
  public int e()
  {
    Window localWindow = this.a.getWindow();
    if (localWindow == null) {
      return 0;
    }
    return localWindow.getAttributes().windowAnimations;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */