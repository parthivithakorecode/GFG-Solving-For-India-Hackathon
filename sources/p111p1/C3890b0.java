package p111p1;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.nb3;
import com.google.android.gms.internal.ads.ym0;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

/* renamed from: p1.b0 */
final class C3890b0 implements nb3<C3905j> {

    /* renamed from: a */
    final /* synthetic */ ym0 f21979a;

    /* renamed from: b */
    final /* synthetic */ C3898f0 f21980b;

    C3890b0(C3898f0 f0Var, ym0 ym0) {
        this.f21980b = f0Var;
        this.f21979a = ym0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        C3905j jVar = (C3905j) obj;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10271E5)).booleanValue()) {
            try {
                this.f21979a.mo10284s("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                io0.m11128d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
        } else if (jVar == null) {
            try {
                this.f21979a.mo10283E2((String) null, (String) null, (Bundle) null);
                C3898f0.m26030b6(this.f21980b, "sgs", "rid", "-1");
            } catch (RemoteException e2) {
                io0.m11129e("", e2);
            }
        } else {
            try {
                String optString = new JSONObject(jVar.f22038b).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    io0.m11131g("The request ID is empty in request JSON.");
                    this.f21979a.mo10284s("Internal error: request ID is empty in request JSON.");
                    C3898f0.m26030b6(this.f21980b, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10582p5)).booleanValue()) {
                    this.f21980b.f22010p.mo15371c(optString, jVar.f22038b);
                }
                Bundle bundle = jVar.f22039c;
                if (this.f21980b.f22017w && bundle != null && bundle.getInt(this.f21980b.f22019y, -1) == -1) {
                    bundle.putInt(this.f21980b.f22019y, this.f21980b.f22020z.get());
                }
                if (this.f21980b.f22016v && bundle != null && TextUtils.isEmpty(bundle.getString(this.f21980b.f22018x))) {
                    if (TextUtils.isEmpty(this.f21980b.f21998B)) {
                        this.f21980b.f21998B = C2694t.m21608q().mo14022L(this.f21980b.f22001g, this.f21980b.f21997A.f12729f);
                    }
                    bundle.putString(this.f21980b.f22018x, this.f21980b.f21998B);
                }
                this.f21979a.mo10283E2(jVar.f22037a, jVar.f22038b, bundle);
                C3898f0.m26030b6(this.f21980b, "sgs", "rid", optString);
            } catch (JSONException e3) {
                io0.m11131g("Failed to create JSON object from the request string.");
                ym0 ym0 = this.f21979a;
                String obj2 = e3.toString();
                StringBuilder sb = new StringBuilder(obj2.length() + 33);
                sb.append("Internal error for request JSON: ");
                sb.append(obj2);
                ym0.mo10284s(sb.toString());
                C3898f0.m26030b6(this.f21980b, "sgf", "sgf_reason", "request_invalid");
            }
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        String message = th.getMessage();
        C2694t.m21607p().mo11034s(th, "SignalGeneratorImpl.generateSignals");
        C3898f0.m26030b6(this.f21980b, "sgf", "sgf_reason", message);
        try {
            ym0 ym0 = this.f21979a;
            String valueOf = String.valueOf(message);
            ym0.mo10284s(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
