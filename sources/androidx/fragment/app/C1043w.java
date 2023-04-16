package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C1099i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.w */
public abstract class C1043w {

    /* renamed from: a */
    private final C1005j f2815a;

    /* renamed from: b */
    private final ClassLoader f2816b;

    /* renamed from: c */
    ArrayList<C1044a> f2817c = new ArrayList<>();

    /* renamed from: d */
    int f2818d;

    /* renamed from: e */
    int f2819e;

    /* renamed from: f */
    int f2820f;

    /* renamed from: g */
    int f2821g;

    /* renamed from: h */
    int f2822h;

    /* renamed from: i */
    boolean f2823i;

    /* renamed from: j */
    boolean f2824j = true;

    /* renamed from: k */
    String f2825k;

    /* renamed from: l */
    int f2826l;

    /* renamed from: m */
    CharSequence f2827m;

    /* renamed from: n */
    int f2828n;

    /* renamed from: o */
    CharSequence f2829o;

    /* renamed from: p */
    ArrayList<String> f2830p;

    /* renamed from: q */
    ArrayList<String> f2831q;

    /* renamed from: r */
    boolean f2832r = false;

    /* renamed from: s */
    ArrayList<Runnable> f2833s;

    /* renamed from: androidx.fragment.app.w$a */
    static final class C1044a {

        /* renamed from: a */
        int f2834a;

        /* renamed from: b */
        Fragment f2835b;

        /* renamed from: c */
        int f2836c;

        /* renamed from: d */
        int f2837d;

        /* renamed from: e */
        int f2838e;

        /* renamed from: f */
        int f2839f;

        /* renamed from: g */
        C1099i.C1102c f2840g;

        /* renamed from: h */
        C1099i.C1102c f2841h;

        C1044a() {
        }

        C1044a(int i, Fragment fragment) {
            this.f2834a = i;
            this.f2835b = fragment;
            C1099i.C1102c cVar = C1099i.C1102c.RESUMED;
            this.f2840g = cVar;
            this.f2841h = cVar;
        }
    }

    C1043w(C1005j jVar, ClassLoader classLoader) {
        this.f2815a = jVar;
        this.f2816b = classLoader;
    }

    /* renamed from: b */
    public C1043w mo3725b(int i, Fragment fragment, String str) {
        mo3360j(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1043w mo3726c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2474L = viewGroup;
        return mo3725b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public C1043w mo3727d(Fragment fragment, String str) {
        mo3360j(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3728e(C1044a aVar) {
        this.f2817c.add(aVar);
        aVar.f2836c = this.f2818d;
        aVar.f2837d = this.f2819e;
        aVar.f2838e = this.f2820f;
        aVar.f2839f = this.f2821g;
    }

    /* renamed from: f */
    public abstract int mo3357f();

    /* renamed from: g */
    public abstract int mo3358g();

    /* renamed from: h */
    public abstract void mo3359h();

    /* renamed from: i */
    public C1043w mo3729i() {
        if (!this.f2823i) {
            this.f2824j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3360j(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2466D;
            if (str2 == null || str.equals(str2)) {
                fragment.f2466D = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2466D + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2464B;
                if (i3 == 0 || i3 == i) {
                    fragment.f2464B = i;
                    fragment.f2465C = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2464B + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo3728e(new C1044a(i2, fragment));
    }

    /* renamed from: k */
    public C1043w mo3361k(Fragment fragment) {
        mo3728e(new C1044a(3, fragment));
        return this;
    }

    /* renamed from: l */
    public C1043w mo3730l(boolean z) {
        this.f2832r = z;
        return this;
    }
}
