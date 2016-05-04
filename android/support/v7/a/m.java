package android.support.v7.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

class m
  extends CursorAdapter
{
  private final int d;
  private final int e;
  
  m(k paramk, Context paramContext, Cursor paramCursor, boolean paramBoolean, ListView paramListView, e parame)
  {
    super(paramContext, paramCursor, paramBoolean);
    paramk = getCursor();
    this.d = paramk.getColumnIndexOrThrow(this.c.I);
    this.e = paramk.getColumnIndexOrThrow(this.c.J);
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    ((CheckedTextView)paramView.findViewById(16908308)).setText(paramCursor.getString(this.d));
    paramView = this.a;
    int i = paramCursor.getPosition();
    if (paramCursor.getInt(this.e) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      paramView.setItemChecked(i, bool);
      return;
    }
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.c.b.inflate(e.l(this.b), paramViewGroup, false);
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */