package p094m5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2752g;
import p058h5.C2780r;
import p080k5.C3334d;
import p094m5.C3732f;

/* renamed from: m5.b */
final class C3725b extends C3732f implements Serializable {

    /* renamed from: f */
    private final long[] f21536f;

    /* renamed from: g */
    private final C2780r[] f21537g;

    /* renamed from: h */
    private final long[] f21538h;

    /* renamed from: i */
    private final C2752g[] f21539i;

    /* renamed from: j */
    private final C2780r[] f21540j;

    /* renamed from: k */
    private final C3729e[] f21541k;

    /* renamed from: l */
    private final ConcurrentMap<Integer, C3728d[]> f21542l = new ConcurrentHashMap();

    private C3725b(long[] jArr, C2780r[] rVarArr, long[] jArr2, C2780r[] rVarArr2, C3729e[] eVarArr) {
        C2752g gVar;
        this.f21536f = jArr;
        this.f21537g = rVarArr;
        this.f21538h = jArr2;
        this.f21540j = rVarArr2;
        this.f21541k = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            C3728d dVar = new C3728d(jArr2[i], rVarArr2[i], rVarArr2[i2]);
            if (dVar.mo14935l()) {
                arrayList.add(dVar.mo14927e());
                gVar = dVar.mo14926d();
            } else {
                arrayList.add(dVar.mo14926d());
                gVar = dVar.mo14927e();
            }
            arrayList.add(gVar);
            i = i2;
        }
        this.f21539i = (C2752g[]) arrayList.toArray(new C2752g[arrayList.size()]);
    }

    /* renamed from: g */
    private Object m25425g(C2752g gVar, C3728d dVar) {
        C2752g e = dVar.mo14927e();
        boolean l = dVar.mo14935l();
        boolean t = gVar.mo12888t(e);
        return l ? t ? dVar.mo14933j() : gVar.mo12888t(dVar.mo14926d()) ? dVar : dVar.mo14932i() : !t ? dVar.mo14932i() : gVar.mo12888t(dVar.mo14926d()) ? dVar.mo14933j() : dVar;
    }

    /* renamed from: h */
    private C3728d[] m25426h(int i) {
        Integer valueOf = Integer.valueOf(i);
        C3728d[] dVarArr = (C3728d[]) this.f21542l.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        C3729e[] eVarArr = this.f21541k;
        C3728d[] dVarArr2 = new C3728d[eVarArr.length];
        for (int i2 = 0; i2 < eVarArr.length; i2++) {
            dVarArr2[i2] = eVarArr[i2].mo14939b(i);
        }
        if (i < 2100) {
            this.f21542l.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    /* renamed from: i */
    private int m25427i(long j, C2780r rVar) {
        return C2749f.m21829V(C3334d.m24469e(j + ((long) rVar.mo13013w()), 86400)).mo12822M();
    }

    /* renamed from: j */
    private Object m25428j(C2752g gVar) {
        int i = 0;
        if (this.f21541k.length > 0) {
            C2752g[] gVarArr = this.f21539i;
            if (gVar.mo12887s(gVarArr[gVarArr.length - 1])) {
                C3728d[] h = m25426h(gVar.mo12869N());
                Object obj = null;
                int length = h.length;
                while (i < length) {
                    C3728d dVar = h[i];
                    Object g = m25425g(gVar, dVar);
                    if ((g instanceof C3728d) || g.equals(dVar.mo14933j())) {
                        return g;
                    }
                    i++;
                    obj = g;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f21539i, gVar);
        if (binarySearch == -1) {
            return this.f21540j[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            C2752g[] gVarArr2 = this.f21539i;
            if (binarySearch < gVarArr2.length - 1) {
                int i2 = binarySearch + 1;
                if (gVarArr2[binarySearch].equals(gVarArr2[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f21540j[(binarySearch / 2) + 1];
        }
        C2752g[] gVarArr3 = this.f21539i;
        C2752g gVar2 = gVarArr3[binarySearch];
        C2752g gVar3 = gVarArr3[binarySearch + 1];
        C2780r[] rVarArr = this.f21540j;
        int i3 = binarySearch / 2;
        C2780r rVar = rVarArr[i3];
        C2780r rVar2 = rVarArr[i3 + 1];
        return rVar2.mo13013w() > rVar.mo13013w() ? new C3728d(gVar2, rVar, rVar2) : new C3728d(gVar3, rVar, rVar2);
    }

    /* renamed from: k */
    static C3725b m25429k(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = C3724a.m25419b(dataInput);
        }
        int i2 = readInt + 1;
        C2780r[] rVarArr = new C2780r[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            rVarArr[i3] = C3724a.m25421d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = C3724a.m25419b(dataInput);
        }
        int i5 = readInt2 + 1;
        C2780r[] rVarArr2 = new C2780r[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            rVarArr2[i6] = C3724a.m25421d(dataInput);
        }
        int readByte = dataInput.readByte();
        C3729e[] eVarArr = new C3729e[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            eVarArr[i7] = C3729e.m25457c(dataInput);
        }
        return new C3725b(jArr, rVarArr, jArr2, rVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new C3724a((byte) 1, this);
    }

    /* renamed from: a */
    public C2780r mo14909a(C2746e eVar) {
        long r = eVar.mo12807r();
        if (this.f21541k.length > 0) {
            long[] jArr = this.f21538h;
            if (r > jArr[jArr.length - 1]) {
                C2780r[] rVarArr = this.f21540j;
                C3728d[] h = m25426h(m25427i(r, rVarArr[rVarArr.length - 1]));
                C3728d dVar = null;
                for (int i = 0; i < h.length; i++) {
                    dVar = h[i];
                    if (r < dVar.mo14936n()) {
                        return dVar.mo14933j();
                    }
                }
                return dVar.mo14932i();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f21538h, r);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f21540j[binarySearch + 1];
    }

    /* renamed from: b */
    public C3728d mo14910b(C2752g gVar) {
        Object j = m25428j(gVar);
        if (j instanceof C3728d) {
            return (C3728d) j;
        }
        return null;
    }

    /* renamed from: c */
    public List<C2780r> mo14911c(C2752g gVar) {
        Object j = m25428j(gVar);
        return j instanceof C3728d ? ((C3728d) j).mo14934k() : Collections.singletonList((C2780r) j);
    }

    /* renamed from: d */
    public boolean mo14912d() {
        return this.f21538h.length == 0;
    }

    /* renamed from: e */
    public boolean mo14913e(C2752g gVar, C2780r rVar) {
        return mo14911c(gVar).contains(rVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3725b) {
            C3725b bVar = (C3725b) obj;
            return Arrays.equals(this.f21536f, bVar.f21536f) && Arrays.equals(this.f21537g, bVar.f21537g) && Arrays.equals(this.f21538h, bVar.f21538h) && Arrays.equals(this.f21540j, bVar.f21540j) && Arrays.equals(this.f21541k, bVar.f21541k);
        } else if (!(obj instanceof C3732f.C3733a)) {
            return false;
        } else {
            if (mo14912d()) {
                C2746e eVar = C2746e.f19327h;
                if (mo14909a(eVar).equals(((C3732f.C3733a) obj).mo14909a(eVar))) {
                    return true;
                }
            }
            return false;
        }
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f21536f) ^ Arrays.hashCode(this.f21537g)) ^ Arrays.hashCode(this.f21538h)) ^ Arrays.hashCode(this.f21540j)) ^ Arrays.hashCode(this.f21541k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo14916l(DataOutput dataOutput) {
        dataOutput.writeInt(this.f21536f.length);
        for (long e : this.f21536f) {
            C3724a.m25422e(e, dataOutput);
        }
        for (C2780r g : this.f21537g) {
            C3724a.m25424g(g, dataOutput);
        }
        dataOutput.writeInt(this.f21538h.length);
        for (long e2 : this.f21538h) {
            C3724a.m25422e(e2, dataOutput);
        }
        for (C2780r g2 : this.f21540j) {
            C3724a.m25424g(g2, dataOutput);
        }
        dataOutput.writeByte(this.f21541k.length);
        for (C3729e d : this.f21541k) {
            d.mo14940d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        C2780r[] rVarArr = this.f21537g;
        sb.append(rVarArr[rVarArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
