package com.google.android.gms.internal.ads;

public class qq3 {

    /* renamed from: c */
    private static final mp3 f13278c = mp3.m13445a();

    /* renamed from: a */
    protected volatile kr3 f13279a;

    /* renamed from: b */
    private volatile uo3 f13280b;

    /* renamed from: a */
    public final int mo10354a() {
        if (this.f13280b != null) {
            return ((qo3) this.f13280b).f13255j.length;
        }
        if (this.f13279a != null) {
            return this.f13279a.mo5393f();
        }
        return 0;
    }

    /* renamed from: b */
    public final uo3 mo10355b() {
        if (this.f13280b != null) {
            return this.f13280b;
        }
        synchronized (this) {
            if (this.f13280b != null) {
                uo3 uo3 = this.f13280b;
                return uo3;
            }
            this.f13280b = this.f13279a == null ? uo3.f15667g : this.f13279a.mo5902e();
            uo3 uo32 = this.f13280b;
            return uo32;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10356c(com.google.android.gms.internal.ads.kr3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.kr3 r0 = r1.f13279a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.kr3 r0 = r1.f13279a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f13279a = r2     // Catch:{ mq3 -> 0x0011 }
            com.google.android.gms.internal.ads.uo3 r0 = com.google.android.gms.internal.ads.uo3.f15667g     // Catch:{ mq3 -> 0x0011 }
            r1.f13280b = r0     // Catch:{ mq3 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f13279a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.uo3 r2 = com.google.android.gms.internal.ads.uo3.f15667g     // Catch:{ all -> 0x001b }
            r1.f13280b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qq3.mo10356c(com.google.android.gms.internal.ads.kr3):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq3)) {
            return false;
        }
        qq3 qq3 = (qq3) obj;
        kr3 kr3 = this.f13279a;
        kr3 kr32 = qq3.f13279a;
        if (kr3 == null && kr32 == null) {
            return mo10355b().equals(qq3.mo10355b());
        }
        if (kr3 != null && kr32 != null) {
            return kr3.equals(kr32);
        }
        if (kr3 != null) {
            qq3.mo10356c(kr3.mo5389a());
            return kr3.equals(qq3.f13279a);
        }
        mo10356c(kr32.mo5389a());
        return this.f13279a.equals(kr32);
    }

    public int hashCode() {
        return 1;
    }
}
