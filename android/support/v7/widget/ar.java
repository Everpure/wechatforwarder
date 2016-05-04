package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ar
{
  private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  private static ar b;
  private static final au c = new au(6);
  private static final int[] d = { android.support.v7.b.f.abc_textfield_search_default_mtrl_alpha, android.support.v7.b.f.abc_textfield_default_mtrl_alpha, android.support.v7.b.f.abc_ab_share_pack_mtrl_alpha };
  private static final int[] e = { android.support.v7.b.f.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.b.f.abc_ic_go_search_api_mtrl_alpha, android.support.v7.b.f.abc_ic_search_api_mtrl_alpha, android.support.v7.b.f.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.b.f.abc_ic_clear_mtrl_alpha, android.support.v7.b.f.abc_ic_menu_share_mtrl_alpha, android.support.v7.b.f.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.b.f.abc_ic_menu_cut_mtrl_alpha, android.support.v7.b.f.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.b.f.abc_ic_menu_paste_mtrl_am_alpha, android.support.v7.b.f.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.b.f.abc_ic_voice_search_api_mtrl_alpha };
  private static final int[] f = { android.support.v7.b.f.abc_textfield_activated_mtrl_alpha, android.support.v7.b.f.abc_textfield_search_activated_mtrl_alpha, android.support.v7.b.f.abc_cab_background_top_mtrl_alpha, android.support.v7.b.f.abc_text_cursor_material };
  private static final int[] g = { android.support.v7.b.f.abc_popup_background_mtrl_mult, android.support.v7.b.f.abc_cab_background_internal_bg, android.support.v7.b.f.abc_menu_hardkey_panel_mtrl_mult };
  private static final int[] h = { android.support.v7.b.f.abc_edit_text_material, android.support.v7.b.f.abc_tab_indicator_material, android.support.v7.b.f.abc_textfield_search_material, android.support.v7.b.f.abc_spinner_mtrl_am_alpha, android.support.v7.b.f.abc_spinner_textfield_background_material, android.support.v7.b.f.abc_ratingbar_full_material, android.support.v7.b.f.abc_switch_track_mtrl_alpha, android.support.v7.b.f.abc_switch_thumb_material, android.support.v7.b.f.abc_btn_default_mtrl_shape, android.support.v7.b.f.abc_btn_borderless_material };
  private static final int[] i = { android.support.v7.b.f.abc_btn_check_material, android.support.v7.b.f.abc_btn_radio_material };
  private WeakHashMap j;
  private android.support.v4.h.a k;
  private SparseArray l;
  private final Object m = new Object();
  private final WeakHashMap n = new WeakHashMap(0);
  private TypedValue o;
  
  private ColorStateList a(Context paramContext)
  {
    int i1 = gm.a(paramContext, b.colorControlNormal);
    int i2 = gm.a(paramContext, b.colorControlActivated);
    int[] arrayOfInt = gm.a;
    int i3 = gm.c(paramContext, b.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt, gm.b, gm.c, gm.d, gm.e, gm.f, gm.h }, new int[] { i3, i2, i2, i2, i2, i2, i1 });
  }
  
  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter2 = c.a(paramInt, paramMode);
    PorterDuffColorFilter localPorterDuffColorFilter1 = localPorterDuffColorFilter2;
    if (localPorterDuffColorFilter2 == null)
    {
      localPorterDuffColorFilter1 = new PorterDuffColorFilter(paramInt, paramMode);
      c.a(paramInt, paramMode, localPorterDuffColorFilter1);
    }
    return localPorterDuffColorFilter1;
  }
  
  private static PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return a(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
  }
  
  private Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = b(paramContext, paramInt);
    if (localObject != null)
    {
      paramContext = paramDrawable;
      if (cs.b(paramDrawable)) {
        paramContext = paramDrawable.mutate();
      }
      paramContext = android.support.v4.d.a.a.f(paramContext);
      android.support.v4.d.a.a.a(paramContext, (ColorStateList)localObject);
      paramDrawable = a(paramInt);
      localObject = paramContext;
      if (paramDrawable != null)
      {
        android.support.v4.d.a.a.a(paramContext, paramDrawable);
        localObject = paramContext;
      }
    }
    do
    {
      do
      {
        return (Drawable)localObject;
        if (paramInt == android.support.v7.b.f.abc_cab_background_top_material) {
          return new LayerDrawable(new Drawable[] { a(paramContext, android.support.v7.b.f.abc_cab_background_internal_bg), a(paramContext, android.support.v7.b.f.abc_cab_background_top_mtrl_alpha) });
        }
        if (paramInt == android.support.v7.b.f.abc_seekbar_track_material)
        {
          localObject = (LayerDrawable)paramDrawable;
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), gm.a(paramContext, b.colorControlNormal), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), gm.a(paramContext, b.colorControlNormal), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), gm.a(paramContext, b.colorControlActivated), a);
          return paramDrawable;
        }
        if ((paramInt == android.support.v7.b.f.abc_ratingbar_indicator_material) || (paramInt == android.support.v7.b.f.abc_ratingbar_small_material))
        {
          localObject = (LayerDrawable)paramDrawable;
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), gm.c(paramContext, b.colorControlNormal), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), gm.a(paramContext, b.colorControlActivated), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), gm.a(paramContext, b.colorControlActivated), a);
          return paramDrawable;
        }
        localObject = paramDrawable;
      } while (a(paramContext, paramInt, paramDrawable));
      localObject = paramDrawable;
    } while (!paramBoolean);
    return null;
  }
  
  private Drawable a(Context paramContext, long paramLong)
  {
    android.support.v4.h.f localf;
    synchronized (this.m)
    {
      localf = (android.support.v4.h.f)this.n.get(paramContext);
      if (localf == null) {
        return null;
      }
      Object localObject2 = (WeakReference)localf.a(paramLong);
      if (localObject2 == null) {
        break label90;
      }
      localObject2 = (Drawable.ConstantState)((WeakReference)localObject2).get();
      if (localObject2 != null)
      {
        paramContext = ((Drawable.ConstantState)localObject2).newDrawable(paramContext.getResources());
        return paramContext;
      }
    }
    localf.b(paramLong);
    label90:
    return null;
  }
  
  public static ar a()
  {
    if (b == null)
    {
      b = new ar();
      a(b);
    }
    return b;
  }
  
  private void a(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    if (this.j == null) {
      this.j = new WeakHashMap();
    }
    SparseArray localSparseArray2 = (SparseArray)this.j.get(paramContext);
    SparseArray localSparseArray1 = localSparseArray2;
    if (localSparseArray2 == null)
    {
      localSparseArray1 = new SparseArray();
      this.j.put(paramContext, localSparseArray1);
    }
    localSparseArray1.append(paramInt, paramColorStateList);
  }
  
  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (cs.b(paramDrawable)) {
      localDrawable = paramDrawable.mutate();
    }
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = a;
    }
    localDrawable.setColorFilter(a(paramInt, paramDrawable));
  }
  
  public static void a(Drawable paramDrawable, gp paramgp, int[] paramArrayOfInt)
  {
    if ((cs.b(paramDrawable)) && (paramDrawable.mutate() != paramDrawable)) {
      Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
    }
    label64:
    label92:
    label104:
    for (;;)
    {
      return;
      ColorStateList localColorStateList;
      if ((paramgp.d) || (paramgp.c)) {
        if (paramgp.d)
        {
          localColorStateList = paramgp.a;
          if (!paramgp.c) {
            break label92;
          }
          paramgp = paramgp.b;
          paramDrawable.setColorFilter(a(localColorStateList, paramgp, paramArrayOfInt));
        }
      }
      for (;;)
      {
        if (Build.VERSION.SDK_INT > 23) {
          break label104;
        }
        paramDrawable.invalidateSelf();
        return;
        localColorStateList = null;
        break;
        paramgp = a;
        break label64;
        paramDrawable.clearColorFilter();
      }
    }
  }
  
  private static void a(ar paramar)
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 < 21)
    {
      paramar.a("vector", new aw(null));
      if (i1 >= 11) {
        paramar.a("animated-vector", new at(null));
      }
    }
  }
  
  private void a(String paramString, av paramav)
  {
    if (this.k == null) {
      this.k = new android.support.v4.h.a();
    }
    this.k.put(paramString, paramav);
  }
  
  private static boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    PorterDuff.Mode localMode = a;
    int i1;
    int i2;
    if (a(d, paramInt))
    {
      i1 = b.colorControlNormal;
      i2 = 1;
      paramInt = -1;
    }
    for (;;)
    {
      if (i2 != 0)
      {
        Drawable localDrawable = paramDrawable;
        if (cs.b(paramDrawable)) {
          localDrawable = paramDrawable.mutate();
        }
        localDrawable.setColorFilter(a(gm.a(paramContext, i1), localMode));
        if (paramInt != -1) {
          localDrawable.setAlpha(paramInt);
        }
        return true;
        if (a(f, paramInt))
        {
          i1 = b.colorControlActivated;
          i2 = 1;
          paramInt = -1;
          continue;
        }
        if (a(g, paramInt))
        {
          localMode = PorterDuff.Mode.MULTIPLY;
          i2 = 1;
          i1 = 16842801;
          paramInt = -1;
          continue;
        }
        if (paramInt == android.support.v7.b.f.abc_list_divider_mtrl_alpha)
        {
          i1 = 16842800;
          paramInt = Math.round(40.8F);
          i2 = 1;
        }
      }
      else
      {
        return false;
      }
      paramInt = -1;
      i1 = 0;
      i2 = 0;
    }
  }
  
  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null) {
      synchronized (this.m)
      {
        android.support.v4.h.f localf = (android.support.v4.h.f)this.n.get(paramContext);
        paramDrawable = localf;
        if (localf == null)
        {
          paramDrawable = new android.support.v4.h.f();
          this.n.put(paramContext, paramDrawable);
        }
        paramDrawable.b(paramLong, new WeakReference(localConstantState));
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool2 = false;
    int i2 = paramArrayOfInt.length;
    int i1 = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < i2)
      {
        if (paramArrayOfInt[i1] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  private ColorStateList b(Context paramContext)
  {
    int[] arrayOfInt1 = gm.a;
    int i1 = gm.c(paramContext, b.colorControlNormal);
    int[] arrayOfInt2 = gm.e;
    int i2 = gm.a(paramContext, b.colorControlActivated);
    int[] arrayOfInt3 = gm.h;
    int i3 = gm.a(paramContext, b.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private ColorStateList c(Context paramContext)
  {
    int[] arrayOfInt1 = gm.a;
    int i1 = gm.a(paramContext, 16842800, 0.1F);
    int[] arrayOfInt2 = gm.e;
    int i2 = gm.a(paramContext, b.colorControlActivated, 0.3F);
    int[] arrayOfInt3 = gm.h;
    int i3 = gm.a(paramContext, 16842800, 0.3F);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private Drawable c(Context paramContext, int paramInt)
  {
    if ((this.k != null) && (!this.k.isEmpty()))
    {
      if (this.l != null)
      {
        localObject1 = (String)this.l.get(paramInt);
        if (("appcompat_skip_skip".equals(localObject1)) || ((localObject1 != null) && (this.k.get(localObject1) == null)))
        {
          localObject1 = null;
          return (Drawable)localObject1;
        }
      }
      else
      {
        this.l = new SparseArray();
      }
      if (this.o == null) {
        this.o = new TypedValue();
      }
      TypedValue localTypedValue = this.o;
      Object localObject1 = paramContext.getResources();
      ((Resources)localObject1).getValue(paramInt, localTypedValue, true);
      long l1 = localTypedValue.assetCookie << 32 | localTypedValue.data;
      Drawable localDrawable = a(paramContext, l1);
      if (localDrawable != null) {
        return localDrawable;
      }
      Object localObject2 = localDrawable;
      XmlResourceParser localXmlResourceParser;
      AttributeSet localAttributeSet;
      if (localTypedValue.string != null)
      {
        localObject2 = localDrawable;
        if (localTypedValue.string.toString().endsWith(".xml"))
        {
          localObject2 = localDrawable;
          try
          {
            localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
            localObject2 = localDrawable;
            localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
            int i1;
            do
            {
              localObject2 = localDrawable;
              i1 = localXmlResourceParser.next();
            } while ((i1 != 2) && (i1 != 1));
            if (i1 != 2)
            {
              localObject2 = localDrawable;
              throw new XmlPullParserException("No start tag found");
            }
          }
          catch (Exception paramContext)
          {
            Log.e("AppCompatDrawableManager", "Exception while inflating drawable", paramContext);
          }
        }
      }
      for (paramContext = (Context)localObject2;; paramContext = (Context)localObject1)
      {
        localObject1 = paramContext;
        if (paramContext != null) {
          break;
        }
        this.l.append(paramInt, "appcompat_skip_skip");
        return paramContext;
        localObject2 = localDrawable;
        localObject1 = localXmlResourceParser.getName();
        localObject2 = localDrawable;
        this.l.append(paramInt, localObject1);
        localObject2 = localDrawable;
        av localav = (av)this.k.get(localObject1);
        localObject1 = localDrawable;
        if (localav != null)
        {
          localObject2 = localDrawable;
          localObject1 = localav.a(paramContext, localXmlResourceParser, localAttributeSet, paramContext.getTheme());
        }
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          ((Drawable)localObject1).setChangingConfigurations(localTypedValue.changingConfigurations);
          localObject2 = localObject1;
          boolean bool = a(paramContext, l1, (Drawable)localObject1);
          if (!bool) {}
        }
      }
    }
    return null;
  }
  
  private ColorStateList d(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList localColorStateList = gm.b(paramContext, b.colorSwitchThumbNormal);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      arrayOfInt[0] = gm.a;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = gm.e;
      arrayOfInt1[1] = gm.a(paramContext, b.colorControlActivated);
      arrayOfInt[2] = gm.h;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    for (;;)
    {
      return new ColorStateList(arrayOfInt, arrayOfInt1);
      arrayOfInt[0] = gm.a;
      arrayOfInt1[0] = gm.c(paramContext, b.colorSwitchThumbNormal);
      arrayOfInt[1] = gm.e;
      arrayOfInt1[1] = gm.a(paramContext, b.colorControlActivated);
      arrayOfInt[2] = gm.h;
      arrayOfInt1[2] = gm.a(paramContext, b.colorSwitchThumbNormal);
    }
  }
  
  private ColorStateList d(Context paramContext, int paramInt)
  {
    if (this.j != null)
    {
      paramContext = (SparseArray)this.j.get(paramContext);
      if (paramContext != null) {
        return (ColorStateList)paramContext.get(paramInt);
      }
      return null;
    }
    return null;
  }
  
  private ColorStateList e(Context paramContext)
  {
    int[] arrayOfInt1 = gm.a;
    int i1 = gm.c(paramContext, b.colorControlNormal);
    int[] arrayOfInt2 = gm.g;
    int i2 = gm.a(paramContext, b.colorControlNormal);
    int[] arrayOfInt3 = gm.h;
    int i3 = gm.a(paramContext, b.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private ColorStateList e(Context paramContext, int paramInt)
  {
    paramInt = gm.a(paramContext, paramInt);
    int i3 = gm.a(paramContext, b.colorControlHighlight);
    int[] arrayOfInt1 = gm.a;
    int i1 = gm.c(paramContext, b.colorButtonNormal);
    paramContext = gm.d;
    int i2 = android.support.v4.d.a.a(i3, paramInt);
    int[] arrayOfInt2 = gm.b;
    i3 = android.support.v4.d.a.a(i3, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, paramContext, arrayOfInt2, gm.h }, new int[] { i1, i2, i3, paramInt });
  }
  
  private ColorStateList f(Context paramContext)
  {
    return e(paramContext, b.colorButtonNormal);
  }
  
  private ColorStateList g(Context paramContext)
  {
    return e(paramContext, b.colorAccent);
  }
  
  private ColorStateList h(Context paramContext)
  {
    int[] arrayOfInt1 = gm.a;
    int i1 = gm.c(paramContext, b.colorControlNormal);
    int[] arrayOfInt2 = gm.g;
    int i2 = gm.a(paramContext, b.colorControlNormal);
    int[] arrayOfInt3 = gm.h;
    int i3 = gm.a(paramContext, b.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }
  
  private ColorStateList i(Context paramContext)
  {
    int[] arrayOfInt1 = gm.a;
    int i1 = gm.c(paramContext, b.colorControlActivated);
    int[] arrayOfInt2 = gm.h;
    int i2 = gm.a(paramContext, b.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2 }, new int[] { i1, i2 });
  }
  
  final PorterDuff.Mode a(int paramInt)
  {
    PorterDuff.Mode localMode = null;
    if (paramInt == android.support.v7.b.f.abc_switch_thumb_material) {
      localMode = PorterDuff.Mode.MULTIPLY;
    }
    return localMode;
  }
  
  public Drawable a(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, false);
  }
  
  public Drawable a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    Object localObject2 = c(paramContext, paramInt);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = android.support.v4.c.a.a(paramContext, paramInt);
    }
    localObject2 = localObject1;
    if (localObject1 != null) {
      localObject2 = a(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
    }
    if (localObject2 != null) {
      cs.a((Drawable)localObject2);
    }
    return (Drawable)localObject2;
  }
  
  public final Drawable a(Context paramContext, gq paramgq, int paramInt)
  {
    Drawable localDrawable2 = c(paramContext, paramInt);
    Drawable localDrawable1 = localDrawable2;
    if (localDrawable2 == null) {
      localDrawable1 = paramgq.a(paramInt);
    }
    if (localDrawable1 != null) {
      return a(paramContext, paramInt, false, localDrawable1);
    }
    return null;
  }
  
  public final ColorStateList b(Context paramContext, int paramInt)
  {
    ColorStateList localColorStateList1 = d(paramContext, paramInt);
    ColorStateList localColorStateList2 = localColorStateList1;
    if (localColorStateList1 == null)
    {
      if (paramInt != android.support.v7.b.f.abc_edit_text_material) {
        break label47;
      }
      localColorStateList1 = e(paramContext);
    }
    for (;;)
    {
      localColorStateList2 = localColorStateList1;
      if (localColorStateList1 != null)
      {
        a(paramContext, paramInt, localColorStateList1);
        localColorStateList2 = localColorStateList1;
      }
      return localColorStateList2;
      label47:
      if (paramInt == android.support.v7.b.f.abc_switch_track_mtrl_alpha) {
        localColorStateList1 = c(paramContext);
      } else if (paramInt == android.support.v7.b.f.abc_switch_thumb_material) {
        localColorStateList1 = d(paramContext);
      } else if ((paramInt == android.support.v7.b.f.abc_btn_default_mtrl_shape) || (paramInt == android.support.v7.b.f.abc_btn_borderless_material)) {
        localColorStateList1 = f(paramContext);
      } else if (paramInt == android.support.v7.b.f.abc_btn_colored_material) {
        localColorStateList1 = g(paramContext);
      } else if ((paramInt == android.support.v7.b.f.abc_spinner_mtrl_am_alpha) || (paramInt == android.support.v7.b.f.abc_spinner_textfield_background_material)) {
        localColorStateList1 = h(paramContext);
      } else if (a(e, paramInt)) {
        localColorStateList1 = gm.b(paramContext, b.colorControlNormal);
      } else if (a(h, paramInt)) {
        localColorStateList1 = a(paramContext);
      } else if (a(i, paramInt)) {
        localColorStateList1 = b(paramContext);
      } else if (paramInt == android.support.v7.b.f.abc_seekbar_thumb_material) {
        localColorStateList1 = i(paramContext);
      }
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */