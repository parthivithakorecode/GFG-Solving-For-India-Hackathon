package p065i5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p058h5.C2742b;
import p058h5.C2749f;
import p080k5.C3331a;
import p087l5.C3603a;
import p087l5.C3620i;
import p087l5.C3632n;

/* renamed from: i5.q */
public final class C2883q extends C3331a implements Serializable {

    /* renamed from: i */
    public static final C2883q f19617i;

    /* renamed from: j */
    public static final C2883q f19618j;

    /* renamed from: k */
    public static final C2883q f19619k;

    /* renamed from: l */
    public static final C2883q f19620l;

    /* renamed from: m */
    private static final AtomicReference<C2883q[]> f19621m;

    /* renamed from: f */
    private final int f19622f;

    /* renamed from: g */
    private final transient C2749f f19623g;

    /* renamed from: h */
    private final transient String f19624h;

    static {
        C2883q qVar = new C2883q(-1, C2749f.m21827T(1868, 9, 8), "Meiji");
        f19617i = qVar;
        C2883q qVar2 = new C2883q(0, C2749f.m21827T(1912, 7, 30), "Taisho");
        f19618j = qVar2;
        C2883q qVar3 = new C2883q(1, C2749f.m21827T(1926, 12, 25), "Showa");
        f19619k = qVar3;
        C2883q qVar4 = new C2883q(2, C2749f.m21827T(1989, 1, 8), "Heisei");
        f19620l = qVar4;
        f19621m = new AtomicReference<>(new C2883q[]{qVar, qVar2, qVar3, qVar4});
    }

    private C2883q(int i, C2749f fVar, String str) {
        this.f19622f = i;
        this.f19623g = fVar;
        this.f19624h = str;
    }

    /* renamed from: p */
    static C2883q m22645p(C2749f fVar) {
        if (!fVar.mo12849t(f19617i.f19623g)) {
            C2883q[] qVarArr = f19621m.get();
            for (int length = qVarArr.length - 1; length >= 0; length--) {
                C2883q qVar = qVarArr[length];
                if (fVar.compareTo(qVar.f19623g) >= 0) {
                    return qVar;
                }
            }
            return null;
        }
        throw new C2742b("Date too early: " + fVar);
    }

    /* renamed from: q */
    public static C2883q m22646q(int i) {
        C2883q[] qVarArr = f19621m.get();
        if (i >= f19617i.f19622f && i <= qVarArr[qVarArr.length - 1].f19622f) {
            return qVarArr[m22647r(i)];
        }
        throw new C2742b("japaneseEra is invalid");
    }

    /* renamed from: r */
    private static int m22647r(int i) {
        return i + 1;
    }

    private Object readResolve() {
        try {
            return m22646q(this.f19622f);
        } catch (C2742b e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    /* renamed from: s */
    static C2883q m22648s(DataInput dataInput) {
        return m22646q(dataInput.readByte());
    }

    /* renamed from: u */
    public static C2883q[] m22649u() {
        C2883q[] qVarArr = f19621m.get();
        return (C2883q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    private Object writeReplace() {
        return new C2889u((byte) 2, this);
    }

    public int getValue() {
        return this.f19622f;
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        C3603a aVar = C3603a.ERA;
        return iVar == aVar ? C2879o.f19607k.mo13173x(aVar) : super.mo12782n(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2749f mo13185o() {
        int r = m22647r(this.f19622f);
        C2883q[] u = m22649u();
        return r >= u.length + -1 ? C2749f.f19336k : u[r + 1].mo13186t().mo12827R(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C2749f mo13186t() {
        return this.f19623g;
    }

    public String toString() {
        return this.f19624h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo13188v(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }
}
