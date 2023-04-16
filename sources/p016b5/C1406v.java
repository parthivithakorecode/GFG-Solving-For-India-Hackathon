package p016b5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C3353e;

/* renamed from: b5.v */
public class C1406v {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3607b = AtomicIntegerFieldUpdater.newUpdater(C1406v.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f3608a;

    public C1406v(Throwable th, boolean z) {
        this.f3608a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1406v(Throwable th, boolean z, int i, C3353e eVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo4785a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo4786b() {
        return f3607b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C1387p0.m5431a(this) + '[' + this.f3608a + ']';
    }
}
