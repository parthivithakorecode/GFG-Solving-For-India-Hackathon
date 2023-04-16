package p159x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import androidx.core.content.C0604b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0152m;

/* renamed from: x0.b */
class C4277b implements C0145k.C0149c, C0152m {

    /* renamed from: a */
    private final Context f22566a;

    /* renamed from: b */
    private Activity f22567b;

    /* renamed from: c */
    private C0145k.C0150d f22568c;

    /* renamed from: x0.b$a */
    static class C4278a extends Exception {

        /* renamed from: f */
        final String f22569f;

        /* renamed from: g */
        final Object f22570g;

        /* renamed from: h */
        final String f22571h;

        C4278a(String str, String str2, Object obj) {
            this.f22571h = str;
            this.f22569f = str2;
            this.f22570g = obj;
        }
    }

    C4277b(Context context, Activity activity) {
        this.f22566a = context;
        this.f22567b = activity;
    }

    /* renamed from: b */
    private static Spanned m26813b(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    /* renamed from: c */
    private boolean m26814c(String str) {
        try {
            this.f22566a.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    private Intent m26815d(C0144j jVar) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        String str = "";
        if (jVar.mo334c("subject")) {
            String str2 = (String) jVar.mo332a("subject");
            if (str2 == null) {
                str2 = str;
            }
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (jVar.mo334c("body")) {
            String str3 = (String) jVar.mo332a("body");
            if (str3 != null) {
                str = str3;
            }
            CharSequence charSequence = str;
            if (jVar.mo334c("isHTML")) {
                charSequence = str;
                if (((Boolean) jVar.mo332a("isHTML")).booleanValue()) {
                    charSequence = m26813b(str);
                }
            }
            intent.putExtra("android.intent.extra.TEXT", charSequence);
        }
        if (jVar.mo334c("recipients")) {
            ArrayList arrayList = (ArrayList) jVar.mo332a("recipients");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            intent.putExtra("android.intent.extra.EMAIL", m26816e(arrayList));
        }
        if (jVar.mo334c("ccRecipients")) {
            ArrayList arrayList2 = (ArrayList) jVar.mo332a("ccRecipients");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            intent.putExtra("android.intent.extra.CC", m26816e(arrayList2));
        }
        if (jVar.mo334c("bccRecipients")) {
            ArrayList arrayList3 = (ArrayList) jVar.mo332a("bccRecipients");
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            intent.putExtra("android.intent.extra.BCC", m26816e(arrayList3));
        }
        if (jVar.mo334c("attachments")) {
            ArrayList arrayList4 = (ArrayList) jVar.mo332a("attachments");
            if (arrayList4 == null) {
                throw new C4278a("Attachments_null", "Attachments cannot be null", (Object) null);
            } else if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (int i = 0; i < arrayList4.size(); i++) {
                    intent.addFlags(1);
                    File file = new File((String) arrayList4.get(i));
                    arrayList5.add(C0604b.m2474f(this.f22566a, this.f22566a.getPackageName() + ".adv_provider", file));
                }
                intent.setAction("android.intent.action.SEND_MULTIPLE").setType("message/rfc822").putExtra("android.intent.extra.STREAM", arrayList5).addFlags(1);
            }
        }
        List<ResolveInfo> queryIntentActivities = this.f22566a.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            Log.e("FLUTTER_MAILER", "size is null or Zero");
            throw new C4278a("not_available", "no email Managers available", (Object) null);
        }
        if (queryIntentActivities.size() != 1 && jVar.mo334c("appSchema") && jVar.mo332a("appSchema") != null && m26814c((String) jVar.mo332a("appSchema"))) {
            intent.setPackage((String) jVar.mo332a("appSchema"));
        }
        return intent;
    }

    /* renamed from: e */
    private String[] m26816e(ArrayList<String> arrayList) {
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        return strArr;
    }

    /* renamed from: a */
    public boolean mo342a(int i, int i2, Intent intent) {
        C0145k.C0150d dVar;
        if (i == 564 && (dVar = this.f22568c) != null) {
            dVar.mo338a("android");
            this.f22568c = null;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15837f(Activity activity) {
        this.f22567b = activity;
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        if (jVar.f269a.equals("send")) {
            this.f22568c = dVar;
            try {
                this.f22567b.startActivityForResult(m26815d(jVar), 564);
                return;
            } catch (C4278a e) {
                dVar.mo339b(e.f22571h, e.f22569f, e.f22570g);
            } catch (Exception e2) {
                Log.e("FLUTTER_MAILER", e2.getMessage());
                dVar.mo339b("UNKNOWN", e2.getMessage(), (Object) null);
            }
        } else if (jVar.f269a.equals("isAppInstalled")) {
            dVar.mo338a((!jVar.mo334c("appSchema") || jVar.mo332a("appSchema") == null || !m26814c((String) jVar.mo332a("appSchema"))) ? Boolean.FALSE : Boolean.TRUE);
            return;
        } else {
            dVar.mo340c();
            return;
        }
        this.f22568c = null;
    }
}
