package com.fkzhang.wechatforwarder;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.fkzhang.wechatforwarder.e.d;

class ay
  implements TextWatcher
{
  ay(MainActivity paramMainActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (TextUtils.isEmpty(paramEditable)) {
      return;
    }
    int i = (int)(Double.parseDouble(paramEditable.toString()) * 1000.0D);
    MainActivity.a(this.a).b("voice_duration", i);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */