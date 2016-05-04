package com.fkzhang.wechatforwarder;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.fkzhang.wechatforwarder.e.d;

class h
  implements TextWatcher
{
  h(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (TextUtils.isEmpty(paramEditable.toString())) {}
    for (int i = 0;; i = (int)Double.parseDouble(paramEditable.toString()) * 1000)
    {
      AutoForwardActivity.c(this.a).b(this.a.j() + "_resend_delay", i);
      return;
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */