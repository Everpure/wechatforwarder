package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public class t
{
  private final k a;
  private int b;
  
  public t(Context paramContext)
  {
    this(paramContext, s.a(paramContext, 0));
  }
  
  public t(Context paramContext, int paramInt)
  {
    this.a = new k(new ContextThemeWrapper(paramContext, s.a(paramContext, paramInt)));
    this.b = paramInt;
  }
  
  public Context a()
  {
    return this.a.a;
  }
  
  public t a(int paramInt)
  {
    this.a.f = this.a.a.getText(paramInt);
    return this;
  }
  
  public t a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.i = this.a.a.getText(paramInt);
    this.a.j = paramOnClickListener;
    return this;
  }
  
  public t a(DialogInterface.OnKeyListener paramOnKeyListener)
  {
    this.a.r = paramOnKeyListener;
    return this;
  }
  
  public t a(Drawable paramDrawable)
  {
    this.a.d = paramDrawable;
    return this;
  }
  
  public t a(View paramView)
  {
    this.a.g = paramView;
    return this;
  }
  
  public t a(ListAdapter paramListAdapter, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.t = paramListAdapter;
    this.a.u = paramOnClickListener;
    return this;
  }
  
  public t a(CharSequence paramCharSequence)
  {
    this.a.f = paramCharSequence;
    return this;
  }
  
  public s b()
  {
    s locals = new s(this.a.a, this.b, false);
    this.a.a(s.a(locals));
    locals.setCancelable(this.a.o);
    if (this.a.o) {
      locals.setCanceledOnTouchOutside(true);
    }
    locals.setOnCancelListener(this.a.p);
    locals.setOnDismissListener(this.a.q);
    if (this.a.r != null) {
      locals.setOnKeyListener(this.a.r);
    }
    return locals;
  }
  
  public t b(int paramInt)
  {
    this.a.h = this.a.a.getText(paramInt);
    return this;
  }
  
  public t b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.k = this.a.a.getText(paramInt);
    this.a.l = paramOnClickListener;
    return this;
  }
  
  public t b(View paramView)
  {
    this.a.w = paramView;
    this.a.v = 0;
    this.a.B = false;
    return this;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */