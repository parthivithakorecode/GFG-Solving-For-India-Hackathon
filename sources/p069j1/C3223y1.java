package p069j1;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.j20;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.zv3;
import p095n.C3742c;

/* renamed from: j1.y1 */
final class C3223y1 implements j20 {

    /* renamed from: a */
    final /* synthetic */ l20 f20596a;

    /* renamed from: b */
    final /* synthetic */ Context f20597b;

    /* renamed from: c */
    final /* synthetic */ Uri f20598c;

    C3223y1(C3163g2 g2Var, l20 l20, Context context, Uri uri) {
        this.f20596a = l20;
        this.f20597b = context;
        this.f20598c = uri;
    }

    public final void zza() {
        C3742c a = new C3742c.C3743a(this.f20596a.mo8849a()).mo14951a();
        a.f21577a.setPackage(zv3.m20854a(this.f20597b));
        a.mo14950a(this.f20597b, this.f20598c);
        this.f20596a.mo8854f((Activity) this.f20597b);
    }
}
