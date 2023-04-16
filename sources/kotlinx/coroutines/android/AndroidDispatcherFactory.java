package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.C3353e;
import kotlinx.coroutines.internal.C3416u;
import p016b5.C1317a2;
import p023c5.C1444a;
import p023c5.C1446c;

public final class AndroidDispatcherFactory implements C3416u {
    public C1317a2 createDispatcher(List<? extends C3416u> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C1444a(C1446c.m5642a(mainLooper, true), (String) null, 2, (C3353e) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
