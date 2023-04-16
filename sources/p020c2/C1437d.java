package p020c2;

import android.content.Context;
import p003a2.C0098r;
import p003a2.C0102t;
import p003a2.C0104u;
import p070j2.C3230d;
import p131s2.C4028h;
import p166y1.C4365a;
import p166y1.C4379e;
import p172z1.C4514n;

/* renamed from: c2.d */
public final class C1437d extends C4379e<C0104u> implements C0102t {

    /* renamed from: k */
    private static final C4365a.C4375g<C1438e> f3648k;

    /* renamed from: l */
    private static final C4365a.C4366a<C1438e, C0104u> f3649l;

    /* renamed from: m */
    private static final C4365a<C0104u> f3650m;

    /* renamed from: n */
    public static final /* synthetic */ int f3651n = 0;

    static {
        C4365a.C4375g<C1438e> gVar = new C4365a.C4375g<>();
        f3648k = gVar;
        C1436c cVar = new C1436c();
        f3649l = cVar;
        f3650m = new C4365a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C1437d(Context context, C0104u uVar) {
        super(context, f3650m, uVar, C4379e.C4380a.f22742c);
    }

    /* renamed from: b */
    public final C4028h<Void> mo282b(C0098r rVar) {
        C4514n.C4515a a = C4514n.m27370a();
        a.mo16178d(C3230d.f20605a);
        a.mo16177c(false);
        a.mo16176b(new C1435b(rVar));
        return mo16002d(a.mo16175a());
    }
}
