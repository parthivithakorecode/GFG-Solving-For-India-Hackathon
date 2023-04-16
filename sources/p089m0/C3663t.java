package p089m0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1235a;
import java.util.Collections;
import java.util.List;
import p096n0.C3756i;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: m0.t */
public abstract class C3663t {
    protected C3663t() {
    }

    /* renamed from: d */
    public static C3663t m25252d(Context context) {
        return C3756i.m25542k(context);
    }

    /* renamed from: e */
    public static void m25253e(Context context, C1235a aVar) {
        C3756i.m25540e(context, aVar);
    }

    /* renamed from: a */
    public abstract C3651m mo14823a(String str);

    /* renamed from: b */
    public abstract C3651m mo14824b(List<? extends C3664u> list);

    /* renamed from: c */
    public final C3651m mo14825c(C3664u uVar) {
        return mo14824b(Collections.singletonList(uVar));
    }
}
