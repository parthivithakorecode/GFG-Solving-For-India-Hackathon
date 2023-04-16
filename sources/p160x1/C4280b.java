package p160x1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p003a2.C0089n;
import p013b2.C1298a;
import p013b2.C1301c;
import p038f.C2591j;

/* renamed from: x1.b */
public final class C4280b extends C1298a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C4280b> CREATOR = new C4294p();
    @RecentlyNonNull

    /* renamed from: j */
    public static final C4280b f22574j = new C4280b(0);

    /* renamed from: f */
    final int f22575f;

    /* renamed from: g */
    private final int f22576g;

    /* renamed from: h */
    private final PendingIntent f22577h;

    /* renamed from: i */
    private final String f22578i;

    public C4280b(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    C4280b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f22575f = i;
        this.f22576g = i2;
        this.f22577h = pendingIntent;
        this.f22578i = str;
    }

    public C4280b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public C4280b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: h */
    static String m26820h(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case C2591j.f18882o3:
                        return "API_DISABLED";
                    case C2591j.f18887p3:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: c */
    public int mo15841c() {
        return this.f22576g;
    }

    @RecentlyNullable
    /* renamed from: d */
    public String mo15842d() {
        return this.f22578i;
    }

    @RecentlyNullable
    /* renamed from: e */
    public PendingIntent mo15843e() {
        return this.f22577h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4280b)) {
            return false;
        }
        C4280b bVar = (C4280b) obj;
        return this.f22576g == bVar.f22576g && C0089n.m301a(this.f22577h, bVar.f22577h) && C0089n.m301a(this.f22578i, bVar.f22578i);
    }

    /* renamed from: f */
    public boolean mo15845f() {
        return (this.f22576g == 0 || this.f22577h == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo15846g() {
        return this.f22576g == 0;
    }

    public int hashCode() {
        return C0089n.m302b(Integer.valueOf(this.f22576g), this.f22577h, this.f22578i);
    }

    @RecentlyNonNull
    public String toString() {
        C0089n.C0090a c = C0089n.m303c(this);
        c.mo260a("statusCode", m26820h(this.f22576g));
        c.mo260a("resolution", this.f22577h);
        c.mo260a("message", this.f22578i);
        return c.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f22575f);
        C1301c.m5220h(parcel, 2, mo15841c());
        C1301c.m5224l(parcel, 3, mo15843e(), i, false);
        C1301c.m5225m(parcel, 4, mo15842d(), false);
        C1301c.m5214b(parcel, a);
    }
}
