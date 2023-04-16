package p019c1;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C1637dq;
import p002a1.C0019e;
import p002a1.C0022g;
import p002a1.C0029m;
import p002a1.C0034r;
import p002a1.C0039v;
import p003a2.C0092o;
import p012b1.C1291a;

/* renamed from: c1.a */
public abstract class C1432a {

    /* renamed from: c1.a$a */
    public static abstract class C1433a extends C0019e<C1432a> {
    }

    /* renamed from: b */
    public static void m5608b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C0022g gVar, int i, @RecentlyNonNull C1433a aVar) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "adUnitId cannot be null.");
        C0092o.m314j(gVar, "AdRequest cannot be null.");
        new C1637dq(context, str, gVar.mo42a(), i, aVar).mo6564a();
    }

    /* renamed from: c */
    public static void m5609c(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C1291a aVar, int i, @RecentlyNonNull C1433a aVar2) {
        C0092o.m314j(context, "Context cannot be null.");
        C0092o.m314j(str, "adUnitId cannot be null.");
        C0092o.m314j(aVar, "AdManagerAdRequest cannot be null.");
        new C1637dq(context, str, aVar.mo42a(), i, aVar2).mo6564a();
    }

    /* renamed from: a */
    public abstract C0039v mo4840a();

    /* renamed from: d */
    public abstract void mo4841d(C0029m mVar);

    /* renamed from: e */
    public abstract void mo4842e(boolean z);

    /* renamed from: f */
    public abstract void mo4843f(C0034r rVar);

    /* renamed from: g */
    public abstract void mo4844g(@RecentlyNonNull Activity activity);
}
