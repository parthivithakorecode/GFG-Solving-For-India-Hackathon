package com.google.android.gms.internal.ads;

public abstract class cp3 {

    /* renamed from: d */
    private static volatile int f5486d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f5487e = 0;

    /* renamed from: a */
    int f5488a;

    /* renamed from: b */
    final int f5489b = f5486d;

    /* renamed from: c */
    dp3 f5490c;

    /* synthetic */ cp3(bp3 bp3) {
    }

    /* renamed from: e */
    public static int m7489e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m7490f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    static cp3 m7491g(byte[] bArr, int i, int i2, boolean z) {
        wo3 wo3 = new wo3(bArr, i, i2, z, (vo3) null);
        try {
            wo3.mo5372k(i2);
            return wo3;
        } catch (mq3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract void mo5357A(int i);

    /* renamed from: a */
    public abstract void mo5365a(int i);

    /* renamed from: b */
    public abstract boolean mo5366b();

    /* renamed from: c */
    public abstract boolean mo5367c();

    /* renamed from: d */
    public abstract boolean mo5368d(int i);

    /* renamed from: h */
    public abstract double mo5369h();

    /* renamed from: i */
    public abstract float mo5370i();

    /* renamed from: j */
    public abstract int mo5371j();

    /* renamed from: k */
    public abstract int mo5372k(int i);

    /* renamed from: l */
    public abstract int mo5373l();

    /* renamed from: m */
    public abstract int mo5374m();

    /* renamed from: n */
    public abstract int mo5375n();

    /* renamed from: o */
    public abstract int mo5376o();

    /* renamed from: p */
    public abstract int mo5377p();

    /* renamed from: q */
    public abstract int mo5378q();

    /* renamed from: r */
    public abstract int mo5379r();

    /* renamed from: s */
    public abstract long mo5380s();

    /* renamed from: t */
    public abstract long mo5381t();

    /* renamed from: u */
    public abstract long mo5382u();

    /* renamed from: v */
    public abstract long mo5383v();

    /* renamed from: w */
    public abstract long mo5384w();

    /* renamed from: x */
    public abstract uo3 mo5385x();

    /* renamed from: y */
    public abstract String mo5386y();

    /* renamed from: z */
    public abstract String mo5387z();
}
