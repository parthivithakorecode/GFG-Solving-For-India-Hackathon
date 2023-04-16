package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.kn */
public final class C1894kn {

    /* renamed from: a */
    private final C1857jn f9562a;

    /* renamed from: b */
    private final boolean f9563b;

    /* renamed from: c */
    private final long f9564c;

    /* renamed from: d */
    private final long f9565d;

    /* renamed from: e */
    private long f9566e;

    /* renamed from: f */
    private long f9567f;

    /* renamed from: g */
    private long f9568g;

    /* renamed from: h */
    private boolean f9569h;

    /* renamed from: i */
    private long f9570i;

    /* renamed from: j */
    private long f9571j;

    /* renamed from: k */
    private long f9572k;

    private C1894kn(double d) {
        long j;
        boolean z = d != -1.0d;
        this.f9563b = z;
        if (z) {
            this.f9562a = C1857jn.m11740a();
            long j2 = (long) (1.0E9d / d);
            this.f9564c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.f9562a = null;
            j = -1;
            this.f9564c = -1;
        }
        this.f9565d = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1894kn(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1894kn.<init>(android.content.Context):void");
    }

    /* renamed from: d */
    private final boolean m12252d(long j, long j2) {
        return Math.abs((j2 - this.f9570i) - (j - this.f9571j)) > 20000000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (m12252d(r0, r14) != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo8696a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f9569h
            if (r2 == 0) goto L_0x0040
            long r2 = r11.f9566e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            long r2 = r11.f9572k
            r4 = 1
            long r2 = r2 + r4
            r11.f9572k = r2
            long r2 = r11.f9568g
            r11.f9567f = r2
        L_0x0018:
            long r2 = r11.f9572k
            r4 = 6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L_0x0039
            long r6 = r11.f9571j
            long r6 = r0 - r6
            long r6 = r6 / r2
            long r2 = r11.f9567f
            long r2 = r2 + r6
            boolean r4 = r11.m12252d(r2, r14)
            if (r4 == 0) goto L_0x0032
        L_0x002f:
            r11.f9569h = r5
            goto L_0x0040
        L_0x0032:
            long r4 = r11.f9570i
            long r4 = r4 + r2
            long r6 = r11.f9571j
            long r4 = r4 - r6
            goto L_0x0042
        L_0x0039:
            boolean r2 = r11.m12252d(r0, r14)
            if (r2 == 0) goto L_0x0040
            goto L_0x002f
        L_0x0040:
            r4 = r14
            r2 = r0
        L_0x0042:
            boolean r6 = r11.f9569h
            r7 = 0
            if (r6 != 0) goto L_0x0051
            r11.f9571j = r0
            r11.f9570i = r14
            r11.f9572k = r7
            r14 = 1
            r11.f9569h = r14
        L_0x0051:
            r11.f9566e = r12
            r11.f9568g = r2
            com.google.android.gms.internal.ads.jn r12 = r11.f9562a
            if (r12 == 0) goto L_0x0083
            long r12 = r12.f9198f
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            com.google.android.gms.internal.ads.jn r12 = r11.f9562a
            long r12 = r12.f9198f
            long r14 = r11.f9564c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
            long r14 = r12 - r14
            goto L_0x0076
        L_0x0072:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x0076:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r12 = r14
        L_0x007f:
            long r14 = r11.f9565d
            long r12 = r12 - r14
            return r12
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1894kn.mo8696a(long, long):long");
    }

    /* renamed from: b */
    public final void mo8697b() {
        if (this.f9563b) {
            this.f9562a.mo8497c();
        }
    }

    /* renamed from: c */
    public final void mo8698c() {
        this.f9569h = false;
        if (this.f9563b) {
            this.f9562a.mo8496b();
        }
    }
}
