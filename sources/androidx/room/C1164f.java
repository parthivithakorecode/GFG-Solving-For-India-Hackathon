package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1152b;
import androidx.room.C1155c;
import androidx.room.C1159e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.f */
class C1164f {

    /* renamed from: a */
    final Context f3103a;

    /* renamed from: b */
    final String f3104b;

    /* renamed from: c */
    int f3105c;

    /* renamed from: d */
    final C1159e f3106d;

    /* renamed from: e */
    final C1159e.C1162c f3107e;

    /* renamed from: f */
    C1155c f3108f;

    /* renamed from: g */
    final Executor f3109g;

    /* renamed from: h */
    final C1152b f3110h = new C1165a();

    /* renamed from: i */
    final AtomicBoolean f3111i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f3112j;

    /* renamed from: k */
    final Runnable f3113k;

    /* renamed from: l */
    final Runnable f3114l;

    /* renamed from: m */
    private final Runnable f3115m;

    /* renamed from: androidx.room.f$a */
    class C1165a extends C1152b.C1153a {

        /* renamed from: androidx.room.f$a$a */
        class C1166a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String[] f3117f;

            C1166a(String[] strArr) {
                this.f3117f = strArr;
            }

            public void run() {
                C1164f.this.f3106d.mo3928e(this.f3117f);
            }
        }

        C1165a() {
        }

        /* renamed from: e2 */
        public void mo3918e2(String[] strArr) {
            C1164f.this.f3109g.execute(new C1166a(strArr));
        }
    }

    /* renamed from: androidx.room.f$b */
    class C1167b implements ServiceConnection {
        C1167b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1164f.this.f3108f = C1155c.C1156a.m4686D(iBinder);
            C1164f fVar = C1164f.this;
            fVar.f3109g.execute(fVar.f3113k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1164f fVar = C1164f.this;
            fVar.f3109g.execute(fVar.f3114l);
            C1164f.this.f3108f = null;
        }
    }

    /* renamed from: androidx.room.f$c */
    class C1168c implements Runnable {
        C1168c() {
        }

        public void run() {
            try {
                C1164f fVar = C1164f.this;
                C1155c cVar = fVar.f3108f;
                if (cVar != null) {
                    fVar.f3105c = cVar.mo3915g3(fVar.f3110h, fVar.f3104b);
                    C1164f fVar2 = C1164f.this;
                    fVar2.f3106d.mo3925a(fVar2.f3107e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.f$d */
    class C1169d implements Runnable {
        C1169d() {
        }

        public void run() {
            C1164f fVar = C1164f.this;
            fVar.f3106d.mo3930g(fVar.f3107e);
        }
    }

    /* renamed from: androidx.room.f$e */
    class C1170e implements Runnable {
        C1170e() {
        }

        public void run() {
            C1164f fVar = C1164f.this;
            fVar.f3106d.mo3930g(fVar.f3107e);
            try {
                C1164f fVar2 = C1164f.this;
                C1155c cVar = fVar2.f3108f;
                if (cVar != null) {
                    cVar.mo3914c5(fVar2.f3110h, fVar2.f3105c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            C1164f fVar3 = C1164f.this;
            fVar3.f3103a.unbindService(fVar3.f3112j);
        }
    }

    /* renamed from: androidx.room.f$f */
    class C1171f extends C1159e.C1162c {
        C1171f(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3939a() {
            return true;
        }

        /* renamed from: b */
        public void mo3940b(Set<String> set) {
            if (!C1164f.this.f3111i.get()) {
                try {
                    C1164f fVar = C1164f.this;
                    C1155c cVar = fVar.f3108f;
                    if (cVar != null) {
                        cVar.mo3916s4(fVar.f3105c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    C1164f(Context context, String str, C1159e eVar, Executor executor) {
        C1167b bVar = new C1167b();
        this.f3112j = bVar;
        this.f3113k = new C1168c();
        this.f3114l = new C1169d();
        this.f3115m = new C1170e();
        Context applicationContext = context.getApplicationContext();
        this.f3103a = applicationContext;
        this.f3104b = str;
        this.f3106d = eVar;
        this.f3109g = executor;
        this.f3107e = new C1171f((String[]) eVar.f3080a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
