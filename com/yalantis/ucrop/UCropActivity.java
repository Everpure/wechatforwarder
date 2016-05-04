package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.a.u;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.k;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UCropActivity
  extends u
{
  public static final Bitmap.CompressFormat l = Bitmap.CompressFormat.JPEG;
  private ViewGroup A;
  private List B = new ArrayList();
  private TextView C;
  private TextView D;
  private Uri E;
  private Bitmap.CompressFormat F = l;
  private int G = 90;
  private int[] H = { 1, 2, 3 };
  private k I = new m(this);
  private final View.OnClickListener J = new t(this);
  private String m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private UCropView s;
  private GestureCropImageView t;
  private OverlayView u;
  private ViewGroup v;
  private ViewGroup w;
  private ViewGroup x;
  private ViewGroup y;
  private ViewGroup z;
  
  private void a(float paramFloat)
  {
    if (this.C != null) {
      this.C.setText(String.format("%.1f°", new Object[] { Float.valueOf(paramFloat) }));
    }
  }
  
  @TargetApi(21)
  private void a(int paramInt)
  {
    if ((Build.VERSION.SDK_INT >= 21) && (getWindow() != null)) {
      getWindow().setStatusBarColor(paramInt);
    }
  }
  
  private void a(Uri paramUri, float paramFloat)
  {
    setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", paramUri).putExtra("com.yalantis.ucrop.CropAspectRatio", paramFloat));
  }
  
  private void a(Throwable paramThrowable)
  {
    setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", paramThrowable));
  }
  
  private void b(float paramFloat)
  {
    if (this.D != null) {
      this.D.setText(String.format("%d%%", new Object[] { Integer.valueOf((int)(100.0F * paramFloat)) }));
    }
  }
  
  private void b(int paramInt)
  {
    this.t.c(paramInt);
    this.t.c();
  }
  
  private void c(int paramInt)
  {
    int j = 8;
    ViewGroup localViewGroup = this.v;
    boolean bool;
    if (paramInt == f.state_aspect_ratio)
    {
      bool = true;
      localViewGroup.setSelected(bool);
      localViewGroup = this.w;
      if (paramInt != f.state_rotate) {
        break label156;
      }
      bool = true;
      label42:
      localViewGroup.setSelected(bool);
      localViewGroup = this.x;
      if (paramInt != f.state_scale) {
        break label162;
      }
      bool = true;
      label65:
      localViewGroup.setSelected(bool);
      localViewGroup = this.y;
      if (paramInt != f.state_aspect_ratio) {
        break label168;
      }
      i = 0;
      label87:
      localViewGroup.setVisibility(i);
      localViewGroup = this.z;
      if (paramInt != f.state_rotate) {
        break label174;
      }
    }
    label156:
    label162:
    label168:
    label174:
    for (int i = 0;; i = 8)
    {
      localViewGroup.setVisibility(i);
      localViewGroup = this.A;
      i = j;
      if (paramInt == f.state_scale) {
        i = 0;
      }
      localViewGroup.setVisibility(i);
      if (paramInt != f.state_scale) {
        break label180;
      }
      d(0);
      return;
      bool = false;
      break;
      bool = false;
      break label42;
      bool = false;
      break label65;
      i = 8;
      break label87;
    }
    label180:
    if (paramInt == f.state_rotate)
    {
      d(1);
      return;
    }
    d(2);
  }
  
  private void c(Intent paramIntent)
  {
    Uri localUri = (Uri)paramIntent.getParcelableExtra("com.yalantis.ucrop.InputUri");
    this.E = ((Uri)paramIntent.getParcelableExtra("com.yalantis.ucrop.OutputUri"));
    d(paramIntent);
    if ((localUri != null) && (this.E != null)) {}
    for (;;)
    {
      try
      {
        this.t.setImageUri(localUri);
        if (paramIntent.getBooleanExtra("com.yalantis.ucrop.AspectRatioSet", false))
        {
          this.v.setVisibility(8);
          float f1 = paramIntent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0F);
          float f2 = paramIntent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0F);
          if ((f1 <= 0.0F) || (f2 <= 0.0F)) {
            break label207;
          }
          this.t.setTargetAspectRatio(f1 / f2);
        }
        if (paramIntent.getBooleanExtra("com.yalantis.ucrop.MaxSizeSet", false))
        {
          int i = paramIntent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
          int j = paramIntent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
          if ((i <= 0) || (j <= 0)) {
            break;
          }
          this.t.setMaxResultImageSizeX(i);
          this.t.setMaxResultImageSizeY(j);
        }
        return;
      }
      catch (Exception localException)
      {
        a(localException);
        finish();
        continue;
      }
      a(new NullPointerException(getString(i.ucrop_error_input_data_is_absent)));
      finish();
      continue;
      label207:
      this.t.setTargetAspectRatio(0.0F);
    }
    Log.w("UCropActivity", "EXTRA_MAX_SIZE_X and EXTRA_MAX_SIZE_Y must be greater than 0");
  }
  
  private void d(int paramInt)
  {
    boolean bool2 = false;
    GestureCropImageView localGestureCropImageView = this.t;
    if ((this.H[paramInt] == 3) || (this.H[paramInt] == 1)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      localGestureCropImageView.setScaleEnabled(bool1);
      localGestureCropImageView = this.t;
      if (this.H[paramInt] != 3)
      {
        bool1 = bool2;
        if (this.H[paramInt] != 2) {}
      }
      else
      {
        bool1 = true;
      }
      localGestureCropImageView.setRotateEnabled(bool1);
      return;
    }
  }
  
  private void d(Intent paramIntent)
  {
    Object localObject2 = paramIntent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
    Object localObject1 = null;
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = Bitmap.CompressFormat.valueOf((String)localObject2);
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = l;
    }
    this.F = ((Bitmap.CompressFormat)localObject2);
    this.G = paramIntent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
    localObject1 = paramIntent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
    if ((localObject1 != null) && (localObject1.length == 3)) {
      this.H = ((int[])localObject1);
    }
    this.t.setMaxBitmapSize(paramIntent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
    this.t.setMaxScaleMultiplier(paramIntent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0F));
    this.t.setImageToWrapCropBoundsAnimDuration(paramIntent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
    this.u.setDimmedColor(paramIntent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(c.ucrop_color_default_dimmed)));
    this.u.setOvalDimmedLayer(paramIntent.getBooleanExtra("com.yalantis.ucrop.OvalDimmedLayer", false));
    this.u.setShowCropFrame(paramIntent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
    this.u.setCropFrameColor(paramIntent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(c.ucrop_color_default_crop_frame)));
    this.u.setCropFrameStrokeWidth(paramIntent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(d.ucrop_default_crop_frame_stoke_width)));
    this.u.setShowCropGrid(paramIntent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
    this.u.setCropGridRowCount(paramIntent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
    this.u.setCropGridColumnCount(paramIntent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
    this.u.setCropGridColor(paramIntent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(c.ucrop_color_default_crop_grid)));
    this.u.setCropGridStrokeWidth(paramIntent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(d.ucrop_default_crop_grid_stoke_width)));
  }
  
  private void e(Intent paramIntent)
  {
    this.o = paramIntent.getIntExtra("com.yalantis.ucrop.StatusBarColor", android.support.v4.c.a.b(this, c.ucrop_color_statusbar));
    this.n = paramIntent.getIntExtra("com.yalantis.ucrop.ToolbarColor", android.support.v4.c.a.b(this, c.ucrop_color_toolbar));
    this.p = paramIntent.getIntExtra("com.yalantis.ucrop.UcropColorWidgetActive", android.support.v4.c.a.b(this, c.ucrop_color_widget_active));
    this.q = paramIntent.getIntExtra("com.yalantis.ucrop.UcropToolbarTitleColor", android.support.v4.c.a.b(this, c.ucrop_color_title));
    this.m = paramIntent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
    if (!TextUtils.isEmpty(this.m)) {}
    for (String str = this.m;; str = getResources().getString(i.ucrop_label_edit_photo))
    {
      this.m = str;
      this.r = paramIntent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", android.support.v4.c.a.b(this, c.ucrop_color_default_logo));
      j();
      k();
      m();
      n();
      o();
      l();
      return;
    }
  }
  
  private void j()
  {
    a(this.o);
    Object localObject1 = (Toolbar)findViewById(f.toolbar);
    ((Toolbar)localObject1).setBackgroundColor(this.n);
    ((Toolbar)localObject1).setTitleTextColor(this.q);
    Object localObject2 = (TextView)((Toolbar)localObject1).findViewById(f.toolbar_title);
    ((TextView)localObject2).setTextColor(this.q);
    ((TextView)localObject2).setText(this.m);
    localObject2 = android.support.v4.c.a.a(this, e.ucrop_ic_cross).mutate();
    ((Drawable)localObject2).setColorFilter(this.q, PorterDuff.Mode.SRC_ATOP);
    ((Toolbar)localObject1).setNavigationIcon((Drawable)localObject2);
    a((Toolbar)localObject1);
    localObject1 = f();
    if (localObject1 != null) {
      ((android.support.v7.a.a)localObject1).a(false);
    }
  }
  
  private void k()
  {
    this.s = ((UCropView)findViewById(f.ucrop));
    this.t = this.s.getCropImageView();
    this.u = this.s.getOverlayView();
    this.t.setTransformImageListener(this.I);
    this.v = ((ViewGroup)findViewById(f.state_aspect_ratio));
    this.v.setOnClickListener(this.J);
    this.w = ((ViewGroup)findViewById(f.state_rotate));
    this.w.setOnClickListener(this.J);
    this.x = ((ViewGroup)findViewById(f.state_scale));
    this.x.setOnClickListener(this.J);
    this.y = ((ViewGroup)findViewById(f.layout_aspect_ratio));
    this.z = ((ViewGroup)findViewById(f.layout_rotate_wheel));
    this.A = ((ViewGroup)findViewById(f.layout_scale_wheel));
    ((ImageView)findViewById(f.image_view_logo)).setColorFilter(this.r, PorterDuff.Mode.SRC_ATOP);
  }
  
  private void l()
  {
    ImageView localImageView1 = (ImageView)findViewById(f.image_view_state_scale);
    ImageView localImageView2 = (ImageView)findViewById(f.image_view_state_rotate);
    ImageView localImageView3 = (ImageView)findViewById(f.image_view_state_aspect_ratio);
    localImageView1.setImageDrawable(new com.yalantis.ucrop.a.o(localImageView1.getDrawable(), this.p));
    localImageView2.setImageDrawable(new com.yalantis.ucrop.a.o(localImageView2.getDrawable(), this.p));
    localImageView3.setImageDrawable(new com.yalantis.ucrop.a.o(localImageView3.getDrawable(), this.p));
  }
  
  private void m()
  {
    ((AspectRatioTextView)((ViewGroup)findViewById(f.crop_aspect_ratio_1_1)).getChildAt(0)).setActiveColor(this.p);
    ((AspectRatioTextView)((ViewGroup)findViewById(f.crop_aspect_ratio_3_4)).getChildAt(0)).setActiveColor(this.p);
    ((AspectRatioTextView)((ViewGroup)findViewById(f.crop_aspect_ratio_original)).getChildAt(0)).setActiveColor(this.p);
    ((AspectRatioTextView)((ViewGroup)findViewById(f.crop_aspect_ratio_3_2)).getChildAt(0)).setActiveColor(this.p);
    ((AspectRatioTextView)((ViewGroup)findViewById(f.crop_aspect_ratio_16_9)).getChildAt(0)).setActiveColor(this.p);
    this.B.add((ViewGroup)findViewById(f.crop_aspect_ratio_1_1));
    this.B.add((ViewGroup)findViewById(f.crop_aspect_ratio_3_4));
    this.B.add((ViewGroup)findViewById(f.crop_aspect_ratio_original));
    this.B.add((ViewGroup)findViewById(f.crop_aspect_ratio_3_2));
    this.B.add((ViewGroup)findViewById(f.crop_aspect_ratio_16_9));
    ((ViewGroup)this.B.get(2)).setSelected(true);
    Iterator localIterator = this.B.iterator();
    while (localIterator.hasNext()) {
      ((ViewGroup)localIterator.next()).setOnClickListener(new o(this));
    }
  }
  
  private void n()
  {
    this.C = ((TextView)findViewById(f.text_view_rotate));
    ((HorizontalProgressWheelView)findViewById(f.rotate_scroll_wheel)).setScrollingListener(new p(this));
    ((HorizontalProgressWheelView)findViewById(f.rotate_scroll_wheel)).setMiddleLineColor(this.p);
    findViewById(f.wrapper_reset_rotate).setOnClickListener(new q(this));
    findViewById(f.wrapper_rotate_by_angle).setOnClickListener(new r(this));
  }
  
  private void o()
  {
    this.D = ((TextView)findViewById(f.text_view_scale));
    ((HorizontalProgressWheelView)findViewById(f.scale_scroll_wheel)).setScrollingListener(new s(this));
    ((HorizontalProgressWheelView)findViewById(f.scale_scroll_wheel)).setMiddleLineColor(this.p);
  }
  
  private void p()
  {
    this.t.c(-this.t.getCurrentAngle());
    this.t.c();
  }
  
  private void q()
  {
    if (this.v.getVisibility() == 0)
    {
      c(f.state_aspect_ratio);
      return;
    }
    c(f.state_scale);
  }
  
  /* Error */
  private void r()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 163	com/yalantis/ucrop/UCropActivity:t	Lcom/yalantis/ucrop/view/GestureCropImageView;
    //   6: invokevirtual 717	com/yalantis/ucrop/view/GestureCropImageView:a	()Landroid/graphics/Bitmap;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +57 -> 68
    //   14: aload_0
    //   15: invokevirtual 721	com/yalantis/ucrop/UCropActivity:getContentResolver	()Landroid/content/ContentResolver;
    //   18: aload_0
    //   19: getfield 233	com/yalantis/ucrop/UCropActivity:E	Landroid/net/Uri;
    //   22: invokevirtual 727	android/content/ContentResolver:openOutputStream	(Landroid/net/Uri;)Ljava/io/OutputStream;
    //   25: astore_1
    //   26: aload_2
    //   27: aload_0
    //   28: getfield 61	com/yalantis/ucrop/UCropActivity:F	Landroid/graphics/Bitmap$CompressFormat;
    //   31: aload_0
    //   32: getfield 63	com/yalantis/ucrop/UCropActivity:G	I
    //   35: aload_1
    //   36: invokevirtual 733	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   39: pop
    //   40: aload_2
    //   41: invokevirtual 736	android/graphics/Bitmap:recycle	()V
    //   44: aload_0
    //   45: aload_0
    //   46: getfield 233	com/yalantis/ucrop/UCropActivity:E	Landroid/net/Uri;
    //   49: aload_0
    //   50: getfield 163	com/yalantis/ucrop/UCropActivity:t	Lcom/yalantis/ucrop/view/GestureCropImageView;
    //   53: invokevirtual 739	com/yalantis/ucrop/view/GestureCropImageView:getTargetAspectRatio	()F
    //   56: invokespecial 741	com/yalantis/ucrop/UCropActivity:a	(Landroid/net/Uri;F)V
    //   59: aload_0
    //   60: invokevirtual 275	com/yalantis/ucrop/UCropActivity:finish	()V
    //   63: aload_1
    //   64: invokestatic 746	com/yalantis/ucrop/a/a:a	(Ljava/io/Closeable;)V
    //   67: return
    //   68: aload_0
    //   69: new 277	java/lang/NullPointerException
    //   72: dup
    //   73: ldc_w 748
    //   76: invokespecial 289	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   79: invokespecial 155	com/yalantis/ucrop/UCropActivity:a	(Ljava/lang/Throwable;)V
    //   82: goto -19 -> 63
    //   85: astore_2
    //   86: aconst_null
    //   87: astore_1
    //   88: aload_0
    //   89: aload_2
    //   90: invokespecial 155	com/yalantis/ucrop/UCropActivity:a	(Ljava/lang/Throwable;)V
    //   93: aload_0
    //   94: invokevirtual 275	com/yalantis/ucrop/UCropActivity:finish	()V
    //   97: aload_1
    //   98: invokestatic 746	com/yalantis/ucrop/a/a:a	(Ljava/io/Closeable;)V
    //   101: return
    //   102: astore_2
    //   103: aconst_null
    //   104: astore_1
    //   105: aload_1
    //   106: invokestatic 746	com/yalantis/ucrop/a/a:a	(Ljava/io/Closeable;)V
    //   109: aload_2
    //   110: athrow
    //   111: astore_2
    //   112: goto -7 -> 105
    //   115: astore_2
    //   116: goto -11 -> 105
    //   119: astore_2
    //   120: goto -32 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	UCropActivity
    //   1	105	1	localOutputStream	java.io.OutputStream
    //   9	32	2	localBitmap	android.graphics.Bitmap
    //   85	5	2	localException1	Exception
    //   102	8	2	localObject1	Object
    //   111	1	2	localObject2	Object
    //   115	1	2	localObject3	Object
    //   119	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	10	85	java/lang/Exception
    //   14	26	85	java/lang/Exception
    //   68	82	85	java/lang/Exception
    //   2	10	102	finally
    //   14	26	102	finally
    //   68	82	102	finally
    //   26	63	111	finally
    //   88	97	115	finally
    //   26	63	119	java/lang/Exception
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(g.ucrop_activity_photobox);
    paramBundle = getIntent();
    e(paramBundle);
    c(paramBundle);
    q();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(h.ucrop_menu_activity, paramMenu);
    paramMenu = paramMenu.findItem(f.menu_crop);
    Drawable localDrawable = paramMenu.getIcon();
    if (localDrawable != null)
    {
      localDrawable.mutate();
      localDrawable.setColorFilter(this.q, PorterDuff.Mode.SRC_ATOP);
      paramMenu.setIcon(localDrawable);
    }
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == f.menu_crop) {
      r();
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 16908332) {
        onBackPressed();
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    if (this.t != null) {
      this.t.b();
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/yalantis/ucrop/UCropActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */