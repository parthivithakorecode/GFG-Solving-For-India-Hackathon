package p023c5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p016b5.C1405u1;
import p016b5.C1419y0;
import p100n4.C3778g;

/* renamed from: c5.a */
public final class C1444a extends C1445b {
    private volatile C1444a _immediate;

    /* renamed from: g */
    private final Handler f3661g;

    /* renamed from: h */
    private final String f3662h;

    /* renamed from: i */
    private final boolean f3663i;

    /* renamed from: j */
    private final C1444a f3664j;

    public C1444a(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1444a(Handler handler, String str, int i, C3353e eVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C1444a(Handler handler, String str, boolean z) {
        super((C3353e) null);
        C1444a aVar = null;
        this.f3661g = handler;
        this.f3662h = str;
        this.f3663i = z;
        this._immediate = z ? this : aVar;
        C1444a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C1444a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f3664j = aVar2;
    }

    /* renamed from: T */
    private final void m5637T(C3778g gVar, Runnable runnable) {
        C1405u1.m5475c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1419y0.m5578b().mo4673O(gVar, runnable);
    }

    /* renamed from: O */
    public void mo4673O(C3778g gVar, Runnable runnable) {
        if (!this.f3661g.post(runnable)) {
            m5637T(gVar, runnable);
        }
    }

    /* renamed from: P */
    public boolean mo4694P(C3778g gVar) {
        return !this.f3663i || !C3357i.m24504a(Looper.myLooper(), this.f3661g.getLooper());
    }

    /* renamed from: U */
    public C1444a mo4656R() {
        return this.f3664j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1444a) && ((C1444a) obj).f3661g == this.f3661g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f3661g);
    }

    public String toString() {
        String S = mo4657S();
        if (S != null) {
            return S;
        }
        String str = this.f3662h;
        if (str == null) {
            str = this.f3661g.toString();
        }
        return this.f3663i ? C3357i.m24513j(str, ".immediate") : str;
    }
}
