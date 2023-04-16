package p084l2;

import android.app.Activity;
import android.app.Application;
import p137t2.C4061a;
import p137t2.C4068d;

/* renamed from: l2.h2 */
final class C3501h2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Application f21085a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3474b0 f21086b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3518m f21087c;

    C3501h2(Application application, C3474b0 b0Var, C3518m mVar) {
        this.f21085a = application;
        this.f21086b = b0Var;
        this.f21087c = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3532p0 mo14589b(Activity activity, C4068d dVar) {
        C4061a a = dVar.mo15571a();
        if (a == null) {
            a = new C4061a.C4062a(this.f21085a).mo15569b();
        }
        return new C3493f2(this, activity, a, dVar).m24879a();
    }
}
