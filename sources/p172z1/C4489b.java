package p172z1;

import androidx.annotation.RecentlyNonNull;
import p003a2.C0089n;
import p166y1.C4365a;
import p166y1.C4365a.C4369d;

/* renamed from: z1.b */
public final class C4489b<O extends C4365a.C4369d> {

    /* renamed from: a */
    private final int f22943a;

    /* renamed from: b */
    private final C4365a<O> f22944b;

    /* renamed from: c */
    private final O f22945c;

    /* renamed from: d */
    private final String f22946d;

    private C4489b(C4365a<O> aVar, O o, String str) {
        this.f22944b = aVar;
        this.f22945c = o;
        this.f22946d = str;
        this.f22943a = C0089n.m302b(aVar, o, str);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static <O extends C4365a.C4369d> C4489b<O> m27295a(@RecentlyNonNull C4365a<O> aVar, O o, String str) {
        return new C4489b<>(aVar, o, str);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo16125b() {
        return this.f22944b.mo15984b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4489b)) {
            return false;
        }
        C4489b bVar = (C4489b) obj;
        return C0089n.m301a(this.f22944b, bVar.f22944b) && C0089n.m301a(this.f22945c, bVar.f22945c) && C0089n.m301a(this.f22946d, bVar.f22946d);
    }

    public final int hashCode() {
        return this.f22943a;
    }
}
