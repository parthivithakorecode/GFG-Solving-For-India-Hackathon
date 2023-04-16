package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p048g2.C2635a;
import p054h1.C2694t;
import p069j1.C3163g2;
import p102o.C3801a;

public final class mm1 extends v61 {

    /* renamed from: A */
    private final Context f10932A;

    /* renamed from: B */
    private final om1 f10933B;

    /* renamed from: C */
    private final pc2 f10934C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Map<String, Boolean> f10935D = new HashMap();

    /* renamed from: E */
    private final List<C1524ao> f10936E = new ArrayList();

    /* renamed from: F */
    private final C1561bo f10937F;

    /* renamed from: i */
    private final Executor f10938i;

    /* renamed from: j */
    private final rm1 f10939j;

    /* renamed from: k */
    private final zm1 f10940k;

    /* renamed from: l */
    private final rn1 f10941l;

    /* renamed from: m */
    private final wm1 f10942m;

    /* renamed from: n */
    private final cn1 f10943n;

    /* renamed from: o */
    private final ev3<vq1> f10944o;

    /* renamed from: p */
    private final ev3<tq1> f10945p;

    /* renamed from: q */
    private final ev3<ar1> f10946q;

    /* renamed from: r */
    private final ev3<qq1> f10947r;

    /* renamed from: s */
    private final ev3<yq1> f10948s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public mo1 f10949t;

    /* renamed from: u */
    private boolean f10950u;

    /* renamed from: v */
    private boolean f10951v;

    /* renamed from: w */
    private boolean f10952w;

    /* renamed from: x */
    private final xl0 f10953x;

    /* renamed from: y */
    private final C1734gb f10954y;

    /* renamed from: z */
    private final po0 f10955z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mm1(u61 u61, Executor executor, rm1 rm1, zm1 zm1, rn1 rn1, wm1 wm1, cn1 cn1, ev3<vq1> ev3, ev3<tq1> ev32, ev3<ar1> ev33, ev3<qq1> ev34, ev3<yq1> ev35, xl0 xl0, C1734gb gbVar, po0 po0, Context context, om1 om1, pc2 pc2, C1561bo boVar) {
        super(u61);
        this.f10938i = executor;
        this.f10939j = rm1;
        this.f10940k = zm1;
        this.f10941l = rn1;
        this.f10942m = wm1;
        this.f10943n = cn1;
        this.f10944o = ev3;
        this.f10945p = ev32;
        this.f10946q = ev33;
        this.f10947r = ev34;
        this.f10948s = ev35;
        this.f10953x = xl0;
        this.f10954y = gbVar;
        this.f10955z = po0;
        this.f10932A = context;
        this.f10933B = om1;
        this.f10934C = pc2;
        this.f10937F = boVar;
    }

    /* renamed from: G */
    public static /* synthetic */ void m13353G(mm1 mm1) {
        try {
            int K = mm1.f10939j.mo10557K();
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 6) {
                            if (K != 7) {
                                io0.m11128d("Wrong native template id!");
                            } else if (mm1.f10943n.mo6233g() != null) {
                                mm1.f10943n.mo6233g().mo5757m1(mm1.f10947r.mo7166a());
                            }
                        } else if (mm1.f10943n.mo6232f() != null) {
                            mm1.mo9289J("Google", true);
                            mm1.f10943n.mo6232f().mo8667q1(mm1.f10946q.mo7166a());
                        }
                    } else if (mm1.f10943n.mo6230d(mm1.f10939j.mo10585g0()) != null) {
                        if (mm1.f10939j.mo10572Z() != null) {
                            mm1.mo9289J("Google", true);
                        }
                        mm1.f10943n.mo6230d(mm1.f10939j.mo10585g0()).mo9691u1(mm1.f10948s.mo7166a());
                    }
                } else if (mm1.f10943n.mo6227a() != null) {
                    mm1.mo9289J("Google", true);
                    mm1.f10943n.mo6227a().mo7507b2(mm1.f10945p.mo7166a());
                }
            } else if (mm1.f10943n.mo6228b() != null) {
                mm1.mo9289J("Google", true);
                mm1.f10943n.mo6228b().mo8345q4(mm1.f10944o.mo7166a());
            }
        } catch (RemoteException e) {
            io0.m11129e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: w */
    public static boolean m13354w(View view) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10476d7)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        C2694t.m21608q();
        long a = C3163g2.m23918a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (a >= ((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10485e7)).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final synchronized void mo9292M(mo1 mo1) {
        View view;
        C1585cb c;
        if (!this.f10950u) {
            this.f10949t = mo1;
            this.f10941l.mo10615e(mo1);
            this.f10940k.mo10138s(mo1.mo8702d(), mo1.mo8713o(), mo1.mo8710m(), mo1, mo1);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10363Q1)).booleanValue() && (c = this.f10954y.mo7560c()) != null) {
                c.mo6111b(mo1.mo8702d());
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10551m1)).booleanValue()) {
                rr2 rr2 = this.f15922b;
                if (rr2.f13901i0) {
                    Iterator<String> keys = rr2.f13899h0.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = this.f10949t.mo8708k().get(next);
                            this.f10935D.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                C1524ao aoVar = new C1524ao(this.f10932A, view);
                                this.f10936E.add(aoVar);
                                aoVar.mo5329c(new lm1(this, next));
                            }
                        }
                    }
                }
            }
            if (mo1.mo8705h() != null) {
                mo1.mo8705h().mo5329c(this.f10953x);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void mo9293N(mo1 mo1) {
        this.f10940k.mo10132m(mo1.mo8702d(), mo1.mo8708k());
        if (mo1.mo8703f() != null) {
            mo1.mo8703f().setClickable(false);
            mo1.mo8703f().removeAllViews();
        }
        if (mo1.mo8705h() != null) {
            mo1.mo8705h().mo5331e(this.f10953x);
        }
        this.f10949t = null;
    }

    /* renamed from: A */
    public final om1 mo9283A() {
        return this.f10933B;
    }

    /* renamed from: C */
    public final String mo9284C() {
        return this.f10942m.mo11493a();
    }

    /* renamed from: E */
    public final synchronized JSONObject mo9285E(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f10940k.mo10121c(view, map, map2);
    }

    /* renamed from: F */
    public final synchronized JSONObject mo9286F(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f10940k.mo10139t(view, map, map2);
    }

    /* renamed from: H */
    public final void mo9287H(View view) {
        C2635a c0 = this.f10939j.mo10577c0();
        if (this.f10942m.mo11495c() && c0 != null && view != null) {
            C2694t.m21600i().mo10787R(c0, view);
        }
    }

    /* renamed from: I */
    public final synchronized void mo9288I() {
        this.f10940k.mo10123e();
    }

    /* renamed from: J */
    public final void mo9289J(String str, boolean z) {
        String str2;
        ug0 ug0;
        vg0 vg0;
        if (this.f10942m.mo11495c() && !TextUtils.isEmpty(str)) {
            eu0 Y = this.f10939j.mo10571Y();
            eu0 Z = this.f10939j.mo10572Z();
            if (Y != null || Z != null) {
                if (Y != null) {
                    str2 = null;
                } else {
                    str2 = "javascript";
                    Y = Z;
                }
                String str3 = str2;
                if (!C2694t.m21600i().mo10791V(this.f10932A)) {
                    io0.m11131g("Failed to initialize omid in InternalNativeAd");
                    return;
                }
                po0 po0 = this.f10955z;
                int i = po0.f12730g;
                int i2 = po0.f12731h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                if (Z != null) {
                    ug0 = ug0.VIDEO;
                    vg0 = vg0.DEFINED_BY_JAVASCRIPT;
                } else {
                    ug0 = ug0.NATIVE_DISPLAY;
                    vg0 = this.f10939j.mo10557K() == 3 ? vg0.UNSPECIFIED : vg0.ONE_PIXEL;
                }
                C2635a T = C2694t.m21600i().mo10789T(sb2, Y.mo7150w(), "", "javascript", str3, str, vg0, ug0, this.f15922b.f13903j0);
                if (T == null) {
                    io0.m11131g("Failed to create omid session in InternalNativeAd");
                    return;
                }
                this.f10939j.mo10555B(T);
                Y.mo7095N0(T);
                if (Z != null) {
                    C2694t.m21600i().mo10790U(T, Z.mo7105Y());
                    this.f10952w = true;
                }
                if (z) {
                    C2694t.m21600i().mo10785P(T);
                    Y.mo6424t("onSdkLoaded", new C3801a());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo9290K() {
        this.f10940k.mo10124f();
        this.f10939j.mo10584g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo9291L(boolean z) {
        this.f10940k.mo10136q(this.f10949t.mo8702d(), this.f10949t.mo8708k(), this.f10949t.mo8713o(), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        return;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9294O(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10951v     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10551m1     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.rr2 r0 = r3.f15922b     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.f13901i0     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r3.f10935D     // Catch:{ all -> 0x00a6 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a6 }
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r3.f10935D     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            r0 = 1
            if (r7 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.rn1 r7 = r3.f10941l     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.mo1 r1 = r3.f10949t     // Catch:{ all -> 0x00a6 }
            r7.mo10614d(r1)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.zm1 r7 = r3.f10940k     // Catch:{ all -> 0x00a6 }
            r7.mo10125g(r4, r5, r6)     // Catch:{ all -> 0x00a6 }
            r3.f10951v = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)
            return
        L_0x0058:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.m10.f10646x2     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r7 = r1.mo8579b(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00a6 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0074:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00a6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00a6 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00a6 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0074
            boolean r1 = m13354w(r1)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0074
            com.google.android.gms.internal.ads.rn1 r7 = r3.f10941l     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.mo1 r1 = r3.f10949t     // Catch:{ all -> 0x00a6 }
            r7.mo10614d(r1)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.zm1 r7 = r3.f10940k     // Catch:{ all -> 0x00a6 }
            r7.mo10125g(r4, r5, r6)     // Catch:{ all -> 0x00a6 }
            r3.f10951v = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)
            return
        L_0x00a4:
            monitor-exit(r3)
            return
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mm1.mo9294O(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: P */
    public final synchronized void mo9295P(C1979my myVar) {
        this.f10940k.mo10128j(myVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9296Q(android.view.View r9, android.view.View r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r12, boolean r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.rn1 r0 = r8.f10941l     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.mo1 r1 = r8.f10949t     // Catch:{ all -> 0x0033 }
            r0.mo10613c(r1)     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.zm1 r2 = r8.f10940k     // Catch:{ all -> 0x0033 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.mo10134o(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0033 }
            boolean r9 = r8.f10952w     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.rm1 r9 = r8.f10939j     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.eu0 r9 = r9.mo10572Z()     // Catch:{ all -> 0x0033 }
            if (r9 != 0) goto L_0x001f
            goto L_0x0031
        L_0x001f:
            com.google.android.gms.internal.ads.rm1 r9 = r8.f10939j     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.eu0 r9 = r9.mo10572Z()     // Catch:{ all -> 0x0033 }
            o.a r10 = new o.a     // Catch:{ all -> 0x0033 }
            r10.<init>()     // Catch:{ all -> 0x0033 }
            java.lang.String r11 = "onSdkAdUserInteractionClick"
            r9.mo6424t(r11, r10)     // Catch:{ all -> 0x0033 }
            monitor-exit(r8)
            return
        L_0x0031:
            monitor-exit(r8)
            return
        L_0x0033:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mm1.mo9296Q(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: R */
    public final synchronized void mo9297R(String str) {
        this.f10940k.mo10129k(str);
    }

    /* renamed from: S */
    public final synchronized void mo9298S(Bundle bundle) {
        this.f10940k.mo10120b(bundle);
    }

    /* renamed from: a */
    public final synchronized void mo9123a() {
        this.f10950u = true;
        this.f10938i.execute(new fm1(this));
        super.mo9123a();
    }

    /* renamed from: b */
    public final void mo6842b() {
        this.f10938i.execute(new gm1(this));
        if (this.f10939j.mo10557K() != 7) {
            Executor executor = this.f10938i;
            zm1 zm1 = this.f10940k;
            zm1.getClass();
            executor.execute(new km1(zm1));
        }
        super.mo6842b();
    }

    /* renamed from: h */
    public final synchronized void mo9299h() {
        mo1 mo1 = this.f10949t;
        if (mo1 == null) {
            io0.m11126b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f10938i.execute(new jm1(this, mo1 instanceof kn1));
        }
    }

    /* renamed from: i */
    public final synchronized void mo9300i() {
        if (!this.f10951v) {
            this.f10940k.mo10137r();
        }
    }

    /* renamed from: j */
    public final void mo9301j(View view) {
        C2635a c0 = this.f10939j.mo10577c0();
        eu0 Y = this.f10939j.mo10571Y();
        if (this.f10942m.mo11495c() && c0 != null && Y != null && view != null) {
            C2694t.m21600i().mo10790U(c0, view);
        }
    }

    /* renamed from: k */
    public final synchronized void mo9302k(View view, MotionEvent motionEvent, View view2) {
        this.f10940k.mo10126h(view, motionEvent, view2);
    }

    /* renamed from: l */
    public final synchronized void mo9303l(Bundle bundle) {
        this.f10940k.mo10130k0(bundle);
    }

    /* renamed from: m */
    public final synchronized void mo9304m(View view) {
        this.f10940k.mo10135p(view);
    }

    /* renamed from: n */
    public final synchronized void mo9305n() {
        this.f10940k.mo10140y();
    }

    /* renamed from: o */
    public final synchronized void mo9306o(C1868jy jyVar) {
        this.f10940k.mo10127i(jyVar);
    }

    /* renamed from: p */
    public final synchronized void mo9307p(C2350wy wyVar) {
        this.f10934C.mo10015a(wyVar);
    }

    /* renamed from: q */
    public final synchronized void mo9308q(e60 e60) {
        this.f10940k.mo10131l(e60);
    }

    /* renamed from: r */
    public final synchronized void mo9309r(mo1 mo1) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10533k1)).booleanValue()) {
            C3163g2.f20465i.post(new hm1(this, mo1));
        } else {
            mo9292M(mo1);
        }
    }

    /* renamed from: s */
    public final synchronized void mo9310s(mo1 mo1) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10533k1)).booleanValue()) {
            C3163g2.f20465i.post(new im1(this, mo1));
        } else {
            mo9293N(mo1);
        }
    }

    /* renamed from: t */
    public final boolean mo9311t() {
        return this.f10942m.mo11496d();
    }

    /* renamed from: u */
    public final synchronized boolean mo9312u() {
        return this.f10940k.mo10118U();
    }

    /* renamed from: v */
    public final boolean mo9313v() {
        return this.f10942m.mo11495c();
    }

    /* renamed from: x */
    public final synchronized boolean mo9314x(Bundle bundle) {
        if (this.f10951v) {
            return true;
        }
        boolean a = this.f10940k.mo10119a(bundle);
        this.f10951v = a;
        return a;
    }
}
