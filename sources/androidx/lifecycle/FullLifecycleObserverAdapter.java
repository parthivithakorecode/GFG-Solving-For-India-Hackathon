package androidx.lifecycle;

import androidx.lifecycle.C1099i;

class FullLifecycleObserverAdapter implements C1107k {

    /* renamed from: a */
    private final C1082e f2914a;

    /* renamed from: b */
    private final C1107k f2915b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C1064a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2916a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.C1099i.C1101b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2916a = r0
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2916a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2916a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2916a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2916a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2916a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2916a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C1099i.C1101b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C1064a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C1082e eVar, C1107k kVar) {
        this.f2914a = eVar;
        this.f2915b = kVar;
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        switch (C1064a.f2916a[bVar.ordinal()]) {
            case 1:
                this.f2914a.mo3096c(mVar);
                break;
            case 2:
                this.f2914a.mo3098g(mVar);
                break;
            case 3:
                this.f2914a.mo3094a(mVar);
                break;
            case 4:
                this.f2914a.mo3097f(mVar);
                break;
            case 5:
                this.f2914a.mo3099i(mVar);
                break;
            case 6:
                this.f2914a.mo3095b(mVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1107k kVar = this.f2915b;
        if (kVar != null) {
            kVar.mo527e(mVar, bVar);
        }
    }
}
