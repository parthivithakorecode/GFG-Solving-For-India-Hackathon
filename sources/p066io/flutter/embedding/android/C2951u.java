package p066io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.flutter.embedding.android.u */
public final class C2951u {

    /* renamed from: c */
    private static C2951u f19800c;

    /* renamed from: a */
    private final LongSparseArray<MotionEvent> f19801a = new LongSparseArray<>();

    /* renamed from: b */
    private final PriorityQueue<Long> f19802b = new PriorityQueue<>();

    /* renamed from: io.flutter.embedding.android.u$a */
    public static class C2952a {

        /* renamed from: b */
        private static final AtomicLong f19803b = new AtomicLong(0);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f19804a;

        private C2952a(long j) {
            this.f19804a = j;
        }

        /* renamed from: b */
        public static C2952a m23014b() {
            return m23015c(f19803b.incrementAndGet());
        }

        /* renamed from: c */
        public static C2952a m23015c(long j) {
            return new C2952a(j);
        }

        /* renamed from: d */
        public long mo13402d() {
            return this.f19804a;
        }
    }

    private C2951u() {
    }

    /* renamed from: a */
    public static C2951u m23010a() {
        if (f19800c == null) {
            f19800c = new C2951u();
        }
        return f19800c;
    }

    /* renamed from: b */
    public MotionEvent mo13400b(C2952a aVar) {
        while (!this.f19802b.isEmpty() && this.f19802b.peek().longValue() < aVar.f19804a) {
            this.f19801a.remove(this.f19802b.poll().longValue());
        }
        if (!this.f19802b.isEmpty() && this.f19802b.peek().longValue() == aVar.f19804a) {
            this.f19802b.poll();
        }
        MotionEvent motionEvent = this.f19801a.get(aVar.f19804a);
        this.f19801a.remove(aVar.f19804a);
        return motionEvent;
    }

    /* renamed from: c */
    public C2952a mo13401c(MotionEvent motionEvent) {
        C2952a b = C2952a.m23014b();
        this.f19801a.put(b.f19804a, MotionEvent.obtain(motionEvent));
        this.f19802b.add(Long.valueOf(b.f19804a));
        return b;
    }
}
