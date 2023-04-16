package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
import p069j1.C3163g2;
import p069j1.C3202r1;

public final class as0 extends jq0 implements C1819im, C1706fk, C2227tn, C2293vf, C1848je {

    /* renamed from: B */
    public static final /* synthetic */ int f4314B = 0;

    /* renamed from: A */
    private final Set<WeakReference<nr0>> f4315A = new HashSet();

    /* renamed from: h */
    private final Context f4316h;

    /* renamed from: i */
    private final qr0 f4317i;

    /* renamed from: j */
    private final C1589cf f4318j;

    /* renamed from: k */
    private final C1589cf f4319k;

    /* renamed from: l */
    private final C1892kl f4320l;

    /* renamed from: m */
    private final sq0 f4321m;

    /* renamed from: n */
    private C1959me f4322n;

    /* renamed from: o */
    private ByteBuffer f4323o;

    /* renamed from: p */
    private boolean f4324p;

    /* renamed from: q */
    private final WeakReference<tq0> f4325q;

    /* renamed from: r */
    private iq0 f4326r;

    /* renamed from: s */
    private int f4327s;

    /* renamed from: t */
    private int f4328t;

    /* renamed from: u */
    private long f4329u;

    /* renamed from: v */
    private final String f4330v;

    /* renamed from: w */
    private final int f4331w;

    /* renamed from: x */
    private final Object f4332x = new Object();
    @GuardedBy("httpDataSourcesLock")

    /* renamed from: y */
    private final ArrayList<C1596cm> f4333y;

    /* renamed from: z */
    private volatile pr0 f4334z;

    public as0(Context context, sq0 sq0, tq0 tq0) {
        this.f4316h = context;
        this.f4321m = sq0;
        this.f4325q = new WeakReference<>(tq0);
        qr0 qr0 = new qr0();
        this.f4317i = qr0;
        C1556bj bjVar = C1556bj.f4956a;
        s33 s33 = C3163g2.f20465i;
        C1820in inVar = new C1820in(context, bjVar, 0, s33, this, -1);
        this.f4318j = inVar;
        C1887kg kgVar = new C1887kg(bjVar, (C2443zg) null, true, s33, this);
        this.f4319k = kgVar;
        C1744gl glVar = new C1744gl((C1929ll) null);
        this.f4320l = glVar;
        if (C3202r1.m24017m()) {
            C3202r1.m24015k("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        jq0.f9228f.incrementAndGet();
        int i = 0;
        C1959me a = C1996ne.m13869a(new C1589cf[]{kgVar, inVar}, glVar, qr0);
        this.f4322n = a;
        a.mo9192E0(this);
        this.f4327s = 0;
        this.f4329u = 0;
        this.f4328t = 0;
        this.f4333y = new ArrayList<>();
        this.f4334z = null;
        this.f4330v = (tq0 == null || tq0.mo11071q() == null) ? "" : tq0.mo11071q();
        this.f4331w = tq0 != null ? tq0.mo11066f() : i;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10558n)).booleanValue()) {
            this.f4322n.mo9195e();
        }
        if (tq0 != null && tq0.mo11065e() > 0) {
            this.f4322n.mo9202y0(tq0.mo11065e());
        }
        if (tq0 != null && tq0.mo11063d() > 0) {
            this.f4322n.mo9200s(tq0.mo11063d());
        }
    }

    /* renamed from: k0 */
    private final boolean m6272k0() {
        return this.f4334z != null && this.f4334z.mo10155l();
    }

    /* renamed from: B */
    public final void mo5440B(Uri[] uriArr, String str) {
        mo5441C(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: C */
    public final void mo5441C(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        C1891kk kkVar;
        if (this.f4322n != null) {
            this.f4323o = byteBuffer;
            this.f4324p = z;
            int length = uriArr.length;
            if (length == 1) {
                kkVar = mo5468d0(uriArr[0], str);
            } else {
                C1891kk[] kkVarArr = new C1891kk[length];
                for (int i = 0; i < uriArr.length; i++) {
                    kkVarArr[i] = mo5468d0(uriArr[i], str);
                }
                kkVar = new C2039ok(kkVarArr);
            }
            this.f4322n.mo9190C0(kkVar);
            jq0.f9229g.incrementAndGet();
        }
    }

    /* renamed from: D */
    public final void mo5442D() {
        C1959me meVar = this.f4322n;
        if (meVar != null) {
            meVar.mo9188A0(this);
            this.f4322n.mo9197h();
            this.f4322n = null;
            jq0.f9229g.decrementAndGet();
        }
    }

    /* renamed from: E */
    public final void mo5443E(long j) {
        this.f4322n.mo9189B0(j);
    }

    /* renamed from: F */
    public final void mo5444F(int i) {
        this.f4317i.mo10366f(i);
    }

    /* renamed from: G */
    public final void mo5445G(int i) {
        this.f4317i.mo10367g(i);
    }

    /* renamed from: H */
    public final void mo5446H(iq0 iq0) {
        this.f4326r = iq0;
    }

    /* renamed from: I */
    public final void mo5447I(int i) {
        this.f4317i.mo10368h(i);
    }

    /* renamed from: J */
    public final void mo5448J(int i) {
        this.f4317i.mo10369i(i);
    }

    /* renamed from: K */
    public final void mo5449K(boolean z) {
        this.f4322n.mo9201x0(z);
    }

    /* renamed from: L */
    public final void mo5450L(boolean z) {
        if (this.f4322n != null) {
            for (int i = 0; i < 2; i++) {
                this.f4320l.mo8688f(i, !z);
            }
        }
    }

    /* renamed from: M */
    public final void mo5451M(int i) {
        for (WeakReference<nr0> weakReference : this.f4315A) {
            nr0 nr0 = (nr0) weakReference.get();
            if (nr0 != null) {
                nr0.mo9588h(i);
            }
        }
    }

    /* renamed from: N */
    public final void mo5452N(Surface surface, boolean z) {
        if (this.f4322n != null) {
            C1922le leVar = new C1922le(this.f4318j, 1, surface);
            if (z) {
                this.f4322n.mo9191D0(leVar);
                return;
            }
            this.f4322n.mo9203z0(leVar);
        }
    }

    /* renamed from: O */
    public final void mo5453O(float f, boolean z) {
        if (this.f4322n != null) {
            C1922le leVar = new C1922le(this.f4319k, 2, Float.valueOf(f));
            if (z) {
                this.f4322n.mo9191D0(leVar);
                return;
            }
            this.f4322n.mo9203z0(leVar);
        }
    }

    /* renamed from: P */
    public final void mo5454P() {
        this.f4322n.mo9198l();
    }

    /* renamed from: Q */
    public final boolean mo5455Q() {
        return this.f4322n != null;
    }

    /* renamed from: R */
    public final boolean mo5456R() {
        return this.f4322n.mo9199r();
    }

    /* renamed from: S */
    public final int mo5457S() {
        return this.f4328t;
    }

    /* renamed from: U */
    public final int mo5458U() {
        return this.f4322n.zza();
    }

    /* renamed from: W */
    public final long mo5459W() {
        return this.f4322n.mo9193a();
    }

    /* renamed from: X */
    public final long mo5460X() {
        return (long) this.f4327s;
    }

    /* renamed from: Y */
    public final long mo5461Y() {
        if (m6272k0() && this.f4334z.mo10154k()) {
            return Math.min((long) this.f4327s, this.f4334z.mo10149a());
        }
        return 0;
    }

    /* renamed from: Z */
    public final long mo5462Z() {
        return this.f4322n.mo9194c();
    }

    /* renamed from: a0 */
    public final long mo5463a0() {
        return this.f4322n.mo9196g();
    }

    /* renamed from: b */
    public final void mo5464b() {
    }

    /* renamed from: b0 */
    public final long mo5465b0() {
        if (!m6272k0()) {
            return (long) this.f4327s;
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo5466c(boolean z) {
    }

    /* renamed from: c0 */
    public final long mo5467c0() {
        if (m6272k0()) {
            return this.f4334z.mo10150f();
        }
        synchronized (this.f4332x) {
            while (!this.f4333y.isEmpty()) {
                long j = this.f4329u;
                Map<String, List<String>> b = this.f4333y.remove(0).mo6219b();
                long j2 = 0;
                if (b != null) {
                    Iterator<Map.Entry<String, List<String>>> it = b.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        if (next != null) {
                            try {
                                if (!(next.getKey() == null || !w33.m18854c("content-length", (CharSequence) next.getKey()) || next.getValue() == null || ((List) next.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) next.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f4329u = j + j2;
            }
        }
        return this.f4329u;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C2199sw.m17001c().mo8579b(com.google.android.gms.internal.ads.m10.f10596r1)).booleanValue() == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1891kk mo5468d0(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.gk r9 = new com.google.android.gms.internal.ads.gk
            boolean r0 = r10.f4324p
            if (r0 == 0) goto L_0x0022
            java.nio.ByteBuffer r0 = r10.f4323o
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0022
            java.nio.ByteBuffer r12 = r10.f4323o
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.f4323o
            r0.get(r12)
            com.google.android.gms.internal.ads.xr0 r0 = new com.google.android.gms.internal.ads.xr0
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0089
        L_0x0022:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10637w1
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10596r1
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r2.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004f
        L_0x0047:
            com.google.android.gms.internal.ads.sq0 r0 = r10.f4321m
            boolean r0 = r0.f14546j
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            com.google.android.gms.internal.ads.sq0 r0 = r10.f4321m
            int r0 = r0.f14545i
            if (r0 <= 0) goto L_0x005b
            com.google.android.gms.internal.ads.vr0 r0 = new com.google.android.gms.internal.ads.vr0
            r0.<init>(r10, r12, r1)
            goto L_0x0060
        L_0x005b:
            com.google.android.gms.internal.ads.wr0 r0 = new com.google.android.gms.internal.ads.wr0
            r0.<init>(r10, r12, r1)
        L_0x0060:
            com.google.android.gms.internal.ads.sq0 r12 = r10.f4321m
            boolean r12 = r12.f14546j
            if (r12 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.ur0 r12 = new com.google.android.gms.internal.ads.ur0
            r12.<init>(r10, r0)
            r0 = r12
        L_0x006c:
            java.nio.ByteBuffer r12 = r10.f4323o
            if (r12 == 0) goto L_0x0020
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0020
            java.nio.ByteBuffer r12 = r10.f4323o
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.f4323o
            r1.get(r12)
            com.google.android.gms.internal.ads.tr0 r1 = new com.google.android.gms.internal.ads.tr0
            r1.<init>(r0, r12)
            r2 = r1
        L_0x0089:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.m10.f10549m
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r12 = r0.mo8579b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.rr0 r12 = com.google.android.gms.internal.ads.rr0.f13844a
            goto L_0x00a0
        L_0x009e:
            com.google.android.gms.internal.ads.sr0 r12 = com.google.android.gms.internal.ads.sr0.f14556a
        L_0x00a0:
            r3 = r12
            com.google.android.gms.internal.ads.sq0 r12 = r10.f4321m
            int r4 = r12.f14547k
            com.google.android.gms.internal.ads.s33 r5 = p069j1.C3163g2.f20465i
            r7 = 0
            int r8 = r12.f14543g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.as0.mo5468d0(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.kk");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final /* synthetic */ C2225tl mo5469e0(String str, boolean z) {
        as0 as0 = true != z ? null : this;
        sq0 sq0 = this.f4321m;
        nr0 nr0 = new nr0(str, as0, sq0.f14540d, sq0.f14542f, sq0.f14545i);
        this.f4315A.add(new WeakReference(nr0));
        return nr0;
    }

    /* renamed from: f */
    public final void mo5470f(C1521al alVar, C1966ml mlVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ C2225tl mo5471f0(String str, boolean z) {
        as0 as0 = true != z ? null : this;
        sq0 sq0 = this.f4321m;
        return new C2411yl(str, (C2226tm<String>) null, as0, sq0.f14540d, sq0.f14542f, true, (C1559bm) null);
    }

    public final void finalize() {
        jq0.f9228f.decrementAndGet();
        if (C3202r1.m24017m()) {
            C3202r1.m24015k("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g */
    public final void mo5473g(IOException iOException) {
        iq0 iq0 = this.f4326r;
        if (iq0 == null) {
            return;
        }
        if (this.f4321m.f14548l) {
            iq0.mo6284b("onLoadException", iOException);
        } else {
            iq0.mo6287e("onLoadError", iOException);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final /* synthetic */ C2225tl mo5474g0(C2188sl slVar) {
        return new pr0(this.f4316h, slVar.zza(), this.f4330v, this.f4331w, this, new yr0(this), (yr0) null);
    }

    /* renamed from: h */
    public final void mo5475h(C1812if ifVar, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ void mo5476h0(boolean z, long j) {
        iq0 iq0 = this.f4326r;
        if (iq0 != null) {
            iq0.mo6285c(z, j);
        }
    }

    /* renamed from: i0 */
    public final void mo5477i0(C2225tl tlVar, int i) {
        this.f4327s += i;
    }

    /* renamed from: j */
    public final void mo5478j(C2367xe xeVar) {
        tq0 tq0 = (tq0) this.f4325q.get();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && tq0 != null && xeVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(xeVar.f17169q));
            hashMap.put("bitRate", String.valueOf(xeVar.f17159g));
            int i = xeVar.f17167o;
            int i2 = xeVar.f17168p;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", xeVar.f17162j);
            hashMap.put("videoSampleMime", xeVar.f17163k);
            hashMap.put("videoCodec", xeVar.f17160h);
            tq0.mo6424t("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: j0 */
    public final void mo5480k(C2225tl tlVar, C2299vl vlVar) {
        if (tlVar instanceof C1596cm) {
            synchronized (this.f4332x) {
                this.f4333y.add((C1596cm) tlVar);
            }
        } else if (tlVar instanceof pr0) {
            this.f4334z = (pr0) tlVar;
            tq0 tq0 = (tq0) this.f4325q.get();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && tq0 != null && this.f4334z.mo10152i()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f4334z.mo10154k()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f4334z.mo10153j()));
                C3163g2.f20465i.post(new zr0(tq0, hashMap));
            }
        }
    }

    /* renamed from: l */
    public final void mo5481l(C1811ie ieVar) {
        iq0 iq0 = this.f4326r;
        if (iq0 != null) {
            iq0.mo6287e("onPlayerError", ieVar);
        }
    }

    /* renamed from: m */
    public final void mo5482m(int i, int i2, int i3, float f) {
        iq0 iq0 = this.f4326r;
        if (iq0 != null) {
            iq0.mo6286d(i, i2);
        }
    }

    /* renamed from: n */
    public final void mo5483n(C1552bf bfVar) {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo5484p(Object obj, int i) {
        this.f4327s += i;
    }

    /* renamed from: s */
    public final void mo5485s(int i, long j) {
        this.f4328t += i;
    }

    /* renamed from: t */
    public final void mo5486t(boolean z, int i) {
        iq0 iq0 = this.f4326r;
        if (iq0 != null) {
            iq0.mo6293s(i);
        }
    }

    /* renamed from: w */
    public final void mo5487w(Surface surface) {
        iq0 iq0 = this.f4326r;
        if (iq0 != null) {
            iq0.mo6298x();
        }
    }

    /* renamed from: y */
    public final void mo5488y(C2367xe xeVar) {
        tq0 tq0 = (tq0) this.f4325q.get();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && tq0 != null && xeVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", xeVar.f17162j);
            hashMap.put("audioSampleMime", xeVar.f17163k);
            hashMap.put("audioCodec", xeVar.f17160h);
            tq0.mo6424t("onMetadataEvent", hashMap);
        }
    }
}
