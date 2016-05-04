package android.support.v7.view.menu;

import android.support.v7.view.d;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class q
  extends FrameLayout
  implements d
{
  final CollapsibleActionView a;
  
  q(View paramView)
  {
    super(paramView.getContext());
    this.a = ((CollapsibleActionView)paramView);
    addView(paramView);
  }
  
  public void a()
  {
    this.a.onActionViewExpanded();
  }
  
  public void b()
  {
    this.a.onActionViewCollapsed();
  }
  
  View c()
  {
    return (View)this.a;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */