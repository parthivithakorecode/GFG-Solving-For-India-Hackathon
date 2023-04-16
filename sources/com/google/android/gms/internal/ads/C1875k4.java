package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k4 */
public final class C1875k4 {

    /* renamed from: a */
    private final String f9387a;

    /* renamed from: b */
    private final int f9388b;

    /* renamed from: c */
    private final int f9389c;

    /* renamed from: d */
    private int f9390d;

    /* renamed from: e */
    private String f9391e;

    public C1875k4(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f9387a = str;
        this.f9388b = i2;
        this.f9389c = i3;
        this.f9390d = Integer.MIN_VALUE;
        this.f9391e = "";
    }

    /* renamed from: d */
    private final void m12003d() {
        if (this.f9390d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final int mo8610a() {
        m12003d();
        return this.f9390d;
    }

    /* renamed from: b */
    public final String mo8611b() {
        m12003d();
        return this.f9391e;
    }

    /* renamed from: c */
    public final void mo8612c() {
        int i = this.f9390d;
        int i2 = i == Integer.MIN_VALUE ? this.f9388b : i + this.f9389c;
        this.f9390d = i2;
        String str = this.f9387a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i2);
        this.f9391e = sb.toString();
    }
}
