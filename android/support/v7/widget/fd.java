package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public class fd
{
  private int a;
  private int b;
  private int c;
  private int d;
  private Interpolator e;
  private boolean f;
  private int g;
  
  private void a(RecyclerView paramRecyclerView)
  {
    if (this.d >= 0)
    {
      int i = this.d;
      this.d = -1;
      RecyclerView.c(paramRecyclerView, i);
      this.f = false;
      return;
    }
    if (this.f)
    {
      b();
      if (this.e == null) {
        if (this.c == Integer.MIN_VALUE) {
          RecyclerView.q(paramRecyclerView).b(this.a, this.b);
        }
      }
      for (;;)
      {
        this.g += 1;
        if (this.g > 10) {
          Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
        return;
        RecyclerView.q(paramRecyclerView).a(this.a, this.b, this.c);
        continue;
        RecyclerView.q(paramRecyclerView).a(this.a, this.b, this.c, this.e);
      }
    }
    this.g = 0;
  }
  
  private void b()
  {
    if ((this.e != null) && (this.c < 1)) {
      throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
    }
    if (this.c < 1) {
      throw new IllegalStateException("Scroll duration must be a positive number");
    }
  }
  
  boolean a()
  {
    return this.d >= 0;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */