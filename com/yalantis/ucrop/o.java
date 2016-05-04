package com.yalantis.ucrop;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import java.util.Iterator;
import java.util.List;

class o
  implements View.OnClickListener
{
  o(UCropActivity paramUCropActivity) {}
  
  public void onClick(View paramView)
  {
    UCropActivity.b(this.a).setTargetAspectRatio(((AspectRatioTextView)((ViewGroup)paramView).getChildAt(0)).a(paramView.isSelected()));
    UCropActivity.b(this.a).c();
    if (!paramView.isSelected())
    {
      Iterator localIterator = UCropActivity.c(this.a).iterator();
      if (localIterator.hasNext())
      {
        ViewGroup localViewGroup = (ViewGroup)localIterator.next();
        if (localViewGroup == paramView) {}
        for (boolean bool = true;; bool = false)
        {
          localViewGroup.setSelected(bool);
          break;
        }
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */