package p125r2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p003a2.C0052c;
import p003a2.C0060d;
import p003a2.C0068f0;
import p003a2.C0070g;
import p003a2.C0074h0;
import p003a2.C0092o;
import p119q2.C3948f;
import p148v1.C4192a;
import p160x1.C4280b;
import p160x1.C4288j;
import p166y1.C4382f;

/* renamed from: r2.a */
public class C3977a extends C0070g<C3983g> implements C3948f {

    /* renamed from: R */
    public static final /* synthetic */ int f22134R = 0;

    /* renamed from: N */
    private final boolean f22135N = true;

    /* renamed from: O */
    private final C0060d f22136O;

    /* renamed from: P */
    private final Bundle f22137P;

    /* renamed from: Q */
    private final Integer f22138Q;

    public C3977a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z, @RecentlyNonNull C0060d dVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C4382f.C4383a aVar, @RecentlyNonNull C4382f.C4384b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f22136O = dVar;
        this.f22137P = bundle;
        this.f22138Q = dVar.mo207h();
    }

    @RecentlyNonNull
    /* renamed from: k0 */
    public static Bundle m26201k0(@RecentlyNonNull C0060d dVar) {
        dVar.mo206g();
        Integer h = dVar.mo207h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo200a());
        if (h != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: f */
    public final void mo15411f() {
        mo177h(new C0052c.C0056d());
    }

    /* renamed from: g */
    public final void mo15412g(C3982f fVar) {
        C0092o.m314j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f22136O.mo201b();
            ((C3983g) mo155C()).mo15445Z2(new C3986j(1, new C0068f0(b, ((Integer) C0092o.m313i(this.f22138Q)).intValue(), "<<default account>>".equals(b.name) ? C4192a.m26643a(mo193x()).mo15708b() : null)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.mo15444n4(new C3988l(1, new C4280b(8, (PendingIntent) null), (C0074h0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: i */
    public final int mo178i() {
        return C4288j.f22593a;
    }

    /* renamed from: p */
    public final boolean mo185p() {
        return this.f22135N;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo188s(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C3983g ? (C3983g) queryLocalInterface : new C3983g(iBinder);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: z */
    public final Bundle mo195z() {
        if (!mo193x().getPackageName().equals(this.f22136O.mo203d())) {
            this.f22137P.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f22136O.mo203d());
        }
        return this.f22137P;
    }
}
