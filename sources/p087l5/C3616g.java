package p087l5;

import p058h5.C2743c;
import p080k5.C3334d;

/* renamed from: l5.g */
public final class C3616g {

    /* renamed from: l5.g$b */
    private static final class C3618b implements C3615f {

        /* renamed from: f */
        private final int f21345f;

        /* renamed from: g */
        private final int f21346g;

        private C3618b(int i, C2743c cVar) {
            C3334d.m24473i(cVar, "dayOfWeek");
            this.f21345f = i;
            this.f21346g = cVar.getValue();
        }

        /* renamed from: h */
        public C3613d mo12780h(C3613d dVar) {
            int g = dVar.mo12778g(C3603a.DAY_OF_WEEK);
            int i = this.f21345f;
            if (i < 2 && g == this.f21346g) {
                return dVar;
            }
            if ((i & 1) == 0) {
                int i2 = g - this.f21346g;
                return dVar.mo12800e((long) (i2 >= 0 ? 7 - i2 : -i2), C3604b.DAYS);
            }
            int i3 = this.f21346g - g;
            return dVar.mo12802f((long) (i3 >= 0 ? 7 - i3 : -i3), C3604b.DAYS);
        }
    }

    /* renamed from: a */
    public static C3615f m25147a(C2743c cVar) {
        return new C3618b(0, cVar);
    }

    /* renamed from: b */
    public static C3615f m25148b(C2743c cVar) {
        return new C3618b(1, cVar);
    }
}
