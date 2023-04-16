package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.f */
public final /* synthetic */ class C1219f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f3304a;

    public /* synthetic */ C1219f(Set set) {
        this.f3304a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m27645translateIntentPredicates$lambda8(this.f3304a, (Intent) obj);
    }
}
