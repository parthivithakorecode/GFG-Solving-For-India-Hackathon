package p091m2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p003a2.C0092o;
import p034e2.C2547d;
import p034e2.C2550g;
import p105o2.C3831a;
import p112p2.C3923a;
import p112p2.C3924b;

/* renamed from: m2.g0 */
public final class C3686g0 {

    /* renamed from: j */
    private static volatile C3686g0 f21453j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f21454a;

    /* renamed from: b */
    protected final C2547d f21455b;

    /* renamed from: c */
    protected final ExecutorService f21456c;

    /* renamed from: d */
    private final C3831a f21457d;

    /* renamed from: e */
    private final List<Pair<Object, Object>> f21458e;

    /* renamed from: f */
    private int f21459f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f21460g;

    /* renamed from: h */
    private final String f21461h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile C3704p0 f21462i;

    protected C3686g0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f21454a = (str == null || !m25295r(str2, str3)) ? "FA" : str;
        this.f21455b = C2550g.m21187d();
        boolean z = true;
        this.f21456c = C3696l0.m25332a().mo14871a(new C3709s(this), 1);
        this.f21457d = new C3831a(this);
        this.f21458e = new ArrayList();
        try {
            if (C3924b.m26082a(context, "google_app_id", C3923a.m26080a(context)) != null && !m25291n()) {
                this.f21461h = null;
                this.f21460g = true;
                Log.w(this.f21454a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m25295r(str2, str3)) {
            this.f21461h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f21454a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f21454a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f21461h = str2;
        }
        m25292o(new C3687h(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f21454a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C3684f0(this));
        }
    }

    /* renamed from: n */
    protected static final boolean m25291n() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m25292o(C3715x xVar) {
        this.f21456c.execute(xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m25293p(Exception exc, boolean z, boolean z2) {
        this.f21460g |= z;
        if (z) {
            Log.w(this.f21454a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo14860c(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f21454a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: q */
    private final void m25294q(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m25292o(new C3713v(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m25295r(String str, String str2) {
        return (str2 == null || str == null || m25291n()) ? false : true;
    }

    /* renamed from: s */
    public static C3686g0 m25296s(Context context, String str, String str2, String str3, Bundle bundle) {
        C0092o.m313i(context);
        if (f21453j == null) {
            synchronized (C3686g0.class) {
                if (f21453j == null) {
                    f21453j = new C3686g0(context, str, str2, str3, bundle);
                }
            }
        }
        return f21453j;
    }

    /* renamed from: A */
    public final void mo14850A(Activity activity, String str, String str2) {
        m25292o(new C3683f(this, activity, str, str2));
    }

    /* renamed from: B */
    public final void mo14851B(Bundle bundle) {
        m25292o(new C3685g(this, bundle));
    }

    /* renamed from: C */
    public final void mo14852C(String str) {
        m25292o(new C3689i(this, str));
    }

    /* renamed from: D */
    public final void mo14853D(String str) {
        m25292o(new C3691j(this, str));
    }

    /* renamed from: E */
    public final String mo14854E() {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3693k(this, m0Var));
        return m0Var.mo14874n0(500);
    }

    /* renamed from: F */
    public final String mo14855F() {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3695l(this, m0Var));
        return m0Var.mo14874n0(50);
    }

    /* renamed from: G */
    public final long mo14856G() {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3697m(this, m0Var));
        Long l = (Long) C3698m0.m25335Z2(m0Var.mo14872C0(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f21455b.mo12462a()).nextLong();
        int i = this.f21459f + 1;
        this.f21459f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: H */
    public final String mo14857H() {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3699n(this, m0Var));
        return m0Var.mo14874n0(500);
    }

    /* renamed from: a */
    public final String mo14858a() {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3701o(this, m0Var));
        return m0Var.mo14874n0(500);
    }

    /* renamed from: b */
    public final Map<String, Object> mo14859b(String str, String str2, boolean z) {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3703p(this, str, str2, z, m0Var));
        Bundle C0 = m0Var.mo14872C0(5000);
        if (C0 == null || C0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(C0.size());
        for (String str3 : C0.keySet()) {
            Object obj = C0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final void mo14860c(int i, String str, Object obj, Object obj2, Object obj3) {
        m25292o(new C3705q(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: d */
    public final Bundle mo14861d(Bundle bundle, boolean z) {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3707r(this, bundle, m0Var));
        if (z) {
            return m0Var.mo14872C0(5000);
        }
        return null;
    }

    /* renamed from: e */
    public final int mo14862e(String str) {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3711t(this, str, m0Var));
        Integer num = (Integer) C3698m0.m25335Z2(m0Var.mo14872C0(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public final String mo14863f() {
        return this.f21461h;
    }

    /* renamed from: t */
    public final C3831a mo14864t() {
        return this.f21457d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C3704p0 mo14865u(Context context, boolean z) {
        try {
            return C3702o0.m25369n0(DynamiteModule.m5727e(context, DynamiteModule.f3799g, "com.google.android.gms.measurement.dynamite").mo5025d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C1481a e) {
            m25293p(e, true, false);
            return null;
        }
    }

    /* renamed from: v */
    public final void mo14866v(String str, String str2, Bundle bundle) {
        m25294q(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: w */
    public final void mo14867w(String str, String str2, Object obj, boolean z) {
        m25292o(new C3714w(this, str, str2, obj, z));
    }

    /* renamed from: x */
    public final void mo14868x(Bundle bundle) {
        m25292o(new C3677c(this, bundle));
    }

    /* renamed from: y */
    public final void mo14869y(String str, String str2, Bundle bundle) {
        m25292o(new C3679d(this, str, str2, bundle));
    }

    /* renamed from: z */
    public final List<Bundle> mo14870z(String str, String str2) {
        C3698m0 m0Var = new C3698m0();
        m25292o(new C3681e(this, str, str2, m0Var));
        List<Bundle> list = (List) C3698m0.m25335Z2(m0Var.mo14872C0(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
