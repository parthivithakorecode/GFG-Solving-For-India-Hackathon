package p016b5;

import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3358j;
import kotlinx.coroutines.internal.C3382h;
import kotlinx.coroutines.internal.C3403n;
import kotlinx.coroutines.internal.C3405o;
import p100n4.C3769a;
import p100n4.C3770b;
import p100n4.C3773d;
import p100n4.C3774e;
import p100n4.C3778g;
import p145u4.C4150l;

/* renamed from: b5.d0 */
public abstract class C1332d0 extends C3769a implements C3774e {

    /* renamed from: f */
    public static final C1333a f3545f = new C1333a((C3353e) null);

    /* renamed from: b5.d0$a */
    public static final class C1333a extends C3770b<C3774e, C1332d0> {

        /* renamed from: b5.d0$a$a */
        static final class C1334a extends C3358j implements C4150l<C3778g.C3781b, C1332d0> {

            /* renamed from: f */
            public static final C1334a f3546f = new C1334a();

            C1334a() {
                super(1);
            }

            /* renamed from: a */
            public final C1332d0 invoke(C3778g.C3781b bVar) {
                if (bVar instanceof C1332d0) {
                    return (C1332d0) bVar;
                }
                return null;
            }
        }

        private C1333a() {
            super(C3774e.f21689e, C1334a.f3546f);
        }

        public /* synthetic */ C1333a(C3353e eVar) {
            this();
        }
    }

    public C1332d0() {
        super(C3774e.f21689e);
    }

    /* renamed from: F */
    public final <T> C3773d<T> mo4693F(C3773d<? super T> dVar) {
        return new C3382h(this, dVar);
    }

    /* renamed from: O */
    public abstract void mo4673O(C3778g gVar, Runnable runnable);

    /* renamed from: P */
    public boolean mo4694P(C3778g gVar) {
        return true;
    }

    /* renamed from: Q */
    public C1332d0 mo4695Q(int i) {
        C3405o.m24653a(i);
        return new C3403n(this, i);
    }

    public <E extends C3778g.C3781b> E get(C3778g.C3783c<E> cVar) {
        return C3774e.C3775a.m25603a(this, cVar);
    }

    public C3778g minusKey(C3778g.C3783c<?> cVar) {
        return C3774e.C3775a.m25604b(this, cVar);
    }

    public String toString() {
        return C1387p0.m5431a(this) + '@' + C1387p0.m5432b(this);
    }

    /* renamed from: z */
    public final void mo4698z(C3773d<?> dVar) {
        ((C3382h) dVar).mo14416r();
    }
}
