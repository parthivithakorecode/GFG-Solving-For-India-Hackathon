package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class ll3 extends c10 {

    /* renamed from: p */
    public static final my3<ll3> f10081p = kk3.f9552a;

    /* renamed from: i */
    public final int f10082i;

    /* renamed from: j */
    public final String f10083j;

    /* renamed from: k */
    public final int f10084k;

    /* renamed from: l */
    public final C1574c0 f10085l;

    /* renamed from: m */
    public final int f10086m;

    /* renamed from: n */
    public final C1754gv f10087n;

    /* renamed from: o */
    final boolean f10088o;

    private ll3(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C1574c0) null, 4, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ll3(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.C1574c0 r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x0052
            r0 = 1
            if (r4 == r0) goto L_0x000d
            java.lang.String r0 = "Unexpected runtime error"
            r6 = r18
            r7 = r19
            goto L_0x0058
        L_0x000d:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.google.android.gms.internal.ads.nz3.m14197e(r21)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            int r3 = r0.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r3 = r1.length()
            int r2 = r2 + r3
            r5.<init>(r2)
            r6 = r18
            r5.append(r6)
            java.lang.String r2 = " error, index="
            r5.append(r2)
            r7 = r19
            r5.append(r7)
            java.lang.String r2 = ", format="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ", format_supported="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            goto L_0x0058
        L_0x0052:
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L_0x0058:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L_0x0065:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ll3.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.c0, int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ll3(String str, Throwable th, int i, int i2, String str2, int i3, C1574c0 c0Var, int i4, C1754gv gvVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        boolean z3 = z;
        boolean z4 = false;
        int i5 = i2;
        if (!z3) {
            z2 = true;
        } else if (i5 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        wu1.m19205d(z2);
        wu1.m19205d(th != null ? true : z4);
        this.f10082i = i5;
        this.f10083j = str2;
        this.f10084k = i3;
        this.f10085l = c0Var;
        this.f10086m = i4;
        this.f10087n = gvVar;
        this.f10088o = z3;
    }

    /* renamed from: b */
    public static ll3 m12785b(Throwable th, String str, int i, C1574c0 c0Var, int i2, boolean z, int i3) {
        return new ll3(1, th, (String) null, i3, str, i, c0Var, c0Var == null ? 4 : i2, z);
    }

    /* renamed from: c */
    public static ll3 m12786c(IOException iOException, int i) {
        return new ll3(0, iOException, i);
    }

    /* renamed from: d */
    public static ll3 m12787d(RuntimeException runtimeException, int i) {
        return new ll3(2, runtimeException, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ll3 mo8972a(C1754gv gvVar) {
        String message = getMessage();
        int i = n13.f11236a;
        return new ll3(message, getCause(), this.f5265f, this.f10082i, this.f10083j, this.f10084k, this.f10085l, this.f10086m, gvVar, this.f5266g, this.f10088o);
    }
}
