package p069j1;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.ty1;
import com.google.android.gms.internal.ads.uy1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
import p034e2.C2553j;
import p054h1.C2694t;

/* renamed from: j1.c0 */
public final class C3145c0 {

    /* renamed from: a */
    private final Object f20443a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private String f20444b = "";
    @GuardedBy("lock")

    /* renamed from: c */
    private String f20445c = "";
    @GuardedBy("lock")

    /* renamed from: d */
    private boolean f20446d = false;
    @GuardedBy("lock")

    /* renamed from: e */
    private boolean f20447e = false;

    /* renamed from: f */
    protected String f20448f = "";

    /* renamed from: g */
    private uy1 f20449g;

    /* renamed from: o */
    protected static final String m23840o(Context context, String str, String str2) {
        String str3;
        Throwable e;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C2694t.m21608q().mo14022L(context, str2));
        cc3<String> b = new C3210u0(context).mo14109b(0, str, hashMap, (byte[]) null);
        try {
            return b.get((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10571o3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str4 = String.valueOf(str);
            str5 = "Timeout while retrieving a response from: ";
            if (str4.length() == 0) {
                str3 = new String(str5);
                io0.m11129e(str3, e);
                b.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            io0.m11129e(str3, e);
            b.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str4 = String.valueOf(str);
            str5 = "Interrupted while retrieving a response from: ";
            if (str4.length() == 0) {
                str3 = new String(str5);
                io0.m11129e(str3, e);
                b.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            io0.m11129e(str3, e);
            b.cancel(true);
            return null;
        } catch (Exception e4) {
            String valueOf = String.valueOf(str);
            io0.m11129e(valueOf.length() != 0 ? "Error retrieving a response from: ".concat(valueOf) : new String("Error retrieving a response from: "), e4);
            return null;
        }
    }

    /* renamed from: p */
    private final Uri m23841p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f20443a) {
            if (TextUtils.isEmpty(this.f20444b)) {
                C2694t.m21608q();
                try {
                    str5 = new String(C2553j.m21205d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    io0.m11126b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f20444b = str5;
                if (TextUtils.isEmpty(str5)) {
                    C2694t.m21608q();
                    this.f20444b = UUID.randomUUID().toString();
                    C2694t.m21608q();
                    String str6 = this.f20444b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        io0.m11129e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f20444b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    public final uy1 mo13978a() {
        return this.f20449g;
    }

    /* renamed from: b */
    public final String mo13979b() {
        String str;
        synchronized (this.f20443a) {
            str = this.f20445c;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo13980c(Context context) {
        uy1 uy1;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue() && (uy1 = this.f20449g) != null) {
            uy1.mo11336g(new C3221y(this, context), ty1.DEBUG_MENU);
        }
    }

    /* renamed from: d */
    public final void mo13981d(Context context, String str, String str2) {
        C2694t.m21608q();
        C3163g2.m23949y(context, m23841p(context, (String) C2199sw.m17001c().mo8579b(m10.f10535k3), str, str2));
    }

    /* renamed from: e */
    public final void mo13982e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m23841p(context, (String) C2199sw.m17001c().mo8579b(m10.f10562n3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C2694t.m21608q();
        C3163g2.m23939o(context, str, buildUpon.build().toString());
    }

    /* renamed from: f */
    public final void mo13983f(boolean z) {
        synchronized (this.f20443a) {
            this.f20447e = z;
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue()) {
                C2694t.m21607p().mo11025h().mo14099t(z);
                uy1 uy1 = this.f20449g;
                if (uy1 != null) {
                    uy1.mo11338i(z);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo13984g(uy1 uy1) {
        this.f20449g = uy1;
    }

    /* renamed from: h */
    public final void mo13985h(boolean z) {
        synchronized (this.f20443a) {
            this.f20446d = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo13986i(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            io0.m11130f("Can not create dialog without Activity Context");
        } else {
            C3163g2.f20465i.post(new C3137a0(this, context, str, z, z2));
        }
    }

    /* renamed from: j */
    public final boolean mo13987j(Context context, String str, String str2) {
        String o = m23840o(context, m23841p(context, (String) C2199sw.m17001c().mo8579b(m10.f10553m3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            io0.m11126b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o.trim()).optString("debug_mode"));
            mo13983f(equals);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue()) {
                C3208t1 h = C2694t.m21607p().mo11025h();
                if (true != equals) {
                    str = "";
                }
                h.mo14096q(str);
            }
            return equals;
        } catch (JSONException e) {
            io0.m11132h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13988k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.e10<java.lang.String> r0 = com.google.android.gms.internal.ads.m10.f10544l3
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.m23841p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = m23840o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.io0.m11126b(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            r3.f20448f = r6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.m10.f10360P6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ JSONException -> 0x0083 }
            java.lang.Object r6 = r1.mo8579b(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0083 }
            r1 = 1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f20448f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f20448f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = r0
            goto L_0x0067
        L_0x0066:
            r6 = r1
        L_0x0067:
            r3.mo13983f(r6)     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.tn0 r2 = p054h1.C2694t.m21607p()     // Catch:{ JSONException -> 0x0083 }
            j1.t1 r2 = r2.mo11025h()     // Catch:{ JSONException -> 0x0083 }
            if (r1 == r6) goto L_0x0076
            java.lang.String r5 = ""
        L_0x0076:
            r2.mo14096q(r5)     // Catch:{ JSONException -> 0x0083 }
        L_0x0079:
            java.lang.Object r5 = r3.f20443a
            monitor-enter(r5)
            r3.f20445c = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x0080:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r4
        L_0x0083:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.io0.m11132h(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3145c0.mo13988k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: l */
    public final boolean mo13989l() {
        boolean z;
        synchronized (this.f20443a) {
            z = this.f20447e;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo13990m() {
        boolean z;
        synchronized (this.f20443a) {
            z = this.f20446d;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo13991n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !mo13990m()) {
            return false;
        }
        io0.m11126b("Sending troubleshooting signals to the server.");
        mo13982e(context, str, str2, str3);
        return true;
    }
}
