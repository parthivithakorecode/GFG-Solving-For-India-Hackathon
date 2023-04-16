package p094m5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import p058h5.C2743c;
import p058h5.C2749f;
import p058h5.C2752g;
import p058h5.C2755h;
import p058h5.C2758i;
import p058h5.C2780r;
import p065i5.C2877m;
import p080k5.C3334d;
import p087l5.C3615f;
import p087l5.C3616g;

/* renamed from: m5.e */
public final class C3729e implements Serializable {

    /* renamed from: f */
    private final C2758i f21553f;

    /* renamed from: g */
    private final byte f21554g;

    /* renamed from: h */
    private final C2743c f21555h;

    /* renamed from: i */
    private final C2755h f21556i;

    /* renamed from: j */
    private final int f21557j;

    /* renamed from: k */
    private final C3731b f21558k;

    /* renamed from: l */
    private final C2780r f21559l;

    /* renamed from: m */
    private final C2780r f21560m;

    /* renamed from: n */
    private final C2780r f21561n;

    /* renamed from: m5.e$a */
    static /* synthetic */ class C3730a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21562a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                m5.e$b[] r0 = p094m5.C3729e.C3731b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21562a = r0
                m5.e$b r1 = p094m5.C3729e.C3731b.UTC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21562a     // Catch:{ NoSuchFieldError -> 0x001d }
                m5.e$b r1 = p094m5.C3729e.C3731b.STANDARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p094m5.C3729e.C3730a.<clinit>():void");
        }
    }

    /* renamed from: m5.e$b */
    public enum C3731b {
        UTC,
        WALL,
        STANDARD;

        /* renamed from: b */
        public C2752g mo14944b(C2752g gVar, C2780r rVar, C2780r rVar2) {
            long w;
            int i = C3730a.f21562a[ordinal()];
            if (i == 1) {
                w = (long) (rVar2.mo13013w() - C2780r.f19417m.mo13013w());
            } else if (i != 2) {
                return gVar;
            } else {
                w = (long) (rVar2.mo13013w() - rVar.mo13013w());
            }
            return gVar.mo12876Z(w);
        }
    }

    C3729e(C2758i iVar, int i, C2743c cVar, C2755h hVar, int i2, C3731b bVar, C2780r rVar, C2780r rVar2, C2780r rVar3) {
        this.f21553f = iVar;
        this.f21554g = (byte) i;
        this.f21555h = cVar;
        this.f21556i = hVar;
        this.f21557j = i2;
        this.f21558k = bVar;
        this.f21559l = rVar;
        this.f21560m = rVar2;
        this.f21561n = rVar3;
    }

    /* renamed from: a */
    private void m25456a(StringBuilder sb, long j) {
        if (j < 10) {
            sb.append(0);
        }
        sb.append(j);
    }

    /* renamed from: c */
    static C3729e m25457c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        C2758i r = C2758i.m21982r(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        C2743c k = i2 == 0 ? null : C2743c.m21774k(i2);
        int i3 = (507904 & readInt) >>> 14;
        C3731b bVar = C3731b.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        int readInt2 = i3 == 31 ? dataInput.readInt() : i3 * 3600;
        C2780r z = C2780r.m22141z(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        C2780r z2 = C2780r.m22141z(i5 == 3 ? dataInput.readInt() : z.mo13013w() + (i5 * 1800));
        C2780r z3 = C2780r.m22141z(i6 == 3 ? dataInput.readInt() : z.mo13013w() + (i6 * 1800));
        if (i >= -28 && i <= 31 && i != 0) {
            return new C3729e(r, i, k, C2755h.m21940C((long) C3334d.m24470f(readInt2, 86400)), C3334d.m24468d(readInt2, 86400), bVar, z, z2, z3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new C3724a((byte) 3, this);
    }

    /* renamed from: b */
    public C3728d mo14939b(int i) {
        C2749f fVar;
        C3615f fVar2;
        byte b = this.f21554g;
        if (b < 0) {
            C2758i iVar = this.f21553f;
            fVar = C2749f.m21828U(i, iVar, iVar.mo12923o(C2877m.f19602j.mo13165v((long) i)) + 1 + this.f21554g);
            C2743c cVar = this.f21555h;
            if (cVar != null) {
                fVar2 = C3616g.m25148b(cVar);
            }
            return new C3728d(this.f21558k.mo14944b(C2752g.m21887Q(fVar.mo12831Z((long) this.f21557j), this.f21556i), this.f21559l, this.f21560m), this.f21560m, this.f21561n);
        }
        fVar = C2749f.m21828U(i, this.f21553f, b);
        C2743c cVar2 = this.f21555h;
        if (cVar2 != null) {
            fVar2 = C3616g.m25147a(cVar2);
        }
        return new C3728d(this.f21558k.mo14944b(C2752g.m21887Q(fVar.mo12831Z((long) this.f21557j), this.f21556i), this.f21559l, this.f21560m), this.f21560m, this.f21561n);
        fVar = fVar.mo12855y(fVar2);
        return new C3728d(this.f21558k.mo14944b(C2752g.m21887Q(fVar.mo12831Z((long) this.f21557j), this.f21556i), this.f21559l, this.f21560m), this.f21560m, this.f21561n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14940d(DataOutput dataOutput) {
        int L = this.f21556i.mo12901L() + (this.f21557j * 86400);
        int w = this.f21559l.mo13013w();
        int w2 = this.f21560m.mo13013w() - w;
        int w3 = this.f21561n.mo13013w() - w;
        int t = (L % 3600 != 0 || L > 86400) ? 31 : L == 86400 ? 24 : this.f21556i.mo12914t();
        int i = w % 900 == 0 ? (w / 900) + 128 : 255;
        int i2 = (w2 == 0 || w2 == 1800 || w2 == 3600) ? w2 / 1800 : 3;
        int i3 = (w3 == 0 || w3 == 1800 || w3 == 3600) ? w3 / 1800 : 3;
        C2743c cVar = this.f21555h;
        dataOutput.writeInt((this.f21553f.getValue() << 28) + ((this.f21554g + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (t << 14) + (this.f21558k.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (t == 31) {
            dataOutput.writeInt(L);
        }
        if (i == 255) {
            dataOutput.writeInt(w);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.f21560m.mo13013w());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.f21561n.mo13013w());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3729e)) {
            return false;
        }
        C3729e eVar = (C3729e) obj;
        return this.f21553f == eVar.f21553f && this.f21554g == eVar.f21554g && this.f21555h == eVar.f21555h && this.f21558k == eVar.f21558k && this.f21557j == eVar.f21557j && this.f21556i.equals(eVar.f21556i) && this.f21559l.equals(eVar.f21559l) && this.f21560m.equals(eVar.f21560m) && this.f21561n.equals(eVar.f21561n);
    }

    public int hashCode() {
        int L = ((this.f21556i.mo12901L() + this.f21557j) << 15) + (this.f21553f.ordinal() << 11) + ((this.f21554g + 32) << 5);
        C2743c cVar = this.f21555h;
        return ((((L + ((cVar == null ? 7 : cVar.ordinal()) << 2)) + this.f21558k.ordinal()) ^ this.f21559l.hashCode()) ^ this.f21560m.hashCode()) ^ this.f21561n.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionRule["
            r0.append(r1)
            h5.r r1 = r7.f21560m
            h5.r r2 = r7.f21561n
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L_0x0017
            java.lang.String r1 = "Gap "
            goto L_0x0019
        L_0x0017:
            java.lang.String r1 = "Overlap "
        L_0x0019:
            r0.append(r1)
            h5.r r1 = r7.f21560m
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            h5.r r1 = r7.f21561n
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            h5.c r1 = r7.f21555h
            r2 = 32
            if (r1 == 0) goto L_0x0068
            byte r3 = r7.f21554g
            r4 = -1
            java.lang.String r1 = r1.name()
            r0.append(r1)
            if (r3 != r4) goto L_0x0051
            java.lang.String r1 = " on or before last day of "
        L_0x0044:
            r0.append(r1)
            h5.i r1 = r7.f21553f
            java.lang.String r1 = r1.name()
            r0.append(r1)
            goto L_0x0079
        L_0x0051:
            if (r3 >= 0) goto L_0x0063
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            byte r1 = r7.f21554g
            int r1 = -r1
            int r1 = r1 + -1
            r0.append(r1)
            java.lang.String r1 = " of "
            goto L_0x0044
        L_0x0063:
            java.lang.String r1 = " on or after "
            r0.append(r1)
        L_0x0068:
            h5.i r1 = r7.f21553f
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.append(r2)
            byte r1 = r7.f21554g
            r0.append(r1)
        L_0x0079:
            java.lang.String r1 = " at "
            r0.append(r1)
            int r1 = r7.f21557j
            if (r1 != 0) goto L_0x0088
            h5.h r1 = r7.f21556i
            r0.append(r1)
            goto L_0x00ae
        L_0x0088:
            h5.h r1 = r7.f21556i
            int r1 = r1.mo12901L()
            r2 = 60
            int r1 = r1 / r2
            int r3 = r7.f21557j
            int r3 = r3 * 24
            int r3 = r3 * r2
            int r1 = r1 + r3
            long r3 = (long) r1
            r5 = 60
            long r5 = p080k5.C3334d.m24469e(r3, r5)
            r7.m25456a(r0, r5)
            r1 = 58
            r0.append(r1)
            int r1 = p080k5.C3334d.m24471g(r3, r2)
            long r1 = (long) r1
            r7.m25456a(r0, r1)
        L_0x00ae:
            java.lang.String r1 = " "
            r0.append(r1)
            m5.e$b r1 = r7.f21558k
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            h5.r r1 = r7.f21559l
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p094m5.C3729e.toString():java.lang.String");
    }
}
