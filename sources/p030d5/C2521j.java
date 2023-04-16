package p030d5;

import kotlinx.coroutines.internal.C3377e0;
import kotlinx.coroutines.internal.C3408r;
import p016b5.C1376m;
import p016b5.C1387p0;

/* renamed from: d5.j */
public final class C2521j<E> extends C2530s implements C2528q<E> {

    /* renamed from: i */
    public final Throwable f18637i;

    /* renamed from: A */
    public C3377e0 mo12431A(C3408r.C3410b bVar) {
        return C1376m.f3573a;
    }

    /* renamed from: C */
    public C2521j<E> mo12445c() {
        return this;
    }

    /* renamed from: D */
    public C2521j<E> mo12433z() {
        return this;
    }

    /* renamed from: E */
    public final Throwable mo12443E() {
        Throwable th = this.f18637i;
        return th == null ? new C2522k("Channel was closed") : th;
    }

    /* renamed from: F */
    public final Throwable mo12444F() {
        Throwable th = this.f18637i;
        return th == null ? new C2523l("Channel was closed") : th;
    }

    /* renamed from: a */
    public void mo12417a(E e) {
    }

    /* renamed from: f */
    public C3377e0 mo12418f(E e, C3408r.C3410b bVar) {
        return C1376m.f3573a;
    }

    public String toString() {
        return "Closed@" + C1387p0.m5432b(this) + '[' + this.f18637i + ']';
    }

    /* renamed from: y */
    public void mo12432y() {
    }
}
