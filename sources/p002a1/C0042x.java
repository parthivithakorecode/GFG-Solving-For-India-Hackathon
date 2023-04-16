package p002a1;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.s00;

/* renamed from: a1.x */
public final class C0042x {

    /* renamed from: a */
    private final boolean f69a;

    /* renamed from: b */
    private final boolean f70b;

    /* renamed from: c */
    private final boolean f71c;

    /* renamed from: a1.x$a */
    public static final class C0043a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f72a = true;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f73b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f74c = false;

        @RecentlyNonNull
        /* renamed from: a */
        public C0042x mo133a() {
            return new C0042x(this, (C0016b0) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C0043a mo134b(boolean z) {
            this.f74c = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C0043a mo135c(boolean z) {
            this.f73b = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C0043a mo136d(boolean z) {
            this.f72a = z;
            return this;
        }
    }

    /* synthetic */ C0042x(C0043a aVar, C0016b0 b0Var) {
        this.f69a = aVar.f72a;
        this.f70b = aVar.f73b;
        this.f71c = aVar.f74c;
    }

    public C0042x(s00 s00) {
        this.f69a = s00.f14191f;
        this.f70b = s00.f14192g;
        this.f71c = s00.f14193h;
    }

    /* renamed from: a */
    public boolean mo130a() {
        return this.f71c;
    }

    /* renamed from: b */
    public boolean mo131b() {
        return this.f70b;
    }

    /* renamed from: c */
    public boolean mo132c() {
        return this.f69a;
    }
}
