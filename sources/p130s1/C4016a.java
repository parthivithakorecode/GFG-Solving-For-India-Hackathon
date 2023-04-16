package p130s1;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.zk0;
import p002a1.C0022g;
import p002a1.C0029m;
import p002a1.C0034r;
import p002a1.C0035s;
import p002a1.C0039v;
import p003a2.C0092o;
import p012b1.C1291a;
import p124r1.C3970a;
import p124r1.C3974e;

/* renamed from: s1.a */
public abstract class C4016a {
    /* renamed from: b */
    public static void m26294b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C0022g gVar, @RecentlyNonNull C4017b bVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "AdUnitId cannot be null.");
        C0092o.m314j(gVar, "AdRequest cannot be null.");
        C0092o.m314j(bVar, "LoadCallback cannot be null.");
        new zk0(context, str).mo12245j(gVar.mo42a(), bVar);
    }

    /* renamed from: c */
    public static void m26295c(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C1291a aVar, @RecentlyNonNull C4017b bVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "AdUnitId cannot be null.");
        C0092o.m314j(aVar, "AdManagerAdRequest cannot be null.");
        C0092o.m314j(bVar, "LoadCallback cannot be null.");
        new zk0(context, str).mo12245j(aVar.mo42a(), bVar);
    }

    /* renamed from: a */
    public abstract C0039v mo12238a();

    /* renamed from: d */
    public abstract void mo12239d(C0029m mVar);

    /* renamed from: e */
    public abstract void mo12240e(boolean z);

    /* renamed from: f */
    public abstract void mo12241f(C3970a aVar);

    /* renamed from: g */
    public abstract void mo12242g(C0034r rVar);

    /* renamed from: h */
    public abstract void mo12243h(@RecentlyNonNull C3974e eVar);

    /* renamed from: i */
    public abstract void mo12244i(@RecentlyNonNull Activity activity, @RecentlyNonNull C0035s sVar);
}
