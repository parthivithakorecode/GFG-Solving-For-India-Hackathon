package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.view.menu.C0348n;
import java.util.ArrayList;
import p038f.C2588g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0327e implements C0346m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f921f;

    /* renamed from: g */
    LayoutInflater f922g;

    /* renamed from: h */
    C0330g f923h;

    /* renamed from: i */
    ExpandedMenuView f924i;

    /* renamed from: j */
    int f925j;

    /* renamed from: k */
    int f926k;

    /* renamed from: l */
    int f927l;

    /* renamed from: m */
    private C0346m.C0347a f928m;

    /* renamed from: n */
    C0328a f929n;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0328a extends BaseAdapter {

        /* renamed from: f */
        private int f930f = -1;

        public C0328a() {
            mo1042a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1042a() {
            C0334i v = C0327e.this.f923h.mo1127v();
            if (v != null) {
                ArrayList<C0334i> z = C0327e.this.f923h.mo1131z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.f930f = i;
                        return;
                    }
                }
            }
            this.f930f = -1;
        }

        /* renamed from: b */
        public C0334i getItem(int i) {
            ArrayList<C0334i> z = C0327e.this.f923h.mo1131z();
            int i2 = i + C0327e.this.f925j;
            int i3 = this.f930f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        public int getCount() {
            int size = C0327e.this.f923h.mo1131z().size() - C0327e.this.f925j;
            return this.f930f < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0327e eVar = C0327e.this;
                view = eVar.f922g.inflate(eVar.f927l, viewGroup, false);
            }
            ((C0348n.C0349a) view).mo901e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1042a();
            super.notifyDataSetChanged();
        }
    }

    public C0327e(int i, int i2) {
        this.f927l = i;
        this.f926k = i2;
    }

    public C0327e(Context context, int i) {
        this(i, 0);
        this.f921f = context;
        this.f922g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo1039a() {
        if (this.f929n == null) {
            this.f929n = new C0328a();
        }
        return this.f929n;
    }

    /* renamed from: b */
    public void mo996b(C0330g gVar, boolean z) {
        C0346m.C0347a aVar = this.f928m;
        if (aVar != null) {
            aVar.mo727b(gVar, z);
        }
    }

    /* renamed from: c */
    public C0348n mo1040c(ViewGroup viewGroup) {
        if (this.f924i == null) {
            this.f924i = (ExpandedMenuView) this.f922g.inflate(C2588g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f929n == null) {
                this.f929n = new C0328a();
            }
            this.f924i.setAdapter(this.f929n);
            this.f924i.setOnItemClickListener(this);
        }
        return this.f924i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo998d(android.content.Context r3, androidx.appcompat.view.menu.C0330g r4) {
        /*
            r2 = this;
            int r0 = r2.f926k
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f926k
            r0.<init>(r3, r1)
            r2.f921f = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f922g = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f921f
            if (r0 == 0) goto L_0x0023
            r2.f921f = r3
            android.view.LayoutInflater r0 = r2.f922g
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f923h = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f929n
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0327e.mo998d(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: e */
    public boolean mo999e(C0355r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0333h(rVar).mo1133d((IBinder) null);
        C0346m.C0347a aVar = this.f928m;
        if (aVar == null) {
            return true;
        }
        aVar.mo728c(rVar);
        return true;
    }

    /* renamed from: f */
    public void mo1000f(boolean z) {
        C0328a aVar = this.f929n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: h */
    public boolean mo1020h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo1002i(C0330g gVar, C0334i iVar) {
        return false;
    }

    /* renamed from: j */
    public boolean mo1003j(C0330g gVar, C0334i iVar) {
        return false;
    }

    /* renamed from: k */
    public void mo1004k(C0346m.C0347a aVar) {
        this.f928m = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f923h.mo1069M(this.f929n.getItem(i), this, 0);
    }
}
