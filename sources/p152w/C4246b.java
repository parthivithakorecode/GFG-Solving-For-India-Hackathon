package p152w;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0938n;

/* renamed from: w.b */
final class C4246b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f22523a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f22524b;

    /* renamed from: c */
    private static Class<?> f22525c;

    @SuppressLint({"PrivateApi"})
    private C4246b() {
        try {
            f22525c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C4246b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f22524b == null) {
            synchronized (f22523a) {
                if (f22524b == null) {
                    f22524b = new C4246b();
                }
            }
        }
        return f22524b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f22525c;
        return cls != null ? C0938n.m3832c(cls, charSequence) : super.newEditable(charSequence);
    }
}
