package p016b5;

import java.io.Closeable;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3358j;
import p100n4.C3770b;
import p100n4.C3778g;
import p145u4.C4150l;

/* renamed from: b5.h1 */
public abstract class C1352h1 extends C1332d0 implements Closeable {

    /* renamed from: g */
    public static final C1353a f3553g = new C1353a((C3353e) null);

    /* renamed from: b5.h1$a */
    public static final class C1353a extends C3770b<C1332d0, C1352h1> {

        /* renamed from: b5.h1$a$a */
        static final class C1354a extends C3358j implements C4150l<C3778g.C3781b, C1352h1> {

            /* renamed from: f */
            public static final C1354a f3554f = new C1354a();

            C1354a() {
                super(1);
            }

            /* renamed from: a */
            public final C1352h1 invoke(C3778g.C3781b bVar) {
                if (bVar instanceof C1352h1) {
                    return (C1352h1) bVar;
                }
                return null;
            }
        }

        private C1353a() {
            super(C1332d0.f3545f, C1354a.f3554f);
        }

        public /* synthetic */ C1353a(C3353e eVar) {
            this();
        }
    }
}
