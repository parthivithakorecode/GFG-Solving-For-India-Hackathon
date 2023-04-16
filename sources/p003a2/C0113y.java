package p003a2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p009os.C0681f;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2551h;
import p041f2.C2606c;
import p102o.C3814g;
import p154w1.C4264b;
import p160x1.C4287i;
import p160x1.C4290l;

/* renamed from: a2.y */
public final class C0113y {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C3814g<String, String> f230a = new C3814g<>();
    @GuardedBy("sCache")

    /* renamed from: b */
    private static Locale f231b;

    /* renamed from: a */
    public static String m348a(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4264b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C4264b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C4264b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m356i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m356i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m356i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m356i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    /* renamed from: b */
    public static String m349b(Context context, int i) {
        String i2 = i == 6 ? m356i(context, "common_google_play_services_resolution_required_title") : m348a(context, i);
        return i2 == null ? context.getResources().getString(C4264b.common_google_play_services_notification_ticker) : i2;
    }

    /* renamed from: c */
    public static String m350c(Context context, int i) {
        Resources resources = context.getResources();
        String f = m353f(context);
        if (i == 1) {
            return resources.getString(C4264b.common_google_play_services_install_text, new Object[]{f});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C4264b.common_google_play_services_enable_text, new Object[]{f});
            } else if (i == 5) {
                return m355h(context, "common_google_play_services_invalid_account_text", f);
            } else {
                if (i == 7) {
                    return m355h(context, "common_google_play_services_network_error_text", f);
                }
                if (i == 9) {
                    return resources.getString(C4264b.common_google_play_services_unsupported_text, new Object[]{f});
                } else if (i == 20) {
                    return m355h(context, "common_google_play_services_restricted_profile_text", f);
                } else {
                    switch (i) {
                        case 16:
                            return m355h(context, "common_google_play_services_api_unavailable_text", f);
                        case 17:
                            return m355h(context, "common_google_play_services_sign_in_failed_text", f);
                        case 18:
                            return resources.getString(C4264b.common_google_play_services_updating_text, new Object[]{f});
                        default:
                            return resources.getString(C4290l.common_google_play_services_unknown_issue, new Object[]{f});
                    }
                }
            }
        } else if (C2551h.m21197g(context)) {
            return resources.getString(C4264b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C4264b.common_google_play_services_update_text, new Object[]{f});
        }
    }

    /* renamed from: d */
    public static String m351d(Context context, int i) {
        return (i == 6 || i == 19) ? m355h(context, "common_google_play_services_resolution_required_text", m353f(context)) : m350c(context, i);
    }

    /* renamed from: e */
    public static String m352e(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C4264b.common_google_play_services_enable_button : C4264b.common_google_play_services_update_button : C4264b.common_google_play_services_install_button);
    }

    /* renamed from: f */
    public static String m353f(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2606c.m21299a(context).mo12494d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: g */
    public static String m354g(Context context) {
        return context.getResources().getString(C4264b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: h */
    private static String m355h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m356i(context, str);
        if (i == null) {
            i = resources.getString(C4290l.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m356i(Context context, String str) {
        C3814g<String, String> gVar = f230a;
        synchronized (gVar) {
            Locale c = C0681f.m2821a(context.getResources().getConfiguration()).mo2682c(0);
            if (!c.equals(f231b)) {
                gVar.clear();
                f231b = c;
            }
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d = C4287i.m26854d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
