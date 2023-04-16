package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C0659e;
import androidx.core.util.C0743e;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.provider.g */
public class C0708g {

    /* renamed from: androidx.core.provider.g$a */
    public static class C0709a {

        /* renamed from: a */
        private final int f2059a;

        /* renamed from: b */
        private final C0710b[] f2060b;

        @Deprecated
        public C0709a(int i, C0710b[] bVarArr) {
            this.f2059a = i;
            this.f2060b = bVarArr;
        }

        /* renamed from: a */
        static C0709a m2874a(int i, C0710b[] bVarArr) {
            return new C0709a(i, bVarArr);
        }

        /* renamed from: b */
        public C0710b[] mo2713b() {
            return this.f2060b;
        }

        /* renamed from: c */
        public int mo2714c() {
            return this.f2059a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    public static class C0710b {

        /* renamed from: a */
        private final Uri f2061a;

        /* renamed from: b */
        private final int f2062b;

        /* renamed from: c */
        private final int f2063c;

        /* renamed from: d */
        private final boolean f2064d;

        /* renamed from: e */
        private final int f2065e;

        @Deprecated
        public C0710b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2061a = (Uri) C0743e.m2958f(uri);
            this.f2062b = i;
            this.f2063c = i2;
            this.f2064d = z;
            this.f2065e = i3;
        }

        /* renamed from: a */
        static C0710b m2877a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C0710b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo2715b() {
            return this.f2065e;
        }

        /* renamed from: c */
        public int mo2716c() {
            return this.f2062b;
        }

        /* renamed from: d */
        public Uri mo2717d() {
            return this.f2061a;
        }

        /* renamed from: e */
        public int mo2718e() {
            return this.f2063c;
        }

        /* renamed from: f */
        public boolean mo2719f() {
            return this.f2064d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    public static class C0711c {
        /* renamed from: a */
        public void mo2655a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo2656b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m2871a(Context context, CancellationSignal cancellationSignal, C0710b[] bVarArr) {
        return C0659e.m2728b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static C0709a m2872b(Context context, CancellationSignal cancellationSignal, C0701e eVar) {
        return C0699d.m2849e(context, eVar, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m2873c(Context context, C0701e eVar, int i, boolean z, int i2, Handler handler, C0711c cVar) {
        C0694a aVar = new C0694a(cVar, handler);
        return z ? C0702f.m2865e(context, eVar, aVar, i, i2) : C0702f.m2864d(context, eVar, i, (Executor) null, aVar);
    }
}
