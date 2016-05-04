package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.support.v4.f.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class z
  extends DataSetObservable
{
  private static final String a = z.class.getSimpleName();
  private static final Object b = new Object();
  private static final Map c = new HashMap();
  private final Object d;
  private final List e;
  private final List f;
  private final Context g;
  private final String h;
  private Intent i;
  private ac j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private ae p;
  
  private boolean a(ad paramad)
  {
    boolean bool = this.f.add(paramad);
    if (bool)
    {
      this.n = true;
      i();
      d();
      f();
      notifyChanged();
    }
    return bool;
  }
  
  private void d()
  {
    if (!this.m) {
      throw new IllegalStateException("No preceding call to #readHistoricalData");
    }
    if (!this.n) {}
    do
    {
      return;
      this.n = false;
    } while (TextUtils.isEmpty(this.h));
    a.a(new af(this, null), new Object[] { new ArrayList(this.f), this.h });
  }
  
  private void e()
  {
    boolean bool1 = g();
    boolean bool2 = h();
    i();
    if ((bool1 | bool2))
    {
      f();
      notifyChanged();
    }
  }
  
  private boolean f()
  {
    if ((this.j != null) && (this.i != null) && (!this.e.isEmpty()) && (!this.f.isEmpty()))
    {
      this.j.a(this.i, this.e, Collections.unmodifiableList(this.f));
      return true;
    }
    return false;
  }
  
  private boolean g()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.o)
    {
      bool1 = bool2;
      if (this.i != null)
      {
        this.o = false;
        this.e.clear();
        List localList = this.g.getPackageManager().queryIntentActivities(this.i, 0);
        int i2 = localList.size();
        int i1 = 0;
        while (i1 < i2)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i1);
          this.e.add(new ab(this, localResolveInfo));
          i1 += 1;
        }
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private boolean h()
  {
    if ((this.l) && (this.n) && (!TextUtils.isEmpty(this.h)))
    {
      this.l = false;
      this.m = true;
      j();
      return true;
    }
    return false;
  }
  
  private void i()
  {
    int i2 = this.f.size() - this.k;
    if (i2 <= 0) {}
    for (;;)
    {
      return;
      this.n = true;
      int i1 = 0;
      while (i1 < i2)
      {
        ad localad = (ad)this.f.remove(0);
        i1 += 1;
      }
    }
  }
  
  /* Error */
  private void j()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	android/support/v7/widget/z:g	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 83	android/support/v7/widget/z:h	Ljava/lang/String;
    //   8: invokevirtual 187	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 193	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: ldc -61
    //   20: invokeinterface 201 3 0
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: iconst_1
    //   29: if_icmpeq +18 -> 47
    //   32: iload_1
    //   33: iconst_2
    //   34: if_icmpeq +13 -> 47
    //   37: aload_3
    //   38: invokeinterface 204 1 0
    //   43: istore_1
    //   44: goto -17 -> 27
    //   47: ldc -50
    //   49: aload_3
    //   50: invokeinterface 209 1 0
    //   55: invokevirtual 214	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifne +53 -> 111
    //   61: new 181	org/xmlpull/v1/XmlPullParserException
    //   64: dup
    //   65: ldc -40
    //   67: invokespecial 217	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_3
    //   72: getstatic 40	android/support/v7/widget/z:a	Ljava/lang/String;
    //   75: new 219	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   82: ldc -34
    //   84: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_0
    //   88: getfield 83	android/support/v7/widget/z:h	Ljava/lang/String;
    //   91: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 229	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: aload_3
    //   98: invokestatic 234	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   101: pop
    //   102: aload_2
    //   103: ifnull +7 -> 110
    //   106: aload_2
    //   107: invokevirtual 239	java/io/FileInputStream:close	()V
    //   110: return
    //   111: aload_0
    //   112: getfield 59	android/support/v7/widget/z:f	Ljava/util/List;
    //   115: astore 4
    //   117: aload 4
    //   119: invokeinterface 141 1 0
    //   124: aload_3
    //   125: invokeinterface 204 1 0
    //   130: istore_1
    //   131: iload_1
    //   132: iconst_1
    //   133: if_icmpne +14 -> 147
    //   136: aload_2
    //   137: ifnull -27 -> 110
    //   140: aload_2
    //   141: invokevirtual 239	java/io/FileInputStream:close	()V
    //   144: return
    //   145: astore_2
    //   146: return
    //   147: iload_1
    //   148: iconst_3
    //   149: if_icmpeq -25 -> 124
    //   152: iload_1
    //   153: iconst_4
    //   154: if_icmpeq -30 -> 124
    //   157: ldc -15
    //   159: aload_3
    //   160: invokeinterface 209 1 0
    //   165: invokevirtual 214	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifne +55 -> 223
    //   171: new 181	org/xmlpull/v1/XmlPullParserException
    //   174: dup
    //   175: ldc -13
    //   177: invokespecial 217	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   180: athrow
    //   181: astore_3
    //   182: getstatic 40	android/support/v7/widget/z:a	Ljava/lang/String;
    //   185: new 219	java/lang/StringBuilder
    //   188: dup
    //   189: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   192: ldc -34
    //   194: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload_0
    //   198: getfield 83	android/support/v7/widget/z:h	Ljava/lang/String;
    //   201: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 229	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: aload_3
    //   208: invokestatic 234	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: aload_2
    //   213: ifnull -103 -> 110
    //   216: aload_2
    //   217: invokevirtual 239	java/io/FileInputStream:close	()V
    //   220: return
    //   221: astore_2
    //   222: return
    //   223: aload 4
    //   225: new 177	android/support/v7/widget/ad
    //   228: dup
    //   229: aload_3
    //   230: aconst_null
    //   231: ldc -11
    //   233: invokeinterface 249 3 0
    //   238: aload_3
    //   239: aconst_null
    //   240: ldc -5
    //   242: invokeinterface 249 3 0
    //   247: invokestatic 257	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   250: aload_3
    //   251: aconst_null
    //   252: ldc_w 259
    //   255: invokeinterface 249 3 0
    //   260: invokestatic 265	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   263: invokespecial 268	android/support/v7/widget/ad:<init>	(Ljava/lang/String;JF)V
    //   266: invokeinterface 65 2 0
    //   271: pop
    //   272: goto -148 -> 124
    //   275: astore_3
    //   276: aload_2
    //   277: ifnull +7 -> 284
    //   280: aload_2
    //   281: invokevirtual 239	java/io/FileInputStream:close	()V
    //   284: aload_3
    //   285: athrow
    //   286: astore_2
    //   287: return
    //   288: astore_2
    //   289: goto -5 -> 284
    //   292: astore_2
    //   293: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	294	0	this	z
    //   26	129	1	i1	int
    //   11	130	2	localFileInputStream	java.io.FileInputStream
    //   145	72	2	localIOException1	java.io.IOException
    //   221	60	2	localIOException2	java.io.IOException
    //   286	1	2	localIOException3	java.io.IOException
    //   288	1	2	localIOException4	java.io.IOException
    //   292	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   15	35	3	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   71	89	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   181	70	3	localIOException5	java.io.IOException
    //   275	10	3	localObject	Object
    //   115	109	4	localList	List
    // Exception table:
    //   from	to	target	type
    //   12	25	71	org/xmlpull/v1/XmlPullParserException
    //   37	44	71	org/xmlpull/v1/XmlPullParserException
    //   47	71	71	org/xmlpull/v1/XmlPullParserException
    //   111	124	71	org/xmlpull/v1/XmlPullParserException
    //   124	131	71	org/xmlpull/v1/XmlPullParserException
    //   157	181	71	org/xmlpull/v1/XmlPullParserException
    //   223	272	71	org/xmlpull/v1/XmlPullParserException
    //   140	144	145	java/io/IOException
    //   12	25	181	java/io/IOException
    //   37	44	181	java/io/IOException
    //   47	71	181	java/io/IOException
    //   111	124	181	java/io/IOException
    //   124	131	181	java/io/IOException
    //   157	181	181	java/io/IOException
    //   223	272	181	java/io/IOException
    //   216	220	221	java/io/IOException
    //   12	25	275	finally
    //   37	44	275	finally
    //   47	71	275	finally
    //   72	102	275	finally
    //   111	124	275	finally
    //   124	131	275	finally
    //   157	181	275	finally
    //   182	212	275	finally
    //   223	272	275	finally
    //   106	110	286	java/io/IOException
    //   280	284	288	java/io/IOException
    //   0	12	292	java/io/FileNotFoundException
  }
  
  public int a()
  {
    synchronized (this.d)
    {
      e();
      int i1 = this.e.size();
      return i1;
    }
  }
  
  public int a(ResolveInfo paramResolveInfo)
  {
    for (;;)
    {
      int i1;
      synchronized (this.d)
      {
        e();
        List localList = this.e;
        int i2 = localList.size();
        i1 = 0;
        if (i1 < i2)
        {
          if (((ab)localList.get(i1)).a == paramResolveInfo) {
            return i1;
          }
        }
        else {
          return -1;
        }
      }
      i1 += 1;
    }
  }
  
  public ResolveInfo a(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      ResolveInfo localResolveInfo = ((ab)this.e.get(paramInt)).a;
      return localResolveInfo;
    }
  }
  
  public Intent b(int paramInt)
  {
    synchronized (this.d)
    {
      if (this.i == null) {
        return null;
      }
      e();
      Object localObject2 = (ab)this.e.get(paramInt);
      localObject2 = new ComponentName(((ab)localObject2).a.activityInfo.packageName, ((ab)localObject2).a.activityInfo.name);
      Intent localIntent1 = new Intent(this.i);
      localIntent1.setComponent((ComponentName)localObject2);
      if (this.p != null)
      {
        Intent localIntent2 = new Intent(localIntent1);
        if (this.p.a(this, localIntent2)) {
          return null;
        }
      }
      a(new ad((ComponentName)localObject2, System.currentTimeMillis(), 1.0F));
      return localIntent1;
    }
  }
  
  public ResolveInfo b()
  {
    synchronized (this.d)
    {
      e();
      if (!this.e.isEmpty())
      {
        ResolveInfo localResolveInfo = ((ab)this.e.get(0)).a;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  public void c(int paramInt)
  {
    for (;;)
    {
      synchronized (this.d)
      {
        e();
        ab localab1 = (ab)this.e.get(paramInt);
        ab localab2 = (ab)this.e.get(0);
        if (localab2 != null)
        {
          f1 = localab2.b - localab1.b + 5.0F;
          a(new ad(new ComponentName(localab1.a.activityInfo.packageName, localab1.a.activityInfo.name), System.currentTimeMillis(), f1));
          return;
        }
      }
      float f1 = 1.0F;
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */