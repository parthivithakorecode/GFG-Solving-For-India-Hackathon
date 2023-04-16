package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

abstract class x43 extends v33<String> {

    /* renamed from: h */
    final CharSequence f17026h;

    /* renamed from: i */
    final b43 f17027i;

    /* renamed from: j */
    int f17028j = 0;

    /* renamed from: k */
    int f17029k;

    protected x43(z43 z43, CharSequence charSequence) {
        this.f17027i = z43.f18025a;
        this.f17029k = Integer.MAX_VALUE;
        this.f17026h = charSequence;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11377a() {
        int i;
        int i2 = this.f17028j;
        while (true) {
            int i3 = this.f17028j;
            if (i3 != -1) {
                int d = mo10724d(i3);
                if (d == -1) {
                    d = this.f17026h.length();
                    this.f17028j = -1;
                    i = -1;
                } else {
                    i = mo10723c(d);
                    this.f17028j = i;
                }
                if (i == i2) {
                    int i4 = i + 1;
                    this.f17028j = i4;
                    if (i4 > this.f17026h.length()) {
                        this.f17028j = -1;
                    }
                } else {
                    if (i2 < d) {
                        this.f17026h.charAt(i2);
                    }
                    if (i2 < d) {
                        this.f17026h.charAt(d - 1);
                    }
                    int i5 = this.f17029k;
                    if (i5 == 1) {
                        d = this.f17026h.length();
                        this.f17028j = -1;
                        if (d > i2) {
                            this.f17026h.charAt(d - 1);
                        }
                    } else {
                        this.f17029k = i5 - 1;
                    }
                    return this.f17026h.subSequence(i2, d).toString();
                }
            } else {
                mo11378b();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo10723c(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo10724d(int i);
}
