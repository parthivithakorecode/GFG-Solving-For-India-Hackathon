package p096n0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p089m0.C3639d;
import p089m0.C3646j;
import p089m0.C3651m;
import p089m0.C3661r;
import p089m0.C3664u;
import p147v0.C4171b;

/* renamed from: n0.g */
public class C3754g extends C3661r {

    /* renamed from: j */
    private static final String f21608j = C3646j.m25231f("WorkContinuationImpl");

    /* renamed from: a */
    private final C3756i f21609a;

    /* renamed from: b */
    private final String f21610b;

    /* renamed from: c */
    private final C3639d f21611c;

    /* renamed from: d */
    private final List<? extends C3664u> f21612d;

    /* renamed from: e */
    private final List<String> f21613e;

    /* renamed from: f */
    private final List<String> f21614f;

    /* renamed from: g */
    private final List<C3754g> f21615g;

    /* renamed from: h */
    private boolean f21616h;

    /* renamed from: i */
    private C3651m f21617i;

    public C3754g(C3756i iVar, String str, C3639d dVar, List<? extends C3664u> list, List<C3754g> list2) {
        this.f21609a = iVar;
        this.f21610b = str;
        this.f21611c = dVar;
        this.f21612d = list;
        this.f21615g = list2;
        this.f21613e = new ArrayList(list.size());
        this.f21614f = new ArrayList();
        if (list2 != null) {
            for (C3754g gVar : list2) {
                this.f21614f.addAll(gVar.f21614f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C3664u) list.get(i)).mo14826a();
            this.f21613e.add(a);
            this.f21614f.add(a);
        }
    }

    public C3754g(C3756i iVar, List<? extends C3664u> list) {
        this(iVar, (String) null, C3639d.KEEP, list, (List<C3754g>) null);
    }

    /* renamed from: i */
    private static boolean m25522i(C3754g gVar, Set<String> set) {
        set.addAll(gVar.mo14971c());
        Set<String> l = m25523l(gVar);
        for (String contains : set) {
            if (l.contains(contains)) {
                return true;
            }
        }
        List<C3754g> e = gVar.mo14973e();
        if (e != null && !e.isEmpty()) {
            for (C3754g i : e) {
                if (m25522i(i, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.mo14971c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m25523l(C3754g gVar) {
        HashSet hashSet = new HashSet();
        List<C3754g> e = gVar.mo14973e();
        if (e != null && !e.isEmpty()) {
            for (C3754g c : e) {
                hashSet.addAll(c.mo14971c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public C3651m mo14969a() {
        if (!this.f21616h) {
            C4171b bVar = new C4171b(this);
            this.f21609a.mo14987p().mo15823b(bVar);
            this.f21617i = bVar.mo15684d();
        } else {
            C3646j.m25229c().mo14810h(f21608j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f21613e)}), new Throwable[0]);
        }
        return this.f21617i;
    }

    /* renamed from: b */
    public C3639d mo14970b() {
        return this.f21611c;
    }

    /* renamed from: c */
    public List<String> mo14971c() {
        return this.f21613e;
    }

    /* renamed from: d */
    public String mo14972d() {
        return this.f21610b;
    }

    /* renamed from: e */
    public List<C3754g> mo14973e() {
        return this.f21615g;
    }

    /* renamed from: f */
    public List<? extends C3664u> mo14974f() {
        return this.f21612d;
    }

    /* renamed from: g */
    public C3756i mo14975g() {
        return this.f21609a;
    }

    /* renamed from: h */
    public boolean mo14976h() {
        return m25522i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean mo14977j() {
        return this.f21616h;
    }

    /* renamed from: k */
    public void mo14978k() {
        this.f21616h = true;
    }
}
