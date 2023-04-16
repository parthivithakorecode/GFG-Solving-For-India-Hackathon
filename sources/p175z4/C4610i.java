package p175z4;

import java.util.Iterator;
import kotlin.jvm.internal.C3357i;
import p145u4.C4150l;

/* renamed from: z4.i */
public final class C4610i<T, R> implements C4601b<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4601b<T> f23257a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4150l<T, R> f23258b;

    /* renamed from: z4.i$a */
    public static final class C4611a implements Iterator<R> {

        /* renamed from: f */
        private final Iterator<T> f23259f;

        /* renamed from: g */
        final /* synthetic */ C4610i<T, R> f23260g;

        C4611a(C4610i<T, R> iVar) {
            this.f23260g = iVar;
            this.f23259f = iVar.f23257a.iterator();
        }

        public boolean hasNext() {
            return this.f23259f.hasNext();
        }

        public R next() {
            return this.f23260g.f23258b.invoke(this.f23259f.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4610i(C4601b<? extends T> bVar, C4150l<? super T, ? extends R> lVar) {
        C3357i.m24508e(bVar, "sequence");
        C3357i.m24508e(lVar, "transformer");
        this.f23257a = bVar;
        this.f23258b = lVar;
    }

    public Iterator<R> iterator() {
        return new C4611a(this);
    }
}
