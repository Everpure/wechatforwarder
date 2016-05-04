package com.fkzhang.wechatforwarder;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.fkzhang.wechatforwarder.e.d;

class ar
  implements TextWatcher
{
  ar(MainActivity paramMainActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = paramEditable.toString();
    if (!TextUtils.isEmpty(paramEditable)) {
      MainActivity.a(this.a).b("watermark_text_size", Integer.parseInt(paramEditable));
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */