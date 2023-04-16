package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

class qo3 extends po3 {

    /* renamed from: j */
    protected final byte[] f13255j;

    qo3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f13255j = bArr;
    }

    /* renamed from: B */
    public final boolean mo6621B() {
        int P = mo9344P();
        return lt3.m12872j(this.f13255j, P, mo6627p() + P);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo10143O(uo3 uo3, int i, int i2) {
        if (i2 <= uo3.mo6627p()) {
            int i3 = i + i2;
            if (i3 > uo3.mo6627p()) {
                int p = uo3.mo6627p();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(p);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(uo3 instanceof qo3)) {
                return uo3.mo6633v(i, i3).equals(mo6633v(0, i2));
            } else {
                qo3 qo3 = (qo3) uo3;
                byte[] bArr = this.f13255j;
                byte[] bArr2 = qo3.f13255j;
                int P = mo9344P() + i2;
                int P2 = mo9344P();
                int P3 = qo3.mo9344P() + i;
                while (P2 < P) {
                    if (bArr[P2] != bArr2[P3]) {
                        return false;
                    }
                    P2++;
                    P3++;
                }
                return true;
            }
        } else {
            int p2 = mo6627p();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(p2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public int mo9344P() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uo3) || mo6627p() != ((uo3) obj).mo6627p()) {
            return false;
        }
        if (mo6627p() == 0) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return obj.equals(this);
        }
        qo3 qo3 = (qo3) obj;
        int E = mo11267E();
        int E2 = qo3.mo11267E();
        if (E == 0 || E2 == 0 || E == E2) {
            return mo10143O(qo3, 0, mo6627p());
        }
        return false;
    }

    /* renamed from: m */
    public byte mo6625m(int i) {
        return this.f13255j[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public byte mo6626n(int i) {
        return this.f13255j[i];
    }

    /* renamed from: p */
    public int mo6627p() {
        return this.f13255j.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo6628q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f13255j, i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo6631t(int i, int i2, int i3) {
        return kq3.m12303d(i, this.f13255j, mo9344P() + i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo6632u(int i, int i2, int i3) {
        int P = mo9344P() + i2;
        return lt3.m12868f(i, this.f13255j, P, i3 + P);
    }

    /* renamed from: v */
    public final uo3 mo6633v(int i, int i2) {
        int C = uo3.m17965C(i, i2, mo6627p());
        return C == 0 ? uo3.f15667g : new mo3(this.f13255j, mo9344P() + i, C);
    }

    /* renamed from: w */
    public final cp3 mo6634w() {
        return cp3.m7491g(this.f13255j, mo9344P(), mo6627p(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final String mo6635x(Charset charset) {
        return new String(this.f13255j, mo9344P(), mo6627p(), charset);
    }

    /* renamed from: y */
    public final ByteBuffer mo10337y() {
        return ByteBuffer.wrap(this.f13255j, mo9344P(), mo6627p()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo6636z(ho3 ho3) {
        ((ep3) ho3).mo7015E(this.f13255j, mo9344P(), mo6627p());
    }
}
