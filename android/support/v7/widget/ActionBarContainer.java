package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.b.g;
import android.support.v7.b.l;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer
  extends FrameLayout
{
  Drawable a;
  Drawable b;
  Drawable c;
  boolean d;
  boolean e;
  private boolean f;
  private View g;
  private View h;
  private View i;
  private int j;
  
  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = new d(this);
      setBackgroundDrawable((Drawable)localObject);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.ActionBar);
      this.a = paramContext.getDrawable(l.ActionBar_background);
      this.b = paramContext.getDrawable(l.ActionBar_backgroundStacked);
      this.j = paramContext.getDimensionPixelSize(l.ActionBar_height, -1);
      if (getId() == g.split_action_bar)
      {
        this.d = true;
        this.c = paramContext.getDrawable(l.ActionBar_backgroundSplit);
      }
      paramContext.recycle();
      if (!this.d) {
        break label143;
      }
      if (this.c != null) {
        break label138;
      }
      bool = true;
    }
    for (;;)
    {
      setWillNotDraw(bool);
      return;
      localObject = new c(this);
      break;
      label138:
      bool = false;
      continue;
      label143:
      if ((this.a == null) && (this.b == null)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private boolean a(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0);
  }
  
  private int b(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    int m = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (k + m);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.a != null) && (this.a.isStateful())) {
      this.a.setState(getDrawableState());
    }
    if ((this.b != null) && (this.b.isStateful())) {
      this.b.setState(getDrawableState());
    }
    if ((this.c != null) && (this.c.isStateful())) {
      this.c.setState(getDrawableState());
    }
  }
  
  public View getTabContainer()
  {
    return this.g;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.a != null) {
        this.a.jumpToCurrentState();
      }
      if (this.b != null) {
        this.b.jumpToCurrentState();
      }
      if (this.c != null) {
        this.c.jumpToCurrentState();
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.h = findViewById(g.action_bar);
    this.i = findViewById(g.action_context_bar);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.f) || (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.g;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      paramBoolean = true;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        paramInt2 = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, paramInt2 - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, paramInt2 - localLayoutParams.bottomMargin);
      }
      if (!this.d) {
        break label143;
      }
      if (this.c == null) {
        break label323;
      }
      this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 = k;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        invalidate();
      }
      return;
      paramBoolean = false;
      break;
      label143:
      if (this.a != null) {
        if (this.h.getVisibility() == 0) {
          this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
        }
      }
      label195:
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        this.e = paramBoolean;
        if ((paramBoolean) && (this.b != null))
        {
          this.b.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          paramInt1 = k;
          break;
          if ((this.i != null) && (this.i.getVisibility() == 0))
          {
            this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            break label195;
          }
          this.a.setBounds(0, 0, 0, 0);
          break label195;
        }
        break;
      }
      label323:
      paramInt1 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int k = paramInt2;
    if (this.h == null)
    {
      k = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        k = paramInt2;
        if (this.j >= 0) {
          k = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, k);
    if (this.h == null) {}
    do
    {
      return;
      paramInt2 = View.MeasureSpec.getMode(k);
    } while ((this.g == null) || (this.g.getVisibility() == 8) || (paramInt2 == 1073741824));
    if (!a(this.h))
    {
      paramInt1 = b(this.h);
      if (paramInt2 != Integer.MIN_VALUE) {
        break label172;
      }
    }
    label172:
    for (paramInt2 = View.MeasureSpec.getSize(k);; paramInt2 = Integer.MAX_VALUE)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + b(this.g), paramInt2));
      return;
      if (!a(this.i))
      {
        paramInt1 = b(this.i);
        break;
      }
      paramInt1 = 0;
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.a != null)
    {
      this.a.setCallback(null);
      unscheduleDrawable(this.a);
    }
    this.a = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.h != null) {
        this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
      }
    }
    if (this.d) {
      if (this.c != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a != null) || (this.b != null)) {
        bool = false;
      }
    }
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.c != null)
    {
      this.c.setCallback(null);
      unscheduleDrawable(this.c);
    }
    this.c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.d) && (this.c != null)) {
        this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      }
    }
    if (this.d) {
      if (this.c != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a != null) || (this.b != null)) {
        bool = false;
      }
    }
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.b != null)
    {
      this.b.setCallback(null);
      unscheduleDrawable(this.b);
    }
    this.b = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.e) && (this.b != null)) {
        this.b.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
      }
    }
    if (this.d) {
      if (this.c != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a != null) || (this.b != null)) {
        bool = false;
      }
    }
  }
  
  public void setTabContainer(fp paramfp)
  {
    if (this.g != null) {
      removeView(this.g);
    }
    this.g = paramfp;
    if (paramfp != null)
    {
      addView(paramfp);
      ViewGroup.LayoutParams localLayoutParams = paramfp.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramfp.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (paramBoolean) {}
    for (int k = 393216;; k = 262144)
    {
      setDescendantFocusability(k);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.a != null) {
        this.a.setVisible(bool, false);
      }
      if (this.b != null) {
        this.b.setVisible(bool, false);
      }
      if (this.c != null) {
        this.c.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.a) && (!this.d)) || ((paramDrawable == this.b) && (this.e)) || ((paramDrawable == this.c) && (this.d)) || (super.verifyDrawable(paramDrawable));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */