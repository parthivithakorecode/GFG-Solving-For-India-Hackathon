package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C3357i;
import p016b5.C1317a2;
import p016b5.C1398s0;
import p079k4.C3315d;
import p100n4.C3778g;

/* renamed from: kotlinx.coroutines.internal.x */
final class C3419x extends C1317a2 implements C1398s0 {

    /* renamed from: g */
    private final Throwable f20924g;

    /* renamed from: h */
    private final String f20925h;

    public C3419x(Throwable th, String str) {
        this.f20924g = th;
        this.f20925h = str;
    }

    /* renamed from: U */
    private final Void m24700U() {
        String j;
        if (this.f20924g != null) {
            String str = this.f20925h;
            String str2 = "";
            if (!(str == null || (j = C3357i.m24513j(". ", str)) == null)) {
                str2 = j;
            }
            throw new IllegalStateException(C3357i.m24513j("Module with the Main dispatcher had failed to initialize", str2), this.f20924g);
        }
        C3418w.m24698d();
        throw new C3315d();
    }

    /* renamed from: P */
    public boolean mo4694P(C3778g gVar) {
        m24700U();
        throw new C3315d();
    }

    /* renamed from: R */
    public C1317a2 mo4656R() {
        return this;
    }

    /* renamed from: T */
    public Void mo4673O(C3778g gVar, Runnable runnable) {
        m24700U();
        throw new C3315d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f20924g;
        sb.append(th != null ? C3357i.m24513j(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
