package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p034e2.C2547d;

public final class r82 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2547d f13536a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final s82 f13537b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final cy2 f13538c;

    /* renamed from: d */
    private final List<String> f13539d = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f13540e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final f52 f13541f;

    public r82(C2547d dVar, s82 s82, f52 f52, cy2 cy2) {
        this.f13536a = dVar;
        this.f13537b = s82;
        this.f13540e = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10537k5)).booleanValue();
        this.f13541f = f52;
        this.f13538c = cy2;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m16095g(r82 r82, String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        r82.f13539d.add(sb2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final <T> cc3<T> mo10492e(ds2 ds2, rr2 rr2, cc3<T> cc3, zx2 zx2) {
        ur2 ur2 = ds2.f5904b.f5509b;
        long b = this.f13536a.mo12463b();
        String str = rr2.f13918x;
        if (str != null) {
            rb3.m16140r(cc3, new q82(this, b, str, rr2, ur2, zx2, ds2), wo0.f16891f);
        }
        return cc3;
    }

    /* renamed from: f */
    public final String mo10493f() {
        return TextUtils.join("_", this.f13539d);
    }
}
