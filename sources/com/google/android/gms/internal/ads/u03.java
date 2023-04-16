package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import p131s2.C4028h;
import p131s2.C4029i;

public final class u03 {

    /* renamed from: e */
    private static volatile int f15305e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f15306f = 0;

    /* renamed from: a */
    private final Context f15307a;

    /* renamed from: b */
    private final Executor f15308b;

    /* renamed from: c */
    private final C4028h<y23> f15309c;

    /* renamed from: d */
    private final boolean f15310d;

    u03(Context context, Executor executor, C4028h<y23> hVar, boolean z) {
        this.f15307a = context;
        this.f15308b = executor;
        this.f15309c = hVar;
        this.f15310d = z;
    }

    /* renamed from: a */
    public static u03 m17634a(Context context, Executor executor, boolean z) {
        C4029i iVar = new C4029i();
        executor.execute(z ? new s03(context, iVar) : new t03(iVar));
        return new u03(context, executor, iVar.mo15524a(), z);
    }

    /* renamed from: g */
    static void m17635g(int i) {
        f15305e = i;
    }

    /* renamed from: h */
    private final C4028h<Boolean> m17636h(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.f15310d) {
            return this.f15309c.mo15508f(this.f15308b, r03.f13430a);
        }
        C2285v7 F = C2434z7.m20498F();
        F.mo11415r(this.f15307a.getPackageName());
        F.mo11419v(j);
        F.mo11421x(f15305e);
        if (exc != null) {
            F.mo11420w(d53.m7725a(exc));
            F.mo11418u(exc.getClass().getName());
        }
        if (str2 != null) {
            F.mo11416s(str2);
        }
        if (str != null) {
            F.mo11417t(str);
        }
        return this.f15309c.mo15508f(this.f15308b, new q03(F, i));
    }

    /* renamed from: b */
    public final C4028h<Boolean> mo11131b(int i, String str) {
        return m17636h(i, 0, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    /* renamed from: c */
    public final C4028h<Boolean> mo11132c(int i, long j, Exception exc) {
        return m17636h(i, j, exc, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: d */
    public final C4028h<Boolean> mo11133d(int i, long j) {
        return m17636h(i, j, (Exception) null, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: e */
    public final C4028h<Boolean> mo11134e(int i, long j, String str) {
        return m17636h(i, j, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    /* renamed from: f */
    public final C4028h<Boolean> mo11135f(int i, long j, String str, Map<String, String> map) {
        return m17636h(i, j, (Exception) null, str, (Map<String, String>) null, (String) null);
    }
}
