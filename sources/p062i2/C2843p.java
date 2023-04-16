package p062i2;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import p131s2.C4028h;
import p131s2.C4031k;
import p142u1.C4129b;
import p142u1.C4130c;
import p142u1.C4135h;
import p160x1.C4284f;
import p166y1.C4365a;
import p166y1.C4376b;
import p166y1.C4379e;
import p172z1.C4514n;

/* renamed from: i2.p */
public final class C2843p extends C4379e<C4365a.C4369d.C4372c> implements C4129b {

    /* renamed from: m */
    private static final C4365a.C4375g<C2831d> f19534m;

    /* renamed from: n */
    private static final C4365a.C4366a<C2831d, C4365a.C4369d.C4372c> f19535n;

    /* renamed from: o */
    private static final C4365a<C4365a.C4369d.C4372c> f19536o;

    /* renamed from: k */
    private final Context f19537k;

    /* renamed from: l */
    private final C4284f f19538l;

    static {
        C4365a.C4375g<C2831d> gVar = new C4365a.C4375g<>();
        f19534m = gVar;
        C2841n nVar = new C2841n();
        f19535n = nVar;
        f19536o = new C4365a<>("AppSet.API", nVar, gVar);
    }

    C2843p(Context context, C4284f fVar) {
        super(context, f19536o, C4365a.C4369d.f22729a, C4379e.C4380a.f22742c);
        this.f19537k = context;
        this.f19538l = fVar;
    }

    /* renamed from: a */
    public final C4028h<C4130c> mo13097a() {
        if (this.f19538l.mo15863h(this.f19537k, 212800000) != 0) {
            return C4031k.m26350b(new C4376b(new Status(17)));
        }
        return mo16003e(C4514n.m27370a().mo16178d(C4135h.f22368a).mo16176b(new C2840m(this)).mo16177c(false).mo16179e(27601).mo16175a());
    }
}
