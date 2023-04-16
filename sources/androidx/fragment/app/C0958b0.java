package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.b0 */
final class C0958b0 extends Writer {

    /* renamed from: f */
    private final String f2571f;

    /* renamed from: g */
    private StringBuilder f2572g = new StringBuilder(128);

    C0958b0(String str) {
        this.f2571f = str;
    }

    /* renamed from: d */
    private void m4021d() {
        if (this.f2572g.length() > 0) {
            Log.d(this.f2571f, this.f2572g.toString());
            StringBuilder sb = this.f2572g;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4021d();
    }

    public void flush() {
        m4021d();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4021d();
            } else {
                this.f2572g.append(c);
            }
        }
    }
}
