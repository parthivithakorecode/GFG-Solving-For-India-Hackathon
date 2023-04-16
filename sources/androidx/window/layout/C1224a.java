package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

/* renamed from: androidx.window.layout.a */
public final /* synthetic */ class C1224a implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f3307f;

    /* renamed from: g */
    public final /* synthetic */ WindowLayoutInfo f3308g;

    public /* synthetic */ C1224a(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f3307f = windowLayoutChangeCallbackWrapper;
        this.f3308g = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m27648accept$lambda0(this.f3307f, this.f3308g);
    }
}
