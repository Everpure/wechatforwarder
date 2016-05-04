package com.yalantis.ucrop.view;

import android.graphics.Bitmap;
import android.util.Log;
import com.yalantis.ucrop.a.b;

class j
  implements b
{
  j(i parami) {}
  
  public void a(Bitmap paramBitmap)
  {
    i.a(this.a, true);
    this.a.setImageBitmap(paramBitmap);
    this.a.invalidate();
  }
  
  public void a(Exception paramException)
  {
    Log.e("TransformImageView", "onFailure: setImageUri", paramException);
    if (this.a.f != null) {
      this.a.f.a(paramException);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */