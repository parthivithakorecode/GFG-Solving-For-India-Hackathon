package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.d */
public final /* synthetic */ class C1217d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ SplitRule f3302a;

    public /* synthetic */ C1217d(SplitRule splitRule) {
        this.f3302a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m27646translateParentMetricsPredicate$lambda4(this.f3302a, (WindowMetrics) obj);
    }
}
