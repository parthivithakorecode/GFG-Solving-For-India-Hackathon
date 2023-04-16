package p137t2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p084l2.C3475b1;

/* renamed from: t2.a */
public class C4061a {

    /* renamed from: a */
    private final boolean f22261a;

    /* renamed from: b */
    private final int f22262b;

    /* renamed from: t2.a$a */
    public static class C4062a {

        /* renamed from: a */
        private final List<String> f22263a = new ArrayList();

        /* renamed from: b */
        private final Context f22264b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f22265c = 0;

        /* renamed from: d */
        private boolean f22266d;

        public C4062a(Context context) {
            this.f22264b = context.getApplicationContext();
        }

        /* renamed from: a */
        public C4062a mo15568a(String str) {
            this.f22263a.add(str);
            return this;
        }

        /* renamed from: b */
        public C4061a mo15569b() {
            boolean z = false;
            if ((C3475b1.m24862c() || this.f22263a.contains(C3475b1.m24860a(this.f22264b))) || this.f22266d) {
                z = true;
            }
            return new C4061a(z, this);
        }

        /* renamed from: c */
        public C4062a mo15570c(int i) {
            this.f22265c = i;
            return this;
        }
    }

    private C4061a(boolean z, C4062a aVar) {
        this.f22261a = z;
        this.f22262b = aVar.f22265c;
    }

    /* renamed from: a */
    public int mo15566a() {
        return this.f22262b;
    }

    /* renamed from: b */
    public boolean mo15567b() {
        return this.f22261a;
    }
}
