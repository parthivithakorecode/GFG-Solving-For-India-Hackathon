package p166y1;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p003a2.C0052c;
import p003a2.C0060d;
import p003a2.C0092o;
import p034e2.C2555l;
import p131s2.C4028h;
import p131s2.C4029i;
import p166y1.C4365a;
import p166y1.C4365a.C4369d;
import p172z1.C4487a;
import p172z1.C4489b;
import p172z1.C4495d0;
import p172z1.C4496e;
import p172z1.C4504i;
import p172z1.C4512m;
import p172z1.C4514n;
import p172z1.C4518o0;
import p172z1.C4538z;

/* renamed from: y1.e */
public abstract class C4379e<O extends C4365a.C4369d> {

    /* renamed from: a */
    private final Context f22732a;

    /* renamed from: b */
    private final String f22733b;

    /* renamed from: c */
    private final C4365a<O> f22734c;

    /* renamed from: d */
    private final O f22735d;

    /* renamed from: e */
    private final C4489b<O> f22736e;

    /* renamed from: f */
    private final Looper f22737f;

    /* renamed from: g */
    private final int f22738g;
    @NotOnlyInitialized

    /* renamed from: h */
    private final C4382f f22739h = new C4495d0(this);

    /* renamed from: i */
    private final C4512m f22740i;
    @RecentlyNonNull

    /* renamed from: j */
    protected final C4496e f22741j;

    /* renamed from: y1.e$a */
    public static class C4380a {
        @RecentlyNonNull

        /* renamed from: c */
        public static final C4380a f22742c = new C4381a().mo16009a();
        @RecentlyNonNull

        /* renamed from: a */
        public final C4512m f22743a;
        @RecentlyNonNull

        /* renamed from: b */
        public final Looper f22744b;

        /* renamed from: y1.e$a$a */
        public static class C4381a {

            /* renamed from: a */
            private C4512m f22745a;

            /* renamed from: b */
            private Looper f22746b;

            @RecentlyNonNull
            /* renamed from: a */
            public C4380a mo16009a() {
                if (this.f22745a == null) {
                    this.f22745a = new C4487a();
                }
                if (this.f22746b == null) {
                    this.f22746b = Looper.getMainLooper();
                }
                return new C4380a(this.f22745a, this.f22746b);
            }
        }

        private C4380a(C4512m mVar, Account account, Looper looper) {
            this.f22743a = mVar;
            this.f22744b = looper;
        }
    }

    public C4379e(@RecentlyNonNull Context context, @RecentlyNonNull C4365a<O> aVar, @RecentlyNonNull O o, @RecentlyNonNull C4380a aVar2) {
        C0092o.m314j(context, "Null context is not permitted.");
        C0092o.m314j(aVar, "Api must not be null.");
        C0092o.m314j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f22732a = applicationContext;
        String l = m27026l(context);
        this.f22733b = l;
        this.f22734c = aVar;
        this.f22735d = o;
        this.f22737f = aVar2.f22744b;
        this.f22736e = C4489b.m27295a(aVar, o, l);
        C4496e m = C4496e.m27329m(applicationContext);
        this.f22741j = m;
        this.f22738g = m.mo16148n();
        this.f22740i = aVar2.f22743a;
        m.mo16149o(this);
    }

    /* renamed from: k */
    private final <TResult, A extends C4365a.C4367b> C4028h<TResult> m27025k(int i, C4514n<A, TResult> nVar) {
        C4029i iVar = new C4029i();
        this.f22741j.mo16152r(this, i, nVar, iVar, this.f22740i);
        return iVar.mo15524a();
    }

    /* renamed from: l */
    private static String m27026l(Object obj) {
        if (!C2555l.m21217k()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: c */
    public C0060d.C0061a mo16001c() {
        Account account;
        GoogleSignInAccount b;
        GoogleSignInAccount b2;
        C0060d.C0061a aVar = new C0060d.C0061a();
        O o = this.f22735d;
        if (!(o instanceof C4365a.C4369d.C4371b) || (b2 = ((C4365a.C4369d.C4371b) o).mo15986b()) == null) {
            O o2 = this.f22735d;
            account = o2 instanceof C4365a.C4369d.C4370a ? ((C4365a.C4369d.C4370a) o2).mo15985a() : null;
        } else {
            account = b2.mo4977c();
        }
        aVar.mo211c(account);
        O o3 = this.f22735d;
        aVar.mo212d((!(o3 instanceof C4365a.C4369d.C4371b) || (b = ((C4365a.C4369d.C4371b) o3).mo15986b()) == null) ? Collections.emptySet() : b.mo4987k());
        aVar.mo213e(this.f22732a.getClass().getName());
        aVar.mo210b(this.f22732a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public <TResult, A extends C4365a.C4367b> C4028h<TResult> mo16002d(@RecentlyNonNull C4514n<A, TResult> nVar) {
        return m27025k(2, nVar);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public <TResult, A extends C4365a.C4367b> C4028h<TResult> mo16003e(@RecentlyNonNull C4514n<A, TResult> nVar) {
        return m27025k(0, nVar);
    }

    @RecentlyNonNull
    /* renamed from: f */
    public final C4489b<O> mo16004f() {
        return this.f22736e;
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: g */
    public String mo16005g() {
        return this.f22733b;
    }

    /* renamed from: h */
    public final C4365a.C4374f mo16006h(Looper looper, C4538z<O> zVar) {
        Looper looper2 = looper;
        C4365a.C4374f a = ((C4365a.C4366a) C0092o.m313i(this.f22734c.mo15983a())).mo15408a(this.f22732a, looper2, mo16001c().mo209a(), this.f22735d, zVar, zVar);
        String g = mo16005g();
        if (g != null && (a instanceof C0052c)) {
            ((C0052c) a).mo167O(g);
        }
        if (g != null && (a instanceof C4504i)) {
            ((C4504i) a).mo16164q(g);
        }
        return a;
    }

    /* renamed from: i */
    public final int mo16007i() {
        return this.f22738g;
    }

    /* renamed from: j */
    public final C4518o0 mo16008j(Context context, Handler handler) {
        return new C4518o0(context, handler, mo16001c().mo209a());
    }
}
