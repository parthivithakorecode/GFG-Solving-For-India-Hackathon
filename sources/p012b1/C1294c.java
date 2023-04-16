package p012b1;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ca0;
import p003a2.C0092o;
import p076k1.C3296a;

/* renamed from: b1.c */
public abstract class C1294c extends C3296a {
    /* renamed from: g */
    public static void m5188g(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C1291a aVar, @RecentlyNonNull C1295d dVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "AdUnitId cannot be null.");
        C0092o.m314j(aVar, "AdManagerAdRequest cannot be null.");
        C0092o.m314j(dVar, "LoadCallback cannot be null.");
        new ca0(context, str).mo6105i(aVar.mo42a(), dVar);
    }

    /* renamed from: h */
    public abstract void mo4621h(C1296e eVar);
}
