package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.x0 */
public class C0532x0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1685c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0532x0>> f1686d;

    /* renamed from: a */
    private final Resources f1687a;

    /* renamed from: b */
    private final Resources.Theme f1688b;

    private C0532x0(Context context) {
        super(context);
        if (C0464i1.m1911c()) {
            C0464i1 i1Var = new C0464i1(this, context.getResources());
            this.f1687a = i1Var;
            Resources.Theme newTheme = i1Var.newTheme();
            this.f1688b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1687a = new C0536z0(this, context.getResources());
        this.f1688b = null;
    }

    /* renamed from: a */
    private static boolean m2167a(Context context) {
        if ((context instanceof C0532x0) || (context.getResources() instanceof C0536z0) || (context.getResources() instanceof C0464i1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0464i1.m1911c();
    }

    /* renamed from: b */
    public static Context m2168b(Context context) {
        if (!m2167a(context)) {
            return context;
        }
        synchronized (f1685c) {
            ArrayList<WeakReference<C0532x0>> arrayList = f1686d;
            if (arrayList == null) {
                f1686d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1686d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1686d.remove(size);
                    }
                }
                for (int size2 = f1686d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1686d.get(size2);
                    C0532x0 x0Var = weakReference2 != null ? (C0532x0) weakReference2.get() : null;
                    if (x0Var != null && x0Var.getBaseContext() == context) {
                        return x0Var;
                    }
                }
            }
            C0532x0 x0Var2 = new C0532x0(context);
            f1686d.add(new WeakReference(x0Var2));
            return x0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1687a.getAssets();
    }

    public Resources getResources() {
        return this.f1687a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1688b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1688b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
