package p054h1;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C1605cv;
import com.google.android.gms.internal.ads.dt2;
import com.google.android.gms.internal.ads.io0;

/* renamed from: h1.m */
final class C2687m extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C2693s f19144a;

    C2687m(C2693s sVar) {
        this.f19144a = sVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f19144a.f19160l != null) {
            try {
                this.f19144a.f19160l.mo7164w(dt2.m8099d(1, (String) null, (C1605cv) null));
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
        if (this.f19144a.f19160l != null) {
            try {
                this.f19144a.f19160l.mo7157C(0);
            } catch (RemoteException e2) {
                io0.m11133i("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f19144a.mo12695r())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f19144a.f19160l != null) {
                try {
                    this.f19144a.f19160l.mo7164w(dt2.m8099d(3, (String) null, (C1605cv) null));
                } catch (RemoteException e) {
                    io0.m11133i("#007 Could not call remote method.", e);
                }
            }
            if (this.f19144a.f19160l != null) {
                try {
                    this.f19144a.f19160l.mo7157C(3);
                } catch (RemoteException e2) {
                    io0.m11133i("#007 Could not call remote method.", e2);
                }
            }
            this.f19144a.mo12697z5(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f19144a.f19160l != null) {
                try {
                    this.f19144a.f19160l.mo7164w(dt2.m8099d(1, (String) null, (C1605cv) null));
                } catch (RemoteException e3) {
                    io0.m11133i("#007 Could not call remote method.", e3);
                }
            }
            if (this.f19144a.f19160l != null) {
                try {
                    this.f19144a.f19160l.mo7157C(0);
                } catch (RemoteException e4) {
                    io0.m11133i("#007 Could not call remote method.", e4);
                }
            }
            this.f19144a.mo12697z5(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.f19144a.f19160l != null) {
                try {
                    this.f19144a.f19160l.mo7162h();
                } catch (RemoteException e5) {
                    io0.m11133i("#007 Could not call remote method.", e5);
                }
            }
            this.f19144a.mo12697z5(this.f19144a.mo12696s(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f19144a.f19160l != null) {
                try {
                    this.f19144a.f19160l.mo7158c();
                    this.f19144a.f19160l.mo7160f();
                } catch (RemoteException e6) {
                    io0.m11133i("#007 Could not call remote method.", e6);
                }
            }
            C2693s.m21546I5(this.f19144a, C2693s.m21543F5(this.f19144a, str));
            return true;
        }
    }
}
