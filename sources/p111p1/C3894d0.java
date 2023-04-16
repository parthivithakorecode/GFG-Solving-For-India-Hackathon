package p111p1;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.ph0;
import java.util.Collections;
import javax.annotation.Nonnull;

/* renamed from: p1.d0 */
final class C3894d0 implements nb3<Uri> {

    /* renamed from: a */
    final /* synthetic */ ph0 f21985a;

    /* renamed from: b */
    final /* synthetic */ C3898f0 f21986b;

    C3894d0(C3898f0 f0Var, ph0 ph0) {
        this.f21986b = f0Var;
        this.f21985a = ph0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(@Nonnull Object obj) {
        Uri uri = (Uri) obj;
        try {
            this.f21986b.f22020z.getAndIncrement();
            this.f21985a.mo9527n2(Collections.singletonList(uri));
            if (this.f21986b.f22015u) {
                C3898f0 f0Var = this.f21986b;
                this.f21986b.f22013s.mo6339b(C3898f0.m26018K5(uri, f0Var.f21999C, "1").toString());
            }
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        try {
            ph0 ph0 = this.f21985a;
            String valueOf = String.valueOf(th.getMessage());
            ph0.mo9528u(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
