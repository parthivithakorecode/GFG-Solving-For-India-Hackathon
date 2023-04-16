package p066io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import p066io.flutter.embedding.android.C2911g;

/* renamed from: io.flutter.plugin.platform.b */
public class C2999b extends C2911g {

    /* renamed from: l */
    private C2998a f19957l;

    public C2999b(Context context, int i, int i2, C2998a aVar) {
        super(context, i, i2, C2911g.C2913b.overlay);
        this.f19957l = aVar;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        C2998a aVar = this.f19957l;
        if (aVar == null || !aVar.mo13637a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
