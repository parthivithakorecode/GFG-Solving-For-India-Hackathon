package p036e4;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0128c;
import p036e4.C2568h;
import p064i4.C2848b;
import p132s3.C4047a;

/* renamed from: e4.i */
public class C2572i implements C4047a, C2568h.C2569a {

    /* renamed from: a */
    private Context f18690a;

    /* renamed from: e4.i$a */
    static /* synthetic */ class C2573a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18691a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e4.h$c[] r0 = p036e4.C2568h.C2571c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18691a = r0
                e4.h$c r1 = p036e4.C2568h.C2571c.root     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x001d }
                e4.h$c r1 = p036e4.C2568h.C2571c.music     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e4.h$c r1 = p036e4.C2568h.C2571c.podcasts     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e4.h$c r1 = p036e4.C2568h.C2571c.ringtones     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x003e }
                e4.h$c r1 = p036e4.C2568h.C2571c.alarms     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e4.h$c r1 = p036e4.C2568h.C2571c.notifications     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e4.h$c r1 = p036e4.C2568h.C2571c.pictures     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e4.h$c r1 = p036e4.C2568h.C2571c.movies     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x006c }
                e4.h$c r1 = p036e4.C2568h.C2571c.downloads     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e4.h$c r1 = p036e4.C2568h.C2571c.dcim     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18691a     // Catch:{ NoSuchFieldError -> 0x0084 }
                e4.h$c r1 = p036e4.C2568h.C2571c.documents     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e4.C2572i.C2573a.<clinit>():void");
        }
    }

    /* renamed from: g */
    private String m21251g() {
        return C2848b.m22349d(this.f18690a);
    }

    /* renamed from: h */
    private String m21252h() {
        return C2848b.m22348c(this.f18690a);
    }

    /* renamed from: i */
    private List<String> m21253i() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f18690a.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f18690a.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private List<String> m21254j(C2568h.C2571c cVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f18690a.getExternalFilesDirs(m21257m(cVar))) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f18690a.getExternalFilesDir(m21257m(cVar));
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private String m21255k() {
        File externalFilesDir = this.f18690a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: l */
    private String m21256l() {
        return this.f18690a.getCacheDir().getPath();
    }

    /* renamed from: m */
    private String m21257m(C2568h.C2571c cVar) {
        switch (C2573a.f18691a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    /* renamed from: n */
    private void m21258n(C0128c cVar, Context context) {
        cVar.mo313b();
        try {
            C2567g.m21242n(cVar, this);
        } catch (Exception e) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e);
        }
        this.f18690a = context;
    }

    /* renamed from: a */
    public String mo12465a() {
        return m21256l();
    }

    /* renamed from: b */
    public String mo12466b() {
        return m21252h();
    }

    /* renamed from: c */
    public List<String> mo12467c() {
        return m21253i();
    }

    /* renamed from: d */
    public String mo12468d() {
        return m21251g();
    }

    /* renamed from: e */
    public List<String> mo12469e(C2568h.C2571c cVar) {
        return m21254j(cVar);
    }

    /* renamed from: f */
    public String mo12470f() {
        return m21255k();
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        m21258n(bVar.mo15540b(), bVar.mo15539a());
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C2567g.m21242n(bVar.mo15540b(), (C2568h.C2569a) null);
    }
}
