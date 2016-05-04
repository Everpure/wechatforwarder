package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yalantis.ucrop.f;
import com.yalantis.ucrop.g;
import com.yalantis.ucrop.j;

public class UCropView
  extends FrameLayout
{
  private final GestureCropImageView a;
  private final OverlayView b;
  
  public UCropView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public UCropView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LayoutInflater.from(paramContext).inflate(g.ucrop_view, this, true);
    this.a = ((GestureCropImageView)findViewById(f.image_view_crop));
    this.b = ((OverlayView)findViewById(f.view_overlay));
    this.a.setCropBoundsChangeListener(new l(this));
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, j.ucrop_UCropView);
    this.b.a(paramContext);
    this.a.a(paramContext);
    paramContext.recycle();
  }
  
  public GestureCropImageView getCropImageView()
  {
    return this.a;
  }
  
  public OverlayView getOverlayView()
  {
    return this.b;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/view/UCropView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */