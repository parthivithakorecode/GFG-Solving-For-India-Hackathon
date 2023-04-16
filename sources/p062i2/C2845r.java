package p062i2;

import android.content.Context;
import p131s2.C4028h;
import p131s2.C4031k;
import p142u1.C4129b;
import p142u1.C4130c;
import p160x1.C4284f;
import p166y1.C4376b;

/* renamed from: i2.r */
public final class C2845r implements C4129b {

    /* renamed from: a */
    private final C4129b f19540a;

    /* renamed from: b */
    private final C4129b f19541b;

    public C2845r(Context context) {
        this.f19540a = new C2843p(context, C4284f.m26845f());
        this.f19541b = C2839l.m22331d(context);
    }

    /* renamed from: b */
    public static /* synthetic */ C4028h m22343b(C2845r rVar, C4028h hVar) {
        if (hVar.mo15515m() || hVar.mo15513k()) {
            return hVar;
        }
        Exception i = hVar.mo15511i();
        if (!(i instanceof C4376b)) {
            return hVar;
        }
        int b = ((C4376b) i).mo15999b();
        return (b == 43001 || b == 43002 || b == 43003 || b == 17) ? rVar.f19541b.mo13097a() : b == 43000 ? C4031k.m26350b(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : b != 15 ? hVar : C4031k.m26350b(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    /* renamed from: a */
    public final C4028h<C4130c> mo13097a() {
        return this.f19540a.mo13097a().mo15510h(new C2844q(this));
    }
}
