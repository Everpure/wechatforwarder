package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.i.az;
import android.support.v4.i.bi;
import android.support.v4.i.bj;
import android.support.v4.i.bk;
import android.support.v4.i.bl;
import android.support.v4.i.bn;
import android.support.v4.i.bp;
import android.support.v4.i.bu;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements bi, bk, bn
{
  private static final ad v = new ad();
  private static final int[] w = { 16843130 };
  private ae A;
  private long a;
  private final Rect b = new Rect();
  private at c;
  private s d;
  private s e;
  private int f;
  private boolean g = true;
  private boolean h = false;
  private View i = null;
  private boolean j = false;
  private VelocityTracker k;
  private boolean l;
  private boolean m = true;
  private int n;
  private int o;
  private int p;
  private int q = -1;
  private final int[] r = new int[2];
  private final int[] s = new int[2];
  private int t;
  private af u;
  private final bl x;
  private final bj y;
  private float z;
  
  public NestedScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, w, paramInt, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    this.x = new bl(this);
    this.y = new bj(this);
    setNestedScrollingEnabled(true);
    bu.a(this, v);
  }
  
  private View a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    Object localObject2 = null;
    int i1 = 0;
    int i5 = localArrayList.size();
    int i3 = 0;
    Object localObject1;
    int i4;
    int i6;
    int i2;
    if (i3 < i5)
    {
      localObject1 = (View)localArrayList.get(i3);
      i4 = ((View)localObject1).getTop();
      i6 = ((View)localObject1).getBottom();
      if ((paramInt1 >= i6) || (i4 >= paramInt2)) {
        break label192;
      }
      if ((paramInt1 < i4) && (i6 < paramInt2))
      {
        i2 = 1;
        label87:
        if (localObject2 != null) {
          break label115;
        }
        i1 = i2;
      }
    }
    for (;;)
    {
      i3 += 1;
      localObject2 = localObject1;
      break;
      i2 = 0;
      break label87;
      label115:
      if (((paramBoolean) && (i4 < ((View)localObject2).getTop())) || ((!paramBoolean) && (i6 > ((View)localObject2).getBottom()))) {}
      for (i4 = 1;; i4 = 0)
      {
        if (i1 == 0) {
          break label170;
        }
        if ((i2 == 0) || (i4 == 0)) {
          break label192;
        }
        break;
      }
      label170:
      if (i2 != 0)
      {
        i1 = 1;
      }
      else if (i4 != 0)
      {
        continue;
        return (View)localObject2;
      }
      else
      {
        label192:
        localObject1 = localObject2;
      }
    }
  }
  
  private void a()
  {
    this.c = at.a(getContext(), null);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.n = localViewConfiguration.getScaledTouchSlop();
    this.o = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.p = localViewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = (paramMotionEvent.getAction() & 0xFF00) >> 8;
    if (az.b(paramMotionEvent, i1) == this.q) {
      if (i1 != 0) {
        break label63;
      }
    }
    label63:
    for (i1 = 1;; i1 = 0)
    {
      this.f = ((int)az.d(paramMotionEvent, i1));
      this.q = az.b(paramMotionEvent, i1);
      if (this.k != null) {
        this.k.clear();
      }
      return;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = false;
    int i2 = getHeight();
    int i1 = getScrollY();
    i2 = i1 + i2;
    if (paramInt1 == 33) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, paramInt2, paramInt3);
      Object localObject = localView;
      if (localView == null) {
        localObject = this;
      }
      if ((paramInt2 < i1) || (paramInt3 > i2)) {
        break;
      }
      bool1 = bool2;
      if (localObject != findFocus()) {
        ((View)localObject).requestFocus(paramInt1);
      }
      return bool1;
    }
    if (bool1) {
      paramInt2 -= i1;
    }
    for (;;)
    {
      e(paramInt2);
      bool1 = true;
      break;
      paramInt2 = paramInt3 - i2;
    }
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean)
  {
    int i1 = a(paramRect);
    if (i1 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        if (!paramBoolean) {
          break;
        }
        scrollBy(0, i1);
      }
      return bool;
    }
    a(0, i1);
    return bool;
  }
  
  private boolean a(View paramView)
  {
    boolean bool = false;
    if (!a(paramView, 0, getHeight())) {
      bool = true;
    }
    return bool;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    return (this.b.bottom + paramInt1 >= getScrollY()) && (this.b.top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    if (((paramView1 instanceof ViewGroup)) && (a((View)paramView1, paramView2))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0)) {
      i1 = 0;
    }
    do
    {
      return i1;
      i1 = paramInt1;
    } while (paramInt2 + paramInt1 <= paramInt3);
    return paramInt3 - paramInt2;
  }
  
  private void b(View paramView)
  {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    int i1 = a(this.b);
    if (i1 != 0) {
      scrollBy(0, i1);
    }
  }
  
  private boolean b()
  {
    boolean bool2 = false;
    View localView = getChildAt(0);
    boolean bool1 = bool2;
    if (localView != null)
    {
      int i1 = localView.getHeight();
      bool1 = bool2;
      if (getHeight() < i1 + getPaddingTop() + getPaddingBottom()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private void c()
  {
    if (this.k == null)
    {
      this.k = VelocityTracker.obtain();
      return;
    }
    this.k.clear();
  }
  
  private boolean c(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (getChildCount() > 0)
    {
      int i1 = getScrollY();
      View localView = getChildAt(0);
      bool1 = bool2;
      if (paramInt2 >= localView.getTop() - i1)
      {
        bool1 = bool2;
        if (paramInt2 < localView.getBottom() - i1)
        {
          bool1 = bool2;
          if (paramInt1 >= localView.getLeft())
          {
            bool1 = bool2;
            if (paramInt1 < localView.getRight()) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  private void d()
  {
    if (this.k == null) {
      this.k = VelocityTracker.obtain();
    }
  }
  
  private void e()
  {
    if (this.k != null)
    {
      this.k.recycle();
      this.k = null;
    }
  }
  
  private void e(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.m) {
        a(0, paramInt);
      }
    }
    else {
      return;
    }
    scrollBy(0, paramInt);
  }
  
  private void f()
  {
    this.j = false;
    e();
    stopNestedScroll();
    if (this.d != null)
    {
      this.d.b();
      this.e.b();
    }
  }
  
  private void f(int paramInt)
  {
    int i1 = getScrollY();
    if (((i1 > 0) || (paramInt > 0)) && ((i1 < getScrollRange()) || (paramInt < 0))) {}
    for (boolean bool = true;; bool = false)
    {
      if (!dispatchNestedPreFling(0.0F, paramInt))
      {
        dispatchNestedFling(0.0F, paramInt, bool);
        if (bool) {
          d(paramInt);
        }
      }
      return;
    }
  }
  
  private void g()
  {
    if (bu.a(this) != 2)
    {
      if (this.d == null)
      {
        Context localContext = getContext();
        this.d = new s(localContext);
        this.e = new s(localContext);
      }
      return;
    }
    this.d = null;
    this.e = null;
  }
  
  private int getScrollRange()
  {
    int i1 = 0;
    if (getChildCount() > 0) {
      i1 = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    }
    return i1;
  }
  
  private float getVerticalScrollFactorCompat()
  {
    if (this.z == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (!localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
      this.z = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
    }
    return this.z;
  }
  
  protected int a(Rect paramRect)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int i4 = getHeight();
    int i1 = getScrollY();
    int i3 = i1 + i4;
    int i5 = getVerticalFadingEdgeLength();
    int i2 = i1;
    if (paramRect.top > 0) {
      i2 = i1 + i5;
    }
    i1 = i3;
    if (paramRect.bottom < getChildAt(0).getHeight()) {
      i1 = i3 - i5;
    }
    if ((paramRect.bottom > i1) && (paramRect.top > i2)) {
      if (paramRect.height() > i4)
      {
        i2 = paramRect.top - i2 + 0;
        i1 = Math.min(i2, getChildAt(0).getBottom() - i1);
      }
    }
    for (;;)
    {
      return i1;
      i2 = paramRect.bottom - i1 + 0;
      break;
      if ((paramRect.top < i2) && (paramRect.bottom < i1))
      {
        if (paramRect.height() > i4) {}
        for (i1 = 0 - (i1 - paramRect.bottom);; i1 = 0 - (i2 - paramRect.top))
        {
          i1 = Math.max(i1, -getScrollY());
          break;
        }
      }
      i1 = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250L)
    {
      paramInt1 = getHeight();
      int i1 = getPaddingBottom();
      int i2 = getPaddingTop();
      i1 = Math.max(0, getChildAt(0).getHeight() - (paramInt1 - i1 - i2));
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt1 + paramInt2, i1));
      this.c.a(getScrollX(), paramInt1, 0, paramInt2 - paramInt1);
      bu.d(this);
    }
    for (;;)
    {
      this.a = AnimationUtils.currentAnimationTimeMillis();
      return;
      if (!this.c.a()) {
        this.c.h();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  public boolean a(int paramInt)
  {
    int i1;
    int i2;
    if (paramInt == 130)
    {
      i1 = 1;
      i2 = getHeight();
      if (i1 == 0) {
        break label121;
      }
      this.b.top = (getScrollY() + i2);
      i1 = getChildCount();
      if (i1 > 0)
      {
        View localView = getChildAt(i1 - 1);
        if (this.b.top + i2 > localView.getBottom()) {
          this.b.top = (localView.getBottom() - i2);
        }
      }
    }
    for (;;)
    {
      this.b.bottom = (this.b.top + i2);
      return a(paramInt, this.b.top, this.b.bottom);
      i1 = 0;
      break;
      label121:
      this.b.top = (getScrollY() - i2);
      if (this.b.top < 0) {
        this.b.top = 0;
      }
    }
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    int i3 = bu.a(this);
    int i1;
    int i2;
    if (computeHorizontalScrollRange() > computeHorizontalScrollExtent())
    {
      i1 = 1;
      if (computeVerticalScrollRange() <= computeVerticalScrollExtent()) {
        break label194;
      }
      i2 = 1;
      label34:
      if ((i3 != 0) && ((i3 != 1) || (i1 == 0))) {
        break label200;
      }
      i1 = 1;
      label53:
      if ((i3 != 0) && ((i3 != 1) || (i2 == 0))) {
        break label206;
      }
      i2 = 1;
      label72:
      paramInt1 = paramInt3 + paramInt1;
      if (i1 == 0) {
        paramInt7 = 0;
      }
      paramInt2 = paramInt4 + paramInt2;
      if (i2 == 0) {
        paramInt8 = 0;
      }
      paramInt4 = -paramInt7;
      paramInt7 += paramInt5;
      paramInt3 = -paramInt8;
      paramInt5 = paramInt8 + paramInt6;
      if (paramInt1 <= paramInt7) {
        break label212;
      }
      paramBoolean = true;
      paramInt1 = paramInt7;
    }
    for (;;)
    {
      label132:
      boolean bool;
      if (paramInt2 > paramInt5)
      {
        bool = true;
        paramInt2 = paramInt5;
      }
      for (;;)
      {
        if (bool) {
          this.c.a(paramInt1, paramInt2, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(paramInt1, paramInt2, paramBoolean, bool);
        if ((paramBoolean) || (bool))
        {
          return true;
          i1 = 0;
          break;
          label194:
          i2 = 0;
          break label34;
          label200:
          i1 = 0;
          break label53;
          label206:
          i2 = 0;
          break label72;
          label212:
          if (paramInt1 >= paramInt4) {
            break label248;
          }
          paramBoolean = true;
          paramInt1 = paramInt4;
          break label132;
          if (paramInt2 >= paramInt3) {
            break label242;
          }
          bool = true;
          paramInt2 = paramInt3;
          continue;
        }
        return false;
        label242:
        bool = false;
      }
      label248:
      paramBoolean = false;
    }
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    int i1 = 33;
    boolean bool2 = false;
    this.b.setEmpty();
    boolean bool1;
    if (!b())
    {
      bool1 = bool2;
      if (isFocused())
      {
        bool1 = bool2;
        if (paramKeyEvent.getKeyCode() != 4)
        {
          View localView = findFocus();
          paramKeyEvent = localView;
          if (localView == this) {
            paramKeyEvent = null;
          }
          paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
          if ((paramKeyEvent == null) || (paramKeyEvent == this) || (!paramKeyEvent.requestFocus(130))) {
            break label93;
          }
          bool1 = true;
        }
      }
    }
    label93:
    do
    {
      for (;;)
      {
        return bool1;
        bool1 = false;
      }
      bool1 = bool2;
    } while (paramKeyEvent.getAction() != 0);
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    case 19: 
      if (!paramKeyEvent.isAltPressed()) {
        return c(33);
      }
      return b(33);
    case 20: 
      if (!paramKeyEvent.isAltPressed()) {
        return c(130);
      }
      return b(130);
    }
    if (paramKeyEvent.isShiftPressed()) {}
    for (;;)
    {
      a(i1);
      return false;
      i1 = 130;
    }
  }
  
  public void addView(View paramView)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramLayoutParams);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    a(paramInt1 - getScrollX(), paramInt2 - getScrollY());
  }
  
  public boolean b(int paramInt)
  {
    if (paramInt == 130) {}
    for (int i1 = 1;; i1 = 0)
    {
      int i2 = getHeight();
      this.b.top = 0;
      this.b.bottom = i2;
      if (i1 != 0)
      {
        i1 = getChildCount();
        if (i1 > 0)
        {
          View localView = getChildAt(i1 - 1);
          this.b.bottom = (localView.getBottom() + getPaddingBottom());
          this.b.top = (this.b.bottom - i2);
        }
      }
      return a(paramInt, this.b.top, this.b.bottom);
    }
  }
  
  public boolean c(int paramInt)
  {
    View localView2 = findFocus();
    View localView1 = localView2;
    if (localView2 == this) {
      localView1 = null;
    }
    localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    int i2 = getMaxScrollAmount();
    if ((localView2 != null) && (a(localView2, i2, getHeight())))
    {
      localView2.getDrawingRect(this.b);
      offsetDescendantRectToMyCoords(localView2, this.b);
      e(a(this.b));
      localView2.requestFocus(paramInt);
      if ((localView1 != null) && (localView1.isFocused()) && (a(localView1)))
      {
        paramInt = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(paramInt);
      }
      return true;
    }
    int i1;
    if ((paramInt == 33) && (getScrollY() < i2)) {
      i1 = getScrollY();
    }
    while (i1 == 0)
    {
      return false;
      i1 = i2;
      if (paramInt == 130)
      {
        i1 = i2;
        if (getChildCount() > 0)
        {
          int i3 = getChildAt(0).getBottom();
          int i4 = getScrollY() + getHeight() - getPaddingBottom();
          i1 = i2;
          if (i3 - i4 < i2) {
            i1 = i3 - i4;
          }
        }
      }
    }
    if (paramInt == 130) {}
    for (;;)
    {
      e(i1);
      break;
      i1 = -i1;
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    int i3;
    int i5;
    int i6;
    int i1;
    if (this.c.g())
    {
      int i2 = getScrollX();
      i3 = getScrollY();
      int i4 = this.c.b();
      i5 = this.c.c();
      if ((i2 != i4) || (i3 != i5))
      {
        i6 = getScrollRange();
        i1 = bu.a(this);
        if ((i1 != 0) && ((i1 != 1) || (i6 <= 0))) {
          break label132;
        }
        i1 = 1;
        a(i4 - i2, i5 - i3, i2, i3, 0, i6, 0, 0, false);
        if (i1 != 0)
        {
          g();
          if ((i5 > 0) || (i3 <= 0)) {
            break label137;
          }
          this.d.a((int)this.c.f());
        }
      }
    }
    label132:
    label137:
    while ((i5 < i6) || (i3 >= i6))
    {
      return;
      i1 = 0;
      break;
    }
    this.e.a((int)this.c.f());
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange()
  {
    int i2 = getChildCount();
    int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i2 == 0) {}
    int i3;
    int i4;
    do
    {
      return i1;
      i2 = getChildAt(0).getBottom();
      i3 = getScrollY();
      i4 = Math.max(0, i2 - i1);
      if (i3 < 0) {
        return i2 - i3;
      }
      i1 = i2;
    } while (i3 <= i4);
    return i2 + (i3 - i4);
  }
  
  public void d(int paramInt)
  {
    if (getChildCount() > 0)
    {
      int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
      int i2 = getChildAt(0).getHeight();
      this.c.a(getScrollX(), getScrollY(), 0, paramInt, 0, 0, 0, Math.max(0, i2 - i1), 0, i1 / 2);
      bu.d(this);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (a(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.y.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.y.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.y.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.y.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.d != null)
    {
      int i1 = getScrollY();
      int i2;
      int i3;
      int i4;
      if (!this.d.a())
      {
        i2 = paramCanvas.save();
        i3 = getWidth();
        i4 = getPaddingLeft();
        int i5 = getPaddingRight();
        paramCanvas.translate(getPaddingLeft(), Math.min(0, i1));
        this.d.a(i3 - i4 - i5, getHeight());
        if (this.d.a(paramCanvas)) {
          bu.d(this);
        }
        paramCanvas.restoreToCount(i2);
      }
      if (!this.e.a())
      {
        i2 = paramCanvas.save();
        i3 = getWidth() - getPaddingLeft() - getPaddingRight();
        i4 = getHeight();
        paramCanvas.translate(-i3 + getPaddingLeft(), Math.max(getScrollRange(), i1) + i4);
        paramCanvas.rotate(180.0F, i3, 0.0F);
        this.e.a(i3, i4);
        if (this.e.a(paramCanvas)) {
          bu.d(this);
        }
        paramCanvas.restoreToCount(i2);
      }
    }
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getHeight();
    int i3 = getPaddingBottom();
    i2 = getChildAt(0).getBottom() - getScrollY() - (i2 - i3);
    if (i2 < i1) {
      return i2 / i1;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(0.5F * getHeight());
  }
  
  public int getNestedScrollAxes()
  {
    return this.x.a();
  }
  
  protected float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getScrollY();
    if (i2 < i1) {
      return i2 / i1;
    }
    return 1.0F;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.y.b();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.y.a();
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = localMarginLayoutParams.topMargin;
    paramView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.bottomMargin + paramInt2, 0));
  }
  
  public void onAttachedToWindow()
  {
    this.h = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((az.d(paramMotionEvent) & 0x2) != 0) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return false;
      if (!this.j)
      {
        float f1 = az.e(paramMotionEvent, 9);
        if (f1 != 0.0F)
        {
          int i1 = (int)(f1 * getVerticalScrollFactorCompat());
          int i2 = getScrollRange();
          int i4 = getScrollY();
          int i3 = i4 - i1;
          if (i3 < 0) {
            i1 = 0;
          }
          while (i1 != i4)
          {
            super.scrollTo(getScrollX(), i1);
            return true;
            i1 = i2;
            if (i3 <= i2) {
              i1 = i3;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 2) && (this.j)) {
      return true;
    }
    switch (i1 & 0xFF)
    {
    }
    for (;;)
    {
      return this.j;
      i1 = this.q;
      if (i1 != -1)
      {
        int i2 = az.a(paramMotionEvent, i1);
        if (i2 == -1)
        {
          Log.e("NestedScrollView", "Invalid pointerId=" + i1 + " in onInterceptTouchEvent");
        }
        else
        {
          i1 = (int)az.d(paramMotionEvent, i2);
          if ((Math.abs(i1 - this.f) > this.n) && ((getNestedScrollAxes() & 0x2) == 0))
          {
            this.j = true;
            this.f = i1;
            d();
            this.k.addMovement(paramMotionEvent);
            this.t = 0;
            paramMotionEvent = getParent();
            if (paramMotionEvent != null)
            {
              paramMotionEvent.requestDisallowInterceptTouchEvent(true);
              continue;
              i1 = (int)paramMotionEvent.getY();
              if (!c((int)paramMotionEvent.getX(), i1))
              {
                this.j = false;
                e();
              }
              else
              {
                this.f = i1;
                this.q = az.b(paramMotionEvent, 0);
                c();
                this.k.addMovement(paramMotionEvent);
                this.c.g();
                if (!this.c.a()) {
                  bool = true;
                }
                this.j = bool;
                startNestedScroll(2);
                continue;
                this.j = false;
                this.q = -1;
                e();
                if (this.c.a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                  bu.d(this);
                }
                stopNestedScroll();
                continue;
                a(paramMotionEvent);
              }
            }
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = false;
    if ((this.i != null) && (a(this.i, this))) {
      b(this.i);
    }
    this.i = null;
    if (!this.h)
    {
      if (this.u != null)
      {
        scrollTo(getScrollX(), this.u.a);
        this.u = null;
      }
      if (getChildCount() <= 0) {
        break label153;
      }
      paramInt1 = getChildAt(0).getMeasuredHeight();
      paramInt1 = Math.max(0, paramInt1 - (paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop()));
      if (getScrollY() <= paramInt1) {
        break label158;
      }
      scrollTo(getScrollX(), paramInt1);
    }
    for (;;)
    {
      scrollTo(getScrollX(), getScrollY());
      this.h = true;
      return;
      label153:
      paramInt1 = 0;
      break;
      label158:
      if (getScrollY() < 0) {
        scrollTo(getScrollX(), 0);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.l) {}
    View localView;
    do
    {
      do
      {
        return;
      } while ((View.MeasureSpec.getMode(paramInt2) == 0) || (getChildCount() <= 0));
      localView = getChildAt(0);
      paramInt2 = getMeasuredHeight();
    } while (localView.getMeasuredHeight() >= paramInt2);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2 - getPaddingTop() - getPaddingBottom(), 1073741824));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      f((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getScrollY();
    scrollBy(0, paramInt4);
    paramInt1 = getScrollY() - paramInt1;
    dispatchNestedScroll(0, paramInt1, 0, paramInt4 - paramInt1, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.x.a(paramView1, paramView2, paramInt);
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1;
    View localView;
    if (paramInt == 2)
    {
      i1 = 130;
      if (paramRect != null) {
        break label44;
      }
      localView = FocusFinder.getInstance().findNextFocus(this, null, i1);
      label24:
      if (localView != null) {
        break label58;
      }
    }
    label44:
    label58:
    while (a(localView))
    {
      return false;
      i1 = paramInt;
      if (paramInt != 1) {
        break;
      }
      i1 = 33;
      break;
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i1);
      break label24;
    }
    return localView.requestFocus(i1, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (af)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.u = paramParcelable;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    af localaf = new af(super.onSaveInstanceState());
    localaf.a = getScrollY();
    return localaf;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.A != null) {
      this.A.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView == null) || (this == localView)) {}
    while (!a(localView, 0, paramInt4)) {
      return;
    }
    localView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(localView, this.b);
    e(a(this.b));
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.x.a(paramView);
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    d();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i1 = az.a(paramMotionEvent);
    if (i1 == 0) {
      this.t = 0;
    }
    localMotionEvent.offsetLocation(0.0F, this.t);
    int i3;
    int i4;
    int i2;
    switch (i1)
    {
    case 4: 
    default: 
    case 0: 
    case 2: 
      ViewParent localViewParent;
      for (;;)
      {
        if (this.k != null) {
          this.k.addMovement(localMotionEvent);
        }
        localMotionEvent.recycle();
        return true;
        if (getChildCount() == 0) {
          return false;
        }
        if (!this.c.a()) {}
        for (boolean bool = true;; bool = false)
        {
          this.j = bool;
          if (bool)
          {
            localViewParent = getParent();
            if (localViewParent != null) {
              localViewParent.requestDisallowInterceptTouchEvent(true);
            }
          }
          if (!this.c.a()) {
            this.c.h();
          }
          this.f = ((int)paramMotionEvent.getY());
          this.q = az.b(paramMotionEvent, 0);
          startNestedScroll(2);
          break;
        }
        i3 = az.a(paramMotionEvent, this.q);
        if (i3 != -1) {
          break;
        }
        Log.e("NestedScrollView", "Invalid pointerId=" + this.q + " in onTouchEvent");
      }
      i4 = (int)az.d(paramMotionEvent, i3);
      i2 = this.f - i4;
      i1 = i2;
      if (dispatchNestedPreScroll(0, i2, this.s, this.r))
      {
        i1 = i2 - this.s[1];
        localMotionEvent.offsetLocation(0.0F, this.r[1]);
        this.t += this.r[1];
      }
      if ((!this.j) && (Math.abs(i1) > this.n))
      {
        localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        this.j = true;
        if (i1 > 0) {
          i1 -= this.n;
        }
      }
      break;
    }
    label386:
    while (this.j)
    {
      this.f = (i4 - this.r[1]);
      int i5 = getScrollY();
      i4 = getScrollRange();
      i2 = bu.a(this);
      if ((i2 == 0) || ((i2 == 1) && (i4 > 0))) {}
      for (i2 = 1;; i2 = 0)
      {
        if ((a(0, i1, 0, getScrollY(), 0, i4, 0, 0, true)) && (!hasNestedScrollingParent())) {
          this.k.clear();
        }
        int i6 = getScrollY() - i5;
        if (!dispatchNestedScroll(0, i6, 0, i1 - i6, this.r)) {
          break label562;
        }
        this.f -= this.r[1];
        localMotionEvent.offsetLocation(0.0F, this.r[1]);
        this.t += this.r[1];
        break;
        i1 += this.n;
        break label386;
      }
      label562:
      if (i2 == 0) {
        break;
      }
      g();
      i2 = i5 + i1;
      if (i2 < 0)
      {
        this.d.a(i1 / getHeight(), az.c(paramMotionEvent, i3) / getWidth());
        if (!this.e.a()) {
          this.e.b();
        }
      }
      while ((this.d != null) && ((!this.d.a()) || (!this.e.a())))
      {
        bu.d(this);
        break;
        if (i2 > i4)
        {
          this.e.a(i1 / getHeight(), 1.0F - az.c(paramMotionEvent, i3) / getWidth());
          if (!this.d.a()) {
            this.d.b();
          }
        }
      }
      if (this.j)
      {
        paramMotionEvent = this.k;
        paramMotionEvent.computeCurrentVelocity(1000, this.p);
        i1 = (int)bp.b(paramMotionEvent, this.q);
        if (Math.abs(i1) <= this.o) {
          break label779;
        }
        f(-i1);
      }
      for (;;)
      {
        this.q = -1;
        f();
        break;
        label779:
        if (this.c.a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
          bu.d(this);
        }
      }
      if ((this.j) && (getChildCount() > 0) && (this.c.a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {
        bu.d(this);
      }
      this.q = -1;
      f();
      break;
      i1 = az.b(paramMotionEvent);
      this.f = ((int)az.d(paramMotionEvent, i1));
      this.q = az.b(paramMotionEvent, i1);
      break;
      a(paramMotionEvent);
      this.f = ((int)az.d(paramMotionEvent, az.a(paramMotionEvent, this.q)));
      break;
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.g) {
      b(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.i = paramView2;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return a(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      e();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    this.g = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt1 = b(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), localView.getWidth());
      paramInt2 = b(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), localView.getHeight());
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY())) {
        super.scrollTo(paramInt1, paramInt2);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
    {
      this.l = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.y.a(paramBoolean);
  }
  
  public void setOnScrollChangeListener(ae paramae)
  {
    this.A = paramae;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.y.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.y.c();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */