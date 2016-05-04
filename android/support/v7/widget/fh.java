package android.support.v7.widget;

import android.support.v4.i.bu;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class fh
{
  private static final List m = Collections.EMPTY_LIST;
  public final View a;
  int b = -1;
  int c = -1;
  long d = -1L;
  int e = -1;
  int f = -1;
  fh g = null;
  fh h = null;
  List i = null;
  List j = null;
  RecyclerView k;
  private int l;
  private int n = 0;
  private ex o = null;
  private boolean p = false;
  private int q = 0;
  
  public fh(View paramView)
  {
    if (paramView == null) {
      throw new IllegalArgumentException("itemView may not be null");
    }
    this.a = paramView;
  }
  
  private void A()
  {
    bu.c(this.a, this.q);
    this.q = 0;
  }
  
  private boolean B()
  {
    return (this.l & 0x10) != 0;
  }
  
  private boolean C()
  {
    return ((this.l & 0x10) == 0) && (bu.c(this.a));
  }
  
  private void y()
  {
    if (this.i == null)
    {
      this.i = new ArrayList();
      this.j = Collections.unmodifiableList(this.i);
    }
  }
  
  private void z()
  {
    this.q = bu.e(this.a);
    bu.c(this.a, 4);
  }
  
  void a()
  {
    this.c = -1;
    this.f = -1;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.l = (this.l & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    b(8);
    a(paramInt2, paramBoolean);
    this.b = paramInt1;
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    if (this.c == -1) {
      this.c = this.b;
    }
    if (this.f == -1) {
      this.f = this.b;
    }
    if (paramBoolean) {
      this.f += paramInt;
    }
    this.b += paramInt;
    if (this.a.getLayoutParams() != null) {
      ((es)this.a.getLayoutParams()).c = true;
    }
  }
  
  void a(ex paramex, boolean paramBoolean)
  {
    this.o = paramex;
    this.p = paramBoolean;
  }
  
  void a(Object paramObject)
  {
    if (paramObject == null) {
      b(1024);
    }
    while ((this.l & 0x400) != 0) {
      return;
    }
    y();
    this.i.add(paramObject);
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
    {
      i1 = this.n - 1;
      this.n = i1;
      if (this.n >= 0) {
        break label64;
      }
      this.n = 0;
      Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    }
    label64:
    do
    {
      return;
      i1 = this.n + 1;
      break;
      if ((!paramBoolean) && (this.n == 1))
      {
        this.l |= 0x10;
        return;
      }
    } while ((!paramBoolean) || (this.n != 0));
    this.l &= 0xFFFFFFEF;
  }
  
  boolean a(int paramInt)
  {
    return (this.l & paramInt) != 0;
  }
  
  void b()
  {
    if (this.c == -1) {
      this.c = this.b;
    }
  }
  
  void b(int paramInt)
  {
    this.l |= paramInt;
  }
  
  boolean c()
  {
    return (this.l & 0x80) != 0;
  }
  
  public final int d()
  {
    if (this.f == -1) {
      return this.b;
    }
    return this.f;
  }
  
  public final int e()
  {
    if (this.k == null) {
      return -1;
    }
    return RecyclerView.b(this.k, this);
  }
  
  public final int f()
  {
    return this.c;
  }
  
  public final long g()
  {
    return this.d;
  }
  
  public final int h()
  {
    return this.e;
  }
  
  boolean i()
  {
    return this.o != null;
  }
  
  void j()
  {
    this.o.d(this);
  }
  
  boolean k()
  {
    return (this.l & 0x20) != 0;
  }
  
  void l()
  {
    this.l &= 0xFFFFFFDF;
  }
  
  void m()
  {
    this.l &= 0xFEFF;
  }
  
  boolean n()
  {
    return (this.l & 0x4) != 0;
  }
  
  boolean o()
  {
    return (this.l & 0x2) != 0;
  }
  
  boolean p()
  {
    return (this.l & 0x1) != 0;
  }
  
  boolean q()
  {
    return (this.l & 0x8) != 0;
  }
  
  boolean r()
  {
    return (this.l & 0x100) != 0;
  }
  
  boolean s()
  {
    return ((this.l & 0x200) != 0) || (n());
  }
  
  void t()
  {
    if (this.i != null) {
      this.i.clear();
    }
    this.l &= 0xFBFF;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
    StringBuilder localStringBuilder2;
    if (i())
    {
      localStringBuilder2 = localStringBuilder1.append(" scrap ");
      if (!this.p) {
        break label280;
      }
    }
    label280:
    for (String str = "[changeScrap]";; str = "[attachedScrap]")
    {
      localStringBuilder2.append(str);
      if (n()) {
        localStringBuilder1.append(" invalid");
      }
      if (!p()) {
        localStringBuilder1.append(" unbound");
      }
      if (o()) {
        localStringBuilder1.append(" update");
      }
      if (q()) {
        localStringBuilder1.append(" removed");
      }
      if (c()) {
        localStringBuilder1.append(" ignored");
      }
      if (r()) {
        localStringBuilder1.append(" tmpDetached");
      }
      if (!w()) {
        localStringBuilder1.append(" not recyclable(" + this.n + ")");
      }
      if (s()) {
        localStringBuilder1.append(" undefined adapter position");
      }
      if (this.a.getParent() == null) {
        localStringBuilder1.append(" no parent");
      }
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
    }
  }
  
  List u()
  {
    if ((this.l & 0x400) == 0)
    {
      if ((this.i == null) || (this.i.size() == 0)) {
        return m;
      }
      return this.j;
    }
    return m;
  }
  
  void v()
  {
    this.l = 0;
    this.b = -1;
    this.c = -1;
    this.d = -1L;
    this.f = -1;
    this.n = 0;
    this.g = null;
    this.h = null;
    t();
    this.q = 0;
  }
  
  public final boolean w()
  {
    return ((this.l & 0x10) == 0) && (!bu.c(this.a));
  }
  
  boolean x()
  {
    return (this.l & 0x2) != 0;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */