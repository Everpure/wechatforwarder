package com.fkzhang.wechatforwarder;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.fkzhang.wechatforwarder.e.d;

class bb
  implements TextWatcher
{
  bb(MainActivity paramMainActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (TextUtils.isEmpty(paramEditable.toString())) {
      return;
    }
    int i = Integer.parseInt(paramEditable.toString());
    MainActivity.a(this.a).b("voice_length", i * 1000);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */