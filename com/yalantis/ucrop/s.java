package com.yalantis.ucrop;

import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.a;

class s
  implements a
{
  s(UCropActivity paramUCropActivity) {}
  
  public void a()
  {
    UCropActivity.b(this.a).c();
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 > 0.0F)
    {
      UCropActivity.b(this.a).b(UCropActivity.b(this.a).getCurrentScale() + (UCropActivity.b(this.a).getMaxScale() - UCropActivity.b(this.a).getMinScale()) / 15000.0F * paramFloat1);
      return;
    }
    UCropActivity.b(this.a).a(UCropActivity.b(this.a).getCurrentScale() + (UCropActivity.b(this.a).getMaxScale() - UCropActivity.b(this.a).getMinScale()) / 15000.0F * paramFloat1);
  }
  
  public void b()
  {
    UCropActivity.b(this.a).b();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */