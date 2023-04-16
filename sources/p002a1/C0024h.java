package p002a1;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C2087pv;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.io0;

/* renamed from: a1.h */
public final class C0024h {
    @RecentlyNonNull

    /* renamed from: i */
    public static final C0024h f25i = new C0024h(320, 50, "320x50_mb");
    @RecentlyNonNull

    /* renamed from: j */
    public static final C0024h f26j = new C0024h(468, 60, "468x60_as");
    @RecentlyNonNull

    /* renamed from: k */
    public static final C0024h f27k = new C0024h(320, 100, "320x100_as");
    @RecentlyNonNull

    /* renamed from: l */
    public static final C0024h f28l = new C0024h(728, 90, "728x90_as");
    @RecentlyNonNull

    /* renamed from: m */
    public static final C0024h f29m = new C0024h(300, 250, "300x250_as");
    @RecentlyNonNull

    /* renamed from: n */
    public static final C0024h f30n = new C0024h(160, 600, "160x600_as");
    @RecentlyNonNull
    @Deprecated

    /* renamed from: o */
    public static final C0024h f31o = new C0024h(-1, -2, "smart_banner");
    @RecentlyNonNull

    /* renamed from: p */
    public static final C0024h f32p = new C0024h(-3, -4, "fluid");
    @RecentlyNonNull

    /* renamed from: q */
    public static final C0024h f33q = new C0024h(0, 0, "invalid");
    @RecentlyNonNull

    /* renamed from: r */
    public static final C0024h f34r = new C0024h(-3, 0, "search_v2");
    @RecentlyNonNull

    /* renamed from: s */
    public static final C0024h f35s = new C0024h(50, 50, "50x50_mb");

    /* renamed from: a */
    private final int f36a;

    /* renamed from: b */
    private final int f37b;

    /* renamed from: c */
    private final String f38c;

    /* renamed from: d */
    private boolean f39d;

    /* renamed from: e */
    private boolean f40e;

    /* renamed from: f */
    private int f41f;

    /* renamed from: g */
    private boolean f42g;

    /* renamed from: h */
    private int f43h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0024h(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        L_0x000a:
            r1 = -2
            if (r7 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0024h.<init>(int, int):void");
    }

    C0024h(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f36a = i;
            this.f37b = i2;
            this.f38c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C0024h m56a(@RecentlyNonNull Context context, int i) {
        C0024h c = bo0.m6982c(context, i, 50, 0);
        c.f39d = true;
        return c;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C0024h m57b(@RecentlyNonNull Context context, int i) {
        int a = bo0.m6981a(context, 0);
        if (a == -1) {
            return f33q;
        }
        C0024h hVar = new C0024h(i, 0);
        hVar.f41f = a;
        hVar.f40e = true;
        return hVar;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static C0024h m58e(int i, int i2) {
        C0024h hVar = new C0024h(i, 0);
        hVar.f41f = i2;
        hVar.f40e = true;
        if (i2 < 32) {
            StringBuilder sb = new StringBuilder(129);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i2);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            io0.m11131g(sb.toString());
        }
        return hVar;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static C0024h m59f(@RecentlyNonNull Context context, int i) {
        C0024h c = bo0.m6982c(context, i, 50, 2);
        c.f39d = true;
        return c;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public static C0024h m60g(@RecentlyNonNull Context context, int i) {
        int a = bo0.m6981a(context, 2);
        C0024h hVar = new C0024h(i, 0);
        if (a == -1) {
            return f33q;
        }
        hVar.f41f = a;
        hVar.f40e = true;
        return hVar;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public static C0024h m61h(@RecentlyNonNull Context context, int i) {
        C0024h c = bo0.m6982c(context, i, 50, 1);
        c.f39d = true;
        return c;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public static C0024h m62i(@RecentlyNonNull Context context, int i) {
        int a = bo0.m6981a(context, 1);
        C0024h hVar = new C0024h(i, 0);
        if (a == -1) {
            return f33q;
        }
        hVar.f41f = a;
        hVar.f40e = true;
        return hVar;
    }

    /* renamed from: c */
    public int mo56c() {
        return this.f37b;
    }

    /* renamed from: d */
    public int mo57d(@RecentlyNonNull Context context) {
        int i = this.f37b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return C2087pv.m15285c(context.getResources().getDisplayMetrics());
        }
        C2125qw.m15897b();
        return bo0.m6995s(context, this.f37b);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0024h)) {
            return false;
        }
        C0024h hVar = (C0024h) obj;
        return this.f36a == hVar.f36a && this.f37b == hVar.f37b && this.f38c.equals(hVar.f38c);
    }

    public int hashCode() {
        return this.f38c.hashCode();
    }

    /* renamed from: j */
    public int mo60j() {
        return this.f36a;
    }

    /* renamed from: k */
    public int mo61k(@RecentlyNonNull Context context) {
        int i = this.f36a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            C2125qw.m15897b();
            return bo0.m6995s(context, this.f36a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<C2087pv> creator = C2087pv.CREATOR;
        return displayMetrics.widthPixels;
    }

    /* renamed from: l */
    public boolean mo62l() {
        return this.f36a == -3 && this.f37b == -4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final int mo63m() {
        return this.f43h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo64n() {
        return this.f41f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo65o(int i) {
        this.f41f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo66p(int i) {
        this.f43h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo67q(boolean z) {
        this.f40e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo68r(boolean z) {
        this.f42g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo69s() {
        return this.f39d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo70t() {
        return this.f40e;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f38c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo72u() {
        return this.f42g;
    }
}
