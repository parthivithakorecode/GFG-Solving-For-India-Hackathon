package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0089n;
import p003a2.C0092o;
import p034e2.C2549f;
import p048g2.C2635a;
import p048g2.C2637b;

public final class DynamiteModule {
    @RecentlyNonNull

    /* renamed from: b */
    public static final C1482b f3794b = new C1486d();
    @RecentlyNonNull

    /* renamed from: c */
    public static final C1482b f3795c = new C1487e();
    @RecentlyNonNull

    /* renamed from: d */
    public static final C1482b f3796d = new C1488f();
    @RecentlyNonNull

    /* renamed from: e */
    public static final C1482b f3797e = new C1489g();
    @RecentlyNonNull

    /* renamed from: f */
    public static final C1482b f3798f = new C1490h();
    @RecentlyNonNull

    /* renamed from: g */
    public static final C1482b f3799g = new C1491i();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    private static Boolean f3800h = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i */
    private static String f3801i = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: j */
    private static int f3802j = -1;

    /* renamed from: k */
    private static final ThreadLocal<C1493k> f3803k = new ThreadLocal<>();

    /* renamed from: l */
    private static final ThreadLocal<Long> f3804l = new C1484b();

    /* renamed from: m */
    private static final C1495m f3805m = new C1485c();
    @RecentlyNonNull

    /* renamed from: n */
    public static final C1482b f3806n = new C1492j();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: o */
    private static C1497o f3807o;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: p */
    private static C1498p f3808p;

    /* renamed from: a */
    private final Context f3809a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C1481a extends Exception {
        /* synthetic */ C1481a(String str, C1484b bVar) {
            super(str);
        }

        /* synthetic */ C1481a(String str, Throwable th, C1484b bVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C1482b {
        /* renamed from: a */
        C1496n mo5026a(Context context, String str, C1495m mVar);
    }

    private DynamiteModule(Context context) {
        C0092o.m313i(context);
        this.f3809a = context;
    }

    /* renamed from: a */
    public static int m5725a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C0089n.m301a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m5726c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return m5728f(context, str, false);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static DynamiteModule m5727e(@RecentlyNonNull Context context, @RecentlyNonNull C1482b bVar, @RecentlyNonNull String str) {
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        C2635a aVar;
        C1498p pVar;
        Boolean valueOf;
        C2635a aVar2;
        Context context2 = context;
        C1482b bVar2 = bVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<C1493k> threadLocal = f3803k;
        C1493k kVar = threadLocal.get();
        C1493k kVar2 = new C1493k((C1484b) null);
        threadLocal.set(kVar2);
        ThreadLocal<Long> threadLocal2 = f3804l;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C1496n a = bVar2.mo5026a(context2, str2, f3805m);
            int i2 = a.f3812a;
            int i3 = a.f3813b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a.f3814c;
            if (i4 == 0 || ((i4 == -1 && a.f3812a == 0) || (i4 == 1 && a.f3813b == 0))) {
                int i5 = a.f3812a;
                int i6 = a.f3813b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new C1481a(sb2.toString(), (C1484b) null);
            } else if (i4 == -1) {
                DynamiteModule i7 = m5731i(context2, str2);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = kVar2.f3810a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(kVar);
                return i7;
            } else if (i4 == 1) {
                try {
                    int i8 = a.f3813b;
                    try {
                        synchronized (cls) {
                            bool = f3800h;
                        }
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                sb3.append("Selected remote version of ");
                                sb3.append(str2);
                                sb3.append(", version >= ");
                                sb3.append(i8);
                                Log.i("DynamiteModule", sb3.toString());
                                synchronized (cls) {
                                    pVar = f3808p;
                                }
                                if (pVar != null) {
                                    C1493k kVar3 = threadLocal.get();
                                    if (kVar3 == null || kVar3.f3810a == null) {
                                        throw new C1481a("No result cursor", (C1484b) null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor2 = kVar3.f3810a;
                                    C2637b.m21358Z2(null);
                                    synchronized (cls) {
                                        valueOf = Boolean.valueOf(f3802j >= 2);
                                    }
                                    if (valueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVar2 = pVar.mo5039Z2(C2637b.m21358Z2(applicationContext), str2, i8, C2637b.m21358Z2(cursor2));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVar2 = pVar.mo5038C0(C2637b.m21358Z2(applicationContext), str2, i8, C2637b.m21358Z2(cursor2));
                                    }
                                    Context context3 = (Context) C2637b.m21357C0(aVar2);
                                    if (context3 != null) {
                                        dynamiteModule = new DynamiteModule(context3);
                                    } else {
                                        throw new C1481a("Failed to get module context", (C1484b) null);
                                    }
                                } else {
                                    throw new C1481a("DynamiteLoaderV2 was not cached.", (C1484b) null);
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                sb4.append("Selected remote version of ");
                                sb4.append(str2);
                                sb4.append(", version >= ");
                                sb4.append(i8);
                                Log.i("DynamiteModule", sb4.toString());
                                C1497o k = m5733k(context);
                                if (k != null) {
                                    int P4 = k.mo5033P4();
                                    if (P4 >= 3) {
                                        C1493k kVar4 = threadLocal.get();
                                        if (kVar4 != null) {
                                            aVar = k.mo5037y5(C2637b.m21358Z2(context), str2, i8, C2637b.m21358Z2(kVar4.f3810a));
                                        } else {
                                            throw new C1481a("No cached result cursor holder", (C1484b) null);
                                        }
                                    } else if (P4 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVar = k.mo5035b3(C2637b.m21358Z2(context), str2, i8);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVar = k.mo5031C0(C2637b.m21358Z2(context), str2, i8);
                                    }
                                    if (C2637b.m21357C0(aVar) != null) {
                                        dynamiteModule = new DynamiteModule((Context) C2637b.m21357C0(aVar));
                                    } else {
                                        throw new C1481a("Failed to load remote module.", (C1484b) null);
                                    }
                                } else {
                                    throw new C1481a("Failed to create IDynamiteLoader.", (C1484b) null);
                                }
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor3 = kVar2.f3810a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(kVar);
                            return dynamiteModule;
                        }
                        throw new C1481a("Failed to determine which loading route to use.", (C1484b) null);
                    } catch (RemoteException e) {
                        throw new C1481a("Failed to load remote module.", e, (C1484b) null);
                    } catch (C1481a e2) {
                        throw e2;
                    } catch (Throwable th) {
                        C2549f.m21186a(context2, th);
                        throw new C1481a("Failed to load remote module.", th, (C1484b) null);
                    }
                } catch (C1481a e3) {
                    String valueOf2 = String.valueOf(e3.getMessage());
                    Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                    int i9 = a.f3812a;
                    if (i9 != 0) {
                        if (bVar.mo5026a(context2, str2, new C1494l(i9, 0)).f3814c == -1) {
                            DynamiteModule i10 = m5731i(context2, str2);
                            if (i != 0) {
                                f3804l.set(Long.valueOf(longValue));
                            }
                            return i10;
                        }
                    }
                    throw new C1481a("Remote load failed. No local fallback found.", e3, (C1484b) null);
                }
            } else {
                StringBuilder sb5 = new StringBuilder(47);
                sb5.append("VersionPolicy returned invalid code:");
                sb5.append(0);
                throw new C1481a(sb5.toString(), (C1484b) null);
            }
        } finally {
            if (longValue == 0) {
                f3804l.remove();
            } else {
                f3804l.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = kVar2.f3810a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f3803k.set(kVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0093=Splitter:B:39:0x0093, B:23:0x0054=Splitter:B:23:0x0054, B:18:0x0039=Splitter:B:18:0x0039} */
    /* renamed from: f */
    public static int m5728f(@androidx.annotation.RecentlyNonNull android.content.Context r9, @androidx.annotation.RecentlyNonNull java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01ac }
            java.lang.Boolean r1 = f3800h     // Catch:{ all -> 0x01a9 }
            r2 = 0
            if (r1 != 0) goto L_0x00cc
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x003c
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a0 }
            if (r4 != r1) goto L_0x0036
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a0 }
            goto L_0x009e
        L_0x0036:
            m5732j(r4)     // Catch:{ a -> 0x0039 }
        L_0x0039:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a0 }
            goto L_0x009e
        L_0x003c:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r9.getApplicationContext()     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x00a0 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x0054
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a0 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a0 }
            goto L_0x0033
        L_0x0054:
            int r4 = m5729g(r9, r10, r11)     // Catch:{ a -> 0x0096 }
            java.lang.String r5 = f3801i     // Catch:{ a -> 0x0096 }
            if (r5 == 0) goto L_0x0093
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x0096 }
            if (r5 == 0) goto L_0x0063
            goto L_0x0093
        L_0x0063:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0096 }
            r6 = 29
            if (r5 < r6) goto L_0x0078
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0096 }
            java.lang.String r6 = f3801i     // Catch:{ a -> 0x0096 }
            p003a2.C0092o.m313i(r6)     // Catch:{ a -> 0x0096 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0096 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0096 }
            goto L_0x0086
        L_0x0078:
            com.google.android.gms.dynamite.a r5 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x0096 }
            java.lang.String r6 = f3801i     // Catch:{ a -> 0x0096 }
            p003a2.C0092o.m313i(r6)     // Catch:{ a -> 0x0096 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0096 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0096 }
        L_0x0086:
            m5732j(r5)     // Catch:{ a -> 0x0096 }
            r1.set(r2, r5)     // Catch:{ a -> 0x0096 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x0096 }
            f3800h = r5     // Catch:{ a -> 0x0096 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a9 }
            return r4
        L_0x0093:
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x01a9 }
            return r4
        L_0x0096:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a0 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a0 }
            goto L_0x0033
        L_0x009e:
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            goto L_0x00ca
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a7, IllegalAccessException -> 0x00a5, NoSuchFieldException -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            goto L_0x00a8
        L_0x00a5:
            r1 = move-exception
            goto L_0x00a8
        L_0x00a7:
            r1 = move-exception
        L_0x00a8:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01a9 }
            int r4 = r1.length()     // Catch:{ all -> 0x01a9 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a9 }
            r5.<init>(r4)     // Catch:{ all -> 0x01a9 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01a9 }
            r5.append(r1)     // Catch:{ all -> 0x01a9 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01a9 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01a9 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01a9 }
        L_0x00ca:
            f3800h = r1     // Catch:{ all -> 0x01a9 }
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x01a9 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01ac }
            r1 = 0
            if (r0 == 0) goto L_0x00fa
            int r9 = m5729g(r9, r10, r11)     // Catch:{ a -> 0x00d9 }
            return r9
        L_0x00d9:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01ac }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01ac }
            int r2 = r10.length()     // Catch:{ all -> 0x01ac }
            if (r2 == 0) goto L_0x00f1
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01ac }
            goto L_0x00f6
        L_0x00f1:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01ac }
            r10.<init>(r0)     // Catch:{ all -> 0x01ac }
        L_0x00f6:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01ac }
            return r1
        L_0x00fa:
            com.google.android.gms.dynamite.o r3 = m5733k(r9)     // Catch:{ all -> 0x01ac }
            if (r3 != 0) goto L_0x0102
            goto L_0x01a2
        L_0x0102:
            int r0 = r3.mo5033P4()     // Catch:{ RemoteException -> 0x017c }
            r4 = 3
            if (r0 < r4) goto L_0x0156
            g2.a r4 = p048g2.C2637b.m21358Z2(r9)     // Catch:{ RemoteException -> 0x017c }
            java.lang.ThreadLocal<java.lang.Long> r0 = f3804l     // Catch:{ RemoteException -> 0x017c }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x017c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x017c }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x017c }
            r5 = r10
            r6 = r11
            g2.a r10 = r3.mo5036u5(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x017c }
            java.lang.Object r10 = p048g2.C2637b.m21357C0(r10)     // Catch:{ RemoteException -> 0x017c }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x017c }
            if (r10 == 0) goto L_0x0143
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r11 != 0) goto L_0x012e
            goto L_0x0143
        L_0x012e:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r11 <= 0) goto L_0x013b
            boolean r0 = m5730h(r10)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r0 == 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r2 = r10
        L_0x013c:
            if (r2 == 0) goto L_0x0141
            r2.close()     // Catch:{ all -> 0x01ac }
        L_0x0141:
            r1 = r11
            goto L_0x01a2
        L_0x0143:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r10 == 0) goto L_0x01a2
            r10.close()     // Catch:{ all -> 0x01ac }
            goto L_0x01a2
        L_0x0150:
            r11 = move-exception
            r2 = r10
            goto L_0x01a3
        L_0x0153:
            r11 = move-exception
            r2 = r10
            goto L_0x017e
        L_0x0156:
            r4 = 2
            if (r0 != r4) goto L_0x0169
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x017c }
            g2.a r0 = p048g2.C2637b.m21358Z2(r9)     // Catch:{ RemoteException -> 0x017c }
            int r1 = r3.mo5032M3(r0, r10, r11)     // Catch:{ RemoteException -> 0x017c }
            goto L_0x01a2
        L_0x0169:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x017c }
            g2.a r0 = p048g2.C2637b.m21358Z2(r9)     // Catch:{ RemoteException -> 0x017c }
            int r1 = r3.mo5034Z2(r0, r10, r11)     // Catch:{ RemoteException -> 0x017c }
            goto L_0x01a2
        L_0x0179:
            r10 = move-exception
            r11 = r10
            goto L_0x01a3
        L_0x017c:
            r10 = move-exception
            r11 = r10
        L_0x017e:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0179 }
            int r3 = r11.length()     // Catch:{ all -> 0x0179 }
            if (r3 == 0) goto L_0x0195
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x0179 }
            goto L_0x019a
        L_0x0195:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0179 }
            r11.<init>(r0)     // Catch:{ all -> 0x0179 }
        L_0x019a:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x0179 }
            if (r2 == 0) goto L_0x01a2
            r2.close()     // Catch:{ all -> 0x01ac }
        L_0x01a2:
            return r1
        L_0x01a3:
            if (r2 == 0) goto L_0x01a8
            r2.close()     // Catch:{ all -> 0x01ac }
        L_0x01a8:
            throw r11     // Catch:{ all -> 0x01ac }
        L_0x01a9:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01a9 }
            throw r10     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r10 = move-exception
            p034e2.C2549f.m21186a(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m5728f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (m5730h(r9) != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a9  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m5729g(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = f3804l     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r9 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r11) goto L_0x0019
            r9 = r4
        L_0x0019:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r4)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r4)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri r4 = r9.build()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            if (r9 == 0) goto L_0x0081
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x0090 }
            if (r10 == 0) goto L_0x0081
            r10 = 0
            int r10 = r9.getInt(r10)     // Catch:{ Exception -> 0x0090 }
            if (r10 <= 0) goto L_0x007a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch:{ Exception -> 0x0090 }
            r1 = 2
            java.lang.String r1 = r9.getString(r1)     // Catch:{ all -> 0x0077 }
            f3801i = r1     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0077 }
            if (r1 < 0) goto L_0x006f
            int r1 = r9.getInt(r1)     // Catch:{ all -> 0x0077 }
            f3802j = r1     // Catch:{ all -> 0x0077 }
        L_0x006f:
            monitor-exit(r11)     // Catch:{ all -> 0x0077 }
            boolean r11 = m5730h(r9)     // Catch:{ Exception -> 0x0090 }
            if (r11 == 0) goto L_0x007a
            goto L_0x007b
        L_0x0077:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0077 }
            throw r10     // Catch:{ Exception -> 0x0090 }
        L_0x007a:
            r0 = r9
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.close()
        L_0x0080:
            return r10
        L_0x0081:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            android.util.Log.w(r10, r11)     // Catch:{ Exception -> 0x0090 }
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0090 }
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r0)     // Catch:{ Exception -> 0x0090 }
            throw r10     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            r10 = move-exception
            goto L_0x0098
        L_0x0092:
            r9 = move-exception
            r10 = r9
            goto L_0x00a7
        L_0x0095:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L_0x0098:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.C1481a     // Catch:{ all -> 0x00a5 }
            if (r11 == 0) goto L_0x009d
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x009d:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "V2 version check failed"
            r11.<init>(r1, r10, r0)     // Catch:{ all -> 0x00a5 }
            throw r11     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            r0 = r9
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m5729g(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: h */
    private static boolean m5730h(Cursor cursor) {
        C1493k kVar = f3803k.get();
        if (kVar == null || kVar.f3810a != null) {
            return false;
        }
        kVar.f3810a = cursor;
        return true;
    }

    /* renamed from: i */
    private static DynamiteModule m5731i(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: j */
    private static void m5732j(ClassLoader classLoader) {
        C1498p pVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                pVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                pVar = queryLocalInterface instanceof C1498p ? (C1498p) queryLocalInterface : new C1498p(iBinder);
            }
            f3808p = pVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C1481a("Failed to instantiate dynamite loader", e, (C1484b) null);
        }
    }

    /* renamed from: k */
    private static C1497o m5733k(Context context) {
        C1497o oVar;
        synchronized (DynamiteModule.class) {
            C1497o oVar2 = f3807o;
            if (oVar2 != null) {
                return oVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    oVar = queryLocalInterface instanceof C1497o ? (C1497o) queryLocalInterface : new C1497o(iBinder);
                }
                if (oVar != null) {
                    f3807o = oVar;
                    return oVar;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Context mo5024b() {
        return this.f3809a;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public IBinder mo5025d(@RecentlyNonNull String str) {
        try {
            return (IBinder) this.f3809a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C1481a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C1484b) null);
        }
    }
}
