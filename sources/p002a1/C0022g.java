package p002a1;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C1869jz;
import com.google.android.gms.internal.ads.C1906kz;
import com.google.android.gms.internal.ads.io0;
import java.util.Date;
import java.util.List;
import p003a2.C0092o;
import p136t1.C4059a;

/* renamed from: a1.g */
public class C0022g {

    /* renamed from: a */
    protected final C1906kz f23a;

    /* renamed from: a1.g$a */
    public static class C0023a {

        /* renamed from: a */
        protected final C1869jz f24a;

        public C0023a() {
            C1869jz jzVar = new C1869jz();
            this.f24a = jzVar;
            jzVar.mo8558F("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C0023a mo43a(@RecentlyNonNull String str) {
            this.f24a.mo8556D(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C0023a mo44b(@RecentlyNonNull Class<Object> cls, @RecentlyNonNull Bundle bundle) {
            this.f24a.mo8557E(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f24a.mo8559G("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C0022g mo45c() {
            return new C0022g(this);
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C0023a mo46d(@RecentlyNonNull String str) {
            C0092o.m314j(str, "Content URL must be non-null.");
            C0092o.m311g(str, "Content URL must be non-empty.");
            C0092o.m307c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f24a.mo8561b(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C0023a mo47e(int i) {
            this.f24a.mo8563d(i);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: f */
        public C0023a mo48f(@RecentlyNonNull Location location) {
            this.f24a.mo8565f(location);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C0023a mo49g(@RecentlyNonNull List<String> list) {
            if (list == null) {
                io0.m11131g("neighboring content URLs list should not be null");
                return this;
            }
            this.f24a.mo8566g(list);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public C0023a mo50h(@RecentlyNonNull String str) {
            this.f24a.mo8568i(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: i */
        public final C0023a mo51i(@RecentlyNonNull String str) {
            this.f24a.mo8558F(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: j */
        public final C0023a mo52j(@RecentlyNonNull Date date) {
            this.f24a.mo8560a(date);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: k */
        public final C0023a mo53k(int i) {
            this.f24a.mo8562c(i);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: l */
        public final C0023a mo54l(boolean z) {
            this.f24a.mo8564e(z);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: m */
        public final C0023a mo55m(boolean z) {
            this.f24a.mo8569j(z);
            return this;
        }
    }

    protected C0022g(@RecentlyNonNull C0023a aVar) {
        this.f23a = new C1906kz(aVar.f24a, (C4059a) null);
    }

    /* renamed from: a */
    public C1906kz mo42a() {
        return this.f23a;
    }
}
