package p084l2;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p137t2.C4063b;
import p137t2.C4070e;
import p137t2.C4071f;

/* renamed from: l2.u */
public final class C3551u implements C4063b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Application f21210a;

    /* renamed from: b */
    private final C3477c f21211b;

    /* renamed from: c */
    private final C3507j0 f21212c;

    /* renamed from: d */
    private final C3518m f21213d;

    /* renamed from: e */
    private final C3483d0 f21214e;

    /* renamed from: f */
    private final C3556v1<C3495g0> f21215f;

    /* renamed from: g */
    private Dialog f21216g;

    /* renamed from: h */
    private C3495g0 f21217h;

    /* renamed from: i */
    private final AtomicBoolean f21218i = new AtomicBoolean();

    /* renamed from: j */
    private final AtomicReference<C3563y> f21219j = new AtomicReference<>();

    /* renamed from: k */
    private final AtomicReference<C4063b.C4064a> f21220k = new AtomicReference<>();

    /* renamed from: l */
    private final AtomicReference<C3566z> f21221l = new AtomicReference<>();

    public C3551u(Application application, C3477c cVar, C3507j0 j0Var, C3518m mVar, C3483d0 d0Var, C3556v1<C3495g0> v1Var) {
        this.f21210a = application;
        this.f21211b = cVar;
        this.f21212c = j0Var;
        this.f21213d = mVar;
        this.f21214e = d0Var;
        this.f21215f = v1Var;
    }

    /* renamed from: j */
    private final void m24947j() {
        Dialog dialog = this.f21216g;
        if (dialog != null) {
            dialog.dismiss();
            this.f21216g = null;
        }
        this.f21212c.mo14593a((Activity) null);
        C3566z andSet = this.f21221l.getAndSet((Object) null);
        if (andSet != null) {
            andSet.m24972a();
        }
    }

    /* renamed from: a */
    public final void mo14624a(Activity activity, C4063b.C4064a aVar) {
        C3496g1.m24889a();
        if (!this.f21218i.compareAndSet(false, true)) {
            aVar.mo12403a(new C3489e2(3, "ConsentForm#show can only be invoked once.").mo14578a());
            return;
        }
        C3566z zVar = new C3566z(this, activity);
        this.f21210a.registerActivityLifecycleCallbacks(zVar);
        this.f21221l.set(zVar);
        this.f21212c.mo14593a(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.f21217h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.mo12403a(new C3489e2(3, "Activity with null windows is passed in.").mo14578a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.f21220k.set(aVar);
        dialog.show();
        this.f21216g = dialog;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3495g0 mo14625c() {
        return this.f21217h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14626d(int i, int i2) {
        m24947j();
        C4063b.C4064a andSet = this.f21220k.getAndSet((Object) null);
        if (andSet != null) {
            this.f21213d.mo14608b(3);
            this.f21213d.mo14610d(i2);
            andSet.mo12403a((C4070e) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo14627e(C3489e2 e2Var) {
        C3563y andSet = this.f21219j.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo12402b(e2Var.mo14578a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14628f(C4071f.C4073b bVar, C4071f.C4072a aVar) {
        C3495g0 zza = this.f21215f.zza();
        this.f21217h = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new C3499h0(zza));
        this.f21219j.set(new C3563y(bVar, aVar));
        this.f21217h.loadDataWithBaseURL(this.f21214e.mo14572a(), this.f21214e.mo14573b(), "text/html", "UTF-8", (String) null);
        C3496g1.f21065a.postDelayed(new C3560x(this), 10000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14629g() {
        C3563y andSet = this.f21219j.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo12401a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo14630h(C3489e2 e2Var) {
        m24947j();
        C4063b.C4064a andSet = this.f21220k.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo12403a(e2Var.mo14578a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo14631i() {
        mo14627e(new C3489e2(4, "Web view timed out."));
    }
}
