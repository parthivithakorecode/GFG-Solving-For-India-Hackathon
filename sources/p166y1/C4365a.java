package p166y1;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p003a2.C0052c;
import p003a2.C0060d;
import p003a2.C0076i;
import p003a2.C0092o;
import p160x1.C4282d;
import p166y1.C4365a.C4369d;
import p166y1.C4382f;
import p172z1.C4494d;
import p172z1.C4506j;

/* renamed from: y1.a */
public final class C4365a<O extends C4369d> {

    /* renamed from: a */
    private final C4366a<?, O> f22726a;

    /* renamed from: b */
    private final C4375g<?> f22727b;

    /* renamed from: c */
    private final String f22728c;

    /* renamed from: y1.a$a */
    public static abstract class C4366a<T extends C4374f, O> extends C4373e<T, O> {
        @RecentlyNonNull
        @Deprecated
        /* renamed from: a */
        public T mo15408a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C0060d dVar, @RecentlyNonNull O o, @RecentlyNonNull C4382f.C4383a aVar, @RecentlyNonNull C4382f.C4384b bVar) {
            return mo4847b(context, looper, dVar, o, aVar, bVar);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public T mo4847b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C0060d dVar, @RecentlyNonNull O o, @RecentlyNonNull C4494d dVar2, @RecentlyNonNull C4506j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: y1.a$b */
    public interface C4367b {
    }

    /* renamed from: y1.a$c */
    public static class C4368c<C extends C4367b> {
    }

    /* renamed from: y1.a$d */
    public interface C4369d {
        @RecentlyNonNull

        /* renamed from: a */
        public static final C4372c f22729a = new C4372c((C4392m) null);

        /* renamed from: y1.a$d$a */
        public interface C4370a extends C4369d {
            @RecentlyNonNull
            /* renamed from: a */
            Account mo15985a();
        }

        /* renamed from: y1.a$d$b */
        public interface C4371b extends C4369d {
            @RecentlyNullable
            /* renamed from: b */
            GoogleSignInAccount mo15986b();
        }

        /* renamed from: y1.a$d$c */
        public static final class C4372c implements C4369d {
            private C4372c() {
            }

            /* synthetic */ C4372c(C4392m mVar) {
            }
        }
    }

    /* renamed from: y1.a$e */
    public static abstract class C4373e<T extends C4367b, O> {
    }

    /* renamed from: y1.a$f */
    public interface C4374f extends C4367b {
        /* renamed from: a */
        boolean mo15987a();

        /* renamed from: b */
        void mo15988b(@RecentlyNonNull C0052c.C0057e eVar);

        /* renamed from: c */
        Set<Scope> mo231c();

        /* renamed from: d */
        void mo15989d(@RecentlyNonNull String str);

        /* renamed from: e */
        boolean mo15990e();

        /* renamed from: h */
        void mo15991h(@RecentlyNonNull C0052c.C0055c cVar);

        /* renamed from: i */
        int mo178i();

        /* renamed from: j */
        boolean mo15992j();

        @RecentlyNonNull
        /* renamed from: k */
        C4282d[] mo15993k();

        @RecentlyNonNull
        /* renamed from: l */
        String mo15994l();

        @RecentlyNullable
        /* renamed from: m */
        String mo15995m();

        /* renamed from: n */
        void mo15996n(C0076i iVar, Set<Scope> set);

        /* renamed from: o */
        void mo15997o();

        /* renamed from: p */
        boolean mo185p();
    }

    /* renamed from: y1.a$g */
    public static final class C4375g<C extends C4374f> extends C4368c<C> {
    }

    public <C extends C4374f> C4365a(@RecentlyNonNull String str, @RecentlyNonNull C4366a<C, O> aVar, @RecentlyNonNull C4375g<C> gVar) {
        C0092o.m314j(aVar, "Cannot construct an Api with a null ClientBuilder");
        C0092o.m314j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f22728c = str;
        this.f22726a = aVar;
        this.f22727b = gVar;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public final C4366a<?, O> mo15983a() {
        return this.f22726a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo15984b() {
        return this.f22728c;
    }
}
