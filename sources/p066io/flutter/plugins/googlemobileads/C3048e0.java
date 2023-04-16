package p066io.flutter.plugins.googlemobileads;

import java.util.Objects;
import p124r1.C3974e;

/* renamed from: io.flutter.plugins.googlemobileads.e0 */
class C3048e0 {

    /* renamed from: a */
    private final String f20098a;

    /* renamed from: b */
    private final String f20099b;

    public C3048e0(String str, String str2) {
        this.f20098a = str;
        this.f20099b = str2;
    }

    /* renamed from: a */
    public C3974e mo13810a() {
        C3974e.C3975a aVar = new C3974e.C3975a();
        String str = this.f20098a;
        if (str != null) {
            aVar.mo15440c(str);
        }
        String str2 = this.f20099b;
        if (str2 != null) {
            aVar.mo15439b(str2);
        }
        return aVar.mo15438a();
    }

    /* renamed from: b */
    public String mo13811b() {
        return this.f20099b;
    }

    /* renamed from: c */
    public String mo13812c() {
        return this.f20098a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3048e0)) {
            return false;
        }
        C3048e0 e0Var = (C3048e0) obj;
        return Objects.equals(e0Var.f20098a, this.f20098a) && Objects.equals(e0Var.f20099b, this.f20099b);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f20098a, this.f20099b});
    }
}
