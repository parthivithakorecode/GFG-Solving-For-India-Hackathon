package p003a2;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: a2.f1 */
public final class C0069f1 {

    /* renamed from: a */
    private static final Uri f166a;

    /* renamed from: b */
    private static final Uri f167b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f166a = parse;
        f167b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m264a(String str) {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: b */
    public static Intent m265b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static Intent m266c() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
