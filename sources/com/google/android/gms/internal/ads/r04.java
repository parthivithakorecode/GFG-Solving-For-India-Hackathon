package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class r04 {

    /* renamed from: a */
    public final long f13431a;

    /* renamed from: b */
    public final ei0 f13432b;

    /* renamed from: c */
    public final int f13433c;

    /* renamed from: d */
    public final s54 f13434d;

    /* renamed from: e */
    public final long f13435e;

    /* renamed from: f */
    public final ei0 f13436f;

    /* renamed from: g */
    public final int f13437g;

    /* renamed from: h */
    public final s54 f13438h;

    /* renamed from: i */
    public final long f13439i;

    /* renamed from: j */
    public final long f13440j;

    public r04(long j, ei0 ei0, int i, s54 s54, long j2, ei0 ei02, int i2, s54 s542, long j3, long j4) {
        this.f13431a = j;
        this.f13432b = ei0;
        this.f13433c = i;
        this.f13434d = s54;
        this.f13435e = j2;
        this.f13436f = ei02;
        this.f13437g = i2;
        this.f13438h = s542;
        this.f13439i = j3;
        this.f13440j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r04.class == obj.getClass()) {
            r04 r04 = (r04) obj;
            return this.f13431a == r04.f13431a && this.f13433c == r04.f13433c && this.f13435e == r04.f13435e && this.f13437g == r04.f13437g && this.f13439i == r04.f13439i && this.f13440j == r04.f13440j && m43.m13055a(this.f13432b, r04.f13432b) && m43.m13055a(this.f13434d, r04.f13434d) && m43.m13055a(this.f13436f, r04.f13436f) && m43.m13055a(this.f13438h, r04.f13438h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13431a), this.f13432b, Integer.valueOf(this.f13433c), this.f13434d, Long.valueOf(this.f13435e), this.f13436f, Integer.valueOf(this.f13437g), this.f13438h, Long.valueOf(this.f13439i), Long.valueOf(this.f13440j)});
    }
}
