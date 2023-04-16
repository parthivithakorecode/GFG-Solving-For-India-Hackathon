package com.google.android.gms.internal.ads;

final class wt2 {

    /* renamed from: a */
    private final vt2 f16931a = new vt2();

    /* renamed from: b */
    private int f16932b;

    /* renamed from: c */
    private int f16933c;

    /* renamed from: d */
    private int f16934d;

    /* renamed from: e */
    private int f16935e;

    /* renamed from: f */
    private int f16936f;

    wt2() {
    }

    /* renamed from: a */
    public final vt2 mo11723a() {
        vt2 a = this.f16931a.clone();
        vt2 vt2 = this.f16931a;
        vt2.f16404f = false;
        vt2.f16405g = false;
        return a;
    }

    /* renamed from: b */
    public final String mo11724b() {
        return "\n\tPool does not exist: " + this.f16934d + "\n\tNew pools created: " + this.f16932b + "\n\tPools removed: " + this.f16933c + "\n\tEntries added: " + this.f16936f + "\n\tNo entries retrieved: " + this.f16935e + "\n";
    }

    /* renamed from: c */
    public final void mo11725c() {
        this.f16936f++;
    }

    /* renamed from: d */
    public final void mo11726d() {
        this.f16932b++;
        this.f16931a.f16404f = true;
    }

    /* renamed from: e */
    public final void mo11727e() {
        this.f16935e++;
    }

    /* renamed from: f */
    public final void mo11728f() {
        this.f16934d++;
    }

    /* renamed from: g */
    public final void mo11729g() {
        this.f16933c++;
        this.f16931a.f16405g = true;
    }
}
