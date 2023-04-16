package p056h3;

/* renamed from: h3.n */
public final /* synthetic */ class C2722n {

    /* renamed from: h3.n$a */
    class C2723a implements C2718j {

        /* renamed from: a */
        final /* synthetic */ C2716i f19265a;

        /* renamed from: b */
        final /* synthetic */ C2724o f19266b;

        C2723a(C2724o oVar, C2716i iVar) {
            this.f19266b = oVar;
            this.f19265a = iVar;
        }

        /* renamed from: a */
        public int mo12741a() {
            return this.f19265a.f19243c;
        }

        /* renamed from: b */
        public boolean mo12742b() {
            return this.f19265a.mo12727D();
        }
    }

    /* renamed from: a */
    public static void m21735a(C2724o oVar, C2716i iVar, Runnable runnable) {
        oVar.mo12752a(new C2719k(iVar == null ? null : new C2723a(oVar, iVar), runnable));
    }

    /* renamed from: b */
    public static C2724o m21736b(String str, int i, int i2) {
        return i == 1 ? new C2728s(str, i2) : new C2726q(str, i, i2);
    }
}
