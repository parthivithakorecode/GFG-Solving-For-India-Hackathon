package androidx.room;

import android.content.Context;
import androidx.room.C1173h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p053h0.C2667c;

/* renamed from: androidx.room.a */
public class C1151a {

    /* renamed from: a */
    public final C2667c.C2671c f3060a;

    /* renamed from: b */
    public final Context f3061b;

    /* renamed from: c */
    public final String f3062c;

    /* renamed from: d */
    public final C1173h.C1177d f3063d;

    /* renamed from: e */
    public final List<C1173h.C1175b> f3064e;

    /* renamed from: f */
    public final boolean f3065f;

    /* renamed from: g */
    public final C1173h.C1176c f3066g;

    /* renamed from: h */
    public final Executor f3067h;

    /* renamed from: i */
    public final Executor f3068i;

    /* renamed from: j */
    public final boolean f3069j;

    /* renamed from: k */
    public final boolean f3070k;

    /* renamed from: l */
    public final boolean f3071l;

    /* renamed from: m */
    private final Set<Integer> f3072m;

    /* renamed from: n */
    public final String f3073n;

    /* renamed from: o */
    public final File f3074o;

    public C1151a(Context context, String str, C2667c.C2671c cVar, C1173h.C1177d dVar, List<C1173h.C1175b> list, boolean z, C1173h.C1176c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f3060a = cVar;
        this.f3061b = context;
        this.f3062c = str;
        this.f3063d = dVar;
        this.f3064e = list;
        this.f3065f = z;
        this.f3066g = cVar2;
        this.f3067h = executor;
        this.f3068i = executor2;
        this.f3069j = z2;
        this.f3070k = z3;
        this.f3071l = z4;
        this.f3072m = set;
        this.f3073n = str2;
        this.f3074o = file;
    }

    /* renamed from: a */
    public boolean mo3917a(int i, int i2) {
        Set<Integer> set;
        if (!(i > i2) || !this.f3071l) {
            return this.f3070k && ((set = this.f3072m) == null || !set.contains(Integer.valueOf(i)));
        }
        return false;
    }
}
