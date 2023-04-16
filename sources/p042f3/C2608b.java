package p042f3;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p094m5.C3726c;
import p094m5.C3735h;
import p094m5.C3738i;

/* renamed from: f3.b */
final class C2608b extends C3735h {

    /* renamed from: d */
    private final Context f18973d;

    /* renamed from: e */
    private final String f18974e;

    C2608b(Context context, String str) {
        this.f18973d = context;
        this.f18974e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12499b() {
        InputStream inputStream = null;
        try {
            inputStream = this.f18973d.getAssets().open(this.f18974e);
            C3726c cVar = new C3726c(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            C3738i.m25480f(cVar);
        } catch (IOException e) {
            throw new IllegalStateException(this.f18974e + " missing from assets", e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
