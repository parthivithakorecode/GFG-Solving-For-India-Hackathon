package com.google.android.gms.internal.ads;

final class pn2 implements bd2<m41> {

    /* renamed from: a */
    final /* synthetic */ qn2 f12722a;

    pn2(qn2 qn2) {
        this.f12722a = qn2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5807a(Object obj) {
        m41 m41 = (m41) obj;
        synchronized (this.f12722a) {
            m41 m412 = this.f12722a.f13251n;
            if (m412 != null) {
                m412.mo9123a();
            }
            qn2 qn2 = this.f12722a;
            qn2.f13251n = m41;
            m41.mo9125i(qn2);
            in2 z5 = this.f12722a.f13248k;
            qn2 qn22 = this.f12722a;
            z5.mo8178e(new n41(m41, qn22, qn22.f13248k));
            m41.mo6842b();
        }
    }

    public final void zza() {
        synchronized (this.f12722a) {
            this.f12722a.f13251n = null;
        }
    }
}
