package p048g2;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import p003a2.C0092o;
import p160x1.C4288j;

/* renamed from: g2.c */
public abstract class C2638c<T> {

    /* renamed from: a */
    private final String f19010a;

    /* renamed from: b */
    private T f19011b;

    /* renamed from: g2.c$a */
    public static class C2639a extends Exception {
        public C2639a(@RecentlyNonNull String str) {
            super(str);
        }

        public C2639a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    protected C2638c(@RecentlyNonNull String str) {
        this.f19010a = str;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: a */
    public abstract T mo8020a(@RecentlyNonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: b */
    public final T mo12521b(@RecentlyNonNull Context context) {
        if (this.f19011b == null) {
            C0092o.m313i(context);
            Context c = C4288j.m26857c(context);
            if (c != null) {
                try {
                    this.f19011b = mo8020a((IBinder) c.getClassLoader().loadClass(this.f19010a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C2639a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C2639a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C2639a("Could not access creator.", e3);
                }
            } else {
                throw new C2639a("Could not get remote context.");
            }
        }
        return this.f19011b;
    }
}
