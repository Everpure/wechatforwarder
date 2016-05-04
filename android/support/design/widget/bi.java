package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

final class bi
  extends SwipeDismissBehavior
{
  bi(Snackbar paramSnackbar) {}
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, Snackbar.SnackbarLayout paramSnackbarLayout, MotionEvent paramMotionEvent)
  {
    if (paramCoordinatorLayout.a(paramSnackbarLayout, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
      switch (paramMotionEvent.getActionMasked())
      {
      }
    }
    for (;;)
    {
      return super.a(paramCoordinatorLayout, paramSnackbarLayout, paramMotionEvent);
      bm.a().c(Snackbar.a(this.a));
      continue;
      bm.a().d(Snackbar.a(this.a));
    }
  }
  
  public boolean a(View paramView)
  {
    return paramView instanceof Snackbar.SnackbarLayout;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */