package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import p054h1.C2694t;

final class zx1 implements nb3<String> {

    /* renamed from: a */
    final /* synthetic */ cy1 f18397a;

    zx1(cy1 cy1) {
        this.f18397a = cy1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.f18397a.f5559c = true;
            this.f18397a.m7620u("com.google.android.gms.ads.MobileAds", true, "", (int) (C2694t.m21592a().mo12463b() - this.f18397a.f5560d));
            this.f18397a.f5565i.execute(new yx1(this, str));
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        synchronized (this) {
            this.f18397a.f5559c = true;
            this.f18397a.m7620u("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (C2694t.m21592a().mo12463b() - this.f18397a.f5560d));
            this.f18397a.f5561e.mo5908f(new Exception());
        }
    }
}
