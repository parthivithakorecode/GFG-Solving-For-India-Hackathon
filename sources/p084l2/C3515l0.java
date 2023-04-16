package p084l2;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l2.l0 */
final class C3515l0 implements C3481c2 {

    /* renamed from: a */
    private final Application f21122a;

    /* renamed from: b */
    private final C3507j0 f21123b;

    /* renamed from: c */
    private final Handler f21124c;

    /* renamed from: d */
    private final Executor f21125d;

    /* renamed from: e */
    private final C3565y1 f21126e;

    /* renamed from: f */
    private final C3510k f21127f;

    /* renamed from: g */
    private final C3551u f21128g;

    C3515l0(Application application, C3507j0 j0Var, Handler handler, Executor executor, C3565y1 y1Var, C3510k kVar, C3551u uVar) {
        this.f21122a = application;
        this.f21123b = j0Var;
        this.f21124c = handler;
        this.f21125d = executor;
        this.f21126e = y1Var;
        this.f21127f = kVar;
        this.f21128g = uVar;
    }

    /* renamed from: b */
    private static JSONObject m24917b(Context context) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
            if (applicationIcon == null) {
                str = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                str = valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14570a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            r7.hashCode()
            int r0 = r7.hashCode()
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1370505102: goto L_0x0032;
                case -278739366: goto L_0x0027;
                case 150940456: goto L_0x001c;
                case 1671672458: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r7 = r1
            goto L_0x003c
        L_0x0011:
            java.lang.String r0 = "dismiss"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r7 = r2
            goto L_0x003c
        L_0x001c:
            java.lang.String r0 = "browser"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0025
            goto L_0x000f
        L_0x0025:
            r7 = r3
            goto L_0x003c
        L_0x0027:
            java.lang.String r0 = "configure_app_assets"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0030
            goto L_0x000f
        L_0x0030:
            r7 = r5
            goto L_0x003c
        L_0x0032:
            java.lang.String r0 = "load_complete"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003b
            goto L_0x000f
        L_0x003b:
            r7 = r4
        L_0x003c:
            switch(r7) {
                case 0: goto L_0x010a;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            return r4
        L_0x0040:
            java.lang.String r7 = "status"
            java.lang.String r7 = r8.optString(r7)
            r7.hashCode()
            int r8 = r7.hashCode()
            switch(r8) {
                case -954325659: goto L_0x007d;
                case -258041904: goto L_0x0072;
                case 429411856: goto L_0x0067;
                case 467888915: goto L_0x005c;
                case 1666911234: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0087
        L_0x0051:
            java.lang.String r8 = "non_personalized"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x005a
            goto L_0x0087
        L_0x005a:
            r1 = 4
            goto L_0x0087
        L_0x005c:
            java.lang.String r8 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0065
            goto L_0x0087
        L_0x0065:
            r1 = r2
            goto L_0x0087
        L_0x0067:
            java.lang.String r8 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0070
            goto L_0x0087
        L_0x0070:
            r1 = r3
            goto L_0x0087
        L_0x0072:
            java.lang.String r8 = "personalized"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            r1 = r5
            goto L_0x0087
        L_0x007d:
            java.lang.String r8 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r1 = r4
        L_0x0087:
            switch(r1) {
                case 0: goto L_0x0099;
                case 1: goto L_0x009a;
                case 2: goto L_0x0097;
                case 3: goto L_0x009a;
                case 4: goto L_0x0099;
                default: goto L_0x008a;
            }
        L_0x008a:
            l2.u r7 = r6.f21128g
            l2.e2 r8 = new l2.e2
            java.lang.String r0 = "We are getting something wrong with the webview."
            r8.<init>(r5, r0)
            r7.mo14630h(r8)
            goto L_0x009f
        L_0x0097:
            r3 = r4
            goto L_0x009a
        L_0x0099:
            r3 = r5
        L_0x009a:
            l2.u r7 = r6.f21128g
            r7.mo14626d(r2, r3)
        L_0x009f:
            return r5
        L_0x00a0:
            java.lang.String r7 = "url"
            java.lang.String r7 = r8.optString(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r0 = "UserMessagingPlatform"
            if (r8 == 0) goto L_0x00b3
            java.lang.String r8 = "Action[browser]: empty url."
            android.util.Log.d(r0, r8)
        L_0x00b3:
            android.net.Uri r8 = android.net.Uri.parse(r7)
            java.lang.String r1 = r8.getScheme()
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = "Action[browser]: empty scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00ce
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00d4
        L_0x00ce:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00d4:
            android.util.Log.d(r0, r1)
        L_0x00d7:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00e4 }
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r8)     // Catch:{ ActivityNotFoundException -> 0x00e4 }
            l2.j0 r8 = r6.f21123b     // Catch:{ ActivityNotFoundException -> 0x00e4 }
            r8.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00e4 }
            goto L_0x00fe
        L_0x00e4:
            r8 = move-exception
            java.lang.String r0 = "Action[browser]: can not open url: "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r1 = r7.length()
            if (r1 == 0) goto L_0x00f6
            java.lang.String r7 = r0.concat(r7)
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
        L_0x00fb:
            p084l2.C3484d1.m24870a(r7, r8)
        L_0x00fe:
            return r5
        L_0x00ff:
            java.util.concurrent.Executor r7 = r6.f21125d
            l2.n0 r8 = new l2.n0
            r8.<init>(r6)
            r7.execute(r8)
            return r5
        L_0x010a:
            l2.u r7 = r6.f21128g
            r7.mo14629g()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p084l2.C3515l0.mo14570a(java.lang.String, org.json.JSONObject):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14602c(int i, String str, String str2) {
        this.f21128g.mo14627e(new C3489e2(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", new Object[]{Integer.valueOf(i), str2, str})));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14603d(String str) {
        String valueOf = String.valueOf(str);
        Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Receive consent action: ".concat(valueOf) : new String("Receive consent action: "));
        Uri parse = Uri.parse(str);
        this.f21126e.mo14635b(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.f21127f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo14604e() {
        this.f21128g.mo14625c().mo14581b("UMP_configureFormWithAppAssets", m24917b(this.f21122a));
    }

    public final Executor zza() {
        Handler handler = this.f21124c;
        handler.getClass();
        return C3528o0.m24934a(handler);
    }
}
