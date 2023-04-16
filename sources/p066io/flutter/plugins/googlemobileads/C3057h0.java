package p066io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import java.util.Locale;
import p005a4.C0157r;
import p066io.flutter.plugin.platform.C3006e;
import p066io.flutter.plugin.platform.C3007f;
import p066io.flutter.plugin.platform.C3008g;
import p099n3.C3768b;

/* renamed from: io.flutter.plugins.googlemobileads.h0 */
final class C3057h0 extends C3008g {

    /* renamed from: b */
    private final C3028a f20118b;

    /* renamed from: io.flutter.plugins.googlemobileads.h0$a */
    class C3058a implements C3007f {

        /* renamed from: a */
        final /* synthetic */ Context f20119a;

        C3058a(Context context) {
            this.f20119a = context;
        }

        /* renamed from: a */
        public View mo13659a() {
            return new View(this.f20119a);
        }

        /* renamed from: b */
        public void mo13660b() {
        }

        /* renamed from: c */
        public /* synthetic */ void mo13661c() {
            C3006e.m23245d(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo13662d(View view) {
            C3006e.m23242a(this, view);
        }

        /* renamed from: e */
        public /* synthetic */ void mo13663e() {
            C3006e.m23243b(this);
        }

        /* renamed from: f */
        public /* synthetic */ void mo13664f() {
            C3006e.m23244c(this);
        }
    }

    public C3057h0(C3028a aVar) {
        super(C0157r.f281a);
        this.f20118b = aVar;
    }

    /* renamed from: c */
    private static C3007f m23488c(Context context, int i) {
        C3768b.m25588b(C3057h0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", new Object[]{Integer.valueOf(i)}));
        return new C3058a(context);
    }

    /* renamed from: a */
    public C3007f mo13665a(Context context, int i, Object obj) {
        Integer num = (Integer) obj;
        C3042e b = this.f20118b.mo13743b(num.intValue());
        return (b == null || b.mo13784c() == null) ? m23488c(context, num.intValue()) : b.mo13784c();
    }
}
