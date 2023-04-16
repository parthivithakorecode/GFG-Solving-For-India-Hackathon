package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class mn0 {

    /* renamed from: a */
    private long f10959a = -1;

    /* renamed from: b */
    private long f10960b = -1;

    /* renamed from: c */
    final /* synthetic */ nn0 f10961c;

    public mn0(nn0 nn0) {
        this.f10961c = nn0;
    }

    /* renamed from: a */
    public final long mo9317a() {
        return this.f10960b;
    }

    /* renamed from: b */
    public final Bundle mo9318b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f10959a);
        bundle.putLong("tclose", this.f10960b);
        return bundle;
    }

    /* renamed from: c */
    public final void mo9319c() {
        this.f10960b = this.f10961c.f11555a.mo12463b();
    }

    /* renamed from: d */
    public final void mo9320d() {
        this.f10959a = this.f10961c.f11555a.mo12463b();
    }
}
