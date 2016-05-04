package com.fkzhang.wechatforwarder;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.fkzhang.wechatforwarder.e.d;

class g
  implements TextWatcher
{
  g(AutoForwardActivity paramAutoForwardActivity) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    paramEditable = paramEditable.toString();
    if (TextUtils.isEmpty(paramEditable)) {}
    for (int i = 1;; i = Integer.parseInt(paramEditable))
    {
      AutoForwardActivity.c(this.a).b(this.a.j() + "_resend_max", i);
      return;
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */