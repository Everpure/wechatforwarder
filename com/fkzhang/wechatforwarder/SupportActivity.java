package com.fkzhang.wechatforwarder;

import android.os.Bundle;
import android.support.v7.a.u;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class SupportActivity
  extends u
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968604);
    ((TextView)findViewById(2131492998)).setText(Html.fromHtml(getString(2131099759)));
    paramBundle = (TextView)findViewById(2131493030);
    paramBundle.setText(Html.fromHtml(getString(2131099684)));
    paramBundle.setOnClickListener(new bi(this, this));
    paramBundle = (ListView)findViewById(2131493031);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(getString(2131099789));
    localArrayList.add(getString(2131099672));
    localArrayList.add(getString(2131099794));
    paramBundle.setAdapter(new ArrayAdapter(this, 17367043, 16908308, localArrayList));
    paramBundle.setOnItemLongClickListener(new bj(this, this));
    paramBundle.setOnItemClickListener(new bk(this, this));
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fkzhang/wechatforwarder/SupportActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */