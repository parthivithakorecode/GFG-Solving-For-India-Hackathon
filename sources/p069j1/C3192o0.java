package p069j1;

import com.google.android.gms.internal.ads.C1654e6;
import com.google.android.gms.internal.ads.C1692f6;
import com.google.android.gms.internal.ads.C1730g7;
import com.google.android.gms.internal.ads.ho0;
import java.util.Collections;
import java.util.Map;

/* renamed from: j1.o0 */
final class C3192o0 extends C1730g7 {

    /* renamed from: t */
    final /* synthetic */ byte[] f20514t;

    /* renamed from: u */
    final /* synthetic */ Map f20515u;

    /* renamed from: v */
    final /* synthetic */ ho0 f20516v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3192o0(C3210u0 u0Var, int i, String str, C1692f6 f6Var, C1654e6 e6Var, byte[] bArr, Map map, ho0 ho0) {
        super(i, str, f6Var, e6Var);
        this.f20514t = bArr;
        this.f20515u = map;
        this.f20516v = ho0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo7523A(String str) {
        this.f20516v.mo7978g(str);
        super.mo7523A(str);
    }

    /* renamed from: m */
    public final Map<String, String> mo5120m() {
        Map<String, String> map = this.f20515u;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ void mo5123p(Object obj) {
        mo7523A((String) obj);
    }

    /* renamed from: y */
    public final byte[] mo5133y() {
        byte[] bArr = this.f20514t;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
