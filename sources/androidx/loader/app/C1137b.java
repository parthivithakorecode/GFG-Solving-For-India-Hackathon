package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.core.util.C0739b;
import androidx.lifecycle.C1081d0;
import androidx.lifecycle.C1083e0;
import androidx.lifecycle.C1094f0;
import androidx.lifecycle.C1098h0;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1117s;
import androidx.lifecycle.C1118t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p001a0.C0005a;
import p011b0.C1290a;
import p102o.C3815h;

/* renamed from: androidx.loader.app.b */
class C1137b extends C1136a {

    /* renamed from: c */
    static boolean f3028c = false;

    /* renamed from: a */
    private final C1110m f3029a;

    /* renamed from: b */
    private final C1139b f3030b;

    /* renamed from: androidx.loader.app.b$a */
    public static class C1138a<D> extends C1117s<D> {

        /* renamed from: l */
        private final int f3031l;

        /* renamed from: m */
        private final Bundle f3032m;

        /* renamed from: n */
        private final C1290a<D> f3033n;

        /* renamed from: o */
        private C1110m f3034o;

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo3785f() {
            if (C1137b.f3028c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo3786g() {
            if (C1137b.f3028c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* renamed from: i */
        public void mo3788i(C1118t<? super D> tVar) {
            super.mo3788i(tVar);
            this.f3034o = null;
        }

        /* renamed from: j */
        public void mo3789j(D d) {
            super.mo3789j(d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C1290a<D> mo3886k(boolean z) {
            if (C1137b.f3028c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: l */
        public void mo3887l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3031l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3032m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3033n);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3888m() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3031l);
            sb.append(" : ");
            C0739b.m2945a(this.f3033n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    static class C1139b extends C1081d0 {

        /* renamed from: f */
        private static final C1083e0.C1087b f3035f = new C1140a();

        /* renamed from: d */
        private C3815h<C1138a> f3036d = new C3815h<>();

        /* renamed from: e */
        private boolean f3037e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class C1140a implements C1083e0.C1087b {
            C1140a() {
            }

            /* renamed from: a */
            public <T extends C1081d0> T mo12a(Class<T> cls) {
                return new C1139b();
            }

            /* renamed from: b */
            public /* synthetic */ C1081d0 mo13b(Class cls, C0005a aVar) {
                return C1094f0.m4557b(this, cls, aVar);
            }
        }

        C1139b() {
        }

        /* renamed from: f */
        static C1139b m4651f(C1098h0 h0Var) {
            return (C1139b) new C1083e0(h0Var, f3035f).mo3822a(C1139b.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3657d() {
            super.mo3657d();
            int j = this.f3036d.mo15196j();
            for (int i = 0; i < j; i++) {
                this.f3036d.mo15197l(i).mo3886k(true);
            }
            this.f3036d.mo15189b();
        }

        /* renamed from: e */
        public void mo3890e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3036d.mo15196j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f3036d.mo15196j(); i++) {
                    C1138a l = this.f3036d.mo15197l(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3036d.mo15194g(i));
                    printWriter.print(": ");
                    printWriter.println(l.toString());
                    l.mo3887l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3891g() {
            int j = this.f3036d.mo15196j();
            for (int i = 0; i < j; i++) {
                this.f3036d.mo15197l(i).mo3888m();
            }
        }
    }

    C1137b(C1110m mVar, C1098h0 h0Var) {
        this.f3029a = mVar;
        this.f3030b = C1139b.m4651f(h0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo3883a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3030b.mo3890e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo3884c() {
        this.f3030b.mo3891g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0739b.m2945a(this.f3029a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
