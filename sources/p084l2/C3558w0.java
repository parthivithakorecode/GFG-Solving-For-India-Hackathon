package p084l2;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;

/* renamed from: l2.w0 */
public final class C3558w0 {

    /* renamed from: a */
    public static final int f21233a = 1;

    /* renamed from: b */
    public static final int f21234b = 2;

    /* renamed from: c */
    public static final int f21235c = 3;

    /* renamed from: d */
    private static final /* synthetic */ int[] f21236d = {1, 2, 3};

    /* renamed from: e */
    public static final int f21237e = 1;

    /* renamed from: f */
    public static final int f21238f = 2;

    /* renamed from: g */
    public static final int f21239g = 3;

    /* renamed from: h */
    private static final /* synthetic */ int[] f21240h = {1, 2, 3};

    /* renamed from: i */
    public static final int f21241i = 1;

    /* renamed from: j */
    public static final int f21242j = 2;

    /* renamed from: k */
    public static final int f21243k = 3;

    /* renamed from: l */
    public static final int f21244l = 4;

    /* renamed from: m */
    public static final int f21245m = 5;

    /* renamed from: n */
    public static final int f21246n = 6;

    /* renamed from: o */
    public static final int f21247o = 7;

    /* renamed from: p */
    public static final int f21248p = 8;

    /* renamed from: q */
    private static final /* synthetic */ int[] f21249q = {1, 2, 3, 4, 5, 6, 7, 8};

    /* renamed from: a */
    public static int m24959a(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        nextString.hashCode();
        char c = 65535;
        switch (nextString.hashCode()) {
            case 64208429:
                if (nextString.equals("CLEAR")) {
                    c = 0;
                    break;
                }
                break;
            case 82862015:
                if (nextString.equals("WRITE")) {
                    c = 1;
                    break;
                }
                break;
            case 1856333582:
                if (nextString.equals("UNKNOWN_ACTION_TYPE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f21239g;
            case 1:
                return f21238f;
            case 2:
                return f21237e;
            default:
                throw new IOException(nextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
        }
    }

    /* renamed from: b */
    public static void m24960b(int i, JsonWriter jsonWriter) {
        String str;
        if (i != 0) {
            int i2 = C3544s0.f21195a[i - 1];
            if (i2 == 1) {
                str = "UNKNOWN";
            } else if (i2 == 2) {
                str = "ANDROID";
            } else if (i2 == 3) {
                jsonWriter.value("IOS");
                return;
            } else {
                return;
            }
            jsonWriter.value(str);
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public static int[] m24961c() {
        return (int[]) f21236d.clone();
    }

    /* renamed from: d */
    public static int m24962d(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        nextString.hashCode();
        char c = 65535;
        switch (nextString.hashCode()) {
            case -2058725357:
                if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                    c = 0;
                    break;
                }
                break;
            case -1969035850:
                if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                    c = 1;
                    break;
                }
                break;
            case -1263695752:
                if (nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                    c = 2;
                    break;
                }
                break;
            case -954325659:
                if (nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    c = 3;
                    break;
                }
                break;
            case -918677260:
                if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                    c = 4;
                    break;
                }
                break;
            case 429411856:
                if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    c = 5;
                    break;
                }
                break;
            case 467888915:
                if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    c = 6;
                    break;
                }
                break;
            case 1725474845:
                if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f21245m;
            case 1:
                return f21247o;
            case 2:
                return f21241i;
            case 3:
                return f21243k;
            case 4:
                return f21248p;
            case 5:
                return f21244l;
            case 6:
                return f21242j;
            case 7:
                return f21246n;
            default:
                throw new IOException(nextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
        }
    }

    /* renamed from: e */
    public static int[] m24963e() {
        return (int[]) f21240h.clone();
    }

    /* renamed from: f */
    public static int[] m24964f() {
        return (int[]) f21249q.clone();
    }
}
