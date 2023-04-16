package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class co1 {

    /* renamed from: a */
    private final et1 f5477a;

    /* renamed from: b */
    private final rr1 f5478b;

    /* renamed from: c */
    private final l31 f5479c;

    /* renamed from: d */
    private final zm1 f5480d;

    public co1(et1 et1, rr1 rr1, l31 l31, zm1 zm1) {
        this.f5477a = et1;
        this.f5478b = rr1;
        this.f5479c = l31;
        this.f5480d = zm1;
    }

    /* renamed from: a */
    public final View mo6238a() {
        eu0 a = this.f5477a.mo7072a(C2087pv.m15287e(), (rr2) null, (ur2) null);
        ((View) a).setVisibility(8);
        a.mo7080F0("/sendMessageToSdk", new wn1(this));
        a.mo7080F0("/adMuted", new xn1(this));
        this.f5478b.mo10660j(new WeakReference(a), "/loadHtml", new yn1(this));
        this.f5478b.mo10660j(new WeakReference(a), "/showOverlay", new zn1(this));
        this.f5478b.mo10660j(new WeakReference(a), "/hideOverlay", new ao1(this));
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo6239b(eu0 eu0, Map map) {
        this.f5478b.mo10657g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo6240c(eu0 eu0, Map map) {
        this.f5480d.mo10122d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo6241d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f5478b.mo10657g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo6242e(eu0 eu0, Map map) {
        io0.m11130f("Showing native ads overlay.");
        eu0.mo7105Y().setVisibility(0);
        this.f5479c.mo8861d(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo6243f(eu0 eu0, Map map) {
        io0.m11130f("Hiding native ads overlay.");
        eu0.mo7105Y().setVisibility(8);
        this.f5479c.mo8861d(false);
    }
}
