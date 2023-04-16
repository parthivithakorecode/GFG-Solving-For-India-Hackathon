package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.core.p009os.C0692m;
import androidx.emoji2.text.C0911e;
import androidx.lifecycle.C1075b;
import androidx.lifecycle.C1077c;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1187a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p068j0.C3133a;

public class EmojiCompatInitializer implements C3133a<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    static class C0898a extends C0911e.C0915c {
        protected C0898a(Context context) {
            super(new C0899b(context));
            mo3130b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C0899b implements C0911e.C0919g {

        /* renamed from: a */
        private final Context f2369a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        class C0900a extends C0911e.C0920h {

            /* renamed from: a */
            final /* synthetic */ C0911e.C0920h f2370a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f2371b;

            C0900a(C0911e.C0920h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2370a = hVar;
                this.f2371b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo3102a(Throwable th) {
                try {
                    this.f2370a.mo3102a(th);
                } finally {
                    this.f2371b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo3103b(C0936m mVar) {
                try {
                    this.f2370a.mo3103b(mVar);
                } finally {
                    this.f2371b.shutdown();
                }
            }
        }

        C0899b(Context context) {
            this.f2369a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo3100a(C0911e.C0920h hVar) {
            ThreadPoolExecutor b = C0903b.m3704b("EmojiCompatInitializer");
            b.execute(new C0922f(this, hVar, b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void m3698d(C0911e.C0920h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C0928j a = C0905c.m3708a(this.f2369a);
                if (a != null) {
                    a.mo3155c(threadPoolExecutor);
                    a.mo3129a().mo3100a(new C0900a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.mo3102a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class C0901c implements Runnable {
        C0901c() {
        }

        public void run() {
            try {
                C0692m.m2837a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0911e.m3730h()) {
                    C0911e.m3726b().mo3115k();
                }
            } finally {
                C0692m.m2838b();
            }
        }
    }

    /* renamed from: a */
    public List<Class<? extends C3133a<?>>> mo3089a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo3090b(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return Boolean.FALSE;
        }
        C0911e.m3729g(new C0898a(context));
        mo3092d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3092d(Context context) {
        final C1099i a = ((C1110m) C1187a.m4780e(context).mo4010f(ProcessLifecycleInitializer.class)).mo491a();
        a.mo3830a(new C1077c() {
            /* renamed from: a */
            public void mo3094a(C1110m mVar) {
                EmojiCompatInitializer.this.mo3093e();
                a.mo3832c(this);
            }

            /* renamed from: b */
            public /* synthetic */ void mo3095b(C1110m mVar) {
                C1075b.m4529b(this, mVar);
            }

            /* renamed from: c */
            public /* synthetic */ void mo3096c(C1110m mVar) {
                C1075b.m4528a(this, mVar);
            }

            /* renamed from: f */
            public /* synthetic */ void mo3097f(C1110m mVar) {
                C1075b.m4530c(this, mVar);
            }

            /* renamed from: g */
            public /* synthetic */ void mo3098g(C1110m mVar) {
                C1075b.m4531d(this, mVar);
            }

            /* renamed from: i */
            public /* synthetic */ void mo3099i(C1110m mVar) {
                C1075b.m4532e(this, mVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3093e() {
        C0903b.m3706d().postDelayed(new C0901c(), 500);
    }
}
