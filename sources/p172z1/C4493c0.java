package p172z1;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p003a2.C0052c;
import p003a2.C0076i;
import p160x1.C4280b;
import p166y1.C4365a;

/* renamed from: z1.c0 */
final class C4493c0 implements C0052c.C0055c, C4516n0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4365a.C4374f f22954a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4489b<?> f22955b;

    /* renamed from: c */
    private C0076i f22956c = null;

    /* renamed from: d */
    private Set<Scope> f22957d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f22958e = false;

    /* renamed from: f */
    final /* synthetic */ C4496e f22959f;

    public C4493c0(C4496e eVar, C4365a.C4374f fVar, C4489b<?> bVar) {
        this.f22959f = eVar;
        this.f22954a = fVar;
        this.f22955b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m27308h() {
        C0076i iVar;
        if (this.f22958e && (iVar = this.f22956c) != null) {
            this.f22954a.mo15996n(iVar, this.f22957d);
        }
    }

    /* renamed from: a */
    public final void mo16143a(C0076i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo16144c(new C4280b(4));
            return;
        }
        this.f22956c = iVar;
        this.f22957d = set;
        m27308h();
    }

    /* renamed from: b */
    public final void mo197b(C4280b bVar) {
        this.f22959f.f22980u.post(new C4490b0(this, bVar));
    }

    /* renamed from: c */
    public final void mo16144c(C4280b bVar) {
        C4538z zVar = (C4538z) this.f22959f.f22976q.get(this.f22955b);
        if (zVar != null) {
            zVar.mo16205o(bVar);
        }
    }
}
