package p069j1;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j1.d1 */
public final class C3150d1 {

    /* renamed from: a */
    final Map<Integer, Bitmap> f20452a = new ConcurrentHashMap();

    /* renamed from: b */
    private final AtomicInteger f20453b = new AtomicInteger(0);

    /* renamed from: a */
    public final Bitmap mo13993a(Integer num) {
        return this.f20452a.get(num);
    }
}
