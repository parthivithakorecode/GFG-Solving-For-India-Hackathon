package p041f2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import androidx.core.util.C0742d;
import p034e2.C2555l;

/* renamed from: f2.b */
public class C2605b {
    @RecentlyNonNull

    /* renamed from: a */
    protected final Context f18969a;

    public C2605b(@RecentlyNonNull Context context) {
        this.f18969a = context;
    }

    /* renamed from: a */
    public int mo12491a(@RecentlyNonNull String str) {
        return this.f18969a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo12492b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f18969a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public ApplicationInfo mo12493c(@RecentlyNonNull String str, int i) {
        return this.f18969a.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public CharSequence mo12494d(@RecentlyNonNull String str) {
        return this.f18969a.getPackageManager().getApplicationLabel(this.f18969a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    /* renamed from: e */
    public C0742d<CharSequence, Drawable> mo12495e(@RecentlyNonNull String str) {
        ApplicationInfo applicationInfo = this.f18969a.getPackageManager().getApplicationInfo(str, 0);
        return C0742d.m2952a(this.f18969a.getPackageManager().getApplicationLabel(applicationInfo), this.f18969a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @RecentlyNonNull
    /* renamed from: f */
    public PackageInfo mo12496f(@RecentlyNonNull String str, int i) {
        return this.f18969a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: g */
    public boolean mo12497g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2604a.m21291a(this.f18969a);
        }
        if (!C2555l.m21216j() || (nameForUid = this.f18969a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f18969a.getPackageManager().isInstantApp(nameForUid);
    }
}
