package android.support.v4.i.a;

import android.graphics.Rect;
import android.os.Build.VERSION;

public class g
{
  private static final k a = new p();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 22)
    {
      a = new i();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new o();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      a = new n();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new m();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new l();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new j();
      return;
    }
  }
  
  public g(Object paramObject)
  {
    this.b = paramObject;
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "ACTION_UNKNOWN";
    case 1: 
      return "ACTION_FOCUS";
    case 2: 
      return "ACTION_CLEAR_FOCUS";
    case 4: 
      return "ACTION_SELECT";
    case 8: 
      return "ACTION_CLEAR_SELECTION";
    case 16: 
      return "ACTION_CLICK";
    case 32: 
      return "ACTION_LONG_CLICK";
    case 64: 
      return "ACTION_ACCESSIBILITY_FOCUS";
    case 128: 
      return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
    case 256: 
      return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
    case 512: 
      return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
    case 1024: 
      return "ACTION_NEXT_HTML_ELEMENT";
    case 2048: 
      return "ACTION_PREVIOUS_HTML_ELEMENT";
    case 4096: 
      return "ACTION_SCROLL_FORWARD";
    case 8192: 
      return "ACTION_SCROLL_BACKWARD";
    case 65536: 
      return "ACTION_CUT";
    case 16384: 
      return "ACTION_COPY";
    case 32768: 
      return "ACTION_PASTE";
    }
    return "ACTION_SET_SELECTION";
  }
  
  public Object a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public void a(Rect paramRect)
  {
    a.a(this.b, paramRect);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    a.a(this.b, paramCharSequence);
  }
  
  public void a(Object paramObject)
  {
    a.a(this.b, ((q)paramObject).a);
  }
  
  public void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }
  
  public int b()
  {
    return a.a(this.b);
  }
  
  public void b(Rect paramRect)
  {
    a.b(this.b, paramRect);
  }
  
  public void b(Object paramObject)
  {
    a.b(this.b, r.a((r)paramObject));
  }
  
  public boolean c()
  {
    return a.f(this.b);
  }
  
  public boolean d()
  {
    return a.g(this.b);
  }
  
  public boolean e()
  {
    return a.j(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (g)paramObject;
        if (this.b != null) {
          break;
        }
      } while (((g)paramObject).b == null);
      return false;
    } while (this.b.equals(((g)paramObject).b));
    return false;
  }
  
  public boolean f()
  {
    return a.k(this.b);
  }
  
  public boolean g()
  {
    return a.o(this.b);
  }
  
  public boolean h()
  {
    return a.h(this.b);
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
  
  public boolean i()
  {
    return a.l(this.b);
  }
  
  public boolean j()
  {
    return a.i(this.b);
  }
  
  public boolean k()
  {
    return a.m(this.b);
  }
  
  public boolean l()
  {
    return a.n(this.b);
  }
  
  public CharSequence m()
  {
    return a.d(this.b);
  }
  
  public CharSequence n()
  {
    return a.b(this.b);
  }
  
  public CharSequence o()
  {
    return a.e(this.b);
  }
  
  public CharSequence p()
  {
    return a.c(this.b);
  }
  
  public String q()
  {
    return a.p(this.b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Rect localRect = new Rect();
    a(localRect);
    localStringBuilder.append("; boundsInParent: " + localRect);
    b(localRect);
    localStringBuilder.append("; boundsInScreen: " + localRect);
    localStringBuilder.append("; packageName: ").append(m());
    localStringBuilder.append("; className: ").append(n());
    localStringBuilder.append("; text: ").append(o());
    localStringBuilder.append("; contentDescription: ").append(p());
    localStringBuilder.append("; viewId: ").append(q());
    localStringBuilder.append("; checkable: ").append(c());
    localStringBuilder.append("; checked: ").append(d());
    localStringBuilder.append("; focusable: ").append(e());
    localStringBuilder.append("; focused: ").append(f());
    localStringBuilder.append("; selected: ").append(g());
    localStringBuilder.append("; clickable: ").append(h());
    localStringBuilder.append("; longClickable: ").append(i());
    localStringBuilder.append("; enabled: ").append(j());
    localStringBuilder.append("; password: ").append(k());
    localStringBuilder.append("; scrollable: " + l());
    localStringBuilder.append("; [");
    int i = b();
    while (i != 0)
    {
      int k = 1 << Integer.numberOfTrailingZeros(i);
      int j = i & (k ^ 0xFFFFFFFF);
      localStringBuilder.append(b(k));
      i = j;
      if (j != 0)
      {
        localStringBuilder.append(", ");
        i = j;
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */