package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C0743e;
import java.util.Objects;

/* renamed from: androidx.core.view.c */
public final class C0769c {

    /* renamed from: a */
    private final C0775f f2182a;

    /* renamed from: androidx.core.view.c$a */
    public static final class C0770a {

        /* renamed from: a */
        private final C0772c f2183a;

        public C0770a(ClipData clipData, int i) {
            this.f2183a = Build.VERSION.SDK_INT >= 31 ? new C0771b(clipData, i) : new C0773d(clipData, i);
        }

        /* renamed from: a */
        public C0769c mo2831a() {
            return this.f2183a.mo2835a();
        }

        /* renamed from: b */
        public C0770a mo2832b(Bundle bundle) {
            this.f2183a.mo2836b(bundle);
            return this;
        }

        /* renamed from: c */
        public C0770a mo2833c(int i) {
            this.f2183a.mo2838d(i);
            return this;
        }

        /* renamed from: d */
        public C0770a mo2834d(Uri uri) {
            this.f2183a.mo2837c(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.c$b */
    private static final class C0771b implements C0772c {

        /* renamed from: a */
        private final ContentInfo.Builder f2184a;

        C0771b(ClipData clipData, int i) {
            this.f2184a = new ContentInfo.Builder(clipData, i);
        }

        /* renamed from: a */
        public C0769c mo2835a() {
            return new C0769c(new C0774e(this.f2184a.build()));
        }

        /* renamed from: b */
        public void mo2836b(Bundle bundle) {
            this.f2184a.setExtras(bundle);
        }

        /* renamed from: c */
        public void mo2837c(Uri uri) {
            this.f2184a.setLinkUri(uri);
        }

        /* renamed from: d */
        public void mo2838d(int i) {
            this.f2184a.setFlags(i);
        }
    }

    /* renamed from: androidx.core.view.c$c */
    private interface C0772c {
        /* renamed from: a */
        C0769c mo2835a();

        /* renamed from: b */
        void mo2836b(Bundle bundle);

        /* renamed from: c */
        void mo2837c(Uri uri);

        /* renamed from: d */
        void mo2838d(int i);
    }

    /* renamed from: androidx.core.view.c$d */
    private static final class C0773d implements C0772c {

        /* renamed from: a */
        ClipData f2185a;

        /* renamed from: b */
        int f2186b;

        /* renamed from: c */
        int f2187c;

        /* renamed from: d */
        Uri f2188d;

        /* renamed from: e */
        Bundle f2189e;

        C0773d(ClipData clipData, int i) {
            this.f2185a = clipData;
            this.f2186b = i;
        }

        /* renamed from: a */
        public C0769c mo2835a() {
            return new C0769c(new C0776g(this));
        }

        /* renamed from: b */
        public void mo2836b(Bundle bundle) {
            this.f2189e = bundle;
        }

        /* renamed from: c */
        public void mo2837c(Uri uri) {
            this.f2188d = uri;
        }

        /* renamed from: d */
        public void mo2838d(int i) {
            this.f2187c = i;
        }
    }

    /* renamed from: androidx.core.view.c$e */
    private static final class C0774e implements C0775f {

        /* renamed from: a */
        private final ContentInfo f2190a;

        C0774e(ContentInfo contentInfo) {
            this.f2190a = (ContentInfo) C0743e.m2958f(contentInfo);
        }

        /* renamed from: a */
        public ClipData mo2839a() {
            return this.f2190a.getClip();
        }

        /* renamed from: b */
        public int mo2840b() {
            return this.f2190a.getFlags();
        }

        /* renamed from: c */
        public ContentInfo mo2841c() {
            return this.f2190a;
        }

        /* renamed from: d */
        public int mo2842d() {
            return this.f2190a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2190a + "}";
        }
    }

    /* renamed from: androidx.core.view.c$f */
    private interface C0775f {
        /* renamed from: a */
        ClipData mo2839a();

        /* renamed from: b */
        int mo2840b();

        /* renamed from: c */
        ContentInfo mo2841c();

        /* renamed from: d */
        int mo2842d();
    }

    /* renamed from: androidx.core.view.c$g */
    private static final class C0776g implements C0775f {

        /* renamed from: a */
        private final ClipData f2191a;

        /* renamed from: b */
        private final int f2192b;

        /* renamed from: c */
        private final int f2193c;

        /* renamed from: d */
        private final Uri f2194d;

        /* renamed from: e */
        private final Bundle f2195e;

        C0776g(C0773d dVar) {
            this.f2191a = (ClipData) C0743e.m2958f(dVar.f2185a);
            this.f2192b = C0743e.m2954b(dVar.f2186b, 0, 5, "source");
            this.f2193c = C0743e.m2957e(dVar.f2187c, 1);
            this.f2194d = dVar.f2188d;
            this.f2195e = dVar.f2189e;
        }

        /* renamed from: a */
        public ClipData mo2839a() {
            return this.f2191a;
        }

        /* renamed from: b */
        public int mo2840b() {
            return this.f2193c;
        }

        /* renamed from: c */
        public ContentInfo mo2841c() {
            return null;
        }

        /* renamed from: d */
        public int mo2842d() {
            return this.f2192b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2191a.getDescription());
            sb.append(", source=");
            sb.append(C0769c.m3049e(this.f2192b));
            sb.append(", flags=");
            sb.append(C0769c.m3048a(this.f2193c));
            String str2 = "";
            if (this.f2194d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f2194d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f2195e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    C0769c(C0775f fVar) {
        this.f2182a = fVar;
    }

    /* renamed from: a */
    static String m3048a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    static String m3049e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C0769c m3050g(ContentInfo contentInfo) {
        return new C0769c(new C0774e(contentInfo));
    }

    /* renamed from: b */
    public ClipData mo2826b() {
        return this.f2182a.mo2839a();
    }

    /* renamed from: c */
    public int mo2827c() {
        return this.f2182a.mo2840b();
    }

    /* renamed from: d */
    public int mo2828d() {
        return this.f2182a.mo2842d();
    }

    /* renamed from: f */
    public ContentInfo mo2829f() {
        ContentInfo c = this.f2182a.mo2841c();
        Objects.requireNonNull(c);
        ContentInfo contentInfo = c;
        return c;
    }

    public String toString() {
        return this.f2182a.toString();
    }
}
