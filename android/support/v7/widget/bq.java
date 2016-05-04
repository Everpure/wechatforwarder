package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.support.v7.b.l;
import android.support.v7.f.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class bq
{
  private static final int[] b = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  private static final int[] c = { b.textAllCaps };
  final TextView a;
  private gp d;
  private gp e;
  private gp f;
  private gp g;
  
  bq(TextView paramTextView)
  {
    this.a = paramTextView;
  }
  
  static bq a(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new br(paramTextView);
    }
    return new bq(paramTextView);
  }
  
  protected static gp a(Context paramContext, ar paramar, int paramInt)
  {
    paramContext = paramar.b(paramContext, paramInt);
    if (paramContext != null)
    {
      paramar = new gp();
      paramar.d = true;
      paramar.a = paramContext;
      return paramar;
    }
    return null;
  }
  
  void a()
  {
    if ((this.d != null) || (this.e != null) || (this.f != null) || (this.g != null))
    {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.d);
      a(arrayOfDrawable[1], this.e);
      a(arrayOfDrawable[2], this.f);
      a(arrayOfDrawable[3], this.g);
    }
  }
  
  void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, c);
    if (paramContext.getBoolean(0, false)) {
      a(true);
    }
    paramContext.recycle();
  }
  
  final void a(Drawable paramDrawable, gp paramgp)
  {
    if ((paramDrawable != null) && (paramgp != null)) {
      ar.a(paramDrawable, paramgp, this.a.getDrawableState());
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int j = 1;
    Context localContext = this.a.getContext();
    Object localObject = ar.a();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    int i = localTypedArray.getResourceId(0, -1);
    if (localTypedArray.hasValue(1)) {
      this.d = a(localContext, (ar)localObject, localTypedArray.getResourceId(1, 0));
    }
    if (localTypedArray.hasValue(2)) {
      this.e = a(localContext, (ar)localObject, localTypedArray.getResourceId(2, 0));
    }
    if (localTypedArray.hasValue(3)) {
      this.f = a(localContext, (ar)localObject, localTypedArray.getResourceId(3, 0));
    }
    if (localTypedArray.hasValue(4)) {
      this.g = a(localContext, (ar)localObject, localTypedArray.getResourceId(4, 0));
    }
    localTypedArray.recycle();
    boolean bool;
    if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod))
    {
      if (i == -1) {
        break label268;
      }
      localObject = localContext.obtainStyledAttributes(i, l.TextAppearance);
      if (!((TypedArray)localObject).hasValue(l.TextAppearance_textAllCaps)) {
        break label260;
      }
      bool = ((TypedArray)localObject).getBoolean(l.TextAppearance_textAllCaps, false);
      i = 1;
      ((TypedArray)localObject).recycle();
    }
    for (;;)
    {
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, c, paramInt, 0);
      if (paramAttributeSet.hasValue(0)) {
        bool = paramAttributeSet.getBoolean(0, false);
      }
      for (paramInt = j;; paramInt = i)
      {
        paramAttributeSet.recycle();
        if (paramInt != 0) {
          a(bool);
        }
        return;
      }
      label260:
      i = 0;
      bool = false;
      break;
      label268:
      i = 0;
      bool = false;
    }
  }
  
  void a(boolean paramBoolean)
  {
    TextView localTextView = this.a;
    if (paramBoolean) {}
    for (a locala = new a(this.a.getContext());; locala = null)
    {
      localTextView.setTransformationMethod(locala);
      return;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */