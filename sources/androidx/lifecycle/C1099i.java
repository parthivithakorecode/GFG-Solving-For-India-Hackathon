package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.i */
public abstract class C1099i {

    /* renamed from: a */
    AtomicReference<Object> f2980a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.i$a */
    static /* synthetic */ class C1100a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2981a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2982b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.C1099i.C1101b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2982b = r0
                r1 = 1
                androidx.lifecycle.i$b r2 = androidx.lifecycle.C1099i.C1101b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2982b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.i$b r3 = androidx.lifecycle.C1099i.C1101b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2982b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.i$b r4 = androidx.lifecycle.C1099i.C1101b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2982b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.i$b r5 = androidx.lifecycle.C1099i.C1101b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f2982b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.i$b r6 = androidx.lifecycle.C1099i.C1101b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f2982b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.i$b r6 = androidx.lifecycle.C1099i.C1101b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f2982b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.i$b r6 = androidx.lifecycle.C1099i.C1101b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                androidx.lifecycle.i$c[] r5 = androidx.lifecycle.C1099i.C1102c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f2981a = r5
                androidx.lifecycle.i$c r6 = androidx.lifecycle.C1099i.C1102c.CREATED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f2981a     // Catch:{ NoSuchFieldError -> 0x006f }
                androidx.lifecycle.i$c r5 = androidx.lifecycle.C1099i.C1102c.STARTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f2981a     // Catch:{ NoSuchFieldError -> 0x0079 }
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f2981a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f2981a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.i$c r1 = androidx.lifecycle.C1099i.C1102c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1099i.C1100a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.i$b */
    public enum C1101b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: b */
        public static C1101b m4568b(C1102c cVar) {
            int i = C1100a.f2981a[cVar.ordinal()];
            if (i == 1) {
                return ON_DESTROY;
            }
            if (i == 2) {
                return ON_STOP;
            }
            if (i != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        /* renamed from: e */
        public static C1101b m4569e(C1102c cVar) {
            int i = C1100a.f2981a[cVar.ordinal()];
            if (i == 1) {
                return ON_START;
            }
            if (i == 2) {
                return ON_RESUME;
            }
            if (i != 5) {
                return null;
            }
            return ON_CREATE;
        }

        /* renamed from: d */
        public C1102c mo3833d() {
            switch (C1100a.f2982b[ordinal()]) {
                case 1:
                case 2:
                    return C1102c.CREATED;
                case 3:
                case 4:
                    return C1102c.STARTED;
                case 5:
                    return C1102c.RESUMED;
                case 6:
                    return C1102c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.i$c */
    public enum C1102c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: b */
        public boolean mo3834b(C1102c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo3830a(C1109l lVar);

    /* renamed from: b */
    public abstract C1102c mo3831b();

    /* renamed from: c */
    public abstract void mo3832c(C1109l lVar);
}
