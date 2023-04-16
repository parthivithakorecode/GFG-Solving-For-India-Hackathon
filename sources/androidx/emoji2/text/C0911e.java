package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.util.C0743e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p102o.C3803b;

/* renamed from: androidx.emoji2.text.e */
public class C0911e {

    /* renamed from: n */
    private static final Object f2377n = new Object();

    /* renamed from: o */
    private static final Object f2378o = new Object();

    /* renamed from: p */
    private static volatile C0911e f2379p;

    /* renamed from: a */
    private final ReadWriteLock f2380a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set<C0917e> f2381b;

    /* renamed from: c */
    private volatile int f2382c = 3;

    /* renamed from: d */
    private final Handler f2383d;

    /* renamed from: e */
    private final C0914b f2384e;

    /* renamed from: f */
    final C0919g f2385f;

    /* renamed from: g */
    final boolean f2386g;

    /* renamed from: h */
    final boolean f2387h;

    /* renamed from: i */
    final int[] f2388i;

    /* renamed from: j */
    private final boolean f2389j;

    /* renamed from: k */
    private final int f2390k;

    /* renamed from: l */
    private final int f2391l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C0916d f2392m;

    /* renamed from: androidx.emoji2.text.e$a */
    private static final class C0912a extends C0914b {

        /* renamed from: b */
        private volatile C0924h f2393b;

        /* renamed from: c */
        private volatile C0936m f2394c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        class C0913a extends C0920h {
            C0913a() {
            }

            /* renamed from: a */
            public void mo3102a(Throwable th) {
                C0912a.this.f2396a.mo3116m(th);
            }

            /* renamed from: b */
            public void mo3103b(C0936m mVar) {
                C0912a.this.mo3128d(mVar);
            }
        }

        C0912a(C0911e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3125a() {
            try {
                this.f2396a.f2385f.mo3100a(new C0913a());
            } catch (Throwable th) {
                this.f2396a.mo3116m(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3126b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f2393b.mo3147h(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3127c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2394c.mo3171e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2396a.f2386g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3128d(C0936m mVar) {
            if (mVar == null) {
                this.f2396a.mo3116m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2394c = mVar;
            C0936m mVar2 = this.f2394c;
            C0921i iVar = new C0921i();
            C0916d a = this.f2396a.f2392m;
            C0911e eVar = this.f2396a;
            this.f2393b = new C0924h(mVar2, iVar, a, eVar.f2387h, eVar.f2388i);
            this.f2396a.mo3117n();
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    private static class C0914b {

        /* renamed from: a */
        final C0911e f2396a;

        C0914b(C0911e eVar) {
            this.f2396a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3125a() {
            this.f2396a.mo3117n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3126b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3127c(EditorInfo editorInfo) {
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    public static abstract class C0915c {

        /* renamed from: a */
        final C0919g f2397a;

        /* renamed from: b */
        boolean f2398b;

        /* renamed from: c */
        boolean f2399c;

        /* renamed from: d */
        int[] f2400d;

        /* renamed from: e */
        Set<C0917e> f2401e;

        /* renamed from: f */
        boolean f2402f;

        /* renamed from: g */
        int f2403g = -16711936;

        /* renamed from: h */
        int f2404h = 0;

        /* renamed from: i */
        C0916d f2405i = new C0910d();

        protected C0915c(C0919g gVar) {
            C0743e.m2959g(gVar, "metadataLoader cannot be null.");
            this.f2397a = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C0919g mo3129a() {
            return this.f2397a;
        }

        /* renamed from: b */
        public C0915c mo3130b(int i) {
            this.f2404h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    public interface C0916d {
        /* renamed from: a */
        boolean mo3111a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    public static abstract class C0917e {
        /* renamed from: a */
        public void mo3131a(Throwable th) {
        }

        /* renamed from: b */
        public void mo3132b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    private static class C0918f implements Runnable {

        /* renamed from: f */
        private final List<C0917e> f2406f;

        /* renamed from: g */
        private final Throwable f2407g;

        /* renamed from: h */
        private final int f2408h;

        C0918f(C0917e eVar, int i) {
            this(Arrays.asList(new C0917e[]{(C0917e) C0743e.m2959g(eVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        C0918f(Collection<C0917e> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        C0918f(Collection<C0917e> collection, int i, Throwable th) {
            C0743e.m2959g(collection, "initCallbacks cannot be null");
            this.f2406f = new ArrayList(collection);
            this.f2408h = i;
            this.f2407g = th;
        }

        public void run() {
            int size = this.f2406f.size();
            int i = 0;
            if (this.f2408h != 1) {
                while (i < size) {
                    this.f2406f.get(i).mo3131a(this.f2407g);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f2406f.get(i).mo3132b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    public interface C0919g {
        /* renamed from: a */
        void mo3100a(C0920h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    public static abstract class C0920h {
        /* renamed from: a */
        public abstract void mo3102a(Throwable th);

        /* renamed from: b */
        public abstract void mo3103b(C0936m mVar);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    static class C0921i {
        C0921i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0927i mo3134a(C0923g gVar) {
            return new C0940o(gVar);
        }
    }

    private C0911e(C0915c cVar) {
        this.f2386g = cVar.f2398b;
        this.f2387h = cVar.f2399c;
        this.f2388i = cVar.f2400d;
        this.f2389j = cVar.f2402f;
        this.f2390k = cVar.f2403g;
        this.f2385f = cVar.f2397a;
        this.f2391l = cVar.f2404h;
        this.f2392m = cVar.f2405i;
        this.f2383d = new Handler(Looper.getMainLooper());
        C3803b bVar = new C3803b();
        this.f2381b = bVar;
        Set<C0917e> set = cVar.f2401e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2401e);
        }
        this.f2384e = Build.VERSION.SDK_INT < 19 ? new C0914b(this) : new C0912a(this);
        m3732l();
    }

    /* renamed from: b */
    public static C0911e m3726b() {
        C0911e eVar;
        synchronized (f2377n) {
            eVar = f2379p;
            C0743e.m2960h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    /* renamed from: e */
    public static boolean m3727e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0924h.m3777c(inputConnection, editable, i, i2, z);
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m3728f(Editable editable, int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0924h.m3778d(editable, i, keyEvent);
        }
        return false;
    }

    /* renamed from: g */
    public static C0911e m3729g(C0915c cVar) {
        C0911e eVar = f2379p;
        if (eVar == null) {
            synchronized (f2377n) {
                eVar = f2379p;
                if (eVar == null) {
                    eVar = new C0911e(cVar);
                    f2379p = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public static boolean m3730h() {
        return f2379p != null;
    }

    /* renamed from: j */
    private boolean m3731j() {
        return mo3113d() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private void m3732l() {
        this.f2380a.writeLock().lock();
        try {
            if (this.f2391l == 0) {
                this.f2382c = 0;
            }
            this.f2380a.writeLock().unlock();
            if (mo3113d() == 0) {
                this.f2384e.mo3125a();
            }
        } catch (Throwable th) {
            this.f2380a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public int mo3112c() {
        return this.f2390k;
    }

    /* renamed from: d */
    public int mo3113d() {
        this.f2380a.readLock().lock();
        try {
            return this.f2382c;
        } finally {
            this.f2380a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean mo3114i() {
        return this.f2389j;
    }

    /* renamed from: k */
    public void mo3115k() {
        boolean z = true;
        if (this.f2391l != 1) {
            z = false;
        }
        C0743e.m2960h(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m3731j()) {
            this.f2380a.writeLock().lock();
            try {
                if (this.f2382c != 0) {
                    this.f2382c = 0;
                    this.f2380a.writeLock().unlock();
                    this.f2384e.mo3125a();
                }
            } finally {
                this.f2380a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3116m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2380a.writeLock().lock();
        try {
            this.f2382c = 2;
            arrayList.addAll(this.f2381b);
            this.f2381b.clear();
            this.f2380a.writeLock().unlock();
            this.f2383d.post(new C0918f(arrayList, this.f2382c, th));
        } catch (Throwable th2) {
            this.f2380a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3117n() {
        ArrayList arrayList = new ArrayList();
        this.f2380a.writeLock().lock();
        try {
            this.f2382c = 1;
            arrayList.addAll(this.f2381b);
            this.f2381b.clear();
            this.f2380a.writeLock().unlock();
            this.f2383d.post(new C0918f((Collection<C0917e>) arrayList, this.f2382c));
        } catch (Throwable th) {
            this.f2380a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence mo3118o(CharSequence charSequence) {
        return mo3119p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence mo3119p(CharSequence charSequence, int i, int i2) {
        return mo3120q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence mo3120q(CharSequence charSequence, int i, int i2, int i3) {
        return mo3121r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence mo3121r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        C0743e.m2960h(m3731j(), "Not initialized yet");
        C0743e.m2956d(i, "start cannot be negative");
        C0743e.m2956d(i2, "end cannot be negative");
        C0743e.m2956d(i3, "maxEmojiCount cannot be negative");
        boolean z2 = false;
        C0743e.m2953a(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C0743e.m2953a(i <= charSequence.length(), "start should be < than charSequence length");
        C0743e.m2953a(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                z2 = this.f2386g;
            }
            z = z2;
        } else {
            z = true;
        }
        return this.f2384e.mo3126b(charSequence, i, i2, i3, z);
    }

    /* renamed from: s */
    public void mo3122s(C0917e eVar) {
        C0743e.m2959g(eVar, "initCallback cannot be null");
        this.f2380a.writeLock().lock();
        try {
            if (this.f2382c != 1) {
                if (this.f2382c != 2) {
                    this.f2381b.add(eVar);
                }
            }
            this.f2383d.post(new C0918f(eVar, this.f2382c));
        } finally {
            this.f2380a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void mo3123t(C0917e eVar) {
        C0743e.m2959g(eVar, "initCallback cannot be null");
        this.f2380a.writeLock().lock();
        try {
            this.f2381b.remove(eVar);
        } finally {
            this.f2380a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void mo3124u(EditorInfo editorInfo) {
        if (m3731j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f2384e.mo3127c(editorInfo);
        }
    }
}
