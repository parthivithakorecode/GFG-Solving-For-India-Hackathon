package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

public class kp0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f9589a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f9590b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f9591c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final e73<String> f9592d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final e73<String> f9593e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final e73<String> f9594f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public e73<String> f9595g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f9596h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final i73<gk0, mr0> f9597i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final p73<Integer> f9598j;

    @Deprecated
    public kp0() {
        this.f9589a = Integer.MAX_VALUE;
        this.f9590b = Integer.MAX_VALUE;
        this.f9591c = true;
        this.f9592d = e73.m8347v();
        this.f9593e = e73.m8347v();
        this.f9594f = e73.m8347v();
        this.f9595g = e73.m8347v();
        this.f9596h = 0;
        this.f9597i = i73.m10947d();
        this.f9598j = p73.m14867s();
    }

    protected kp0(ns0 ns0) {
        this.f9589a = ns0.f11660i;
        this.f9590b = ns0.f11661j;
        this.f9591c = ns0.f11662k;
        this.f9592d = ns0.f11663l;
        this.f9593e = ns0.f11664m;
        this.f9594f = ns0.f11668q;
        this.f9595g = ns0.f11669r;
        this.f9596h = ns0.f11670s;
        this.f9597i = ns0.f11674w;
        this.f9598j = ns0.f11675x;
    }

    /* renamed from: d */
    public final kp0 mo8726d(Context context) {
        CaptioningManager captioningManager;
        int i = n13.f11236a;
        if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f9596h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f9595g = e73.m8348w(n13.m13636i(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public kp0 mo7260e(int i, int i2, boolean z) {
        this.f9589a = i;
        this.f9590b = i2;
        this.f9591c = true;
        return this;
    }
}
