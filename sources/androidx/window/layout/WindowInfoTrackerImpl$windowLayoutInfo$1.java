package androidx.window.layout;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.C3340f;
import kotlin.coroutines.jvm.internal.C3346k;
import kotlin.jvm.internal.C3357i;
import p030d5.C2513f;
import p037e5.C2577c;
import p079k4.C3330q;
import p100n4.C3773d;
import p145u4.C4154p;

@C3340f(mo14340c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", mo14341f = "WindowInfoTrackerImpl.kt", mo14342l = {54, 55}, mo14343m = "invokeSuspend")
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends C3346k implements C4154p<C2577c<? super WindowLayoutInfo>, C3773d<? super C3330q>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, C3773d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m27649invokeSuspend$lambda0(C2513f fVar, WindowLayoutInfo windowLayoutInfo) {
        C3357i.m24507d(windowLayoutInfo, "info");
        fVar.mo12422a(windowLayoutInfo);
    }

    public final C3773d<C3330q> create(Object obj, C3773d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public final Object invoke(C2577c<? super WindowLayoutInfo> cVar, C3773d<? super C3330q> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cVar, dVar)).invokeSuspend(C3330q.f20829a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ all -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p107o4.C3858d.m25871c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r1 = r9.L$2
            d5.g r1 = (p030d5.C2515g) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.a r4 = (androidx.core.util.C0738a) r4
            java.lang.Object r5 = r9.L$0
            e5.c r5 = (p037e5.C2577c) r5
            p079k4.C3325l.m24451b(r10)     // Catch:{ all -> 0x00a0 }
            r10 = r5
            goto L_0x0060
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r9.L$2
            d5.g r1 = (p030d5.C2515g) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.a r4 = (androidx.core.util.C0738a) r4
            java.lang.Object r5 = r9.L$0
            e5.c r5 = (p037e5.C2577c) r5
            p079k4.C3325l.m24451b(r10)     // Catch:{ all -> 0x00a0 }
            r6 = r5
            r5 = r9
            goto L_0x0073
        L_0x0039:
            p079k4.C3325l.m24451b(r10)
            java.lang.Object r10 = r9.L$0
            e5.c r10 = (p037e5.C2577c) r10
            r1 = 10
            d5.e r4 = p030d5.C2512e.DROP_OLDEST
            r5 = 4
            r6 = 0
            d5.f r1 = p030d5.C2516h.m21111b(r1, r4, r6, r5, r6)
            androidx.window.layout.c r4 = new androidx.window.layout.c
            r4.<init>(r1)
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = r5.windowBackend
            android.app.Activity r6 = r9.$activity
            androidx.window.layout.d r7 = androidx.window.layout.C1227d.f3310f
            r5.registerLayoutChangeCallback(r6, r7, r4)
            d5.g r1 = r1.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x0060:
            r5 = r9
        L_0x0061:
            r5.L$0 = r10     // Catch:{ all -> 0x009e }
            r5.L$1 = r4     // Catch:{ all -> 0x009e }
            r5.L$2 = r1     // Catch:{ all -> 0x009e }
            r5.label = r3     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = r1.mo12412a(r5)     // Catch:{ all -> 0x009e }
            if (r6 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r8 = r6
            r6 = r10
            r10 = r8
        L_0x0073:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009e }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009e }
            if (r10 == 0) goto L_0x0092
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x009e }
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch:{ all -> 0x009e }
            r5.L$0 = r6     // Catch:{ all -> 0x009e }
            r5.L$1 = r4     // Catch:{ all -> 0x009e }
            r5.L$2 = r1     // Catch:{ all -> 0x009e }
            r5.label = r2     // Catch:{ all -> 0x009e }
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch:{ all -> 0x009e }
            if (r10 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r10 = r6
            goto L_0x0061
        L_0x0092:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.this$0
            androidx.window.layout.WindowBackend r10 = r10.windowBackend
            r10.unregisterLayoutChangeCallback(r4)
            k4.q r10 = p079k4.C3330q.f20829a
            return r10
        L_0x009e:
            r10 = move-exception
            goto L_0x00a2
        L_0x00a0:
            r10 = move-exception
            r5 = r9
        L_0x00a2:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.this$0
            androidx.window.layout.WindowBackend r0 = r0.windowBackend
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
