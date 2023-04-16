package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0701e;
import androidx.core.util.C0743e;
import androidx.emoji2.text.C0911e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
public final class C0905c {

    /* renamed from: androidx.emoji2.text.c$a */
    public static class C0906a {

        /* renamed from: a */
        private final C0907b f2374a;

        public C0906a(C0907b bVar) {
            this.f2374a = bVar == null ? m3712e() : bVar;
        }

        /* renamed from: a */
        private C0911e.C0915c m3709a(Context context, C0701e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C0928j(context, eVar);
        }

        /* renamed from: b */
        private List<List<byte[]>> m3710b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C0701e m3711d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0701e(str, str2, "emojicompat-emoji-font", m3710b(this.f2374a.mo3109b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C0907b m3712e() {
            int i = Build.VERSION.SDK_INT;
            return i >= 28 ? new C0909d() : i >= 19 ? new C0908c() : new C0907b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m3713f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                r0 = 1
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0905c.C0906a.m3713f(android.content.pm.ProviderInfo):boolean");
        }

        /* renamed from: g */
        private ProviderInfo m3714g(PackageManager packageManager) {
            for (ResolveInfo a : this.f2374a.mo3110c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a2 = this.f2374a.mo3108a(a);
                if (m3713f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C0911e.C0915c mo3106c(Context context) {
            return m3709a(context, mo3107h(context));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0701e mo3107h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C0743e.m2959g(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = m3714g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return m3711d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    public static class C0907b {
        /* renamed from: a */
        public ProviderInfo mo3108a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        /* renamed from: b */
        public Signature[] mo3109b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3110c(PackageManager packageManager, Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static class C0908c extends C0907b {
        /* renamed from: a */
        public ProviderInfo mo3108a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3110c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    public static class C0909d extends C0908c {
        /* renamed from: b */
        public Signature[] mo3109b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C0928j m3708a(Context context) {
        return (C0928j) new C0906a((C0907b) null).mo3106c(context);
    }
}
