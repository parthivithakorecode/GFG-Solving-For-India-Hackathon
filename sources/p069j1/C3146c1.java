package p069j1;

import android.content.Context;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.io0;
import java.io.IOException;
import p033e1.C2538a;
import p160x1.C4285g;
import p160x1.C4286h;

/* renamed from: j1.c1 */
final class C3146c1 extends C3141b0 {

    /* renamed from: c */
    private final Context f20450c;

    C3146c1(Context context) {
        this.f20450c = context;
    }

    /* renamed from: a */
    public final void mo8780a() {
        boolean z;
        try {
            z = C2538a.m21157d(this.f20450c);
        } catch (IOException | IllegalStateException | C4285g | C4286h e) {
            io0.m11129e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        ho0.m10679j(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        io0.m11131g(sb.toString());
    }
}
