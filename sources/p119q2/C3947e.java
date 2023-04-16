package p119q2;

import com.google.android.gms.common.api.Scope;
import p125r2.C3977a;
import p166y1.C4365a;

/* renamed from: q2.e */
public final class C3947e {

    /* renamed from: a */
    public static final C4365a.C4375g<C3977a> f22089a;

    /* renamed from: b */
    public static final C4365a.C4375g<C3977a> f22090b;

    /* renamed from: c */
    public static final C4365a.C4366a<C3977a, C3943a> f22091c;

    /* renamed from: d */
    static final C4365a.C4366a<C3977a, C3946d> f22092d;

    /* renamed from: e */
    public static final Scope f22093e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f22094f = new Scope("email");

    /* renamed from: g */
    public static final C4365a<C3943a> f22095g;

    /* renamed from: h */
    public static final C4365a<C3946d> f22096h;

    static {
        C4365a.C4375g<C3977a> gVar = new C4365a.C4375g<>();
        f22089a = gVar;
        C4365a.C4375g<C3977a> gVar2 = new C4365a.C4375g<>();
        f22090b = gVar2;
        C3944b bVar = new C3944b();
        f22091c = bVar;
        C3945c cVar = new C3945c();
        f22092d = cVar;
        f22095g = new C4365a<>("SignIn.API", bVar, gVar);
        f22096h = new C4365a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
