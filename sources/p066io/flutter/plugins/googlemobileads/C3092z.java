package p066io.flutter.plugins.googlemobileads;

import p104o1.C3825d;

/* renamed from: io.flutter.plugins.googlemobileads.z */
class C3092z {

    /* renamed from: a */
    final Integer f20214a;

    /* renamed from: b */
    final Integer f20215b;

    /* renamed from: c */
    final C3050f0 f20216c;

    /* renamed from: d */
    final Boolean f20217d;

    /* renamed from: e */
    final Boolean f20218e;

    /* renamed from: f */
    final Boolean f20219f;

    C3092z(Integer num, Integer num2, C3050f0 f0Var, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f20214a = num;
        this.f20215b = num2;
        this.f20216c = f0Var;
        this.f20217d = bool;
        this.f20218e = bool2;
        this.f20219f = bool3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3825d mo13913a() {
        C3825d.C3826a aVar = new C3825d.C3826a();
        Integer num = this.f20214a;
        if (num != null) {
            aVar.mo15213b(num.intValue());
        }
        Integer num2 = this.f20215b;
        if (num2 != null) {
            aVar.mo15214c(num2.intValue());
        }
        C3050f0 f0Var = this.f20216c;
        if (f0Var != null) {
            aVar.mo15218g(f0Var.mo13815a());
        }
        Boolean bool = this.f20217d;
        if (bool != null) {
            aVar.mo15215d(bool.booleanValue());
        }
        Boolean bool2 = this.f20218e;
        if (bool2 != null) {
            aVar.mo15216e(bool2.booleanValue());
        }
        Boolean bool3 = this.f20219f;
        if (bool3 != null) {
            aVar.mo15217f(bool3.booleanValue());
        }
        return aVar.mo15212a();
    }
}
