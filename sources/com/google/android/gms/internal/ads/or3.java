package com.google.android.gms.internal.ads;

final class or3<T> implements es3<T> {

    /* renamed from: a */
    private final kr3 f12176a;

    /* renamed from: b */
    private final ws3<?, ?> f12177b;

    /* renamed from: c */
    private final boolean f12178c;

    /* renamed from: d */
    private final np3<?> f12179d;

    private or3(ws3<?, ?> ws3, np3<?> np3, kr3 kr3) {
        this.f12177b = ws3;
        this.f12178c = np3.mo9581h(kr3);
        this.f12179d = np3;
        this.f12176a = kr3;
    }

    /* renamed from: k */
    static <T> or3<T> m14613k(ws3<?, ?> ws3, np3<?> np3, kr3 kr3) {
        return new or3<>(ws3, np3, kr3);
    }

    /* renamed from: a */
    public final int mo7061a(T t) {
        int hashCode = this.f12177b.mo11706d(t).hashCode();
        if (!this.f12178c) {
            return hashCode;
        }
        this.f12179d.mo9574a(t);
        throw null;
    }

    /* renamed from: b */
    public final T mo7062b() {
        return this.f12176a.mo5391d().mo8525i();
    }

    /* renamed from: c */
    public final int mo7063c(T t) {
        ws3<?, ?> ws3 = this.f12177b;
        int b = ws3.mo11704b(ws3.mo11706d(t));
        if (!this.f12178c) {
            return b;
        }
        this.f12179d.mo9574a(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo7064d(T t) {
        this.f12177b.mo11715m(t);
        this.f12179d.mo9578e(t);
    }

    /* renamed from: e */
    public final void mo7065e(T t, wr3 wr3, mp3 mp3) {
        boolean z;
        ws3<?, ?> ws3 = this.f12177b;
        np3<?> np3 = this.f12179d;
        Object c = ws3.mo11705c(t);
        sp3<?> b = np3.mo9575b(t);
        while (wr3.mo6539c() != Integer.MAX_VALUE) {
            int g = wr3.mo6543g();
            if (g != 11) {
                if ((g & 7) == 2) {
                    Object c2 = np3.mo9576c(mp3, this.f12176a, g >>> 3);
                    if (c2 != null) {
                        np3.mo9579f(wr3, c2, mp3, b);
                    } else {
                        z = ws3.mo11718p(c, wr3);
                    }
                } else {
                    z = wr3.mo6557u();
                }
                if (!z) {
                    ws3.mo11716n(t, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj = null;
                uo3 uo3 = null;
                while (true) {
                    try {
                        if (wr3.mo6539c() == Integer.MAX_VALUE) {
                            break;
                        }
                        int g2 = wr3.mo6543g();
                        if (g2 == 16) {
                            i = wr3.mo6545i();
                            obj = np3.mo9576c(mp3, this.f12176a, i);
                        } else if (g2 == 26) {
                            if (obj != null) {
                                np3.mo9579f(wr3, obj, mp3, b);
                            } else {
                                uo3 = wr3.mo6548l();
                            }
                        } else if (!wr3.mo6557u()) {
                            break;
                        }
                    } catch (Throwable th) {
                        ws3.mo11716n(t, c);
                        throw th;
                    }
                }
                if (wr3.mo6543g() != 12) {
                    throw mq3.m13452b();
                } else if (uo3 != null) {
                    if (obj != null) {
                        np3.mo9580g(uo3, obj, mp3, b);
                    } else {
                        ws3.mo11713k(c, i, uo3);
                    }
                }
            }
        }
        ws3.mo11716n(t, c);
    }

    /* renamed from: f */
    public final void mo7066f(T t, T t2) {
        gs3.m9945f(this.f12177b, t, t2);
        if (this.f12178c) {
            gs3.m9944e(this.f12179d, t, t2);
        }
    }

    /* renamed from: g */
    public final void mo7067g(T t, ip3 ip3) {
        this.f12179d.mo9574a(t);
        throw null;
    }

    /* renamed from: h */
    public final void mo7068h(T t, byte[] bArr, int i, int i2, eo3 eo3) {
        aq3 aq3 = (aq3) t;
        if (aq3.zzc == xs3.m19644c()) {
            aq3.zzc = xs3.m19646e();
        }
        yp3 yp3 = (yp3) t;
        throw null;
    }

    /* renamed from: i */
    public final boolean mo7069i(T t, T t2) {
        if (!this.f12177b.mo11706d(t).equals(this.f12177b.mo11706d(t2))) {
            return false;
        }
        if (!this.f12178c) {
            return true;
        }
        this.f12179d.mo9574a(t);
        this.f12179d.mo9574a(t2);
        throw null;
    }

    /* renamed from: j */
    public final boolean mo7070j(T t) {
        this.f12179d.mo9574a(t);
        throw null;
    }
}
