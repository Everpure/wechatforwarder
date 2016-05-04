package android.support.v4.i;

import android.os.Bundle;
import android.support.v4.i.a.g;
import android.support.v4.i.a.w;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class f
  implements m
{
  f(e parame, a parama) {}
  
  public Object a(View paramView)
  {
    paramView = this.a.a(paramView);
    if (paramView != null) {
      return paramView.a();
    }
    return null;
  }
  
  public void a(View paramView, int paramInt)
  {
    this.a.a(paramView, paramInt);
  }
  
  public void a(View paramView, Object paramObject)
  {
    this.a.a(paramView, new g(paramObject));
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.a.a(paramView, paramInt, paramBundle);
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.b(paramView, paramAccessibilityEvent);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.d(paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.c(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.a(paramView, paramAccessibilityEvent);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */