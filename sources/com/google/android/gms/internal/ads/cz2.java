package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public final class cz2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    private static final cz2 f5590f = new cz2();

    /* renamed from: a */
    private Context f5591a;

    /* renamed from: b */
    private BroadcastReceiver f5592b;

    /* renamed from: c */
    private boolean f5593c;

    /* renamed from: d */
    private boolean f5594d;

    /* renamed from: e */
    private hz2 f5595e;

    private cz2() {
    }

    /* renamed from: a */
    public static cz2 m7667a() {
        return f5590f;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m7668b(cz2 cz2, boolean z) {
        if (cz2.f5594d != z) {
            cz2.f5594d = z;
            if (cz2.f5593c) {
                cz2.m7669h();
                if (cz2.f5595e == null) {
                    return;
                }
                if (cz2.mo6351f()) {
                    e03.m8240d().mo6769i();
                } else {
                    e03.m8240d().mo6768h();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m7669h() {
        boolean z = this.f5594d;
        for (py2 g : az2.m6457a().mo5587c()) {
            oz2 g2 = g.mo10203g();
            if (g2.mo9903k()) {
                gz2.m10168a().mo7769b(g2.mo9893a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: c */
    public final void mo6348c(Context context) {
        this.f5591a = context.getApplicationContext();
    }

    /* renamed from: d */
    public final void mo6349d() {
        this.f5592b = new bz2(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f5591a.registerReceiver(this.f5592b, intentFilter);
        this.f5593c = true;
        m7669h();
    }

    /* renamed from: e */
    public final void mo6350e() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f5591a;
        if (!(context == null || (broadcastReceiver = this.f5592b) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.f5592b = null;
        }
        this.f5593c = false;
        this.f5594d = false;
        this.f5595e = null;
    }

    /* renamed from: f */
    public final boolean mo6351f() {
        return !this.f5594d;
    }

    /* renamed from: g */
    public final void mo6352g(hz2 hz2) {
        this.f5595e = hz2;
    }
}
