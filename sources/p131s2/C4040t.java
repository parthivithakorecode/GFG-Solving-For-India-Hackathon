package p131s2;

import p003a2.C0092o;

/* renamed from: s2.t */
final class C4040t implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4028h f22227f;

    /* renamed from: g */
    final /* synthetic */ C4041u f22228g;

    C4040t(C4041u uVar, C4028h hVar) {
        this.f22228g = uVar;
        this.f22227f = hVar;
    }

    public final void run() {
        synchronized (this.f22228g.f22230b) {
            if (this.f22228g.f22231c != null) {
                this.f22228g.f22231c.mo7781d((Exception) C0092o.m313i(this.f22227f.mo15511i()));
            }
        }
    }
}
