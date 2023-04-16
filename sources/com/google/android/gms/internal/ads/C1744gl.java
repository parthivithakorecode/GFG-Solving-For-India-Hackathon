package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.gl */
public final class C1744gl extends C1892kl {

    /* renamed from: e */
    private final AtomicReference<C1707fl> f7519e = new AtomicReference<>(new C1707fl());

    public C1744gl(C1929ll llVar) {
    }

    /* renamed from: g */
    protected static boolean m9828g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: h */
    private static int m9829h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C1670el[] mo7659e(C1626df[] dfVarArr, C1521al[] alVarArr, int[][][] iArr) {
        boolean z;
        C1781hl hlVar;
        int[] iArr2;
        ArrayList arrayList;
        C2447zk zkVar;
        boolean z2;
        boolean z3;
        int i = 2;
        C1670el[] elVarArr = new C1670el[2];
        C1707fl flVar = this.f7519e.get();
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            int i3 = -1;
            int i4 = 1;
            if (i2 >= i) {
                break;
            }
            if (dfVarArr[i2].mo6466c() == i) {
                if (!z4) {
                    C1626df dfVar = dfVarArr[i2];
                    C1521al alVar = alVarArr[i2];
                    int[][] iArr3 = iArr[i2];
                    int i5 = flVar.f6842d;
                    int i6 = -1;
                    int i7 = 0;
                    C2447zk zkVar2 = null;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < alVar.f4236a) {
                        C2447zk b = alVar.mo5309b(i7);
                        int i10 = b.f18267a;
                        ArrayList arrayList2 = new ArrayList(i4);
                        for (int i11 = 0; i11 <= 0; i11++) {
                            arrayList2.add(Integer.valueOf(i11));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i12 = 0;
                        while (i12 <= 0) {
                            C1521al alVar2 = alVar;
                            if (m9828g(iArr4[i12], true)) {
                                C2367xe b2 = b.mo12235b(i12);
                                if (arrayList2.contains(Integer.valueOf(i12))) {
                                    int i13 = b2.f17167o;
                                    zkVar = b;
                                    z3 = true;
                                    z2 = true;
                                } else {
                                    zkVar = b;
                                    z3 = true;
                                    z2 = false;
                                }
                                arrayList = arrayList2;
                                int i14 = z3 != z2 ? 1 : 2;
                                iArr2 = iArr4;
                                boolean g = m9828g(iArr4[i12], false);
                                if (g) {
                                    i14 += 1000;
                                }
                                boolean z5 = i14 > i9;
                                if (i14 == i9) {
                                    int h = b2.mo11806b() != i6 ? m9829h(b2.mo11806b(), i6) : m9829h(b2.f17159g, i3);
                                    z5 = !g || !z2 ? h < 0 : h > 0;
                                }
                                if (z5) {
                                    i3 = b2.f17159g;
                                    i6 = b2.mo11806b();
                                    i9 = i14;
                                    i8 = i12;
                                    zkVar2 = zkVar;
                                }
                            } else {
                                zkVar = b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i12++;
                            alVar = alVar2;
                            b = zkVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        C1521al alVar3 = alVar;
                        i7++;
                        i4 = 1;
                    }
                    C1781hl hlVar2 = zkVar2 == null ? null : new C1781hl(zkVar2, i8, 0, (Object) null);
                    elVarArr[i2] = hlVar2;
                    z4 = hlVar2 != null;
                }
                int i15 = alVarArr[i2].f4236a;
            }
            i2++;
            i = 2;
        }
        int i16 = 0;
        boolean z6 = false;
        while (i16 < i) {
            if (dfVarArr[i16].mo6466c() == 1 && !z6) {
                C1521al alVar4 = alVarArr[i16];
                int[][] iArr5 = iArr[i16];
                String str = flVar.f6839a;
                int i17 = -1;
                int i18 = -1;
                int i19 = 0;
                int i20 = 0;
                while (i19 < alVar4.f4236a) {
                    C2447zk b3 = alVar4.mo5309b(i19);
                    int[] iArr6 = iArr5[i19];
                    int i21 = i18;
                    int i22 = i17;
                    int i23 = i20;
                    int i24 = 0;
                    while (true) {
                        int i25 = b3.f18267a;
                        if (i24 > 0) {
                            break;
                        }
                        if (m9828g(iArr6[i24], true)) {
                            C2367xe b4 = b3.mo12235b(i24);
                            int i26 = iArr6[i24];
                            int i27 = 1 != (b4.f17154C & 1) ? 1 : 2;
                            if (m9828g(i26, false)) {
                                i27 += 1000;
                            }
                            if (i27 > i23) {
                                i22 = i19;
                                i21 = i24;
                                i23 = i27;
                            }
                        }
                        i24++;
                    }
                    i19++;
                    i20 = i23;
                    i17 = i22;
                    i18 = i21;
                }
                if (i17 == -1) {
                    hlVar = null;
                    z = false;
                } else {
                    z = false;
                    hlVar = new C1781hl(alVar4.mo5309b(i17), i18, 0, (Object) null);
                }
                elVarArr[i16] = hlVar;
                z6 = hlVar != null ? true : z;
            }
            i16++;
            i = 2;
        }
        return elVarArr;
    }
}
