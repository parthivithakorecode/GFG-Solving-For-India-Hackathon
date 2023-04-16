package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.gg */
public final class C1739gg {

    /* renamed from: A */
    private Method f7415A;

    /* renamed from: B */
    private int f7416B;

    /* renamed from: C */
    private long f7417C;

    /* renamed from: D */
    private long f7418D;

    /* renamed from: E */
    private int f7419E;

    /* renamed from: F */
    private long f7420F;

    /* renamed from: G */
    private long f7421G;

    /* renamed from: H */
    private int f7422H;

    /* renamed from: I */
    private int f7423I;

    /* renamed from: J */
    private long f7424J;

    /* renamed from: K */
    private long f7425K;

    /* renamed from: L */
    private long f7426L;

    /* renamed from: M */
    private float f7427M;

    /* renamed from: N */
    private C1960mf[] f7428N;

    /* renamed from: O */
    private ByteBuffer[] f7429O;

    /* renamed from: P */
    private ByteBuffer f7430P;

    /* renamed from: Q */
    private ByteBuffer f7431Q;

    /* renamed from: R */
    private byte[] f7432R;

    /* renamed from: S */
    private int f7433S;

    /* renamed from: T */
    private int f7434T;

    /* renamed from: U */
    private boolean f7435U;

    /* renamed from: V */
    private boolean f7436V;

    /* renamed from: W */
    private int f7437W;

    /* renamed from: X */
    private boolean f7438X;

    /* renamed from: Y */
    private long f7439Y;

    /* renamed from: a */
    private final C1776hg f7440a;

    /* renamed from: b */
    private final C1998ng f7441b;

    /* renamed from: c */
    private final C1960mf[] f7442c;

    /* renamed from: d */
    private final C1590cg f7443d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f7444e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f7445f;

    /* renamed from: g */
    private final C2405yf f7446g;

    /* renamed from: h */
    private final LinkedList<C1665eg> f7447h;

    /* renamed from: i */
    private AudioTrack f7448i;

    /* renamed from: j */
    private int f7449j;

    /* renamed from: k */
    private int f7450k;

    /* renamed from: l */
    private int f7451l;

    /* renamed from: m */
    private int f7452m;

    /* renamed from: n */
    private boolean f7453n;

    /* renamed from: o */
    private int f7454o;

    /* renamed from: p */
    private long f7455p;

    /* renamed from: q */
    private C1552bf f7456q;

    /* renamed from: r */
    private C1552bf f7457r;

    /* renamed from: s */
    private long f7458s;

    /* renamed from: t */
    private long f7459t;

    /* renamed from: u */
    private int f7460u;

    /* renamed from: v */
    private int f7461v;

    /* renamed from: w */
    private long f7462w;

    /* renamed from: x */
    private long f7463x;

    /* renamed from: y */
    private boolean f7464y;

    /* renamed from: z */
    private long f7465z;

    public C1739gg(C1886kf kfVar, C1960mf[] mfVarArr, C1590cg cgVar) {
        this.f7443d = cgVar;
        if (C2449zm.f18287a >= 18) {
            try {
                this.f7415A = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7446g = C2449zm.f18287a >= 19 ? new C2442zf() : new C2405yf((C2368xf) null);
        C1776hg hgVar = new C1776hg();
        this.f7440a = hgVar;
        C1998ng ngVar = new C1998ng();
        this.f7441b = ngVar;
        C1960mf[] mfVarArr2 = new C1960mf[3];
        this.f7442c = mfVarArr2;
        mfVarArr2[0] = new C1924lg();
        mfVarArr2[1] = hgVar;
        System.arraycopy(mfVarArr, 0, mfVarArr2, 2, 0);
        mfVarArr2[2] = ngVar;
        this.f7445f = new long[10];
        this.f7427M = 1.0f;
        this.f7423I = 0;
        this.f7437W = 0;
        this.f7457r = C1552bf.f4896d;
        this.f7434T = -1;
        this.f7428N = new C1960mf[0];
        this.f7429O = new ByteBuffer[0];
        this.f7447h = new LinkedList<>();
    }

    /* renamed from: p */
    private final long m9748p(long j) {
        return (j * ((long) this.f7449j)) / 1000000;
    }

    /* renamed from: q */
    private final long m9749q(long j) {
        return (j * 1000000) / ((long) this.f7449j);
    }

    /* renamed from: r */
    private final long m9750r() {
        return this.f7453n ? this.f7421G : this.f7420F / ((long) this.f7419E);
    }

    /* renamed from: s */
    private final void m9751s(long j) {
        ByteBuffer byteBuffer;
        int length = this.f7428N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7429O[i - 1];
            } else {
                byteBuffer = this.f7430P;
                if (byteBuffer == null) {
                    byteBuffer = C1960mf.f10824a;
                }
            }
            if (i == length) {
                m9758z(byteBuffer, j);
            } else {
                C1960mf mfVar = this.f7428N[i];
                mfVar.mo7930d(byteBuffer);
                ByteBuffer c = mfVar.mo7929c();
                this.f7429O[i] = c;
                if (c.hasRemaining()) {
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

    /* renamed from: t */
    private final void m9752t() {
        ArrayList arrayList = new ArrayList();
        C1960mf[] mfVarArr = this.f7442c;
        for (int i = 0; i < 3; i++) {
            C1960mf mfVar = mfVarArr[i];
            if (mfVar.mo7934h()) {
                arrayList.add(mfVar);
            } else {
                mfVar.mo7933g();
            }
        }
        int size = arrayList.size();
        this.f7428N = (C1960mf[]) arrayList.toArray(new C1960mf[size]);
        this.f7429O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            C1960mf mfVar2 = this.f7428N[i2];
            mfVar2.mo7933g();
            this.f7429O[i2] = mfVar2.mo7929c();
        }
    }

    /* renamed from: u */
    private final void m9753u() {
        this.f7462w = 0;
        this.f7461v = 0;
        this.f7460u = 0;
        this.f7463x = 0;
        this.f7464y = false;
        this.f7465z = 0;
    }

    /* renamed from: v */
    private final void m9754v() {
        if (m9756x()) {
            if (C2449zm.f18287a >= 21) {
                this.f7448i.setVolume(this.f7427M);
                return;
            }
            AudioTrack audioTrack = this.f7448i;
            float f = this.f7427M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9755w() {
        /*
            r9 = this;
            int r0 = r9.f7434T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f7453n
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.mf[] r0 = r9.f7428N
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = r3
        L_0x0010:
            r9.f7434T = r0
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            int r4 = r9.f7434T
            com.google.android.gms.internal.ads.mf[] r5 = r9.f7428N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0036
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo7928b()
        L_0x0028:
            r9.m9751s(r7)
            boolean r0 = r4.mo7935i()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f7434T
            int r0 = r0 + r2
            goto L_0x0010
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.f7431Q
            if (r0 == 0) goto L_0x0042
            r9.m9758z(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7431Q
            if (r0 == 0) goto L_0x0042
            return r3
        L_0x0042:
            r9.f7434T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1739gg.m9755w():boolean");
    }

    /* renamed from: x */
    private final boolean m9756x() {
        return this.f7448i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f7452m;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9757y() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.C2449zm.f18287a
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.f7452m
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = r2
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1739gg.m9757y():boolean");
    }

    /* renamed from: z */
    private final boolean m9758z(ByteBuffer byteBuffer, long j) {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f7431Q;
        if (byteBuffer2 != null) {
            C1856jm.m11728c(byteBuffer2 == byteBuffer);
        } else {
            this.f7431Q = byteBuffer;
            if (C2449zm.f18287a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f7432R;
                if (bArr == null || bArr.length < remaining) {
                    this.f7432R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f7432R, 0, remaining);
                byteBuffer.position(position);
                this.f7433S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (C2449zm.f18287a < 21) {
            int a = this.f7454o - ((int) (this.f7420F - (this.f7446g.mo11996a() * ((long) this.f7419E))));
            if (a > 0) {
                i = this.f7448i.write(this.f7432R, this.f7433S, Math.min(remaining2, a));
                if (i > 0) {
                    this.f7433S += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.f7448i.write(byteBuffer, remaining2, 1);
        }
        this.f7439Y = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.f7453n;
            if (!z) {
                this.f7420F += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z) {
                this.f7421G += (long) this.f7422H;
            }
            this.f7431Q = null;
            return true;
        }
        throw new C1702fg(i);
    }

    /* renamed from: a */
    public final long mo7619a(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        StringBuilder sb;
        String str;
        if (!m9756x() || this.f7423I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f7448i.getPlayState() == 3) {
            long b = this.f7446g.mo11997b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f7463x >= 30000) {
                    long[] jArr = this.f7445f;
                    int i = this.f7460u;
                    jArr[i] = b - nanoTime;
                    this.f7460u = (i + 1) % 10;
                    int i2 = this.f7461v;
                    if (i2 < 10) {
                        this.f7461v = i2 + 1;
                    }
                    this.f7463x = nanoTime;
                    this.f7462w = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f7461v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f7462w += this.f7445f[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m9757y() && nanoTime - this.f7465z >= 500000) {
                    boolean h = this.f7446g.mo12003h();
                    this.f7464y = h;
                    if (h) {
                        long d = this.f7446g.mo11999d() / 1000;
                        long c = this.f7446g.mo11998c();
                        if (d >= this.f7425K) {
                            if (Math.abs(d - nanoTime) > 5000000) {
                                sb = new StringBuilder(136);
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(m9749q(c) - b) > 5000000) {
                                sb = new StringBuilder(138);
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(c);
                            sb.append(", ");
                            sb.append(d);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(b);
                            Log.w("AudioTrack", sb.toString());
                        }
                        this.f7464y = false;
                    }
                    Method method = this.f7415A;
                    if (method != null && !this.f7453n) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f7448i, (Object[]) null)).intValue()) * 1000) - this.f7455p;
                            this.f7426L = intValue;
                            long max = Math.max(intValue, 0);
                            this.f7426L = max;
                            if (max > 5000000) {
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(max);
                                Log.w("AudioTrack", sb2.toString());
                                this.f7426L = 0;
                            }
                        } catch (Exception unused) {
                            this.f7415A = null;
                        }
                    }
                    this.f7465z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f7464y) {
            j = m9749q(this.f7446g.mo11998c() + m9748p(nanoTime2 - (this.f7446g.mo11999d() / 1000)));
        } else {
            j = this.f7461v == 0 ? this.f7446g.mo11997b() : nanoTime2 + this.f7462w;
            if (!z) {
                j -= this.f7426L;
            }
        }
        long j5 = this.f7424J;
        while (!this.f7447h.isEmpty() && j >= this.f7447h.getFirst().f6206c) {
            C1665eg remove = this.f7447h.remove();
            this.f7457r = remove.f6204a;
            this.f7459t = remove.f6206c;
            this.f7458s = remove.f6205b - this.f7424J;
        }
        if (this.f7457r.f4897a == 1.0f) {
            j2 = (j + this.f7458s) - this.f7459t;
        } else {
            if (!this.f7447h.isEmpty() || this.f7441b.mo9525m() < 1024) {
                j3 = this.f7458s;
                j4 = (long) (((double) this.f7457r.f4897a) * ((double) (j - this.f7459t)));
            } else {
                j3 = this.f7458s;
                j4 = C2449zm.m20731j(j - this.f7459t, this.f7441b.mo9524l(), this.f7441b.mo9525m());
            }
            j2 = j4 + j3;
        }
        return j5 + j2;
    }

    /* renamed from: c */
    public final C1552bf mo7620c() {
        return this.f7457r;
    }

    /* renamed from: d */
    public final C1552bf mo7621d(C1552bf bfVar) {
        if (this.f7453n) {
            C1552bf bfVar2 = C1552bf.f4896d;
            this.f7457r = bfVar2;
            return bfVar2;
        }
        float k = this.f7441b.mo9523k(bfVar.f4897a);
        this.f7441b.mo9522j(1.0f);
        C1552bf bfVar3 = new C1552bf(k, 1.0f);
        C1552bf bfVar4 = this.f7456q;
        if (bfVar4 == null) {
            bfVar4 = !this.f7447h.isEmpty() ? this.f7447h.getLast().f6204a : this.f7457r;
        }
        if (!bfVar3.equals(bfVar4)) {
            if (m9756x()) {
                this.f7456q = bfVar3;
            } else {
                this.f7457r = bfVar3;
            }
        }
        return this.f7457r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b4  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7622e(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) {
        /*
            r6 = this;
            int r7 = com.google.android.gms.internal.ads.C2449zm.m20730i(r10, r8)
            r6.f7416B = r7
            com.google.android.gms.internal.ads.hg r7 = r6.f7440a
            r7.mo7936j(r12)
            com.google.android.gms.internal.ads.mf[] r7 = r6.f7442c
            r11 = 0
            r12 = r11
            r0 = r12
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r12 >= r1) goto L_0x0033
            r1 = r7[r12]
            boolean r3 = r1.mo7932f(r9, r8, r10)     // Catch:{ lf -> 0x002c }
            r0 = r0 | r3
            boolean r3 = r1.mo7934h()
            if (r3 == 0) goto L_0x0029
            int r8 = r1.zza()
            r1.mo7927a()
            r10 = r2
        L_0x0029:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x002c:
            r7 = move-exception
            com.google.android.gms.internal.ads.ag r8 = new com.google.android.gms.internal.ads.ag
            r8.<init>((java.lang.Throwable) r7)
            throw r8
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r6.m9752t()
        L_0x0038:
            r7 = 252(0xfc, float:3.53E-43)
            switch(r8) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0067;
                case 3: goto L_0x0064;
                case 4: goto L_0x0061;
                case 5: goto L_0x005e;
                case 6: goto L_0x005c;
                case 7: goto L_0x0059;
                case 8: goto L_0x0056;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.ag r7 = new com.google.android.gms.internal.ads.ag
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 38
            r9.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0056:
            int r12 = com.google.android.gms.internal.ads.C1774he.f8171a
            goto L_0x006b
        L_0x0059:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x006b
        L_0x005c:
            r12 = r7
            goto L_0x006b
        L_0x005e:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x006b
        L_0x0061:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x006b
        L_0x0064:
            r12 = 28
            goto L_0x006b
        L_0x0067:
            r12 = 12
            goto L_0x006b
        L_0x006a:
            r12 = 4
        L_0x006b:
            int r3 = com.google.android.gms.internal.ads.C2449zm.f18287a
            r4 = 23
            if (r3 > r4) goto L_0x0091
            java.lang.String r4 = com.google.android.gms.internal.ads.C2449zm.f18288b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = com.google.android.gms.internal.ads.C2449zm.f18289c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0091
            if (r8 == r1) goto L_0x0092
            r1 = 5
            if (r8 == r1) goto L_0x0092
            r7 = 7
            if (r8 == r7) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            int r7 = com.google.android.gms.internal.ads.C1774he.f8171a
            goto L_0x0092
        L_0x0091:
            r7 = r12
        L_0x0092:
            r12 = 25
            if (r3 > r12) goto L_0x009e
            java.lang.String r12 = com.google.android.gms.internal.ads.C2449zm.f18288b
            java.lang.String r1 = "fugu"
            boolean r12 = r1.equals(r12)
        L_0x009e:
            if (r0 != 0) goto L_0x00b4
            boolean r12 = r6.m9756x()
            if (r12 == 0) goto L_0x00b4
            int r12 = r6.f7451l
            if (r12 != r10) goto L_0x00b4
            int r12 = r6.f7449j
            if (r12 != r9) goto L_0x00b4
            int r12 = r6.f7450k
            if (r12 == r7) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return
        L_0x00b4:
            r6.mo7628k()
            r6.f7451l = r10
            r6.f7453n = r11
            r6.f7449j = r9
            r6.f7450k = r7
            r6.f7452m = r2
            int r8 = com.google.android.gms.internal.ads.C2449zm.m20730i(r2, r8)
            r6.f7419E = r8
            int r8 = r6.f7452m
            int r7 = android.media.AudioTrack.getMinBufferSize(r9, r7, r8)
            r8 = -2
            if (r7 == r8) goto L_0x00d1
            r11 = 1
        L_0x00d1:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r11)
            int r8 = r7 * 4
            r9 = 250000(0x3d090, double:1.235164E-318)
            long r9 = r6.m9748p(r9)
            int r9 = (int) r9
            int r10 = r6.f7419E
            int r9 = r9 * r10
            long r10 = (long) r7
            r0 = 750000(0xb71b0, double:3.70549E-318)
            long r0 = r6.m9748p(r0)
            int r7 = r6.f7419E
            long r2 = (long) r7
            long r0 = r0 * r2
            long r10 = java.lang.Math.max(r10, r0)
            int r7 = (int) r10
            if (r8 >= r9) goto L_0x00f6
            r8 = r9
            goto L_0x00f9
        L_0x00f6:
            if (r8 <= r7) goto L_0x00f9
            r8 = r7
        L_0x00f9:
            r6.f7454o = r8
            int r7 = r6.f7419E
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r6.m9749q(r7)
            r6.f7455p = r7
            com.google.android.gms.internal.ads.bf r7 = r6.f7457r
            r6.mo7621d(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1739gg.mo7622e(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: f */
    public final void mo7623f() {
        if (this.f7423I == 1) {
            this.f7423I = 2;
        }
    }

    /* renamed from: g */
    public final void mo7624g() {
        this.f7436V = false;
        if (m9756x()) {
            m9753u();
            this.f7446g.mo12001f();
        }
    }

    /* renamed from: h */
    public final void mo7625h() {
        this.f7436V = true;
        if (m9756x()) {
            this.f7425K = System.nanoTime() / 1000;
            this.f7448i.play();
        }
    }

    /* renamed from: i */
    public final void mo7626i() {
        if (!this.f7435U && m9756x() && m9755w()) {
            this.f7446g.mo12000e(m9750r());
            this.f7435U = true;
        }
    }

    /* renamed from: j */
    public final void mo7627j() {
        mo7628k();
        C1960mf[] mfVarArr = this.f7442c;
        for (int i = 0; i < 3; i++) {
            mfVarArr[i].mo7931e();
        }
        this.f7437W = 0;
        this.f7436V = false;
    }

    /* renamed from: k */
    public final void mo7628k() {
        if (m9756x()) {
            this.f7417C = 0;
            this.f7418D = 0;
            this.f7420F = 0;
            this.f7421G = 0;
            this.f7422H = 0;
            C1552bf bfVar = this.f7456q;
            if (bfVar != null) {
                this.f7457r = bfVar;
                this.f7456q = null;
            } else if (!this.f7447h.isEmpty()) {
                this.f7457r = this.f7447h.getLast().f6204a;
            }
            this.f7447h.clear();
            this.f7458s = 0;
            this.f7459t = 0;
            this.f7430P = null;
            this.f7431Q = null;
            int i = 0;
            while (true) {
                C1960mf[] mfVarArr = this.f7428N;
                if (i >= mfVarArr.length) {
                    break;
                }
                C1960mf mfVar = mfVarArr[i];
                mfVar.mo7933g();
                this.f7429O[i] = mfVar.mo7929c();
                i++;
            }
            this.f7435U = false;
            this.f7434T = -1;
            this.f7423I = 0;
            this.f7426L = 0;
            m9753u();
            if (this.f7448i.getPlayState() == 3) {
                this.f7448i.pause();
            }
            AudioTrack audioTrack = this.f7448i;
            this.f7448i = null;
            this.f7446g.mo12002g((AudioTrack) null, false);
            this.f7444e.close();
            new C2331wf(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void mo7629l(float f) {
        if (this.f7427M != f) {
            this.f7427M = f;
            m9754v();
        }
    }

    /* renamed from: m */
    public final boolean mo7630m(ByteBuffer byteBuffer, long j) {
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f7430P;
        C1856jm.m11728c(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m9756x()) {
            this.f7444e.block();
            int i2 = this.f7437W;
            int i3 = this.f7449j;
            int i4 = this.f7450k;
            int i5 = this.f7452m;
            int i6 = this.f7454o;
            if (i2 != 0) {
                AudioTrack audioTrack = new AudioTrack(3, i3, i4, i5, i6, 1, i2);
            }
            this.f7448i = audioTrack;
            int state = this.f7448i.getState();
            if (state == 1) {
                int audioSessionId = this.f7448i.getAudioSessionId();
                if (this.f7437W != audioSessionId) {
                    this.f7437W = audioSessionId;
                    ((C1850jg) this.f7443d).f9130a.f9523Q.mo11212b(audioSessionId);
                }
                this.f7446g.mo12002g(this.f7448i, m9757y());
                m9754v();
                this.f7438X = false;
                if (this.f7436V) {
                    mo7625h();
                }
            } else {
                try {
                    this.f7448i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f7448i = null;
                    throw th;
                }
                this.f7448i = null;
                throw new C1553bg(state, this.f7449j, this.f7450k, this.f7454o);
            }
        }
        if (m9757y()) {
            if (this.f7448i.getPlayState() == 2) {
                this.f7438X = false;
                return false;
            } else if (this.f7448i.getPlayState() == 1 && this.f7446g.mo11996a() != 0) {
                return false;
            }
        }
        boolean z = this.f7438X;
        boolean n = mo7631n();
        this.f7438X = n;
        if (z && !n && this.f7448i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.f7439Y;
            ((C1850jg) this.f7443d).f9130a.f9523Q.mo11213c(this.f7454o, C1774he.m10488b(this.f7455p), elapsedRealtime - j3);
        }
        if (this.f7430P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f7453n && this.f7422H == 0) {
                int i7 = this.f7452m;
                if (i7 == 7 || i7 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i7 == 5) {
                    int i8 = C1849jf.f9123d;
                    i = 1536;
                } else if (i7 == 6) {
                    i = C1849jf.m11635a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i7);
                    throw new IllegalStateException(sb.toString());
                }
                this.f7422H = i;
            }
            if (this.f7456q != null) {
                if (!m9755w()) {
                    return false;
                }
                this.f7447h.add(new C1665eg(this.f7456q, Math.max(0, j2), m9749q(m9750r()), (C1627dg) null));
                this.f7456q = null;
                m9752t();
            }
            if (this.f7423I == 0) {
                this.f7424J = Math.max(0, j2);
                this.f7423I = 1;
            } else {
                long q = this.f7424J + m9749q(this.f7453n ? this.f7418D : this.f7417C / ((long) this.f7416B));
                if (this.f7423I == 1 && Math.abs(q - j2) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(q);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.f7423I = 2;
                }
                if (this.f7423I == 2) {
                    this.f7424J += j2 - q;
                    this.f7423I = 1;
                    ((C1850jg) this.f7443d).f9130a.f9529W = true;
                }
            }
            if (this.f7453n) {
                this.f7418D += (long) this.f7422H;
            } else {
                this.f7417C += (long) byteBuffer.remaining();
            }
            this.f7430P = byteBuffer2;
        }
        if (this.f7453n) {
            m9758z(this.f7430P, j2);
        } else {
            m9751s(j2);
        }
        if (this.f7430P.hasRemaining()) {
            return false;
        }
        this.f7430P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean mo7631n() {
        if (m9756x()) {
            if (m9750r() > this.f7446g.mo11996a()) {
                return true;
            }
            if (m9757y() && this.f7448i.getPlayState() == 2 && this.f7448i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo7632o() {
        return !m9756x() || (this.f7435U && !mo7631n());
    }
}
