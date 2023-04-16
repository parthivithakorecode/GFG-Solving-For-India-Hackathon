package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0346m;
import androidx.core.view.C0782e;
import androidx.core.view.C0833y;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0343l {

    /* renamed from: a */
    private final Context f1013a;

    /* renamed from: b */
    private final C0330g f1014b;

    /* renamed from: c */
    private final boolean f1015c;

    /* renamed from: d */
    private final int f1016d;

    /* renamed from: e */
    private final int f1017e;

    /* renamed from: f */
    private View f1018f;

    /* renamed from: g */
    private int f1019g;

    /* renamed from: h */
    private boolean f1020h;

    /* renamed from: i */
    private C0346m.C0347a f1021i;

    /* renamed from: j */
    private C0342k f1022j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1023k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1024l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0344a implements PopupWindow.OnDismissListener {
        C0344a() {
        }

        public void onDismiss() {
            C0343l.this.mo1270e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    static class C0345b {
        /* renamed from: a */
        static void m1369a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0343l(Context context, C0330g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0343l(Context context, C0330g gVar, View view, boolean z, int i, int i2) {
        this.f1019g = 8388611;
        this.f1024l = new C0344a();
        this.f1013a = context;
        this.f1014b = gVar;
        this.f1018f = view;
        this.f1015c = z;
        this.f1016d = i;
        this.f1017e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0342k m1355a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1013a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            androidx.appcompat.view.menu.C0343l.C0345b.m1369a(r0, r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1013a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p038f.C2585d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1013a
            android.view.View r3 = r14.f1018f
            int r4 = r14.f1016d
            int r5 = r14.f1017e
            boolean r6 = r14.f1015c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f1013a
            androidx.appcompat.view.menu.g r9 = r14.f1014b
            android.view.View r10 = r14.f1018f
            int r11 = r14.f1016d
            int r12 = r14.f1017e
            boolean r13 = r14.f1015c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f1014b
            r0.mo1021l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1024l
            r0.mo1029u(r1)
            android.view.View r1 = r14.f1018f
            r0.mo1025p(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f1021i
            r0.mo1004k(r1)
            boolean r1 = r14.f1020h
            r0.mo1026r(r1)
            int r1 = r14.f1019g
            r0.mo1027s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0343l.m1355a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m1356l(int i, int i2, boolean z, boolean z2) {
        C0342k c = mo1268c();
        c.mo1030v(z2);
        if (z) {
            if ((C0782e.m3108a(this.f1019g, C0833y.m3362r(this.f1018f)) & 7) == 5) {
                i -= this.f1018f.getWidth();
            }
            c.mo1028t(i);
            c.mo1031w(i2);
            int i3 = (int) ((this.f1013a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1266q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo1016a();
    }

    /* renamed from: b */
    public void mo1267b() {
        if (mo1269d()) {
            this.f1022j.dismiss();
        }
    }

    /* renamed from: c */
    public C0342k mo1268c() {
        if (this.f1022j == null) {
            this.f1022j = m1355a();
        }
        return this.f1022j;
    }

    /* renamed from: d */
    public boolean mo1269d() {
        C0342k kVar = this.f1022j;
        return kVar != null && kVar.mo1017c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1270e() {
        this.f1022j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1023k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1271f(View view) {
        this.f1018f = view;
    }

    /* renamed from: g */
    public void mo1272g(boolean z) {
        this.f1020h = z;
        C0342k kVar = this.f1022j;
        if (kVar != null) {
            kVar.mo1026r(z);
        }
    }

    /* renamed from: h */
    public void mo1273h(int i) {
        this.f1019g = i;
    }

    /* renamed from: i */
    public void mo1274i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1023k = onDismissListener;
    }

    /* renamed from: j */
    public void mo1275j(C0346m.C0347a aVar) {
        this.f1021i = aVar;
        C0342k kVar = this.f1022j;
        if (kVar != null) {
            kVar.mo1004k(aVar);
        }
    }

    /* renamed from: k */
    public void mo1276k() {
        if (!mo1277m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo1277m() {
        if (mo1269d()) {
            return true;
        }
        if (this.f1018f == null) {
            return false;
        }
        m1356l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo1278n(int i, int i2) {
        if (mo1269d()) {
            return true;
        }
        if (this.f1018f == null) {
            return false;
        }
        m1356l(i, i2, true, true);
        return true;
    }
}
