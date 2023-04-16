package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.graphics.C0659e;
import androidx.core.provider.C0708g;
import androidx.core.util.C0738a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p102o.C3807e;
import p102o.C3814g;

/* renamed from: androidx.core.provider.f */
class C0702f {

    /* renamed from: a */
    static final C3807e<String, Typeface> f2043a = new C3807e<>(16);

    /* renamed from: b */
    private static final ExecutorService f2044b = C0712h.m2885a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f2045c = new Object();

    /* renamed from: d */
    static final C3814g<String, ArrayList<C0738a<C0707e>>> f2046d = new C3814g<>();

    /* renamed from: androidx.core.provider.f$a */
    class C0703a implements Callable<C0707e> {

        /* renamed from: a */
        final /* synthetic */ String f2047a;

        /* renamed from: b */
        final /* synthetic */ Context f2048b;

        /* renamed from: c */
        final /* synthetic */ C0701e f2049c;

        /* renamed from: d */
        final /* synthetic */ int f2050d;

        C0703a(String str, Context context, C0701e eVar, int i) {
            this.f2047a = str;
            this.f2048b = context;
            this.f2049c = eVar;
            this.f2050d = i;
        }

        /* renamed from: a */
        public C0707e call() {
            return C0702f.m2863c(this.f2047a, this.f2048b, this.f2049c, this.f2050d);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    class C0704b implements C0738a<C0707e> {

        /* renamed from: a */
        final /* synthetic */ C0694a f2051a;

        C0704b(C0694a aVar) {
            this.f2051a = aVar;
        }

        /* renamed from: a */
        public void accept(C0707e eVar) {
            if (eVar == null) {
                eVar = new C0707e(-3);
            }
            this.f2051a.mo2694b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    class C0705c implements Callable<C0707e> {

        /* renamed from: a */
        final /* synthetic */ String f2052a;

        /* renamed from: b */
        final /* synthetic */ Context f2053b;

        /* renamed from: c */
        final /* synthetic */ C0701e f2054c;

        /* renamed from: d */
        final /* synthetic */ int f2055d;

        C0705c(String str, Context context, C0701e eVar, int i) {
            this.f2052a = str;
            this.f2053b = context;
            this.f2054c = eVar;
            this.f2055d = i;
        }

        /* renamed from: a */
        public C0707e call() {
            try {
                return C0702f.m2863c(this.f2052a, this.f2053b, this.f2054c, this.f2055d);
            } catch (Throwable unused) {
                return new C0707e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    class C0706d implements C0738a<C0707e> {

        /* renamed from: a */
        final /* synthetic */ String f2056a;

        C0706d(String str) {
            this.f2056a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((androidx.core.util.C0738a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(androidx.core.provider.C0702f.C0707e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C0702f.f2045c
                monitor-enter(r0)
                o.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<androidx.core.provider.f$e>>> r1 = androidx.core.provider.C0702f.f2046d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f2056a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f2056a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.C0738a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0702f.C0706d.accept(androidx.core.provider.f$e):void");
        }
    }

    /* renamed from: androidx.core.provider.f$e */
    static final class C0707e {

        /* renamed from: a */
        final Typeface f2057a;

        /* renamed from: b */
        final int f2058b;

        C0707e(int i) {
            this.f2057a = null;
            this.f2058b = i;
        }

        @SuppressLint({"WrongConstant"})
        C0707e(Typeface typeface) {
            this.f2057a = typeface;
            this.f2058b = 0;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo2712a() {
            return this.f2058b == 0;
        }
    }

    /* renamed from: a */
    private static String m2861a(C0701e eVar, int i) {
        return eVar.mo2700d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m2862b(C0708g.C0709a aVar) {
        int i = 1;
        if (aVar.mo2714c() != 0) {
            return aVar.mo2714c() != 1 ? -3 : -2;
        }
        C0708g.C0710b[] b = aVar.mo2713b();
        if (!(b == null || b.length == 0)) {
            int length = b.length;
            i = 0;
            int i2 = 0;
            while (i2 < length) {
                int b2 = b[i2].mo2715b();
                if (b2 == 0) {
                    i2++;
                } else if (b2 < 0) {
                    return -3;
                } else {
                    return b2;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C0707e m2863c(String str, Context context, C0701e eVar, int i) {
        C3807e<String, Typeface> eVar2 = f2043a;
        Typeface c = eVar2.mo15095c(str);
        if (c != null) {
            return new C0707e(c);
        }
        try {
            C0708g.C0709a e = C0699d.m2849e(context, eVar, (CancellationSignal) null);
            int b = m2862b(e);
            if (b != 0) {
                return new C0707e(b);
            }
            Typeface b2 = C0659e.m2728b(context, (CancellationSignal) null, e.mo2713b(), i);
            if (b2 == null) {
                return new C0707e(-3);
            }
            eVar2.mo15096d(str, b2);
            return new C0707e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0707e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new androidx.core.provider.C0702f.C0705c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f2044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        androidx.core.provider.C0712h.m2886b(r8, r9, new androidx.core.provider.C0702f.C0706d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m2864d(android.content.Context r5, androidx.core.provider.C0701e r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.C0694a r9) {
        /*
            java.lang.String r0 = m2861a(r6, r7)
            o.e<java.lang.String, android.graphics.Typeface> r1 = f2043a
            java.lang.Object r1 = r1.mo15095c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.f$e r5 = new androidx.core.provider.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo2694b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.f$b r1 = new androidx.core.provider.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f2045c
            monitor-enter(r9)
            o.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<androidx.core.provider.f$e>>> r2 = f2046d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            androidx.core.provider.f$c r9 = new androidx.core.provider.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f2044b
        L_0x0044:
            androidx.core.provider.f$d r5 = new androidx.core.provider.f$d
            r5.<init>(r0)
            androidx.core.provider.C0712h.m2886b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0702f.m2864d(android.content.Context, androidx.core.provider.e, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m2865e(Context context, C0701e eVar, C0694a aVar, int i, int i2) {
        String a = m2861a(eVar, i);
        Typeface c = f2043a.mo15095c(a);
        if (c != null) {
            aVar.mo2694b(new C0707e(c));
            return c;
        } else if (i2 == -1) {
            C0707e c2 = m2863c(a, context, eVar, i);
            aVar.mo2694b(c2);
            return c2.f2057a;
        } else {
            try {
                C0707e eVar2 = (C0707e) C0712h.m2887c(f2044b, new C0703a(a, context, eVar, i), i2);
                aVar.mo2694b(eVar2);
                return eVar2.f2057a;
            } catch (InterruptedException unused) {
                aVar.mo2694b(new C0707e(-3));
                return null;
            }
        }
    }
}
