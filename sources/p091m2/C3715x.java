package p091m2;

/* renamed from: m2.x */
abstract class C3715x implements Runnable {

    /* renamed from: f */
    final long f21522f;

    /* renamed from: g */
    final long f21523g;

    /* renamed from: h */
    final boolean f21524h;

    /* renamed from: i */
    final /* synthetic */ C3686g0 f21525i;

    C3715x(C3686g0 g0Var, boolean z) {
        this.f21525i = g0Var;
        this.f21522f = g0Var.f21455b.mo12462a();
        this.f21523g = g0Var.f21455b.mo12463b();
        this.f21524h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo14839a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14842b() {
    }

    public final void run() {
        if (this.f21525i.f21460g) {
            mo14842b();
            return;
        }
        try {
            mo14839a();
        } catch (Exception e) {
            this.f21525i.m25293p(e, false, this.f21524h);
            mo14842b();
        }
    }
}
