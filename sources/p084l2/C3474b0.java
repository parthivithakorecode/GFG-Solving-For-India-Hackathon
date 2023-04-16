package p084l2;

import android.app.Application;
import java.io.IOException;
import p033e1.C2538a;
import p160x1.C4285g;
import p160x1.C4286h;

/* renamed from: l2.b0 */
final class C3474b0 {

    /* renamed from: a */
    private final Application f21032a;

    public C3474b0(Application application) {
        this.f21032a = application;
    }

    /* renamed from: a */
    public final C3469a mo14564a() {
        try {
            C2538a.C2539a b = C2538a.m21156b(this.f21032a);
            return new C3469a(b.mo12454a(), b.mo12455b());
        } catch (IOException | C4285g | C4286h e) {
            C3484d1.m24870a("Failed to get ad id.", e);
            return null;
        }
    }
}
