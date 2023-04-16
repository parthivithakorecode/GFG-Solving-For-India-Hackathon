package p025d0;

import androidx.room.C1173h;
import p053h0.C2674f;

/* renamed from: d0.a */
public abstract class C2465a<T> extends C2468d {
    public C2465a(C1173h hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo12291g(C2674f fVar, T t);

    /* renamed from: h */
    public final void mo12292h(T t) {
        C2674f a = mo12303a();
        try {
            mo12291g(a, t);
            a.mo12664L();
        } finally {
            mo12306f(a);
        }
    }
}
