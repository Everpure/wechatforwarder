package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.c.a;
import android.support.v4.i.bo;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class bj
  extends Spinner
  implements bo
{
  private static final boolean a;
  private static final boolean b;
  private static final int[] c;
  private ar d;
  private am e;
  private Context f;
  private dl g;
  private SpinnerAdapter h;
  private boolean i;
  private bm j;
  private int k;
  private final Rect l;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = true;
      a = bool;
      if (Build.VERSION.SDK_INT < 16) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      c = new int[] { 16843505 };
      return;
      bool = false;
      break;
    }
  }
  
  public bj(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.spinnerStyle);
  }
  
  public bj(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public bj(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  /* Error */
  public bj(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, android.content.res.Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 62	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 64	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 66	android/graphics/Rect:<init>	()V
    //   15: putfield 68	android/support/v7/widget/bj:l	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 73	android/support/v7/b/l:Spinner	[I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic 78	android/support/v7/widget/gr:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/gr;
    //   28: astore 10
    //   30: aload_0
    //   31: invokestatic 83	android/support/v7/widget/ar:a	()Landroid/support/v7/widget/ar;
    //   34: putfield 85	android/support/v7/widget/bj:d	Landroid/support/v7/widget/ar;
    //   37: aload_0
    //   38: new 87	android/support/v7/widget/am
    //   41: dup
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 85	android/support/v7/widget/bj:d	Landroid/support/v7/widget/ar;
    //   47: invokespecial 90	android/support/v7/widget/am:<init>	(Landroid/view/View;Landroid/support/v7/widget/ar;)V
    //   50: putfield 92	android/support/v7/widget/bj:e	Landroid/support/v7/widget/am;
    //   53: aload 5
    //   55: ifnull +286 -> 341
    //   58: aload_0
    //   59: new 94	android/support/v7/view/e
    //   62: dup
    //   63: aload_1
    //   64: aload 5
    //   66: invokespecial 97	android/support/v7/view/e:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   69: putfield 99	android/support/v7/widget/bj:f	Landroid/content/Context;
    //   72: aload_0
    //   73: getfield 99	android/support/v7/widget/bj:f	Landroid/content/Context;
    //   76: ifnull +184 -> 260
    //   79: iload 4
    //   81: istore 7
    //   83: iload 4
    //   85: iconst_m1
    //   86: if_icmpne +71 -> 157
    //   89: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   92: bipush 11
    //   94: if_icmplt +360 -> 454
    //   97: aload_1
    //   98: aload_2
    //   99: getstatic 42	android/support/v7/widget/bj:c	[I
    //   102: iload_3
    //   103: iconst_0
    //   104: invokevirtual 105	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   107: astore 8
    //   109: iload 4
    //   111: istore 6
    //   113: aload 8
    //   115: astore 5
    //   117: aload 8
    //   119: iconst_0
    //   120: invokevirtual 111	android/content/res/TypedArray:hasValue	(I)Z
    //   123: ifeq +16 -> 139
    //   126: aload 8
    //   128: astore 5
    //   130: aload 8
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual 115	android/content/res/TypedArray:getInt	(II)I
    //   137: istore 6
    //   139: iload 6
    //   141: istore 7
    //   143: aload 8
    //   145: ifnull +12 -> 157
    //   148: aload 8
    //   150: invokevirtual 118	android/content/res/TypedArray:recycle	()V
    //   153: iload 6
    //   155: istore 7
    //   157: iload 7
    //   159: iconst_1
    //   160: if_icmpne +100 -> 260
    //   163: new 120	android/support/v7/widget/bm
    //   166: dup
    //   167: aload_0
    //   168: aload_0
    //   169: getfield 99	android/support/v7/widget/bj:f	Landroid/content/Context;
    //   172: aload_2
    //   173: iload_3
    //   174: invokespecial 123	android/support/v7/widget/bm:<init>	(Landroid/support/v7/widget/bj;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   177: astore 5
    //   179: aload_0
    //   180: getfield 99	android/support/v7/widget/bj:f	Landroid/content/Context;
    //   183: aload_2
    //   184: getstatic 73	android/support/v7/b/l:Spinner	[I
    //   187: iload_3
    //   188: iconst_0
    //   189: invokestatic 78	android/support/v7/widget/gr:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/gr;
    //   192: astore 8
    //   194: aload_0
    //   195: aload 8
    //   197: getstatic 126	android/support/v7/b/l:Spinner_android_dropDownWidth	I
    //   200: bipush -2
    //   202: invokevirtual 128	android/support/v7/widget/gr:f	(II)I
    //   205: putfield 130	android/support/v7/widget/bj:k	I
    //   208: aload 5
    //   210: aload 8
    //   212: getstatic 133	android/support/v7/b/l:Spinner_android_popupBackground	I
    //   215: invokevirtual 136	android/support/v7/widget/gr:a	(I)Landroid/graphics/drawable/Drawable;
    //   218: invokevirtual 139	android/support/v7/widget/bm:a	(Landroid/graphics/drawable/Drawable;)V
    //   221: aload 5
    //   223: aload 10
    //   225: getstatic 142	android/support/v7/b/l:Spinner_android_prompt	I
    //   228: invokevirtual 145	android/support/v7/widget/gr:d	(I)Ljava/lang/String;
    //   231: invokevirtual 148	android/support/v7/widget/bm:a	(Ljava/lang/CharSequence;)V
    //   234: aload 8
    //   236: invokevirtual 150	android/support/v7/widget/gr:a	()V
    //   239: aload_0
    //   240: aload 5
    //   242: putfield 152	android/support/v7/widget/bj:j	Landroid/support/v7/widget/bm;
    //   245: aload_0
    //   246: new 154	android/support/v7/widget/bk
    //   249: dup
    //   250: aload_0
    //   251: aload_0
    //   252: aload 5
    //   254: invokespecial 157	android/support/v7/widget/bk:<init>	(Landroid/support/v7/widget/bj;Landroid/view/View;Landroid/support/v7/widget/bm;)V
    //   257: putfield 159	android/support/v7/widget/bj:g	Landroid/support/v7/widget/dl;
    //   260: aload 10
    //   262: getstatic 162	android/support/v7/b/l:Spinner_android_entries	I
    //   265: invokevirtual 165	android/support/v7/widget/gr:e	(I)[Ljava/lang/CharSequence;
    //   268: astore 5
    //   270: aload 5
    //   272: ifnull +29 -> 301
    //   275: new 167	android/widget/ArrayAdapter
    //   278: dup
    //   279: aload_1
    //   280: getstatic 172	android/support/v7/b/i:support_simple_spinner_dropdown_item	I
    //   283: aload 5
    //   285: invokespecial 175	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   288: astore_1
    //   289: aload_1
    //   290: getstatic 172	android/support/v7/b/i:support_simple_spinner_dropdown_item	I
    //   293: invokevirtual 179	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   296: aload_0
    //   297: aload_1
    //   298: invokevirtual 183	android/support/v7/widget/bj:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   301: aload 10
    //   303: invokevirtual 150	android/support/v7/widget/gr:a	()V
    //   306: aload_0
    //   307: iconst_1
    //   308: putfield 185	android/support/v7/widget/bj:i	Z
    //   311: aload_0
    //   312: getfield 187	android/support/v7/widget/bj:h	Landroid/widget/SpinnerAdapter;
    //   315: ifnull +16 -> 331
    //   318: aload_0
    //   319: aload_0
    //   320: getfield 187	android/support/v7/widget/bj:h	Landroid/widget/SpinnerAdapter;
    //   323: invokevirtual 183	android/support/v7/widget/bj:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   326: aload_0
    //   327: aconst_null
    //   328: putfield 187	android/support/v7/widget/bj:h	Landroid/widget/SpinnerAdapter;
    //   331: aload_0
    //   332: getfield 92	android/support/v7/widget/bj:e	Landroid/support/v7/widget/am;
    //   335: aload_2
    //   336: iload_3
    //   337: invokevirtual 190	android/support/v7/widget/am:a	(Landroid/util/AttributeSet;I)V
    //   340: return
    //   341: aload 10
    //   343: getstatic 193	android/support/v7/b/l:Spinner_popupTheme	I
    //   346: iconst_0
    //   347: invokevirtual 195	android/support/v7/widget/gr:g	(II)I
    //   350: istore 6
    //   352: iload 6
    //   354: ifeq +20 -> 374
    //   357: aload_0
    //   358: new 94	android/support/v7/view/e
    //   361: dup
    //   362: aload_1
    //   363: iload 6
    //   365: invokespecial 198	android/support/v7/view/e:<init>	(Landroid/content/Context;I)V
    //   368: putfield 99	android/support/v7/widget/bj:f	Landroid/content/Context;
    //   371: goto -299 -> 72
    //   374: getstatic 37	android/support/v7/widget/bj:a	Z
    //   377: ifne +15 -> 392
    //   380: aload_1
    //   381: astore 5
    //   383: aload_0
    //   384: aload 5
    //   386: putfield 99	android/support/v7/widget/bj:f	Landroid/content/Context;
    //   389: goto -317 -> 72
    //   392: aconst_null
    //   393: astore 5
    //   395: goto -12 -> 383
    //   398: astore 9
    //   400: aconst_null
    //   401: astore 8
    //   403: aload 8
    //   405: astore 5
    //   407: ldc -56
    //   409: ldc -54
    //   411: aload 9
    //   413: invokestatic 207	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   416: pop
    //   417: iload 4
    //   419: istore 7
    //   421: aload 8
    //   423: ifnull -266 -> 157
    //   426: aload 8
    //   428: invokevirtual 118	android/content/res/TypedArray:recycle	()V
    //   431: iload 4
    //   433: istore 7
    //   435: goto -278 -> 157
    //   438: astore_1
    //   439: aconst_null
    //   440: astore 5
    //   442: aload 5
    //   444: ifnull +8 -> 452
    //   447: aload 5
    //   449: invokevirtual 118	android/content/res/TypedArray:recycle	()V
    //   452: aload_1
    //   453: athrow
    //   454: iconst_1
    //   455: istore 7
    //   457: goto -300 -> 157
    //   460: astore_1
    //   461: goto -19 -> 442
    //   464: astore 9
    //   466: goto -63 -> 403
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	469	0	this	bj
    //   0	469	1	paramContext	Context
    //   0	469	2	paramAttributeSet	AttributeSet
    //   0	469	3	paramInt1	int
    //   0	469	4	paramInt2	int
    //   0	469	5	paramTheme	android.content.res.Resources.Theme
    //   111	253	6	m	int
    //   81	375	7	n	int
    //   107	320	8	localObject	Object
    //   398	14	9	localException1	Exception
    //   464	1	9	localException2	Exception
    //   28	314	10	localgr	gr
    // Exception table:
    //   from	to	target	type
    //   97	109	398	java/lang/Exception
    //   97	109	438	finally
    //   117	126	460	finally
    //   130	139	460	finally
    //   407	417	460	finally
    //   117	126	464	java/lang/Exception
    //   130	139	464	java/lang/Exception
  }
  
  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int i3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = Math.max(0, getSelectedItemPosition());
    int i5 = Math.min(paramSpinnerAdapter.getCount(), m + 15);
    int n = Math.max(0, m - (15 - (i5 - m)));
    View localView = null;
    int i1 = 0;
    m = 0;
    if (n < i5)
    {
      int i2 = paramSpinnerAdapter.getItemViewType(n);
      if (i2 == m) {
        break label204;
      }
      localView = null;
      m = i2;
    }
    label204:
    for (;;)
    {
      localView = paramSpinnerAdapter.getView(n, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(i3, i4);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      n += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.l);
        return this.l.left + this.l.right + i1;
      }
      return i1;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.e != null) {
      this.e.c();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    if (this.j != null) {
      return this.j.f();
    }
    if (b) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public int getDropDownVerticalOffset()
  {
    if (this.j != null) {
      return this.j.g();
    }
    if (b) {
      return super.getDropDownVerticalOffset();
    }
    return 0;
  }
  
  public int getDropDownWidth()
  {
    if (this.j != null) {
      return this.k;
    }
    if (b) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public Drawable getPopupBackground()
  {
    if (this.j != null) {
      return this.j.d();
    }
    if (b) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public Context getPopupContext()
  {
    if (this.j != null) {
      return this.f;
    }
    if (a) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public CharSequence getPrompt()
  {
    if (this.j != null) {
      return this.j.a();
    }
    return super.getPrompt();
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.e != null) {
      return this.e.a();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.e != null) {
      return this.e.b();
    }
    return null;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.j != null) && (this.j.k())) {
      this.j.i();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.j != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.g != null) && (this.g.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    if ((this.j != null) && (!this.j.k()))
    {
      this.j.c();
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.i) {
      this.h = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (this.j == null);
    if (this.f == null) {}
    for (Context localContext = getContext();; localContext = this.f)
    {
      this.j.a(new bl(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.e != null) {
      this.e.a(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.e != null) {
      this.e.a(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.j != null) {
      this.j.b(paramInt);
    }
    while (!b) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.j != null) {
      this.j.c(paramInt);
    }
    while (!b) {
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (this.j != null) {
      this.k = paramInt;
    }
    while (!b) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.j != null) {
      this.j.a(paramDrawable);
    }
    while (!b) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(a.a(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.j != null)
    {
      this.j.a(paramCharSequence);
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.e != null) {
      this.e.a(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.e != null) {
      this.e.a(paramMode);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */