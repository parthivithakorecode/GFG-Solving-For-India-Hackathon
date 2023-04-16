package p066io.flutter.embedding.android;

import android.app.Activity;
import androidx.core.util.C0738a;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* renamed from: io.flutter.embedding.android.z */
public class C2957z {

    /* renamed from: a */
    final WindowInfoTrackerCallbackAdapter f19812a;

    public C2957z(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f19812a = windowInfoTrackerCallbackAdapter;
    }

    /* renamed from: a */
    public void mo13403a(Activity activity, Executor executor, C0738a<WindowLayoutInfo> aVar) {
        this.f19812a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    /* renamed from: b */
    public void mo13404b(C0738a<WindowLayoutInfo> aVar) {
        this.f19812a.removeWindowLayoutInfoListener(aVar);
    }
}
