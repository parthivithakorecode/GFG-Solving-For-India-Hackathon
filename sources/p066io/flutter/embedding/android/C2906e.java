package p066io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.C1099i;
import java.util.Arrays;
import java.util.List;
import p064i4.C2854h;
import p066io.flutter.embedding.engine.C2961a;
import p066io.flutter.embedding.engine.C2964b;
import p066io.flutter.embedding.engine.C2973e;
import p066io.flutter.plugin.platform.C3000c;
import p099n3.C3764a;
import p099n3.C3768b;
import p106o3.C3832a;
import p168y3.C4472b;

/* renamed from: io.flutter.embedding.android.e */
class C2906e implements C2903c<Activity> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2909c f19673a;

    /* renamed from: b */
    private C2961a f19674b;

    /* renamed from: c */
    C2920k f19675c;

    /* renamed from: d */
    private C3000c f19676d;

    /* renamed from: e */
    ViewTreeObserver.OnPreDrawListener f19677e;

    /* renamed from: f */
    private boolean f19678f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f19679g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f19680h;

    /* renamed from: i */
    private boolean f19681i;

    /* renamed from: j */
    private Integer f19682j;

    /* renamed from: k */
    private final C4472b f19683k = new C2907a();

    /* renamed from: io.flutter.embedding.android.e$a */
    class C2907a implements C4472b {
        C2907a() {
        }

        /* renamed from: c */
        public void mo13233c() {
            C2906e.this.f19673a.mo13261c();
            boolean unused = C2906e.this.f19679g = false;
        }

        /* renamed from: f */
        public void mo13234f() {
            C2906e.this.f19673a.mo13264f();
            boolean unused = C2906e.this.f19679g = true;
            boolean unused2 = C2906e.this.f19680h = true;
        }
    }

    /* renamed from: io.flutter.embedding.android.e$b */
    class C2908b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ C2920k f19685f;

        C2908b(C2920k kVar) {
            this.f19685f = kVar;
        }

        public boolean onPreDraw() {
            if (C2906e.this.f19679g && C2906e.this.f19677e != null) {
                this.f19685f.getViewTreeObserver().removeOnPreDrawListener(this);
                C2906e.this.f19677e = null;
            }
            return C2906e.this.f19679g;
        }
    }

    /* renamed from: io.flutter.embedding.android.e$c */
    interface C2909c extends C3000c.C3004d {
        /* renamed from: A */
        C2956y mo13251A();

        /* renamed from: B */
        void mo13252B(C2917i iVar);

        /* renamed from: C */
        void mo13253C(C2961a aVar);

        /* renamed from: a */
        C1099i mo491a();

        /* renamed from: c */
        void mo13261c();

        /* renamed from: d */
        Activity mo13262d();

        /* renamed from: e */
        void mo13263e();

        /* renamed from: f */
        void mo13264f();

        /* renamed from: g */
        String mo13265g();

        Context getContext();

        /* renamed from: j */
        List<String> mo13267j();

        /* renamed from: k */
        boolean mo13268k();

        /* renamed from: l */
        boolean mo13269l();

        /* renamed from: m */
        boolean mo13270m();

        /* renamed from: n */
        String mo13271n();

        /* renamed from: o */
        boolean mo13272o();

        /* renamed from: p */
        String mo13287p();

        /* renamed from: q */
        void mo13288q(C2961a aVar);

        /* renamed from: r */
        String mo13289r();

        /* renamed from: s */
        C3000c mo13290s(Activity activity, C2961a aVar);

        /* renamed from: t */
        void mo13291t(C2914h hVar);

        /* renamed from: u */
        String mo13292u();

        /* renamed from: v */
        boolean mo13293v();

        /* renamed from: w */
        C2973e mo13294w();

        /* renamed from: x */
        C2953v mo13295x();

        /* renamed from: y */
        C2955x mo13296y();

        /* renamed from: z */
        C2961a mo13297z(Context context);
    }

    C2906e(C2909c cVar) {
        this.f19673a = cVar;
        this.f19680h = false;
    }

    /* renamed from: g */
    private void m22838g(C2920k kVar) {
        if (this.f19673a.mo13295x() == C2953v.surface) {
            if (this.f19677e != null) {
                kVar.getViewTreeObserver().removeOnPreDrawListener(this.f19677e);
            }
            this.f19677e = new C2908b(kVar);
            kVar.getViewTreeObserver().addOnPreDrawListener(this.f19677e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    /* renamed from: h */
    private void m22839h() {
        String str;
        if (this.f19673a.mo13271n() == null && !this.f19674b.mo13477h().mo15274l()) {
            String g = this.f19673a.mo13265g();
            if (g == null && (g = m22841n(this.f19673a.mo13262d().getIntent())) == null) {
                g = "/";
            }
            String r = this.f19673a.mo13289r();
            if (("Executing Dart entrypoint: " + this.f19673a.mo13287p() + ", library uri: " + r) == null) {
                str = "\"\"";
            } else {
                str = r + ", and sending initial route: " + g;
            }
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", str);
            this.f19674b.mo13481l().mo16234c(g);
            String u = this.f19673a.mo13292u();
            if (u == null || u.isEmpty()) {
                u = C3764a.m25580e().mo15007c().mo15416f();
            }
            this.f19674b.mo13477h().mo15272j(r == null ? new C3832a.C3834b(u, this.f19673a.mo13287p()) : new C3832a.C3834b(u, r, this.f19673a.mo13287p()), this.f19673a.mo13267j());
        }
    }

    /* renamed from: i */
    private void m22840i() {
        if (this.f19673a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: n */
    private String m22841n(Intent intent) {
        Uri data;
        String path;
        if (!this.f19673a.mo13293v() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo13299A(Bundle bundle) {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        m22840i();
        if (this.f19673a.mo13272o()) {
            bundle.putByteArray("framework", this.f19674b.mo13486q().mo16241h());
        }
        if (this.f19673a.mo13268k()) {
            Bundle bundle2 = new Bundle();
            this.f19674b.mo13476g().mo13498c(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo13300B() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onStart()");
        m22840i();
        m22839h();
        Integer num = this.f19682j;
        if (num != null) {
            this.f19675c.setVisibility(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo13301C() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onStop()");
        m22840i();
        if (this.f19673a.mo13270m()) {
            this.f19674b.mo13478i().mo16227c();
        }
        this.f19682j = Integer.valueOf(this.f19675c.getVisibility());
        this.f19675c.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo13302D(int i) {
        m22840i();
        C2961a aVar = this.f19674b;
        if (aVar != null) {
            if (this.f19680h && i >= 10) {
                aVar.mo13477h().mo15275m();
                this.f19674b.mo13489t().mo16251a();
            }
            this.f19674b.mo13485p().mo16106m(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo13303E() {
        m22840i();
        if (this.f19674b != null) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f19674b.mo13476g().mo13499d();
            return;
        }
        C3768b.m25593g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo13304F() {
        this.f19673a = null;
        this.f19674b = null;
        this.f19675c = null;
        this.f19676d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo13305G() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String n = this.f19673a.mo13271n();
        if (n != null) {
            C2961a a = C2964b.m23056b().mo13493a(n);
            this.f19674b = a;
            this.f19678f = true;
            if (a == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + n + "'");
            }
            return;
        }
        C2909c cVar = this.f19673a;
        C2961a z = cVar.mo13297z(cVar.getContext());
        this.f19674b = z;
        if (z != null) {
            this.f19678f = true;
            return;
        }
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f19674b = new C2961a(this.f19673a.getContext(), this.f19673a.mo13294w().mo13526b(), false, this.f19673a.mo13272o());
        this.f19678f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo13306H() {
        C3000c cVar = this.f19676d;
        if (cVar != null) {
            cVar.mo13641A();
        }
    }

    /* renamed from: e */
    public void mo13249e() {
        if (!this.f19673a.mo13269l()) {
            this.f19673a.mo13263e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f19673a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: j */
    public Activity mo13250f() {
        Activity d = this.f19673a.mo13262d();
        if (d != null) {
            return d;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C2961a mo13308k() {
        return this.f19674b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo13309l() {
        return this.f19681i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo13310m() {
        return this.f19678f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13311o(int i, int i2, Intent intent) {
        m22840i();
        if (this.f19674b != null) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
            this.f19674b.mo13476g().mo13496a(i, i2, intent);
            return;
        }
        C3768b.m25593g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo13312p(Context context) {
        m22840i();
        if (this.f19674b == null) {
            mo13305G();
        }
        if (this.f19673a.mo13268k()) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f19674b.mo13476g().mo13500e(this, this.f19673a.mo491a());
        }
        C2909c cVar = this.f19673a;
        this.f19676d = cVar.mo13290s(cVar.mo13262d(), this.f19674b);
        this.f19673a.mo13253C(this.f19674b);
        this.f19681i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo13313q() {
        m22840i();
        if (this.f19674b != null) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f19674b.mo13481l().mo16232a();
            return;
        }
        C3768b.m25593g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public View mo13314r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i, boolean z) {
        C2920k kVar;
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        m22840i();
        boolean z2 = true;
        if (this.f19673a.mo13295x() == C2953v.surface) {
            Context context = this.f19673a.getContext();
            if (this.f19673a.mo13251A() != C2956y.transparent) {
                z2 = false;
            }
            C2914h hVar = new C2914h(context, z2);
            this.f19673a.mo13291t(hVar);
            kVar = new C2920k(this.f19673a.getContext(), hVar);
        } else {
            C2917i iVar = new C2917i(this.f19673a.getContext());
            if (this.f19673a.mo13251A() != C2956y.opaque) {
                z2 = false;
            }
            iVar.setOpaque(z2);
            this.f19673a.mo13252B(iVar);
            kVar = new C2920k(this.f19673a.getContext(), iVar);
        }
        this.f19675c = kVar;
        this.f19675c.mo13359l(this.f19683k);
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f19675c.mo13361n(this.f19674b);
        this.f19675c.setId(i);
        C2955x y = this.f19673a.mo13296y();
        if (y != null) {
            C3768b.m25593g("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.f19673a.getContext());
            flutterSplashView.setId(C2854h.m22362d(486947586));
            flutterSplashView.mo13223g(this.f19675c, y);
            return flutterSplashView;
        }
        if (z) {
            m22838g(this.f19675c);
        }
        return this.f19675c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13315s() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        m22840i();
        if (this.f19677e != null) {
            this.f19675c.getViewTreeObserver().removeOnPreDrawListener(this.f19677e);
            this.f19677e = null;
        }
        this.f19675c.mo13375s();
        this.f19675c.mo13381z(this.f19683k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo13316t() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onDetach()");
        m22840i();
        this.f19673a.mo13288q(this.f19674b);
        if (this.f19673a.mo13268k()) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f19673a.mo13262d().isChangingConfigurations()) {
                this.f19674b.mo13476g().mo13502g();
            } else {
                this.f19674b.mo13476g().mo13503h();
            }
        }
        C3000c cVar = this.f19676d;
        if (cVar != null) {
            cVar.mo13643o();
            this.f19676d = null;
        }
        if (this.f19673a.mo13270m()) {
            this.f19674b.mo13478i().mo16225a();
        }
        if (this.f19673a.mo13269l()) {
            this.f19674b.mo13474e();
            if (this.f19673a.mo13271n() != null) {
                C2964b.m23056b().mo13495d(this.f19673a.mo13271n());
            }
            this.f19674b = null;
        }
        this.f19681i = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo13317u(Intent intent) {
        m22840i();
        if (this.f19674b != null) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
            this.f19674b.mo13476g().onNewIntent(intent);
            String n = m22841n(intent);
            if (n != null && !n.isEmpty()) {
                this.f19674b.mo13481l().mo16233b(n);
                return;
            }
            return;
        }
        C3768b.m25593g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo13318v() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onPause()");
        m22840i();
        if (this.f19673a.mo13270m()) {
            this.f19674b.mo13478i().mo16226b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo13319w() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        m22840i();
        if (this.f19674b != null) {
            mo13306H();
        } else {
            C3768b.m25593g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo13320x(int i, String[] strArr, int[] iArr) {
        m22840i();
        if (this.f19674b != null) {
            C3768b.m25592f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.f19674b.mo13476g().onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        C3768b.m25593g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo13321y(Bundle bundle) {
        Bundle bundle2;
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        m22840i();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f19673a.mo13272o()) {
            this.f19674b.mo13486q().mo16242j(bArr);
        }
        if (this.f19673a.mo13268k()) {
            this.f19674b.mo13476g().mo13497b(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo13322z() {
        C3768b.m25592f("FlutterActivityAndFragmentDelegate", "onResume()");
        m22840i();
        if (this.f19673a.mo13270m()) {
            this.f19674b.mo13478i().mo16228d();
        }
    }
}
