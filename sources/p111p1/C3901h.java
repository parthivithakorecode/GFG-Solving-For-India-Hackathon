package p111p1;

import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.e02;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.vi0;
import com.google.android.gms.internal.ads.xa3;
import java.util.concurrent.Executor;

/* renamed from: p1.h */
public final class C3901h implements xa3<vi0, C3905j> {

    /* renamed from: a */
    private final Executor f22032a;

    /* renamed from: b */
    private final e02 f22033b;

    public C3901h(Executor executor, e02 e02) {
        this.f22032a = executor;
        this.f22033b = e02;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ cc3 mo5074c(Object obj) {
        vi0 vi0 = (vi0) obj;
        return rb3.m16136n(this.f22033b.mo6766b(vi0), new C3899g(vi0), this.f22032a);
    }
}
