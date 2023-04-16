package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class ru1 implements td1, lc1, ya1, qb1, C2420yu, hg1 {

    /* renamed from: f */
    private final C1527ar f13937f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f13938g = false;

    public ru1(C1527ar arVar, @Nullable kp2 kp2) {
        this.f13937f = arVar;
        arVar.mo5403c(2);
        if (kp2 != null) {
            arVar.mo5403c(1101);
        }
    }

    /* renamed from: B */
    public final void mo7333B(C2268ur urVar) {
        this.f13937f.mo5402b(new pu1(urVar));
        this.f13937f.mo5403c(1104);
    }

    /* renamed from: L */
    public final synchronized void mo25L() {
        if (!this.f13938g) {
            this.f13937f.mo5403c(7);
            this.f13938g = true;
            return;
        }
        this.f13937f.mo5403c(8);
    }

    /* renamed from: a */
    public final void mo7334a() {
        this.f13937f.mo5403c(1109);
    }

    /* renamed from: b0 */
    public final void mo7335b0(boolean z) {
        this.f13937f.mo5403c(true != z ? 1106 : 1105);
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        C1527ar arVar;
        int i;
        switch (cvVar.f5529f) {
            case 1:
                arVar = this.f13937f;
                i = 101;
                break;
            case 2:
                arVar = this.f13937f;
                i = 102;
                break;
            case 3:
                arVar = this.f13937f;
                i = 5;
                break;
            case 4:
                arVar = this.f13937f;
                i = 103;
                break;
            case 5:
                arVar = this.f13937f;
                i = 104;
                break;
            case 6:
                arVar = this.f13937f;
                i = 105;
                break;
            case 7:
                arVar = this.f13937f;
                i = 106;
                break;
            default:
                arVar = this.f13937f;
                i = 4;
                break;
        }
        arVar.mo5403c(i);
    }

    /* renamed from: f0 */
    public final void mo7336f0(boolean z) {
        this.f13937f.mo5403c(true != z ? 1108 : 1107);
    }

    /* renamed from: k */
    public final synchronized void mo5153k() {
        this.f13937f.mo5403c(6);
    }

    /* renamed from: m */
    public final void mo8445m() {
        this.f13937f.mo5403c(3);
    }

    /* renamed from: n0 */
    public final void mo6025n0(vi0 vi0) {
    }

    /* renamed from: q */
    public final void mo6026q(ds2 ds2) {
        this.f13937f.mo5402b(new qu1(ds2));
    }

    /* renamed from: x0 */
    public final void mo7337x0(C2268ur urVar) {
        this.f13937f.mo5402b(new nu1(urVar));
        this.f13937f.mo5403c(1103);
    }

    /* renamed from: y */
    public final void mo7338y(C2268ur urVar) {
        this.f13937f.mo5402b(new ou1(urVar));
        this.f13937f.mo5403c(1102);
    }
}
