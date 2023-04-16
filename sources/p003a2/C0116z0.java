package p003a2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: a2.z0 */
public final class C0116z0 {

    /* renamed from: f */
    private static final Uri f235f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f236a;

    /* renamed from: b */
    private final String f237b;

    /* renamed from: c */
    private final ComponentName f238c = null;

    /* renamed from: d */
    private final int f239d;

    /* renamed from: e */
    private final boolean f240e;

    public C0116z0(String str, String str2, int i, boolean z) {
        C0092o.m310f(str);
        this.f236a = str;
        C0092o.m310f(str2);
        this.f237b = str2;
        this.f239d = i;
        this.f240e = z;
    }

    /* renamed from: a */
    public final String mo296a() {
        return this.f237b;
    }

    /* renamed from: b */
    public final ComponentName mo297b() {
        return this.f238c;
    }

    /* renamed from: c */
    public final int mo298c() {
        return this.f239d;
    }

    /* renamed from: d */
    public final Intent mo299d(Context context) {
        Bundle bundle;
        if (this.f236a == null) {
            return new Intent().setComponent(this.f238c);
        }
        Intent intent = null;
        if (this.f240e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f236a);
            try {
                bundle = context.getContentResolver().call(f235f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(valueOf);
                Log.w("ConnectionStatusConfig", sb.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf2 = String.valueOf(this.f236a);
                Log.w("ConnectionStatusConfig", valueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.f236a).setPackage(this.f237b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0116z0)) {
            return false;
        }
        C0116z0 z0Var = (C0116z0) obj;
        return C0089n.m301a(this.f236a, z0Var.f236a) && C0089n.m301a(this.f237b, z0Var.f237b) && C0089n.m301a(this.f238c, z0Var.f238c) && this.f239d == z0Var.f239d && this.f240e == z0Var.f240e;
    }

    public final int hashCode() {
        return C0089n.m302b(this.f236a, this.f237b, this.f238c, Integer.valueOf(this.f239d), Boolean.valueOf(this.f240e));
    }

    public final String toString() {
        String str = this.f236a;
        if (str != null) {
            return str;
        }
        C0092o.m313i(this.f238c);
        return this.f238c.flattenToString();
    }
}
