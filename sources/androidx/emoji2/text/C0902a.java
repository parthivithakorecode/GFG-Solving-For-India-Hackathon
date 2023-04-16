package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
public final /* synthetic */ class C0902a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f2373a;

    public /* synthetic */ C0902a(String str) {
        this.f2373a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C0903b.m3705c(this.f2373a, runnable);
    }
}
