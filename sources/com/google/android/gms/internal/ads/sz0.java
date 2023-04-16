package com.google.android.gms.internal.ads;

public class sz0 {

    /* renamed from: a */
    private int f14632a;

    /* renamed from: a */
    public final void mo10910a(int i) {
        this.f14632a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo10238b() {
        this.f14632a = 0;
    }

    /* renamed from: c */
    public final void mo10911c(int i) {
        this.f14632a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo10912d(int i) {
        return (this.f14632a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo10913e() {
        return mo10912d(268435456);
    }

    /* renamed from: f */
    public final boolean mo10914f() {
        return mo10912d(Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean mo10915g() {
        return mo10912d(4);
    }

    /* renamed from: h */
    public final boolean mo10916h() {
        return mo10912d(1);
    }
}
