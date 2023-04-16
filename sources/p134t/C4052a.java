package p134t;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p134t.C4055b;

/* renamed from: t.a */
public abstract class C4052a extends BaseAdapter implements Filterable, C4055b.C4056a {

    /* renamed from: f */
    protected boolean f22246f;

    /* renamed from: g */
    protected boolean f22247g;

    /* renamed from: h */
    protected Cursor f22248h;

    /* renamed from: i */
    protected Context f22249i;

    /* renamed from: j */
    protected int f22250j;

    /* renamed from: k */
    protected C4053a f22251k;

    /* renamed from: l */
    protected DataSetObserver f22252l;

    /* renamed from: m */
    protected C4055b f22253m;

    /* renamed from: t.a$a */
    private class C4053a extends ContentObserver {
        C4053a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C4052a.this.mo15549s();
        }
    }

    /* renamed from: t.a$b */
    private class C4054b extends DataSetObserver {
        C4054b() {
        }

        public void onChanged() {
            C4052a aVar = C4052a.this;
            aVar.f22246f = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C4052a aVar = C4052a.this;
            aVar.f22246f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C4052a(Context context, Cursor cursor, boolean z) {
        mo15547p(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo2340a(Cursor cursor) {
        Cursor t = mo15550t(cursor);
        if (t != null) {
            t.close();
        }
    }

    /* renamed from: b */
    public Cursor mo15542b() {
        return this.f22248h;
    }

    /* renamed from: c */
    public abstract CharSequence mo2341c(Cursor cursor);

    /* renamed from: g */
    public abstract void mo2343g(View view, Context context, Cursor cursor);

    public int getCount() {
        Cursor cursor;
        if (!this.f22246f || (cursor = this.f22248h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f22246f) {
            return null;
        }
        this.f22248h.moveToPosition(i);
        if (view == null) {
            view = mo15548q(this.f22249i, this.f22248h, viewGroup);
        }
        mo2343g(view, this.f22249i, this.f22248h);
        return view;
    }

    public Filter getFilter() {
        if (this.f22253m == null) {
            this.f22253m = new C4055b(this);
        }
        return this.f22253m;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f22246f || (cursor = this.f22248h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f22248h;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f22246f || (cursor = this.f22248h) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f22248h.getLong(this.f22250j);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f22246f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f22248h.moveToPosition(i)) {
            if (view == null) {
                view = mo2350r(this.f22249i, this.f22248h, viewGroup);
            }
            mo2343g(view, this.f22249i, this.f22248h);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo15547p(Context context, Cursor cursor, int i) {
        C4054b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f22247g = true;
        } else {
            this.f22247g = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f22248h = cursor;
        this.f22246f = z;
        this.f22249i = context;
        this.f22250j = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f22251k = new C4053a();
            bVar = new C4054b();
        } else {
            bVar = null;
            this.f22251k = null;
        }
        this.f22252l = bVar;
        if (z) {
            C4053a aVar = this.f22251k;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f22252l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: q */
    public abstract View mo15548q(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: r */
    public abstract View mo2350r(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo15549s() {
        Cursor cursor;
        if (this.f22247g && (cursor = this.f22248h) != null && !cursor.isClosed()) {
            this.f22246f = this.f22248h.requery();
        }
    }

    /* renamed from: t */
    public Cursor mo15550t(Cursor cursor) {
        Cursor cursor2 = this.f22248h;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C4053a aVar = this.f22251k;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f22252l;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22248h = cursor;
        if (cursor != null) {
            C4053a aVar2 = this.f22251k;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f22252l;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f22250j = cursor.getColumnIndexOrThrow("_id");
            this.f22246f = true;
            notifyDataSetChanged();
        } else {
            this.f22250j = -1;
            this.f22246f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
