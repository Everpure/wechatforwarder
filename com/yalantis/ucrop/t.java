package com.yalantis.ucrop;

import android.view.View;
import android.view.View.OnClickListener;

class t
  implements View.OnClickListener
{
  t(UCropActivity paramUCropActivity) {}
  
  public void onClick(View paramView)
  {
    if (!paramView.isSelected()) {
      UCropActivity.b(this.a, paramView.getId());
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */