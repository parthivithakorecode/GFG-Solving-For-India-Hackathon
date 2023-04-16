package p066io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: io.flutter.embedding.android.n */
public class C2930n {

    /* renamed from: a */
    long f19755a;

    /* renamed from: b */
    C2931a f19756b;

    /* renamed from: c */
    long f19757c;

    /* renamed from: d */
    long f19758d;

    /* renamed from: e */
    boolean f19759e;

    /* renamed from: f */
    String f19760f;

    /* renamed from: io.flutter.embedding.android.n$a */
    public enum C2931a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: f */
        private long f19765f;

        private C2931a(long j) {
            this.f19765f = j;
        }

        /* renamed from: b */
        public long mo13389b() {
            return this.f19765f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer mo13388a() {
        try {
            String str = this.f19760f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) length);
            allocateDirect.putLong(this.f19755a);
            allocateDirect.putLong(this.f19756b.mo13389b());
            allocateDirect.putLong(this.f19757c);
            allocateDirect.putLong(this.f19758d);
            allocateDirect.putLong(this.f19759e ? 1 : 0);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
