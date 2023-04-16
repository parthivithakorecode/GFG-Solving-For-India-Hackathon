package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.app.C0588o;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C0717a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p109p.C3876b;
import p109p.C3877c;
import p109p.C3878d;
import p109p.C3879e;
import p109p.C3881g;

/* renamed from: androidx.core.app.k */
public class C0565k {

    /* renamed from: androidx.core.app.k$a */
    public static class C0566a {

        /* renamed from: a */
        final Bundle f1741a;

        /* renamed from: b */
        private IconCompat f1742b;

        /* renamed from: c */
        private final C0592q[] f1743c;

        /* renamed from: d */
        private final C0592q[] f1744d;

        /* renamed from: e */
        private boolean f1745e;

        /* renamed from: f */
        boolean f1746f;

        /* renamed from: g */
        private final int f1747g;

        /* renamed from: h */
        private final boolean f1748h;
        @Deprecated

        /* renamed from: i */
        public int f1749i;

        /* renamed from: j */
        public CharSequence f1750j;

        /* renamed from: k */
        public PendingIntent f1751k;

        /* renamed from: l */
        private boolean f1752l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0566a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m2654l((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        public C0566a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0592q[]) null, (C0592q[]) null, true, 0, true, false, false);
        }

        C0566a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0592q[] qVarArr, C0592q[] qVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f1746f = true;
            this.f1742b = iconCompat;
            if (iconCompat != null && iconCompat.mo2599q() == 2) {
                this.f1749i = iconCompat.mo2597n();
            }
            this.f1750j = C0573e.m2266j(charSequence);
            this.f1751k = pendingIntent;
            this.f1741a = bundle == null ? new Bundle() : bundle;
            this.f1743c = qVarArr;
            this.f1744d = qVarArr2;
            this.f1745e = z;
            this.f1747g = i;
            this.f1746f = z2;
            this.f1748h = z3;
            this.f1752l = z4;
        }

        /* renamed from: a */
        public PendingIntent mo2406a() {
            return this.f1751k;
        }

        /* renamed from: b */
        public boolean mo2407b() {
            return this.f1745e;
        }

        /* renamed from: c */
        public C0592q[] mo2408c() {
            return this.f1744d;
        }

        /* renamed from: d */
        public Bundle mo2409d() {
            return this.f1741a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo2410e() {
            return this.f1749i;
        }

        /* renamed from: f */
        public IconCompat mo2411f() {
            int i;
            if (this.f1742b == null && (i = this.f1749i) != 0) {
                this.f1742b = IconCompat.m2654l((Resources) null, "", i);
            }
            return this.f1742b;
        }

        /* renamed from: g */
        public C0592q[] mo2412g() {
            return this.f1743c;
        }

        /* renamed from: h */
        public int mo2413h() {
            return this.f1747g;
        }

        /* renamed from: i */
        public boolean mo2414i() {
            return this.f1746f;
        }

        /* renamed from: j */
        public CharSequence mo2415j() {
            return this.f1750j;
        }

        /* renamed from: k */
        public boolean mo2416k() {
            return this.f1752l;
        }

        /* renamed from: l */
        public boolean mo2417l() {
            return this.f1748h;
        }
    }

    /* renamed from: androidx.core.app.k$b */
    public static class C0567b extends C0578i {

        /* renamed from: e */
        private Bitmap f1753e;

        /* renamed from: f */
        private IconCompat f1754f;

        /* renamed from: g */
        private boolean f1755g;

        /* renamed from: h */
        private CharSequence f1756h;

        /* renamed from: i */
        private boolean f1757i;

        /* renamed from: androidx.core.app.k$b$a */
        private static class C0568a {
            /* renamed from: a */
            static void m2253a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m2254b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.k$b$b */
        private static class C0569b {
            /* renamed from: a */
            static void m2255a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.k$b$c */
        private static class C0570c {
            /* renamed from: a */
            static void m2256a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: b */
            static void m2257b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* renamed from: x */
        private static IconCompat m2245x(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.m2645c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m2649g((Bitmap) parcelable);
            }
            return null;
        }

        /* renamed from: A */
        public C0567b mo2418A(CharSequence charSequence) {
            this.f1821b = C0573e.m2266j(charSequence);
            return this;
        }

        /* renamed from: B */
        public C0567b mo2419B(CharSequence charSequence) {
            this.f1822c = C0573e.m2266j(charSequence);
            this.f1823d = true;
            return this;
        }

        /* renamed from: b */
        public void mo2420b(C0564j jVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(jVar.mo2405a()).setBigContentTitle(this.f1821b).bigPicture(this.f1753e);
                if (this.f1755g) {
                    IconCompat iconCompat = this.f1754f;
                    Context context = null;
                    if (iconCompat != null) {
                        if (i >= 23) {
                            if (jVar instanceof C0579l) {
                                context = ((C0579l) jVar).mo2499f();
                            }
                            C0569b.m2255a(bigPicture, this.f1754f.mo2608z(context));
                        } else if (iconCompat.mo2599q() == 1) {
                            C0568a.m2253a(bigPicture, this.f1754f.mo2596m());
                        }
                    }
                    C0568a.m2253a(bigPicture, (Bitmap) null);
                }
                if (this.f1823d) {
                    C0568a.m2254b(bigPicture, this.f1822c);
                }
                if (i >= 31) {
                    C0570c.m2257b(bigPicture, this.f1757i);
                    C0570c.m2256a(bigPicture, this.f1756h);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public String mo2421q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo2422v(Bundle bundle) {
            super.mo2422v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f1754f = m2245x(bundle.getParcelable("android.largeIcon.big"));
                this.f1755g = true;
            }
            this.f1753e = (Bitmap) bundle.getParcelable("android.picture");
            this.f1757i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        /* renamed from: y */
        public C0567b mo2423y(Bitmap bitmap) {
            this.f1754f = bitmap == null ? null : IconCompat.m2649g(bitmap);
            this.f1755g = true;
            return this;
        }

        /* renamed from: z */
        public C0567b mo2424z(Bitmap bitmap) {
            this.f1753e = bitmap;
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$c */
    public static class C0571c extends C0578i {

        /* renamed from: e */
        private CharSequence f1758e;

        /* renamed from: a */
        public void mo2425a(Bundle bundle) {
            super.mo2425a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f1758e);
            }
        }

        /* renamed from: b */
        public void mo2420b(C0564j jVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(jVar.mo2405a()).setBigContentTitle(this.f1821b).bigText(this.f1758e);
                if (this.f1823d) {
                    bigText.setSummaryText(this.f1822c);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public String mo2421q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo2422v(Bundle bundle) {
            super.mo2422v(bundle);
            this.f1758e = bundle.getCharSequence("android.bigText");
        }

        /* renamed from: x */
        public C0571c mo2426x(CharSequence charSequence) {
            this.f1758e = C0573e.m2266j(charSequence);
            return this;
        }

        /* renamed from: y */
        public C0571c mo2427y(CharSequence charSequence) {
            this.f1821b = C0573e.m2266j(charSequence);
            return this;
        }

        /* renamed from: z */
        public C0571c mo2428z(CharSequence charSequence) {
            this.f1822c = C0573e.m2266j(charSequence);
            this.f1823d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$d */
    public static final class C0572d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m2265a(C0572d dVar) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.k$e */
    public static class C0573e {

        /* renamed from: A */
        boolean f1759A;

        /* renamed from: B */
        boolean f1760B;

        /* renamed from: C */
        boolean f1761C;

        /* renamed from: D */
        String f1762D;

        /* renamed from: E */
        Bundle f1763E;

        /* renamed from: F */
        int f1764F;

        /* renamed from: G */
        int f1765G;

        /* renamed from: H */
        Notification f1766H;

        /* renamed from: I */
        RemoteViews f1767I;

        /* renamed from: J */
        RemoteViews f1768J;

        /* renamed from: K */
        RemoteViews f1769K;

        /* renamed from: L */
        String f1770L;

        /* renamed from: M */
        int f1771M;

        /* renamed from: N */
        String f1772N;

        /* renamed from: O */
        long f1773O;

        /* renamed from: P */
        int f1774P;

        /* renamed from: Q */
        int f1775Q;

        /* renamed from: R */
        boolean f1776R;

        /* renamed from: S */
        C0572d f1777S;

        /* renamed from: T */
        Notification f1778T;

        /* renamed from: U */
        boolean f1779U;

        /* renamed from: V */
        Icon f1780V;
        @Deprecated

        /* renamed from: W */
        public ArrayList<String> f1781W;

        /* renamed from: a */
        public Context f1782a;

        /* renamed from: b */
        public ArrayList<C0566a> f1783b;

        /* renamed from: c */
        public ArrayList<C0588o> f1784c;

        /* renamed from: d */
        ArrayList<C0566a> f1785d;

        /* renamed from: e */
        CharSequence f1786e;

        /* renamed from: f */
        CharSequence f1787f;

        /* renamed from: g */
        PendingIntent f1788g;

        /* renamed from: h */
        PendingIntent f1789h;

        /* renamed from: i */
        RemoteViews f1790i;

        /* renamed from: j */
        Bitmap f1791j;

        /* renamed from: k */
        CharSequence f1792k;

        /* renamed from: l */
        int f1793l;

        /* renamed from: m */
        int f1794m;

        /* renamed from: n */
        boolean f1795n;

        /* renamed from: o */
        boolean f1796o;

        /* renamed from: p */
        boolean f1797p;

        /* renamed from: q */
        C0578i f1798q;

        /* renamed from: r */
        CharSequence f1799r;

        /* renamed from: s */
        CharSequence f1800s;

        /* renamed from: t */
        CharSequence[] f1801t;

        /* renamed from: u */
        int f1802u;

        /* renamed from: v */
        int f1803v;

        /* renamed from: w */
        boolean f1804w;

        /* renamed from: x */
        String f1805x;

        /* renamed from: y */
        boolean f1806y;

        /* renamed from: z */
        String f1807z;

        @Deprecated
        public C0573e(Context context) {
            this(context, (String) null);
        }

        public C0573e(Context context, String str) {
            this.f1783b = new ArrayList<>();
            this.f1784c = new ArrayList<>();
            this.f1785d = new ArrayList<>();
            this.f1795n = true;
            this.f1759A = false;
            this.f1764F = 0;
            this.f1765G = 0;
            this.f1771M = 0;
            this.f1774P = 0;
            this.f1775Q = 0;
            Notification notification = new Notification();
            this.f1778T = notification;
            this.f1782a = context;
            this.f1770L = str;
            notification.when = System.currentTimeMillis();
            this.f1778T.audioStreamType = -1;
            this.f1794m = 0;
            this.f1781W = new ArrayList<>();
            this.f1776R = true;
        }

        /* renamed from: j */
        protected static CharSequence m2266j(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: k */
        private Bitmap m2267k(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1782a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C3877c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C3877c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: u */
        private void m2268u(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f1778T;
                i2 = i | notification.flags;
            } else {
                notification = this.f1778T;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: A */
        public C0573e mo2429A(int i, int i2, int i3) {
            Notification notification = this.f1778T;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        /* renamed from: B */
        public C0573e mo2430B(boolean z) {
            this.f1759A = z;
            return this;
        }

        /* renamed from: C */
        public C0573e mo2431C(int i) {
            this.f1793l = i;
            return this;
        }

        /* renamed from: D */
        public C0573e mo2432D(boolean z) {
            m2268u(2, z);
            return this;
        }

        /* renamed from: E */
        public C0573e mo2433E(boolean z) {
            m2268u(8, z);
            return this;
        }

        /* renamed from: F */
        public C0573e mo2434F(int i) {
            this.f1794m = i;
            return this;
        }

        /* renamed from: G */
        public C0573e mo2435G(int i, int i2, boolean z) {
            this.f1802u = i;
            this.f1803v = i2;
            this.f1804w = z;
            return this;
        }

        /* renamed from: H */
        public C0573e mo2436H(String str) {
            this.f1772N = str;
            return this;
        }

        /* renamed from: I */
        public C0573e mo2437I(boolean z) {
            this.f1795n = z;
            return this;
        }

        /* renamed from: J */
        public C0573e mo2438J(int i) {
            this.f1778T.icon = i;
            return this;
        }

        /* renamed from: K */
        public C0573e mo2439K(Uri uri) {
            Notification notification = this.f1778T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: L */
        public C0573e mo2440L(C0578i iVar) {
            if (this.f1798q != iVar) {
                this.f1798q = iVar;
                if (iVar != null) {
                    iVar.mo2496w(this);
                }
            }
            return this;
        }

        /* renamed from: M */
        public C0573e mo2441M(CharSequence charSequence) {
            this.f1799r = m2266j(charSequence);
            return this;
        }

        /* renamed from: N */
        public C0573e mo2442N(CharSequence charSequence) {
            this.f1778T.tickerText = m2266j(charSequence);
            return this;
        }

        /* renamed from: O */
        public C0573e mo2443O(long j) {
            this.f1773O = j;
            return this;
        }

        /* renamed from: P */
        public C0573e mo2444P(boolean z) {
            this.f1796o = z;
            return this;
        }

        /* renamed from: Q */
        public C0573e mo2445Q(long[] jArr) {
            this.f1778T.vibrate = jArr;
            return this;
        }

        /* renamed from: R */
        public C0573e mo2446R(int i) {
            this.f1765G = i;
            return this;
        }

        /* renamed from: S */
        public C0573e mo2447S(long j) {
            this.f1778T.when = j;
            return this;
        }

        /* renamed from: a */
        public C0573e mo2448a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1783b.add(new C0566a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification mo2449b() {
            return new C0579l(this).mo2497c();
        }

        /* renamed from: c */
        public RemoteViews mo2450c() {
            return this.f1768J;
        }

        /* renamed from: d */
        public int mo2451d() {
            return this.f1764F;
        }

        /* renamed from: e */
        public RemoteViews mo2452e() {
            return this.f1767I;
        }

        /* renamed from: f */
        public Bundle mo2453f() {
            if (this.f1763E == null) {
                this.f1763E = new Bundle();
            }
            return this.f1763E;
        }

        /* renamed from: g */
        public RemoteViews mo2454g() {
            return this.f1769K;
        }

        /* renamed from: h */
        public int mo2455h() {
            return this.f1794m;
        }

        /* renamed from: i */
        public long mo2456i() {
            if (this.f1795n) {
                return this.f1778T.when;
            }
            return 0;
        }

        /* renamed from: l */
        public C0573e mo2457l(boolean z) {
            m2268u(16, z);
            return this;
        }

        /* renamed from: m */
        public C0573e mo2458m(String str) {
            this.f1762D = str;
            return this;
        }

        /* renamed from: n */
        public C0573e mo2459n(String str) {
            this.f1770L = str;
            return this;
        }

        /* renamed from: o */
        public C0573e mo2460o(int i) {
            this.f1764F = i;
            return this;
        }

        /* renamed from: p */
        public C0573e mo2461p(boolean z) {
            this.f1760B = z;
            this.f1761C = true;
            return this;
        }

        /* renamed from: q */
        public C0573e mo2462q(PendingIntent pendingIntent) {
            this.f1788g = pendingIntent;
            return this;
        }

        /* renamed from: r */
        public C0573e mo2463r(CharSequence charSequence) {
            this.f1787f = m2266j(charSequence);
            return this;
        }

        /* renamed from: s */
        public C0573e mo2464s(CharSequence charSequence) {
            this.f1786e = m2266j(charSequence);
            return this;
        }

        /* renamed from: t */
        public C0573e mo2465t(PendingIntent pendingIntent) {
            this.f1778T.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: v */
        public C0573e mo2466v(PendingIntent pendingIntent, boolean z) {
            this.f1789h = pendingIntent;
            m2268u(128, z);
            return this;
        }

        /* renamed from: w */
        public C0573e mo2467w(String str) {
            this.f1805x = str;
            return this;
        }

        /* renamed from: x */
        public C0573e mo2468x(int i) {
            this.f1774P = i;
            return this;
        }

        /* renamed from: y */
        public C0573e mo2469y(boolean z) {
            this.f1806y = z;
            return this;
        }

        /* renamed from: z */
        public C0573e mo2470z(Bitmap bitmap) {
            this.f1791j = m2267k(bitmap);
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$f */
    public static class C0574f extends C0578i {
        /* renamed from: x */
        private RemoteViews m2311x(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews c = mo2492c(true, C3881g.notification_template_custom_big, false);
            c.removeAllViews(C3879e.actions);
            List<C0566a> z3 = m2313z(this.f1820a.f1783b);
            if (!z || z3 == null || (min = Math.min(z3.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(C3879e.actions, m2312y(z3.get(i2)));
                }
            }
            if (!z2) {
                i = 8;
            }
            c.setViewVisibility(C3879e.actions, i);
            c.setViewVisibility(C3879e.action_divider, i);
            mo2493d(c, remoteViews);
            return c;
        }

        /* renamed from: y */
        private RemoteViews m2312y(C0566a aVar) {
            boolean z = aVar.f1751k == null;
            RemoteViews remoteViews = new RemoteViews(this.f1820a.f1782a.getPackageName(), z ? C3881g.notification_action_tombstone : C3881g.notification_action);
            IconCompat f = aVar.mo2411f();
            if (f != null) {
                remoteViews.setImageViewBitmap(C3879e.action_image, mo2495m(f, this.f1820a.f1782a.getResources().getColor(C3876b.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(C3879e.action_text, aVar.f1750j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C3879e.action_container, aVar.f1751k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C3879e.action_container, aVar.f1750j);
            }
            return remoteViews;
        }

        /* renamed from: z */
        private static List<C0566a> m2313z(List<C0566a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C0566a next : list) {
                if (!next.mo2417l()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public void mo2420b(C0564j jVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                jVar.mo2405a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public String mo2421q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        /* renamed from: s */
        public RemoteViews mo2471s(C0564j jVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews c = this.f1820a.mo2450c();
            if (c == null) {
                c = this.f1820a.mo2452e();
            }
            if (c == null) {
                return null;
            }
            return m2311x(c, true);
        }

        /* renamed from: t */
        public RemoteViews mo2472t(C0564j jVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f1820a.mo2452e() != null) {
                return m2311x(this.f1820a.mo2452e(), false);
            }
            return null;
        }

        /* renamed from: u */
        public RemoteViews mo2473u(C0564j jVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews g = this.f1820a.mo2454g();
            RemoteViews e = g != null ? g : this.f1820a.mo2452e();
            if (g == null) {
                return null;
            }
            return m2311x(e, true);
        }
    }

    /* renamed from: androidx.core.app.k$g */
    public static class C0575g extends C0578i {

        /* renamed from: e */
        private ArrayList<CharSequence> f1808e = new ArrayList<>();

        /* renamed from: b */
        public void mo2420b(C0564j jVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.mo2405a()).setBigContentTitle(this.f1821b);
                if (this.f1823d) {
                    bigContentTitle.setSummaryText(this.f1822c);
                }
                Iterator<CharSequence> it = this.f1808e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public String mo2421q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo2422v(Bundle bundle) {
            super.mo2422v(bundle);
            this.f1808e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f1808e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        /* renamed from: x */
        public C0575g mo2474x(CharSequence charSequence) {
            if (charSequence != null) {
                this.f1808e.add(C0573e.m2266j(charSequence));
            }
            return this;
        }

        /* renamed from: y */
        public C0575g mo2475y(CharSequence charSequence) {
            this.f1821b = C0573e.m2266j(charSequence);
            return this;
        }

        /* renamed from: z */
        public C0575g mo2476z(CharSequence charSequence) {
            this.f1822c = C0573e.m2266j(charSequence);
            this.f1823d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$h */
    public static class C0576h extends C0578i {

        /* renamed from: e */
        private final List<C0577a> f1809e = new ArrayList();

        /* renamed from: f */
        private final List<C0577a> f1810f = new ArrayList();

        /* renamed from: g */
        private C0588o f1811g;

        /* renamed from: h */
        private CharSequence f1812h;

        /* renamed from: i */
        private Boolean f1813i;

        /* renamed from: androidx.core.app.k$h$a */
        public static final class C0577a {

            /* renamed from: a */
            private final CharSequence f1814a;

            /* renamed from: b */
            private final long f1815b;

            /* renamed from: c */
            private final C0588o f1816c;

            /* renamed from: d */
            private Bundle f1817d = new Bundle();

            /* renamed from: e */
            private String f1818e;

            /* renamed from: f */
            private Uri f1819f;

            public C0577a(CharSequence charSequence, long j, C0588o oVar) {
                this.f1814a = charSequence;
                this.f1815b = j;
                this.f1816c = oVar;
            }

            /* renamed from: a */
            static Bundle[] m2341a(List<C0577a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m2344l();
                }
                return bundleArr;
            }

            /* renamed from: e */
            static C0577a m2342e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            C0577a aVar = new C0577a(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? C0588o.m2415b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new C0588o.C0590b().mo2528f(bundle.getCharSequence("sender")).mo2523a() : null : C0588o.m2414a((Person) bundle.getParcelable("sender_person")));
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                aVar.mo2490j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                aVar.mo2486d().putAll(bundle.getBundle("extras"));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: f */
            static List<C0577a> m2343f(Parcelable[] parcelableArr) {
                C0577a e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if ((parcelableArr[i] instanceof Bundle) && (e = m2342e(parcelableArr[i])) != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }

            /* renamed from: l */
            private Bundle m2344l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f1814a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f1815b);
                C0588o oVar = this.f1816c;
                if (oVar != null) {
                    bundle.putCharSequence("sender", oVar.mo2516e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f1816c.mo2521j());
                    } else {
                        bundle.putBundle("person", this.f1816c.mo2522k());
                    }
                }
                String str = this.f1818e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f1819f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f1817d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* renamed from: b */
            public String mo2484b() {
                return this.f1818e;
            }

            /* renamed from: c */
            public Uri mo2485c() {
                return this.f1819f;
            }

            /* renamed from: d */
            public Bundle mo2486d() {
                return this.f1817d;
            }

            /* renamed from: g */
            public C0588o mo2487g() {
                return this.f1816c;
            }

            /* renamed from: h */
            public CharSequence mo2488h() {
                return this.f1814a;
            }

            /* renamed from: i */
            public long mo2489i() {
                return this.f1815b;
            }

            /* renamed from: j */
            public C0577a mo2490j(String str, Uri uri) {
                this.f1818e = str;
                this.f1819f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: k */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message mo2491k() {
                /*
                    r6 = this;
                    androidx.core.app.o r0 = r6.mo2487g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 0
                    r3 = 28
                    if (r1 < r3) goto L_0x0020
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.mo2488h()
                    long r4 = r6.mo2489i()
                    if (r0 != 0) goto L_0x0018
                    goto L_0x001c
                L_0x0018:
                    android.app.Person r2 = r0.mo2521j()
                L_0x001c:
                    r1.<init>(r3, r4, r2)
                    goto L_0x0034
                L_0x0020:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.mo2488h()
                    long r4 = r6.mo2489i()
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    java.lang.CharSequence r2 = r0.mo2516e()
                L_0x0031:
                    r1.<init>(r3, r4, r2)
                L_0x0034:
                    java.lang.String r0 = r6.mo2484b()
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r6.mo2484b()
                    android.net.Uri r2 = r6.mo2485c()
                    r1.setData(r0, r2)
                L_0x0045:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0565k.C0576h.C0577a.mo2491k():android.app.Notification$MessagingStyle$Message");
            }
        }

        C0576h() {
        }

        public C0576h(C0588o oVar) {
            if (!TextUtils.isEmpty(oVar.mo2516e())) {
                this.f1811g = oVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        /* renamed from: D */
        private boolean m2325D() {
            for (int size = this.f1809e.size() - 1; size >= 0; size--) {
                C0577a aVar = this.f1809e.get(size);
                if (aVar.mo2487g() != null && aVar.mo2487g().mo2516e() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: F */
        private TextAppearanceSpan m2326F(int i) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null);
        }

        /* renamed from: G */
        private CharSequence m2327G(C0577a aVar) {
            C0717a c = C0717a.m2890c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence e = aVar.mo2487g() == null ? charSequence : aVar.mo2487g().mo2516e();
            if (TextUtils.isEmpty(e)) {
                e = this.f1811g.mo2516e();
                if (z && this.f1820a.mo2451d() != 0) {
                    i = this.f1820a.mo2451d();
                }
            }
            CharSequence h = c.mo2725h(e);
            spannableStringBuilder.append(h);
            spannableStringBuilder.setSpan(m2326F(i), spannableStringBuilder.length() - h.length(), spannableStringBuilder.length(), 33);
            if (aVar.mo2488h() != null) {
                charSequence = aVar.mo2488h();
            }
            spannableStringBuilder.append("  ").append(c.mo2725h(charSequence));
            return spannableStringBuilder;
        }

        /* renamed from: y */
        public static C0576h m2328y(Notification notification) {
            C0578i p = C0578i.m2362p(notification);
            if (p instanceof C0576h) {
                return (C0576h) p;
            }
            return null;
        }

        /* renamed from: z */
        private C0577a m2329z() {
            for (int size = this.f1809e.size() - 1; size >= 0; size--) {
                C0577a aVar = this.f1809e.get(size);
                if (aVar.mo2487g() != null && !TextUtils.isEmpty(aVar.mo2487g().mo2516e())) {
                    return aVar;
                }
            }
            if (this.f1809e.isEmpty()) {
                return null;
            }
            List<C0577a> list = this.f1809e;
            return list.get(list.size() - 1);
        }

        /* renamed from: A */
        public CharSequence mo2477A() {
            return this.f1812h;
        }

        /* renamed from: B */
        public List<C0577a> mo2478B() {
            return this.f1809e;
        }

        /* renamed from: C */
        public C0588o mo2479C() {
            return this.f1811g;
        }

        /* renamed from: E */
        public boolean mo2480E() {
            C0573e eVar = this.f1820a;
            if (eVar != null && eVar.f1782a.getApplicationInfo().targetSdkVersion < 28 && this.f1813i == null) {
                return this.f1812h != null;
            }
            Boolean bool = this.f1813i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: H */
        public C0576h mo2481H(CharSequence charSequence) {
            this.f1812h = charSequence;
            return this;
        }

        /* renamed from: I */
        public C0576h mo2482I(boolean z) {
            this.f1813i = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public void mo2425a(Bundle bundle) {
            super.mo2425a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f1811g.mo2516e());
            bundle.putBundle("android.messagingStyleUser", this.f1811g.mo2522k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f1812h);
            if (this.f1812h != null && this.f1813i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f1812h);
            }
            if (!this.f1809e.isEmpty()) {
                bundle.putParcelableArray("android.messages", C0577a.m2341a(this.f1809e));
            }
            if (!this.f1810f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", C0577a.m2341a(this.f1810f));
            }
            Boolean bool = this.f1813i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2420b(androidx.core.app.C0564j r8) {
            /*
                r7 = this;
                boolean r0 = r7.mo2480E()
                r7.mo2482I(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x0089
                r1 = 28
                if (r0 < r1) goto L_0x001d
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                androidx.core.app.o r2 = r7.f1811g
                android.app.Person r2 = r2.mo2521j()
                r0.<init>(r2)
                goto L_0x0028
            L_0x001d:
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                androidx.core.app.o r2 = r7.f1811g
                java.lang.CharSequence r2 = r2.mo2516e()
                r0.<init>(r2)
            L_0x0028:
                java.util.List<androidx.core.app.k$h$a> r2 = r7.f1809e
                java.util.Iterator r2 = r2.iterator()
            L_0x002e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r2.next()
                androidx.core.app.k$h$a r3 = (androidx.core.app.C0565k.C0576h.C0577a) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.mo2491k()
                r0.addMessage(r3)
                goto L_0x002e
            L_0x0042:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L_0x0062
                java.util.List<androidx.core.app.k$h$a> r2 = r7.f1810f
                java.util.Iterator r2 = r2.iterator()
            L_0x004e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0062
                java.lang.Object r3 = r2.next()
                androidx.core.app.k$h$a r3 = (androidx.core.app.C0565k.C0576h.C0577a) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.mo2491k()
                r0.addHistoricMessage(r3)
                goto L_0x004e
            L_0x0062:
                java.lang.Boolean r2 = r7.f1813i
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x006e
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0073
            L_0x006e:
                java.lang.CharSequence r2 = r7.f1812h
                r0.setConversationTitle(r2)
            L_0x0073:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0080
                java.lang.Boolean r1 = r7.f1813i
                boolean r1 = r1.booleanValue()
                r0.setGroupConversation(r1)
            L_0x0080:
                android.app.Notification$Builder r8 = r8.mo2405a()
                r0.setBuilder(r8)
                goto L_0x0131
            L_0x0089:
                androidx.core.app.k$h$a r1 = r7.m2329z()
                java.lang.CharSequence r2 = r7.f1812h
                if (r2 == 0) goto L_0x00a3
                java.lang.Boolean r2 = r7.f1813i
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x00a3
                android.app.Notification$Builder r2 = r8.mo2405a()
                java.lang.CharSequence r3 = r7.f1812h
            L_0x009f:
                r2.setContentTitle(r3)
                goto L_0x00c1
            L_0x00a3:
                if (r1 == 0) goto L_0x00c1
                android.app.Notification$Builder r2 = r8.mo2405a()
                java.lang.String r3 = ""
                r2.setContentTitle(r3)
                androidx.core.app.o r2 = r1.mo2487g()
                if (r2 == 0) goto L_0x00c1
                android.app.Notification$Builder r2 = r8.mo2405a()
                androidx.core.app.o r3 = r1.mo2487g()
                java.lang.CharSequence r3 = r3.mo2516e()
                goto L_0x009f
            L_0x00c1:
                if (r1 == 0) goto L_0x00d7
                android.app.Notification$Builder r2 = r8.mo2405a()
                java.lang.CharSequence r3 = r7.f1812h
                if (r3 == 0) goto L_0x00d0
                java.lang.CharSequence r1 = r7.m2327G(r1)
                goto L_0x00d4
            L_0x00d0:
                java.lang.CharSequence r1 = r1.mo2488h()
            L_0x00d4:
                r2.setContentText(r1)
            L_0x00d7:
                r1 = 16
                if (r0 < r1) goto L_0x0131
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r1 = r7.f1812h
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x00ef
                boolean r1 = r7.m2325D()
                if (r1 == 0) goto L_0x00ed
                goto L_0x00ef
            L_0x00ed:
                r1 = r2
                goto L_0x00f0
            L_0x00ef:
                r1 = r3
            L_0x00f0:
                java.util.List<androidx.core.app.k$h$a> r4 = r7.f1809e
                int r4 = r4.size()
                int r4 = r4 - r3
            L_0x00f7:
                if (r4 < 0) goto L_0x0120
                java.util.List<androidx.core.app.k$h$a> r5 = r7.f1809e
                java.lang.Object r5 = r5.get(r4)
                androidx.core.app.k$h$a r5 = (androidx.core.app.C0565k.C0576h.C0577a) r5
                if (r1 == 0) goto L_0x0108
                java.lang.CharSequence r5 = r7.m2327G(r5)
                goto L_0x010c
            L_0x0108:
                java.lang.CharSequence r5 = r5.mo2488h()
            L_0x010c:
                java.util.List<androidx.core.app.k$h$a> r6 = r7.f1809e
                int r6 = r6.size()
                int r6 = r6 - r3
                if (r4 == r6) goto L_0x011a
                java.lang.String r6 = "\n"
                r0.insert(r2, r6)
            L_0x011a:
                r0.insert(r2, r5)
                int r4 = r4 + -1
                goto L_0x00f7
            L_0x0120:
                android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r8 = r8.mo2405a()
                r1.<init>(r8)
                r8 = 0
                android.app.Notification$BigTextStyle r8 = r1.setBigContentTitle(r8)
                r8.bigText(r0)
            L_0x0131:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0565k.C0576h.mo2420b(androidx.core.app.j):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public String mo2421q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo2422v(Bundle bundle) {
            super.mo2422v(bundle);
            this.f1809e.clear();
            this.f1811g = bundle.containsKey("android.messagingStyleUser") ? C0588o.m2415b(bundle.getBundle("android.messagingStyleUser")) : new C0588o.C0590b().mo2528f(bundle.getString("android.selfDisplayName")).mo2523a();
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f1812h = charSequence;
            if (charSequence == null) {
                this.f1812h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f1809e.addAll(C0577a.m2343f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f1810f.addAll(C0577a.m2343f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f1813i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        /* renamed from: x */
        public C0576h mo2483x(C0577a aVar) {
            if (aVar != null) {
                this.f1809e.add(aVar);
                if (this.f1809e.size() > 25) {
                    this.f1809e.remove(0);
                }
            }
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$i */
    public static abstract class C0578i {

        /* renamed from: a */
        protected C0573e f1820a;

        /* renamed from: b */
        CharSequence f1821b;

        /* renamed from: c */
        CharSequence f1822c;

        /* renamed from: d */
        boolean f1823d = false;

        /* renamed from: e */
        private int m2353e() {
            Resources resources = this.f1820a.f1782a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C3877c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C3877c.notification_top_pad_large_text);
            float f = (m2354f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f) * ((float) dimensionPixelSize)) + (f * ((float) dimensionPixelSize2)));
        }

        /* renamed from: f */
        private static float m2354f(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: g */
        static C0578i m2355g(String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C0574f();
                case 1:
                    return new C0567b();
                case 2:
                    return new C0575g();
                case 3:
                    return new C0571c();
                case 4:
                    return new C0576h();
                default:
                    return null;
            }
        }

        /* renamed from: h */
        private static C0578i m2356h(String str) {
            int i;
            if (str != null && (i = Build.VERSION.SDK_INT) >= 16) {
                if (str.equals(Notification.BigPictureStyle.class.getName())) {
                    return new C0567b();
                }
                if (str.equals(Notification.BigTextStyle.class.getName())) {
                    return new C0571c();
                }
                if (str.equals(Notification.InboxStyle.class.getName())) {
                    return new C0575g();
                }
                if (i >= 24) {
                    if (str.equals(Notification.MessagingStyle.class.getName())) {
                        return new C0576h();
                    }
                    if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        return new C0574f();
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        static C0578i m2357i(Bundle bundle) {
            C0578i g = m2355g(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return g != null ? g : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new C0576h() : bundle.containsKey("android.picture") ? new C0567b() : bundle.containsKey("android.bigText") ? new C0571c() : bundle.containsKey("android.textLines") ? new C0575g() : m2356h(bundle.getString("android.template"));
        }

        /* renamed from: j */
        static C0578i m2358j(Bundle bundle) {
            C0578i i = m2357i(bundle);
            if (i == null) {
                return null;
            }
            try {
                i.mo2422v(bundle);
                return i;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: l */
        private Bitmap m2359l(int i, int i2, int i3) {
            return m2360n(IconCompat.m2653k(this.f1820a.f1782a, i), i2, i3);
        }

        /* renamed from: n */
        private Bitmap m2360n(IconCompat iconCompat, int i, int i2) {
            Drawable t = iconCompat.mo2602t(this.f1820a.f1782a);
            int intrinsicWidth = i2 == 0 ? t.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = t.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            t.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                t.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            t.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: o */
        private Bitmap m2361o(int i, int i2, int i3, int i4) {
            int i5 = C3878d.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap l = m2359l(i5, i4, i2);
            Canvas canvas = new Canvas(l);
            Drawable mutate = this.f1820a.f1782a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return l;
        }

        /* renamed from: p */
        public static C0578i m2362p(Notification notification) {
            Bundle a = C0565k.m2232a(notification);
            if (a == null) {
                return null;
            }
            return m2358j(a);
        }

        /* renamed from: r */
        private void m2363r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C3879e.f21921m0, 8);
            remoteViews.setViewVisibility(C3879e.text2, 8);
            remoteViews.setViewVisibility(C3879e.f21920j0, 8);
        }

        /* renamed from: a */
        public void mo2425a(Bundle bundle) {
            if (this.f1823d) {
                bundle.putCharSequence("android.summaryText", this.f1822c);
            }
            CharSequence charSequence = this.f1821b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String q = mo2421q();
            if (q != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", q);
            }
        }

        /* renamed from: b */
        public abstract void mo2420b(C0564j jVar);

        /* JADX WARNING: Removed duplicated region for block: B:63:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ef  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01fa  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo2492c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                androidx.core.app.k$e r1 = r0.f1820a
                android.content.Context r1 = r1.f1782a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                androidx.core.app.k$e r2 = r0.f1820a
                android.content.Context r2 = r2.f1782a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                androidx.core.app.k$e r2 = r0.f1820a
                int r2 = r2.mo2455h()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = r9
                goto L_0x0027
            L_0x0026:
                r2 = r10
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x004f
                if (r11 >= r4) goto L_0x004f
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0041
                int r2 = p109p.C3879e.notification_background
                int r6 = p109p.C3878d.notification_bg_low
                r8.setInt(r2, r5, r6)
                int r2 = p109p.C3879e.icon
                int r6 = p109p.C3878d.notification_template_icon_low_bg
                goto L_0x004c
            L_0x0041:
                int r2 = p109p.C3879e.notification_background
                int r6 = p109p.C3878d.notification_bg
                r8.setInt(r2, r5, r6)
                int r2 = p109p.C3879e.icon
                int r6 = p109p.C3878d.notification_template_icon_bg
            L_0x004c:
                r8.setInt(r2, r5, r6)
            L_0x004f:
                androidx.core.app.k$e r2 = r0.f1820a
                android.graphics.Bitmap r5 = r2.f1791j
                r13 = 8
                if (r5 == 0) goto L_0x00ae
                int r2 = p109p.C3879e.icon
                if (r11 < r12) goto L_0x0066
                r8.setViewVisibility(r2, r10)
                androidx.core.app.k$e r5 = r0.f1820a
                android.graphics.Bitmap r5 = r5.f1791j
                r8.setImageViewBitmap(r2, r5)
                goto L_0x0069
            L_0x0066:
                r8.setViewVisibility(r2, r13)
            L_0x0069:
                if (r17 == 0) goto L_0x00ec
                androidx.core.app.k$e r2 = r0.f1820a
                android.app.Notification r2 = r2.f1778T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00ec
                int r2 = p109p.C3877c.notification_right_icon_size
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = p109p.C3877c.notification_small_icon_background_padding
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x0099
                androidx.core.app.k$e r3 = r0.f1820a
                android.app.Notification r6 = r3.f1778T
                int r6 = r6.icon
                int r3 = r3.mo2451d()
                android.graphics.Bitmap r2 = r0.m2361o(r6, r2, r5, r3)
                int r3 = p109p.C3879e.right_icon
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00a8
            L_0x0099:
                int r2 = p109p.C3879e.right_icon
                androidx.core.app.k$e r5 = r0.f1820a
                android.app.Notification r5 = r5.f1778T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo2494k(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00a8:
                int r2 = p109p.C3879e.right_icon
                r8.setViewVisibility(r2, r10)
                goto L_0x00ec
            L_0x00ae:
                if (r17 == 0) goto L_0x00ec
                android.app.Notification r2 = r2.f1778T
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00ec
                int r2 = p109p.C3879e.icon
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00df
                int r3 = p109p.C3877c.notification_large_icon_width
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = p109p.C3877c.notification_big_circle_margin
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = p109p.C3877c.notification_small_icon_size_as_large
                int r5 = r1.getDimensionPixelSize(r5)
                androidx.core.app.k$e r6 = r0.f1820a
                android.app.Notification r7 = r6.f1778T
                int r7 = r7.icon
                int r6 = r6.mo2451d()
                android.graphics.Bitmap r3 = r0.m2361o(r7, r3, r5, r6)
                goto L_0x00e9
            L_0x00df:
                androidx.core.app.k$e r5 = r0.f1820a
                android.app.Notification r5 = r5.f1778T
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.mo2494k(r5, r3)
            L_0x00e9:
                r8.setImageViewBitmap(r2, r3)
            L_0x00ec:
                androidx.core.app.k$e r2 = r0.f1820a
                java.lang.CharSequence r2 = r2.f1786e
                if (r2 == 0) goto L_0x00f7
                int r3 = p109p.C3879e.f21921m0
                r8.setTextViewText(r3, r2)
            L_0x00f7:
                androidx.core.app.k$e r2 = r0.f1820a
                java.lang.CharSequence r2 = r2.f1787f
                if (r2 == 0) goto L_0x0104
                int r3 = p109p.C3879e.f21920j0
                r8.setTextViewText(r3, r2)
                r2 = r9
                goto L_0x0105
            L_0x0104:
                r2 = r10
            L_0x0105:
                if (r11 >= r4) goto L_0x010f
                androidx.core.app.k$e r3 = r0.f1820a
                android.graphics.Bitmap r3 = r3.f1791j
                if (r3 == 0) goto L_0x010f
                r3 = r9
                goto L_0x0110
            L_0x010f:
                r3 = r10
            L_0x0110:
                androidx.core.app.k$e r4 = r0.f1820a
                java.lang.CharSequence r5 = r4.f1792k
                if (r5 == 0) goto L_0x0121
                int r2 = p109p.C3879e.info
                r8.setTextViewText(r2, r5)
            L_0x011b:
                r8.setViewVisibility(r2, r10)
                r14 = r9
                r15 = r14
                goto L_0x0159
            L_0x0121:
                int r4 = r4.f1793l
                if (r4 <= 0) goto L_0x0152
                int r2 = p109p.C3880f.status_bar_notification_info_maxnum
                int r2 = r1.getInteger(r2)
                androidx.core.app.k$e r3 = r0.f1820a
                int r3 = r3.f1793l
                if (r3 <= r2) goto L_0x013d
                int r2 = p109p.C3879e.info
                int r3 = p109p.C3882h.status_bar_notification_info_overflow
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x014f
            L_0x013d:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = p109p.C3879e.info
                androidx.core.app.k$e r4 = r0.f1820a
                int r4 = r4.f1793l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x014f:
                int r2 = p109p.C3879e.info
                goto L_0x011b
            L_0x0152:
                int r4 = p109p.C3879e.info
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0159:
                androidx.core.app.k$e r2 = r0.f1820a
                java.lang.CharSequence r2 = r2.f1799r
                if (r2 == 0) goto L_0x017b
                if (r11 < r12) goto L_0x017b
                int r3 = p109p.C3879e.f21920j0
                r8.setTextViewText(r3, r2)
                androidx.core.app.k$e r2 = r0.f1820a
                java.lang.CharSequence r2 = r2.f1787f
                if (r2 == 0) goto L_0x0176
                int r3 = p109p.C3879e.text2
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = r9
                goto L_0x017c
            L_0x0176:
                int r2 = p109p.C3879e.text2
                r8.setViewVisibility(r2, r13)
            L_0x017b:
                r2 = r10
            L_0x017c:
                if (r2 == 0) goto L_0x0198
                if (r11 < r12) goto L_0x0198
                if (r19 == 0) goto L_0x018e
                int r2 = p109p.C3877c.notification_subtext_size
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = p109p.C3879e.f21920j0
                r8.setTextViewTextSize(r2, r10, r1)
            L_0x018e:
                int r3 = p109p.C3879e.line1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                r2.setViewPadding(r3, r4, r5, r6, r7)
            L_0x0198:
                androidx.core.app.k$e r1 = r0.f1820a
                long r1 = r1.mo2456i()
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L_0x01ea
                androidx.core.app.k$e r1 = r0.f1820a
                boolean r1 = r1.f1796o
                if (r1 == 0) goto L_0x01d9
                if (r11 < r12) goto L_0x01d9
                int r1 = p109p.C3879e.chronometer
                r8.setViewVisibility(r1, r10)
                androidx.core.app.k$e r2 = r0.f1820a
                long r2 = r2.mo2456i()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                androidx.core.app.k$e r2 = r0.f1820a
                boolean r2 = r2.f1797p
                if (r2 == 0) goto L_0x01eb
                r3 = 24
                if (r11 < r3) goto L_0x01eb
                r8.setChronometerCountDown(r1, r2)
                goto L_0x01eb
            L_0x01d9:
                int r1 = p109p.C3879e.time
                r8.setViewVisibility(r1, r10)
                androidx.core.app.k$e r2 = r0.f1820a
                long r2 = r2.mo2456i()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01eb
            L_0x01ea:
                r9 = r15
            L_0x01eb:
                int r1 = p109p.C3879e.right_side
                if (r9 == 0) goto L_0x01f1
                r2 = r10
                goto L_0x01f2
            L_0x01f1:
                r2 = r13
            L_0x01f2:
                r8.setViewVisibility(r1, r2)
                int r1 = p109p.C3879e.line3
                if (r14 == 0) goto L_0x01fa
                goto L_0x01fb
            L_0x01fa:
                r10 = r13
            L_0x01fb:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0565k.C0578i.mo2492c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public void mo2493d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m2363r(remoteViews);
            int i = C3879e.notification_main_column;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(C3879e.notification_main_column_container, 0, m2353e(), 0, 0);
            }
        }

        /* renamed from: k */
        public Bitmap mo2494k(int i, int i2) {
            return m2359l(i, i2, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Bitmap mo2495m(IconCompat iconCompat, int i) {
            return m2360n(iconCompat, i, 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public String mo2421q() {
            return null;
        }

        /* renamed from: s */
        public RemoteViews mo2471s(C0564j jVar) {
            return null;
        }

        /* renamed from: t */
        public RemoteViews mo2472t(C0564j jVar) {
            return null;
        }

        /* renamed from: u */
        public RemoteViews mo2473u(C0564j jVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo2422v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f1822c = bundle.getCharSequence("android.summaryText");
                this.f1823d = true;
            }
            this.f1821b = bundle.getCharSequence("android.title.big");
        }

        /* renamed from: w */
        public void mo2496w(C0573e eVar) {
            if (this.f1820a != eVar) {
                this.f1820a = eVar;
                if (eVar != null) {
                    eVar.mo2440L(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2232a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0580m.m2386c(notification);
        }
        return null;
    }
}
