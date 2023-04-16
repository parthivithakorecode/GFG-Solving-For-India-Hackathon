package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.C0738a;
import java.util.concurrent.Executor;

public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, C0738a<WindowLayoutInfo> aVar);

    void unregisterLayoutChangeCallback(C0738a<WindowLayoutInfo> aVar);
}
