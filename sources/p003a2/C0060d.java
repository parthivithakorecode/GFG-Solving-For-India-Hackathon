package p003a2;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p102o.C3803b;
import p119q2.C3943a;
import p166y1.C4365a;

/* renamed from: a2.d */
public final class C0060d {
    @Nullable

    /* renamed from: a */
    private final Account f119a;

    /* renamed from: b */
    private final Set<Scope> f120b;

    /* renamed from: c */
    private final Set<Scope> f121c;

    /* renamed from: d */
    private final Map<C4365a<?>, C0111x> f122d;

    /* renamed from: e */
    private final int f123e;
    @Nullable

    /* renamed from: f */
    private final View f124f;

    /* renamed from: g */
    private final String f125g;

    /* renamed from: h */
    private final String f126h;

    /* renamed from: i */
    private final C3943a f127i;

    /* renamed from: j */
    private Integer f128j;

    /* renamed from: a2.d$a */
    public static final class C0061a {
        @Nullable

        /* renamed from: a */
        private Account f129a;

        /* renamed from: b */
        private C3803b<Scope> f130b;

        /* renamed from: c */
        private String f131c;

        /* renamed from: d */
        private String f132d;

        /* renamed from: e */
        private C3943a f133e = C3943a.f22079k;

        @RecentlyNonNull
        /* renamed from: a */
        public C0060d mo209a() {
            return new C0060d(this.f129a, this.f130b, (Map<C4365a<?>, C0111x>) null, 0, (View) null, this.f131c, this.f132d, this.f133e, false);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C0061a mo210b(@RecentlyNonNull String str) {
            this.f131c = str;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final C0061a mo211c(@Nullable Account account) {
            this.f129a = account;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public final C0061a mo212d(@RecentlyNonNull Collection<Scope> collection) {
            if (this.f130b == null) {
                this.f130b = new C3803b<>();
            }
            this.f130b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public final C0061a mo213e(@RecentlyNonNull String str) {
            this.f132d = str;
            return this;
        }
    }

    public C0060d(@Nullable Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<C4365a<?>, C0111x> map, int i, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable C3943a aVar, boolean z) {
        this.f119a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f120b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f122d = map;
        this.f124f = view;
        this.f123e = i;
        this.f125g = str;
        this.f126h = str2;
        this.f127i = aVar == null ? C3943a.f22079k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C0111x xVar : map.values()) {
            hashSet.addAll(xVar.f229a);
        }
        this.f121c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    /* renamed from: a */
    public Account mo200a() {
        return this.f119a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Account mo201b() {
        Account account = this.f119a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    /* renamed from: c */
    public Set<Scope> mo202c() {
        return this.f121c;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public String mo203d() {
        return this.f125g;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public Set<Scope> mo204e() {
        return this.f120b;
    }

    @RecentlyNullable
    /* renamed from: f */
    public final String mo205f() {
        return this.f126h;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public final C3943a mo206g() {
        return this.f127i;
    }

    @RecentlyNullable
    /* renamed from: h */
    public final Integer mo207h() {
        return this.f128j;
    }

    /* renamed from: i */
    public final void mo208i(@RecentlyNonNull Integer num) {
        this.f128j = num;
    }
}
