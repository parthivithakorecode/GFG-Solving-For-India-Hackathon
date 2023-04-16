package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1106j0;
import androidx.lifecycle.C1108k0;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1118t;
import p046g0.C2630f;

/* renamed from: androidx.fragment.app.d */
public class C0983d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: g0 */
    private Handler f2644g0;

    /* renamed from: h0 */
    private Runnable f2645h0 = new C0984a();

    /* renamed from: i0 */
    private DialogInterface.OnCancelListener f2646i0 = new C0985b();
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public DialogInterface.OnDismissListener f2647j0 = new C0986c();

    /* renamed from: k0 */
    private int f2648k0 = 0;

    /* renamed from: l0 */
    private int f2649l0 = 0;

    /* renamed from: m0 */
    private boolean f2650m0 = true;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public boolean f2651n0 = true;

    /* renamed from: o0 */
    private int f2652o0 = -1;

    /* renamed from: p0 */
    private boolean f2653p0;

    /* renamed from: q0 */
    private C1118t<C1110m> f2654q0 = new C0987d();
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public Dialog f2655r0;

    /* renamed from: s0 */
    private boolean f2656s0;

    /* renamed from: t0 */
    private boolean f2657t0;

    /* renamed from: u0 */
    private boolean f2658u0;

    /* renamed from: v0 */
    private boolean f2659v0 = false;

    /* renamed from: androidx.fragment.app.d$a */
    class C0984a implements Runnable {
        C0984a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C0983d.this.f2647j0.onDismiss(C0983d.this.f2655r0);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class C0985b implements DialogInterface.OnCancelListener {
        C0985b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (C0983d.this.f2655r0 != null) {
                C0983d dVar = C0983d.this;
                dVar.onCancel(dVar.f2655r0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class C0986c implements DialogInterface.OnDismissListener {
        C0986c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (C0983d.this.f2655r0 != null) {
                C0983d dVar = C0983d.this;
                dVar.onDismiss(dVar.f2655r0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    class C0987d implements C1118t<C1110m> {
        C0987d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo3456a(C1110m mVar) {
            if (mVar != null && C0983d.this.f2651n0) {
                View k1 = C0983d.this.mo3298k1();
                if (k1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C0983d.this.f2655r0 != null) {
                    if (C1011n.m4190E0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + C0983d.this.f2655r0);
                    }
                    C0983d.this.f2655r0.setContentView(k1);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class C0988e extends C1002g {

        /* renamed from: a */
        final /* synthetic */ C1002g f2664a;

        C0988e(C1002g gVar) {
            this.f2664a = gVar;
        }

        /* renamed from: d */
        public View mo3350d(int i) {
            return this.f2664a.mo3351e() ? this.f2664a.mo3350d(i) : C0983d.this.mo3446G1(i);
        }

        /* renamed from: e */
        public boolean mo3351e() {
            return this.f2664a.mo3351e() || C0983d.this.mo3447H1();
        }
    }

    /* renamed from: D1 */
    private void m4081D1(boolean z, boolean z2) {
        if (!this.f2657t0) {
            this.f2657t0 = true;
            this.f2658u0 = false;
            Dialog dialog = this.f2655r0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f2655r0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f2644g0.getLooper()) {
                        onDismiss(this.f2655r0);
                    } else {
                        this.f2644g0.post(this.f2645h0);
                    }
                }
            }
            this.f2656s0 = true;
            if (this.f2652o0 >= 0) {
                mo3226D().mo3582S0(this.f2652o0, 1);
                this.f2652o0 = -1;
                return;
            }
            C1043w l = mo3226D().mo3611l();
            l.mo3361k(this);
            if (z) {
                l.mo3358g();
            } else {
                l.mo3357f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: I1 */
    private void m4082I1(Bundle bundle) {
        if (this.f2651n0 && !this.f2659v0) {
            try {
                this.f2653p0 = true;
                Dialog F1 = mo3445F1(bundle);
                this.f2655r0 = F1;
                if (this.f2651n0) {
                    mo3449K1(F1, this.f2648k0);
                    Context q = mo3316q();
                    if (q instanceof Activity) {
                        this.f2655r0.setOwnerActivity((Activity) q);
                    }
                    this.f2655r0.setCancelable(this.f2650m0);
                    this.f2655r0.setOnCancelListener(this.f2646i0);
                    this.f2655r0.setOnDismissListener(this.f2647j0);
                    this.f2659v0 = true;
                } else {
                    this.f2655r0 = null;
                }
                this.f2653p0 = false;
            } catch (Throwable th) {
                this.f2653p0 = false;
                throw th;
            }
        }
    }

    /* renamed from: E1 */
    public int mo3444E1() {
        return this.f2649l0;
    }

    /* renamed from: F0 */
    public void mo3231F0(Bundle bundle) {
        super.mo3231F0(bundle);
        Dialog dialog = this.f2655r0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f2648k0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2649l0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2650m0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2651n0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2652o0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: F1 */
    public Dialog mo3445F1(Bundle bundle) {
        if (C1011n.m4190E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(mo3296j1(), mo3444E1());
    }

    /* renamed from: G0 */
    public void mo3233G0() {
        super.mo3233G0();
        Dialog dialog = this.f2655r0;
        if (dialog != null) {
            this.f2656s0 = false;
            dialog.show();
            View decorView = this.f2655r0.getWindow().getDecorView();
            C1106j0.m4574a(decorView, this);
            C1108k0.m4576a(decorView, this);
            C2630f.m21350a(decorView, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public View mo3446G1(int i) {
        Dialog dialog = this.f2655r0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* renamed from: H0 */
    public void mo3235H0() {
        super.mo3235H0();
        Dialog dialog = this.f2655r0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public boolean mo3447H1() {
        return this.f2659v0;
    }

    /* renamed from: J0 */
    public void mo3239J0(Bundle bundle) {
        Bundle bundle2;
        super.mo3239J0(bundle);
        if (this.f2655r0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2655r0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: J1 */
    public void mo3448J1(boolean z) {
        this.f2651n0 = z;
    }

    /* renamed from: K1 */
    public void mo3449K1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: L1 */
    public void mo3450L1(C1011n nVar, String str) {
        this.f2657t0 = false;
        this.f2658u0 = true;
        C1043w l = nVar.mo3611l();
        l.mo3727d(this, str);
        l.mo3357f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3253Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3253Q0(layoutInflater, viewGroup, bundle);
        if (this.f2475M == null && this.f2655r0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2655r0.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1002g mo3275c() {
        return new C0988e(super.mo3275c());
    }

    /* renamed from: g0 */
    public void mo3287g0(Context context) {
        super.mo3287g0(context);
        mo3254R().mo3784e(this.f2654q0);
        if (!this.f2658u0) {
            this.f2657t0 = false;
        }
    }

    /* renamed from: j0 */
    public void mo3295j0(Bundle bundle) {
        super.mo3295j0(bundle);
        this.f2644g0 = new Handler();
        this.f2651n0 = this.f2465C == 0;
        if (bundle != null) {
            this.f2648k0 = bundle.getInt("android:style", 0);
            this.f2649l0 = bundle.getInt("android:theme", 0);
            this.f2650m0 = bundle.getBoolean("android:cancelable", true);
            this.f2651n0 = bundle.getBoolean("android:showsDialog", this.f2651n0);
            this.f2652o0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2656s0) {
            if (C1011n.m4190E0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m4081D1(true, true);
        }
    }

    /* renamed from: q0 */
    public void mo3317q0() {
        super.mo3317q0();
        Dialog dialog = this.f2655r0;
        if (dialog != null) {
            this.f2656s0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f2655r0.dismiss();
            if (!this.f2657t0) {
                onDismiss(this.f2655r0);
            }
            this.f2655r0 = null;
            this.f2659v0 = false;
        }
    }

    /* renamed from: r0 */
    public void mo3320r0() {
        super.mo3320r0();
        if (!this.f2658u0 && !this.f2657t0) {
            this.f2657t0 = true;
        }
        mo3254R().mo3788i(this.f2654q0);
    }

    /* renamed from: s0 */
    public LayoutInflater mo3323s0(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater s0 = super.mo3323s0(bundle);
        if (!this.f2651n0 || this.f2653p0) {
            if (C1011n.m4190E0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f2651n0) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return s0;
        }
        m4082I1(bundle);
        if (C1011n.m4190E0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f2655r0;
        return dialog != null ? s0.cloneInContext(dialog.getContext()) : s0;
    }
}
