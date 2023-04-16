package p069j1;

import com.google.android.gms.internal.ads.C1654e6;
import com.google.android.gms.internal.ads.C1877k6;
import com.google.android.gms.internal.ads.io0;

/* renamed from: j1.n0 */
final class C3189n0 implements C1654e6 {

    /* renamed from: a */
    final /* synthetic */ String f20506a;

    /* renamed from: b */
    final /* synthetic */ C3201r0 f20507b;

    C3189n0(C3210u0 u0Var, String str, C3201r0 r0Var) {
        this.f20506a = str;
        this.f20507b = r0Var;
    }

    /* renamed from: a */
    public final void mo6841a(C1877k6 k6Var) {
        String str = this.f20506a;
        String exc = k6Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        io0.m11131g(sb.toString());
        this.f20507b.mo7241c(null);
    }
}
