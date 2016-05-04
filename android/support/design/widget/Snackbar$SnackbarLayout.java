package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.e;
import android.support.design.f;
import android.support.design.g;
import android.support.design.i;
import android.support.v4.i.bu;
import android.support.v4.i.di;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Snackbar$SnackbarLayout
  extends LinearLayout
{
  private TextView a;
  private Button b;
  private int c;
  private int d;
  private bl e;
  private bk f;
  
  public Snackbar$SnackbarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.SnackbarLayout);
    this.c = paramAttributeSet.getDimensionPixelSize(i.SnackbarLayout_android_maxWidth, -1);
    this.d = paramAttributeSet.getDimensionPixelSize(i.SnackbarLayout_maxActionInlineWidth, -1);
    if (paramAttributeSet.hasValue(i.SnackbarLayout_elevation)) {
      bu.d(this, paramAttributeSet.getDimensionPixelSize(i.SnackbarLayout_elevation, 0));
    }
    paramAttributeSet.recycle();
    setClickable(true);
    LayoutInflater.from(paramContext).inflate(g.design_layout_snackbar_include, this);
    bu.d(this, 1);
    bu.c(this, 1);
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (bu.w(paramView))
    {
      bu.a(paramView, bu.k(paramView), paramInt1, bu.l(paramView), paramInt2);
      return;
    }
    paramView.setPadding(paramView.getPaddingLeft(), paramInt1, paramView.getPaddingRight(), paramInt2);
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    if (paramInt1 != getOrientation())
    {
      setOrientation(paramInt1);
      bool = true;
    }
    if ((this.a.getPaddingTop() != paramInt2) || (this.a.getPaddingBottom() != paramInt3))
    {
      a(this.a, paramInt2, paramInt3);
      bool = true;
    }
    return bool;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    bu.c(this.a, 0.0F);
    bu.q(this.a).a(1.0F).a(paramInt2).b(paramInt1).c();
    if (this.b.getVisibility() == 0)
    {
      bu.c(this.b, 0.0F);
      bu.q(this.b).a(1.0F).a(paramInt2).b(paramInt1).c();
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    bu.c(this.a, 1.0F);
    bu.q(this.a).a(0.0F).a(paramInt2).b(paramInt1).c();
    if (this.b.getVisibility() == 0)
    {
      bu.c(this.b, 1.0F);
      bu.q(this.b).a(0.0F).a(paramInt2).b(paramInt1).c();
    }
  }
  
  Button getActionView()
  {
    return this.b;
  }
  
  TextView getMessageView()
  {
    return this.a;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.f != null) {
      this.f.a(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.f != null) {
      this.f.b(this);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(f.snackbar_text));
    this.b = ((Button)findViewById(f.snackbar_action));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.e != null) {
      this.e.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = paramInt1;
    if (this.c > 0)
    {
      i = paramInt1;
      if (getMeasuredWidth() > this.c)
      {
        i = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        super.onMeasure(i, paramInt2);
      }
    }
    int j = getResources().getDimensionPixelSize(e.design_snackbar_padding_vertical_2lines);
    int k = getResources().getDimensionPixelSize(e.design_snackbar_padding_vertical);
    if (this.a.getLayout().getLineCount() > 1)
    {
      paramInt1 = 1;
      if ((paramInt1 == 0) || (this.d <= 0) || (this.b.getMeasuredWidth() <= this.d)) {
        break label142;
      }
      if (!a(1, j, j - k)) {
        break label170;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        super.onMeasure(i, paramInt2);
      }
      return;
      paramInt1 = 0;
      break;
      label142:
      if (paramInt1 != 0) {}
      for (paramInt1 = j;; paramInt1 = k)
      {
        if (!a(0, paramInt1, paramInt1)) {
          break label170;
        }
        paramInt1 = 1;
        break;
      }
      label170:
      paramInt1 = 0;
    }
  }
  
  void setOnAttachStateChangeListener(bk parambk)
  {
    this.f = parambk;
  }
  
  void setOnLayoutChangeListener(bl parambl)
  {
    this.e = parambl;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/design/widget/Snackbar$SnackbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */