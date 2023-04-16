package p084l2;

import android.util.JsonWriter;

/* renamed from: l2.u0 */
public enum C3552u0 {
    DEBUG_PARAM_UNKNOWN,
    ALWAYS_SHOW,
    GEO_OVERRIDE_EEA,
    GEO_OVERRIDE_NON_EEA;

    /* renamed from: b */
    public final void mo14632b(JsonWriter jsonWriter) {
        String str;
        int i = C3544s0.f21196b[ordinal()];
        if (i == 1) {
            str = "DEBUG_PARAM_UNKNOWN";
        } else if (i == 2) {
            str = "ALWAYS_SHOW";
        } else if (i == 3) {
            str = "GEO_OVERRIDE_EEA";
        } else if (i == 4) {
            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
            return;
        } else {
            return;
        }
        jsonWriter.value(str);
    }
}
