package a.a.a.g;

import a.a.a.e.f;
import a.a.a.e.g;
import a.a.a.e.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.CRC32;

public class c
{
  private l a;
  private f b;
  private int c = 0;
  private g d;
  private a.a.a.b.b e;
  private CRC32 f;
  
  public c(l paraml, f paramf)
  {
    if ((paraml == null) || (paramf == null)) {
      throw new a.a.a.c.a("Invalid parameters passed to StoreUnzip. One or more of the parameters were null");
    }
    this.a = paraml;
    this.b = paramf;
    this.f = new CRC32();
  }
  
  private int a(a.a.a.e.a parama)
  {
    if (parama == null) {
      throw new a.a.a.c.a("unable to determine salt length: AESExtraDataRecord is null");
    }
    switch (parama.a())
    {
    default: 
      throw new a.a.a.c.a("unable to determine salt length: invalid aes key strength");
    case 1: 
      return 8;
    case 2: 
      return 12;
    }
    return 16;
  }
  
  private FileOutputStream a(String paramString1, String paramString2)
  {
    if (!a.a.a.h.c.a(paramString1)) {
      throw new a.a.a.c.a("invalid output path");
    }
    try
    {
      paramString1 = new File(b(paramString1, paramString2));
      if (!paramString1.getParentFile().exists()) {
        paramString1.getParentFile().mkdirs();
      }
      if (paramString1.exists()) {
        paramString1.delete();
      }
      paramString1 = new FileOutputStream(paramString1);
      return paramString1;
    }
    catch (FileNotFoundException paramString1)
    {
      throw new a.a.a.c.a(paramString1);
    }
  }
  
  private RandomAccessFile a(String paramString)
  {
    if ((this.a == null) || (!a.a.a.h.c.a(this.a.d()))) {
      throw new a.a.a.c.a("input parameter is null in getFilePointer");
    }
    try
    {
      if (this.a.c()) {
        return i();
      }
      paramString = new RandomAccessFile(new File(this.a.d()), paramString);
      return paramString;
    }
    catch (FileNotFoundException paramString)
    {
      throw new a.a.a.c.a(paramString);
    }
    catch (Exception paramString)
    {
      throw new a.a.a.c.a(paramString);
    }
  }
  
  private void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      if (paramOutputStream != null) {}
      return;
    }
    catch (IOException paramInputStream)
    {
      paramInputStream = paramInputStream;
      if ((paramInputStream != null) && (a.a.a.h.c.a(paramInputStream.getMessage())) && (paramInputStream.getMessage().indexOf(" - Wrong Password?") >= 0)) {
        throw new a.a.a.c.a(paramInputStream.getMessage());
      }
    }
    finally
    {
      for (;;)
      {
        if (paramOutputStream != null) {}
        try
        {
          paramOutputStream.close();
          throw paramInputStream;
          if (paramOutputStream == null) {
            continue;
          }
          try
          {
            paramOutputStream.close();
            return;
          }
          catch (IOException paramInputStream)
          {
            return;
          }
        }
        catch (IOException paramOutputStream)
        {
          for (;;) {}
        }
      }
    }
  }
  
  private void a(RandomAccessFile paramRandomAccessFile)
  {
    if (this.d == null) {
      throw new a.a.a.c.a("local file header is null, cannot initialize input stream");
    }
    try
    {
      b(paramRandomAccessFile);
      return;
    }
    catch (a.a.a.c.a paramRandomAccessFile)
    {
      throw paramRandomAccessFile;
    }
    catch (Exception paramRandomAccessFile)
    {
      throw new a.a.a.c.a(paramRandomAccessFile);
    }
  }
  
  private String b(String paramString1, String paramString2)
  {
    if (a.a.a.h.c.a(paramString2)) {}
    for (;;)
    {
      return paramString1 + System.getProperty("file.separator") + paramString2;
      paramString2 = this.b.j();
    }
  }
  
  private void b(RandomAccessFile paramRandomAccessFile)
  {
    if (this.d == null) {
      throw new a.a.a.c.a("local file header is null, cannot init decrypter");
    }
    if (this.d.h())
    {
      if (this.d.i() == 0) {
        this.e = new a.a.a.b.c(this.b, c(paramRandomAccessFile));
      }
    }
    else {
      return;
    }
    if (this.d.i() == 99)
    {
      this.e = new a.a.a.b.a(this.d, d(paramRandomAccessFile), e(paramRandomAccessFile));
      return;
    }
    throw new a.a.a.c.a("unsupported encryption method");
  }
  
  private byte[] c(RandomAccessFile paramRandomAccessFile)
  {
    try
    {
      byte[] arrayOfByte = new byte[12];
      paramRandomAccessFile.seek(this.d.g());
      paramRandomAccessFile.read(arrayOfByte, 0, 12);
      return arrayOfByte;
    }
    catch (IOException paramRandomAccessFile)
    {
      throw new a.a.a.c.a(paramRandomAccessFile);
    }
    catch (Exception paramRandomAccessFile)
    {
      throw new a.a.a.c.a(paramRandomAccessFile);
    }
  }
  
  private byte[] d(RandomAccessFile paramRandomAccessFile)
  {
    if (this.d.l() == null) {
      return null;
    }
    try
    {
      byte[] arrayOfByte = new byte[a(this.d.l())];
      paramRandomAccessFile.seek(this.d.g());
      paramRandomAccessFile.read(arrayOfByte);
      return arrayOfByte;
    }
    catch (IOException paramRandomAccessFile)
    {
      throw new a.a.a.c.a(paramRandomAccessFile);
    }
  }
  
  private byte[] e(RandomAccessFile paramRandomAccessFile)
  {
    try
    {
      byte[] arrayOfByte = new byte[2];
      paramRandomAccessFile.read(arrayOfByte);
      return arrayOfByte;
    }
    catch (IOException paramRandomAccessFile)
    {
      throw new a.a.a.c.a(paramRandomAccessFile);
    }
  }
  
  /* Error */
  private boolean h()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: invokespecial 104	a/a/a/g/c:i	()Ljava/io/RandomAccessFile;
    //   9: astore 6
    //   11: aload 6
    //   13: astore 5
    //   15: aload 6
    //   17: ifnonnull +35 -> 52
    //   20: aload 6
    //   22: astore_3
    //   23: aload 6
    //   25: astore 4
    //   27: new 106	java/io/RandomAccessFile
    //   30: dup
    //   31: new 62	java/io/File
    //   34: dup
    //   35: aload_0
    //   36: getfield 32	a/a/a/g/c:a	La/a/a/e/l;
    //   39: invokevirtual 96	a/a/a/e/l:d	()Ljava/lang/String;
    //   42: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   45: ldc -38
    //   47: invokespecial 109	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   50: astore 5
    //   52: aload 5
    //   54: astore_3
    //   55: aload 5
    //   57: astore 4
    //   59: aload_0
    //   60: new 220	a/a/a/a/a
    //   63: dup
    //   64: aload 5
    //   66: invokespecial 222	a/a/a/a/a:<init>	(Ljava/io/RandomAccessFile;)V
    //   69: aload_0
    //   70: getfield 34	a/a/a/g/c:b	La/a/a/e/f;
    //   73: invokevirtual 225	a/a/a/a/a:a	(La/a/a/e/f;)La/a/a/e/g;
    //   76: putfield 134	a/a/a/g/c:d	La/a/a/e/g;
    //   79: aload 5
    //   81: astore_3
    //   82: aload 5
    //   84: astore 4
    //   86: aload_0
    //   87: getfield 134	a/a/a/g/c:d	La/a/a/e/g;
    //   90: ifnonnull +48 -> 138
    //   93: aload 5
    //   95: astore_3
    //   96: aload 5
    //   98: astore 4
    //   100: new 25	a/a/a/c/a
    //   103: dup
    //   104: ldc -29
    //   106: invokespecial 30	a/a/a/c/a:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: astore 5
    //   112: aload_3
    //   113: astore 4
    //   115: new 25	a/a/a/c/a
    //   118: dup
    //   119: aload 5
    //   121: invokespecial 88	a/a/a/c/a:<init>	(Ljava/lang/Throwable;)V
    //   124: athrow
    //   125: astore_3
    //   126: aload 4
    //   128: ifnull +8 -> 136
    //   131: aload 4
    //   133: invokevirtual 228	java/io/RandomAccessFile:close	()V
    //   136: aload_3
    //   137: athrow
    //   138: aload 5
    //   140: astore_3
    //   141: aload 5
    //   143: astore 4
    //   145: aload_0
    //   146: getfield 134	a/a/a/g/c:d	La/a/a/e/g;
    //   149: invokevirtual 229	a/a/a/e/g:a	()I
    //   152: istore_1
    //   153: aload 5
    //   155: astore_3
    //   156: aload 5
    //   158: astore 4
    //   160: aload_0
    //   161: getfield 34	a/a/a/g/c:b	La/a/a/e/f;
    //   164: invokevirtual 230	a/a/a/e/f:a	()I
    //   167: istore_2
    //   168: iload_1
    //   169: iload_2
    //   170: if_icmpeq +15 -> 185
    //   173: aload 5
    //   175: ifnull +8 -> 183
    //   178: aload 5
    //   180: invokevirtual 228	java/io/RandomAccessFile:close	()V
    //   183: iconst_0
    //   184: ireturn
    //   185: aload 5
    //   187: ifnull +8 -> 195
    //   190: aload 5
    //   192: invokevirtual 228	java/io/RandomAccessFile:close	()V
    //   195: iconst_1
    //   196: ireturn
    //   197: astore_3
    //   198: goto -15 -> 183
    //   201: astore_3
    //   202: goto -19 -> 183
    //   205: astore_3
    //   206: goto -11 -> 195
    //   209: astore_3
    //   210: goto -15 -> 195
    //   213: astore 4
    //   215: goto -79 -> 136
    //   218: astore 4
    //   220: goto -84 -> 136
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	this	c
    //   152	19	1	i	int
    //   167	4	2	j	int
    //   4	109	3	localObject1	Object
    //   125	12	3	localObject2	Object
    //   140	16	3	localObject3	Object
    //   197	1	3	localIOException1	IOException
    //   201	1	3	localException1	Exception
    //   205	1	3	localIOException2	IOException
    //   209	1	3	localException2	Exception
    //   1	158	4	localObject4	Object
    //   213	1	4	localIOException3	IOException
    //   218	1	4	localException3	Exception
    //   13	84	5	localRandomAccessFile1	RandomAccessFile
    //   110	81	5	localFileNotFoundException	FileNotFoundException
    //   9	15	6	localRandomAccessFile2	RandomAccessFile
    // Exception table:
    //   from	to	target	type
    //   5	11	110	java/io/FileNotFoundException
    //   27	52	110	java/io/FileNotFoundException
    //   59	79	110	java/io/FileNotFoundException
    //   86	93	110	java/io/FileNotFoundException
    //   100	110	110	java/io/FileNotFoundException
    //   145	153	110	java/io/FileNotFoundException
    //   160	168	110	java/io/FileNotFoundException
    //   5	11	125	finally
    //   27	52	125	finally
    //   59	79	125	finally
    //   86	93	125	finally
    //   100	110	125	finally
    //   115	125	125	finally
    //   145	153	125	finally
    //   160	168	125	finally
    //   178	183	197	java/io/IOException
    //   178	183	201	java/lang/Exception
    //   190	195	205	java/io/IOException
    //   190	195	209	java/lang/Exception
    //   131	136	213	java/io/IOException
    //   131	136	218	java/lang/Exception
  }
  
  private RandomAccessFile i()
  {
    if (this.a.c())
    {
      int i = this.b.g();
      this.c = (i + 1);
      Object localObject = this.a.d();
      if (i == this.a.b().a()) {
        localObject = this.a.d();
      }
      try
      {
        RandomAccessFile localRandomAccessFile2 = new RandomAccessFile((String)localObject, "r");
        localObject = localRandomAccessFile2;
        if (this.c != 1) {
          return localObject;
        }
        byte[] arrayOfByte = new byte[4];
        localRandomAccessFile2.read(arrayOfByte);
        localObject = localRandomAccessFile2;
        if (a.a.a.h.b.d(arrayOfByte, 0) == 134695760L) {
          return ???;
        }
        throw new a.a.a.c.a("invalid first part split file signature");
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        for (;;)
        {
          throw new a.a.a.c.a(localFileNotFoundException);
          String str;
          if (i >= 9) {
            str = localFileNotFoundException.substring(0, localFileNotFoundException.lastIndexOf(".")) + ".z" + (i + 1);
          } else {
            str = str.substring(0, str.lastIndexOf(".")) + ".z0" + (i + 1);
          }
        }
      }
      catch (IOException localIOException)
      {
        throw new a.a.a.c.a(localIOException);
      }
    }
    RandomAccessFile localRandomAccessFile1 = null;
    return localRandomAccessFile1;
  }
  
  public a.a.a.d.d a()
  {
    if (this.b == null) {
      throw new a.a.a.c.a("file header is null, cannot get inputstream");
    }
    Object localObject3 = null;
    Object localObject1 = null;
    try
    {
      localObject5 = a("r");
      localObject1 = localObject5;
      localObject3 = localObject5;
      if (!h())
      {
        localObject1 = localObject5;
        localObject3 = localObject5;
        throw new a.a.a.c.a("local header and file header do not match");
      }
    }
    catch (a.a.a.c.a locala)
    {
      if (localObject1 == null) {}
    }
    catch (Exception localException)
    {
      try
      {
        ((RandomAccessFile)localObject1).close();
        throw locala;
        localObject1 = localObject5;
        localObject4 = localObject5;
        a((RandomAccessFile)localObject5);
        localObject1 = localObject5;
        localObject4 = localObject5;
        l4 = this.d.c();
        localObject1 = localObject5;
        localObject4 = localObject5;
        l3 = this.d.g();
        localObject1 = localObject5;
        l1 = l3;
        l2 = l4;
        localObject4 = localObject5;
        int i;
        if (this.d.h())
        {
          localObject1 = localObject5;
          localObject4 = localObject5;
          if (this.d.i() != 99) {
            break label480;
          }
          localObject1 = localObject5;
          localObject4 = localObject5;
          if ((this.e instanceof a.a.a.b.a))
          {
            localObject1 = localObject5;
            localObject4 = localObject5;
            i = ((a.a.a.b.a)this.e).b();
            localObject1 = localObject5;
            localObject4 = localObject5;
            l2 = l4 - (((a.a.a.b.a)this.e).a() + i + 10);
            localObject1 = localObject5;
            localObject4 = localObject5;
            i = ((a.a.a.b.a)this.e).b();
            localObject1 = localObject5;
            localObject4 = localObject5;
            l1 = l3 + (((a.a.a.b.a)this.e).a() + i);
          }
        }
        else
        {
          localObject1 = localObject5;
          localObject4 = localObject5;
          i = this.b.a();
          localObject1 = localObject5;
          localObject4 = localObject5;
          if (this.b.m() == 99)
          {
            localObject1 = localObject5;
            localObject4 = localObject5;
            if (this.b.r() == null) {
              break label523;
            }
            localObject1 = localObject5;
            localObject4 = localObject5;
            i = this.b.r().b();
          }
          localObject1 = localObject5;
          localObject4 = localObject5;
          ((RandomAccessFile)localObject5).seek(l1);
          switch (i)
          {
          case 0: 
            localObject1 = localObject5;
            localObject4 = localObject5;
            throw new a.a.a.c.a("compression type not supported");
            localException = localException;
            if (localObject4 == null) {}
            break;
          }
        }
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          try
          {
            Object localObject5;
            long l4;
            long l3;
            ((RandomAccessFile)localObject4).close();
            throw new a.a.a.c.a(localException);
            Object localObject2 = localObject5;
            Object localObject4 = localObject5;
            throw new a.a.a.c.a("invalid decryptor when trying to calculate compressed size for AES encrypted file: " + this.b.j());
            label480:
            localObject2 = localObject5;
            long l1 = l3;
            long l2 = l4;
            localObject4 = localObject5;
            if (this.d.i() == 0)
            {
              l2 = l4 - 12L;
              l1 = l3 + 12L;
              continue;
              label523:
              localObject2 = localObject5;
              localObject4 = localObject5;
              throw new a.a.a.c.a("AESExtraDataRecord does not exist for AES encrypted file: " + this.b.j());
              localObject2 = localObject5;
              localObject4 = localObject5;
              return new a.a.a.d.d(new a.a.a.d.c((RandomAccessFile)localObject5, l1, l2, this));
              localObject2 = localObject5;
              localObject4 = localObject5;
              localObject5 = new a.a.a.d.d(new a.a.a.d.b((RandomAccessFile)localObject5, l1, l2, this));
              return (a.a.a.d.d)localObject5;
              localIOException1 = localIOException1;
            }
          }
          catch (IOException localIOException2) {}
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.f.update(paramInt);
  }
  
  /* Error */
  public void a(a.a.a.f.a parama, String paramString1, String paramString2, a.a.a.e.h paramh)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 11
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 8
    //   9: aconst_null
    //   10: astore 9
    //   12: aconst_null
    //   13: astore 10
    //   15: aconst_null
    //   16: astore 6
    //   18: aload_0
    //   19: getfield 32	a/a/a/g/c:a	La/a/a/e/l;
    //   22: ifnull +17 -> 39
    //   25: aload_0
    //   26: getfield 34	a/a/a/g/c:b	La/a/a/e/f;
    //   29: ifnull +10 -> 39
    //   32: aload_2
    //   33: invokestatic 58	a/a/a/h/c:a	(Ljava/lang/String;)Z
    //   36: ifne +14 -> 50
    //   39: new 25	a/a/a/c/a
    //   42: dup
    //   43: ldc_w 315
    //   46: invokespecial 30	a/a/a/c/a:<init>	(Ljava/lang/String;)V
    //   49: athrow
    //   50: sipush 4096
    //   53: newarray <illegal type>
    //   55: astore 13
    //   57: aload_0
    //   58: invokevirtual 317	a/a/a/g/c:a	()La/a/a/d/d;
    //   61: astore 12
    //   63: aload 12
    //   65: astore 7
    //   67: aload 11
    //   69: astore 6
    //   71: aload 7
    //   73: astore 8
    //   75: aload_0
    //   76: aload_2
    //   77: aload_3
    //   78: invokespecial 319	a/a/a/g/c:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/FileOutputStream;
    //   81: astore 11
    //   83: aload 11
    //   85: astore 6
    //   87: aload 7
    //   89: astore 8
    //   91: aload 11
    //   93: astore 9
    //   95: aload 11
    //   97: astore 10
    //   99: aload 7
    //   101: aload 13
    //   103: invokevirtual 320	java/io/InputStream:read	([B)I
    //   106: istore 5
    //   108: iload 5
    //   110: iconst_m1
    //   111: if_icmpne +74 -> 185
    //   114: aload 11
    //   116: astore 6
    //   118: aload 7
    //   120: astore 8
    //   122: aload 11
    //   124: astore 9
    //   126: aload 11
    //   128: astore 10
    //   130: aload_0
    //   131: aload 7
    //   133: aload 11
    //   135: invokespecial 322	a/a/a/g/c:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   138: aload 11
    //   140: astore 6
    //   142: aload 7
    //   144: astore 8
    //   146: aload 11
    //   148: astore 9
    //   150: aload 11
    //   152: astore 10
    //   154: aload_0
    //   155: getfield 34	a/a/a/g/c:b	La/a/a/e/f;
    //   158: new 62	java/io/File
    //   161: dup
    //   162: aload_0
    //   163: aload_2
    //   164: aload_3
    //   165: invokespecial 65	a/a/a/g/c:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   168: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   171: aload 4
    //   173: invokestatic 327	a/a/a/g/d:a	(La/a/a/e/f;Ljava/io/File;La/a/a/e/h;)V
    //   176: aload_0
    //   177: aload 7
    //   179: aload 11
    //   181: invokespecial 322	a/a/a/g/c:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   184: return
    //   185: aload 11
    //   187: astore 6
    //   189: aload 7
    //   191: astore 8
    //   193: aload 11
    //   195: astore 9
    //   197: aload 11
    //   199: astore 10
    //   201: aload 11
    //   203: aload 13
    //   205: iconst_0
    //   206: iload 5
    //   208: invokevirtual 331	java/io/OutputStream:write	([BII)V
    //   211: aload 11
    //   213: astore 6
    //   215: aload 7
    //   217: astore 8
    //   219: aload 11
    //   221: astore 9
    //   223: aload 11
    //   225: astore 10
    //   227: aload_1
    //   228: iload 5
    //   230: i2l
    //   231: invokevirtual 335	a/a/a/f/a:b	(J)V
    //   234: aload 11
    //   236: astore 6
    //   238: aload 7
    //   240: astore 8
    //   242: aload 11
    //   244: astore 9
    //   246: aload 11
    //   248: astore 10
    //   250: aload_1
    //   251: invokevirtual 337	a/a/a/f/a:d	()Z
    //   254: ifeq -171 -> 83
    //   257: aload 11
    //   259: astore 6
    //   261: aload 7
    //   263: astore 8
    //   265: aload 11
    //   267: astore 9
    //   269: aload 11
    //   271: astore 10
    //   273: aload_1
    //   274: iconst_3
    //   275: invokevirtual 339	a/a/a/f/a:b	(I)V
    //   278: aload 11
    //   280: astore 6
    //   282: aload 7
    //   284: astore 8
    //   286: aload 11
    //   288: astore 9
    //   290: aload 11
    //   292: astore 10
    //   294: aload_1
    //   295: iconst_0
    //   296: invokevirtual 341	a/a/a/f/a:a	(I)V
    //   299: aload_0
    //   300: aload 7
    //   302: aload 11
    //   304: invokespecial 322	a/a/a/g/c:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   307: return
    //   308: astore_1
    //   309: aconst_null
    //   310: astore 7
    //   312: aload 7
    //   314: astore 8
    //   316: new 25	a/a/a/c/a
    //   319: dup
    //   320: aload_1
    //   321: invokespecial 88	a/a/a/c/a:<init>	(Ljava/lang/Throwable;)V
    //   324: athrow
    //   325: astore_1
    //   326: aload_0
    //   327: aload 8
    //   329: aload 6
    //   331: invokespecial 322	a/a/a/g/c:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   334: aload_1
    //   335: athrow
    //   336: astore_1
    //   337: aconst_null
    //   338: astore 7
    //   340: aload 8
    //   342: astore 6
    //   344: aload 7
    //   346: astore 8
    //   348: new 25	a/a/a/c/a
    //   351: dup
    //   352: aload_1
    //   353: invokespecial 88	a/a/a/c/a:<init>	(Ljava/lang/Throwable;)V
    //   356: athrow
    //   357: astore_1
    //   358: aconst_null
    //   359: astore 8
    //   361: aload 7
    //   363: astore 6
    //   365: goto -39 -> 326
    //   368: astore_1
    //   369: aload 9
    //   371: astore 6
    //   373: goto -29 -> 344
    //   376: astore_1
    //   377: aload 10
    //   379: astore 6
    //   381: goto -69 -> 312
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	384	0	this	c
    //   0	384	1	parama	a.a.a.f.a
    //   0	384	2	paramString1	String
    //   0	384	3	paramString2	String
    //   0	384	4	paramh	a.a.a.e.h
    //   106	123	5	i	int
    //   16	364	6	localObject1	Object
    //   4	358	7	localObject2	Object
    //   7	353	8	localObject3	Object
    //   10	360	9	localFileOutputStream1	FileOutputStream
    //   13	365	10	localFileOutputStream2	FileOutputStream
    //   1	302	11	localFileOutputStream3	FileOutputStream
    //   61	3	12	locald	a.a.a.d.d
    //   55	149	13	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   50	63	308	java/io/IOException
    //   75	83	325	finally
    //   99	108	325	finally
    //   130	138	325	finally
    //   154	176	325	finally
    //   201	211	325	finally
    //   227	234	325	finally
    //   250	257	325	finally
    //   273	278	325	finally
    //   294	299	325	finally
    //   316	325	325	finally
    //   348	357	325	finally
    //   50	63	336	java/lang/Exception
    //   50	63	357	finally
    //   75	83	368	java/lang/Exception
    //   99	108	368	java/lang/Exception
    //   130	138	368	java/lang/Exception
    //   154	176	368	java/lang/Exception
    //   201	211	368	java/lang/Exception
    //   227	234	368	java/lang/Exception
    //   250	257	368	java/lang/Exception
    //   273	278	368	java/lang/Exception
    //   294	299	368	java/lang/Exception
    //   75	83	376	java/io/IOException
    //   99	108	376	java/io/IOException
    //   130	138	376	java/io/IOException
    //   154	176	376	java/io/IOException
    //   201	211	376	java/io/IOException
    //   227	234	376	java/io/IOException
    //   250	257	376	java/io/IOException
    //   273	278	376	java/io/IOException
    //   294	299	376	java/io/IOException
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null) {
      this.f.update(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public void b()
  {
    if (this.b != null)
    {
      Object localObject1;
      Object localObject2;
      if (this.b.m() == 99)
      {
        if ((this.e != null) && ((this.e instanceof a.a.a.b.a)))
        {
          localObject1 = ((a.a.a.b.a)this.e).c();
          localObject2 = ((a.a.a.b.a)this.e).d();
          byte[] arrayOfByte = new byte[10];
          if ((arrayOfByte == null) || (localObject2 == null)) {
            throw new a.a.a.c.a("CRC (MAC) check failed for " + this.b.j());
          }
          System.arraycopy(localObject1, 0, arrayOfByte, 0, 10);
          if (!Arrays.equals(arrayOfByte, (byte[])localObject2)) {
            throw new a.a.a.c.a("invalid CRC (MAC) for file: " + this.b.j());
          }
        }
      }
      else if ((this.f.getValue() & 0xFFFFFFFF) != this.b.c())
      {
        localObject2 = "invalid CRC for file: " + this.b.j();
        localObject1 = localObject2;
        if (this.d.h())
        {
          localObject1 = localObject2;
          if (this.d.i() == 0) {
            localObject1 = localObject2 + " - Wrong Password?";
          }
        }
        throw new a.a.a.c.a((String)localObject1);
      }
    }
  }
  
  public RandomAccessFile c()
  {
    String str1 = this.a.d();
    if (this.c == this.a.b().a()) {
      str1 = this.a.d();
    }
    String str2;
    for (;;)
    {
      this.c += 1;
      try
      {
        if (a.a.a.h.c.d(str1)) {
          break;
        }
        throw new IOException("zip split file does not exist: " + str1);
      }
      catch (a.a.a.c.a locala)
      {
        throw new IOException(locala.getMessage());
      }
      if (this.c >= 9) {
        str2 = locala.substring(0, locala.lastIndexOf(".")) + ".z" + (this.c + 1);
      } else {
        str2 = str2.substring(0, str2.lastIndexOf(".")) + ".z0" + (this.c + 1);
      }
    }
    return new RandomAccessFile(str2, "r");
  }
  
  public f d()
  {
    return this.b;
  }
  
  public a.a.a.b.b e()
  {
    return this.e;
  }
  
  public l f()
  {
    return this.a;
  }
  
  public g g()
  {
    return this.d;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */