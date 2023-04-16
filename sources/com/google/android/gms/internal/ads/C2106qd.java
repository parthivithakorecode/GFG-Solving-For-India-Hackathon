package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.qd */
public abstract class C2106qd implements Callable {

    /* renamed from: a */
    protected final String f13129a = getClass().getSimpleName();

    /* renamed from: b */
    protected final C1735gc f13130b;

    /* renamed from: c */
    protected final String f13131c;

    /* renamed from: d */
    protected final String f13132d;

    /* renamed from: e */
    protected final C1842j8 f13133e;

    /* renamed from: f */
    protected Method f13134f;

    /* renamed from: g */
    protected final int f13135g;

    /* renamed from: h */
    protected final int f13136h;

    public C2106qd(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        this.f13130b = gcVar;
        this.f13131c = str;
        this.f13132d = str2;
        this.f13133e = j8Var;
        this.f13135g = i;
        this.f13136h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5238a();

    /* renamed from: b */
    public Void mo10271b() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method j = this.f13130b.mo7574j(this.f13131c, this.f13132d);
            this.f13134f = j;
            if (j == null) {
                return null;
            }
            mo5238a();
            C1548bb d = this.f13130b.mo7569d();
            if (!(d == null || (i = this.f13135g) == Integer.MIN_VALUE)) {
                d.mo5760c(this.f13136h, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object call() {
        mo10271b();
        return null;
    }
}
