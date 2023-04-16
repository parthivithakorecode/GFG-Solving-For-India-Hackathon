package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public abstract class eb1 implements he1 {

    /* renamed from: a */
    private final boolean f6155a;

    /* renamed from: b */
    private final ArrayList<vt1> f6156b = new ArrayList<>(1);

    /* renamed from: c */
    private int f6157c;

    /* renamed from: d */
    private li1 f6158d;

    protected eb1(boolean z) {
        this.f6155a = z;
    }

    /* renamed from: j */
    public final void mo6892j(vt1 vt1) {
        Objects.requireNonNull(vt1);
        if (!this.f6156b.contains(vt1)) {
            this.f6156b.add(vt1);
            this.f6157c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo6893o(int i) {
        li1 li1 = this.f6158d;
        int i2 = n13.f11236a;
        for (int i3 = 0; i3 < this.f6157c; i3++) {
            this.f6156b.get(i3).mo8429e(this, li1, this.f6155a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo6894p() {
        li1 li1 = this.f6158d;
        int i = n13.f11236a;
        for (int i2 = 0; i2 < this.f6157c; i2++) {
            this.f6156b.get(i2).mo8430i(this, li1, this.f6155a);
        }
        this.f6158d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6895q(li1 li1) {
        for (int i = 0; i < this.f6157c; i++) {
            this.f6156b.get(i).mo8428a(this, li1, this.f6155a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo6896r(li1 li1) {
        this.f6158d = li1;
        for (int i = 0; i < this.f6157c; i++) {
            this.f6156b.get(i).mo8431v(this, li1, this.f6155a);
        }
    }

    public /* synthetic */ Map zza() {
        return Collections.emptyMap();
    }
}
