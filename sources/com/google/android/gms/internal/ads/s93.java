package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.Objects;
import javax.annotation.CheckForNull;

abstract class s93<V, X extends Throwable, F, T> extends hb3<V> implements Runnable {
    @CheckForNull

    /* renamed from: m */
    cc3<? extends V> f14338m;
    @CheckForNull

    /* renamed from: n */
    Class<X> f14339n;
    @CheckForNull

    /* renamed from: o */
    F f14340o;

    s93(cc3<? extends V> cc3, Class<X> cls, F f) {
        Objects.requireNonNull(cc3);
        this.f14338m = cc3;
        this.f14339n = cls;
        Objects.requireNonNull(f);
        this.f14340o = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract T mo10264F(F f, X x);

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public abstract void mo10265G(T t);

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: i */
    public final String mo7548i() {
        String str;
        cc3<? extends V> cc3 = this.f14338m;
        Class<X> cls = this.f14339n;
        F f = this.f14340o;
        String i = super.mo7548i();
        if (cc3 != null) {
            String obj = cc3.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls != null && f != null) {
            String obj2 = cls.toString();
            String obj3 = f.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 29 + obj2.length() + obj3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(obj2);
            sb2.append("], fallback=[");
            sb2.append(obj3);
            sb2.append("]");
            return sb2.toString();
        } else if (i != null) {
            return i.length() != 0 ? str.concat(i) : new String(str);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo7551j() {
        mo7553u(this.f14338m);
        this.f14338m = null;
        this.f14339n = null;
        this.f14340o = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.cc3<? extends V> r0 = r10.f14338m
            java.lang.Class<X> r1 = r10.f14339n
            F r2 = r10.f14340o
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = r3
            goto L_0x000d
        L_0x000c:
            r5 = r4
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = r3
            goto L_0x0012
        L_0x0011:
            r6 = r4
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = r4
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00ad
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x00ad
        L_0x0022:
            r3 = 0
            r10.f14338m = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.uc3     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.uc3 r4 = (com.google.android.gms.internal.ads.uc3) r4     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            java.lang.Throwable r4 = r4.mo7544a()     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003a
            java.lang.Object r5 = com.google.android.gms.internal.ads.rb3.m16138p(r0)     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0083
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            r5 = r3
            goto L_0x0083
        L_0x003c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0081
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = " threw "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L_0x0081:
            r4 = r5
            goto L_0x003a
        L_0x0083:
            if (r4 != 0) goto L_0x0089
            r10.mo7554w(r5)
            return
        L_0x0089:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r0 = r10.mo10264F(r2, r4)     // Catch:{ all -> 0x009b }
            r10.f14339n = r3
            r10.f14340o = r3
            r10.mo10265G(r0)
            return
        L_0x009b:
            r0 = move-exception
            r10.mo7555x(r0)     // Catch:{ all -> 0x00a4 }
            r10.f14339n = r3
            r10.f14340o = r3
            return
        L_0x00a4:
            r0 = move-exception
            r10.f14339n = r3
            r10.f14340o = r3
            throw r0
        L_0x00aa:
            r10.mo7556y(r0)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s93.run():void");
    }
}
