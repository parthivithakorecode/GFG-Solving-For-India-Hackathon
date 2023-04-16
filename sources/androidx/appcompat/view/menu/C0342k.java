package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0342k implements C0351p, C0346m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f1012f;

    C0342k() {
    }

    /* renamed from: o */
    protected static int m1338o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: x */
    protected static boolean m1339x(C0330g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    protected static C0329f m1340y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0329f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0329f) listAdapter;
    }

    /* renamed from: d */
    public void mo998d(Context context, C0330g gVar) {
    }

    /* renamed from: i */
    public boolean mo1002i(C0330g gVar, C0334i iVar) {
        return false;
    }

    /* renamed from: j */
    public boolean mo1003j(C0330g gVar, C0334i iVar) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo1021l(C0330g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo1022m() {
        return true;
    }

    /* renamed from: n */
    public Rect mo1264n() {
        return this.f1012f;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1340y(listAdapter).f932f.mo1069M((MenuItem) listAdapter.getItem(i), this, mo1022m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo1025p(View view);

    /* renamed from: q */
    public void mo1266q(Rect rect) {
        this.f1012f = rect;
    }

    /* renamed from: r */
    public abstract void mo1026r(boolean z);

    /* renamed from: s */
    public abstract void mo1027s(int i);

    /* renamed from: t */
    public abstract void mo1028t(int i);

    /* renamed from: u */
    public abstract void mo1029u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo1030v(boolean z);

    /* renamed from: w */
    public abstract void mo1031w(int i);
}
