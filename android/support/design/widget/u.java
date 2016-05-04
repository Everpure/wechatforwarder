package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

class u
  implements ViewGroup.OnHierarchyChangeListener
{
  private u(CoordinatorLayout paramCoordinatorLayout) {}
  
  public void onChildViewAdded(View paramView1, View paramView2)
  {
    if (CoordinatorLayout.a(this.a) != null) {
      CoordinatorLayout.a(this.a).onChildViewAdded(paramView1, paramView2);
    }
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2)
  {
    this.a.b(paramView2);
    if (CoordinatorLayout.a(this.a) != null) {
      CoordinatorLayout.a(this.a).onChildViewRemoved(paramView1, paramView2);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */