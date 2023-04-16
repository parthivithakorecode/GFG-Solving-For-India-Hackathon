package androidx.emoji2.text;

import androidx.emoji2.text.C0911e;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.f */
public final /* synthetic */ class C0922f implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ EmojiCompatInitializer.C0899b f2409f;

    /* renamed from: g */
    public final /* synthetic */ C0911e.C0920h f2410g;

    /* renamed from: h */
    public final /* synthetic */ ThreadPoolExecutor f2411h;

    public /* synthetic */ C0922f(EmojiCompatInitializer.C0899b bVar, C0911e.C0920h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2409f = bVar;
        this.f2410g = hVar;
        this.f2411h = threadPoolExecutor;
    }

    public final void run() {
        this.f2409f.m3698d(this.f2410g, this.f2411h);
    }
}
