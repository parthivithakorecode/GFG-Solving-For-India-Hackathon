package p066io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.core.content.res.C0624h;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1111n;
import java.util.List;
import p064i4.C2854h;
import p066io.flutter.embedding.android.C2906e;
import p066io.flutter.embedding.engine.C2961a;
import p066io.flutter.embedding.engine.C2973e;
import p066io.flutter.plugin.platform.C3000c;
import p099n3.C3768b;
import p162x3.C4349a;

/* renamed from: io.flutter.embedding.android.d */
public class C2904d extends Activity implements C2906e.C2909c, C1110m {

    /* renamed from: i */
    public static final int f19668i = C2854h.m22362d(61938);

    /* renamed from: f */
    protected C2906e f19669f;

    /* renamed from: g */
    private C1111n f19670g;

    /* renamed from: h */
    private final OnBackInvokedCallback f19671h;

    /* renamed from: io.flutter.embedding.android.d$a */
    class C2905a implements OnBackInvokedCallback {
        C2905a() {
        }

        public void onBackInvoked() {
            C2904d.this.onBackPressed();
        }
    }

    public C2904d() {
        this.f19671h = Build.VERSION.SDK_INT >= 33 ? new C2905a() : null;
        this.f19670g = new C1111n(this);
    }

    /* renamed from: D */
    private void m22794D() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    /* renamed from: E */
    private void m22795E() {
        if (mo13254G() == C2910f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: F */
    private View m22796F() {
        return this.f19669f.mo13314r((LayoutInflater) null, (ViewGroup) null, (Bundle) null, f19668i, mo13295x() == C2953v.surface);
    }

    /* renamed from: J */
    private Drawable m22797J() {
        try {
            Bundle I = mo13256I();
            int i = I != null ? I.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i != 0) {
                return C0624h.m2565d(getResources(), i, getTheme());
            }
            return null;
        } catch (Resources.NotFoundException e) {
            C3768b.m25588b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private boolean m22798K() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: N */
    private boolean m22799N(String str) {
        StringBuilder sb;
        String str2;
        C2906e eVar = this.f19669f;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else if (eVar.mo13309l()) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        C3768b.m25593g("FlutterActivity", sb.toString());
        return false;
    }

    /* renamed from: O */
    private void m22800O() {
        try {
            Bundle I = mo13256I();
            if (I != null) {
                int i = I.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i != -1) {
                    setTheme(i);
                    return;
                }
                return;
            }
            C3768b.m25592f("FlutterActivity", "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            C3768b.m25588b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: A */
    public C2956y mo13251A() {
        return mo13254G() == C2910f.opaque ? C2956y.opaque : C2956y.transparent;
    }

    /* renamed from: B */
    public void mo13252B(C2917i iVar) {
    }

    /* renamed from: C */
    public void mo13253C(C2961a aVar) {
        if (!this.f19669f.mo13310m()) {
            C4349a.m26974a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C2910f mo13254G() {
        return getIntent().hasExtra("background_mode") ? C2910f.valueOf(getIntent().getStringExtra("background_mode")) : C2910f.opaque;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C2961a mo13255H() {
        return this.f19669f.mo13308k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public Bundle mo13256I() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    /* renamed from: L */
    public void mo13257L() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f19671h);
        }
    }

    /* renamed from: M */
    public void mo13258M() {
        mo13259P();
        C2906e eVar = this.f19669f;
        if (eVar != null) {
            eVar.mo13304F();
            this.f19669f = null;
        }
    }

    /* renamed from: P */
    public void mo13259P() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f19671h);
        }
    }

    /* renamed from: a */
    public C1099i mo491a() {
        return this.f19670g;
    }

    /* renamed from: b */
    public boolean mo13260b() {
        return false;
    }

    /* renamed from: c */
    public void mo13261c() {
    }

    /* renamed from: d */
    public Activity mo13262d() {
        return this;
    }

    /* renamed from: e */
    public void mo13263e() {
        C3768b.m25593g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + mo13255H() + " evicted by another attaching activity");
        C2906e eVar = this.f19669f;
        if (eVar != null) {
            eVar.mo13315s();
            this.f19669f.mo13316t();
        }
    }

    /* renamed from: f */
    public void mo13264f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    /* renamed from: g */
    public String mo13265g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle I = mo13256I();
            if (I != null) {
                return I.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public Context getContext() {
        return this;
    }

    /* renamed from: j */
    public List<String> mo13267j() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    /* renamed from: k */
    public boolean mo13268k() {
        return true;
    }

    /* renamed from: l */
    public boolean mo13269l() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (mo13271n() != null || this.f19669f.mo13310m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    /* renamed from: m */
    public boolean mo13270m() {
        return true;
    }

    /* renamed from: n */
    public String mo13271n() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    /* renamed from: o */
    public boolean mo13272o() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : mo13271n() == null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (m22799N("onActivityResult")) {
            this.f19669f.mo13311o(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (m22799N("onBackPressed")) {
            this.f19669f.mo13313q();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m22800O();
        super.onCreate(bundle);
        C2906e eVar = new C2906e(this);
        this.f19669f = eVar;
        eVar.mo13312p(this);
        this.f19669f.mo13321y(bundle);
        this.f19670g.mo3835h(C1099i.C1101b.ON_CREATE);
        mo13257L();
        m22795E();
        setContentView(m22796F());
        m22794D();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (m22799N("onDestroy")) {
            this.f19669f.mo13315s();
            this.f19669f.mo13316t();
        }
        mo13258M();
        this.f19670g.mo3835h(C1099i.C1101b.ON_DESTROY);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m22799N("onNewIntent")) {
            this.f19669f.mo13317u(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (m22799N("onPause")) {
            this.f19669f.mo13318v();
        }
        this.f19670g.mo3835h(C1099i.C1101b.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (m22799N("onPostResume")) {
            this.f19669f.mo13319w();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (m22799N("onRequestPermissionsResult")) {
            this.f19669f.mo13320x(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f19670g.mo3835h(C1099i.C1101b.ON_RESUME);
        if (m22799N("onResume")) {
            this.f19669f.mo13322z();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m22799N("onSaveInstanceState")) {
            this.f19669f.mo13299A(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f19670g.mo3835h(C1099i.C1101b.ON_START);
        if (m22799N("onStart")) {
            this.f19669f.mo13300B();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (m22799N("onStop")) {
            this.f19669f.mo13301C();
        }
        this.f19670g.mo3835h(C1099i.C1101b.ON_STOP);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (m22799N("onTrimMemory")) {
            this.f19669f.mo13302D(i);
        }
    }

    public void onUserLeaveHint() {
        if (m22799N("onUserLeaveHint")) {
            this.f19669f.mo13303E();
        }
    }

    /* renamed from: p */
    public String mo13287p() {
        try {
            Bundle I = mo13256I();
            String string = I != null ? I.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    /* renamed from: q */
    public void mo13288q(C2961a aVar) {
    }

    /* renamed from: r */
    public String mo13289r() {
        try {
            Bundle I = mo13256I();
            if (I != null) {
                return I.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public C3000c mo13290s(Activity activity, C2961a aVar) {
        return new C3000c(mo13262d(), aVar.mo13482m(), this);
    }

    /* renamed from: t */
    public void mo13291t(C2914h hVar) {
    }

    /* renamed from: u */
    public String mo13292u() {
        String dataString;
        if (!m22798K() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    /* renamed from: v */
    public boolean mo13293v() {
        try {
            Bundle I = mo13256I();
            if (I != null) {
                return I.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: w */
    public C2973e mo13294w() {
        return C2973e.m23094a(getIntent());
    }

    /* renamed from: x */
    public C2953v mo13295x() {
        return mo13254G() == C2910f.opaque ? C2953v.surface : C2953v.texture;
    }

    /* renamed from: y */
    public C2955x mo13296y() {
        Drawable J = m22797J();
        if (J != null) {
            return new C2900b(J);
        }
        return null;
    }

    /* renamed from: z */
    public C2961a mo13297z(Context context) {
        return null;
    }
}
