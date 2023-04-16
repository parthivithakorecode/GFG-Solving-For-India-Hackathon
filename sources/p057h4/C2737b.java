package p057h4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import p066io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: h4.b */
class C2737b {

    /* renamed from: a */
    private final Context f19303a;

    /* renamed from: b */
    private Activity f19304b;

    /* renamed from: h4.b$a */
    enum C2738a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    C2737b(Context context, Activity activity) {
        this.f19303a = context;
        this.f19304b = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo12766a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f19303a.getPackageManager());
        if (resolveActivity == null) {
            Log.i("UrlLauncher", "component name for " + str + " is null");
            return false;
        }
        Log.i("UrlLauncher", "component name for " + str + " is " + resolveActivity.toShortString());
        return !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12767b() {
        this.f19303a.sendBroadcast(new Intent(WebViewActivity.f20220j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2738a mo12768c(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Activity activity = this.f19304b;
        if (activity == null) {
            return C2738a.NO_ACTIVITY;
        }
        try {
            this.f19304b.startActivity(z ? WebViewActivity.m23618b(activity, str, z2, z3, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle));
            return C2738a.OK;
        } catch (ActivityNotFoundException unused) {
            return C2738a.ACTIVITY_NOT_FOUND;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12769d(Activity activity) {
        this.f19304b = activity;
    }
}
