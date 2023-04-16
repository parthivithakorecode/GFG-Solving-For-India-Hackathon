package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p089m0.C3641f;
import p089m0.C3658o;
import p089m0.C3666v;
import p153w0.C4260a;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f3321a;

    /* renamed from: b */
    private C1239b f3322b;

    /* renamed from: c */
    private Set<String> f3323c;

    /* renamed from: d */
    private C1234a f3324d;

    /* renamed from: e */
    private int f3325e;

    /* renamed from: f */
    private Executor f3326f;

    /* renamed from: g */
    private C4260a f3327g;

    /* renamed from: h */
    private C3666v f3328h;

    /* renamed from: i */
    private C3658o f3329i;

    /* renamed from: j */
    private C3641f f3330j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1234a {

        /* renamed from: a */
        public List<String> f3331a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f3332b = Collections.emptyList();

        /* renamed from: c */
        public Network f3333c;
    }

    public WorkerParameters(UUID uuid, C1239b bVar, Collection<String> collection, C1234a aVar, int i, Executor executor, C4260a aVar2, C3666v vVar, C3658o oVar, C3641f fVar) {
        this.f3321a = uuid;
        this.f3322b = bVar;
        this.f3323c = new HashSet(collection);
        this.f3324d = aVar;
        this.f3325e = i;
        this.f3326f = executor;
        this.f3327g = aVar2;
        this.f3328h = vVar;
        this.f3329i = oVar;
        this.f3330j = fVar;
    }

    /* renamed from: a */
    public Executor mo4476a() {
        return this.f3326f;
    }

    /* renamed from: b */
    public C3641f mo4477b() {
        return this.f3330j;
    }

    /* renamed from: c */
    public UUID mo4478c() {
        return this.f3321a;
    }

    /* renamed from: d */
    public C1239b mo4479d() {
        return this.f3322b;
    }

    /* renamed from: e */
    public Network mo4480e() {
        return this.f3324d.f3333c;
    }

    /* renamed from: f */
    public C3658o mo4481f() {
        return this.f3329i;
    }

    /* renamed from: g */
    public int mo4482g() {
        return this.f3325e;
    }

    /* renamed from: h */
    public Set<String> mo4483h() {
        return this.f3323c;
    }

    /* renamed from: i */
    public C4260a mo4484i() {
        return this.f3327g;
    }

    /* renamed from: j */
    public List<String> mo4485j() {
        return this.f3324d.f3331a;
    }

    /* renamed from: k */
    public List<Uri> mo4486k() {
        return this.f3324d.f3332b;
    }

    /* renamed from: l */
    public C3666v mo4487l() {
        return this.f3328h;
    }
}
