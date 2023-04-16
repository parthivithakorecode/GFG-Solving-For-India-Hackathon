package p005a4;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: a4.t */
public final class C0160t implements C0143i<String> {

    /* renamed from: a */
    private static final Charset f286a = Charset.forName("UTF8");

    /* renamed from: b */
    public static final C0160t f287b = new C0160t();

    private C0160t() {
    }

    /* renamed from: c */
    public String mo324b(ByteBuffer byteBuffer) {
        int i;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f286a);
    }

    /* renamed from: d */
    public ByteBuffer mo323a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f286a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
