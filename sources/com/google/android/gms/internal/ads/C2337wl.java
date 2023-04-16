package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wl */
public final class C2337wl {

    /* renamed from: a */
    private final C2114ql[] f16840a = new C2114ql[1];

    /* renamed from: b */
    private int f16841b;

    /* renamed from: c */
    private int f16842c;

    /* renamed from: d */
    private int f16843d = 0;

    /* renamed from: e */
    private C2114ql[] f16844e = new C2114ql[100];

    public C2337wl(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo11672a() {
        return this.f16842c * 65536;
    }

    /* renamed from: b */
    public final synchronized C2114ql mo11673b() {
        C2114ql qlVar;
        this.f16842c++;
        int i = this.f16843d;
        if (i > 0) {
            C2114ql[] qlVarArr = this.f16844e;
            int i2 = i - 1;
            this.f16843d = i2;
            qlVar = qlVarArr[i2];
            qlVarArr[i2] = null;
        } else {
            qlVar = new C2114ql(new byte[65536], 0);
        }
        return qlVar;
    }

    /* renamed from: c */
    public final synchronized void mo11674c(C2114ql qlVar) {
        C2114ql[] qlVarArr = this.f16840a;
        qlVarArr[0] = qlVar;
        mo11675d(qlVarArr);
    }

    /* renamed from: d */
    public final synchronized void mo11675d(C2114ql[] qlVarArr) {
        int i = this.f16843d;
        int i2 = i + r1;
        C2114ql[] qlVarArr2 = this.f16844e;
        int length = qlVarArr2.length;
        if (i2 >= length) {
            this.f16844e = (C2114ql[]) Arrays.copyOf(qlVarArr2, Math.max(length + length, i2));
        }
        for (C2114ql qlVar : qlVarArr) {
            byte[] bArr = qlVar.f13224a;
            C2114ql[] qlVarArr3 = this.f16844e;
            int i3 = this.f16843d;
            this.f16843d = i3 + 1;
            qlVarArr3[i3] = qlVar;
        }
        this.f16842c -= qlVarArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo11676e() {
        mo11677f(0);
    }

    /* renamed from: f */
    public final synchronized void mo11677f(int i) {
        int i2 = this.f16841b;
        this.f16841b = i;
        if (i < i2) {
            mo11678g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo11678g() {
        int max = Math.max(0, C2449zm.m20725d(this.f16841b, 65536) - this.f16842c);
        int i = this.f16843d;
        if (max < i) {
            Arrays.fill(this.f16844e, max, i, (Object) null);
            this.f16843d = max;
        }
    }
}
