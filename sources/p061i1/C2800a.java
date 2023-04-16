package p061i1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3202r1;

/* renamed from: i1.a */
public final class C2800a {
    /* renamed from: a */
    public static final boolean m22246a(Context context, Intent intent, C2826y yVar, C2824w wVar, boolean z) {
        if (z) {
            return m22248c(context, intent.getData(), yVar, wVar);
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            C3202r1.m24015k(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            C2694t.m21608q();
            C3163g2.m23941q(context, intent);
            if (yVar != null) {
                yVar.mo5490e();
            }
            if (wVar != null) {
                wVar.mo6079c(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            io0.m11131g(e.getMessage());
            if (wVar != null) {
                wVar.mo6079c(false);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m22247b(Context context, C2807f fVar, C2826y yVar, C2824w wVar) {
        String str;
        int i = 0;
        if (fVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            m10.m13007c(context);
            Intent intent = fVar.f19475m;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(fVar.f19469g)) {
                    str = "Open GMSG did not contain a URL.";
                } else {
                    if (!TextUtils.isEmpty(fVar.f19470h)) {
                        intent.setDataAndType(Uri.parse(fVar.f19469g), fVar.f19470h);
                    } else {
                        intent.setData(Uri.parse(fVar.f19469g));
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(fVar.f19471i)) {
                        intent.setPackage(fVar.f19471i);
                    }
                    if (!TextUtils.isEmpty(fVar.f19472j)) {
                        String[] split = fVar.f19472j.split("/", 2);
                        if (split.length < 2) {
                            String valueOf = String.valueOf(fVar.f19472j);
                            io0.m11131g(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                            return false;
                        }
                        intent.setClassName(split[0], split[1]);
                    }
                    String str2 = fVar.f19473k;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            io0.m11131g("Could not parse intent flags.");
                        }
                        intent.addFlags(i);
                    }
                    if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10454b3)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10445a3)).booleanValue()) {
                            C2694t.m21608q();
                            C3163g2.m23922c0(context, intent);
                        }
                    }
                }
            }
            return m22246a(context, intent, yVar, wVar, fVar.f19477o);
        }
        io0.m11131g(str);
        return false;
    }

    /* renamed from: c */
    private static final boolean m22248c(Context context, Uri uri, C2826y yVar, C2824w wVar) {
        int i;
        try {
            i = C2694t.m21608q().mo14033a0(context, uri);
            if (yVar != null) {
                yVar.mo5490e();
            }
        } catch (ActivityNotFoundException e) {
            io0.m11131g(e.getMessage());
            i = 6;
        }
        if (wVar != null) {
            wVar.mo6078E(i);
        }
        return i == 5;
    }
}
