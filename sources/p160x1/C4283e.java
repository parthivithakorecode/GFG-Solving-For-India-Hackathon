package p160x1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.core.app.C0565k;
import androidx.fragment.app.C0990e;
import com.google.android.gms.common.api.GoogleApiActivity;
import p003a2.C0047a0;
import p003a2.C0092o;
import p003a2.C0113y;
import p034e2.C2551h;
import p034e2.C2555l;
import p154w1.C4263a;
import p154w1.C4264b;

/* renamed from: x1.e */
public class C4283e extends C4284f {

    /* renamed from: d */
    public static final int f22585d = C4284f.f22589a;

    /* renamed from: e */
    private static final Object f22586e = new Object();

    /* renamed from: f */
    private static final C4283e f22587f = new C4283e();

    /* renamed from: c */
    private String f22588c;

    /* renamed from: l */
    public static C4283e m26829l() {
        return f22587f;
    }

    @RecentlyNullable
    /* renamed from: b */
    public Intent mo15859b(Context context, int i, String str) {
        return super.mo15859b(context, i, str);
    }

    @RecentlyNullable
    /* renamed from: c */
    public PendingIntent mo15860c(@RecentlyNonNull Context context, int i, int i2) {
        return super.mo15860c(context, i, i2);
    }

    /* renamed from: e */
    public final String mo15861e(int i) {
        return super.mo15861e(i);
    }

    /* renamed from: g */
    public int mo15862g(@RecentlyNonNull Context context) {
        return super.mo15862g(context);
    }

    /* renamed from: h */
    public int mo15863h(@RecentlyNonNull Context context, int i) {
        return super.mo15863h(context, i);
    }

    /* renamed from: i */
    public final boolean mo15864i(int i) {
        return super.mo15864i(i);
    }

    @RecentlyNullable
    /* renamed from: j */
    public Dialog mo15865j(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo15871q(activity, i, C0047a0.m154b(activity, mo15859b(activity, i, "d"), i2), onCancelListener);
    }

    @RecentlyNullable
    /* renamed from: k */
    public PendingIntent mo15866k(@RecentlyNonNull Context context, @RecentlyNonNull C4280b bVar) {
        return bVar.mo15845f() ? bVar.mo15843e() : mo15860c(context, bVar.mo15841c(), 0);
    }

    /* renamed from: m */
    public boolean mo15867m(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog j = mo15865j(activity, i, i2, onCancelListener);
        if (j == null) {
            return false;
        }
        mo15872r(activity, j, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: n */
    public void mo15868n(@RecentlyNonNull Context context, int i) {
        mo15869o(context, i, (String) null, mo15875d(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    /* renamed from: o */
    public final void mo15869o(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo15873s(context);
        } else if (pendingIntent != null) {
            String b = C0113y.m349b(context, i);
            String d = C0113y.m351d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C0092o.m313i(context.getSystemService("notification"));
            C0565k.C0573e L = new C0565k.C0573e(context).mo2430B(true).mo2457l(true).mo2464s(b).mo2440L(new C0565k.C0571c().mo2426x(d));
            if (C2551h.m21195e(context)) {
                C0092o.m315k(C2555l.m21212f());
                L.mo2438J(context.getApplicationInfo().icon).mo2434F(2);
                if (C2551h.m21197g(context)) {
                    L.mo2448a(C4263a.common_full_open_on_phone, resources.getString(C4264b.common_open_on_phone), pendingIntent);
                } else {
                    L.mo2462q(pendingIntent);
                }
            } else {
                L.mo2438J(17301642).mo2442N(resources.getString(C4264b.common_google_play_services_notification_ticker)).mo2447S(System.currentTimeMillis()).mo2462q(pendingIntent).mo2463r(d);
            }
            if (C2555l.m21216j()) {
                C0092o.m315k(C2555l.m21216j());
                synchronized (f22586e) {
                    str2 = this.f22588c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String g = C0113y.m354g(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(str2, g, 4);
                    } else if (!g.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(g);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                L.mo2459n(str2);
            }
            Notification b2 = L.mo2449b();
            if (i == 1 || i == 2 || i == 3) {
                C4288j.f22594b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: p */
    public final boolean mo15870p(@RecentlyNonNull Context context, @RecentlyNonNull C4280b bVar, int i) {
        PendingIntent k = mo15866k(context, bVar);
        if (k == null) {
            return false;
        }
        mo15869o(context, bVar.mo15841c(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m5706a(context, k, i, true), 134217728));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Dialog mo15871q(Context context, int i, C0047a0 a0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C0113y.m350c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C0113y.m352e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, a0Var);
        }
        String a = C0113y.m348a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo15872r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C0990e) {
                C4291m.m26867M1(dialog, onCancelListener).mo3450L1(((C0990e) activity).mo3470x(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C4281c.m26826a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo15873s(Context context) {
        new C4293o(this, context).sendEmptyMessageDelayed(1, 120000);
    }
}
