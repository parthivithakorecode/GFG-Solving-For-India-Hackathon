package p111p1;

import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.nb3;
import p054h1.C2694t;

/* renamed from: p1.e0 */
final class C3896e0 implements nb3<C3905j> {

    /* renamed from: a */
    final /* synthetic */ C3898f0 f21988a;

    C3896e0(C3898f0 f0Var) {
        this.f21988a = f0Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo5436a(Object obj) {
        C3905j jVar = (C3905j) obj;
        io0.m11126b("Initialized webview successfully for SDKCore.");
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        C2694t.m21607p().mo11034s(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        C3898f0.m26030b6(this.f21988a, "sgf", "sgf_reason", th.getMessage());
        io0.m11129e("Failed to initialize webview for loading SDKCore. ", th);
    }
}
