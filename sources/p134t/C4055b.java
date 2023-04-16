package p134t;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: t.b */
class C4055b extends Filter {

    /* renamed from: a */
    C4056a f22256a;

    /* renamed from: t.b$a */
    interface C4056a {
        /* renamed from: a */
        void mo2340a(Cursor cursor);

        /* renamed from: b */
        Cursor mo15542b();

        /* renamed from: c */
        CharSequence mo2341c(Cursor cursor);

        /* renamed from: e */
        Cursor mo2342e(CharSequence charSequence);
    }

    C4055b(C4056a aVar) {
        this.f22256a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f22256a.mo2341c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor e = this.f22256a.mo2342e(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (e != null) {
            filterResults.count = e.getCount();
        } else {
            filterResults.count = 0;
            e = null;
        }
        filterResults.values = e;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f22256a.mo15542b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f22256a.mo2340a((Cursor) obj);
        }
    }
}
