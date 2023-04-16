package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0565k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p102o.C3803b;

/* renamed from: androidx.core.app.l */
class C0579l implements C0564j {

    /* renamed from: a */
    private final Context f1824a;

    /* renamed from: b */
    private final Notification.Builder f1825b;

    /* renamed from: c */
    private final C0565k.C0573e f1826c;

    /* renamed from: d */
    private RemoteViews f1827d;

    /* renamed from: e */
    private RemoteViews f1828e;

    /* renamed from: f */
    private final List<Bundle> f1829f = new ArrayList();

    /* renamed from: g */
    private final Bundle f1830g = new Bundle();

    /* renamed from: h */
    private int f1831h;

    /* renamed from: i */
    private RemoteViews f1832i;

    C0579l(C0565k.C0573e eVar) {
        Notification.Builder builder;
        int i;
        Icon icon;
        List<String> e;
        String str;
        Bundle bundle;
        this.f1826c = eVar;
        this.f1824a = eVar.f1782a;
        int i2 = Build.VERSION.SDK_INT;
        Context context = eVar.f1782a;
        if (i2 >= 26) {
            String str2 = eVar.f1770L;
        } else {
            builder = new Notification.Builder(context);
        }
        this.f1825b = builder;
        Notification notification = eVar.f1778T;
        this.f1825b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1790i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1786e).setContentText(eVar.f1787f).setContentInfo(eVar.f1792k).setContentIntent(eVar.f1788g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1789h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1791j).setNumber(eVar.f1793l).setProgress(eVar.f1802u, eVar.f1803v, eVar.f1804w);
        if (i2 < 21) {
            this.f1825b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f1825b.setSubText(eVar.f1799r).setUsesChronometer(eVar.f1796o).setPriority(eVar.f1794m);
            Iterator<C0565k.C0566a> it = eVar.f1783b.iterator();
            while (it.hasNext()) {
                m2376b(it.next());
            }
            Bundle bundle2 = eVar.f1763E;
            if (bundle2 != null) {
                this.f1830g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f1759A) {
                    this.f1830g.putBoolean("android.support.localOnly", true);
                }
                String str3 = eVar.f1805x;
                if (str3 != null) {
                    this.f1830g.putString("android.support.groupKey", str3);
                    if (eVar.f1806y) {
                        bundle = this.f1830g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1830g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str4 = eVar.f1807z;
                if (str4 != null) {
                    this.f1830g.putString("android.support.sortKey", str4);
                }
            }
            this.f1827d = eVar.f1767I;
            this.f1828e = eVar.f1768J;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f1825b.setShowWhen(eVar.f1795n);
        }
        if (i3 >= 19 && i3 < 21 && (e = m2377e(m2378g(eVar.f1784c), eVar.f1781W)) != null && !e.isEmpty()) {
            this.f1830g.putStringArray("android.people", (String[]) e.toArray(new String[e.size()]));
        }
        if (i3 >= 20) {
            this.f1825b.setLocalOnly(eVar.f1759A).setGroup(eVar.f1805x).setGroupSummary(eVar.f1806y).setSortKey(eVar.f1807z);
            this.f1831h = eVar.f1774P;
        }
        if (i3 >= 21) {
            this.f1825b.setCategory(eVar.f1762D).setColor(eVar.f1764F).setVisibility(eVar.f1765G).setPublicVersion(eVar.f1766H).setSound(notification.sound, notification.audioAttributes);
            List<String> e2 = i3 < 28 ? m2377e(m2378g(eVar.f1784c), eVar.f1781W) : eVar.f1781W;
            if (e2 != null && !e2.isEmpty()) {
                for (String addPerson : e2) {
                    this.f1825b.addPerson(addPerson);
                }
            }
            this.f1832i = eVar.f1769K;
            if (eVar.f1785d.size() > 0) {
                Bundle bundle3 = eVar.mo2453f().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < eVar.f1785d.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), C0580m.m2385b(eVar.f1785d.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.mo2453f().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1830g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = eVar.f1780V) != null) {
            this.f1825b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f1825b.setExtras(eVar.f1763E).setRemoteInputHistory(eVar.f1801t);
            RemoteViews remoteViews = eVar.f1767I;
            if (remoteViews != null) {
                this.f1825b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f1768J;
            if (remoteViews2 != null) {
                this.f1825b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f1769K;
            if (remoteViews3 != null) {
                this.f1825b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f1825b.setBadgeIconType(eVar.f1771M).setSettingsText(eVar.f1800s).setShortcutId(eVar.f1772N).setTimeoutAfter(eVar.f1773O).setGroupAlertBehavior(eVar.f1774P);
            if (eVar.f1761C) {
                this.f1825b.setColorized(eVar.f1760B);
            }
            if (!TextUtils.isEmpty(eVar.f1770L)) {
                this.f1825b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i5 >= 28) {
            Iterator<C0588o> it2 = eVar.f1784c.iterator();
            while (it2.hasNext()) {
                this.f1825b.addPerson(it2.next().mo2521j());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f1825b.setAllowSystemGeneratedContextualActions(eVar.f1776R);
            this.f1825b.setBubbleMetadata(C0565k.C0572d.m2265a(eVar.f1777S));
        }
        if (i6 >= 31 && (i = eVar.f1775Q) != 0) {
            this.f1825b.setForegroundServiceBehavior(i);
        }
        if (eVar.f1779U) {
            if (this.f1826c.f1806y) {
                this.f1831h = 2;
            } else {
                this.f1831h = 1;
            }
            this.f1825b.setVibrate((long[]) null);
            this.f1825b.setSound((Uri) null);
            int i7 = notification.defaults & -2;
            notification.defaults = i7;
            int i8 = i7 & -3;
            notification.defaults = i8;
            this.f1825b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f1826c.f1805x)) {
                    this.f1825b.setGroup("silent");
                }
                this.f1825b.setGroupAlertBehavior(this.f1831h);
            }
        }
    }

    /* renamed from: b */
    private void m2376b(C0565k.C0566a aVar) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat f = aVar.mo2411f();
            if (i >= 23) {
                builder = new Notification.Action.Builder(f != null ? f.mo2607y() : null, aVar.mo2415j(), aVar.mo2406a());
            } else {
                builder = new Notification.Action.Builder(f != null ? f.mo2597n() : 0, aVar.mo2415j(), aVar.mo2406a());
            }
            if (aVar.mo2412g() != null) {
                for (RemoteInput addRemoteInput : C0592q.m2435b(aVar.mo2412g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo2409d() != null ? new Bundle(aVar.mo2409d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2407b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2407b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2413h());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.mo2413h());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.mo2417l());
            }
            if (i2 >= 31) {
                builder.setAuthenticationRequired(aVar.mo2416k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2414i());
            builder.addExtras(bundle);
            this.f1825b.addAction(builder.build());
        } else if (i >= 16) {
            this.f1829f.add(C0580m.m2389f(this.f1825b, aVar));
        }
    }

    /* renamed from: e */
    private static List<String> m2377e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3803b bVar = new C3803b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    /* renamed from: g */
    private static List<String> m2378g(List<C0588o> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0588o i : list) {
            arrayList.add(i.mo2520i());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m2379h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo2405a() {
        return this.f1825b;
    }

    /* renamed from: c */
    public Notification mo2497c() {
        Bundle a;
        RemoteViews u;
        RemoteViews s;
        C0565k.C0578i iVar = this.f1826c.f1798q;
        if (iVar != null) {
            iVar.mo2420b(this);
        }
        RemoteViews t = iVar != null ? iVar.mo2472t(this) : null;
        Notification d = mo2498d();
        if (!(t == null && (t = this.f1826c.f1767I) == null)) {
            d.contentView = t;
        }
        int i = Build.VERSION.SDK_INT;
        if (!(i < 16 || iVar == null || (s = iVar.mo2471s(this)) == null)) {
            d.bigContentView = s;
        }
        if (!(i < 21 || iVar == null || (u = this.f1826c.f1798q.mo2473u(this)) == null)) {
            d.headsUpContentView = u;
        }
        if (!(i < 16 || iVar == null || (a = C0565k.m2232a(d)) == null)) {
            iVar.mo2425a(a);
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo2498d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1825b.build();
        }
        if (i >= 24) {
            Notification build = this.f1825b.build();
            if (this.f1831h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f1831h != 2)) {
                    m2379h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1831h == 1) {
                    m2379h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1825b.setExtras(this.f1830g);
            Notification build2 = this.f1825b.build();
            RemoteViews remoteViews = this.f1827d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1828e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1832i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1831h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f1831h != 2)) {
                    m2379h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1831h == 1) {
                    m2379h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1825b.setExtras(this.f1830g);
            Notification build3 = this.f1825b.build();
            RemoteViews remoteViews4 = this.f1827d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1828e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1831h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f1831h != 2)) {
                    m2379h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1831h == 1) {
                    m2379h(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0580m.m2384a(this.f1829f);
            if (a != null) {
                this.f1830g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f1825b.setExtras(this.f1830g);
            Notification build4 = this.f1825b.build();
            RemoteViews remoteViews6 = this.f1827d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1828e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f1825b.getNotification();
        } else {
            Notification build5 = this.f1825b.build();
            Bundle a2 = C0565k.m2232a(build5);
            Bundle bundle = new Bundle(this.f1830g);
            for (String str : this.f1830g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0580m.m2384a(this.f1829f);
            if (a3 != null) {
                C0565k.m2232a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f1827d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1828e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo2499f() {
        return this.f1824a;
    }
}
