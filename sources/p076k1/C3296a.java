package p076k1;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ca0;
import p002a1.C0022g;
import p002a1.C0029m;
import p002a1.C0034r;
import p002a1.C0039v;
import p003a2.C0092o;

/* renamed from: k1.a */
public abstract class C3296a {
    /* renamed from: b */
    public static void m24375b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C0022g gVar, @RecentlyNonNull C3297b bVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "AdUnitId cannot be null.");
        C0092o.m314j(gVar, "AdRequest cannot be null.");
        C0092o.m314j(bVar, "LoadCallback cannot be null.");
        new ca0(context, str).mo6105i(gVar.mo42a(), bVar);
    }

    /* renamed from: a */
    public abstract C0039v mo6100a();

    /* renamed from: c */
    public abstract void mo6101c(C0029m mVar);

    /* renamed from: d */
    public abstract void mo6102d(boolean z);

    /* renamed from: e */
    public abstract void mo6103e(C0034r rVar);

    /* renamed from: f */
    public abstract void mo6104f(@RecentlyNonNull Activity activity);
}
