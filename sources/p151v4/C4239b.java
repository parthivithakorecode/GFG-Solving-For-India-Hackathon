package p151v4;

import java.util.Random;
import kotlin.jvm.internal.C3357i;

/* renamed from: v4.b */
public final class C4239b extends C4238a {

    /* renamed from: h */
    private final C4240a f22515h = new C4240a();

    /* renamed from: v4.b$a */
    public static final class C4240a extends ThreadLocal<Random> {
        C4240a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo15785c() {
        Object obj = this.f22515h.get();
        C3357i.m24507d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
