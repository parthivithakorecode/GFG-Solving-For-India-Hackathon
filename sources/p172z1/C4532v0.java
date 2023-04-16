package p172z1;

import java.util.Map;
import java.util.Set;
import p102o.C3801a;
import p131s2.C4029i;
import p160x1.C4280b;
import p166y1.C4377c;

/* renamed from: z1.v0 */
public final class C4532v0 {

    /* renamed from: a */
    private final C3801a<C4489b<?>, C4280b> f23045a;

    /* renamed from: b */
    private final C3801a<C4489b<?>, String> f23046b;

    /* renamed from: c */
    private final C4029i<Map<C4489b<?>, String>> f23047c;

    /* renamed from: d */
    private int f23048d;

    /* renamed from: e */
    private boolean f23049e;

    /* renamed from: a */
    public final Set<C4489b<?>> mo16195a() {
        return this.f23045a.keySet();
    }

    /* renamed from: b */
    public final void mo16196b(C4489b<?> bVar, C4280b bVar2, String str) {
        this.f23045a.put(bVar, bVar2);
        this.f23046b.put(bVar, str);
        this.f23048d--;
        if (!bVar2.mo15846g()) {
            this.f23049e = true;
        }
        if (this.f23048d != 0) {
            return;
        }
        if (this.f23049e) {
            this.f23047c.mo15525b(new C4377c(this.f23045a));
            return;
        }
        this.f23047c.mo15526c(this.f23046b);
    }
}
