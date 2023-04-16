package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.a6 */
public abstract class C1506a6<T> implements Comparable<C1506a6<T>> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1951m6 f3972f;

    /* renamed from: g */
    private final int f3973g;

    /* renamed from: h */
    private final String f3974h;

    /* renamed from: i */
    private final int f3975i;

    /* renamed from: j */
    private final Object f3976j;

    /* renamed from: k */
    private final C1654e6 f3977k;

    /* renamed from: l */
    private Integer f3978l;

    /* renamed from: m */
    private C1617d6 f3979m;

    /* renamed from: n */
    private boolean f3980n;

    /* renamed from: o */
    private C1839j5 f3981o;

    /* renamed from: p */
    private C2432z5 f3982p;

    /* renamed from: q */
    private final C2024o5 f3983q;

    public C1506a6(int i, String str, C1654e6 e6Var) {
        Uri parse;
        String host;
        this.f3972f = C1951m6.f10742c ? new C1951m6() : null;
        this.f3976j = new Object();
        int i2 = 0;
        this.f3980n = false;
        this.f3981o = null;
        this.f3973g = i;
        this.f3974h = str;
        this.f3977k = e6Var;
        this.f3983q = new C2024o5();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f3975i = i2;
    }

    /* renamed from: b */
    public final int mo5110b() {
        return this.f3983q.mo9657b();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3978l.intValue() - ((C1506a6) obj).f3978l.intValue();
    }

    /* renamed from: d */
    public final int mo5112d() {
        return this.f3975i;
    }

    /* renamed from: e */
    public final C1839j5 mo5113e() {
        return this.f3981o;
    }

    /* renamed from: f */
    public final C1506a6<?> mo5114f(C1839j5 j5Var) {
        this.f3981o = j5Var;
        return this;
    }

    /* renamed from: g */
    public final C1506a6<?> mo5115g(C1617d6 d6Var) {
        this.f3979m = d6Var;
        return this;
    }

    /* renamed from: h */
    public final C1506a6<?> mo5116h(int i) {
        this.f3978l = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C1729g6<T> mo5117i(C2320w5 w5Var);

    /* renamed from: k */
    public final String mo5118k() {
        String str = this.f3974h;
        if (this.f3973g == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: l */
    public final String mo5119l() {
        return this.f3974h;
    }

    /* renamed from: m */
    public Map<String, String> mo5120m() {
        return Collections.emptyMap();
    }

    /* renamed from: n */
    public final void mo5121n(String str) {
        if (C1951m6.f10742c) {
            this.f3972f.mo9137a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: o */
    public final void mo5122o(C1877k6 k6Var) {
        C1654e6 e6Var;
        synchronized (this.f3976j) {
            e6Var = this.f3977k;
        }
        if (e6Var != null) {
            e6Var.mo6841a(k6Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo5123p(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo5124q(String str) {
        C1617d6 d6Var = this.f3979m;
        if (d6Var != null) {
            d6Var.mo6394b(this);
        }
        if (C1951m6.f10742c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C2395y5(this, str, id));
                return;
            }
            this.f3972f.mo9137a(str, id);
            this.f3972f.mo9138b(toString());
        }
    }

    /* renamed from: r */
    public final void mo5125r() {
        synchronized (this.f3976j) {
            this.f3980n = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo5126s() {
        C2432z5 z5Var;
        synchronized (this.f3976j) {
            z5Var = this.f3982p;
        }
        if (z5Var != null) {
            z5Var.mo9688a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo5127t(C1729g6<?> g6Var) {
        C2432z5 z5Var;
        synchronized (this.f3976j) {
            z5Var = this.f3982p;
        }
        if (z5Var != null) {
            z5Var.mo9689b(this, g6Var);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f3975i));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        mo5132x();
        String str = this.f3974h;
        String valueOf2 = String.valueOf(this.f3978l);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(concat).length() + 6 + valueOf2.length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo5129u(int i) {
        C1617d6 d6Var = this.f3979m;
        if (d6Var != null) {
            d6Var.mo6395c(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo5130v(C2432z5 z5Var) {
        synchronized (this.f3976j) {
            this.f3982p = z5Var;
        }
    }

    /* renamed from: w */
    public final boolean mo5131w() {
        boolean z;
        synchronized (this.f3976j) {
            z = this.f3980n;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean mo5132x() {
        synchronized (this.f3976j) {
        }
        return false;
    }

    /* renamed from: y */
    public byte[] mo5133y() {
        return null;
    }

    /* renamed from: z */
    public final C2024o5 mo5134z() {
        return this.f3983q;
    }

    public final int zza() {
        return this.f3973g;
    }
}
