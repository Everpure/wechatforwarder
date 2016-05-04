package android.support.v7.widget;

import android.util.SparseArray;

public class fe
{
  int a = 0;
  private int b = -1;
  private int c = 1;
  private SparseArray d;
  private int e = 0;
  private int f = 0;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  
  void a(int paramInt)
  {
    if ((this.c & paramInt) == 0) {
      throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(paramInt) + " but it is " + Integer.toBinaryString(this.c));
    }
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public boolean b()
  {
    return this.j;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public boolean d()
  {
    return this.b != -1;
  }
  
  public int e()
  {
    if (this.h) {
      return this.e - this.f;
    }
    return this.a;
  }
  
  public String toString()
  {
    return "State{mTargetPosition=" + this.b + ", mData=" + this.d + ", mItemCount=" + this.a + ", mPreviousLayoutItemCount=" + this.e + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */