package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

public final class qm1 extends C1572bz {

    /* renamed from: f */
    private final Object f13234f = new Object();
    @Nullable

    /* renamed from: g */
    private final C1609cz f13235g;
    @Nullable

    /* renamed from: h */
    private final sd0 f13236h;

    public qm1(@Nullable C1609cz czVar, @Nullable sd0 sd0) {
        this.f13235g = czVar;
        this.f13236h = sd0;
    }

    /* renamed from: U2 */
    public final void mo5965U2(boolean z) {
        throw new RemoteException();
    }

    /* renamed from: Y4 */
    public final void mo5570Y4(@Nullable C1758gz gzVar) {
        synchronized (this.f13234f) {
            C1609cz czVar = this.f13235g;
            if (czVar != null) {
                czVar.mo5570Y4(gzVar);
            }
        }
    }

    /* renamed from: b */
    public final float mo5571b() {
        throw new RemoteException();
    }

    /* renamed from: d */
    public final float mo5572d() {
        sd0 sd0 = this.f13236h;
        if (sd0 != null) {
            return sd0.mo9211e();
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final float mo5573e() {
        sd0 sd0 = this.f13236h;
        if (sd0 != null) {
            return sd0.mo9212f();
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final int mo5966f() {
        throw new RemoteException();
    }

    /* renamed from: h */
    public final C1758gz mo5574h() {
        synchronized (this.f13234f) {
            C1609cz czVar = this.f13235g;
            if (czVar == null) {
                return null;
            }
            C1758gz h = czVar.mo5574h();
            return h;
        }
    }

    /* renamed from: j */
    public final void mo5967j() {
        throw new RemoteException();
    }

    /* renamed from: k */
    public final void mo5968k() {
        throw new RemoteException();
    }

    /* renamed from: l */
    public final boolean mo5969l() {
        throw new RemoteException();
    }

    /* renamed from: m */
    public final void mo5970m() {
        throw new RemoteException();
    }

    /* renamed from: n */
    public final boolean mo5971n() {
        throw new RemoteException();
    }

    /* renamed from: r */
    public final boolean mo5972r() {
        throw new RemoteException();
    }
}
