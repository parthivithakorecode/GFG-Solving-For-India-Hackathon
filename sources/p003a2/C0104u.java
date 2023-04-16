package p003a2;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p166y1.C4365a;

/* renamed from: a2.u */
public class C0104u implements C4365a.C4369d {
    @RecentlyNonNull

    /* renamed from: c */
    public static final C0104u f221c = m343c().mo286a();

    /* renamed from: b */
    private final String f222b;

    /* renamed from: a2.u$a */
    public static class C0105a {

        /* renamed from: a */
        private String f223a;

        /* synthetic */ C0105a(C0109w wVar) {
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C0104u mo286a() {
            return new C0104u(this.f223a, (C0109w) null);
        }
    }

    /* synthetic */ C0104u(String str, C0109w wVar) {
        this.f222b = str;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static C0105a m343c() {
        return new C0105a((C0109w) null);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public final Bundle mo283d() {
        Bundle bundle = new Bundle();
        String str = this.f222b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0104u)) {
            return false;
        }
        return C0089n.m301a(this.f222b, ((C0104u) obj).f222b);
    }

    public final int hashCode() {
        return C0089n.m302b(this.f222b);
    }
}
