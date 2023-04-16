package p095n;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.C0557f;
import androidx.core.content.C0597a;
import java.util.ArrayList;

/* renamed from: n.c */
public final class C3742c {

    /* renamed from: a */
    public final Intent f21577a;

    /* renamed from: b */
    public final Bundle f21578b;

    /* renamed from: n.c$a */
    public static final class C3743a {

        /* renamed from: a */
        private final Intent f21579a;

        /* renamed from: b */
        private ArrayList<Bundle> f21580b;

        /* renamed from: c */
        private Bundle f21581c;

        /* renamed from: d */
        private ArrayList<Bundle> f21582d;

        /* renamed from: e */
        private boolean f21583e;

        public C3743a() {
            this((C3746e) null);
        }

        public C3743a(C3746e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f21579a = intent;
            IBinder iBinder = null;
            this.f21580b = null;
            this.f21581c = null;
            this.f21582d = null;
            this.f21583e = true;
            if (eVar != null) {
                intent.setPackage(eVar.mo14954b().getPackageName());
            }
            Bundle bundle = new Bundle();
            C0557f.m2216b(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.mo14953a() : iBinder);
            intent.putExtras(bundle);
        }

        /* renamed from: a */
        public C3742c mo14951a() {
            ArrayList<Bundle> arrayList = this.f21580b;
            if (arrayList != null) {
                this.f21579a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f21582d;
            if (arrayList2 != null) {
                this.f21579a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f21579a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f21583e);
            return new C3742c(this.f21579a, this.f21581c);
        }
    }

    C3742c(Intent intent, Bundle bundle) {
        this.f21577a = intent;
        this.f21578b = bundle;
    }

    /* renamed from: a */
    public void mo14950a(Context context, Uri uri) {
        this.f21577a.setData(uri);
        C0597a.m2454i(context, this.f21577a, this.f21578b);
    }
}
