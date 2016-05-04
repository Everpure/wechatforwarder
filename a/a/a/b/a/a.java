package a.a.a.b.a;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class a
  implements d
{
  protected Mac a;
  protected int b;
  protected String c;
  
  public a(String paramString)
  {
    this.c = paramString;
    try
    {
      this.a = Mac.getInstance(paramString);
      this.b = this.a.getMacLength();
      return;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.a.update(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IllegalStateException paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
  
  public byte[] a()
  {
    return this.a.doFinal();
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return this.a.doFinal(paramArrayOfByte);
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    try
    {
      this.a.init(new SecretKeySpec(paramArrayOfByte, this.c));
      return;
    }
    catch (InvalidKeyException paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/a/a/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */