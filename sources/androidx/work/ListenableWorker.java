package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.C1284d;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p089m0.C3640e;
import p089m0.C3666v;
import p143u2.C4136a;
import p153w0.C4260a;

public abstract class ListenableWorker {

    /* renamed from: f */
    private Context f3311f;

    /* renamed from: g */
    private WorkerParameters f3312g;

    /* renamed from: h */
    private volatile boolean f3313h;

    /* renamed from: i */
    private boolean f3314i;

    /* renamed from: j */
    private boolean f3315j;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C1229a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1230a extends C1229a {

            /* renamed from: a */
            private final C1239b f3316a;

            public C1230a() {
                this(C1239b.f3361c);
            }

            public C1230a(C1239b bVar) {
                this.f3316a = bVar;
            }

            /* renamed from: e */
            public C1239b mo4462e() {
                return this.f3316a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1230a.class != obj.getClass()) {
                    return false;
                }
                return this.f3316a.equals(((C1230a) obj).f3316a);
            }

            public int hashCode() {
                return (C1230a.class.getName().hashCode() * 31) + this.f3316a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f3316a + '}';
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1231b extends C1229a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C1231b.class == obj.getClass();
            }

            public int hashCode() {
                return C1231b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1232c extends C1229a {

            /* renamed from: a */
            private final C1239b f3317a;

            public C1232c() {
                this(C1239b.f3361c);
            }

            public C1232c(C1239b bVar) {
                this.f3317a = bVar;
            }

            /* renamed from: e */
            public C1239b mo4469e() {
                return this.f3317a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1232c.class != obj.getClass()) {
                    return false;
                }
                return this.f3317a.equals(((C1232c) obj).f3317a);
            }

            public int hashCode() {
                return (C1232c.class.getName().hashCode() * 31) + this.f3317a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f3317a + '}';
            }
        }

        C1229a() {
        }

        /* renamed from: a */
        public static C1229a m4941a() {
            return new C1230a();
        }

        /* renamed from: b */
        public static C1229a m4942b() {
            return new C1231b();
        }

        /* renamed from: c */
        public static C1229a m4943c() {
            return new C1232c();
        }

        /* renamed from: d */
        public static C1229a m4944d(C1239b bVar) {
            return new C1232c(bVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f3311f = context;
            this.f3312g = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.f3311f;
    }

    public Executor getBackgroundExecutor() {
        return this.f3312g.mo4476a();
    }

    public C4136a<C3640e> getForegroundInfoAsync() {
        C1284d u = C1284d.m5161u();
        u.mo4584r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u;
    }

    public final UUID getId() {
        return this.f3312g.mo4478c();
    }

    public final C1239b getInputData() {
        return this.f3312g.mo4479d();
    }

    public final Network getNetwork() {
        return this.f3312g.mo4480e();
    }

    public final int getRunAttemptCount() {
        return this.f3312g.mo4482g();
    }

    public final Set<String> getTags() {
        return this.f3312g.mo4483h();
    }

    public C4260a getTaskExecutor() {
        return this.f3312g.mo4484i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f3312g.mo4485j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f3312g.mo4486k();
    }

    public C3666v getWorkerFactory() {
        return this.f3312g.mo4487l();
    }

    public boolean isRunInForeground() {
        return this.f3315j;
    }

    public final boolean isStopped() {
        return this.f3313h;
    }

    public final boolean isUsed() {
        return this.f3314i;
    }

    public void onStopped() {
    }

    public final C4136a<Void> setForegroundAsync(C3640e eVar) {
        this.f3315j = true;
        return this.f3312g.mo4477b().mo14802a(getApplicationContext(), getId(), eVar);
    }

    public C4136a<Void> setProgressAsync(C1239b bVar) {
        return this.f3312g.mo4481f().mo14819a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z) {
        this.f3315j = z;
    }

    public final void setUsed() {
        this.f3314i = true;
    }

    public abstract C4136a<C1229a> startWork();

    public final void stop() {
        this.f3313h = true;
        onStopped();
    }
}
