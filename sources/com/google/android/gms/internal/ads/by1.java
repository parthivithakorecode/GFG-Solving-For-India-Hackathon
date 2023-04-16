package com.google.android.gms.internal.ads;

import p054h1.C2694t;

final class by1 extends i90 {

    /* renamed from: f */
    final /* synthetic */ Object f5189f;

    /* renamed from: g */
    final /* synthetic */ String f5190g;

    /* renamed from: h */
    final /* synthetic */ long f5191h;

    /* renamed from: i */
    final /* synthetic */ bp0 f5192i;

    /* renamed from: j */
    final /* synthetic */ cy1 f5193j;

    by1(cy1 cy1, Object obj, String str, long j, bp0 bp0) {
        this.f5193j = cy1;
        this.f5189f = obj;
        this.f5190g = str;
        this.f5191h = j;
        this.f5192i = bp0;
    }

    /* renamed from: d */
    public final void mo5992d() {
        synchronized (this.f5189f) {
            this.f5193j.m7620u(this.f5190g, true, "", (int) (C2694t.m21592a().mo12463b() - this.f5191h));
            this.f5193j.f5568l.mo7722c(this.f5190g);
            this.f5193j.f5571o.mo10984d0(this.f5190g);
            this.f5192i.mo5907e(Boolean.TRUE);
        }
    }

    /* renamed from: u */
    public final void mo5993u(String str) {
        synchronized (this.f5189f) {
            this.f5193j.m7620u(this.f5190g, false, str, (int) (C2694t.m21592a().mo12463b() - this.f5191h));
            this.f5193j.f5568l.mo7720a(this.f5190g, "error");
            this.f5193j.f5571o.mo10987z(this.f5190g, "error");
            this.f5192i.mo5907e(Boolean.FALSE);
        }
    }
}
