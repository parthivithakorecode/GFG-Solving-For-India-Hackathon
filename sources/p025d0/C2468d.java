package p025d0;

import androidx.room.C1173h;
import java.util.concurrent.atomic.AtomicBoolean;
import p053h0.C2674f;

/* renamed from: d0.d */
public abstract class C2468d {

    /* renamed from: a */
    private final AtomicBoolean f18518a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C1173h f18519b;

    /* renamed from: c */
    private volatile C2674f f18520c;

    public C2468d(C1173h hVar) {
        this.f18519b = hVar;
    }

    /* renamed from: c */
    private C2674f m20916c() {
        return this.f18519b.mo3952d(mo12305d());
    }

    /* renamed from: e */
    private C2674f m20917e(boolean z) {
        if (!z) {
            return m20916c();
        }
        if (this.f18520c == null) {
            this.f18520c = m20916c();
        }
        return this.f18520c;
    }

    /* renamed from: a */
    public C2674f mo12303a() {
        mo12304b();
        return m20917e(this.f18518a.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12304b() {
        this.f18519b.mo3949a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo12305d();

    /* renamed from: f */
    public void mo12306f(C2674f fVar) {
        if (fVar == this.f18520c) {
            this.f18518a.set(false);
        }
    }
}
