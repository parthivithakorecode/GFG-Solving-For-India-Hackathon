package p069j1;

import android.content.Context;
import com.google.android.gms.internal.ads.C1506a6;
import com.google.android.gms.internal.ads.C1544b7;
import com.google.android.gms.internal.ads.C1581c7;
import com.google.android.gms.internal.ads.C1617d6;
import com.google.android.gms.internal.ads.C2062p6;
import com.google.android.gms.internal.ads.C2099q6;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2320w5;
import com.google.android.gms.internal.ads.C2359x6;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.m10;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: j1.d0 */
public final class C3149d0 extends C2099q6 {

    /* renamed from: d */
    private final Context f20451d;

    private C3149d0(Context context, C2062p6 p6Var) {
        super(p6Var);
        this.f20451d = context;
    }

    /* renamed from: b */
    public static C1617d6 m23860b(Context context) {
        C1617d6 d6Var = new C1617d6(new C2359x6(new File(context.getCacheDir(), "admob_volley"), 20971520), new C3149d0(context, new C1581c7((C1544b7) null, (SSLSocketFactory) null)), 4);
        d6Var.mo6396d();
        return d6Var;
    }

    /* renamed from: a */
    public final C2320w5 mo6876a(C1506a6<?> a6Var) {
        if (a6Var.zza() == 0) {
            if (Pattern.matches((String) C2199sw.m17001c().mo8579b(m10.f10428Y2), a6Var.mo5119l())) {
                C2125qw.m15897b();
                if (bo0.m6990n(this.f20451d, 13400000)) {
                    C2320w5 a = new e90(this.f20451d).mo6876a(a6Var);
                    if (a != null) {
                        String valueOf = String.valueOf(a6Var.mo5119l());
                        C3202r1.m24015k(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a;
                    }
                    String valueOf2 = String.valueOf(a6Var.mo5119l());
                    C3202r1.m24015k(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo6876a(a6Var);
    }
}
