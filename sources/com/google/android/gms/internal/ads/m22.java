package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p054h1.C2694t;

public final class m22 extends mi0 {

    /* renamed from: f */
    private final Context f10688f;

    /* renamed from: g */
    private final Executor f10689g;

    /* renamed from: h */
    private final hj0 f10690h;

    /* renamed from: i */
    private final i11 f10691i;
    @GuardedBy("this")

    /* renamed from: j */
    private final ArrayDeque<j22> f10692j;

    /* renamed from: k */
    private final ij0 f10693k;

    /* renamed from: l */
    private final r22 f10694l;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, java.util.concurrent.Executor] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.ij0, java.util.concurrent.Executor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.ij0, com.google.android.gms.internal.ads.i11] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.i11, com.google.android.gms.internal.ads.hj0] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.ArrayDeque<com.google.android.gms.internal.ads.j22>, com.google.android.gms.internal.ads.hj0] */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.r22, java.util.ArrayDeque<com.google.android.gms.internal.ads.j22>] */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m22(android.content.Context r1, android.content.Context r2, java.util.concurrent.Executor r3, com.google.android.gms.internal.ads.ij0 r4, com.google.android.gms.internal.ads.i11 r5, com.google.android.gms.internal.ads.hj0 r6, java.util.ArrayDeque<com.google.android.gms.internal.ads.j22> r7, com.google.android.gms.internal.ads.r22 r8) {
        /*
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.m10.m13007c(r1)
            r0.f10688f = r1
            r0.f10689g = r2
            r0.f10693k = r3
            r0.f10690h = r5
            r0.f10691i = r4
            r0.f10692j = r6
            r0.f10694l = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m22.<init>(android.content.Context, java.util.concurrent.Executor, com.google.android.gms.internal.ads.ij0, com.google.android.gms.internal.ads.i11, com.google.android.gms.internal.ads.hj0, java.util.ArrayDeque, com.google.android.gms.internal.ads.r22, byte[]):void");
    }

    /* renamed from: E5 */
    private final synchronized j22 m13018E5(String str) {
        Iterator<j22> it = this.f10692j.iterator();
        while (it.hasNext()) {
            j22 next = it.next();
            if (next.f8955d.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: F5 */
    private final synchronized j22 m13019F5(String str) {
        Iterator<j22> it = this.f10692j.iterator();
        while (it.hasNext()) {
            j22 next = it.next();
            if (next.f8954c.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: G5 */
    private static cc3<yi0> m13020G5(cc3<JSONObject> cc3, nw2 nw2, cc0 cc0) {
        return nw2.mo7176b(gw2.BUILD_URL, cc3).mo6686f(cc0.mo6122a("AFMA_getAdDictionary", zb0.f18143b, w12.f16653a)).mo6681a();
    }

    /* renamed from: H5 */
    private static cc3<JSONObject> m13021H5(vi0 vi0, nw2 nw2, bk2 bk2) {
        a22 a22 = new a22(bk2);
        return nw2.mo7176b(gw2.GMS_SIGNALS, rb3.m16131i(vi0.f16310f)).mo6686f(a22).mo6685e(x12.f16982a).mo6681a();
    }

    /* renamed from: I5 */
    private final synchronized void m13022I5(j22 j22) {
        m13024r();
        this.f10692j.addLast(j22);
    }

    /* renamed from: J5 */
    private final void m13023J5(cc3<InputStream> cc3, ri0 ri0) {
        rb3.m16140r(rb3.m16136n(cc3, new y12(this), wo0.f16886a), new i22(this, ri0), wo0.f16891f);
    }

    /* renamed from: r */
    private final synchronized void m13024r() {
        int intValue = h30.f8029c.mo9928e().intValue();
        while (this.f10692j.size() >= intValue) {
            this.f10692j.removeFirst();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* renamed from: A5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.cc3<java.io.InputStream> mo9109A5(com.google.android.gms.internal.ads.vi0 r12, int r13) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.sb0 r0 = p054h1.C2694t.m21598g()
            android.content.Context r1 = r11.f10688f
            com.google.android.gms.internal.ads.po0 r2 = com.google.android.gms.internal.ads.po0.m15177c()
            com.google.android.gms.internal.ads.cc0 r0 = r0.mo10759b(r1, r2)
            com.google.android.gms.internal.ads.i11 r1 = r11.f10691i
            com.google.android.gms.internal.ads.bk2 r1 = r1.mo5980a(r12, r13)
            com.google.android.gms.internal.ads.vb0<com.google.android.gms.internal.ads.l22> r2 = com.google.android.gms.internal.ads.l22.f9849d
            com.google.android.gms.internal.ads.tb0<java.io.InputStream> r3 = com.google.android.gms.internal.ads.zb0.f18144c
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.rb0 r2 = r0.mo6122a(r4, r2, r3)
            com.google.android.gms.internal.ads.t22 r3 = new com.google.android.gms.internal.ads.t22
            java.lang.String r4 = r12.f16316l
            r3.<init>(r4)
            android.content.Context r6 = r11.f10688f
            com.google.android.gms.internal.ads.po0 r4 = r12.f16311g
            java.lang.String r7 = r4.f12729f
            com.google.android.gms.internal.ads.ij0 r8 = r11.f10693k
            com.google.android.gms.internal.ads.q22 r4 = new com.google.android.gms.internal.ads.q22
            r10 = 0
            r5 = r4
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.ads.nw2 r13 = r1.mo5877c()
            com.google.android.gms.internal.ads.p20<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.h30.f8027a
            java.lang.Object r5 = r5.mo9928e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 != 0) goto L_0x0058
            java.lang.String r5 = r12.f16319o
            if (r5 == 0) goto L_0x0082
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0082
            java.lang.String r5 = "Request contained a PoolKey but split request is disabled."
        L_0x0054:
            p069j1.C3202r1.m24015k(r5)
            goto L_0x0082
        L_0x0058:
            com.google.android.gms.internal.ads.p20<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.h30.f8030d
            java.lang.Object r5 = r5.mo9928e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = r12.f16317m
            com.google.android.gms.internal.ads.j22 r5 = r11.m13019F5(r5)
        L_0x006c:
            r6 = r5
            goto L_0x007d
        L_0x006e:
            java.lang.String r5 = r12.f16319o
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = r12.f16319o
            com.google.android.gms.internal.ads.j22 r5 = r11.m13018E5(r5)
            goto L_0x006c
        L_0x007d:
            if (r6 != 0) goto L_0x0082
            java.lang.String r5 = "Request contained a PoolKey but no matching parameters were found."
            goto L_0x0054
        L_0x0082:
            r5 = 1
            r7 = 0
            r8 = 2
            if (r6 != 0) goto L_0x00d1
            com.google.android.gms.internal.ads.cc3 r12 = m13021H5(r12, r13, r1)
            com.google.android.gms.internal.ads.cc3 r0 = m13020G5(r12, r13, r0)
            com.google.android.gms.internal.ads.gw2 r1 = com.google.android.gms.internal.ads.gw2.HTTP
            com.google.android.gms.internal.ads.cc3[] r6 = new com.google.android.gms.internal.ads.cc3[r8]
            r6[r7] = r0
            r6[r5] = r12
            com.google.android.gms.internal.ads.uv2 r1 = r13.mo7175a(r1, r6)
            com.google.android.gms.internal.ads.d22 r6 = new com.google.android.gms.internal.ads.d22
            r6.<init>(r12, r0)
            com.google.android.gms.internal.ads.dw2 r1 = r1.mo11315a(r6)
            com.google.android.gms.internal.ads.dw2 r1 = r1.mo6685e(r3)
            com.google.android.gms.internal.ads.dw2 r1 = r1.mo6685e(r4)
            com.google.android.gms.internal.ads.rv2 r1 = r1.mo6681a()
            com.google.android.gms.internal.ads.gw2 r3 = com.google.android.gms.internal.ads.gw2.PRE_PROCESS
            r4 = 3
            com.google.android.gms.internal.ads.cc3[] r4 = new com.google.android.gms.internal.ads.cc3[r4]
            r4[r7] = r12
            r4[r5] = r0
            r4[r8] = r1
            com.google.android.gms.internal.ads.uv2 r13 = r13.mo7175a(r3, r4)
            com.google.android.gms.internal.ads.g22 r3 = new com.google.android.gms.internal.ads.g22
            r3.<init>(r1, r12, r0)
            com.google.android.gms.internal.ads.dw2 r12 = r13.mo11315a(r3)
        L_0x00c8:
            com.google.android.gms.internal.ads.dw2 r12 = r12.mo6686f(r2)
            com.google.android.gms.internal.ads.rv2 r12 = r12.mo6681a()
            return r12
        L_0x00d1:
            com.google.android.gms.internal.ads.s22 r12 = new com.google.android.gms.internal.ads.s22
            org.json.JSONObject r0 = r6.f8953b
            com.google.android.gms.internal.ads.yi0 r1 = r6.f8952a
            r12.<init>(r0, r1)
            com.google.android.gms.internal.ads.gw2 r0 = com.google.android.gms.internal.ads.gw2.HTTP
            com.google.android.gms.internal.ads.cc3 r12 = com.google.android.gms.internal.ads.rb3.m16131i(r12)
            com.google.android.gms.internal.ads.dw2 r12 = r13.mo7176b(r0, r12)
            com.google.android.gms.internal.ads.dw2 r12 = r12.mo6685e(r3)
            com.google.android.gms.internal.ads.dw2 r12 = r12.mo6685e(r4)
            com.google.android.gms.internal.ads.rv2 r12 = r12.mo6681a()
            com.google.android.gms.internal.ads.cc3 r0 = com.google.android.gms.internal.ads.rb3.m16131i(r6)
            com.google.android.gms.internal.ads.gw2 r1 = com.google.android.gms.internal.ads.gw2.PRE_PROCESS
            com.google.android.gms.internal.ads.cc3[] r3 = new com.google.android.gms.internal.ads.cc3[r8]
            r3[r7] = r12
            r3[r5] = r0
            com.google.android.gms.internal.ads.uv2 r13 = r13.mo7175a(r1, r3)
            com.google.android.gms.internal.ads.f22 r1 = new com.google.android.gms.internal.ads.f22
            r1.<init>(r12, r0)
            com.google.android.gms.internal.ads.dw2 r12 = r13.mo11315a(r1)
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m22.mo9109A5(com.google.android.gms.internal.ads.vi0, int):com.google.android.gms.internal.ads.cc3");
    }

    /* renamed from: B5 */
    public final cc3<InputStream> mo9110B5(vi0 vi0, int i) {
        cc0 b = C2694t.m21598g().mo10759b(this.f10688f, po0.m15177c());
        if (!m30.f10705a.mo9928e().booleanValue()) {
            return rb3.m16130h(new Exception("Signal collection disabled."));
        }
        bk2 a = this.f10691i.mo5980a(vi0, i);
        lj2<JSONObject> a2 = a.mo5875a();
        return a.mo5877c().mo7176b(gw2.GET_SIGNALS, rb3.m16131i(vi0.f16310f)).mo6686f(new z12(a2)).mo6682b(gw2.JS_SIGNALS).mo6686f(b.mo6122a("google.afma.request.getSignals", zb0.f18143b, zb0.f18144c)).mo6681a();
    }

    /* renamed from: C5 */
    public final cc3<InputStream> mo9111C5(String str) {
        if (!h30.f8027a.mo9928e().booleanValue()) {
            return rb3.m16130h(new Exception("Split request is disabled."));
        }
        h22 h22 = new h22(this);
        if ((h30.f8030d.mo9928e().booleanValue() ? m13019F5(str) : m13018E5(str)) != null) {
            return rb3.m16131i(h22);
        }
        String valueOf = String.valueOf(str);
        return rb3.m16130h(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D5 */
    public final /* synthetic */ InputStream mo9112D5(cc3 cc3, cc3 cc32, vi0 vi0) {
        String c = ((yi0) cc3.get()).mo12029c();
        String str = vi0.f16317m;
        m13022I5(new j22((yi0) cc3.get(), (JSONObject) cc32.get(), str, c));
        return new ByteArrayInputStream(c.getBytes(c43.f5304c));
    }

    /* renamed from: F0 */
    public final void mo8959F0(vi0 vi0, ri0 ri0) {
        m13023J5(mo9110B5(vi0, Binder.getCallingUid()), ri0);
    }

    /* renamed from: T0 */
    public final void mo8960T0(String str, ri0 ri0) {
        m13023J5(mo9111C5(str), ri0);
    }

    /* renamed from: T1 */
    public final void mo8961T1(vi0 vi0, ri0 ri0) {
        m13023J5(mo9114z5(vi0, Binder.getCallingUid()), ri0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo9113j() {
        zo0.m20769a(this.f10690h.mo7643a(), "persistFlags");
    }

    /* renamed from: w4 */
    public final void mo8962w4(vi0 vi0, ri0 ri0) {
        cc3<InputStream> A5 = mo9109A5(vi0, Binder.getCallingUid());
        m13023J5(A5, ri0);
        A5.mo5905b(new b22(this), this.f10689g);
    }

    /* renamed from: z5 */
    public final cc3<InputStream> mo9114z5(vi0 vi0, int i) {
        if (!h30.f8027a.mo9928e().booleanValue()) {
            return rb3.m16130h(new Exception("Split request is disabled."));
        }
        au2 au2 = vi0.f16318n;
        if (au2 == null) {
            return rb3.m16130h(new Exception("Pool configuration missing from request."));
        }
        if (au2.f4354j == 0 || au2.f4355k == 0) {
            return rb3.m16130h(new Exception("Caching is disabled."));
        }
        cc0 b = C2694t.m21598g().mo10759b(this.f10688f, po0.m15177c());
        bk2 a = this.f10691i.mo5980a(vi0, i);
        nw2 c = a.mo5877c();
        cc3<JSONObject> H5 = m13021H5(vi0, c, a);
        cc3<yi0> G5 = m13020G5(H5, c, b);
        return c.mo7175a(gw2.GET_URL_AND_CACHE_KEY, H5, G5).mo11315a(new c22(this, G5, H5, vi0)).mo6681a();
    }
}
