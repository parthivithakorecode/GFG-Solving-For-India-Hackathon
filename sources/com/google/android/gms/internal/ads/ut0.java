package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
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

public final class ut0 extends jq0 implements vt1, s04 {

    /* renamed from: A */
    public static final /* synthetic */ int f15746A = 0;

    /* renamed from: h */
    private final Context f15747h;

    /* renamed from: i */
    private final ft0 f15748i;

    /* renamed from: j */
    private final k84 f15749j;

    /* renamed from: k */
    private final sq0 f15750k;

    /* renamed from: l */
    private final WeakReference<tq0> f15751l;

    /* renamed from: m */
    private final x64 f15752m;

    /* renamed from: n */
    private gy3 f15753n;

    /* renamed from: o */
    private ByteBuffer f15754o;

    /* renamed from: p */
    private boolean f15755p;

    /* renamed from: q */
    private iq0 f15756q;

    /* renamed from: r */
    private int f15757r;

    /* renamed from: s */
    private int f15758s;

    /* renamed from: t */
    private long f15759t;

    /* renamed from: u */
    private final String f15760u;

    /* renamed from: v */
    private final int f15761v;

    /* renamed from: w */
    private final Object f15762w = new Object();
    @GuardedBy("httpDataSourcesLock")

    /* renamed from: x */
    private final ArrayList<tr1> f15763x;

    /* renamed from: y */
    private volatile ht0 f15764y;

    /* renamed from: z */
    private final Set<WeakReference<et0>> f15765z = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C2199sw.m17001c().mo8579b(com.google.android.gms.internal.ads.m10.f10596r1)).booleanValue() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f8, code lost:
        if (r7.f14546j == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fd, code lost:
        if (r7.f14545i <= 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ff, code lost:
        r8 = new com.google.android.gms.internal.ads.lt0(r5, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0105, code lost:
        r8 = new com.google.android.gms.internal.ads.mt0(r5, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010c, code lost:
        if (r7.f14546j == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010e, code lost:
        r7 = new com.google.android.gms.internal.ads.kt0(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0115, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0116, code lost:
        r6 = r5.f15754o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        if (r6 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        if (r6.limit() <= 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0120, code lost:
        r6 = new byte[r5.f15754o.limit()];
        r5.f15754o.get(r6);
        r7 = new com.google.android.gms.internal.ads.jt0(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ut0(android.content.Context r6, com.google.android.gms.internal.ads.sq0 r7, com.google.android.gms.internal.ads.tq0 r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f15762w = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.f15765z = r0
            r5.f15747h = r6
            r5.f15750k = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.f15751l = r0
            com.google.android.gms.internal.ads.ft0 r0 = new com.google.android.gms.internal.ads.ft0
            r0.<init>()
            r5.f15748i = r0
            com.google.android.gms.internal.ads.k84 r1 = new com.google.android.gms.internal.ads.k84
            r1.<init>(r6)
            r5.f15749j = r1
            boolean r2 = p069j1.C3202r1.m24017m()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            p069j1.C3202r1.m24015k(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.jq0.f9228f
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.nn3 r2 = new com.google.android.gms.internal.ads.nn3
            com.google.android.gms.internal.ads.pt0 r3 = new com.google.android.gms.internal.ads.pt0
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.mo9567b(r1)
            r2.mo9566a(r0)
            com.google.android.gms.internal.ads.gy3 r0 = r2.mo9568c()
            r5.f15753n = r0
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10621u1
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0071
            com.google.android.gms.internal.ads.gy3 r0 = r5.f15753n
            r0.mo7744L(r1)
        L_0x0071:
            com.google.android.gms.internal.ads.gy3 r0 = r5.f15753n
            r0.mo7738F(r5)
            r5.f15757r = r1
            r2 = 0
            r5.f15759t = r2
            r5.f15758s = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f15763x = r0
            r5.f15764y = r4
            if (r8 == 0) goto L_0x0094
            java.lang.String r0 = r8.mo11071q()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r8.mo11071q()
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = ""
        L_0x0096:
            r5.f15760u = r0
            if (r8 == 0) goto L_0x009f
            int r0 = r8.mo11066f()
            goto L_0x00a0
        L_0x009f:
            r0 = r1
        L_0x00a0:
            r5.f15761v = r0
            com.google.android.gms.internal.ads.x64 r0 = new com.google.android.gms.internal.ads.x64
            j1.g2 r2 = p054h1.C2694t.m21608q()
            com.google.android.gms.internal.ads.po0 r8 = r8.mo7129l()
            java.lang.String r8 = r8.f12729f
            java.lang.String r6 = r2.mo14022L(r6, r8)
            boolean r8 = r5.f15755p
            if (r8 == 0) goto L_0x00d1
            java.nio.ByteBuffer r8 = r5.f15754o
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00d1
            java.nio.ByteBuffer r6 = r5.f15754o
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.f15754o
            r7.get(r6)
            com.google.android.gms.internal.ads.nt0 r7 = new com.google.android.gms.internal.ads.nt0
            r7.<init>(r6)
            goto L_0x0133
        L_0x00d1:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.m10.f10637w1
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r8 = r2.mo8579b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00f6
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.m10.f10596r1
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r8 = r3.mo8579b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00fa
        L_0x00f6:
            boolean r8 = r7.f14546j
            if (r8 != 0) goto L_0x00fb
        L_0x00fa:
            r1 = r2
        L_0x00fb:
            int r8 = r7.f14545i
            if (r8 <= 0) goto L_0x0105
            com.google.android.gms.internal.ads.lt0 r8 = new com.google.android.gms.internal.ads.lt0
            r8.<init>(r5, r6, r1)
            goto L_0x010a
        L_0x0105:
            com.google.android.gms.internal.ads.mt0 r8 = new com.google.android.gms.internal.ads.mt0
            r8.<init>(r5, r6, r1)
        L_0x010a:
            boolean r6 = r7.f14546j
            if (r6 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.kt0 r6 = new com.google.android.gms.internal.ads.kt0
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x0116
        L_0x0115:
            r7 = r8
        L_0x0116:
            java.nio.ByteBuffer r6 = r5.f15754o
            if (r6 == 0) goto L_0x0133
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x0133
            java.nio.ByteBuffer r6 = r5.f15754o
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.f15754o
            r8.get(r6)
            com.google.android.gms.internal.ads.jt0 r8 = new com.google.android.gms.internal.ads.jt0
            r8.<init>(r7, r6)
            r7 = r8
        L_0x0133:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.m10.f10549m
            com.google.android.gms.internal.ads.k10 r8 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r6 = r8.mo8579b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.qt0 r6 = com.google.android.gms.internal.ads.qt0.f13305b
            goto L_0x014a
        L_0x0148:
            com.google.android.gms.internal.ads.rt0 r6 = com.google.android.gms.internal.ads.rt0.f13933b
        L_0x014a:
            r0.<init>(r7, r6)
            r5.f15752m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut0.<init>(android.content.Context, com.google.android.gms.internal.ads.sq0, com.google.android.gms.internal.ads.tq0):void");
    }

    /* renamed from: g0 */
    private final boolean m18039g0() {
        return this.f15764y != null && this.f15764y.mo8016y();
    }

    /* renamed from: A */
    public final void mo10700A(r04 r04, int i) {
        iq0 iq0 = this.f15756q;
        if (iq0 != null) {
            iq0.mo6293s(i);
        }
    }

    /* renamed from: B */
    public final void mo5440B(Uri[] uriArr, String str) {
        mo5441C(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: C */
    public final void mo5441C(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        v54 v54;
        if (this.f15753n != null) {
            this.f15754o = byteBuffer;
            this.f15755p = z;
            int length = uriArr.length;
            if (length == 1) {
                v54 = mo11297d0(uriArr[0]);
            } else {
                v54[] v54Arr = new v54[length];
                for (int i = 0; i < uriArr.length; i++) {
                    v54Arr[i] = mo11297d0(uriArr[i]);
                }
                v54 = new j64(false, false, v54Arr);
            }
            this.f15753n.mo7742J(v54);
            this.f15753n.mo7739G();
            jq0.f9229g.incrementAndGet();
        }
    }

    /* renamed from: D */
    public final void mo5442D() {
        gy3 gy3 = this.f15753n;
        if (gy3 != null) {
            gy3.mo7741I(this);
            this.f15753n.mo7740H();
            this.f15753n = null;
            jq0.f9229g.decrementAndGet();
        }
    }

    /* renamed from: E */
    public final void mo5443E(long j) {
        gy3 gy3 = this.f15753n;
        gy3.mo7749a(gy3.mo7756e(), j);
    }

    /* renamed from: F */
    public final void mo5444F(int i) {
        this.f15748i.mo7389j(i);
    }

    /* renamed from: G */
    public final void mo5445G(int i) {
        this.f15748i.mo7390k(i);
    }

    /* renamed from: H */
    public final void mo5446H(iq0 iq0) {
        this.f15756q = iq0;
    }

    /* renamed from: I */
    public final void mo5447I(int i) {
        this.f15748i.mo7391l(i);
    }

    /* renamed from: J */
    public final void mo5448J(int i) {
        this.f15748i.mo7392m(i);
    }

    /* renamed from: K */
    public final void mo5449K(boolean z) {
        this.f15753n.mo7743K(z);
    }

    /* renamed from: L */
    public final void mo5450L(boolean z) {
        if (this.f15753n != null) {
            int i = 0;
            while (true) {
                this.f15753n.mo7752b0();
                if (i < 2) {
                    k84 k84 = this.f15749j;
                    f84 d = k84.mo8640h().mo6413d();
                    d.mo7261o(i, !z);
                    k84.mo8641l(d);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo5451M(int i) {
        for (WeakReference<et0> weakReference : this.f15765z) {
            et0 et0 = (et0) weakReference.get();
            if (et0 != null) {
                et0.mo7071u(i);
            }
        }
    }

    /* renamed from: N */
    public final void mo5452N(Surface surface, boolean z) {
        gy3 gy3 = this.f15753n;
        if (gy3 != null) {
            gy3.mo7745M(surface);
        }
    }

    /* renamed from: O */
    public final void mo5453O(float f, boolean z) {
        gy3 gy3 = this.f15753n;
        if (gy3 != null) {
            gy3.mo7746N(f);
        }
    }

    /* renamed from: P */
    public final void mo5454P() {
        this.f15753n.mo7747O(false);
    }

    /* renamed from: Q */
    public final boolean mo5455Q() {
        return this.f15753n != null;
    }

    /* renamed from: R */
    public final boolean mo5456R() {
        return this.f15753n.mo7748Q();
    }

    /* renamed from: S */
    public final int mo5457S() {
        return this.f15758s;
    }

    /* renamed from: U */
    public final int mo5458U() {
        return this.f15753n.mo7750a0();
    }

    /* renamed from: W */
    public final long mo5459W() {
        return this.f15753n.mo7753c0();
    }

    /* renamed from: X */
    public final long mo5460X() {
        return (long) this.f15757r;
    }

    /* renamed from: Y */
    public final long mo5461Y() {
        if (m18039g0() && this.f15764y.mo8015x()) {
            return Math.min((long) this.f15757r, this.f15764y.mo8010s());
        }
        return 0;
    }

    /* renamed from: Z */
    public final long mo5462Z() {
        return this.f15753n.mo7760j();
    }

    /* renamed from: a */
    public final void mo8428a(he1 he1, li1 li1, boolean z) {
    }

    /* renamed from: a0 */
    public final long mo5463a0() {
        return this.f15753n.mo7755d0();
    }

    /* renamed from: b0 */
    public final long mo5465b0() {
        if (!m18039g0()) {
            return (long) this.f15757r;
        }
        return 0;
    }

    /* renamed from: c0 */
    public final long mo5467c0() {
        if (m18039g0()) {
            return this.f15764y.mo8011t();
        }
        synchronized (this.f15762w) {
            while (!this.f15763x.isEmpty()) {
                long j = this.f15759t;
                Map<String, List<String>> zza = this.f15763x.remove(0).zza();
                long j2 = 0;
                if (zza != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zza.entrySet().iterator();
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
                this.f15759t = j + j2;
            }
        }
        return this.f15759t;
    }

    /* renamed from: d */
    public final void mo10701d(r04 r04, C1574c0 c0Var, de3 de3) {
        tq0 tq0 = (tq0) this.f15751l.get();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && tq0 != null && c0Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", c0Var.f5233k);
            hashMap.put("audioSampleMime", c0Var.f5234l);
            hashMap.put("audioCodec", c0Var.f5231i);
            tq0.mo6424t("onMetadataEvent", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final v54 mo11297d0(Uri uri) {
        C1727g4 g4Var = new C1727g4();
        g4Var.mo7502b(uri);
        C2451zo c = g4Var.mo7503c();
        x64 x64 = this.f15752m;
        x64.mo11777a(this.f15750k.f14543g);
        return x64.mo11778b(c);
    }

    /* renamed from: e */
    public final void mo8429e(he1 he1, li1 li1, boolean z, int i) {
        this.f15757r += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final /* synthetic */ void mo11298e0(boolean z, long j) {
        iq0 iq0 = this.f15756q;
        if (iq0 != null) {
            iq0.mo6285c(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ xx3[] mo11299f0(Handler handler, nb4 nb4, i14 i14, p74 p74, u44 u44) {
        Context context = this.f15747h;
        d44 d44 = d44.f5643a;
        h24 h24 = new h24((t04) null, new w04[0], false);
        w34 w34 = w34.f16685a;
        return new xx3[]{new l24(context, w34, d44, false, handler, i14, h24), new sa4(this.f15747h, w34, d44, 0, false, handler, nb4, -1)};
    }

    public final void finalize() {
        jq0.f9228f.decrementAndGet();
        if (C3202r1.m24017m()) {
            C3202r1.m24015k("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ he1 mo11301h0(String str, boolean z) {
        ut0 ut0 = true != z ? null : this;
        sq0 sq0 = this.f15750k;
        et0 et0 = new et0(str, ut0, sq0.f14540d, sq0.f14542f, sq0.f14545i);
        this.f15765z.add(new WeakReference(et0));
        return et0;
    }

    /* renamed from: i */
    public final void mo8430i(he1 he1, li1 li1, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ he1 mo11302i0(String str, boolean z) {
        mj1 mj1 = new mj1();
        mj1.mo9268e(str);
        mj1.mo9267d(true != z ? null : this);
        mj1.mo9265b(this.f15750k.f14540d);
        mj1.mo9266c(this.f15750k.f14542f);
        mj1.mo9264a(true);
        return mj1.zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final /* synthetic */ he1 mo11303j0(gd1 gd1) {
        return new ht0(this.f15747h, gd1.zza(), this.f15760u, this.f15761v, this, new st0(this), (byte[]) null);
    }

    /* renamed from: o */
    public final void mo10702o(r04 r04, C1574c0 c0Var, de3 de3) {
        tq0 tq0 = (tq0) this.f15751l.get();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && tq0 != null && c0Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(c0Var.f5241s));
            hashMap.put("bitRate", String.valueOf(c0Var.f5230h));
            int i = c0Var.f5239q;
            int i2 = c0Var.f5240r;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", c0Var.f5233k);
            hashMap.put("videoSampleMime", c0Var.f5234l);
            hashMap.put("videoCodec", c0Var.f5231i);
            tq0.mo6424t("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: q */
    public final void mo10703q(r04 r04, c10 c10) {
        iq0 iq0 = this.f15756q;
        if (iq0 != null) {
            iq0.mo6287e("onPlayerError", c10);
        }
    }

    /* renamed from: r */
    public final void mo10704r(r04 r04, int i, long j) {
        this.f15758s += i;
    }

    /* renamed from: u */
    public final void mo10705u(r04 r04, ry0 ry0) {
        iq0 iq0 = this.f15756q;
        if (iq0 != null) {
            iq0.mo6286d(ry0.f14166a, ry0.f14167b);
        }
    }

    /* renamed from: v */
    public final void mo8431v(he1 he1, li1 li1, boolean z) {
        if (he1 instanceof tr1) {
            synchronized (this.f15762w) {
                this.f15763x.add((tr1) he1);
            }
        } else if (he1 instanceof ht0) {
            this.f15764y = (ht0) he1;
            tq0 tq0 = (tq0) this.f15751l.get();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && tq0 != null && this.f15764y.mo8013v()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f15764y.mo8015x()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f15764y.mo8014w()));
                C3163g2.f20465i.post(new tt0(tq0, hashMap));
            }
        }
    }

    /* renamed from: x */
    public final void mo10706x(r04 r04, Object obj, long j) {
        iq0 iq0 = this.f15756q;
        if (iq0 != null) {
            iq0.mo6298x();
        }
    }

    /* renamed from: z */
    public final void mo10707z(r04 r04, k54 k54, p54 p54, IOException iOException, boolean z) {
        iq0 iq0 = this.f15756q;
        if (iq0 == null) {
            return;
        }
        if (this.f15750k.f14548l) {
            iq0.mo6284b("onLoadException", iOException);
        } else {
            iq0.mo6287e("onLoadError", iOException);
        }
    }
}
