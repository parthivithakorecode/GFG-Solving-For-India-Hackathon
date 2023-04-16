package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.c */
public final /* synthetic */ class C1216c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ EmbeddingAdapter f3300a;

    /* renamed from: b */
    public final /* synthetic */ Set f3301b;

    public /* synthetic */ C1216c(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f3300a = embeddingAdapter;
        this.f3301b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m27643translateActivityPairPredicates$lambda1(this.f3300a, this.f3301b, (Pair) obj);
    }
}
