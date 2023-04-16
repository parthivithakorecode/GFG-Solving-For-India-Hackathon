package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0608c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.m */
class C0291m {

    /* renamed from: d */
    private static C0291m f696d;

    /* renamed from: a */
    private final Context f697a;

    /* renamed from: b */
    private final LocationManager f698b;

    /* renamed from: c */
    private final C0292a f699c = new C0292a();

    /* renamed from: androidx.appcompat.app.m$a */
    private static class C0292a {

        /* renamed from: a */
        boolean f700a;

        /* renamed from: b */
        long f701b;

        /* renamed from: c */
        long f702c;

        /* renamed from: d */
        long f703d;

        /* renamed from: e */
        long f704e;

        /* renamed from: f */
        long f705f;

        C0292a() {
        }
    }

    C0291m(Context context, LocationManager locationManager) {
        this.f697a = context;
        this.f698b = locationManager;
    }

    /* renamed from: a */
    static C0291m m998a(Context context) {
        if (f696d == null) {
            Context applicationContext = context.getApplicationContext();
            f696d = new C0291m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f696d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m999b() {
        Location location = null;
        Location c = C0608c.m2484b(this.f697a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1000c("network") : null;
        if (C0608c.m2484b(this.f697a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1000c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m1000c(String str) {
        try {
            if (this.f698b.isProviderEnabled(str)) {
                return this.f698b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m1001e() {
        return this.f699c.f705f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m1002f(Location location) {
        long j;
        C0292a aVar = this.f699c;
        long currentTimeMillis = System.currentTimeMillis();
        C0290l b = C0290l.m996b();
        C0290l lVar = b;
        lVar.mo792a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f693a;
        lVar.mo792a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.f695c != 1) {
            z = false;
        }
        long j3 = b.f694b;
        long j4 = j2;
        long j5 = b.f693a;
        long j6 = j3;
        boolean z2 = z;
        b.mo792a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f694b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f700a = z2;
        aVar.f701b = j4;
        aVar.f702c = j6;
        aVar.f703d = j5;
        aVar.f704e = j7;
        aVar.f705f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo793d() {
        C0292a aVar = this.f699c;
        if (m1001e()) {
            return aVar.f700a;
        }
        Location b = m999b();
        if (b != null) {
            m1002f(b);
            return aVar.f700a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
