package p066io.flutter.embedding.android;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

/* renamed from: io.flutter.embedding.android.j */
public final /* synthetic */ class C2919j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C2919j f19716a = new C2919j();

    private /* synthetic */ C2919j() {
    }

    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}
