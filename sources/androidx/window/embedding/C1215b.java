package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.b */
public final /* synthetic */ class C1215b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ EmbeddingAdapter f3298a;

    /* renamed from: b */
    public final /* synthetic */ Set f3299b;

    public /* synthetic */ C1215b(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f3298a = embeddingAdapter;
        this.f3299b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m27642translateActivityIntentPredicates$lambda3(this.f3298a, this.f3299b, (Pair) obj);
    }
}
