package p106o3;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p005a4.C0127b;
import p005a4.C0128c;
import p064i4.C2851e;
import p066io.flutter.embedding.engine.FlutterJNI;
import p099n3.C3764a;
import p099n3.C3768b;

/* renamed from: o3.c */
class C3838c implements C0128c, C3851f {

    /* renamed from: a */
    private final FlutterJNI f21847a;

    /* renamed from: b */
    private final Map<String, C3844f> f21848b;

    /* renamed from: c */
    private Map<String, List<C3840b>> f21849c;

    /* renamed from: d */
    private final Object f21850d;

    /* renamed from: e */
    private final AtomicBoolean f21851e;

    /* renamed from: f */
    private final Map<Integer, C0128c.C0130b> f21852f;

    /* renamed from: g */
    private int f21853g;

    /* renamed from: h */
    private final C3842d f21854h;

    /* renamed from: i */
    private WeakHashMap<C0128c.C0131c, C3842d> f21855i;

    /* renamed from: j */
    private C3847i f21856j;

    /* renamed from: o3.c$b */
    private static class C3840b {

        /* renamed from: a */
        public final ByteBuffer f21857a;

        /* renamed from: b */
        int f21858b;

        /* renamed from: c */
        long f21859c;

        C3840b(ByteBuffer byteBuffer, int i, long j) {
            this.f21857a = byteBuffer;
            this.f21858b = i;
            this.f21859c = j;
        }
    }

    /* renamed from: o3.c$c */
    static class C3841c implements C3842d {

        /* renamed from: a */
        private final ExecutorService f21860a;

        C3841c(ExecutorService executorService) {
            this.f21860a = executorService;
        }

        /* renamed from: a */
        public void mo15285a(Runnable runnable) {
            this.f21860a.execute(runnable);
        }
    }

    /* renamed from: o3.c$d */
    interface C3842d {
        /* renamed from: a */
        void mo15285a(Runnable runnable);
    }

    /* renamed from: o3.c$e */
    private static class C3843e implements C3847i {

        /* renamed from: a */
        ExecutorService f21861a = C3764a.m25580e().mo15006b();

        C3843e() {
        }

        /* renamed from: a */
        public C3842d mo15286a(C0128c.C0132d dVar) {
            return dVar.mo318a() ? new C3846h(this.f21861a) : new C3841c(this.f21861a);
        }
    }

    /* renamed from: o3.c$f */
    private static class C3844f {

        /* renamed from: a */
        public final C0128c.C0129a f21862a;

        /* renamed from: b */
        public final C3842d f21863b;

        C3844f(C0128c.C0129a aVar, C3842d dVar) {
            this.f21862a = aVar;
            this.f21863b = dVar;
        }
    }

    /* renamed from: o3.c$g */
    static class C3845g implements C0128c.C0130b {

        /* renamed from: a */
        private final FlutterJNI f21864a;

        /* renamed from: b */
        private final int f21865b;

        /* renamed from: c */
        private final AtomicBoolean f21866c = new AtomicBoolean(false);

        C3845g(FlutterJNI flutterJNI, int i) {
            this.f21864a = flutterJNI;
            this.f21865b = i;
        }

        /* renamed from: a */
        public void mo310a(ByteBuffer byteBuffer) {
            if (this.f21866c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f21864a.invokePlatformMessageEmptyResponseCallback(this.f21865b);
            } else {
                this.f21864a.invokePlatformMessageResponseCallback(this.f21865b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: o3.c$h */
    static class C3846h implements C3842d {

        /* renamed from: a */
        private final ExecutorService f21867a;

        /* renamed from: b */
        private final ConcurrentLinkedQueue<Runnable> f21868b = new ConcurrentLinkedQueue<>();

        /* renamed from: c */
        private final AtomicBoolean f21869c = new AtomicBoolean(false);

        C3846h(ExecutorService executorService) {
            this.f21867a = executorService;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m25859f() {
            if (this.f21869c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f21868b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f21869c.set(false);
                    if (!this.f21868b.isEmpty()) {
                        this.f21867a.execute(new C3850e(this));
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo15285a(Runnable runnable) {
            this.f21868b.add(runnable);
            this.f21867a.execute(new C3849d(this));
        }
    }

    /* renamed from: o3.c$i */
    interface C3847i {
        /* renamed from: a */
        C3842d mo15286a(C0128c.C0132d dVar);
    }

    /* renamed from: o3.c$j */
    private static class C3848j implements C0128c.C0131c {
        private C3848j() {
        }
    }

    C3838c(FlutterJNI flutterJNI) {
        this(flutterJNI, new C3843e());
    }

    C3838c(FlutterJNI flutterJNI, C3847i iVar) {
        this.f21848b = new HashMap();
        this.f21849c = new HashMap();
        this.f21850d = new Object();
        this.f21851e = new AtomicBoolean(false);
        this.f21852f = new HashMap();
        this.f21853g = 1;
        this.f21854h = new C3852g();
        this.f21855i = new WeakHashMap<>();
        this.f21847a = flutterJNI;
        this.f21856j = iVar;
    }

    /* renamed from: j */
    private void m25839j(String str, C3844f fVar, ByteBuffer byteBuffer, int i, long j) {
        C3844f fVar2 = fVar;
        C3842d dVar = fVar2 != null ? fVar2.f21863b : null;
        C2851e.m22353b("PlatformChannel ScheduleHandler on " + str, i);
        C3837b bVar = new C3837b(this, str, i, fVar, byteBuffer, j);
        if (dVar == null) {
            dVar = this.f21854h;
        }
        dVar.mo15285a(bVar);
    }

    /* renamed from: k */
    private static void m25840k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    /* renamed from: l */
    private void m25841l(C3844f fVar, ByteBuffer byteBuffer, int i) {
        if (fVar != null) {
            try {
                C3768b.m25592f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f21862a.mo308a(byteBuffer, new C3845g(this.f21847a, i));
            } catch (Exception e) {
                C3768b.m25589c("DartMessenger", "Uncaught exception in binary message listener", e);
            } catch (Error e2) {
                m25840k(e2);
            }
        } else {
            C3768b.m25592f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f21847a.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m25842m(String str, int i, C3844f fVar, ByteBuffer byteBuffer, long j) {
        C2851e.m22356e("PlatformChannel ScheduleHandler on " + str, i);
        C2851e.m22352a("DartMessenger#handleMessageFromDart on " + str);
        try {
            m25841l(fVar, byteBuffer, i);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f21847a.cleanupMessageData(j);
            C2851e.m22355d();
        }
    }

    /* renamed from: a */
    public C0128c.C0131c mo312a(C0128c.C0132d dVar) {
        C3842d a = this.f21856j.mo15286a(dVar);
        C3848j jVar = new C3848j();
        this.f21855i.put(jVar, a);
        return jVar;
    }

    /* renamed from: b */
    public /* synthetic */ C0128c.C0131c mo313b() {
        return C0127b.m380a(this);
    }

    /* renamed from: c */
    public void mo314c(String str, C0128c.C0129a aVar) {
        mo317h(str, aVar, (C0128c.C0131c) null);
    }

    /* renamed from: d */
    public void mo315d(String str, ByteBuffer byteBuffer, C0128c.C0130b bVar) {
        C2851e.m22352a("DartMessenger#send on " + str);
        try {
            C3768b.m25592f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i = this.f21853g;
            this.f21853g = i + 1;
            if (bVar != null) {
                this.f21852f.put(Integer.valueOf(i), bVar);
            }
            if (byteBuffer == null) {
                this.f21847a.dispatchEmptyPlatformMessage(str, i);
            } else {
                this.f21847a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
        } finally {
            C2851e.m22355d();
        }
    }

    /* renamed from: e */
    public void mo316e(String str, ByteBuffer byteBuffer) {
        C3768b.m25592f("DartMessenger", "Sending message over channel '" + str + "'");
        mo315d(str, byteBuffer, (C0128c.C0130b) null);
    }

    /* renamed from: f */
    public void mo15283f(int i, ByteBuffer byteBuffer) {
        C3768b.m25592f("DartMessenger", "Received message reply from Dart.");
        C0128c.C0130b remove = this.f21852f.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                C3768b.m25592f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.mo310a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e) {
                C3768b.m25589c("DartMessenger", "Uncaught exception in binary message reply handler", e);
            } catch (Error e2) {
                m25840k(e2);
            }
        }
    }

    /* renamed from: g */
    public void mo15284g(String str, ByteBuffer byteBuffer, int i, long j) {
        C3844f fVar;
        boolean z;
        C3768b.m25592f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f21850d) {
            fVar = this.f21848b.get(str);
            z = this.f21851e.get() && fVar == null;
            if (z) {
                if (!this.f21849c.containsKey(str)) {
                    this.f21849c.put(str, new LinkedList());
                }
                this.f21849c.get(str).add(new C3840b(byteBuffer, i, j));
            }
        }
        if (!z) {
            m25839j(str, fVar, byteBuffer, i, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (p106o3.C3838c.C3840b) r10.next();
        m25839j(r9, r8.f21848b.get(r9), r11.f21857a, r11.f21858b, r11.f21859c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo317h(java.lang.String r9, p005a4.C0128c.C0129a r10, p005a4.C0128c.C0131c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p099n3.C3768b.m25592f(r10, r11)
            java.lang.Object r0 = r8.f21850d
            monitor-enter(r0)
            java.util.Map<java.lang.String, o3.c$f> r10 = r8.f21848b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<a4.c$c, o3.c$d> r0 = r8.f21855i
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            o3.c$d r0 = (p106o3.C3838c.C3842d) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p099n3.C3768b.m25592f(r11, r1)
            java.lang.Object r11 = r8.f21850d
            monitor-enter(r11)
            java.util.Map<java.lang.String, o3.c$f> r1 = r8.f21848b     // Catch:{ all -> 0x009c }
            o3.c$f r2 = new o3.c$f     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<o3.c$b>> r10 = r8.f21849c     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            o3.c$b r11 = (p106o3.C3838c.C3840b) r11
            java.util.Map<java.lang.String, o3.c$f> r0 = r8.f21848b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            o3.c$f r3 = (p106o3.C3838c.C3844f) r3
            java.nio.ByteBuffer r4 = r11.f21857a
            int r5 = r11.f21858b
            long r6 = r11.f21859c
            r1 = r8
            r2 = r9
            r1.m25839j(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o3.C3838c.mo317h(java.lang.String, a4.c$a, a4.c$c):void");
    }
}
