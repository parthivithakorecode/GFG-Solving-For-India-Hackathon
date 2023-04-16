package p033e1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import p160x1.C4288j;

/* renamed from: e1.c */
public final class C2542c {

    /* renamed from: a */
    private SharedPreferences f18659a;

    public C2542c(Context context) {
        try {
            Context c = C4288j.m26857c(context);
            this.f18659a = c == null ? null : c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f18659a = null;
        }
    }

    /* renamed from: a */
    public final boolean mo12459a(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.f18659a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo12460b(String str, float f) {
        try {
            SharedPreferences sharedPreferences = this.f18659a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo12461c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f18659a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
