package p089m0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: m0.c */
public final class C3637c {

    /* renamed from: a */
    private final Set<C3638a> f21378a = new HashSet();

    /* renamed from: m0.c$a */
    public static final class C3638a {

        /* renamed from: a */
        private final Uri f21379a;

        /* renamed from: b */
        private final boolean f21380b;

        C3638a(Uri uri, boolean z) {
            this.f21379a = uri;
            this.f21380b = z;
        }

        /* renamed from: a */
        public Uri mo14792a() {
            return this.f21379a;
        }

        /* renamed from: b */
        public boolean mo14793b() {
            return this.f21380b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3638a.class != obj.getClass()) {
                return false;
            }
            C3638a aVar = (C3638a) obj;
            return this.f21380b == aVar.f21380b && this.f21379a.equals(aVar.f21379a);
        }

        public int hashCode() {
            return (this.f21379a.hashCode() * 31) + (this.f21380b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo14787a(Uri uri, boolean z) {
        this.f21378a.add(new C3638a(uri, z));
    }

    /* renamed from: b */
    public Set<C3638a> mo14788b() {
        return this.f21378a;
    }

    /* renamed from: c */
    public int mo14789c() {
        return this.f21378a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3637c.class != obj.getClass()) {
            return false;
        }
        return this.f21378a.equals(((C3637c) obj).f21378a);
    }

    public int hashCode() {
        return this.f21378a.hashCode();
    }
}
