package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.C0701e;
import androidx.core.provider.C0708g;
import androidx.core.util.C0743e;
import androidx.emoji2.text.C0911e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
public class C0928j extends C0911e.C0915c {

    /* renamed from: j */
    private static final C0929a f2434j = new C0929a();

    /* renamed from: androidx.emoji2.text.j$a */
    public static class C0929a {
        /* renamed from: a */
        public Typeface mo3156a(Context context, C0708g.C0710b bVar) {
            return C0708g.m2871a(context, (CancellationSignal) null, new C0708g.C0710b[]{bVar});
        }

        /* renamed from: b */
        public C0708g.C0709a mo3157b(Context context, C0701e eVar) {
            return C0708g.m2872b(context, (CancellationSignal) null, eVar);
        }

        /* renamed from: c */
        public void mo3158c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    private static class C0930b implements C0911e.C0919g {

        /* renamed from: a */
        private final Context f2435a;

        /* renamed from: b */
        private final C0701e f2436b;

        /* renamed from: c */
        private final C0929a f2437c;

        /* renamed from: d */
        private final Object f2438d = new Object();

        /* renamed from: e */
        private Handler f2439e;

        /* renamed from: f */
        private Executor f2440f;

        /* renamed from: g */
        private ThreadPoolExecutor f2441g;

        /* renamed from: h */
        C0911e.C0920h f2442h;

        /* renamed from: i */
        private ContentObserver f2443i;

        /* renamed from: j */
        private Runnable f2444j;

        C0930b(Context context, C0701e eVar, C0929a aVar) {
            C0743e.m2959g(context, "Context cannot be null");
            C0743e.m2959g(eVar, "FontRequest cannot be null");
            this.f2435a = context.getApplicationContext();
            this.f2436b = eVar;
            this.f2437c = aVar;
        }

        /* renamed from: b */
        private void m3799b() {
            synchronized (this.f2438d) {
                this.f2442h = null;
                ContentObserver contentObserver = this.f2443i;
                if (contentObserver != null) {
                    this.f2437c.mo3158c(this.f2435a, contentObserver);
                    this.f2443i = null;
                }
                Handler handler = this.f2439e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2444j);
                }
                this.f2439e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2441g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2440f = null;
                this.f2441g = null;
            }
        }

        /* renamed from: e */
        private C0708g.C0710b m3800e() {
            try {
                C0708g.C0709a b = this.f2437c.mo3157b(this.f2435a, this.f2436b);
                if (b.mo2714c() == 0) {
                    C0708g.C0710b[] b2 = b.mo2713b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo2714c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: a */
        public void mo3100a(C0911e.C0920h hVar) {
            C0743e.m2959g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2438d) {
                this.f2442h = hVar;
            }
            mo3160d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f2438d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            androidx.core.p009os.C0692m.m2837a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f2437c.mo3156a(r4.f2435a, r0);
            r0 = androidx.core.graphics.C0670l.m2801f(r4.f2435a, (android.os.CancellationSignal) null, r0.mo2717d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.C0936m.m3821b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            androidx.core.p009os.C0692m.m2838b();
            r1 = r4.f2438d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f2442h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.mo3103b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            m3799b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            androidx.core.p009os.C0692m.m2838b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f2438d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f2442h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.mo3102a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            m3799b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = m3800e();
            r1 = r0.mo2715b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3159c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f2438d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f2442h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                androidx.core.provider.g$b r0 = r4.m3800e()     // Catch:{ all -> 0x007e }
                int r1 = r0.mo2715b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f2438d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.p009os.C0692m.m2837a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.j$a r1 = r4.f2437c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2435a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.mo3156a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2435a     // Catch:{ all -> 0x005d }
                r3 = 0
                android.net.Uri r0 = r0.mo2717d()     // Catch:{ all -> 0x005d }
                java.nio.ByteBuffer r0 = androidx.core.graphics.C0670l.m2801f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.m r0 = androidx.emoji2.text.C0936m.m3821b(r1, r0)     // Catch:{ all -> 0x005d }
                androidx.core.p009os.C0692m.m2838b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f2438d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.e$h r2 = r4.f2442h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.mo3103b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.m3799b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                androidx.core.p009os.C0692m.m2838b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f2438d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f2442h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.mo3102a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.m3799b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0928j.C0930b.mo3159c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3160d() {
            synchronized (this.f2438d) {
                if (this.f2442h != null) {
                    if (this.f2440f == null) {
                        ThreadPoolExecutor b = C0903b.m3704b("emojiCompat");
                        this.f2441g = b;
                        this.f2440f = b;
                    }
                    this.f2440f.execute(new C0931k(this));
                }
            }
        }

        /* renamed from: f */
        public void mo3161f(Executor executor) {
            synchronized (this.f2438d) {
                this.f2440f = executor;
            }
        }
    }

    public C0928j(Context context, C0701e eVar) {
        super(new C0930b(context, eVar, f2434j));
    }

    /* renamed from: c */
    public C0928j mo3155c(Executor executor) {
        ((C0930b) mo3129a()).mo3161f(executor);
        return this;
    }
}
