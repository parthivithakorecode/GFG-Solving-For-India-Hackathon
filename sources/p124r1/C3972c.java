package p124r1;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.pk0;
import p002a1.C0022g;
import p002a1.C0029m;
import p002a1.C0034r;
import p002a1.C0035s;
import p002a1.C0039v;
import p003a2.C0092o;
import p012b1.C1291a;

/* renamed from: r1.c */
public abstract class C3972c {
    /* renamed from: b */
    public static void m26185b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C0022g gVar, @RecentlyNonNull C3973d dVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "AdUnitId cannot be null.");
        C0092o.m314j(gVar, "AdRequest cannot be null.");
        C0092o.m314j(dVar, "LoadCallback cannot be null.");
        new pk0(context, str).mo10080j(gVar.mo42a(), dVar);
    }

    /* renamed from: c */
    public static void m26186c(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C1291a aVar, @RecentlyNonNull C3973d dVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "AdUnitId cannot be null.");
        C0092o.m314j(aVar, "AdManagerAdRequest cannot be null.");
        C0092o.m314j(dVar, "LoadCallback cannot be null.");
        new pk0(context, str).mo10080j(aVar.mo42a(), dVar);
    }

    /* renamed from: a */
    public abstract C0039v mo10073a();

    /* renamed from: d */
    public abstract void mo10074d(C0029m mVar);

    /* renamed from: e */
    public abstract void mo10075e(boolean z);

    /* renamed from: f */
    public abstract void mo10076f(C3970a aVar);

    /* renamed from: g */
    public abstract void mo10077g(C0034r rVar);

    /* renamed from: h */
    public abstract void mo10078h(C3974e eVar);

    /* renamed from: i */
    public abstract void mo10079i(@RecentlyNonNull Activity activity, @RecentlyNonNull C0035s sVar);
}
