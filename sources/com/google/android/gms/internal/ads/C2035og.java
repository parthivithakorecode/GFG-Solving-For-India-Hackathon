package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.og */
public class C2035og {

    /* renamed from: a */
    private int f12020a;

    /* renamed from: a */
    public final void mo9758a(int i) {
        this.f12020a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo9759b() {
        this.f12020a = 0;
    }

    /* renamed from: c */
    public final void mo9760c(int i) {
        this.f12020a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo9761d(int i) {
        return (this.f12020a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo9762e() {
        return mo9761d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean mo9763f() {
        return mo9761d(4);
    }

    /* renamed from: g */
    public final boolean mo9764g() {
        return mo9761d(1);
    }
}
