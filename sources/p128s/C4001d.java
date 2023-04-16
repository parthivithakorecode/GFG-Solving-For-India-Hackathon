package p128s;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: s.d */
public final class C4001d {

    /* renamed from: a */
    private final C4004c f22166a;

    /* renamed from: s.d$a */
    private static final class C4002a implements C4004c {

        /* renamed from: a */
        final InputContentInfo f22167a;

        C4002a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f22167a = new InputContentInfo(uri, clipDescription, uri2);
        }

        C4002a(Object obj) {
            this.f22167a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public ClipDescription mo15474a() {
            return this.f22167a.getDescription();
        }

        /* renamed from: b */
        public Object mo15475b() {
            return this.f22167a;
        }

        /* renamed from: c */
        public Uri mo15476c() {
            return this.f22167a.getContentUri();
        }

        /* renamed from: d */
        public void mo15477d() {
            this.f22167a.requestPermission();
        }

        /* renamed from: e */
        public Uri mo15478e() {
            return this.f22167a.getLinkUri();
        }
    }

    /* renamed from: s.d$b */
    private static final class C4003b implements C4004c {

        /* renamed from: a */
        private final Uri f22168a;

        /* renamed from: b */
        private final ClipDescription f22169b;

        /* renamed from: c */
        private final Uri f22170c;

        C4003b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f22168a = uri;
            this.f22169b = clipDescription;
            this.f22170c = uri2;
        }

        /* renamed from: a */
        public ClipDescription mo15474a() {
            return this.f22169b;
        }

        /* renamed from: b */
        public Object mo15475b() {
            return null;
        }

        /* renamed from: c */
        public Uri mo15476c() {
            return this.f22168a;
        }

        /* renamed from: d */
        public void mo15477d() {
        }

        /* renamed from: e */
        public Uri mo15478e() {
            return this.f22170c;
        }
    }

    /* renamed from: s.d$c */
    private interface C4004c {
        /* renamed from: a */
        ClipDescription mo15474a();

        /* renamed from: b */
        Object mo15475b();

        /* renamed from: c */
        Uri mo15476c();

        /* renamed from: d */
        void mo15477d();

        /* renamed from: e */
        Uri mo15478e();
    }

    public C4001d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f22166a = Build.VERSION.SDK_INT >= 25 ? new C4002a(uri, clipDescription, uri2) : new C4003b(uri, clipDescription, uri2);
    }

    private C4001d(C4004c cVar) {
        this.f22166a = cVar;
    }

    /* renamed from: f */
    public static C4001d m26238f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C4001d(new C4002a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri mo15469a() {
        return this.f22166a.mo15476c();
    }

    /* renamed from: b */
    public ClipDescription mo15470b() {
        return this.f22166a.mo15474a();
    }

    /* renamed from: c */
    public Uri mo15471c() {
        return this.f22166a.mo15478e();
    }

    /* renamed from: d */
    public void mo15472d() {
        this.f22166a.mo15477d();
    }

    /* renamed from: e */
    public Object mo15473e() {
        return this.f22166a.mo15475b();
    }
}
