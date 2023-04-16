package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0221h;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0228d;
import androidx.activity.result.C0232e;
import androidx.core.app.C0539b;
import androidx.lifecycle.C1098h0;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1103i0;
import androidx.lifecycle.C1111n;
import androidx.loader.app.C1136a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024d.C2464b;
import p046g0.C2623c;

/* renamed from: androidx.fragment.app.e */
public class C0990e extends ComponentActivity implements C0539b.C0543d, C0539b.C0545f {

    /* renamed from: v */
    final C1004i f2666v = C1004i.m4139b(new C0993c());

    /* renamed from: w */
    final C1111n f2667w = new C1111n(this);

    /* renamed from: x */
    boolean f2668x;

    /* renamed from: y */
    boolean f2669y;

    /* renamed from: z */
    boolean f2670z = true;

    /* renamed from: androidx.fragment.app.e$a */
    class C0991a implements C2623c.C2626c {
        C0991a() {
        }

        /* renamed from: a */
        public Bundle mo534a() {
            Bundle bundle = new Bundle();
            C0990e.this.mo3471z();
            C0990e.this.f2667w.mo3835h(C1099i.C1101b.ON_STOP);
            Parcelable x = C0990e.this.f2666v.mo3527x();
            if (x != null) {
                bundle.putParcelable("android:support:fragments", x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class C0992b implements C2464b {
        C0992b() {
        }

        /* renamed from: a */
        public void mo533a(Context context) {
            C0990e.this.f2666v.mo3505a((Fragment) null);
            Bundle b = C0990e.this.mo496i().mo12508b("android:support:fragments");
            if (b != null) {
                C0990e.this.f2666v.mo3526w(b.getParcelable("android:support:fragments"));
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class C0993c extends C1006k<C0990e> implements C1103i0, C0221h, C0232e, C1035r {
        public C0993c() {
            super(C0990e.this);
        }

        /* renamed from: a */
        public C1099i mo491a() {
            return C0990e.this.f2667w;
        }

        /* renamed from: b */
        public void mo3472b(C1011n nVar, Fragment fragment) {
            C0990e.this.mo3459B(fragment);
        }

        /* renamed from: d */
        public View mo3350d(int i) {
            return C0990e.this.findViewById(i);
        }

        /* renamed from: e */
        public boolean mo3351e() {
            Window window = C0990e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: g */
        public C0228d mo494g() {
            return C0990e.this.mo494g();
        }

        /* renamed from: h */
        public OnBackPressedDispatcher mo495h() {
            return C0990e.this.mo495h();
        }

        /* renamed from: k */
        public C1098h0 mo497k() {
            return C0990e.this.mo497k();
        }

        /* renamed from: n */
        public LayoutInflater mo3474n() {
            return C0990e.this.getLayoutInflater().cloneInContext(C0990e.this);
        }

        /* renamed from: o */
        public boolean mo3475o(Fragment fragment) {
            return !C0990e.this.isFinishing();
        }

        /* renamed from: p */
        public void mo3476p() {
            C0990e.this.mo628E();
        }

        /* renamed from: q */
        public C0990e mo3473m() {
            return C0990e.this;
        }
    }

    public C0990e() {
        m4107y();
    }

    /* renamed from: A */
    private static boolean m4106A(C1011n nVar, C1099i.C1102c cVar) {
        boolean z = false;
        for (Fragment next : nVar.mo3618r0()) {
            if (next != null) {
                if (next.mo3341y() != null) {
                    z |= m4106A(next.mo3313p(), cVar);
                }
                C0955a0 a0Var = next.f2487Y;
                if (a0Var != null && a0Var.mo491a().mo3831b().mo3834b(C1099i.C1102c.STARTED)) {
                    next.f2487Y.mo3381j(cVar);
                    z = true;
                }
                if (next.f2486X.mo3831b().mo3834b(C1099i.C1102c.STARTED)) {
                    next.f2486X.mo3837o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: y */
    private void m4107y() {
        mo496i().mo12513h("android:support:fragments", new C0991a());
        mo515p(new C0992b());
    }

    @Deprecated
    /* renamed from: B */
    public void mo3459B(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: C */
    public boolean mo3460C(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo3461D() {
        this.f2667w.mo3835h(C1099i.C1101b.ON_RESUME);
        this.f2666v.mo3519p();
    }

    @Deprecated
    /* renamed from: E */
    public void mo628E() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: b */
    public final void mo2393b(int i) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2668x);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2669y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2670z);
        if (getApplication() != null) {
            C1136a.m4639b(this).mo3883a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2666v.mo3523t().mo3587W(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2666v.mo3524u();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2666v.mo3524u();
        super.onConfigurationChanged(configuration);
        this.f2666v.mo3507d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2667w.mo3835h(C1099i.C1101b.ON_CREATE);
        this.f2666v.mo3509f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f2666v.mo3510g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View w = mo3469w(view, str, context, attributeSet);
        return w == null ? super.onCreateView(view, str, context, attributeSet) : w;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View w = mo3469w((View) null, str, context, attributeSet);
        return w == null ? super.onCreateView(str, context, attributeSet) : w;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2666v.mo3511h();
        this.f2667w.mo3835h(C1099i.C1101b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2666v.mo3512i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2666v.mo3514k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2666v.mo3508e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2666v.mo3513j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f2666v.mo3524u();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2666v.mo3515l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2669y = false;
        this.f2666v.mo3516m();
        this.f2667w.mo3835h(C1099i.C1101b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2666v.mo3517n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3461D();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? mo3460C(view, menu) | this.f2666v.mo3518o(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2666v.mo3524u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f2666v.mo3524u();
        super.onResume();
        this.f2669y = true;
        this.f2666v.mo3522s();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f2666v.mo3524u();
        super.onStart();
        this.f2670z = false;
        if (!this.f2668x) {
            this.f2668x = true;
            this.f2666v.mo3506c();
        }
        this.f2666v.mo3522s();
        this.f2667w.mo3835h(C1099i.C1101b.ON_START);
        this.f2666v.mo3520q();
    }

    public void onStateNotSaved() {
        this.f2666v.mo3524u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f2670z = true;
        mo3471z();
        this.f2666v.mo3521r();
        this.f2667w.mo3835h(C1099i.C1101b.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final View mo3469w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2666v.mo3525v(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public C1011n mo3470x() {
        return this.f2666v.mo3523t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3471z() {
        do {
        } while (m4106A(mo3470x(), C1099i.C1102c.CREATED));
    }
}
