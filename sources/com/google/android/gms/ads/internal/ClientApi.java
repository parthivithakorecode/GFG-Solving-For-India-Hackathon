package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C1720fy;
import com.google.android.gms.internal.ads.C1867jx;
import com.google.android.gms.internal.ads.C2015nx;
import com.google.android.gms.internal.ads.C2087pv;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2349wx;
import com.google.android.gms.internal.ads.bn0;
import com.google.android.gms.internal.ads.bw0;
import com.google.android.gms.internal.ads.dd0;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.hx1;
import com.google.android.gms.internal.ads.jm2;
import com.google.android.gms.internal.ads.km2;
import com.google.android.gms.internal.ads.kn1;
import com.google.android.gms.internal.ads.kr2;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.mn1;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.ng0;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.pb2;
import com.google.android.gms.internal.ads.pj0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.up2;
import com.google.android.gms.internal.ads.yn2;
import com.google.android.gms.internal.ads.zg0;
import java.util.HashMap;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2693s;
import p061i1.C2803b0;
import p061i1.C2804c;
import p061i1.C2805d;
import p061i1.C2822u;
import p061i1.C2823v;
import p061i1.C2825x;

public class ClientApi extends C2349wx {
    /* renamed from: E0 */
    public final C1720fy mo4938E0(C2635a aVar, int i) {
        return bw0.m7089g((Context) C2637b.m21357C0(aVar), i).mo5601i();
    }

    /* renamed from: H3 */
    public final ng0 mo4939H3(C2635a aVar, dd0 dd0, int i) {
        return bw0.m7090h((Context) C2637b.m21357C0(aVar), dd0, i).mo5612t();
    }

    /* renamed from: I1 */
    public final fk0 mo4940I1(C2635a aVar, String str, dd0 dd0, int i) {
        Context context = (Context) C2637b.m21357C0(aVar);
        kr2 B = bw0.m7090h(context, dd0, i).mo5594B();
        B.mo8777a(context);
        B.mo8778b(str);
        return B.mo8779c().zza();
    }

    /* renamed from: M0 */
    public final pj0 mo4941M0(C2635a aVar, dd0 dd0, int i) {
        Context context = (Context) C2637b.m21357C0(aVar);
        kr2 B = bw0.m7090h(context, dd0, i).mo5594B();
        B.mo8777a(context);
        return B.mo8779c().mo9007a();
    }

    /* renamed from: O0 */
    public final C1867jx mo4942O0(C2635a aVar, String str, dd0 dd0, int i) {
        Context context = (Context) C2637b.m21357C0(aVar);
        return new pb2(bw0.m7090h(context, dd0, i), context, str);
    }

    /* renamed from: S1 */
    public final C2015nx mo4943S1(C2635a aVar, C2087pv pvVar, String str, dd0 dd0, int i) {
        Context context = (Context) C2637b.m21357C0(aVar);
        yn2 z = bw0.m7090h(context, dd0, i).mo5618z();
        z.mo8037Q(context);
        z.mo8038a(pvVar);
        z.mo8040s(str);
        return z.mo8039g().zza();
    }

    /* renamed from: b0 */
    public final zg0 mo4944b0(C2635a aVar) {
        Activity activity = (Activity) C2637b.m21357C0(aVar);
        AdOverlayInfoParcel c = AdOverlayInfoParcel.m5691c(activity.getIntent());
        if (c == null) {
            return new C2823v(activity);
        }
        int i = c.f3724p;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new C2823v(activity) : new C2803b0(activity) : new C2825x(activity, c) : new C2805d(activity) : new C2804c(activity) : new C2822u(activity);
    }

    /* renamed from: h3 */
    public final C2015nx mo4945h3(C2635a aVar, C2087pv pvVar, String str, dd0 dd0, int i) {
        Context context = (Context) C2637b.m21357C0(aVar);
        up2 A = bw0.m7090h(context, dd0, i).mo5593A();
        A.mo7765Q(context);
        A.mo7766a(pvVar);
        A.mo7768s(str);
        return A.mo7767g().zza();
    }

    /* renamed from: m2 */
    public final p80 mo4946m2(C2635a aVar, dd0 dd0, int i, n80 n80) {
        Context context = (Context) C2637b.m21357C0(aVar);
        hx1 r = bw0.m7090h(context, dd0, i).mo5610r();
        r.mo8031a(context);
        r.mo8032b(n80);
        return r.mo8033c().mo8288g();
    }

    /* renamed from: n1 */
    public final C2015nx mo4947n1(C2635a aVar, C2087pv pvVar, String str, dd0 dd0, int i) {
        Context context = (Context) C2637b.m21357C0(aVar);
        jm2 y = bw0.m7090h(context, dd0, i).mo5617y();
        y.mo8494b(str);
        y.mo8493a(context);
        km2 c = y.mo8495c();
        return i >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10309J3)).intValue() ? c.mo8693a() : c.zza();
    }

    /* renamed from: o2 */
    public final u40 mo4948o2(C2635a aVar, C2635a aVar2, C2635a aVar3) {
        return new kn1((View) C2637b.m21357C0(aVar), (HashMap) C2637b.m21357C0(aVar2), (HashMap) C2637b.m21357C0(aVar3));
    }

    /* renamed from: q3 */
    public final bn0 mo4949q3(C2635a aVar, dd0 dd0, int i) {
        return bw0.m7090h((Context) C2637b.m21357C0(aVar), dd0, i).mo5615w();
    }

    /* renamed from: v0 */
    public final q40 mo4950v0(C2635a aVar, C2635a aVar2) {
        return new mn1((FrameLayout) C2637b.m21357C0(aVar), (FrameLayout) C2637b.m21357C0(aVar2), 214106000);
    }

    /* renamed from: z1 */
    public final C2015nx mo4951z1(C2635a aVar, C2087pv pvVar, String str, int i) {
        return new C2693s((Context) C2637b.m21357C0(aVar), pvVar, str, new po0(214106000, i, true, false));
    }
}
