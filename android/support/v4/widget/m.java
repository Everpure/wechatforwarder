package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class m
  extends BaseAdapter
  implements r, Filterable
{
  protected boolean a;
  protected boolean b;
  protected Cursor c;
  protected Context d;
  protected int e;
  protected o f;
  protected DataSetObserver g;
  protected q h;
  protected FilterQueryProvider i;
  
  public m(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int j = 1;; j = 2)
    {
      a(paramContext, paramCursor, j);
      return;
    }
  }
  
  public Cursor a()
  {
    return this.c;
  }
  
  public Cursor a(CharSequence paramCharSequence)
  {
    if (this.i != null) {
      return this.i.runQuery(paramCharSequence);
    }
    return this.c;
  }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  void a(Context paramContext, Cursor paramCursor, int paramInt)
  {
    boolean bool = true;
    label23:
    int j;
    if ((paramInt & 0x1) == 1)
    {
      paramInt |= 0x2;
      this.b = true;
      if (paramCursor == null) {
        break label140;
      }
      this.c = paramCursor;
      this.a = bool;
      this.d = paramContext;
      if (!bool) {
        break label146;
      }
      j = paramCursor.getColumnIndexOrThrow("_id");
      label54:
      this.e = j;
      if ((paramInt & 0x2) != 2) {
        break label152;
      }
      this.f = new o(this);
    }
    for (this.g = new p(this, null);; this.g = null)
    {
      if (bool)
      {
        if (this.f != null) {
          paramCursor.registerContentObserver(this.f);
        }
        if (this.g != null) {
          paramCursor.registerDataSetObserver(this.g);
        }
      }
      return;
      this.b = false;
      break;
      label140:
      bool = false;
      break label23;
      label146:
      j = -1;
      break label54;
      label152:
      this.f = null;
    }
  }
  
  public void a(Cursor paramCursor)
  {
    paramCursor = b(paramCursor);
    if (paramCursor != null) {
      paramCursor.close();
    }
  }
  
  public abstract void a(View paramView, Context paramContext, Cursor paramCursor);
  
  public Cursor b(Cursor paramCursor)
  {
    if (paramCursor == this.c) {
      return null;
    }
    Cursor localCursor = this.c;
    if (localCursor != null)
    {
      if (this.f != null) {
        localCursor.unregisterContentObserver(this.f);
      }
      if (this.g != null) {
        localCursor.unregisterDataSetObserver(this.g);
      }
    }
    this.c = paramCursor;
    if (paramCursor != null)
    {
      if (this.f != null) {
        paramCursor.registerContentObserver(this.f);
      }
      if (this.g != null) {
        paramCursor.registerDataSetObserver(this.g);
      }
      this.e = paramCursor.getColumnIndexOrThrow("_id");
      this.a = true;
      notifyDataSetChanged();
      return localCursor;
    }
    this.e = -1;
    this.a = false;
    notifyDataSetInvalidated();
    return localCursor;
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramCursor, paramViewGroup);
  }
  
  protected void b()
  {
    if ((this.b) && (this.c != null) && (!this.c.isClosed())) {
      this.a = this.c.requery();
    }
  }
  
  public CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return "";
    }
    return paramCursor.toString();
  }
  
  public int getCount()
  {
    if ((this.a) && (this.c != null)) {
      return this.c.getCount();
    }
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a)
    {
      this.c.moveToPosition(paramInt);
      View localView = paramView;
      if (paramView == null) {
        localView = b(this.d, this.c, paramViewGroup);
      }
      a(localView, this.d, this.c);
      return localView;
    }
    return null;
  }
  
  public Filter getFilter()
  {
    if (this.h == null) {
      this.h = new q(this);
    }
    return this.h;
  }
  
  public Object getItem(int paramInt)
  {
    if ((this.a) && (this.c != null))
    {
      this.c.moveToPosition(paramInt);
      return this.c;
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    long l2 = 0L;
    long l1 = l2;
    if (this.a)
    {
      l1 = l2;
      if (this.c != null)
      {
        l1 = l2;
        if (this.c.moveToPosition(paramInt)) {
          l1 = this.c.getLong(this.e);
        }
      }
    }
    return l1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    if (!this.c.moveToPosition(paramInt)) {
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    }
    View localView = paramView;
    if (paramView == null) {
      localView = a(this.d, this.c, paramViewGroup);
    }
    a(localView, this.d, this.c);
    return localView;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              /Users/sunkuo/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */