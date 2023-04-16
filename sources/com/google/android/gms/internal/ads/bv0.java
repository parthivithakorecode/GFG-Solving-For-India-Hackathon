package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2548e;

public final class bv0 extends C1572bz {

    /* renamed from: f */
    private final tq0 f5045f;

    /* renamed from: g */
    private final Object f5046g = new Object();

    /* renamed from: h */
    private final boolean f5047h;

    /* renamed from: i */
    private final boolean f5048i;
    @GuardedBy("lock")

    /* renamed from: j */
    private int f5049j;
    @GuardedBy("lock")

    /* renamed from: k */
    private C1758gz f5050k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f5051l;
    @GuardedBy("lock")

    /* renamed from: m */
    private boolean f5052m = true;
    @GuardedBy("lock")

    /* renamed from: n */
    private float f5053n;
    @GuardedBy("lock")

    /* renamed from: o */
    private float f5054o;
    @GuardedBy("lock")

    /* renamed from: p */
    private float f5055p;
    @GuardedBy("lock")

    /* renamed from: q */
    private boolean f5056q;
    @GuardedBy("lock")

    /* renamed from: r */
    private boolean f5057r;
    @GuardedBy("lock")

    /* renamed from: s */
    private s50 f5058s;

    public bv0(tq0 tq0, float f, boolean z, boolean z2) {
        this.f5045f = tq0;
        this.f5053n = f;
        this.f5047h = z;
        this.f5048i = z2;
    }

    /* renamed from: G5 */
    private final void m7060G5(int i, int i2, boolean z, boolean z2) {
        wo0.f16890e.execute(new zu0(this, i, i2, z, z2));
    }

    /* renamed from: H5 */
    private final void m7061H5(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        wo0.f16890e.execute(new av0(this, hashMap));
    }

    /* renamed from: A5 */
    public final void mo5959A5(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f5046g) {
            z2 = true;
            if (f2 == this.f5053n) {
                if (f3 == this.f5055p) {
                    z2 = false;
                }
            }
            this.f5053n = f2;
            this.f5054o = f;
            z3 = this.f5052m;
            this.f5052m = z;
            i2 = this.f5049j;
            this.f5049j = i;
            float f4 = this.f5055p;
            this.f5055p = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f5045f.mo7105Y().invalidate();
            }
        }
        if (z2) {
            try {
                s50 s50 = this.f5058s;
                if (s50 != null) {
                    s50.mo10732b();
                }
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
        m7060G5(i2, i, z3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B5 */
    public final /* synthetic */ void mo5960B5(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        C1758gz gzVar;
        C1758gz gzVar2;
        C1758gz gzVar3;
        synchronized (this.f5046g) {
            boolean z5 = this.f5051l;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            this.f5051l = z6;
            if (z3) {
                try {
                    C1758gz gzVar4 = this.f5050k;
                    if (gzVar4 != null) {
                        gzVar4.mo7194h();
                    }
                } catch (RemoteException e) {
                    io0.m11133i("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (gzVar3 = this.f5050k) != null) {
                gzVar3.mo7193f();
            }
            if (z7 && (gzVar2 = this.f5050k) != null) {
                gzVar2.mo7192e();
            }
            if (z8) {
                C1758gz gzVar5 = this.f5050k;
                if (gzVar5 != null) {
                    gzVar5.mo7191b();
                }
                this.f5045f.mo11057B();
            }
            if (!(z == z2 || (gzVar = this.f5050k) == null)) {
                gzVar.mo7195w3(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C5 */
    public final /* synthetic */ void mo5961C5(Map map) {
        this.f5045f.mo6424t("pubVideoCmd", map);
    }

    /* renamed from: D5 */
    public final void mo5962D5(s00 s00) {
        boolean z = s00.f14191f;
        boolean z2 = s00.f14192g;
        boolean z3 = s00.f14193h;
        synchronized (this.f5046g) {
            this.f5056q = z2;
            this.f5057r = z3;
        }
        m7061H5("initialState", C2548e.m21180a("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* renamed from: E5 */
    public final void mo5963E5(float f) {
        synchronized (this.f5046g) {
            this.f5054o = f;
        }
    }

    /* renamed from: F5 */
    public final void mo5964F5(s50 s50) {
        synchronized (this.f5046g) {
            this.f5058s = s50;
        }
    }

    /* renamed from: U2 */
    public final void mo5965U2(boolean z) {
        m7061H5(true != z ? "unmute" : "mute", (Map<String, String>) null);
    }

    /* renamed from: Y4 */
    public final void mo5570Y4(C1758gz gzVar) {
        synchronized (this.f5046g) {
            this.f5050k = gzVar;
        }
    }

    /* renamed from: b */
    public final float mo5571b() {
        float f;
        synchronized (this.f5046g) {
            f = this.f5055p;
        }
        return f;
    }

    /* renamed from: d */
    public final float mo5572d() {
        float f;
        synchronized (this.f5046g) {
            f = this.f5054o;
        }
        return f;
    }

    /* renamed from: e */
    public final float mo5573e() {
        float f;
        synchronized (this.f5046g) {
            f = this.f5053n;
        }
        return f;
    }

    /* renamed from: f */
    public final int mo5966f() {
        int i;
        synchronized (this.f5046g) {
            i = this.f5049j;
        }
        return i;
    }

    /* renamed from: h */
    public final C1758gz mo5574h() {
        C1758gz gzVar;
        synchronized (this.f5046g) {
            gzVar = this.f5050k;
        }
        return gzVar;
    }

    /* renamed from: j */
    public final void mo5967j() {
        m7061H5("pause", (Map<String, String>) null);
    }

    /* renamed from: k */
    public final void mo5968k() {
        m7061H5("play", (Map<String, String>) null);
    }

    /* renamed from: l */
    public final boolean mo5969l() {
        boolean z;
        synchronized (this.f5046g) {
            z = false;
            if (this.f5047h && this.f5056q) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public final void mo5970m() {
        m7061H5("stop", (Map<String, String>) null);
    }

    /* renamed from: n */
    public final boolean mo5971n() {
        boolean z;
        boolean l = mo5969l();
        synchronized (this.f5046g) {
            z = false;
            if (!l) {
                try {
                    if (this.f5057r && this.f5048i) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    /* renamed from: r */
    public final boolean mo5972r() {
        boolean z;
        synchronized (this.f5046g) {
            z = this.f5052m;
        }
        return z;
    }

    /* renamed from: y */
    public final void mo5973y() {
        boolean z;
        int i;
        synchronized (this.f5046g) {
            z = this.f5052m;
            i = this.f5049j;
            this.f5049j = 3;
        }
        m7060G5(i, 3, z, z);
    }
}
