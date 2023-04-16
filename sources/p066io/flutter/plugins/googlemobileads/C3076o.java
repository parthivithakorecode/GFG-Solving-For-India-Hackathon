package p066io.flutter.plugins.googlemobileads;

import p047g1.C2631a;

/* renamed from: io.flutter.plugins.googlemobileads.o */
class C3076o {

    /* renamed from: a */
    final C3078b f20164a;

    /* renamed from: b */
    final String f20165b;

    /* renamed from: c */
    final Number f20166c;

    /* renamed from: io.flutter.plugins.googlemobileads.o$a */
    static /* synthetic */ class C3077a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                g1.a$a[] r0 = p047g1.C2631a.C2632a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20167a = r0
                g1.a$a r1 = p047g1.C2631a.C2632a.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20167a     // Catch:{ NoSuchFieldError -> 0x001d }
                g1.a$a r1 = p047g1.C2631a.C2632a.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugins.googlemobileads.C3076o.C3077a.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.o$b */
    enum C3078b {
        NOT_READY,
        READY
    }

    C3076o(C2631a aVar) {
        C3078b bVar;
        int i = C3077a.f20167a[aVar.mo9474b().ordinal()];
        if (i == 1) {
            bVar = C3078b.NOT_READY;
        } else if (i == 2) {
            bVar = C3078b.READY;
        } else {
            throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{aVar.mo9474b()}));
        }
        this.f20164a = bVar;
        this.f20165b = aVar.mo9473a();
        this.f20166c = Integer.valueOf(aVar.mo9475c());
    }

    C3076o(C3078b bVar, String str, Number number) {
        this.f20164a = bVar;
        this.f20165b = str;
        this.f20166c = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3076o)) {
            return false;
        }
        C3076o oVar = (C3076o) obj;
        if (this.f20164a == oVar.f20164a && this.f20165b.equals(oVar.f20165b)) {
            return this.f20166c.equals(oVar.f20166c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20164a.hashCode() * 31) + this.f20165b.hashCode()) * 31) + this.f20166c.hashCode();
    }
}
