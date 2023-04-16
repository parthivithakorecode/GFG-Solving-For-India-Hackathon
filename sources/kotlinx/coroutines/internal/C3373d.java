package kotlinx.coroutines.internal;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p145u4.C4150l;

@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.internal.d */
final class C3373d extends C3380g {

    /* renamed from: a */
    public static final C3373d f20859a = new C3373d();

    /* renamed from: b */
    private static final C3374a f20860b = new C3374a();

    /* renamed from: kotlinx.coroutines.internal.d$a */
    public static final class C3374a extends ClassValue<C4150l<? super Throwable, ? extends Throwable>> {
        C3374a() {
        }
    }

    private C3373d() {
    }

    /* renamed from: a */
    public C4150l<Throwable, Throwable> mo14409a(Class<? extends Throwable> cls) {
        return (C4150l) f20860b.get(cls);
    }
}
