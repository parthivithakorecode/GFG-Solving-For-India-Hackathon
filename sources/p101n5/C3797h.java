package p101n5;

import android.util.Log;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p079k4.C3330q;
import p145u4.C4155q;

/* renamed from: n5.h */
public final class C3797h {

    /* renamed from: a */
    public static final C3797h f21723a = new C3797h();

    /* renamed from: b */
    private static C3796g f21724b = C3796g.ERROR;

    /* renamed from: c */
    private static C4155q<? super String, ? super String, ? super Throwable, C3330q> f21725c = C3798a.f21726f;

    /* renamed from: n5.h$a */
    static final class C3798a extends C3358j implements C4155q<String, String, Throwable, C3330q> {

        /* renamed from: f */
        public static final C3798a f21726f = new C3798a();

        C3798a() {
            super(3);
        }

        /* renamed from: a */
        public final void mo15046a(String str, String str2, Throwable th) {
            C3357i.m24508e(str, "tag");
            C3357i.m24508e(str2, "message");
            Log.d(str, str2, th);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ Object mo12506e(Object obj, Object obj2, Object obj3) {
            mo15046a((String) obj, (String) obj2, (Throwable) obj3);
            return C3330q.f20829a;
        }
    }

    private C3797h() {
    }

    /* renamed from: c */
    private final void m25650c(C3796g gVar, String str, Throwable th) {
        if (gVar.mo15042d() <= f21724b.mo15042d()) {
            f21725c.mo12506e("AudioPlayers", str, th);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25651d(C3797h hVar, C3796g gVar, String str, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        hVar.m25650c(gVar, str, th);
    }

    /* renamed from: a */
    public final void mo15043a(String str, Throwable th) {
        C3357i.m24508e(str, "message");
        C3357i.m24508e(th, "throwable");
        m25650c(C3796g.ERROR, str, th);
    }

    /* renamed from: b */
    public final void mo15044b(String str) {
        C3357i.m24508e(str, "message");
        m25651d(this, C3796g.INFO, str, (Throwable) null, 4, (Object) null);
    }

    /* renamed from: e */
    public final void mo15045e(C3796g gVar) {
        C3357i.m24508e(gVar, "<set-?>");
        f21724b = gVar;
    }
}
