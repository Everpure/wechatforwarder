package android.support.v7.widget;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.a.d;
import android.support.v7.b.b;
import android.support.v7.view.a;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

public class fp
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator j = new DecelerateInterpolator();
  Runnable a;
  int b;
  int c;
  private fs d;
  private cz e;
  private Spinner f;
  private boolean g;
  private int h;
  private int i;
  
  private ft a(d paramd, boolean paramBoolean)
  {
    paramd = new ft(this, getContext(), paramd, paramBoolean);
    if (paramBoolean)
    {
      paramd.setBackgroundDrawable(null);
      paramd.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
      return paramd;
    }
    paramd.setFocusable(true);
    if (this.d == null) {
      this.d = new fs(this, null);
    }
    paramd.setOnClickListener(this.d);
    return paramd;
  }
  
  private boolean a()
  {
    return (this.f != null) && (this.f.getParent() == this);
  }
  
  private void b()
  {
    if (a()) {
      return;
    }
    if (this.f == null) {
      this.f = d();
    }
    removeView(this.e);
    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.getAdapter() == null) {
      this.f.setAdapter(new fr(this, null));
    }
    if (this.a != null)
    {
      removeCallbacks(this.a);
      this.a = null;
    }
    this.f.setSelection(this.i);
  }
  
  private boolean c()
  {
    if (!a()) {
      return false;
    }
    removeView(this.f);
    addView(this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.getSelectedItemPosition());
    return false;
  }
  
  private Spinner d()
  {
    bj localbj = new bj(getContext(), null, b.actionDropDownStyle);
    localbj.setLayoutParams(new da(-2, -1));
    localbj.setOnItemSelectedListener(this);
    return localbj;
  }
  
  public void a(int paramInt)
  {
    View localView = this.e.getChildAt(paramInt);
    if (this.a != null) {
      removeCallbacks(this.a);
    }
    this.a = new fq(this, localView);
    post(this.a);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null) {
      post(this.a);
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = a.a(getContext());
    setContentHeight(paramConfiguration.e());
    this.c = paramConfiguration.g();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null) {
      removeCallbacks(this.a);
    }
  }
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((ft)paramView).b().d();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    int k = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (k == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int m = this.e.getChildCount();
      if ((m <= 1) || ((k != 1073741824) && (k != Integer.MIN_VALUE))) {
        break label190;
      }
      if (m <= 2) {
        break label177;
      }
      this.b = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
      label68:
      this.b = Math.min(this.b, this.c);
      label83:
      k = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
      if ((bool) || (!this.g)) {
        break label198;
      }
      label105:
      if (paramInt2 == 0) {
        break label211;
      }
      this.e.measure(0, k);
      if (this.e.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1)) {
        break label203;
      }
      b();
    }
    for (;;)
    {
      paramInt2 = getMeasuredWidth();
      super.onMeasure(paramInt1, k);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (paramInt2 != paramInt1)) {
        setTabSelected(this.i);
      }
      return;
      bool = false;
      break;
      label177:
      this.b = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label68;
      label190:
      this.b = -1;
      break label83;
      label198:
      paramInt2 = 0;
      break label105;
      label203:
      c();
      continue;
      label211:
      c();
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
  
  public void setAllowCollapse(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.h = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt)
  {
    this.i = paramInt;
    int m = this.e.getChildCount();
    int k = 0;
    if (k < m)
    {
      View localView = this.e.getChildAt(k);
      if (k == paramInt) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        if (bool) {
          a(paramInt);
        }
        k += 1;
        break;
      }
    }
    if ((this.f != null) && (paramInt >= 0)) {
      this.f.setSelection(paramInt);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */