package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.g.h;
import android.support.v4.widget.ah;
import android.support.v7.b.b;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class dg
{
  private static Method a;
  private static Method c;
  private final do A = new do(this, null);
  private Runnable B;
  private final Handler C;
  private Rect D = new Rect();
  private boolean E;
  private int F;
  int b = Integer.MAX_VALUE;
  private Context d;
  private PopupWindow e;
  private ListAdapter f;
  private dk g;
  private int h = -2;
  private int i = -2;
  private int j;
  private int k;
  private int l = 1002;
  private boolean m;
  private int n = 0;
  private boolean o = false;
  private boolean p = false;
  private View q;
  private int r = 0;
  private DataSetObserver s;
  private View t;
  private Drawable u;
  private AdapterView.OnItemClickListener v;
  private AdapterView.OnItemSelectedListener w;
  private final ds x = new ds(this, null);
  private final dr y = new dr(this, null);
  private final dq z = new dq(this, null);
  
  static
  {
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;)
      {
        try
        {
          c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        localNoSuchMethodException1 = localNoSuchMethodException1;
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      }
    }
  }
  
  public dg(Context paramContext)
  {
    this(paramContext, null, b.listPopupWindowStyle);
  }
  
  public dg(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public dg(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.d = paramContext;
    this.C = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.ListPopupWindow, paramInt1, paramInt2);
    this.j = localTypedArray.getDimensionPixelOffset(l.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.k = localTypedArray.getDimensionPixelOffset(l.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.k != 0) {
      this.m = true;
    }
    localTypedArray.recycle();
    this.e = new bc(paramContext, paramAttributeSet, paramInt1);
    this.e.setInputMethodMode(1);
    this.F = h.a(this.d.getResources().getConfiguration().locale);
  }
  
  private int a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (c != null) {
      try
      {
        int i1 = ((Integer)c.invoke(this.e, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        return i1;
      }
      catch (Exception localException)
      {
        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
      }
    }
    return this.e.getMaxAvailableHeight(paramView, paramInt);
  }
  
  private void a()
  {
    if (this.q != null)
    {
      ViewParent localViewParent = this.q.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.q);
      }
    }
  }
  
  private int b()
  {
    boolean bool2 = true;
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    label253:
    int i2;
    int i1;
    if (this.g == null)
    {
      localObject2 = this.d;
      this.B = new di(this);
      if (!this.E)
      {
        bool1 = true;
        this.g = new dk((Context)localObject2, bool1);
        if (this.u != null) {
          this.g.setSelector(this.u);
        }
        this.g.setAdapter(this.f);
        this.g.setOnItemClickListener(this.v);
        this.g.setFocusable(true);
        this.g.setFocusableInTouchMode(true);
        this.g.setOnItemSelectedListener(new dj(this));
        this.g.setOnScrollListener(this.z);
        if (this.w != null) {
          this.g.setOnItemSelectedListener(this.w);
        }
        localObject1 = this.g;
        localView = this.q;
        if (localView == null) {
          break label718;
        }
        localObject2 = new LinearLayout((Context)localObject2);
        ((LinearLayout)localObject2).setOrientation(1);
        localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (this.r)
        {
        default: 
          Log.e("ListPopupWindow", "Invalid hint position " + this.r);
          if (this.i >= 0)
          {
            i2 = this.i;
            i1 = Integer.MIN_VALUE;
            label269:
            localView.measure(View.MeasureSpec.makeMeasureSpec(i2, i1), 0);
            localObject1 = (LinearLayout.LayoutParams)localView.getLayoutParams();
            i1 = localView.getMeasuredHeight();
            i2 = ((LinearLayout.LayoutParams)localObject1).topMargin;
            i1 = ((LinearLayout.LayoutParams)localObject1).bottomMargin + (i1 + i2);
            localObject1 = localObject2;
          }
          break;
        }
      }
    }
    for (;;)
    {
      this.e.setContentView((View)localObject1);
      for (;;)
      {
        label325:
        localObject1 = this.e.getBackground();
        if (localObject1 != null)
        {
          ((Drawable)localObject1).getPadding(this.D);
          i2 = this.D.top + this.D.bottom;
          if (this.m) {
            break label710;
          }
          this.k = (-this.D.top);
        }
        label384:
        label562:
        label710:
        for (;;)
        {
          if (this.e.getInputMethodMode() == 2) {}
          int i4;
          for (bool1 = bool2;; bool1 = false)
          {
            i4 = a(e(), this.k, bool1);
            if ((!this.o) && (this.h != -1)) {
              break label562;
            }
            return i4 + i2;
            bool1 = false;
            break;
            ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
            ((LinearLayout)localObject2).addView(localView);
            break label253;
            ((LinearLayout)localObject2).addView(localView);
            ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
            break label253;
            i1 = 0;
            i2 = 0;
            break label269;
            localObject1 = (ViewGroup)this.e.getContentView();
            localObject1 = this.q;
            if (localObject1 == null) {
              break label713;
            }
            localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            i1 = ((View)localObject1).getMeasuredHeight();
            i2 = ((LinearLayout.LayoutParams)localObject2).topMargin;
            i1 = ((LinearLayout.LayoutParams)localObject2).bottomMargin + (i1 + i2);
            break label325;
            this.D.setEmpty();
            i2 = 0;
            break label384;
          }
          int i3;
          switch (this.i)
          {
          default: 
            i3 = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
          }
          for (;;)
          {
            i4 = this.g.a(i3, 0, -1, i4 - i1, -1);
            i3 = i1;
            if (i4 > 0) {
              i3 = i1 + i2;
            }
            return i4 + i3;
            i3 = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), Integer.MIN_VALUE);
            continue;
            i3 = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), 1073741824);
          }
        }
        label713:
        i1 = 0;
      }
      label718:
      i1 = 0;
    }
  }
  
  private void b(boolean paramBoolean)
  {
    if (a != null) {}
    try
    {
      a.invoke(this.e, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (Exception localException)
    {
      Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
    }
  }
  
  public void a(int paramInt)
  {
    this.r = paramInt;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.e.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(View paramView)
  {
    this.t = paramView;
  }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.v = paramOnItemClickListener;
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    if (this.s == null) {
      this.s = new dp(this, null);
    }
    for (;;)
    {
      this.f = paramListAdapter;
      if (this.f != null) {
        paramListAdapter.registerDataSetObserver(this.s);
      }
      if (this.g != null) {
        this.g.setAdapter(this.f);
      }
      return;
      if (this.f != null) {
        this.f.unregisterDataSetObserver(this.s);
      }
    }
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.e.setOnDismissListener(paramOnDismissListener);
  }
  
  public void a(boolean paramBoolean)
  {
    this.E = paramBoolean;
    this.e.setFocusable(paramBoolean);
  }
  
  public void b(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void c()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i4 = -1;
    int i1 = b();
    boolean bool3 = l();
    ah.a(this.e, this.l);
    int i2;
    label64:
    PopupWindow localPopupWindow;
    if (this.e.isShowing())
    {
      int i3;
      label85:
      label99:
      View localView;
      int i5;
      int i6;
      if (this.i == -1)
      {
        i2 = -1;
        if (this.h != -1) {
          break label266;
        }
        if (!bool3) {
          break label218;
        }
        if (!bool3) {
          break label228;
        }
        localPopupWindow = this.e;
        if (this.i != -1) {
          break label223;
        }
        i3 = -1;
        localPopupWindow.setWidth(i3);
        this.e.setHeight(0);
        localPopupWindow = this.e;
        bool1 = bool2;
        if (!this.p)
        {
          bool1 = bool2;
          if (!this.o) {
            bool1 = true;
          }
        }
        localPopupWindow.setOutsideTouchable(bool1);
        localPopupWindow = this.e;
        localView = e();
        i5 = this.j;
        i6 = this.k;
        i3 = i2;
        if (i2 < 0) {
          i3 = -1;
        }
        if (i1 >= 0) {
          break label286;
        }
        i1 = i4;
      }
      label218:
      label223:
      label228:
      label266:
      label286:
      for (;;)
      {
        localPopupWindow.update(localView, i5, i6, i3, i1);
        return;
        if (this.i == -2)
        {
          i2 = e().getWidth();
          break;
        }
        i2 = this.i;
        break;
        i1 = -1;
        break label64;
        i3 = 0;
        break label85;
        localPopupWindow = this.e;
        if (this.i == -1) {}
        for (i3 = -1;; i3 = 0)
        {
          localPopupWindow.setWidth(i3);
          this.e.setHeight(-1);
          break;
        }
        if (this.h == -2) {
          break label99;
        }
        i1 = this.h;
        break label99;
      }
    }
    if (this.i == -1)
    {
      i2 = -1;
      label299:
      if (this.h != -1) {
        break label468;
      }
      i1 = -1;
      label309:
      this.e.setWidth(i2);
      this.e.setHeight(i1);
      b(true);
      localPopupWindow = this.e;
      if ((this.p) || (this.o)) {
        break label485;
      }
    }
    for (;;)
    {
      localPopupWindow.setOutsideTouchable(bool1);
      this.e.setTouchInterceptor(this.y);
      ah.a(this.e, e(), this.j, this.k, this.n);
      this.g.setSelection(-1);
      if ((!this.E) || (this.g.isInTouchMode())) {
        j();
      }
      if (this.E) {
        break;
      }
      this.C.post(this.A);
      return;
      if (this.i == -2)
      {
        i2 = e().getWidth();
        break label299;
      }
      i2 = this.i;
      break label299;
      label468:
      if (this.h == -2) {
        break label309;
      }
      i1 = this.h;
      break label309;
      label485:
      bool1 = false;
    }
  }
  
  public void c(int paramInt)
  {
    this.k = paramInt;
    this.m = true;
  }
  
  public Drawable d()
  {
    return this.e.getBackground();
  }
  
  public void d(int paramInt)
  {
    this.n = paramInt;
  }
  
  public View e()
  {
    return this.t;
  }
  
  public void e(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int f()
  {
    return this.j;
  }
  
  public void f(int paramInt)
  {
    Drawable localDrawable = this.e.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.D);
      this.i = (this.D.left + this.D.right + paramInt);
      return;
    }
    e(paramInt);
  }
  
  public int g()
  {
    if (!this.m) {
      return 0;
    }
    return this.k;
  }
  
  public void g(int paramInt)
  {
    this.e.setInputMethodMode(paramInt);
  }
  
  public int h()
  {
    return this.i;
  }
  
  public void h(int paramInt)
  {
    dk localdk = this.g;
    if ((k()) && (localdk != null))
    {
      dk.a(localdk, false);
      localdk.setSelection(paramInt);
      if ((Build.VERSION.SDK_INT >= 11) && (localdk.getChoiceMode() != 0)) {
        localdk.setItemChecked(paramInt, true);
      }
    }
  }
  
  public void i()
  {
    this.e.dismiss();
    a();
    this.e.setContentView(null);
    this.g = null;
    this.C.removeCallbacks(this.x);
  }
  
  public void j()
  {
    dk localdk = this.g;
    if (localdk != null)
    {
      dk.a(localdk, true);
      localdk.requestLayout();
    }
  }
  
  public boolean k()
  {
    return this.e.isShowing();
  }
  
  public boolean l()
  {
    return this.e.getInputMethodMode() == 2;
  }
  
  public ListView m()
  {
    return this.g;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */