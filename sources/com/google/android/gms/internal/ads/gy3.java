package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

public final class gy3 extends lx3 {

    /* renamed from: A */
    private float f7895A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f7896B;

    /* renamed from: C */
    private List f7897C;

    /* renamed from: D */
    private boolean f7898D;

    /* renamed from: E */
    private boolean f7899E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public r34 f7900F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ry0 f7901G;

    /* renamed from: b */
    protected final xx3[] f7902b;

    /* renamed from: c */
    private final ay1 f7903c;

    /* renamed from: d */
    private final Context f7904d;

    /* renamed from: e */
    private final qw3 f7905e;

    /* renamed from: f */
    private final dy3 f7906f;

    /* renamed from: g */
    private final fy3 f7907g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<r80> f7908h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final q04 f7909i;

    /* renamed from: j */
    private final l63 f7910j;

    /* renamed from: k */
    private final ab3 f7911k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ny3 f7912l;

    /* renamed from: m */
    private final oy3 f7913m;

    /* renamed from: n */
    private final py3 f7914n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1574c0 f7915o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C1574c0 f7916p;

    /* renamed from: q */
    private AudioTrack f7917q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Object f7918r;

    /* renamed from: s */
    private Surface f7919s;

    /* renamed from: t */
    private int f7920t;

    /* renamed from: u */
    private int f7921u;

    /* renamed from: v */
    private int f7922v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public cd3 f7923w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public cd3 f7924x;

    /* renamed from: y */
    private int f7925y;

    /* renamed from: z */
    private ef3 f7926z;

    protected gy3(by3 by3) {
        gy3 gy3;
        int a;
        ay1 ay1 = new ay1(xv1.f17360a);
        this.f7903c = ay1;
        try {
            Context applicationContext = by3.f5196a.getApplicationContext();
            this.f7904d = applicationContext;
            q04 j = by3.f5202g;
            this.f7909i = j;
            this.f7926z = by3.f5204i;
            this.f7920t = 1;
            this.f7896B = false;
            dy3 dy3 = new dy3(this, (cy3) null);
            this.f7906f = dy3;
            fy3 fy3 = new fy3((ey3) null);
            this.f7907g = fy3;
            this.f7908h = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(by3.f5203h);
            xx3[] a2 = by3.f5207l.mo10174a(handler, dy3, dy3, dy3, dy3);
            this.f7902b = a2;
            this.f7895A = 1.0f;
            if (n13.f11236a < 21) {
                AudioTrack audioTrack = this.f7917q;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.f7917q.release();
                    this.f7917q = null;
                }
                if (this.f7917q == null) {
                    this.f7917q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                a = this.f7917q.getAudioSessionId();
            } else {
                a = nz3.m14193a(applicationContext);
            }
            this.f7925y = a;
            this.f7897C = Collections.emptyList();
            this.f7898D = true;
            b50 b50 = new b50();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                b50.mo5712c(iArr);
                z60 e = b50.mo5714e();
                qw3 qw3 = r1;
                Handler handler2 = handler;
                fy3 fy32 = fy3;
                dy3 dy32 = dy3;
                qw3 qw32 = new qw3(a2, by3.f5198c, by3.f5199d, by3.f5200e, by3.f5201f, j, true, by3.f5205j, 5000, 15000, by3.f5208m, 500, false, by3.f5197b, by3.f5203h, this, e, (byte[]) null);
                gy3 = this;
                qw3 qw33 = qw3;
                try {
                    gy3.f7905e = qw33;
                    dy3 dy33 = dy32;
                    qw33.mo10414O(dy33);
                    qw33.mo10413N(dy33);
                    Handler handler3 = handler2;
                    gy3.f7910j = new l63(by3.f5196a, handler3, dy33);
                    gy3.f7911k = new ab3(by3.f5196a, handler3, dy33);
                    n13.m13643p((Object) null, (Object) null);
                    ny3 ny3 = new ny3(by3.f5196a, handler3, dy33);
                    gy3.f7912l = ny3;
                    int i = gy3.f7926z.f6202a;
                    ny3.mo9615f(3);
                    gy3.f7913m = new oy3(by3.f5196a);
                    gy3.f7914n = new py3(by3.f5196a);
                    gy3.f7900F = m10108S(ny3);
                    gy3.f7901G = ry0.f14164e;
                    gy3.m10110U(1, 10, Integer.valueOf(gy3.f7925y));
                    gy3.m10110U(2, 10, Integer.valueOf(gy3.f7925y));
                    gy3.m10110U(1, 3, gy3.f7926z);
                    gy3.m10110U(2, 4, Integer.valueOf(gy3.f7920t));
                    gy3.m10110U(2, 5, 0);
                    gy3.m10110U(1, 9, Boolean.valueOf(gy3.f7896B));
                    fy3 fy33 = fy32;
                    gy3.m10110U(2, 7, fy33);
                    gy3.m10110U(6, 8, fy33);
                    ay1.mo5567e();
                } catch (Throwable th) {
                    th = th;
                    gy3.f7903c.mo5567e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gy3 = this;
                gy3.f7903c.mo5567e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            gy3 = this;
            gy3.f7903c.mo5567e();
            throw th;
        }
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m10102B(gy3 gy3, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        gy3.m10112W(surface);
        gy3.f7919s = surface;
    }

    /* renamed from: E */
    static /* synthetic */ void m10105E(gy3 gy3) {
        int a0 = gy3.mo7750a0();
        if (a0 == 2 || a0 == 3) {
            gy3.m10114Y();
            gy3.f7905e.mo10423x();
            gy3.mo7748Q();
            gy3.mo7748Q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static int m10107R(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static r34 m10108S(ny3 ny3) {
        return new r34(0, ny3.mo9613b(), ny3.mo9612a());
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m10109T(int i, int i2) {
        if (i != this.f7921u || i2 != this.f7922v) {
            this.f7921u = i;
            this.f7922v = i2;
            this.f7909i.mo10227y(i, i2);
            Iterator<r80> it = this.f7908h.iterator();
            while (it.hasNext()) {
                it.next().mo10227y(i, i2);
            }
        }
    }

    /* renamed from: U */
    private final void m10110U(int i, int i2, Object obj) {
        xx3[] xx3Arr = this.f7902b;
        int length = xx3Arr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            xx3 xx3 = xx3Arr[i3];
            if (xx3.mo5787a() == i) {
                ux3 M = this.f7905e.mo10412M(xx3);
                M.mo11325f(i2);
                M.mo11324e(obj);
                M.mo11323d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public final void m10111V() {
        m10110U(1, 2, Float.valueOf(this.f7895A * this.f7911k.mo5217a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final void m10112W(Object obj) {
        boolean z;
        ArrayList<ux3> arrayList = new ArrayList<>();
        xx3[] xx3Arr = this.f7902b;
        int length = xx3Arr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            xx3 xx3 = xx3Arr[i];
            if (xx3.mo5787a() == 2) {
                ux3 M = this.f7905e.mo10412M(xx3);
                M.mo11325f(1);
                M.mo11324e(obj);
                M.mo11323d();
                arrayList.add(M);
            }
            i++;
        }
        Object obj2 = this.f7918r;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (ux3 i2 : arrayList) {
                    i2.mo11328i(2000);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f7918r;
            Surface surface = this.f7919s;
            if (obj3 == surface) {
                surface.release();
                this.f7919s = null;
            }
        }
        this.f7918r = obj;
        if (z) {
            this.f7905e.mo10422w(false, ll3.m12787d(new bx3(3), 1003));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public final void m10113X(boolean z, int i, int i2) {
        int i3 = 1;
        boolean z2 = z && i != -1;
        if (!z2 || i == 1) {
            i3 = 0;
        }
        this.f7905e.mo10421v(z2, i3, i2);
    }

    /* renamed from: Y */
    private final void m10114Y() {
        this.f7903c.mo5564b();
        if (Thread.currentThread() != this.f7905e.mo10411L().getThread()) {
            String d = n13.m13628d("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f7905e.mo10411L().getThread().getName());
            if (!this.f7898D) {
                oc2.m14400b("SimpleExoPlayer", d, this.f7899E ? null : new IllegalStateException());
                this.f7899E = true;
                return;
            }
            throw new IllegalStateException(d);
        }
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m10130z(gy3 gy3) {
        gy3.f7909i.mo6731a(gy3.f7896B);
        Iterator<r80> it = gy3.f7908h.iterator();
        while (it.hasNext()) {
            it.next().mo6731a(gy3.f7896B);
        }
    }

    /* renamed from: F */
    public final void mo7738F(s04 s04) {
        this.f7909i.mo10214J(s04);
    }

    /* renamed from: G */
    public final void mo7739G() {
        m10114Y();
        boolean Q = mo7748Q();
        int b = this.f7911k.mo5218b(Q, 2);
        m10113X(Q, b, m10107R(Q, b));
        this.f7905e.mo10418s();
    }

    /* renamed from: H */
    public final void mo7740H() {
        AudioTrack audioTrack;
        m10114Y();
        if (n13.f11236a < 21 && (audioTrack = this.f7917q) != null) {
            audioTrack.release();
            this.f7917q = null;
        }
        this.f7912l.mo9614e();
        this.f7911k.mo5219d();
        this.f7905e.mo10419t();
        this.f7909i.mo10217M();
        Surface surface = this.f7919s;
        if (surface != null) {
            surface.release();
            this.f7919s = null;
        }
        this.f7897C = Collections.emptyList();
    }

    /* renamed from: I */
    public final void mo7741I(s04 s04) {
        this.f7909i.mo10218O(s04);
    }

    /* renamed from: J */
    public final void mo7742J(v54 v54) {
        m10114Y();
        this.f7905e.mo10420u(Collections.singletonList(v54), true);
    }

    /* renamed from: K */
    public final void mo7743K(boolean z) {
        m10114Y();
        int b = this.f7911k.mo5218b(z, mo7750a0());
        m10113X(z, b, m10107R(z, b));
    }

    @Deprecated
    /* renamed from: L */
    public final void mo7744L(boolean z) {
        this.f7898D = false;
    }

    /* renamed from: M */
    public final void mo7745M(Surface surface) {
        m10114Y();
        m10112W(surface);
        int i = surface == null ? 0 : -1;
        m10109T(i, i);
    }

    /* renamed from: N */
    public final void mo7746N(float f) {
        m10114Y();
        float A = n13.m13596A(f, 0.0f, 1.0f);
        if (this.f7895A != A) {
            this.f7895A = A;
            m10111V();
            this.f7909i.mo10226w(A);
            Iterator<r80> it = this.f7908h.iterator();
            while (it.hasNext()) {
                it.next().mo10226w(A);
            }
        }
    }

    @Deprecated
    /* renamed from: O */
    public final void mo7747O(boolean z) {
        m10114Y();
        this.f7911k.mo5218b(mo7748Q(), 1);
        this.f7905e.mo10422w(false, (ll3) null);
        this.f7897C = Collections.emptyList();
    }

    /* renamed from: Q */
    public final boolean mo7748Q() {
        m10114Y();
        return this.f7905e.mo10424y();
    }

    /* renamed from: a */
    public final void mo7749a(int i, long j) {
        m10114Y();
        this.f7909i.mo10216L();
        this.f7905e.mo7749a(i, j);
    }

    /* renamed from: a0 */
    public final int mo7750a0() {
        m10114Y();
        return this.f7905e.mo10407H();
    }

    /* renamed from: b */
    public final int mo7751b() {
        m10114Y();
        return this.f7905e.mo7751b();
    }

    /* renamed from: b0 */
    public final int mo7752b0() {
        m10114Y();
        this.f7905e.mo10408I();
        return 2;
    }

    /* renamed from: c0 */
    public final long mo7753c0() {
        m10114Y();
        return this.f7905e.mo10409J();
    }

    /* renamed from: d */
    public final int mo7754d() {
        m10114Y();
        return this.f7905e.mo7754d();
    }

    /* renamed from: d0 */
    public final long mo7755d0() {
        m10114Y();
        return this.f7905e.mo10410K();
    }

    /* renamed from: e */
    public final int mo7756e() {
        m10114Y();
        return this.f7905e.mo7756e();
    }

    /* renamed from: f */
    public final int mo7757f() {
        m10114Y();
        return this.f7905e.mo7757f();
    }

    /* renamed from: h */
    public final int mo7758h() {
        m10114Y();
        return 0;
    }

    /* renamed from: i */
    public final long mo7759i() {
        m10114Y();
        return this.f7905e.mo7759i();
    }

    /* renamed from: j */
    public final long mo7760j() {
        m10114Y();
        return this.f7905e.mo7760j();
    }

    /* renamed from: k */
    public final long mo7761k() {
        m10114Y();
        return this.f7905e.mo7761k();
    }

    /* renamed from: l */
    public final boolean mo7762l() {
        m10114Y();
        return this.f7905e.mo7762l();
    }

    /* renamed from: n */
    public final boolean mo7763n() {
        m10114Y();
        return false;
    }

    /* renamed from: o */
    public final ei0 mo7764o() {
        m10114Y();
        return this.f7905e.mo7764o();
    }
}
