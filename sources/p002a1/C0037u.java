package p002a1;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.io0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: a1.u */
public class C0037u {
    @RecentlyNonNull

    /* renamed from: e */
    public static final List<String> f55e = Arrays.asList(new String[]{"MA", "T", "PG", "G"});

    /* renamed from: a */
    private final int f56a;

    /* renamed from: b */
    private final int f57b;
    @Nullable

    /* renamed from: c */
    private final String f58c;

    /* renamed from: d */
    private final List<String> f59d;

    /* renamed from: a1.u$a */
    public static class C0038a {

        /* renamed from: a */
        private int f60a = -1;

        /* renamed from: b */
        private int f61b = -1;
        @Nullable

        /* renamed from: c */
        private String f62c = null;

        /* renamed from: d */
        private final List<String> f63d = new ArrayList();

        @RecentlyNonNull
        /* renamed from: a */
        public C0037u mo112a() {
            return new C0037u(this.f60a, this.f61b, this.f62c, this.f63d, (C0014a0) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C0038a mo113b(@Nullable String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                io0.m11131g(str.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(str) : new String("Invalid value passed to setMaxAdContentRating: "));
                return this;
            }
            this.f62c = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C0038a mo114c(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f60a = i;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                io0.m11131g(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C0038a mo115d(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f61b = i;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                io0.m11131g(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C0038a mo116e(@Nullable List<String> list) {
            this.f63d.clear();
            if (list != null) {
                this.f63d.addAll(list);
            }
            return this;
        }
    }

    /* synthetic */ C0037u(int i, int i2, String str, List list, C0014a0 a0Var) {
        this.f56a = i;
        this.f57b = i2;
        this.f58c = str;
        this.f59d = list;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public String mo107a() {
        String str = this.f58c;
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public int mo108b() {
        return this.f56a;
    }

    /* renamed from: c */
    public int mo109c() {
        return this.f57b;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public List<String> mo110d() {
        return new ArrayList(this.f59d);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public C0038a mo111e() {
        C0038a aVar = new C0038a();
        aVar.mo114c(this.f56a);
        aVar.mo115d(this.f57b);
        aVar.mo113b(this.f58c);
        aVar.mo116e(this.f59d);
        return aVar;
    }
}
