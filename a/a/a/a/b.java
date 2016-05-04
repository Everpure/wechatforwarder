package a.a.a.a;

import a.a.a.e.f;
import a.a.a.e.h;
import a.a.a.e.l;
import a.a.a.h.c;
import java.io.File;
import java.util.ArrayList;

public class b
{
  private String a;
  private int b;
  private l c;
  private a.a.a.f.a d;
  private boolean e;
  private String f;
  
  public b(File paramFile)
  {
    if (paramFile == null) {
      throw new a.a.a.c.a("Input zip file parameter is not null", 1);
    }
    this.a = paramFile.getPath();
    this.b = 2;
    this.d = new a.a.a.f.a();
    this.e = false;
  }
  
  public b(String paramString)
  {
    this(new File(paramString));
  }
  
  /* Error */
  private void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	a/a/a/a/b:a	Ljava/lang/String;
    //   4: invokestatic 59	a/a/a/h/c:d	(Ljava/lang/String;)Z
    //   7: ifne +13 -> 20
    //   10: new 22	a/a/a/c/a
    //   13: dup
    //   14: ldc 61
    //   16: invokespecial 62	a/a/a/c/a:<init>	(Ljava/lang/String;)V
    //   19: athrow
    //   20: aload_0
    //   21: getfield 35	a/a/a/a/b:a	Ljava/lang/String;
    //   24: invokestatic 64	a/a/a/h/c:c	(Ljava/lang/String;)Z
    //   27: ifne +13 -> 40
    //   30: new 22	a/a/a/c/a
    //   33: dup
    //   34: ldc 66
    //   36: invokespecial 62	a/a/a/c/a:<init>	(Ljava/lang/String;)V
    //   39: athrow
    //   40: aload_0
    //   41: getfield 37	a/a/a/a/b:b	I
    //   44: iconst_2
    //   45: if_icmpeq +13 -> 58
    //   48: new 22	a/a/a/c/a
    //   51: dup
    //   52: ldc 68
    //   54: invokespecial 62	a/a/a/c/a:<init>	(Ljava/lang/String;)V
    //   57: athrow
    //   58: new 70	java/io/RandomAccessFile
    //   61: dup
    //   62: new 29	java/io/File
    //   65: dup
    //   66: aload_0
    //   67: getfield 35	a/a/a/a/b:a	Ljava/lang/String;
    //   70: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: ldc 72
    //   75: invokespecial 75	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   78: astore_2
    //   79: aload_2
    //   80: astore_1
    //   81: aload_0
    //   82: getfield 77	a/a/a/a/b:c	La/a/a/e/l;
    //   85: ifnonnull +46 -> 131
    //   88: aload_2
    //   89: astore_1
    //   90: aload_0
    //   91: new 79	a/a/a/a/a
    //   94: dup
    //   95: aload_2
    //   96: invokespecial 82	a/a/a/a/a:<init>	(Ljava/io/RandomAccessFile;)V
    //   99: aload_0
    //   100: getfield 84	a/a/a/a/b:f	Ljava/lang/String;
    //   103: invokevirtual 87	a/a/a/a/a:a	(Ljava/lang/String;)La/a/a/e/l;
    //   106: putfield 77	a/a/a/a/b:c	La/a/a/e/l;
    //   109: aload_2
    //   110: astore_1
    //   111: aload_0
    //   112: getfield 77	a/a/a/a/b:c	La/a/a/e/l;
    //   115: ifnull +16 -> 131
    //   118: aload_2
    //   119: astore_1
    //   120: aload_0
    //   121: getfield 77	a/a/a/a/b:c	La/a/a/e/l;
    //   124: aload_0
    //   125: getfield 35	a/a/a/a/b:a	Ljava/lang/String;
    //   128: invokevirtual 91	a/a/a/e/l:a	(Ljava/lang/String;)V
    //   131: aload_2
    //   132: ifnull +7 -> 139
    //   135: aload_2
    //   136: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   139: return
    //   140: astore_3
    //   141: aconst_null
    //   142: astore_1
    //   143: new 22	a/a/a/c/a
    //   146: dup
    //   147: aload_3
    //   148: invokespecial 97	a/a/a/c/a:<init>	(Ljava/lang/Throwable;)V
    //   151: athrow
    //   152: astore_3
    //   153: aload_1
    //   154: astore_2
    //   155: aload_3
    //   156: astore_1
    //   157: aload_2
    //   158: ifnull +7 -> 165
    //   161: aload_2
    //   162: invokevirtual 94	java/io/RandomAccessFile:close	()V
    //   165: aload_1
    //   166: athrow
    //   167: astore_2
    //   168: goto -3 -> 165
    //   171: astore_1
    //   172: return
    //   173: astore_1
    //   174: aconst_null
    //   175: astore_2
    //   176: goto -19 -> 157
    //   179: astore_3
    //   180: aload_2
    //   181: astore_1
    //   182: goto -39 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	b
    //   80	86	1	localObject1	Object
    //   171	1	1	localIOException1	java.io.IOException
    //   173	1	1	localObject2	Object
    //   181	1	1	localObject3	Object
    //   78	84	2	localObject4	Object
    //   167	1	2	localIOException2	java.io.IOException
    //   175	6	2	localObject5	Object
    //   140	8	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   152	4	3	localObject6	Object
    //   179	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   58	79	140	java/io/FileNotFoundException
    //   81	88	152	finally
    //   90	109	152	finally
    //   111	118	152	finally
    //   120	131	152	finally
    //   143	152	152	finally
    //   161	165	167	java/io/IOException
    //   135	139	171	java/io/IOException
    //   58	79	173	finally
    //   81	88	179	java/io/FileNotFoundException
    //   90	109	179	java/io/FileNotFoundException
    //   111	118	179	java/io/FileNotFoundException
    //   120	131	179	java/io/FileNotFoundException
  }
  
  public void a(String paramString)
  {
    a(paramString, null);
  }
  
  public void a(String paramString, h paramh)
  {
    if (!c.a(paramString)) {
      throw new a.a.a.c.a("output path is null or invalid");
    }
    if (!c.b(paramString)) {
      throw new a.a.a.c.a("invalid output path");
    }
    if (this.c == null) {
      a();
    }
    if (this.c == null) {
      throw new a.a.a.c.a("Internal error occurred when extracting zip file");
    }
    if (this.d.a() == 1) {
      throw new a.a.a.c.a("invalid operation - Zip4j is in busy state");
    }
    new a.a.a.g.a(this.c).a(paramh, paramString, this.d, this.e);
  }
  
  public void a(char[] paramArrayOfChar)
  {
    if (this.c == null)
    {
      a();
      if (this.c == null) {
        throw new a.a.a.c.a("Zip Model is null");
      }
    }
    if ((this.c.a() == null) || (this.c.a().a() == null)) {
      throw new a.a.a.c.a("invalid zip file");
    }
    int i = 0;
    for (;;)
    {
      if (i >= this.c.a().a().size()) {
        return;
      }
      if ((this.c.a().a().get(i) != null) && (((f)this.c.a().a().get(i)).l())) {
        ((f)this.c.a().a().get(i)).a(paramArrayOfChar);
      }
      i += 1;
    }
  }
  
  public void b(String paramString)
  {
    if (!c.a(paramString)) {
      throw new NullPointerException();
    }
    a(paramString.toCharArray());
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */