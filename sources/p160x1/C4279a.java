package p160x1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p003a2.C0092o;

/* renamed from: x1.a */
public class C4279a implements ServiceConnection {

    /* renamed from: f */
    boolean f22572f = false;

    /* renamed from: g */
    private final BlockingQueue<IBinder> f22573g = new LinkedBlockingQueue();

    @RecentlyNonNull
    /* renamed from: a */
    public IBinder mo15838a(long j, @RecentlyNonNull TimeUnit timeUnit) {
        C0092o.m312h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f22572f) {
            this.f22572f = true;
            IBinder poll = this.f22573g.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f22573g.add(iBinder);
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
