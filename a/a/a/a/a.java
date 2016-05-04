package a.a.a.a;

import a.a.a.e.d;
import a.a.a.e.e;
import a.a.a.e.f;
import a.a.a.e.g;
import a.a.a.e.i;
import a.a.a.e.j;
import a.a.a.e.k;
import a.a.a.e.l;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class a
{
  private RandomAccessFile a = null;
  private l b;
  
  public a(RandomAccessFile paramRandomAccessFile)
  {
    this.a = paramRandomAccessFile;
  }
  
  private a.a.a.e.a a(ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      return null;
    }
    int i = 0;
    if (i >= paramArrayList.size()) {
      return null;
    }
    Object localObject = (e)paramArrayList.get(i);
    if (localObject == null) {}
    while (((e)localObject).a() != 39169L)
    {
      i += 1;
      break;
    }
    if (((e)localObject).c() == null) {
      throw new a.a.a.c.a("corrput AES extra data records");
    }
    paramArrayList = new a.a.a.e.a();
    paramArrayList.a(39169L);
    paramArrayList.a(((e)localObject).b());
    localObject = ((e)localObject).c();
    paramArrayList.b(a.a.a.h.b.b((byte[])localObject, 0));
    byte[] arrayOfByte = new byte[2];
    System.arraycopy(localObject, 2, arrayOfByte, 0, 2);
    paramArrayList.a(new String(arrayOfByte));
    paramArrayList.c(localObject[4] & 0xFF);
    paramArrayList.d(a.a.a.h.b.b((byte[])localObject, 5));
    return paramArrayList;
  }
  
  private d a()
  {
    int i = 0;
    if (this.a == null) {
      throw new a.a.a.c.a("random access file was null", 3);
    }
    for (;;)
    {
      long l;
      try
      {
        arrayOfByte1 = new byte[4];
        l = this.a.length() - 22L;
        d locald = new d();
        this.a.seek(l);
        i += 1;
        if ((a.a.a.h.b.a(this.a, arrayOfByte1) != 101010256L) && (i <= 3000)) {
          break label379;
        }
        if (a.a.a.h.b.d(arrayOfByte1, 0) != 101010256L) {
          throw new a.a.a.c.a("zip headers not found. probably not a zip file");
        }
      }
      catch (IOException localIOException)
      {
        throw new a.a.a.c.a("Probably not a zip file or a corrupted zip file", localIOException, 4);
      }
      byte[] arrayOfByte1 = new byte[4];
      byte[] arrayOfByte2 = new byte[2];
      localIOException.a(101010256L);
      a(this.a, arrayOfByte2);
      localIOException.a(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte2);
      localIOException.b(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte2);
      localIOException.c(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte2);
      localIOException.d(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte1);
      localIOException.e(a.a.a.h.b.d(arrayOfByte1, 0));
      a(this.a, arrayOfByte1);
      localIOException.b(a.a.a.h.b.a(a(arrayOfByte1), 0));
      a(this.a, arrayOfByte2);
      i = a.a.a.h.b.b(arrayOfByte2, 0);
      localIOException.f(i);
      if (i > 0)
      {
        arrayOfByte1 = new byte[i];
        a(this.a, arrayOfByte1);
        localIOException.a(new String(arrayOfByte1));
        localIOException.a(arrayOfByte1);
      }
      while (localIOException.a() > 0)
      {
        this.b.a(true);
        return localIOException;
        localIOException.a(null);
      }
      this.b.a(false);
      return localIOException;
      label379:
      l -= 1L;
    }
  }
  
  private k a(ArrayList paramArrayList, long paramLong1, long paramLong2, long paramLong3, int paramInt)
  {
    int i = 0;
    if (i >= paramArrayList.size()) {}
    for (;;)
    {
      return null;
      e locale = (e)paramArrayList.get(i);
      if (locale == null) {}
      while (locale.a() != 1L)
      {
        i += 1;
        break;
      }
      paramArrayList = new k();
      byte[] arrayOfByte1 = locale.c();
      if (locale.b() > 0)
      {
        byte[] arrayOfByte2 = new byte[8];
        byte[] arrayOfByte3 = new byte[4];
        int j = 0;
        int m = 0;
        int k = m;
        i = j;
        if ((0xFFFF & paramLong1) == 65535L)
        {
          k = m;
          i = j;
          if (locale.b() < 0)
          {
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 8);
            paramArrayList.b(a.a.a.h.b.a(arrayOfByte2, 0));
            i = 8;
            k = 1;
          }
        }
        m = k;
        j = i;
        if ((0xFFFF & paramLong2) == 65535L)
        {
          m = k;
          j = i;
          if (i < locale.b())
          {
            System.arraycopy(arrayOfByte1, i, arrayOfByte2, 0, 8);
            paramArrayList.a(a.a.a.h.b.a(arrayOfByte2, 0));
            j = i + 8;
            m = 1;
          }
        }
        i = m;
        k = j;
        if ((0xFFFF & paramLong3) == 65535L)
        {
          i = m;
          k = j;
          if (j < locale.b())
          {
            System.arraycopy(arrayOfByte1, j, arrayOfByte2, 0, 8);
            paramArrayList.c(a.a.a.h.b.a(arrayOfByte2, 0));
            k = j + 8;
            i = 1;
          }
        }
        if (((0xFFFF & paramInt) == 65535) && (k < locale.b()))
        {
          System.arraycopy(arrayOfByte1, k, arrayOfByte3, 0, 4);
          paramArrayList.a(a.a.a.h.b.d(arrayOfByte3, 0));
        }
        for (paramInt = 1; paramInt != 0; paramInt = i) {
          return paramArrayList;
        }
      }
    }
  }
  
  private ArrayList a(int paramInt)
  {
    int i = 0;
    if (paramInt <= 0) {
      return null;
    }
    for (;;)
    {
      try
      {
        arrayOfByte1 = new byte[paramInt];
        this.a.read(arrayOfByte1);
        localArrayList = new ArrayList();
      }
      catch (IOException localIOException)
      {
        byte[] arrayOfByte1;
        ArrayList localArrayList;
        e locale;
        int k;
        int j;
        byte[] arrayOfByte2;
        throw new a.a.a.c.a(localIOException);
      }
      if (localArrayList.size() <= 0) {
        break;
      }
      return localArrayList;
      locale = new e();
      locale.a(a.a.a.h.b.b(arrayOfByte1, i));
      k = i + 2;
      j = a.a.a.h.b.b(arrayOfByte1, k);
      i = j;
      if (j + 2 > paramInt)
      {
        i = a.a.a.h.b.c(arrayOfByte1, k);
        if (i + 2 > paramInt) {}
      }
      else
      {
        locale.a(i);
        j = k + 2;
        if (i > 0)
        {
          arrayOfByte2 = new byte[i];
          System.arraycopy(arrayOfByte1, j, arrayOfByte2, 0, i);
          locale.a(arrayOfByte2);
        }
        i += j;
        localArrayList.add(locale);
        if (i < paramInt) {}
      }
    }
  }
  
  private void a(g paramg)
  {
    if (this.a == null) {
      throw new a.a.a.c.a("invalid file handler when trying to read extra data record");
    }
    if (paramg == null) {
      throw new a.a.a.c.a("file header is null");
    }
    int i = paramg.e();
    if (i <= 0) {
      return;
    }
    paramg.a(a(i));
  }
  
  private byte[] a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte)
  {
    try
    {
      if (paramRandomAccessFile.read(paramArrayOfByte, 0, paramArrayOfByte.length) != -1) {
        return paramArrayOfByte;
      }
      throw new a.a.a.c.a("unexpected end of file when reading short buff");
    }
    catch (IOException paramRandomAccessFile)
    {
      throw new a.a.a.c.a("IOException when reading short buff", paramRandomAccessFile);
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new a.a.a.c.a("input parameter is null, cannot expand to 8 bytes");
    }
    if (paramArrayOfByte.length != 4) {
      throw new a.a.a.c.a("invalid byte length, cannot expand to 8 bytes");
    }
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = paramArrayOfByte[0];
    arrayOfByte[1] = paramArrayOfByte[1];
    arrayOfByte[2] = paramArrayOfByte[2];
    arrayOfByte[3] = paramArrayOfByte[3];
    return arrayOfByte;
  }
  
  private a.a.a.e.b b()
  {
    if (this.a == null) {
      throw new a.a.a.c.a("random access file was null", 3);
    }
    if (this.b.b() == null) {
      throw new a.a.a.c.a("EndCentralRecord was null, maybe a corrupt zip file");
    }
    a.a.a.e.b localb;
    ArrayList localArrayList;
    int i;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    int j;
    f localf;
    int k;
    try
    {
      localb = new a.a.a.e.b();
      localArrayList = new ArrayList();
      Object localObject1 = this.b.b();
      long l = ((d)localObject1).c();
      i = ((d)localObject1).b();
      if (!this.b.g()) {
        break label1047;
      }
      l = this.b.f().d();
      i = (int)this.b.f().c();
      this.a.seek(l);
      arrayOfByte1 = new byte[4];
      arrayOfByte2 = new byte[2];
      localObject1 = new byte[8];
      j = 0;
      if (j >= i)
      {
        localb.a(localArrayList);
        localObject1 = new a.a.a.e.c();
        a(this.a, arrayOfByte1);
        i = a.a.a.h.b.d(arrayOfByte1, 0);
        if (i == 84233040L) {
          break label980;
        }
        return localb;
      }
      localf = new f();
      a(this.a, arrayOfByte1);
      k = a.a.a.h.b.d(arrayOfByte1, 0);
      if (k != 33639248L) {
        throw new a.a.a.c.a("Expected central directory entry not found (#" + (j + 1) + ")");
      }
    }
    catch (IOException localIOException)
    {
      throw new a.a.a.c.a(localIOException);
    }
    localf.a(k);
    a(this.a, arrayOfByte2);
    localf.b(a.a.a.h.b.b(arrayOfByte2, 0));
    a(this.a, arrayOfByte2);
    localf.c(a.a.a.h.b.b(arrayOfByte2, 0));
    a(this.a, arrayOfByte2);
    label346:
    label393:
    int m;
    Object localObject2;
    Object localObject3;
    if ((a.a.a.h.b.b(arrayOfByte2, 0) & 0x800) != 0)
    {
      bool = true;
      localf.d(bool);
      k = arrayOfByte2[0];
      if ((k & 0x1) != 0) {
        localf.b(true);
      }
      localf.a((byte[])arrayOfByte2.clone());
      if (k >> 3 != 1) {
        break label1056;
      }
      bool = true;
      localf.c(bool);
      a(this.a, arrayOfByte2);
      localf.d(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte1);
      localf.e(a.a.a.h.b.d(arrayOfByte1, 0));
      a(this.a, arrayOfByte1);
      localf.a(a.a.a.h.b.d(arrayOfByte1, 0));
      localf.d((byte[])arrayOfByte1.clone());
      a(this.a, arrayOfByte1);
      localf.b(a.a.a.h.b.a(a(arrayOfByte1), 0));
      a(this.a, arrayOfByte1);
      localf.c(a.a.a.h.b.a(a(arrayOfByte1), 0));
      a(this.a, arrayOfByte2);
      k = a.a.a.h.b.b(arrayOfByte2, 0);
      localf.f(k);
      a(this.a, arrayOfByte2);
      localf.g(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte2);
      m = a.a.a.h.b.b(arrayOfByte2, 0);
      localf.b(new String(arrayOfByte2));
      a(this.a, arrayOfByte2);
      localf.h(a.a.a.h.b.b(arrayOfByte2, 0));
      a(this.a, arrayOfByte2);
      localf.b((byte[])arrayOfByte2.clone());
      a(this.a, arrayOfByte1);
      localf.c((byte[])arrayOfByte1.clone());
      a(this.a, arrayOfByte1);
      localf.d(a.a.a.h.b.a(a(arrayOfByte1), 0) & 0xFFFFFFFF);
      if (k > 0)
      {
        localObject2 = new byte[k];
        a(this.a, (byte[])localObject2);
        if (a.a.a.h.c.a(this.b.h())) {}
        for (localObject2 = new String((byte[])localObject2, this.b.h()); localObject2 == null; localObject2 = a.a.a.h.c.a((byte[])localObject2, localf.s())) {
          throw new a.a.a.c.a("fileName is null when reading central directory");
        }
        localObject3 = localObject2;
        if (((String)localObject2).indexOf(":" + System.getProperty("file.separator")) >= 0) {
          localObject3 = ((String)localObject2).substring(((String)localObject2).indexOf(":" + System.getProperty("file.separator")) + 2);
        }
        localf.a((String)localObject3);
        if ((((String)localObject3).endsWith("/")) || (((String)localObject3).endsWith("\\"))) {
          break label1062;
        }
      }
    }
    label980:
    label1047:
    label1056:
    label1062:
    for (boolean bool = false;; bool = true)
    {
      localf.a(bool);
      for (;;)
      {
        b(localf);
        c(localf);
        d(localf);
        if (m > 0)
        {
          localObject2 = new byte[m];
          a(this.a, (byte[])localObject2);
          localf.b(new String((byte[])localObject2));
        }
        localArrayList.add(localf);
        j += 1;
        break;
        localf.a(null);
      }
      ((a.a.a.e.c)localObject2).a(i);
      a(this.a, arrayOfByte2);
      i = a.a.a.h.b.b(arrayOfByte2, 0);
      ((a.a.a.e.c)localObject2).b(i);
      if (i > 0)
      {
        localObject3 = new byte[i];
        a(this.a, (byte[])localObject3);
        ((a.a.a.e.c)localObject2).a(new String((byte[])localObject3));
      }
      return localb;
      break;
      bool = false;
      break label346;
      bool = false;
      break label393;
    }
  }
  
  private void b(f paramf)
  {
    if (this.a == null) {
      throw new a.a.a.c.a("invalid file handler when trying to read extra data record");
    }
    if (paramf == null) {
      throw new a.a.a.c.a("file header is null");
    }
    int i = paramf.f();
    if (i <= 0) {
      return;
    }
    paramf.a(a(i));
  }
  
  private void b(g paramg)
  {
    if (paramg == null) {
      throw new a.a.a.c.a("file header is null in reading Zip64 Extended Info");
    }
    if ((paramg.k() == null) || (paramg.k().size() <= 0)) {}
    k localk;
    do
    {
      do
      {
        return;
        localk = a(paramg.k(), paramg.d(), paramg.c(), -1L, -1);
      } while (localk == null);
      paramg.a(localk);
      if (localk.b() != -1L) {
        paramg.c(localk.b());
      }
    } while (localk.a() == -1L);
    paramg.b(localk.a());
  }
  
  private i c()
  {
    if (this.a == null) {
      throw new a.a.a.c.a("invalid file handler when trying to read Zip64EndCentralDirLocator");
    }
    try
    {
      i locali = new i();
      e();
      byte[] arrayOfByte1 = new byte[4];
      byte[] arrayOfByte2 = new byte[8];
      a(this.a, arrayOfByte1);
      int i = a.a.a.h.b.d(arrayOfByte1, 0);
      if (i == 117853008L)
      {
        this.b.b(true);
        locali.a(i);
        a(this.a, arrayOfByte1);
        locali.a(a.a.a.h.b.d(arrayOfByte1, 0));
        a(this.a, arrayOfByte2);
        locali.b(a.a.a.h.b.a(arrayOfByte2, 0));
        a(this.a, arrayOfByte1);
        locali.b(a.a.a.h.b.d(arrayOfByte1, 0));
        return locali;
      }
      this.b.b(false);
      return null;
    }
    catch (Exception localException)
    {
      throw new a.a.a.c.a(localException);
    }
  }
  
  private void c(f paramf)
  {
    if (paramf == null) {
      throw new a.a.a.c.a("file header is null in reading Zip64 Extended Info");
    }
    if ((paramf.p() == null) || (paramf.p().size() <= 0)) {}
    k localk;
    do
    {
      do
      {
        return;
        localk = a(paramf.p(), paramf.e(), paramf.d(), paramf.i(), paramf.g());
      } while (localk == null);
      paramf.a(localk);
      if (localk.b() != -1L) {
        paramf.c(localk.b());
      }
      if (localk.a() != -1L) {
        paramf.b(localk.a());
      }
      if (localk.c() != -1L) {
        paramf.d(localk.c());
      }
    } while (localk.d() == -1);
    paramf.h(localk.d());
  }
  
  private void c(g paramg)
  {
    if (paramg == null) {
      throw new a.a.a.c.a("file header is null in reading Zip64 Extended Info");
    }
    if ((paramg.k() == null) || (paramg.k().size() <= 0)) {}
    a.a.a.e.a locala;
    do
    {
      return;
      locala = a(paramg.k());
    } while (locala == null);
    paramg.a(locala);
    paramg.g(99);
  }
  
  private j d()
  {
    if (this.b.e() == null) {
      throw new a.a.a.c.a("invalid zip64 end of central directory locator");
    }
    long l = this.b.e().a();
    if (l < 0L) {
      throw new a.a.a.c.a("invalid offset for start of end of central directory record");
    }
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    int i;
    try
    {
      this.a.seek(l);
      j localj = new j();
      arrayOfByte1 = new byte[2];
      arrayOfByte2 = new byte[4];
      arrayOfByte3 = new byte[8];
      a(this.a, arrayOfByte2);
      i = a.a.a.h.b.d(arrayOfByte2, 0);
      if (i != 101075792L) {
        throw new a.a.a.c.a("invalid signature for zip64 end of central directory record");
      }
    }
    catch (IOException localIOException)
    {
      throw new a.a.a.c.a(localIOException);
    }
    l = i;
    localIOException.a(l);
    a(this.a, arrayOfByte3);
    localIOException.b(a.a.a.h.b.a(arrayOfByte3, 0));
    a(this.a, arrayOfByte1);
    localIOException.a(a.a.a.h.b.b(arrayOfByte1, 0));
    a(this.a, arrayOfByte1);
    localIOException.b(a.a.a.h.b.b(arrayOfByte1, 0));
    a(this.a, arrayOfByte2);
    localIOException.c(a.a.a.h.b.d(arrayOfByte2, 0));
    a(this.a, arrayOfByte2);
    localIOException.d(a.a.a.h.b.d(arrayOfByte2, 0));
    a(this.a, arrayOfByte3);
    localIOException.c(a.a.a.h.b.a(arrayOfByte3, 0));
    a(this.a, arrayOfByte3);
    localIOException.d(a.a.a.h.b.a(arrayOfByte3, 0));
    a(this.a, arrayOfByte3);
    localIOException.e(a.a.a.h.b.a(arrayOfByte3, 0));
    a(this.a, arrayOfByte3);
    localIOException.f(a.a.a.h.b.a(arrayOfByte3, 0));
    l = localIOException.a() - 44L;
    if (l > 0L)
    {
      arrayOfByte1 = new byte[(int)l];
      a(this.a, arrayOfByte1);
      localIOException.a(arrayOfByte1);
    }
    return localIOException;
  }
  
  private void d(f paramf)
  {
    if (paramf == null) {
      throw new a.a.a.c.a("file header is null in reading Zip64 Extended Info");
    }
    if ((paramf.p() == null) || (paramf.p().size() <= 0)) {}
    a.a.a.e.a locala;
    do
    {
      return;
      locala = a(paramf.p());
    } while (locala == null);
    paramf.a(locala);
    paramf.i(99);
  }
  
  private void e()
  {
    for (;;)
    {
      long l;
      try
      {
        byte[] arrayOfByte = new byte[4];
        l = this.a.length() - 22L;
        this.a.seek(l);
        if (a.a.a.h.b.a(this.a, arrayOfByte) == 101010256L)
        {
          this.a.seek(this.a.getFilePointer() - 4L - 4L - 8L - 4L - 4L);
          return;
        }
      }
      catch (IOException localIOException)
      {
        throw new a.a.a.c.a(localIOException);
      }
      l -= 1L;
    }
  }
  
  public g a(f paramf)
  {
    if ((paramf == null) || (this.a == null)) {
      throw new a.a.a.c.a("invalid read parameters for local header");
    }
    long l = paramf.i();
    g localg;
    Object localObject1;
    Object localObject2;
    int i;
    label225:
    int j;
    if ((paramf.q() != null) && (paramf.q().c() > 0L))
    {
      l = paramf.i();
      if (l < 0L) {
        throw new a.a.a.c.a("invalid local header offset");
      }
      try
      {
        this.a.seek(l);
        localg = new g();
        localObject1 = new byte[2];
        localObject2 = new byte[4];
        localObject3 = new byte[8];
        a(this.a, (byte[])localObject2);
        i = a.a.a.h.b.d((byte[])localObject2, 0);
        if (i != 67324752L) {
          throw new a.a.a.c.a("invalid local header signature for file: " + paramf.j());
        }
      }
      catch (IOException paramf)
      {
        throw new a.a.a.c.a(paramf);
      }
      localg.a(i);
      a(this.a, (byte[])localObject1);
      localg.b(a.a.a.h.b.b((byte[])localObject1, 0));
      a(this.a, (byte[])localObject1);
      if ((a.a.a.h.b.b((byte[])localObject1, 0) & 0x800) == 0) {
        break label775;
      }
      bool = true;
      localg.c(bool);
      j = localObject1[0];
      if ((j & 0x1) != 0) {
        localg.a(true);
      }
      localg.a((byte[])localObject1);
      Object localObject3 = Integer.toBinaryString(j);
      if (((String)localObject3).length() >= 4) {
        if (((String)localObject3).charAt(3) != '1') {
          break label781;
        }
      }
    }
    label763:
    label775:
    label781:
    for (boolean bool = true;; bool = false)
    {
      localg.b(bool);
      a(this.a, (byte[])localObject1);
      localg.c(a.a.a.h.b.b((byte[])localObject1, 0));
      a(this.a, (byte[])localObject2);
      localg.d(a.a.a.h.b.d((byte[])localObject2, 0));
      a(this.a, (byte[])localObject2);
      localg.a(a.a.a.h.b.d((byte[])localObject2, 0));
      localg.b((byte[])localObject2.clone());
      a(this.a, (byte[])localObject2);
      localg.b(a.a.a.h.b.a(a((byte[])localObject2), 0));
      a(this.a, (byte[])localObject2);
      localg.c(a.a.a.h.b.a(a((byte[])localObject2), 0));
      a(this.a, (byte[])localObject1);
      int m = a.a.a.h.b.b((byte[])localObject1, 0);
      localg.e(m);
      a(this.a, (byte[])localObject1);
      int k = a.a.a.h.b.b((byte[])localObject1, 0);
      localg.f(k);
      i = 30;
      if (m > 0)
      {
        localObject1 = new byte[m];
        a(this.a, (byte[])localObject1);
        localObject2 = a.a.a.h.c.a((byte[])localObject1, localg.m());
        if (localObject2 == null) {
          throw new a.a.a.c.a("file name is null, cannot assign file name to local file header");
        }
        localObject1 = localObject2;
        if (((String)localObject2).indexOf(":" + System.getProperty("file.separator")) >= 0) {
          localObject1 = ((String)localObject2).substring(((String)localObject2).indexOf(":" + System.getProperty("file.separator")) + 2);
        }
        localg.a((String)localObject1);
        i = m + 30;
        a(localg);
        localg.d(l + (i + k));
        localg.a(paramf.n());
        b(localg);
        c(localg);
        if ((localg.h()) && (localg.i() != 99))
        {
          if ((j & 0x40) != 64) {
            break label763;
          }
          localg.g(1);
        }
      }
      for (;;)
      {
        if (localg.b() <= 0L)
        {
          localg.a(paramf.c());
          localg.b(paramf.o());
        }
        if (localg.c() <= 0L) {
          localg.b(paramf.d());
        }
        if (localg.d() > 0L) {
          break label787;
        }
        localg.c(paramf.e());
        return localg;
        localg.a(null);
        break;
        localg.g(0);
      }
      break;
      bool = false;
      break label225;
    }
    label787:
    return localg;
  }
  
  public l a(String paramString)
  {
    this.b = new l();
    this.b.b(paramString);
    this.b.a(a());
    this.b.a(c());
    if (this.b.g())
    {
      this.b.a(d());
      if ((this.b.f() == null) || (this.b.f().b() <= 0)) {
        break label109;
      }
      this.b.a(true);
    }
    for (;;)
    {
      this.b.a(b());
      return this.b;
      label109:
      this.b.a(false);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */