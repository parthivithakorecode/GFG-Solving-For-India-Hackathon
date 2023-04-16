package p069j1;

import com.google.android.gms.internal.ads.C1506a6;
import com.google.android.gms.internal.ads.C1729g6;
import com.google.android.gms.internal.ads.C2320w5;
import com.google.android.gms.internal.ads.C2396y6;
import com.google.android.gms.internal.ads.bp0;
import com.google.android.gms.internal.ads.ho0;
import java.util.Map;

/* renamed from: j1.t0 */
public final class C3207t0 extends C1506a6<C2320w5> {

    /* renamed from: r */
    private final bp0<C2320w5> f20542r;

    /* renamed from: s */
    private final ho0 f20543s;

    public C3207t0(String str, Map<String, String> map, bp0<C2320w5> bp0) {
        super(0, str, new C3204s0(bp0));
        this.f20542r = bp0;
        ho0 ho0 = new ho0((String) null);
        this.f20543s = ho0;
        ho0.mo7975d(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C1729g6<C2320w5> mo5117i(C2320w5 w5Var) {
        return C1729g6.m9545b(w5Var, C2396y6.m19879b(w5Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ void mo5123p(Object obj) {
        C2320w5 w5Var = (C2320w5) obj;
        this.f20543s.mo7977f(w5Var.f16710c, w5Var.f16708a);
        ho0 ho0 = this.f20543s;
        byte[] bArr = w5Var.f16709b;
        if (ho0.m10681l() && bArr != null) {
            ho0.mo7979h(bArr);
        }
        this.f20542r.mo5907e(w5Var);
    }
}
