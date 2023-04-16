package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0743e;
import java.util.List;

/* renamed from: androidx.core.provider.e */
public final class C0701e {

    /* renamed from: a */
    private final String f2037a;

    /* renamed from: b */
    private final String f2038b;

    /* renamed from: c */
    private final String f2039c;

    /* renamed from: d */
    private final List<List<byte[]>> f2040d;

    /* renamed from: e */
    private final int f2041e = 0;

    /* renamed from: f */
    private final String f2042f;

    public C0701e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2037a = (String) C0743e.m2958f(str);
        this.f2038b = (String) C0743e.m2958f(str2);
        this.f2039c = (String) C0743e.m2958f(str3);
        this.f2040d = (List) C0743e.m2958f(list);
        this.f2042f = m2854a(str, str2, str3);
    }

    /* renamed from: a */
    private String m2854a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo2698b() {
        return this.f2040d;
    }

    /* renamed from: c */
    public int mo2699c() {
        return this.f2041e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo2700d() {
        return this.f2042f;
    }

    /* renamed from: e */
    public String mo2701e() {
        return this.f2037a;
    }

    /* renamed from: f */
    public String mo2702f() {
        return this.f2038b;
    }

    /* renamed from: g */
    public String mo2703g() {
        return this.f2039c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2037a + ", mProviderPackage: " + this.f2038b + ", mQuery: " + this.f2039c + ", mCertificates:");
        for (int i = 0; i < this.f2040d.size(); i++) {
            sb.append(" [");
            List list = this.f2040d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2041e);
        return sb.toString();
    }
}
