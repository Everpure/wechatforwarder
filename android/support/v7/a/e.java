package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.i.bu;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.b.b;
import android.support.v7.b.l;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

class e
{
  private TextView A;
  private TextView B;
  private View C;
  private ListAdapter D;
  private int E = -1;
  private int F;
  private int G;
  private int H;
  private int I;
  private int J;
  private int K;
  private int L = 0;
  private Handler M;
  private final View.OnClickListener N = new f(this);
  private final Context a;
  private final as b;
  private final Window c;
  private CharSequence d;
  private CharSequence e;
  private ListView f;
  private View g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private boolean m = false;
  private Button n;
  private CharSequence o;
  private Message p;
  private Button q;
  private CharSequence r;
  private Message s;
  private Button t;
  private CharSequence u;
  private Message v;
  private NestedScrollView w;
  private int x = 0;
  private Drawable y;
  private ImageView z;
  
  public e(Context paramContext, as paramas, Window paramWindow)
  {
    this.a = paramContext;
    this.b = paramas;
    this.c = paramWindow;
    this.M = new q(paramas);
    paramContext = paramContext.obtainStyledAttributes(null, l.AlertDialog, b.alertDialogStyle, 0);
    this.F = paramContext.getResourceId(l.AlertDialog_android_layout, 0);
    this.G = paramContext.getResourceId(l.AlertDialog_buttonPanelSideLayout, 0);
    this.H = paramContext.getResourceId(l.AlertDialog_listLayout, 0);
    this.I = paramContext.getResourceId(l.AlertDialog_multiChoiceItemLayout, 0);
    this.J = paramContext.getResourceId(l.AlertDialog_singleChoiceItemLayout, 0);
    this.K = paramContext.getResourceId(l.AlertDialog_listItemLayout, 0);
    paramContext.recycle();
  }
  
  private ViewGroup a(View paramView1, View paramView2)
  {
    if (paramView1 == null) {
      if (!(paramView2 instanceof ViewStub)) {
        break label71;
      }
    }
    label71:
    for (paramView1 = ((ViewStub)paramView2).inflate();; paramView1 = paramView2)
    {
      return (ViewGroup)paramView1;
      if (paramView2 != null)
      {
        ViewParent localViewParent = paramView2.getParent();
        if ((localViewParent instanceof ViewGroup)) {
          ((ViewGroup)localViewParent).removeView(paramView2);
        }
      }
      if ((paramView1 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView1).inflate();
      }
      for (;;)
      {
        return (ViewGroup)paramView1;
      }
    }
  }
  
  private void a(ViewGroup paramViewGroup)
  {
    int i1 = 0;
    View localView;
    if (this.g != null) {
      localView = this.g;
    }
    for (;;)
    {
      if (localView != null) {
        i1 = 1;
      }
      if ((i1 == 0) || (!a(localView))) {
        this.c.setFlags(131072, 131072);
      }
      if (i1 == 0) {
        break;
      }
      FrameLayout localFrameLayout = (FrameLayout)this.c.findViewById(android.support.v7.b.g.custom);
      localFrameLayout.addView(localView, new ViewGroup.LayoutParams(-1, -1));
      if (this.m) {
        localFrameLayout.setPadding(this.i, this.j, this.k, this.l);
      }
      if (this.f != null) {
        ((LinearLayout.LayoutParams)paramViewGroup.getLayoutParams()).weight = 0.0F;
      }
      return;
      if (this.h != 0) {
        localView = LayoutInflater.from(this.a).inflate(this.h, paramViewGroup, false);
      } else {
        localView = null;
      }
    }
    paramViewGroup.setVisibility(8);
  }
  
  private void a(ViewGroup paramViewGroup, View paramView, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    View localView2 = this.c.findViewById(android.support.v7.b.g.scrollIndicatorUp);
    View localView1 = this.c.findViewById(android.support.v7.b.g.scrollIndicatorDown);
    if (Build.VERSION.SDK_INT >= 23)
    {
      bu.a(paramView, paramInt1, paramInt2);
      if (localView2 != null) {
        paramViewGroup.removeView(localView2);
      }
      if (localView1 != null) {
        paramViewGroup.removeView(localView1);
      }
    }
    label232:
    for (;;)
    {
      return;
      paramView = localView2;
      if (localView2 != null)
      {
        paramView = localView2;
        if ((paramInt1 & 0x1) == 0)
        {
          paramViewGroup.removeView(localView2);
          paramView = null;
        }
      }
      if ((localView1 != null) && ((paramInt1 & 0x2) == 0)) {
        paramViewGroup.removeView(localView1);
      }
      for (;;)
      {
        if ((paramView == null) && (localObject == null)) {
          break label232;
        }
        if (this.e != null)
        {
          this.w.setOnScrollChangeListener(new g(this, paramView, (View)localObject));
          this.w.post(new h(this, paramView, (View)localObject));
          return;
        }
        if (this.f != null)
        {
          this.f.setOnScrollListener(new i(this, paramView, (View)localObject));
          this.f.post(new j(this, paramView, (View)localObject));
          return;
        }
        if (paramView != null) {
          paramViewGroup.removeView(paramView);
        }
        if (localObject == null) {
          break;
        }
        paramViewGroup.removeView((View)localObject);
        return;
        localObject = localView1;
      }
    }
  }
  
  static boolean a(View paramView)
  {
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i1 = paramView.getChildCount();
    while (i1 > 0)
    {
      int i2 = i1 - 1;
      i1 = i2;
      if (a(paramView.getChildAt(i2))) {
        return true;
      }
    }
    return false;
  }
  
  private int b()
  {
    if (this.G == 0) {
      return this.F;
    }
    if (this.L == 1) {
      return this.G;
    }
    return this.F;
  }
  
  private static void b(View paramView1, View paramView2, View paramView3)
  {
    int i2 = 0;
    if (paramView2 != null)
    {
      if (bu.b(paramView1, -1))
      {
        i1 = 0;
        paramView2.setVisibility(i1);
      }
    }
    else if (paramView3 != null) {
      if (!bu.b(paramView1, 1)) {
        break label48;
      }
    }
    label48:
    for (int i1 = i2;; i1 = 4)
    {
      paramView3.setVisibility(i1);
      return;
      i1 = 4;
      break;
    }
  }
  
  private void b(ViewGroup paramViewGroup)
  {
    if (this.C != null)
    {
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
      paramViewGroup.addView(this.C, 0, localLayoutParams);
      this.c.findViewById(android.support.v7.b.g.title_template).setVisibility(8);
      return;
    }
    this.z = ((ImageView)this.c.findViewById(16908294));
    int i1;
    if (!TextUtils.isEmpty(this.d)) {
      i1 = 1;
    }
    while (i1 != 0)
    {
      this.A = ((TextView)this.c.findViewById(android.support.v7.b.g.alertTitle));
      this.A.setText(this.d);
      if (this.x != 0)
      {
        this.z.setImageResource(this.x);
        return;
        i1 = 0;
      }
      else
      {
        if (this.y != null)
        {
          this.z.setImageDrawable(this.y);
          return;
        }
        this.A.setPadding(this.z.getPaddingLeft(), this.z.getPaddingTop(), this.z.getPaddingRight(), this.z.getPaddingBottom());
        this.z.setVisibility(8);
        return;
      }
    }
    this.c.findViewById(android.support.v7.b.g.title_template).setVisibility(8);
    this.z.setVisibility(8);
    paramViewGroup.setVisibility(8);
  }
  
  private void c()
  {
    Object localObject2 = this.c.findViewById(android.support.v7.b.g.parentPanel);
    Object localObject4 = ((View)localObject2).findViewById(android.support.v7.b.g.topPanel);
    Object localObject3 = ((View)localObject2).findViewById(android.support.v7.b.g.contentPanel);
    Object localObject1 = ((View)localObject2).findViewById(android.support.v7.b.g.buttonPanel);
    localObject2 = (ViewGroup)((View)localObject2).findViewById(android.support.v7.b.g.customPanel);
    a((ViewGroup)localObject2);
    View localView3 = ((ViewGroup)localObject2).findViewById(android.support.v7.b.g.topPanel);
    View localView2 = ((ViewGroup)localObject2).findViewById(android.support.v7.b.g.contentPanel);
    View localView1 = ((ViewGroup)localObject2).findViewById(android.support.v7.b.g.buttonPanel);
    localObject4 = a(localView3, (View)localObject4);
    localObject3 = a(localView2, (View)localObject3);
    localObject1 = a(localView1, (View)localObject1);
    c((ViewGroup)localObject3);
    d((ViewGroup)localObject1);
    b((ViewGroup)localObject4);
    int i1;
    int i3;
    if ((localObject2 != null) && (((ViewGroup)localObject2).getVisibility() != 8))
    {
      i1 = 1;
      if ((localObject4 == null) || (((ViewGroup)localObject4).getVisibility() == 8)) {
        break label341;
      }
      i3 = 1;
      label173:
      if ((localObject1 == null) || (((ViewGroup)localObject1).getVisibility() == 8)) {
        break label346;
      }
      i2 = 1;
      label190:
      if ((i2 == 0) && (localObject3 != null))
      {
        localObject1 = ((ViewGroup)localObject3).findViewById(android.support.v7.b.g.textSpacerNoButtons);
        if (localObject1 != null) {
          ((View)localObject1).setVisibility(0);
        }
      }
      if ((i3 != 0) && (this.w != null)) {
        this.w.setClipToPadding(true);
      }
      if (i1 == 0)
      {
        if (this.f == null) {
          break label351;
        }
        localObject1 = this.f;
        label256:
        if (localObject1 != null)
        {
          if (i3 == 0) {
            break label360;
          }
          i1 = 1;
          label267:
          if (i2 == 0) {
            break label365;
          }
        }
      }
    }
    label341:
    label346:
    label351:
    label360:
    label365:
    for (int i2 = 2;; i2 = 0)
    {
      a((ViewGroup)localObject3, (View)localObject1, i2 | i1, 3);
      localObject1 = this.f;
      if ((localObject1 != null) && (this.D != null))
      {
        ((ListView)localObject1).setAdapter(this.D);
        i1 = this.E;
        if (i1 > -1)
        {
          ((ListView)localObject1).setItemChecked(i1, true);
          ((ListView)localObject1).setSelection(i1);
        }
      }
      return;
      i1 = 0;
      break;
      i3 = 0;
      break label173;
      i2 = 0;
      break label190;
      localObject1 = this.w;
      break label256;
      i1 = 0;
      break label267;
    }
  }
  
  private void c(ViewGroup paramViewGroup)
  {
    this.w = ((NestedScrollView)this.c.findViewById(android.support.v7.b.g.scrollView));
    this.w.setFocusable(false);
    this.w.setNestedScrollingEnabled(false);
    this.B = ((TextView)paramViewGroup.findViewById(16908299));
    if (this.B == null) {
      return;
    }
    if (this.e != null)
    {
      this.B.setText(this.e);
      return;
    }
    this.B.setVisibility(8);
    this.w.removeView(this.B);
    if (this.f != null)
    {
      paramViewGroup = (ViewGroup)this.w.getParent();
      int i1 = paramViewGroup.indexOfChild(this.w);
      paramViewGroup.removeViewAt(i1);
      paramViewGroup.addView(this.f, i1, new ViewGroup.LayoutParams(-1, -1));
      return;
    }
    paramViewGroup.setVisibility(8);
  }
  
  private void d(ViewGroup paramViewGroup)
  {
    int i2 = 1;
    this.n = ((Button)paramViewGroup.findViewById(16908313));
    this.n.setOnClickListener(this.N);
    if (TextUtils.isEmpty(this.o))
    {
      this.n.setVisibility(8);
      i1 = 0;
      this.q = ((Button)paramViewGroup.findViewById(16908314));
      this.q.setOnClickListener(this.N);
      if (!TextUtils.isEmpty(this.r)) {
        break label177;
      }
      this.q.setVisibility(8);
      label92:
      this.t = ((Button)paramViewGroup.findViewById(16908315));
      this.t.setOnClickListener(this.N);
      if (!TextUtils.isEmpty(this.u)) {
        break label203;
      }
      this.t.setVisibility(8);
      label136:
      if (i1 == 0) {
        break label229;
      }
    }
    label177:
    label203:
    label229:
    for (int i1 = i2;; i1 = 0)
    {
      if (i1 == 0) {
        paramViewGroup.setVisibility(8);
      }
      return;
      this.n.setText(this.o);
      this.n.setVisibility(0);
      i1 = 1;
      break;
      this.q.setText(this.r);
      this.q.setVisibility(0);
      i1 |= 0x2;
      break label92;
      this.t.setText(this.u);
      this.t.setVisibility(0);
      i1 |= 0x4;
      break label136;
    }
  }
  
  public void a()
  {
    this.b.a(1);
    int i1 = b();
    this.b.setContentView(i1);
    c();
  }
  
  public void a(int paramInt)
  {
    this.g = null;
    this.h = paramInt;
    this.m = false;
  }
  
  public void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    Message localMessage = paramMessage;
    if (paramMessage == null)
    {
      localMessage = paramMessage;
      if (paramOnClickListener != null) {
        localMessage = this.M.obtainMessage(paramInt, paramOnClickListener);
      }
    }
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Button does not exist");
    case -1: 
      this.o = paramCharSequence;
      this.p = localMessage;
      return;
    case -2: 
      this.r = paramCharSequence;
      this.s = localMessage;
      return;
    }
    this.u = paramCharSequence;
    this.v = localMessage;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.y = paramDrawable;
    this.x = 0;
    if (this.z != null)
    {
      if (paramDrawable != null)
      {
        this.z.setVisibility(0);
        this.z.setImageDrawable(paramDrawable);
      }
    }
    else {
      return;
    }
    this.z.setVisibility(8);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g = paramView;
    this.h = 0;
    this.m = true;
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    if (this.A != null) {
      this.A.setText(paramCharSequence);
    }
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return (this.w != null) && (this.w.a(paramKeyEvent));
  }
  
  public void b(int paramInt)
  {
    this.y = null;
    this.x = paramInt;
    if (this.z != null)
    {
      if (paramInt != 0)
      {
        this.z.setVisibility(0);
        this.z.setImageResource(this.x);
      }
    }
    else {
      return;
    }
    this.z.setVisibility(8);
  }
  
  public void b(View paramView)
  {
    this.C = paramView;
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    if (this.B != null) {
      this.B.setText(paramCharSequence);
    }
  }
  
  public boolean b(int paramInt, KeyEvent paramKeyEvent)
  {
    return (this.w != null) && (this.w.a(paramKeyEvent));
  }
  
  public int c(int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    this.a.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  public void c(View paramView)
  {
    this.g = paramView;
    this.h = 0;
    this.m = false;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */