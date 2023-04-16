package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kl */
public abstract class C1892kl extends C2040ol {

    /* renamed from: b */
    private final SparseArray<Map<C1521al, C1855jl>> f9553b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f9554c = new SparseBooleanArray();

    /* renamed from: d */
    private C1818il f9555d;

    /* renamed from: a */
    public final C2077pl mo8686a(C1626df[] dfVarArr, C1521al alVar) {
        int[] iArr;
        C1626df[] dfVarArr2 = dfVarArr;
        C1521al alVar2 = alVar;
        int[] iArr2 = new int[3];
        C2447zk[][] zkVarArr = new C2447zk[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = alVar2.f4236a;
            zkVarArr[i] = new C2447zk[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            dfVarArr2[i4].mo6465b();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < alVar2.f4236a) {
            C2447zk b = alVar2.mo5309b(i5);
            int i6 = i3;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= i3) {
                    i7 = i6;
                    break;
                }
                C1626df dfVar = dfVarArr2[i7];
                int i9 = 0;
                while (true) {
                    int i10 = b.f18267a;
                    if (i9 > 0) {
                        break;
                    }
                    int e = dfVar.mo6467e(b.mo12235b(i9)) & 3;
                    if (e > i8) {
                        if (e == 3) {
                            break;
                        }
                        i6 = i7;
                        i8 = e;
                    }
                    i9++;
                }
                i7++;
                i3 = 2;
            }
            if (i7 == 2) {
                int i11 = b.f18267a;
                iArr = new int[1];
            } else {
                C1626df dfVar2 = dfVarArr2[i7];
                int i12 = b.f18267a;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = dfVar2.mo6467e(b.mo12235b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zkVarArr[i7][i14] = b;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        int i15 = i3;
        C1521al[] alVarArr = new C1521al[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            alVarArr[i16] = new C1521al((C2447zk[]) Arrays.copyOf(zkVarArr[i16], i17));
            iArr3[i16] = (int[][]) Arrays.copyOf(iArr3[i16], i17);
            iArr6[i16] = dfVarArr2[i16].mo6466c();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        C1521al alVar3 = new C1521al((C2447zk[]) Arrays.copyOf(zkVarArr[i18], iArr2[i18]));
        C1670el[] e2 = mo7659e(dfVarArr2, alVarArr, iArr3);
        int i19 = 0;
        while (i19 < i18) {
            if (this.f9554c.get(i19)) {
                e2[i19] = null;
            } else {
                C1521al alVar4 = alVarArr[i19];
                Map map = this.f9553b.get(i19);
                if ((map == null ? null : (C1855jl) map.get(alVar4)) != null) {
                    throw null;
                }
            }
            i19++;
            i18 = 2;
        }
        C1818il ilVar = new C1818il(iArr6, alVarArr, iArr4, iArr3, alVar3);
        C1664ef[] efVarArr = new C1664ef[2];
        for (int i20 = 0; i20 < 2; i20++) {
            efVarArr[i20] = e2[i20] != null ? C1664ef.f6194b : null;
        }
        return new C2077pl(alVar2, new C1966ml(e2, (byte[]) null), ilVar, efVarArr);
    }

    /* renamed from: b */
    public final void mo8687b(Object obj) {
        this.f9555d = (C1818il) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C1670el[] mo7659e(C1626df[] dfVarArr, C1521al[] alVarArr, int[][][] iArr);

    /* renamed from: f */
    public final void mo8688f(int i, boolean z) {
        if (this.f9554c.get(i) != z) {
            this.f9554c.put(i, z);
            mo9795d();
        }
    }
}
