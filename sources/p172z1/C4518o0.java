package p172z1;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p003a2.C0060d;
import p003a2.C0074h0;
import p003a2.C0092o;
import p119q2.C3943a;
import p119q2.C3947e;
import p119q2.C3948f;
import p125r2.C3980d;
import p125r2.C3988l;
import p160x1.C4280b;
import p166y1.C4365a;
import p166y1.C4382f;

/* renamed from: z1.o0 */
public final class C4518o0 extends C3980d implements C4382f.C4383a, C4382f.C4384b {

    /* renamed from: m */
    private static final C4365a.C4366a<? extends C3948f, C3943a> f23022m = C3947e.f22091c;

    /* renamed from: f */
    private final Context f23023f;

    /* renamed from: g */
    private final Handler f23024g;

    /* renamed from: h */
    private final C4365a.C4366a<? extends C3948f, C3943a> f23025h;

    /* renamed from: i */
    private final Set<Scope> f23026i;

    /* renamed from: j */
    private final C0060d f23027j;

    /* renamed from: k */
    private C3948f f23028k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4516n0 f23029l;

    public C4518o0(Context context, Handler handler, C0060d dVar) {
        C4365a.C4366a<? extends C3948f, C3943a> aVar = f23022m;
        this.f23023f = context;
        this.f23024g = handler;
        this.f23027j = (C0060d) C0092o.m314j(dVar, "ClientSettings must not be null");
        this.f23026i = dVar.mo204e();
        this.f23025h = aVar;
    }

    /* renamed from: u5 */
    static /* synthetic */ void m27385u5(C4518o0 o0Var, C3988l lVar) {
        C4280b c = lVar.mo15452c();
        if (c.mo15846g()) {
            C0074h0 h0Var = (C0074h0) C0092o.m313i(lVar.mo15453d());
            c = h0Var.mo241d();
            if (!c.mo15846g()) {
                String valueOf = String.valueOf(c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                o0Var.f23029l.mo16143a(h0Var.mo240c(), o0Var.f23026i);
                o0Var.f23028k.mo15997o();
            }
        }
        o0Var.f23029l.mo16144c(c);
        o0Var.f23028k.mo15997o();
    }

    /* renamed from: C0 */
    public final void mo16145C0(Bundle bundle) {
        this.f23028k.mo15412g(this);
    }

    /* renamed from: D */
    public final void mo16146D(int i) {
        this.f23028k.mo15997o();
    }

    /* renamed from: M3 */
    public final void mo16180M3() {
        C3948f fVar = this.f23028k;
        if (fVar != null) {
            fVar.mo15997o();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [q2.f, y1.a$f] */
    /* renamed from: b3 */
    public final void mo16181b3(C4516n0 n0Var) {
        C3948f fVar = this.f23028k;
        if (fVar != null) {
            fVar.mo15997o();
        }
        this.f23027j.mo208i(Integer.valueOf(System.identityHashCode(this)));
        C4365a.C4366a aVar = this.f23025h;
        Context context = this.f23023f;
        Looper looper = this.f23024g.getLooper();
        C0060d dVar = this.f23027j;
        this.f23028k = aVar.mo15408a(context, looper, dVar, dVar.mo206g(), this, this);
        this.f23029l = n0Var;
        Set<Scope> set = this.f23026i;
        if (set == null || set.isEmpty()) {
            this.f23024g.post(new C4511l0(this));
        } else {
            this.f23028k.mo15411f();
        }
    }

    /* renamed from: n0 */
    public final void mo16168n0(C4280b bVar) {
        this.f23029l.mo16144c(bVar);
    }

    /* renamed from: n4 */
    public final void mo15444n4(C3988l lVar) {
        this.f23024g.post(new C4513m0(this, lVar));
    }
}
