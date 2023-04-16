package p111p1;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: p1.j0 */
public final class C3906j0 {

    /* renamed from: a */
    private final String f22040a;

    /* synthetic */ C3906j0(C3902h0 h0Var, C3904i0 i0Var) {
        this.f22040a = h0Var.f22034a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1861jr mo15365a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f22040a
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1999289321: goto L_0x002b;
                case -1372958932: goto L_0x0021;
                case 543046670: goto L_0x0017;
                case 1951953708: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r4
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0047
            if (r0 == r3) goto L_0x0044
            if (r0 == r2) goto L_0x0041
            com.google.android.gms.internal.ads.jr r0 = com.google.android.gms.internal.ads.C1861jr.AD_INITIATER_UNSPECIFIED
            return r0
        L_0x0041:
            com.google.android.gms.internal.ads.jr r0 = com.google.android.gms.internal.ads.C1861jr.REWARD_BASED_VIDEO_AD
            return r0
        L_0x0044:
            com.google.android.gms.internal.ads.jr r0 = com.google.android.gms.internal.ads.C1861jr.AD_LOADER
            return r0
        L_0x0047:
            com.google.android.gms.internal.ads.jr r0 = com.google.android.gms.internal.ads.C1861jr.INTERSTITIAL
            return r0
        L_0x004a:
            com.google.android.gms.internal.ads.jr r0 = com.google.android.gms.internal.ads.C1861jr.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p111p1.C3906j0.mo15365a():com.google.android.gms.internal.ads.jr");
    }

    /* renamed from: b */
    public final String mo15366b() {
        return this.f22040a.toLowerCase(Locale.ROOT);
    }

    /* renamed from: c */
    public final Set<String> mo15367c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f22040a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
