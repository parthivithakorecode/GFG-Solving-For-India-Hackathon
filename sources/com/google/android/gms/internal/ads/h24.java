package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public final class h24 implements o14 {

    /* renamed from: A */
    private ByteBuffer[] f7972A;

    /* renamed from: B */
    private ByteBuffer f7973B;

    /* renamed from: C */
    private ByteBuffer f7974C;

    /* renamed from: D */
    private byte[] f7975D;

    /* renamed from: E */
    private int f7976E;

    /* renamed from: F */
    private int f7977F;

    /* renamed from: G */
    private boolean f7978G;

    /* renamed from: H */
    private boolean f7979H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f7980I;

    /* renamed from: J */
    private boolean f7981J;

    /* renamed from: K */
    private int f7982K;

    /* renamed from: L */
    private kw3 f7983L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public long f7984M;

    /* renamed from: N */
    private boolean f7985N;

    /* renamed from: O */
    private boolean f7986O;

    /* renamed from: P */
    private final y14 f7987P;

    /* renamed from: a */
    private final v14 f7988a;

    /* renamed from: b */
    private final r24 f7989b;

    /* renamed from: c */
    private final w04[] f7990c;

    /* renamed from: d */
    private final w04[] f7991d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f7992e = new ConditionVariable(true);

    /* renamed from: f */
    private final t14 f7993f = new t14(new d24(this, (c24) null));

    /* renamed from: g */
    private final ArrayDeque<a24> f7994g;

    /* renamed from: h */
    private g24 f7995h;

    /* renamed from: i */
    private final b24<k14> f7996i;

    /* renamed from: j */
    private final b24<n14> f7997j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public l14 f7998k;

    /* renamed from: l */
    private x14 f7999l;

    /* renamed from: m */
    private x14 f8000m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AudioTrack f8001n;

    /* renamed from: o */
    private ef3 f8002o;

    /* renamed from: p */
    private a24 f8003p;

    /* renamed from: q */
    private a24 f8004q;

    /* renamed from: r */
    private final e30 f8005r;

    /* renamed from: s */
    private long f8006s;

    /* renamed from: t */
    private long f8007t;

    /* renamed from: u */
    private long f8008u;

    /* renamed from: v */
    private boolean f8009v;

    /* renamed from: w */
    private boolean f8010w;

    /* renamed from: x */
    private long f8011x;

    /* renamed from: y */
    private float f8012y;

    /* renamed from: z */
    private w04[] f8013z;

    public h24(t04 t04, w04[] w04Arr, boolean z) {
        y14 y14 = new y14(w04Arr);
        this.f7987P = y14;
        int i = n13.f11236a;
        v14 v14 = new v14();
        this.f7988a = v14;
        r24 r24 = new r24();
        this.f7989b = r24;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new u14[]{new m24(), v14, r24});
        Collections.addAll(arrayList, y14.mo11956e());
        this.f7990c = (w04[]) arrayList.toArray(new w04[0]);
        this.f7991d = new w04[]{new i24()};
        this.f8012y = 1.0f;
        this.f8002o = ef3.f6200c;
        this.f7982K = 0;
        this.f7983L = new kw3(0, 0.0f);
        e30 e30 = e30.f6075d;
        this.f8004q = new a24(e30, false, 0, 0, (z14) null);
        this.f8005r = e30;
        this.f7977F = -1;
        this.f8013z = new w04[0];
        this.f7972A = new ByteBuffer[0];
        this.f7994g = new ArrayDeque<>();
        this.f7996i = new b24<>(100);
        this.f7997j = new b24<>(100);
    }

    /* renamed from: A */
    private final void m10222A(long j) {
        e30 e30;
        boolean z;
        if (m10232K()) {
            y14 y14 = this.f7987P;
            e30 = m10243z().f3899a;
            y14.mo11954c(e30);
        } else {
            e30 = e30.f6075d;
        }
        e30 e302 = e30;
        if (m10232K()) {
            y14 y142 = this.f7987P;
            boolean z2 = m10243z().f3900b;
            y142.mo11955d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.f7994g.add(new a24(e302, z, Math.max(0, j), this.f8000m.mo11758b(m10242y()), (z14) null));
        w04[] w04Arr = this.f8000m.f16991i;
        ArrayList arrayList = new ArrayList();
        for (w04 w04 : w04Arr) {
            if (w04.mo9402e()) {
                arrayList.add(w04);
            } else {
                w04.mo9935c();
            }
        }
        int size = arrayList.size();
        this.f8013z = (w04[]) arrayList.toArray(new w04[size]);
        this.f7972A = new ByteBuffer[size];
        m10223B();
        l14 l14 = this.f7998k;
        if (l14 != null) {
            ((k24) l14).f9353a.f9854H0.mo7800s(z);
        }
    }

    /* renamed from: B */
    private final void m10223B() {
        int i = 0;
        while (true) {
            w04[] w04Arr = this.f8013z;
            if (i < w04Arr.length) {
                w04 w04 = w04Arr[i];
                w04.mo9935c();
                this.f7972A[i] = w04.mo9933a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    private final void m10224C() {
        if (!this.f7979H) {
            this.f7979H = true;
            this.f7993f.mo10923d(m10242y());
            this.f8001n.stop();
        }
    }

    /* renamed from: D */
    private final void m10225D(long j) {
        ByteBuffer byteBuffer;
        int length = this.f8013z.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7972A[i - 1];
            } else {
                byteBuffer = this.f7973B;
                if (byteBuffer == null) {
                    byteBuffer = w04.f16648a;
                }
            }
            if (i == length) {
                m10228G(byteBuffer, j);
            } else {
                w04 w04 = this.f8013z[i];
                if (i > this.f7977F) {
                    w04.mo8062h(byteBuffer);
                }
                ByteBuffer a = w04.mo9933a();
                this.f7972A[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    private final void m10226E(e30 e30, boolean z) {
        a24 z2 = m10243z();
        if (!e30.equals(z2.f3899a) || z != z2.f3900b) {
            a24 a24 = new a24(e30, z, -9223372036854775807L, -9223372036854775807L, (z14) null);
            if (m10230I()) {
                this.f8003p = a24;
            } else {
                this.f8004q = a24;
            }
        }
    }

    /* renamed from: F */
    private final void m10227F() {
        if (m10230I()) {
            if (n13.f11236a >= 21) {
                this.f8001n.setVolume(this.f8012y);
                return;
            }
            AudioTrack audioTrack = this.f8001n;
            float f = this.f8012y;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: G */
    private final void m10228G(ByteBuffer byteBuffer, long j) {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7974C;
            boolean z = true;
            if (byteBuffer2 != null) {
                wu1.m19205d(byteBuffer2 == byteBuffer);
            } else {
                this.f7974C = byteBuffer;
                if (n13.f11236a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f7975D;
                    if (bArr == null || bArr.length < remaining) {
                        this.f7975D = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f7975D, 0, remaining);
                    byteBuffer.position(position);
                    this.f7976E = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i2 = n13.f11236a;
            if (i2 < 21) {
                int a = this.f7993f.mo10920a(this.f8007t);
                if (a > 0) {
                    i = this.f8001n.write(this.f7975D, this.f7976E, Math.min(remaining2, a));
                    if (i > 0) {
                        this.f7976E += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.f8001n.write(byteBuffer, remaining2, 1);
            }
            this.f7984M = SystemClock.elapsedRealtime();
            if (i < 0) {
                if ((i2 < 24 || i != -6) && i != -32) {
                    z = false;
                }
                n14 n14 = new n14(i, this.f8000m.f16983a, z);
                l14 l14 = this.f7998k;
                if (l14 != null) {
                    l14.mo8592b(n14);
                }
                if (!n14.f11251f) {
                    this.f7997j.mo5637b(n14);
                    return;
                }
                throw n14;
            }
            this.f7997j.mo5636a();
            if (m10231J(this.f8001n) && this.f7980I && this.f7998k != null && i < remaining2 && !this.f7986O) {
                long c = this.f7993f.mo10922c(0);
                k24 k24 = (k24) this.f7998k;
                if (k24.f9353a.f9863Q0 != null) {
                    k24.f9353a.f9863Q0.mo11124b(c);
                }
            }
            int i3 = this.f8000m.f16985c;
            this.f8007t += (long) i;
            if (i == remaining2) {
                this.f7974C = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m10229H() {
        /*
            r9 = this;
            int r0 = r9.f7977F
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f7977F = r3
        L_0x0009:
            r0 = r2
            goto L_0x000c
        L_0x000b:
            r0 = r3
        L_0x000c:
            int r4 = r9.f7977F
            com.google.android.gms.internal.ads.w04[] r5 = r9.f8013z
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo9938g()
        L_0x001f:
            r9.m10225D(r7)
            boolean r0 = r4.mo9937f()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f7977F
            int r0 = r0 + r2
            r9.f7977F = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f7974C
            if (r0 == 0) goto L_0x003b
            r9.m10228G(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7974C
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f7977F = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h24.m10229H():boolean");
    }

    /* renamed from: I */
    private final boolean m10230I() {
        return this.f8001n != null;
    }

    /* renamed from: J */
    private static boolean m10231J(AudioTrack audioTrack) {
        return n13.f11236a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: K */
    private final boolean m10232K() {
        if (!"audio/raw".equals(this.f8000m.f16983a.f5234l)) {
            return false;
        }
        int i = this.f8000m.f16983a.f5217A;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final long m10241x() {
        x14 x14 = this.f8000m;
        int i = x14.f16985c;
        return this.f8006s / ((long) x14.f16984b);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final long m10242y() {
        x14 x14 = this.f8000m;
        int i = x14.f16985c;
        return this.f8007t / ((long) x14.f16986d);
    }

    /* renamed from: z */
    private final a24 m10243z() {
        a24 a24 = this.f8003p;
        return a24 != null ? a24 : !this.f7994g.isEmpty() ? this.f7994g.getLast() : this.f8004q;
    }

    /* renamed from: X */
    public final long mo7813X(boolean z) {
        long j;
        if (!m10230I() || this.f8010w) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f7993f.mo10921b(z), this.f8000m.mo11758b(m10242y()));
        while (!this.f7994g.isEmpty() && min >= this.f7994g.getFirst().f3902d) {
            this.f8004q = this.f7994g.remove();
        }
        a24 a24 = this.f8004q;
        long j2 = min - a24.f3902d;
        if (a24.f3899a.equals(e30.f6075d)) {
            j = this.f8004q.f3901c + j2;
        } else if (this.f7994g.isEmpty()) {
            j = this.f7987P.mo11952a(j2) + this.f8004q.f3901c;
        } else {
            a24 first = this.f7994g.getFirst();
            j = first.f3901c - n13.m13617V(first.f3902d - min, this.f8004q.f3899a.f6077a);
        }
        return j + this.f8000m.mo11758b(this.f7987P.mo11953b());
    }

    /* renamed from: a */
    public final int mo7814a(C1574c0 c0Var) {
        if ("audio/raw".equals(c0Var.f5234l)) {
            boolean r = n13.m13645r(c0Var.f5217A);
            int i = c0Var.f5217A;
            if (r) {
                return i != 2 ? 1 : 2;
            }
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        }
        int i2 = n13.f11236a;
        return 0;
    }

    /* renamed from: b */
    public final void mo7815b() {
        if (m10230I()) {
            this.f8006s = 0;
            this.f8007t = 0;
            this.f8008u = 0;
            this.f7986O = false;
            this.f8004q = new a24(m10243z().f3899a, m10243z().f3900b, 0, 0, (z14) null);
            this.f8011x = 0;
            this.f8003p = null;
            this.f7994g.clear();
            this.f7973B = null;
            this.f7974C = null;
            this.f7979H = false;
            this.f7978G = false;
            this.f7977F = -1;
            this.f7989b.mo10466p();
            m10223B();
            if (this.f7993f.mo10928i()) {
                this.f8001n.pause();
            }
            if (m10231J(this.f8001n)) {
                g24 g24 = this.f7995h;
                Objects.requireNonNull(g24);
                g24.mo7500b(this.f8001n);
            }
            AudioTrack audioTrack = this.f8001n;
            this.f8001n = null;
            if (n13.f11236a < 21 && !this.f7981J) {
                this.f7982K = 0;
            }
            x14 x14 = this.f7999l;
            if (x14 != null) {
                this.f8000m = x14;
                this.f7999l = null;
            }
            this.f7993f.mo10924e();
            this.f7992e.close();
            new w14(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f7997j.mo5636a();
        this.f7996i.mo5636a();
    }

    /* renamed from: c */
    public final e30 mo7816c() {
        return m10243z().f3899a;
    }

    /* renamed from: d */
    public final void mo7817d() {
        this.f8009v = true;
    }

    /* renamed from: e */
    public final void mo7818e() {
        this.f7980I = false;
        if (m10230I() && this.f7993f.mo10931l()) {
            this.f8001n.pause();
        }
    }

    /* renamed from: f */
    public final void mo7819f() {
        this.f7980I = true;
        if (m10230I()) {
            this.f7993f.mo10926g();
            this.f8001n.play();
        }
    }

    /* renamed from: g */
    public final void mo7820g(e30 e30) {
        m10226E(new e30(n13.m13596A(e30.f6077a, 0.1f, 8.0f), n13.m13596A(e30.f6078b, 0.1f, 8.0f)), m10243z().f3900b);
    }

    /* renamed from: h */
    public final void mo7821h() {
        if (!this.f7978G && m10230I() && m10229H()) {
            m10224C();
            this.f7978G = true;
        }
    }

    /* renamed from: i */
    public final void mo7822i() {
        mo7815b();
        for (w04 d : this.f7990c) {
            d.mo9936d();
        }
        w04[] w04Arr = this.f7991d;
        int length = w04Arr.length;
        for (int i = 0; i <= 0; i++) {
            w04Arr[i].mo9936d();
        }
        this.f7980I = false;
        this.f7985N = false;
    }

    /* renamed from: j */
    public final void mo7823j(float f) {
        if (this.f8012y != f) {
            this.f8012y = f;
            m10227F();
        }
    }

    /* renamed from: k */
    public final boolean mo7824k(ByteBuffer byteBuffer, long j, int i) {
        ByteBuffer byteBuffer2 = this.f7973B;
        wu1.m19205d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7999l != null) {
            if (!m10229H()) {
                return false;
            }
            x14 x14 = this.f7999l;
            x14 x142 = this.f8000m;
            int i2 = x142.f16985c;
            int i3 = x14.f16985c;
            if (x142.f16989g == x14.f16989g && x142.f16987e == x14.f16987e && x142.f16988f == x14.f16988f && x142.f16986d == x14.f16986d) {
                this.f8000m = x14;
                this.f7999l = null;
                if (m10231J(this.f8001n)) {
                    this.f8001n.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f8001n;
                    C1574c0 c0Var = this.f8000m.f16983a;
                    audioTrack.setOffloadDelayPadding(c0Var.f5218B, c0Var.f5219C);
                    this.f7986O = true;
                }
            } else {
                m10224C();
                if (mo7829p()) {
                    return false;
                }
                mo7815b();
            }
            m10222A(j);
        }
        if (!m10230I()) {
            try {
                this.f7992e.block();
                x14 x143 = this.f8000m;
                Objects.requireNonNull(x143);
                AudioTrack c = x143.mo11759c(false, this.f8002o, this.f7982K);
                this.f8001n = c;
                if (m10231J(c)) {
                    AudioTrack audioTrack2 = this.f8001n;
                    if (this.f7995h == null) {
                        this.f7995h = new g24(this);
                    }
                    this.f7995h.mo7499a(audioTrack2);
                    AudioTrack audioTrack3 = this.f8001n;
                    C1574c0 c0Var2 = this.f8000m.f16983a;
                    audioTrack3.setOffloadDelayPadding(c0Var2.f5218B, c0Var2.f5219C);
                }
                this.f7982K = this.f8001n.getAudioSessionId();
                t14 t14 = this.f7993f;
                AudioTrack audioTrack4 = this.f8001n;
                x14 x144 = this.f8000m;
                int i4 = x144.f16985c;
                t14.mo10925f(audioTrack4, false, x144.f16989g, x144.f16986d, x144.f16990h);
                m10227F();
                int i5 = this.f7983L.f9698a;
                this.f8010w = true;
            } catch (k14 e) {
                l14 l14 = this.f7998k;
                if (l14 != null) {
                    l14.mo8592b(e);
                }
                throw e;
            } catch (k14 e2) {
                this.f7996i.mo5637b(e2);
                return false;
            }
        }
        this.f7996i.mo5636a();
        if (this.f8010w) {
            this.f8011x = Math.max(0, j);
            this.f8009v = false;
            this.f8010w = false;
            m10222A(j);
            if (this.f7980I) {
                mo7819f();
            }
        }
        if (!this.f7993f.mo10930k(m10242y())) {
            return false;
        }
        if (this.f7973B == null) {
            wu1.m19205d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            int i6 = this.f8000m.f16985c;
            if (this.f8003p != null) {
                if (!m10229H()) {
                    return false;
                }
                m10222A(j);
                this.f8003p = null;
            }
            long x = this.f8011x + (((m10241x() - this.f7989b.mo10465o()) * 1000000) / ((long) this.f8000m.f16983a.f5248z));
            if (!this.f8009v && Math.abs(x - j) > 200000) {
                this.f7998k.mo8592b(new m14(j, x));
                this.f8009v = true;
            }
            if (this.f8009v) {
                if (!m10229H()) {
                    return false;
                }
                long j2 = j - x;
                this.f8011x += j2;
                this.f8009v = false;
                m10222A(j);
                l14 l142 = this.f7998k;
                if (!(l142 == null || j2 == 0)) {
                    ((k24) l142).f9353a.mo8856h0();
                }
            }
            int i7 = this.f8000m.f16985c;
            this.f8006s += (long) byteBuffer.remaining();
            this.f7973B = byteBuffer;
        }
        m10225D(j);
        if (!this.f7973B.hasRemaining()) {
            this.f7973B = null;
            return true;
        } else if (!this.f7993f.mo10929j(m10242y())) {
            return false;
        } else {
            Log.w("DefaultAudioSink", "Resetting stalled audio track");
            mo7815b();
            return true;
        }
    }

    /* renamed from: l */
    public final void mo7825l(kw3 kw3) {
        if (!this.f7983L.equals(kw3)) {
            int i = kw3.f9698a;
            if (this.f8001n != null) {
                int i2 = this.f7983L.f9698a;
            }
            this.f7983L = kw3;
        }
    }

    /* renamed from: m */
    public final void mo7826m(l14 l14) {
        this.f7998k = l14;
    }

    /* renamed from: n */
    public final void mo7827n(C1574c0 c0Var, int i, int[] iArr) {
        if ("audio/raw".equals(c0Var.f5234l)) {
            wu1.m19205d(n13.m13645r(c0Var.f5217A));
            int S = n13.m13614S(c0Var.f5217A, c0Var.f5247y);
            w04[] w04Arr = this.f7990c;
            this.f7989b.mo10467q(c0Var.f5218B, c0Var.f5219C);
            if (n13.f11236a < 21 && c0Var.f5247y == 8 && iArr == null) {
                iArr = new int[6];
                for (int i2 = 0; i2 < 6; i2++) {
                    iArr[i2] = i2;
                }
            }
            this.f7988a.mo11367o(iArr);
            u04 u04 = new u04(c0Var.f5248z, c0Var.f5247y, c0Var.f5217A);
            int length = w04Arr.length;
            int i3 = 0;
            while (i3 < length) {
                w04 w04 = w04Arr[i3];
                try {
                    u04 b = w04.mo9934b(u04);
                    if (true == w04.mo9402e()) {
                        u04 = b;
                    }
                    i3++;
                } catch (v04 e) {
                    throw new j14((Throwable) e, c0Var);
                }
            }
            int i4 = u04.f15314c;
            int i5 = u04.f15312a;
            int P = n13.m13611P(u04.f15313b);
            int S2 = n13.m13614S(i4, u04.f15313b);
            if (i4 == 0) {
                String valueOf = String.valueOf(c0Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Invalid output encoding (mode=0) for: ");
                sb.append(valueOf);
                throw new j14(sb.toString(), c0Var);
            } else if (P != 0) {
                this.f7985N = false;
                x14 x14 = new x14(c0Var, S, 0, S2, i5, P, i4, 0, false, w04Arr);
                if (m10230I()) {
                    this.f7999l = x14;
                } else {
                    this.f8000m = x14;
                }
            } else {
                String valueOf2 = String.valueOf(c0Var);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 54);
                sb2.append("Invalid output channel config (mode=0) for: ");
                sb2.append(valueOf2);
                throw new j14(sb2.toString(), c0Var);
            }
        } else {
            int i6 = n13.f11236a;
            throw new j14("Unable to configure passthrough for: ".concat(String.valueOf(c0Var)), c0Var);
        }
    }

    /* renamed from: o */
    public final void mo7828o(ef3 ef3) {
        if (!this.f8002o.equals(ef3)) {
            this.f8002o = ef3;
            mo7815b();
        }
    }

    /* renamed from: p */
    public final boolean mo7829p() {
        return m10230I() && this.f7993f.mo10927h(m10242y());
    }

    /* renamed from: q */
    public final boolean mo7830q() {
        return !m10230I() || (this.f7978G && !mo7829p());
    }

    /* renamed from: r */
    public final void mo7831r(int i) {
        if (this.f7982K != i) {
            this.f7982K = i;
            this.f7981J = i != 0;
            mo7815b();
        }
    }

    /* renamed from: s */
    public final void mo7832s(boolean z) {
        m10226E(m10243z().f3899a, z);
    }

    /* renamed from: t */
    public final boolean mo7833t(C1574c0 c0Var) {
        return mo7814a(c0Var) != 0;
    }
}
