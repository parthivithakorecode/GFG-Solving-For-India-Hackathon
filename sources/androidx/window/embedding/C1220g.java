package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

/* renamed from: androidx.window.embedding.g */
public final /* synthetic */ class C1220g implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f3305f;

    /* renamed from: g */
    public final /* synthetic */ List f3306g;

    public /* synthetic */ C1220g(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f3305f = splitListenerWrapper;
        this.f3306g = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m27647accept$lambda1(this.f3305f, this.f3306g);
    }
}
