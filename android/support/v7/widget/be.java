package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.d.a.q;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class be
{
  private static final int[] b = { 16843067, 16843068 };
  final ar a;
  private final ProgressBar c;
  private Bitmap d;
  
  be(ProgressBar paramProgressBar, ar paramar)
  {
    this.c = paramProgressBar;
    this.a = paramar;
  }
  
  private Drawable a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if ((paramDrawable instanceof AnimationDrawable))
    {
      paramDrawable = (AnimationDrawable)paramDrawable;
      int j = paramDrawable.getNumberOfFrames();
      localObject = new AnimationDrawable();
      ((AnimationDrawable)localObject).setOneShot(paramDrawable.isOneShot());
      int i = 0;
      while (i < j)
      {
        Drawable localDrawable = a(paramDrawable.getFrame(i), true);
        localDrawable.setLevel(10000);
        ((AnimationDrawable)localObject).addFrame(localDrawable, paramDrawable.getDuration(i));
        i += 1;
      }
      ((AnimationDrawable)localObject).setLevel(10000);
    }
    return (Drawable)localObject;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int j = 0;
    if ((paramDrawable instanceof q))
    {
      localObject1 = ((q)paramDrawable).a();
      if (localObject1 != null)
      {
        localObject1 = a((Drawable)localObject1, paramBoolean);
        ((q)paramDrawable).a((Drawable)localObject1);
      }
    }
    do
    {
      return paramDrawable;
      if ((paramDrawable instanceof LayerDrawable))
      {
        localObject2 = (LayerDrawable)paramDrawable;
        int k = ((LayerDrawable)localObject2).getNumberOfLayers();
        paramDrawable = new Drawable[k];
        int i = 0;
        if (i < k)
        {
          int m = ((LayerDrawable)localObject2).getId(i);
          localObject1 = ((LayerDrawable)localObject2).getDrawable(i);
          if ((m == 16908301) || (m == 16908303)) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            paramDrawable[i] = a((Drawable)localObject1, paramBoolean);
            i += 1;
            break;
          }
        }
        localObject1 = new LayerDrawable(paramDrawable);
        i = j;
        for (;;)
        {
          paramDrawable = (Drawable)localObject1;
          if (i >= k) {
            break;
          }
          ((LayerDrawable)localObject1).setId(i, ((LayerDrawable)localObject2).getId(i));
          i += 1;
        }
      }
    } while (!(paramDrawable instanceof BitmapDrawable));
    paramDrawable = (BitmapDrawable)paramDrawable;
    Object localObject2 = paramDrawable.getBitmap();
    if (this.d == null) {
      this.d = ((Bitmap)localObject2);
    }
    Object localObject1 = new ShapeDrawable(b());
    localObject2 = new BitmapShader((Bitmap)localObject2, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
    ((ShapeDrawable)localObject1).getPaint().setShader((Shader)localObject2);
    ((ShapeDrawable)localObject1).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
    if (paramBoolean) {
      return new ClipDrawable((Drawable)localObject1, 3, 1);
    }
    return (Drawable)localObject1;
  }
  
  private Shape b()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }
  
  Bitmap a()
  {
    return this.d;
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = gr.a(this.c.getContext(), paramAttributeSet, b, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.b(0);
    if (localDrawable != null) {
      this.c.setIndeterminateDrawable(a(localDrawable));
    }
    localDrawable = paramAttributeSet.b(1);
    if (localDrawable != null) {
      this.c.setProgressDrawable(a(localDrawable, false));
    }
    paramAttributeSet.a();
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */