package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

public final class g94 {

    /* renamed from: a */
    private final s84[] f7324a = new s84[1];

    /* renamed from: b */
    private int f7325b;

    /* renamed from: c */
    private int f7326c;

    /* renamed from: d */
    private int f7327d = 0;

    /* renamed from: e */
    private s84[] f7328e = new s84[100];

    public g94(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo7536a() {
        return this.f7326c * 65536;
    }

    /* renamed from: b */
    public final synchronized s84 mo7537b() {
        s84 s84;
        this.f7326c++;
        int i = this.f7327d;
        if (i > 0) {
            s84[] s84Arr = this.f7328e;
            int i2 = i - 1;
            this.f7327d = i2;
            s84 = s84Arr[i2];
            Objects.requireNonNull(s84);
            s84Arr[i2] = null;
        } else {
            s84 = new s84(new byte[65536], 0);
        }
        return s84;
    }

    /* renamed from: c */
    public final synchronized void mo7538c(s84 s84) {
        s84[] s84Arr = this.f7324a;
        s84Arr[0] = s84;
        mo7539d(s84Arr);
    }

    /* renamed from: d */
    public final synchronized void mo7539d(s84[] s84Arr) {
        int i = this.f7327d;
        int i2 = i + r1;
        s84[] s84Arr2 = this.f7328e;
        int length = s84Arr2.length;
        if (i2 >= length) {
            this.f7328e = (s84[]) Arrays.copyOf(s84Arr2, Math.max(length + length, i2));
        }
        for (s84 s84 : s84Arr) {
            s84[] s84Arr3 = this.f7328e;
            int i3 = this.f7327d;
            this.f7327d = i3 + 1;
            s84Arr3[i3] = s84;
        }
        this.f7326c -= s84Arr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo7540e() {
        mo7541f(0);
    }

    /* renamed from: f */
    public final synchronized void mo7541f(int i) {
        int i2 = this.f7325b;
        this.f7325b = i;
        if (i < i2) {
            mo7542g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo7542g() {
        int max = Math.max(0, n13.m13606K(this.f7325b, 65536) - this.f7326c);
        int i = this.f7327d;
        if (max < i) {
            Arrays.fill(this.f7328e, max, i, (Object) null);
            this.f7327d = max;
        }
    }
}
