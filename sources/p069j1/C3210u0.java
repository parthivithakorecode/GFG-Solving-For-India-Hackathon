package p069j1;

import android.content.Context;
import com.google.android.gms.internal.ads.C1617d6;
import com.google.android.gms.internal.ads.C1802i5;
import com.google.android.gms.internal.ads.C1804i7;
import com.google.android.gms.internal.ads.C2062p6;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2320w5;
import com.google.android.gms.internal.ads.bp0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p034e2.C2546c;

@ParametersAreNonnullByDefault
/* renamed from: j1.u0 */
public final class C3210u0 {

    /* renamed from: a */
    private static C1617d6 f20545a;

    /* renamed from: b */
    private static final Object f20546b = new Object();
    @Deprecated

    /* renamed from: c */
    public static final C3195p0<Void> f20547c = new C3185m0();

    public C3210u0(Context context) {
        C1617d6 d6Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f20546b) {
            if (f20545a == null) {
                m10.m13007c(context);
                if (!C2546c.m21176a()) {
                    if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10420X2)).booleanValue()) {
                        d6Var = C3149d0.m23860b(context);
                        f20545a = d6Var;
                    }
                }
                d6Var = C1804i7.m10941a(context, (C2062p6) null);
                f20545a = d6Var;
            }
        }
    }

    /* renamed from: a */
    public final cc3<C2320w5> mo14108a(String str) {
        bp0 bp0 = new bp0();
        f20545a.mo6393a(new C3207t0(str, (Map<String, String>) null, bp0));
        return bp0;
    }

    /* renamed from: b */
    public final cc3<String> mo14109b(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        C3201r0 r0Var = new C3201r0((C3198q0) null);
        C3189n0 n0Var = new C3189n0(this, str2, r0Var);
        ho0 ho0 = new ho0((String) null);
        C3192o0 o0Var = new C3192o0(this, i, str, r0Var, n0Var, bArr, map, ho0);
        if (ho0.m10681l()) {
            try {
                ho0.mo7975d(str2, "GET", o0Var.mo5120m(), o0Var.mo5133y());
            } catch (C1802i5 e) {
                io0.m11131g(e.getMessage());
            }
        }
        f20545a.mo6393a(o0Var);
        return r0Var;
    }
}
