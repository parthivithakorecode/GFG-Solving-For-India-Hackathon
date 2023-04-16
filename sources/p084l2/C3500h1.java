package p084l2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l2.h1 */
public final class C3500h1 {

    /* renamed from: a */
    private final Context f21083a;

    /* renamed from: b */
    private final Map<String, SharedPreferences.Editor> f21084b = new HashMap();

    public C3500h1(Context context) {
        this.f21083a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final SharedPreferences.Editor m24897a(String str) {
        if (!this.f21084b.containsKey(str)) {
            this.f21084b.put(str, this.f21083a.getSharedPreferences(str, 0).edit());
        }
        return this.f21084b.get(str);
    }

    /* renamed from: c */
    public final void mo14587c() {
        for (SharedPreferences.Editor apply : this.f21084b.values()) {
            apply.apply();
        }
    }

    /* renamed from: d */
    public final boolean mo14588d(String str, Object obj) {
        String str2;
        float floatValue;
        C3488e1 a = C3492f1.m24877a(this.f21083a, str);
        if (a == null) {
            return false;
        }
        SharedPreferences.Editor a2 = m24897a(a.f21052a);
        if (obj instanceof Integer) {
            a2.putInt(a.f21053b, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Long) {
            a2.putLong(a.f21053b, ((Long) obj).longValue());
            return true;
        } else {
            if (obj instanceof Double) {
                str2 = a.f21053b;
                floatValue = ((Double) obj).floatValue();
            } else if (obj instanceof Float) {
                str2 = a.f21053b;
                floatValue = ((Float) obj).floatValue();
            } else if (obj instanceof Boolean) {
                a2.putBoolean(a.f21053b, ((Boolean) obj).booleanValue());
                return true;
            } else if (!(obj instanceof String)) {
                return false;
            } else {
                a2.putString(a.f21053b, (String) obj);
                return true;
            }
            a2.putFloat(str2, floatValue);
            return true;
        }
    }
}
