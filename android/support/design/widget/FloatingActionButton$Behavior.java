package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.i.bu;
import android.view.View;
import java.util.List;

public class FloatingActionButton$Behavior
  extends s
{
  private static final boolean a;
  private bx b;
  private float c;
  private Rect d;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private float a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
  {
    float f = 0.0F;
    List localList = paramCoordinatorLayout.d(paramFloatingActionButton);
    int j = localList.size();
    int i = 0;
    if (i < j)
    {
      View localView = (View)localList.get(i);
      if ((!(localView instanceof Snackbar.SnackbarLayout)) || (!paramCoordinatorLayout.a(paramFloatingActionButton, localView))) {
        break label88;
      }
      f = Math.min(f, bu.n(localView) - localView.getHeight());
    }
    label88:
    for (;;)
    {
      i += 1;
      break;
      return f;
    }
  }
  
  private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
  {
    if (((v)paramFloatingActionButton.getLayoutParams()).a() != paramAppBarLayout.getId()) {
      return false;
    }
    if (paramFloatingActionButton.getUserSetVisibility() != 0) {
      return false;
    }
    if (this.d == null) {
      this.d = new Rect();
    }
    Rect localRect = this.d;
    ci.b(paramCoordinatorLayout, paramAppBarLayout, localRect);
    if (localRect.bottom <= paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
      FloatingActionButton.a(paramFloatingActionButton, null, false);
    }
    for (;;)
    {
      return true;
      FloatingActionButton.b(paramFloatingActionButton, null, false);
    }
  }
  
  private void b(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
  {
    int j = 0;
    Rect localRect = FloatingActionButton.a(paramFloatingActionButton);
    v localv;
    int i;
    if ((localRect != null) && (localRect.centerX() > 0) && (localRect.centerY() > 0))
    {
      localv = (v)paramFloatingActionButton.getLayoutParams();
      if (paramFloatingActionButton.getRight() < paramCoordinatorLayout.getWidth() - localv.rightMargin) {
        break label98;
      }
      i = localRect.right;
    }
    for (;;)
    {
      if (paramFloatingActionButton.getBottom() >= paramCoordinatorLayout.getBottom() - localv.bottomMargin) {
        j = localRect.bottom;
      }
      for (;;)
      {
        paramFloatingActionButton.offsetTopAndBottom(j);
        paramFloatingActionButton.offsetLeftAndRight(i);
        return;
        label98:
        if (paramFloatingActionButton.getLeft() > localv.leftMargin) {
          break label143;
        }
        i = -localRect.left;
        break;
        if (paramFloatingActionButton.getTop() <= localv.topMargin) {
          j = -localRect.top;
        }
      }
      label143:
      i = 0;
    }
  }
  
  private void c(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    float f1 = a(paramCoordinatorLayout, paramFloatingActionButton);
    if (this.c == f1) {
      return;
    }
    float f2 = bu.n(paramFloatingActionButton);
    if ((this.b != null) && (this.b.b())) {
      this.b.e();
    }
    if ((paramFloatingActionButton.isShown()) && (Math.abs(f2 - f1) > paramFloatingActionButton.getHeight() * 0.667F))
    {
      if (this.b == null)
      {
        this.b = cq.a();
        this.b.a(a.b);
        this.b.a(new ad(this, paramFloatingActionButton));
      }
      this.b.a(f2, f1);
      this.b.a();
    }
    for (;;)
    {
      this.c = f1;
      return;
      bu.b(paramFloatingActionButton, f1);
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
  {
    List localList = paramCoordinatorLayout.d(paramFloatingActionButton);
    int j = localList.size();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        View localView = (View)localList.get(i);
        if ((!(localView instanceof AppBarLayout)) || (!a(paramCoordinatorLayout, (AppBarLayout)localView, paramFloatingActionButton))) {}
      }
      else
      {
        paramCoordinatorLayout.a(paramFloatingActionButton, paramInt);
        b(paramCoordinatorLayout, paramFloatingActionButton);
        return true;
      }
      i += 1;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    return (a) && ((paramView instanceof Snackbar.SnackbarLayout));
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    if ((paramView instanceof Snackbar.SnackbarLayout)) {
      c(paramCoordinatorLayout, paramFloatingActionButton, paramView);
    }
    for (;;)
    {
      return false;
      if ((paramView instanceof AppBarLayout)) {
        a(paramCoordinatorLayout, (AppBarLayout)paramView, paramFloatingActionButton);
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/FloatingActionButton$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */