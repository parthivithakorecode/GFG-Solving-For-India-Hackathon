package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.e */
public final /* synthetic */ class C1218e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f3303a;

    public /* synthetic */ C1218e(Set set) {
        this.f3303a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m27644translateActivityPredicates$lambda6(this.f3303a, (Activity) obj);
    }
}
