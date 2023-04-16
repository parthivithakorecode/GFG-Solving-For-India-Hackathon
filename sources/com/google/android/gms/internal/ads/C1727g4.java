package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g4 */
public final class C1727g4 {

    /* renamed from: a */
    private String f7264a;

    /* renamed from: b */
    private Uri f7265b;

    /* renamed from: c */
    private final C1803i6 f7266c = new C1803i6();

    /* renamed from: d */
    private final C2031oc f7267d = new C2031oc((C1993nb) null);

    /* renamed from: e */
    private final List f7268e = Collections.emptyList();

    /* renamed from: f */
    private final e73<C2375xm> f7269f = e73.m8347v();

    /* renamed from: g */
    private final C2145rf f7270g = new C2145rf();

    /* renamed from: a */
    public final C1727g4 mo7501a(String str) {
        this.f7264a = str;
        return this;
    }

    /* renamed from: b */
    public final C1727g4 mo7502b(Uri uri) {
        this.f7265b = uri;
        return this;
    }

    /* renamed from: c */
    public final C2451zo mo7503c() {
        Uri uri = this.f7265b;
        C2374xl xlVar = uri != null ? new C2374xl(uri, (String) null, (C2069pd) null, (C1689f3) null, this.f7268e, (String) null, this.f7269f, (Object) null, (C2336wk) null) : null;
        String str = this.f7264a;
        if (str == null) {
            str = "";
        }
        return new C2451zo(str, new C1955ma(this.f7266c, (C1917l9) null), xlVar, new C2221th(this.f7270g), C1716fu.f6932t, (C2413yn) null);
    }
}
