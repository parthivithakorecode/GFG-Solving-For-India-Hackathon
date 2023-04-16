package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.pe */
final class C2070pe implements C1959me {

    /* renamed from: a */
    private final C1589cf[] f12608a;

    /* renamed from: b */
    private final C2040ol f12609b;

    /* renamed from: c */
    private final C1966ml f12610c;

    /* renamed from: d */
    private final Handler f12611d;

    /* renamed from: e */
    private final C2292ve f12612e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<C1848je> f12613f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    private final C1775hf f12614g;

    /* renamed from: h */
    private final C1738gf f12615h;

    /* renamed from: i */
    private boolean f12616i;

    /* renamed from: j */
    private boolean f12617j = false;

    /* renamed from: k */
    private int f12618k = 1;

    /* renamed from: l */
    private int f12619l;

    /* renamed from: m */
    private int f12620m;

    /* renamed from: n */
    private boolean f12621n;

    /* renamed from: o */
    private C1812if f12622o;

    /* renamed from: p */
    private Object f12623p;

    /* renamed from: q */
    private C1521al f12624q;

    /* renamed from: r */
    private C1966ml f12625r;

    /* renamed from: s */
    private C1552bf f12626s;

    /* renamed from: t */
    private C2181se f12627t;

    /* renamed from: u */
    private long f12628u;

    @SuppressLint({"HandlerLeak"})
    public C2070pe(C1589cf[] cfVarArr, C2040ol olVar, qr0 qr0, byte[] bArr) {
        String str = C2449zm.f18291e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.f12608a = cfVarArr;
        Objects.requireNonNull(olVar);
        this.f12609b = olVar;
        C1966ml mlVar = new C1966ml(new C1670el[2], (byte[]) null);
        this.f12610c = mlVar;
        this.f12622o = C1812if.f8637a;
        this.f12614g = new C1775hf();
        this.f12615h = new C1738gf();
        this.f12624q = C1521al.f4235d;
        this.f12625r = mlVar;
        this.f12626s = C1552bf.f4896d;
        C2033oe oeVar = new C2033oe(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f12611d = oeVar;
        C2181se seVar = new C2181se(0, 0);
        this.f12627t = seVar;
        this.f12612e = new C2292ve(cfVarArr, olVar, qr0, this.f12617j, 0, oeVar, seVar, this, (byte[]) null);
    }

    /* renamed from: A0 */
    public final void mo9188A0(C1848je jeVar) {
        this.f12613f.remove(jeVar);
    }

    /* renamed from: B0 */
    public final void mo9189B0(long j) {
        mo10039b();
        if (this.f12622o.mo8137h() || this.f12622o.mo7321c() > 0) {
            this.f12619l++;
            if (!this.f12622o.mo8137h()) {
                this.f12622o.mo8136g(0, this.f12614g, false);
                long a = C1774he.m10487a(j);
                long j2 = this.f12622o.mo7322d(0, this.f12615h, false).f7412c;
                if (j2 != -9223372036854775807L) {
                    int i = (a > j2 ? 1 : (a == j2 ? 0 : -1));
                }
            }
            this.f12628u = j;
            this.f12612e.mo11460v(this.f12622o, 0, C1774he.m10487a(j));
            Iterator<C1848je> it = this.f12613f.iterator();
            while (it.hasNext()) {
                it.next().mo5464b();
            }
            return;
        }
        throw new C2441ze(this.f12622o, 0, j);
    }

    /* renamed from: C0 */
    public final void mo9190C0(C1891kk kkVar) {
        if (!this.f12622o.mo8137h() || this.f12623p != null) {
            this.f12622o = C1812if.f8637a;
            this.f12623p = null;
            Iterator<C1848je> it = this.f12613f.iterator();
            while (it.hasNext()) {
                it.next().mo5475h(this.f12622o, this.f12623p);
            }
        }
        if (this.f12616i) {
            this.f12616i = false;
            this.f12624q = C1521al.f4235d;
            this.f12625r = this.f12610c;
            this.f12609b.mo8687b((Object) null);
            Iterator<C1848je> it2 = this.f12613f.iterator();
            while (it2.hasNext()) {
                it2.next().mo5470f(this.f12624q, this.f12625r);
            }
        }
        this.f12620m++;
        this.f12612e.mo11458t(kkVar, true);
    }

    /* renamed from: D0 */
    public final void mo9191D0(C1922le... leVarArr) {
        this.f12612e.mo11456r(leVarArr);
    }

    /* renamed from: E0 */
    public final void mo9192E0(C1848je jeVar) {
        this.f12613f.add(jeVar);
    }

    /* renamed from: a */
    public final long mo9193a() {
        if (this.f12622o.mo8137h() || this.f12619l > 0) {
            return this.f12628u;
        }
        this.f12622o.mo7322d(this.f12627t.f14413a, this.f12615h, false);
        return C1774he.m10488b(0) + C1774he.m10488b(this.f12627t.f14416d);
    }

    /* renamed from: b */
    public final int mo10039b() {
        if (!this.f12622o.mo8137h() && this.f12619l <= 0) {
            this.f12622o.mo7322d(this.f12627t.f14413a, this.f12615h, false);
        }
        return 0;
    }

    /* renamed from: c */
    public final long mo9194c() {
        if (this.f12622o.mo8137h() || this.f12619l > 0) {
            return this.f12628u;
        }
        this.f12622o.mo7322d(this.f12627t.f14413a, this.f12615h, false);
        return C1774he.m10488b(0) + C1774he.m10488b(this.f12627t.f14415c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10040d(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f12620m--;
                return;
            case 1:
                this.f12618k = message.arg1;
                Iterator<C1848je> it = this.f12613f.iterator();
                while (it.hasNext()) {
                    it.next().mo5486t(this.f12617j, this.f12618k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f12621n = z;
                Iterator<C1848je> it2 = this.f12613f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo5466c(this.f12621n);
                }
                return;
            case 3:
                if (this.f12620m == 0) {
                    C2077pl plVar = (C2077pl) message.obj;
                    this.f12616i = true;
                    this.f12624q = plVar.f12692a;
                    this.f12625r = plVar.f12693b;
                    this.f12609b.mo8687b(plVar.f12694c);
                    Iterator<C1848je> it3 = this.f12613f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo5470f(this.f12624q, this.f12625r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f12619l - 1;
                this.f12619l = i;
                if (i == 0) {
                    this.f12627t = (C2181se) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<C1848je> it4 = this.f12613f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo5464b();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f12619l == 0) {
                    this.f12627t = (C2181se) message.obj;
                    Iterator<C1848je> it5 = this.f12613f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo5464b();
                    }
                    return;
                }
                return;
            case 6:
                C2255ue ueVar = (C2255ue) message.obj;
                this.f12619l -= ueVar.f15530d;
                if (this.f12620m == 0) {
                    this.f12622o = ueVar.f15527a;
                    this.f12623p = ueVar.f15528b;
                    this.f12627t = ueVar.f15529c;
                    Iterator<C1848je> it6 = this.f12613f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo5475h(this.f12622o, this.f12623p);
                    }
                    return;
                }
                return;
            case 7:
                C1552bf bfVar = (C1552bf) message.obj;
                if (!this.f12626s.equals(bfVar)) {
                    this.f12626s = bfVar;
                    Iterator<C1848je> it7 = this.f12613f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo5483n(bfVar);
                    }
                    return;
                }
                return;
            case 8:
                C1811ie ieVar = (C1811ie) message.obj;
                Iterator<C1848je> it8 = this.f12613f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo5481l(ieVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public final void mo9195e() {
        this.f12612e.mo11457s();
    }

    /* renamed from: g */
    public final long mo9196g() {
        if (this.f12622o.mo8137h()) {
            return -9223372036854775807L;
        }
        C1812if ifVar = this.f12622o;
        mo10039b();
        return C1774he.m10488b(ifVar.mo8136g(0, this.f12614g, false).f8193a);
    }

    /* renamed from: h */
    public final void mo9197h() {
        this.f12612e.mo11459u();
        this.f12611d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: l */
    public final void mo9198l() {
        this.f12612e.mo11454A();
    }

    /* renamed from: r */
    public final boolean mo9199r() {
        return this.f12617j;
    }

    /* renamed from: s */
    public final void mo9200s(int i) {
        this.f12612e.mo11462x(i);
    }

    /* renamed from: x0 */
    public final void mo9201x0(boolean z) {
        if (this.f12617j != z) {
            this.f12617j = z;
            this.f12612e.mo11464z(z);
            Iterator<C1848je> it = this.f12613f.iterator();
            while (it.hasNext()) {
                it.next().mo5486t(z, this.f12618k);
            }
        }
    }

    /* renamed from: y0 */
    public final void mo9202y0(int i) {
        this.f12612e.mo11463y(i);
    }

    /* renamed from: z0 */
    public final void mo9203z0(C1922le... leVarArr) {
        this.f12612e.mo11461w(leVarArr);
    }

    public final int zza() {
        return this.f12618k;
    }
}
