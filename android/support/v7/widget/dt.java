package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class dt
  extends ListView
{
  private static final int[] g = { 0 };
  final Rect a = new Rect();
  int b = 0;
  int c = 0;
  int d = 0;
  int e = 0;
  protected int f;
  private Field h;
  private du i;
  
  public dt(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      this.h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.h.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt2 = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    paramInt3 = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt1 = paramInt2 + j;
      return paramInt1;
    }
    paramInt2 = j + paramInt2;
    label64:
    int k;
    label85:
    int n;
    label117:
    View localView;
    if ((paramInt3 > 0) && (localObject != null))
    {
      k = 0;
      localObject = null;
      int m = 0;
      int i1 = localListAdapter.getCount();
      j = 0;
      if (j >= i1) {
        break label309;
      }
      n = localListAdapter.getItemViewType(j);
      if (n == m) {
        break label311;
      }
      localObject = null;
      m = n;
      localView = localListAdapter.getView(j, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (((ViewGroup.LayoutParams)localObject).height <= 0) {
        break label259;
      }
      n = View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).height, 1073741824);
      label180:
      localView.measure(paramInt1, n);
      localView.forceLayout();
      if (j <= 0) {
        break label314;
      }
      paramInt2 += paramInt3;
    }
    label259:
    label309:
    label311:
    label314:
    for (;;)
    {
      paramInt2 += localView.getMeasuredHeight();
      if (paramInt2 >= paramInt4)
      {
        paramInt1 = paramInt4;
        if (paramInt5 < 0) {
          break;
        }
        paramInt1 = paramInt4;
        if (j <= paramInt5) {
          break;
        }
        paramInt1 = paramInt4;
        if (k <= 0) {
          break;
        }
        paramInt1 = paramInt4;
        if (paramInt2 == paramInt4) {
          break;
        }
        return k;
        paramInt3 = 0;
        break label64;
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label180;
      }
      n = k;
      if (paramInt5 >= 0)
      {
        n = k;
        if (j >= paramInt5) {
          n = paramInt2;
        }
      }
      j += 1;
      k = n;
      localObject = localView;
      break label85;
      return paramInt2;
      break label117;
    }
  }
  
  protected void a(int paramInt, View paramView)
  {
    boolean bool = true;
    Drawable localDrawable = getSelector();
    int j;
    float f1;
    float f2;
    if ((localDrawable != null) && (paramInt != -1))
    {
      j = 1;
      if (j != 0) {
        localDrawable.setVisible(false, false);
      }
      b(paramInt, paramView);
      if (j != 0)
      {
        paramView = this.a;
        f1 = paramView.exactCenterX();
        f2 = paramView.exactCenterY();
        if (getVisibility() != 0) {
          break label93;
        }
      }
    }
    for (;;)
    {
      localDrawable.setVisible(bool, false);
      a.a(localDrawable, f1, f2);
      return;
      j = 0;
      break;
      label93:
      bool = false;
    }
  }
  
  protected void a(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    a(paramInt, paramView);
    paramView = getSelector();
    if ((paramView != null) && (paramInt != -1)) {
      a.a(paramView, paramFloat1, paramFloat2);
    }
  }
  
  protected void a(Canvas paramCanvas)
  {
    if (!this.a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.a);
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  protected boolean a()
  {
    return false;
  }
  
  protected void b()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (c())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  protected void b(int paramInt, View paramView)
  {
    Rect localRect = this.a;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    localRect.left -= this.b;
    localRect.top -= this.c;
    localRect.right += this.d;
    localRect.bottom += this.e;
    try
    {
      boolean bool = this.h.getBoolean(this);
      if (paramView.isEnabled() != bool)
      {
        paramView = this.h;
        if (bool) {
          break label134;
        }
      }
      label134:
      for (bool = true;; bool = false)
      {
        paramView.set(this, Boolean.valueOf(bool));
        if (paramInt != -1) {
          refreshDrawableState();
        }
        return;
      }
      return;
    }
    catch (IllegalAccessException paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  protected boolean c()
  {
    return (a()) && (isPressed());
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    a(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    setSelectorEnabled(true);
    b();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.f = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {}
    for (Object localObject = new du(paramDrawable);; localObject = null)
    {
      this.i = ((du)localObject);
      super.setSelector(this.i);
      localObject = new Rect();
      if (paramDrawable != null) {
        paramDrawable.getPadding((Rect)localObject);
      }
      this.b = ((Rect)localObject).left;
      this.c = ((Rect)localObject).top;
      this.d = ((Rect)localObject).right;
      this.e = ((Rect)localObject).bottom;
      return;
    }
  }
  
  protected void setSelectorEnabled(boolean paramBoolean)
  {
    if (this.i != null) {
      this.i.a(paramBoolean);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */