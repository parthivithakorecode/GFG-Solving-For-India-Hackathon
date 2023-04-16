package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0034r;
import p002a1.C0039v;
import p104o1.C3821c;

public final class ig0 extends C3821c {

    /* renamed from: a */
    private final h60 f8643a;

    /* renamed from: b */
    private final List<C3821c.C3823b> f8644b = new ArrayList();

    /* renamed from: c */
    private final hg0 f8645c;

    /* renamed from: d */
    private final C3821c.C3822a f8646d;

    /* renamed from: e */
    private final List<Object> f8647e = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097 A[Catch:{ RemoteException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ig0(com.google.android.gms.internal.ads.h60 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8644b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8647e = r1
            r5.f8643a = r6
            r1 = 0
            java.util.List r6 = r6.mo5435y()     // Catch:{ RemoteException -> 0x0043 }
            if (r6 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0043 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0043 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0043 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0043 }
            if (r3 == 0) goto L_0x0035
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.n40 r2 = com.google.android.gms.internal.ads.m40.m13048z5(r2)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0036
        L_0x0035:
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x0020
            java.util.List<o1.c$b> r3 = r5.f8644b     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.hg0 r4 = new com.google.android.gms.internal.ads.hg0     // Catch:{ RemoteException -> 0x0043 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0043 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0020
        L_0x0043:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x0047:
            com.google.android.gms.internal.ads.h60 r6 = r5.f8643a     // Catch:{ RemoteException -> 0x0076 }
            java.util.List r6 = r6.mo5434x()     // Catch:{ RemoteException -> 0x0076 }
            if (r6 == 0) goto L_0x007a
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0076 }
        L_0x0053:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0076 }
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0068
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.internal.ads.my r2 = com.google.android.gms.internal.ads.C1942ly.m12978z5(r2)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0069
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0053
            java.util.List<java.lang.Object> r3 = r5.f8647e     // Catch:{ RemoteException -> 0x0076 }
            com.google.android.gms.internal.ads.ny r4 = new com.google.android.gms.internal.ads.ny     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0076 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0053
        L_0x0076:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x007a:
            com.google.android.gms.internal.ads.h60 r6 = r5.f8643a     // Catch:{ RemoteException -> 0x0088 }
            com.google.android.gms.internal.ads.n40 r6 = r6.mo5421j()     // Catch:{ RemoteException -> 0x0088 }
            if (r6 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.hg0 r2 = new com.google.android.gms.internal.ads.hg0     // Catch:{ RemoteException -> 0x0088 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x008c:
            r2 = r1
        L_0x008d:
            r5.f8645c = r2
            com.google.android.gms.internal.ads.h60 r6 = r5.f8643a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.g40 r6 = r6.mo5419h()     // Catch:{ RemoteException -> 0x00a4 }
            if (r6 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.gg0 r6 = new com.google.android.gms.internal.ads.gg0     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.h60 r2 = r5.f8643a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.g40 r2 = r2.mo5419h()     // Catch:{ RemoteException -> 0x00a4 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00a4 }
            r1 = r6
            goto L_0x00a8
        L_0x00a4:
            r6 = move-exception
            com.google.android.gms.internal.ads.io0.m11129e(r0, r6)
        L_0x00a8:
            r5.f8646d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ig0.<init>(com.google.android.gms.internal.ads.h60):void");
    }

    /* renamed from: a */
    public final C0039v mo8141a() {
        C2461zy zyVar;
        try {
            zyVar = this.f8643a.mo5417e();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            zyVar = null;
        }
        return C0039v.m121d(zyVar);
    }

    /* renamed from: b */
    public final void mo8142b(C0034r rVar) {
        try {
            this.f8643a.mo5410V1(new m00(rVar));
        } catch (RemoteException e) {
            io0.m11129e("Failed to setOnPaidEventListener", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8143c() {
        try {
            return this.f8643a.mo5426o();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }
}
