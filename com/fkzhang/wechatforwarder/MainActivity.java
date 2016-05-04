package com.fkzhang.wechatforwarder;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.a.s;
import android.support.v7.a.t;
import android.support.v7.a.u;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import com.fkzhang.wechatforwarder.e.a;
import com.fkzhang.wechatforwarder.e.d;
import com.rarepebble.colorpicker.ColorPickerView;
import com.yalantis.ucrop.k;
import com.yalantis.ucrop.l;
import java.io.File;
import java.io.InputStream;

public class MainActivity
  extends u
  implements CompoundButton.OnCheckedChangeListener
{
  private Bitmap A;
  private Switch B;
  private MenuItem l;
  private d m;
  private TextView n;
  private EditText o;
  private Switch p;
  private Uri q;
  private ImageView r;
  private File s;
  private View t;
  private TextView u;
  private EditText v;
  private TextView w;
  private EditText x;
  private ImageView y;
  private Bitmap z;
  
  private Bitmap a(Uri paramUri)
  {
    try
    {
      paramUri = getContentResolver().openInputStream(paramUri);
      if (paramUri != null)
      {
        Bitmap localBitmap = BitmapFactory.decodeStream(paramUri, null, null);
        paramUri.close();
        return localBitmap;
      }
    }
    catch (Throwable paramUri)
    {
      paramUri.printStackTrace();
    }
    return null;
  }
  
  private void a(int paramInt)
  {
    try
    {
      Intent localIntent = new Intent();
      localIntent.setType("image/*");
      localIntent.setAction("android.intent.action.GET_CONTENT");
      localIntent.addCategory("android.intent.category.OPENABLE");
      startActivityForResult(Intent.createChooser(localIntent, getString(2131099743)), paramInt);
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
  
  private void a(Class paramClass)
  {
    startActivity(new Intent(this, paramClass));
  }
  
  private void b(boolean paramBoolean)
  {
    PackageManager localPackageManager = getPackageManager();
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localPackageManager.setComponentEnabledSetting(l(), i, 1);
      return;
    }
  }
  
  private void k()
  {
    if (m())
    {
      this.l.setTitle(2131099720);
      return;
    }
    this.l.setTitle(2131099753);
  }
  
  private ComponentName l()
  {
    return new ComponentName(this, "com.fkzhang.wechatforwarder.MainActivity-Alias");
  }
  
  private boolean m()
  {
    return getPackageManager().getComponentEnabledSetting(l()) == 1;
  }
  
  private void n()
  {
    if (this.q == null)
    {
      this.s = new File(getCacheDir(), "watermark_img.png");
      this.q = Uri.fromFile(this.s);
    }
    t localt = new t(this);
    View localView = getLayoutInflater().inflate(2130968627, null);
    Object localObject1 = (EditText)localView.findViewById(2131493071);
    Button localButton = (Button)localView.findViewById(2131493060);
    this.r = ((ImageView)localView.findViewById(2131493061));
    this.r.setOnLongClickListener(new bg(this));
    this.y = ((ImageView)localView.findViewById(2131493083));
    if ((this.s != null) && (this.s.exists()))
    {
      this.A = a(this.q);
      this.r.setImageURI(this.q);
    }
    ((EditText)localObject1).setText(this.m.a("img_watermark_text", ""));
    ((EditText)localObject1).addTextChangedListener(new bh(this));
    localButton.setOnClickListener(new ao(this));
    localView.findViewById(2131493081).setOnClickListener(new ap(this));
    localView.findViewById(2131493082).setOnClickListener(new aq(this));
    localObject1 = (EditText)localView.findViewById(2131493072);
    ((EditText)localObject1).setText(String.valueOf(this.m.a("watermark_text_size", 50)));
    ((EditText)localObject1).addTextChangedListener(new ar(this));
    localObject1 = (RadioGroup)localView.findViewById(2131493065);
    Object localObject2 = (RadioButton)localView.findViewById(2131493066);
    RadioButton localRadioButton1 = (RadioButton)localView.findViewById(2131493067);
    RadioButton localRadioButton2 = (RadioButton)localView.findViewById(2131493068);
    RadioButton localRadioButton3 = (RadioButton)localView.findViewById(2131493069);
    RadioButton localRadioButton4;
    switch (this.m.a("watermark_img_place", 4))
    {
    default: 
      ((RadioGroup)localObject1).setOnCheckedChangeListener(new as(this));
      localObject2 = (RadioGroup)localView.findViewById(2131493076);
      localRadioButton1 = (RadioButton)localView.findViewById(2131493077);
      localRadioButton2 = (RadioButton)localView.findViewById(2131493078);
      localRadioButton3 = (RadioButton)localView.findViewById(2131493079);
      localRadioButton4 = (RadioButton)localView.findViewById(2131493080);
      switch (this.m.a("watermark_text_place", 1))
      {
      }
      break;
    }
    for (;;)
    {
      ((RadioGroup)localObject2).setOnCheckedChangeListener(new at(this));
      localView.findViewById(2131493074).setOnClickListener(new au(this));
      localObject2 = (SeekBar)localView.findViewById(2131493063);
      ((SeekBar)localObject2).setProgress((int)(this.m.a("watermark_img_alpha", 100) / 254.0D * 100.0D));
      ((SeekBar)localObject2).setOnSeekBarChangeListener(new av(this));
      if (this.m.a("disable_contentprovider", false))
      {
        localButton.setVisibility(8);
        this.r.setVisibility(8);
        ((SeekBar)localObject2).setVisibility(8);
        ((RadioGroup)localObject1).setVisibility(8);
        localView.findViewById(2131493059).setVisibility(8);
        localView.findViewById(2131493062).setVisibility(8);
        localView.findViewById(2131493064).setVisibility(8);
      }
      localt.b(localView).a(2131099751).a(17039370, new aw(this)).b().show();
      return;
      ((RadioButton)localObject2).setChecked(true);
      break;
      localRadioButton1.setChecked(true);
      break;
      localRadioButton2.setChecked(true);
      break;
      localRadioButton3.setChecked(true);
      break;
      localRadioButton1.setChecked(true);
      continue;
      localRadioButton2.setChecked(true);
      continue;
      localRadioButton3.setChecked(true);
      continue;
      localRadioButton4.setChecked(true);
    }
  }
  
  private void o()
  {
    new Handler().post(new ba(this));
  }
  
  protected void j()
  {
    t localt = new t(this);
    View localView = getLayoutInflater().inflate(2130968625, null);
    ColorPickerView localColorPickerView = (ColorPickerView)localView.findViewById(2131493051);
    localColorPickerView.setColor(this.m.a("watermark_text_color", -65436));
    localt.b(localView).a(2131099750).a(17039370, new az(this, localColorPickerView)).b(17039360, new ax(this)).b().show();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    do
    {
      do
      {
        do
        {
          return;
        } while (paramIntent.getData() == null);
        paramIntent = k.a(paramIntent.getData(), this.q);
        l locall = new l();
        locall.a(Bitmap.CompressFormat.PNG);
        locall.a(100);
        paramIntent.a(locall).a(this);
        return;
      } while (k.a(paramIntent) == null);
      this.A = a(this.q);
      this.r.setImageBitmap(this.A);
      o();
      return;
      this.z = a(paramIntent.getData());
    } while (this.z == null);
    this.y.setImageBitmap(this.z);
    o();
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    switch (paramCompoundButton.getId())
    {
    case 2131493007: 
    case 2131493008: 
    case 2131493015: 
    case 2131493017: 
    case 2131493020: 
    case 2131493022: 
    case 2131493023: 
    case 2131493025: 
    case 2131493026: 
    default: 
      return;
    case 2131493021: 
      this.m.b("sight_duration_change_enable", paramBoolean);
      if (paramBoolean)
      {
        this.n.setVisibility(0);
        this.o.setVisibility(0);
        return;
      }
      this.n.setVisibility(8);
      this.o.setVisibility(8);
      return;
    case 2131493000: 
      this.m.b("chat_forward_enable", paramBoolean);
      return;
    case 2131493002: 
      this.m.b("multi_image_forward_enable", paramBoolean);
      return;
    case 2131493010: 
      this.m.b("multi_voice_forward_enable", paramBoolean);
      return;
    case 2131493001: 
      this.m.b("sns_forward_enable", paramBoolean);
      return;
    case 2131493009: 
      this.m.b("voice_forward_enable", paramBoolean);
      return;
    case 2131493016: 
      this.m.b("favorite_forward_enable", paramBoolean);
      return;
    case 2131493003: 
      this.m.b("record_forward_enable", paramBoolean);
      return;
    case 2131493011: 
      this.m.b("friendcard_forward_enable", paramBoolean);
      return;
    case 2131493004: 
      this.m.b("img_autodownload_enable", paramBoolean);
      if (paramBoolean)
      {
        this.p.setVisibility(0);
        return;
      }
      this.p.setVisibility(8);
      return;
    case 2131493005: 
      this.m.b("show_img_progress", paramBoolean);
      return;
    case 2131493012: 
      this.m.b("img_to_friend_forward_enable", paramBoolean);
      return;
    case 2131493006: 
      this.m.b("add_img_watermark", paramBoolean);
      if (paramBoolean)
      {
        this.t.setVisibility(0);
        return;
      }
      this.t.setVisibility(8);
      return;
    case 2131493013: 
      this.m.b("broadcast_forward_enable", paramBoolean);
      return;
    case 2131493014: 
      this.m.b("multi_broadcast_forward_enable", paramBoolean);
      return;
    case 2131493024: 
      this.m.b("voice_duration_change_enable", paramBoolean);
      if (paramBoolean)
      {
        this.u.setVisibility(0);
        this.v.setVisibility(0);
        return;
      }
      this.u.setVisibility(8);
      this.v.setVisibility(8);
      return;
    case 2131493027: 
      this.m.b("voice_wrong_length_enable", paramBoolean);
      if (paramBoolean)
      {
        this.w.setVisibility(0);
        this.x.setVisibility(0);
        return;
      }
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      return;
    case 2131493018: 
      this.m.b("disable_contentprovider", paramBoolean);
      a.a(this, getString(2131099737));
      return;
    }
    this.m.b("selective_copy_enable", paramBoolean);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968603);
    a((Toolbar)findViewById(2131492969));
    this.m = new d(this, "com.fkzhang.wechatforwarder");
    paramBundle = (Switch)findViewById(2131493021);
    paramBundle.setChecked(this.m.a("sight_duration_change_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    this.n = ((TextView)findViewById(2131493023));
    this.o = ((EditText)findViewById(2131493022));
    double d = this.m.a("sight_duration", 6500) / 1000.0D;
    this.o.setText(String.valueOf(d));
    this.o.addTextChangedListener(new an(this));
    if (!this.m.a("sight_duration_change_enable", false))
    {
      this.n.setVisibility(8);
      this.o.setVisibility(8);
    }
    paramBundle = (Switch)findViewById(2131493024);
    paramBundle.setChecked(this.m.a("voice_duration_change_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    this.u = ((TextView)findViewById(2131493026));
    this.v = ((EditText)findViewById(2131493025));
    d = this.m.a("voice_duration", 60000) / 1000.0D;
    this.v.setText(String.valueOf(d));
    this.v.addTextChangedListener(new ay(this));
    if (!this.m.a("voice_duration_change_enable", false))
    {
      this.u.setVisibility(8);
      this.v.setVisibility(8);
    }
    paramBundle = (Switch)findViewById(2131493027);
    paramBundle.setChecked(this.m.a("voice_wrong_length_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    this.w = ((TextView)findViewById(2131493029));
    this.x = ((EditText)findViewById(2131493028));
    int i = this.m.a("voice_length", 1000) / 1000;
    this.x.setText(String.valueOf(i));
    this.x.addTextChangedListener(new bb(this));
    if (!this.m.a("voice_wrong_length_enable", false))
    {
      this.x.setVisibility(8);
      this.w.setVisibility(8);
    }
    paramBundle = (Switch)findViewById(2131493000);
    paramBundle.setChecked(this.m.a("chat_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493002);
    paramBundle.setChecked(this.m.a("multi_image_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493010);
    paramBundle.setChecked(this.m.a("multi_voice_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493001);
    paramBundle.setChecked(this.m.a("sns_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493009);
    paramBundle.setChecked(this.m.a("voice_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493016);
    paramBundle.setChecked(this.m.a("favorite_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493003);
    paramBundle.setChecked(this.m.a("record_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493011);
    paramBundle.setChecked(this.m.a("friendcard_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493004);
    paramBundle.setChecked(this.m.a("img_autodownload_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493012);
    paramBundle.setChecked(this.m.a("img_to_friend_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    this.B = ((Switch)findViewById(2131493006));
    this.B.setChecked(this.m.a("add_img_watermark", false));
    this.B.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493013);
    paramBundle.setChecked(this.m.a("broadcast_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493014);
    paramBundle.setChecked(this.m.a("multi_broadcast_forward_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493018);
    paramBundle.setChecked(this.m.a("disable_contentprovider", false));
    paramBundle.setOnCheckedChangeListener(this);
    paramBundle = (Switch)findViewById(2131493019);
    paramBundle.setChecked(this.m.a("selective_copy_enable", false));
    paramBundle.setOnCheckedChangeListener(this);
    this.p = ((Switch)findViewById(2131493005));
    this.p.setChecked(this.m.a("show_img_progress", true));
    this.p.setOnCheckedChangeListener(this);
    if (this.m.a("img_autodownload_enable", false))
    {
      this.p.setVisibility(0);
      this.t = findViewById(2131493007);
      if (!this.m.a("add_img_watermark", false)) {
        break label1406;
      }
      this.t.setVisibility(0);
    }
    for (;;)
    {
      this.t.setOnClickListener(new bc(this));
      a.a(this, this.m.a("disable_xposed_check", false));
      paramBundle = (TextView)findViewById(2131492996);
      paramBundle.setOnLongClickListener(new bd(this, paramBundle));
      findViewById(2131492998).setOnClickListener(new be(this));
      findViewById(2131492994).setVisibility(8);
      findViewById(2131492994).setOnClickListener(new bf(this));
      this.m.b("forward_chat_to_sns", getString(2131099710));
      this.m.b("forward", getString(2131099709));
      this.m.b("share", getString(2131099752));
      this.m.b("forward_images_to_sns", getString(2131099711));
      this.m.b("forward_voices_to_friend", getString(2131099716));
      this.m.b("sns_forward_not_supported", getString(2131099756));
      this.m.b("sns_share_not_supported", getString(2131099757));
      this.m.b("voice_forward_success", getString(2131099781));
      this.m.b("loading_img", getString(2131099729));
      this.m.b("loading_video", getString(2131099730));
      this.m.b("img_null", getString(2131099722));
      this.m.b("forward_img_to_friends", getString(2131099712));
      this.m.b("video_too_large", getString(2131099778));
      this.m.b("mass_send", getString(2131099731));
      this.m.b("voice_time_left", getString(2131099783));
      this.m.b("selective_copy", getString(2131099748));
      return;
      this.p.setVisibility(8);
      break;
      label1406:
      this.t.setVisibility(8);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131558400, paramMenu);
    this.l = paramMenu.findItem(2131493133);
    k();
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    if (!m()) {}
    for (boolean bool = true;; bool = false)
    {
      b(bool);
      k();
      break;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */