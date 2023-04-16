package p095n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p000a.C0000a;
import p000a.C0002b;

/* renamed from: n.b */
public class C3740b {

    /* renamed from: a */
    private final C0002b f21573a;

    /* renamed from: b */
    private final ComponentName f21574b;

    /* renamed from: n.b$a */
    class C3741a extends C0000a.C0001a {

        /* renamed from: f */
        private Handler f21575f = new Handler(Looper.getMainLooper());

        C3741a(C3739a aVar) {
        }

        /* renamed from: B4 */
        public void mo1B4(Bundle bundle) {
        }

        /* renamed from: O4 */
        public void mo2O4(int i, Uri uri, boolean z, Bundle bundle) {
        }

        /* renamed from: P2 */
        public void mo3P2(int i, Bundle bundle) {
        }

        /* renamed from: Z1 */
        public void mo4Z1(String str, Bundle bundle) {
        }

        /* renamed from: l4 */
        public void mo5l4(String str, Bundle bundle) {
        }
    }

    C3740b(C0002b bVar, ComponentName componentName) {
        this.f21573a = bVar;
        this.f21574b = componentName;
    }

    /* renamed from: a */
    public static boolean m25484a(Context context, String str, C3744d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    /* renamed from: b */
    public C3746e mo14948b(C3739a aVar) {
        C3741a aVar2 = new C3741a(aVar);
        try {
            if (!this.f21573a.mo9K3(aVar2)) {
                return null;
            }
            return new C3746e(this.f21573a, aVar2, this.f21574b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo14949c(long j) {
        try {
            return this.f21573a.mo8J4(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
