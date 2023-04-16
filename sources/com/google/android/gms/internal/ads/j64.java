package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class j64 extends d54<Integer> {

    /* renamed from: s */
    private static final C2451zo f9006s;

    /* renamed from: j */
    private final v54[] f9007j;

    /* renamed from: k */
    private final ei0[] f9008k;

    /* renamed from: l */
    private final ArrayList<v54> f9009l;

    /* renamed from: m */
    private final Map<Object, Long> f9010m;

    /* renamed from: n */
    private final e83<Object, z44> f9011n;

    /* renamed from: o */
    private int f9012o = -1;

    /* renamed from: p */
    private long[][] f9013p;

    /* renamed from: q */
    private i64 f9014q;

    /* renamed from: r */
    private final f54 f9015r;

    static {
        C1727g4 g4Var = new C1727g4();
        g4Var.mo7501a("MergingMediaSource");
        f9006s = g4Var.mo7503c();
    }

    public j64(boolean z, boolean z2, v54... v54Arr) {
        f54 f54 = new f54();
        this.f9007j = v54Arr;
        this.f9015r = f54;
        this.f9009l = new ArrayList<>(Arrays.asList(v54Arr));
        this.f9008k = new ei0[v54Arr.length];
        this.f9013p = new long[0][];
        this.f9010m = new HashMap();
        this.f9011n = n83.m13791a(8).mo8638b(2).mo8116c();
    }

    /* renamed from: B */
    public final C2451zo mo8361B() {
        v54[] v54Arr = this.f9007j;
        return v54Arr.length > 0 ? v54Arr[0].mo8361B() : f9006s;
    }

    /* renamed from: h */
    public final r54 mo8362h(s54 s54, g94 g94, long j) {
        int length = this.f9007j.length;
        r54[] r54Arr = new r54[length];
        int a = this.f9008k[0].mo6954a(s54.f7614a);
        for (int i = 0; i < length; i++) {
            r54Arr[i] = this.f9007j[i].mo8362h(s54.mo10736c(this.f9008k[i].mo6960f(a)), g94, j - this.f9013p[a][i]);
        }
        return new h64(this.f9015r, this.f9013p[a], r54Arr, (byte[]) null);
    }

    /* renamed from: j */
    public final void mo8363j(r54 r54) {
        h64 h64 = (h64) r54;
        int i = 0;
        while (true) {
            v54[] v54Arr = this.f9007j;
            if (i < v54Arr.length) {
                v54Arr[i].mo8363j(h64.mo7855m(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6387s(vt1 vt1) {
        super.mo6387s(vt1);
        for (int i = 0; i < this.f9007j.length; i++) {
            mo6392z(Integer.valueOf(i), this.f9007j[i]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo6388u() {
        super.mo6388u();
        Arrays.fill(this.f9008k, (Object) null);
        this.f9012o = -1;
        this.f9014q = null;
        this.f9009l.clear();
        Collections.addAll(this.f9009l, this.f9007j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* bridge */ /* synthetic */ s54 mo6389w(Object obj, s54 s54) {
        if (((Integer) obj).intValue() == 0) {
            return s54;
        }
        return null;
    }

    /* renamed from: x */
    public final void mo6390x() {
        i64 i64 = this.f9014q;
        if (i64 == null) {
            super.mo6390x();
            return;
        }
        throw i64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final /* bridge */ /* synthetic */ void mo6391y(Object obj, v54 v54, ei0 ei0) {
        int i;
        if (this.f9014q == null) {
            if (this.f9012o == -1) {
                i = ei0.mo6955b();
                this.f9012o = i;
            } else {
                int b = ei0.mo6955b();
                int i2 = this.f9012o;
                if (b == i2) {
                    i = i2;
                } else {
                    this.f9014q = new i64(0);
                    return;
                }
            }
            if (this.f9013p.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.f9008k.length;
                iArr[0] = i;
                this.f9013p = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.f9009l.remove(v54);
            this.f9008k[((Integer) obj).intValue()] = ei0;
            if (this.f9009l.isEmpty()) {
                mo11398t(this.f9008k[0]);
            }
        }
    }
}
