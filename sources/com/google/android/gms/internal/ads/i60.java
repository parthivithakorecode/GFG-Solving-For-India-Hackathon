package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0040w;
import p026d1.C2471c;
import p026d1.C2472d;
import p026d1.C2479h;
import p048g2.C2635a;
import p048g2.C2637b;

public final class i60 extends C2479h {

    /* renamed from: a */
    private final h60 f8546a;

    /* renamed from: b */
    private final List<C2472d> f8547b = new ArrayList();

    /* renamed from: c */
    private final o40 f8548c;

    /* renamed from: d */
    private final C0040w f8549d = new C0040w();

    /* renamed from: e */
    private final C2471c f8550e;

    /* renamed from: f */
    private final List<Object> f8551f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[Catch:{ RemoteException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i60(com.google.android.gms.internal.ads.h60 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8547b = r1
            a1.w r1 = new a1.w
            r1.<init>()
            r5.f8549d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8551f = r1
            r5.f8546a = r6
            r1 = 0
            java.util.List r6 = r6.mo5435y()     // Catch:{ RemoteException -> 0x005b }
            if (r6 == 0) goto L_0x005f
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005b }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005b }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005b }
            if (r3 == 0) goto L_0x004d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005b }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.n40     // Catch:{ RemoteException -> 0x005b }
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.n40 r3 = (com.google.android.gms.internal.ads.n40) r3     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x0047:
            com.google.android.gms.internal.ads.l40 r3 = new com.google.android.gms.internal.ads.l40     // Catch:{ RemoteException -> 0x005b }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x0027
            java.util.List<d1.d> r2 = r5.f8547b     // Catch:{ RemoteException -> 0x005b }
            com.google.android.gms.internal.ads.o40 r4 = new com.google.android.gms.internal.ads.o40     // Catch:{ RemoteException -> 0x005b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005b }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0027
        L_0x005b:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x005f:
            com.google.android.gms.internal.ads.h60 r6 = r5.f8546a     // Catch:{ RemoteException -> 0x008e }
            java.util.List r6 = r6.mo5434x()     // Catch:{ RemoteException -> 0x008e }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008e }
        L_0x006b:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008e }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008e }
            if (r3 == 0) goto L_0x0080
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.internal.ads.my r2 = com.google.android.gms.internal.ads.C1942ly.m12978z5(r2)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x006b
            java.util.List<java.lang.Object> r3 = r5.f8551f     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.internal.ads.ny r4 = new com.google.android.gms.internal.ads.ny     // Catch:{ RemoteException -> 0x008e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x0092:
            com.google.android.gms.internal.ads.h60 r6 = r5.f8546a     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.gms.internal.ads.n40 r6 = r6.mo5421j()     // Catch:{ RemoteException -> 0x00a0 }
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.o40 r2 = new com.google.android.gms.internal.ads.o40     // Catch:{ RemoteException -> 0x00a0 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x00a4:
            r2 = r1
        L_0x00a5:
            r5.f8548c = r2
            com.google.android.gms.internal.ads.h60 r6 = r5.f8546a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.g40 r6 = r6.mo5419h()     // Catch:{ RemoteException -> 0x00bc }
            if (r6 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.h40 r6 = new com.google.android.gms.internal.ads.h40     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.h60 r2 = r5.f8546a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.g40 r2 = r2.mo5419h()     // Catch:{ RemoteException -> 0x00bc }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bc }
            r1 = r6
            goto L_0x00c0
        L_0x00bc:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x00c0:
            r5.f8550e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i60.<init>(com.google.android.gms.internal.ads.h60):void");
    }

    /* renamed from: a */
    public final String mo8078a() {
        try {
            return this.f8546a.mo5424m();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo8079b() {
        try {
            return this.f8546a.mo5425n();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo8080c() {
        try {
            return this.f8546a.mo5423l();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo8081d() {
        try {
            return this.f8546a.mo5430r();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2472d mo8082e() {
        return this.f8548c;
    }

    /* renamed from: f */
    public final List<C2472d> mo8083f() {
        return this.f8547b;
    }

    /* renamed from: g */
    public final String mo8084g() {
        try {
            return this.f8546a.mo5427p();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final Double mo8085h() {
        try {
            double b = this.f8546a.mo5413b();
            if (b == -1.0d) {
                return null;
            }
            return Double.valueOf(b);
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo8086i() {
        try {
            return this.f8546a.mo5429q();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C0040w mo8087j() {
        try {
            if (this.f8546a.mo5418f() != null) {
                this.f8549d.mo124c(this.f8546a.mo5418f());
            }
        } catch (RemoteException e) {
            io0.m11129e("Exception occurred while getting video controller", e);
        }
        return this.f8549d;
    }

    /* renamed from: k */
    public final Object mo8088k() {
        try {
            C2635a k = this.f8546a.mo5422k();
            if (k != null) {
                return C2637b.m21357C0(k);
            }
            return null;
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }
}
