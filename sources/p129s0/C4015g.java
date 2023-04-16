package p129s0;

import android.content.Context;
import p153w0.C4260a;

/* renamed from: s0.g */
public class C4015g {

    /* renamed from: e */
    private static C4015g f22191e;

    /* renamed from: a */
    private C4005a f22192a;

    /* renamed from: b */
    private C4006b f22193b;

    /* renamed from: c */
    private C4011e f22194c;

    /* renamed from: d */
    private C4014f f22195d;

    private C4015g(Context context, C4260a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f22192a = new C4005a(applicationContext, aVar);
        this.f22193b = new C4006b(applicationContext, aVar);
        this.f22194c = new C4011e(applicationContext, aVar);
        this.f22195d = new C4014f(applicationContext, aVar);
    }

    /* renamed from: c */
    public static synchronized C4015g m26289c(Context context, C4260a aVar) {
        C4015g gVar;
        synchronized (C4015g.class) {
            if (f22191e == null) {
                f22191e = new C4015g(context, aVar);
            }
            gVar = f22191e;
        }
        return gVar;
    }

    /* renamed from: a */
    public C4005a mo15498a() {
        return this.f22192a;
    }

    /* renamed from: b */
    public C4006b mo15499b() {
        return this.f22193b;
    }

    /* renamed from: d */
    public C4011e mo15500d() {
        return this.f22194c;
    }

    /* renamed from: e */
    public C4014f mo15501e() {
        return this.f22195d;
    }
}
