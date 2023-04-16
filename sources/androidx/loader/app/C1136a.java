package androidx.loader.app;

import androidx.lifecycle.C1103i0;
import androidx.lifecycle.C1110m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
public abstract class C1136a {
    /* renamed from: b */
    public static <T extends C1110m & C1103i0> C1136a m4639b(T t) {
        return new C1137b(t, ((C1103i0) t).mo497k());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo3883a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo3884c();
}
