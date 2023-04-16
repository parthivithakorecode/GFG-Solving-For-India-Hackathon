package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p033e1.C2538a;
import p131s2.C4028h;
import p131s2.C4031k;

public final class o13 {

    /* renamed from: a */
    private final Context f11814a;

    /* renamed from: b */
    private final Executor f11815b;

    /* renamed from: c */
    private final u03 f11816c;

    /* renamed from: d */
    private final w03 f11817d;

    /* renamed from: e */
    private final m13 f11818e;

    /* renamed from: f */
    private final m13 f11819f;

    /* renamed from: g */
    private C4028h<C1509a9> f11820g;

    /* renamed from: h */
    private C4028h<C1509a9> f11821h;

    o13(Context context, Executor executor, u03 u03, w03 w03, k13 k13, l13 l13) {
        this.f11814a = context;
        this.f11815b = executor;
        this.f11816c = u03;
        this.f11817d = w03;
        this.f11818e = k13;
        this.f11819f = l13;
    }

    /* renamed from: e */
    public static o13 m14210e(Context context, Executor executor, u03 u03, w03 w03) {
        o13 o13 = new o13(context, executor, u03, w03, new k13(), new l13());
        o13.f11820g = o13.f11817d.mo5063d() ? o13.m14212h(new i13(o13)) : C4031k.m26351c(o13.f11818e.zza());
        o13.f11821h = o13.m14212h(new j13(o13));
        return o13;
    }

    /* renamed from: g */
    private static C1509a9 m14211g(C4028h<C1509a9> hVar, C1509a9 a9Var) {
        return !hVar.mo15515m() ? a9Var : hVar.mo15512j();
    }

    /* renamed from: h */
    private final C4028h<C1509a9> m14212h(Callable<C1509a9> callable) {
        return C4031k.m26349a(this.f11815b, callable).mo15506d(this.f11815b, new h13(this));
    }

    /* renamed from: a */
    public final C1509a9 mo9626a() {
        return m14211g(this.f11820g, this.f11818e.zza());
    }

    /* renamed from: b */
    public final C1509a9 mo9627b() {
        return m14211g(this.f11821h, this.f11819f.zza());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C1509a9 mo9628c() {
        Context context = this.f11814a;
        C1842j8 f0 = C1509a9.m5946f0();
        C2538a.C2539a b = C2538a.m21156b(context);
        String a = b.mo12454a();
        if (a != null && a.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a = Base64.encodeToString(bArr, 11);
        }
        if (a != null) {
            f0.mo8401i0(a);
            f0.mo8400h0(b.mo12455b());
            f0.mo8380N(6);
        }
        return (C1509a9) f0.mo11894o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C1509a9 mo9629d() {
        Context context = this.f11814a;
        return c13.m7185a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo9630f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f11816c.mo11132c(2025, -1, exc);
    }
}
