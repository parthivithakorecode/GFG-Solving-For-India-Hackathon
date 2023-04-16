package p111p1;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.ph0;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* renamed from: p1.c0 */
final class C3892c0 implements nb3<ArrayList<Uri>> {

    /* renamed from: a */
    final /* synthetic */ ph0 f21982a;

    /* renamed from: b */
    final /* synthetic */ C3898f0 f21983b;

    C3892c0(C3898f0 f0Var, ph0 ph0) {
        this.f21983b = f0Var;
        this.f21982a = ph0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(@Nonnull Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f21982a.mo9527n2(arrayList);
            if (this.f21983b.f22014t) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (C3898f0.m26011E5(uri)) {
                        C3898f0 f0Var = this.f21983b;
                        this.f21983b.f22013s.mo6339b(C3898f0.m26018K5(uri, f0Var.f21999C, "1").toString());
                    }
                }
            }
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        try {
            ph0 ph0 = this.f21982a;
            String valueOf = String.valueOf(th.getMessage());
            ph0.mo9528u(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
