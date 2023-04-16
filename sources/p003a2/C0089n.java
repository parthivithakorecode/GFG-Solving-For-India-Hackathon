package p003a2;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: a2.n */
public final class C0089n {

    /* renamed from: a2.n$a */
    public static final class C0090a {

        /* renamed from: a */
        private final List<String> f199a = new ArrayList();

        /* renamed from: b */
        private final Object f200b;

        /* synthetic */ C0090a(Object obj, C0091n0 n0Var) {
            C0092o.m313i(obj);
            this.f200b = obj;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C0090a mo260a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.f199a;
            C0092o.m313i(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f200b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f199a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f199a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m301a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m302b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static C0090a m303c(@RecentlyNonNull Object obj) {
        return new C0090a(obj, (C0091n0) null);
    }
}
