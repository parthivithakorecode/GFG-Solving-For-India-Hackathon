package com.google.android.gms.internal.ads;

final class k24 implements l14 {

    /* renamed from: a */
    final /* synthetic */ l24 f9353a;

    /* synthetic */ k24(l24 l24, j24 j24) {
        this.f9353a = l24;
    }

    /* renamed from: a */
    public final void mo8591a() {
        if (this.f9353a.f9863Q0 != null) {
            this.f9353a.f9863Q0.mo11123a();
        }
    }

    /* renamed from: b */
    public final void mo8592b(Exception exc) {
        oc2.m14399a("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f9353a.f9854H0.mo7783b(exc);
    }
}
