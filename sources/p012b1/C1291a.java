package p012b1;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C1906kz;
import java.util.List;
import p002a1.C0022g;

/* renamed from: b1.a */
public final class C1291a extends C0022g {

    /* renamed from: b1.a$a */
    public static final class C1292a extends C0022g.C0023a {
        @RecentlyNonNull
        /* renamed from: n */
        public C1292a mo4608n(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f24a.mo8555C(str, str2);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public C1292a mo4609o(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
            if (list != null) {
                this.f24a.mo8555C(str, TextUtils.join(",", list));
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: p */
        public C1291a mo45c() {
            return new C1291a(this, (C1297f) null);
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C1292a mo4611q(@RecentlyNonNull String str) {
            this.f24a.mo8567h(str);
            return this;
        }
    }

    /* synthetic */ C1291a(C1292a aVar, C1297f fVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final C1906kz mo42a() {
        return this.f23a;
    }
}
