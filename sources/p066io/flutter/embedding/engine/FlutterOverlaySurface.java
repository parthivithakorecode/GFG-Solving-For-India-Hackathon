package p066io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* renamed from: io.flutter.embedding.engine.FlutterOverlaySurface */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f19813id;
    private final Surface surface;

    public FlutterOverlaySurface(int i, Surface surface2) {
        this.f19813id = i;
        this.surface = surface2;
    }

    public int getId() {
        return this.f19813id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
