package com.google.android.gms.internal.ads;

public final class yw3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f17919a;

    /* renamed from: b */
    public rx3 f17920b;

    /* renamed from: c */
    public int f17921c;

    /* renamed from: d */
    public boolean f17922d;

    /* renamed from: e */
    public int f17923e;

    /* renamed from: f */
    public boolean f17924f;

    /* renamed from: g */
    public int f17925g;

    public yw3(rx3 rx3) {
        this.f17920b = rx3;
    }

    /* renamed from: a */
    public final void mo12101a(int i) {
        boolean z = true;
        if (true != (this.f17919a | i)) {
            z = false;
        }
        this.f17919a = z;
        this.f17921c += i;
    }

    /* renamed from: b */
    public final void mo12102b(int i) {
        this.f17919a = true;
        this.f17924f = true;
        this.f17925g = i;
    }

    /* renamed from: c */
    public final void mo12103c(rx3 rx3) {
        this.f17919a |= this.f17920b != rx3;
        this.f17920b = rx3;
    }

    /* renamed from: d */
    public final void mo12104d(int i) {
        boolean z = true;
        if (!this.f17922d || this.f17923e == 5) {
            this.f17919a = true;
            this.f17922d = true;
            this.f17923e = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        wu1.m19205d(z);
    }
}
