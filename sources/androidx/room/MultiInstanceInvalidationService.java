package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1155c;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f */
    int f3054f = 0;

    /* renamed from: g */
    final HashMap<Integer, String> f3055g = new HashMap<>();

    /* renamed from: h */
    final RemoteCallbackList<C1152b> f3056h = new C1149a();

    /* renamed from: i */
    private final C1155c.C1156a f3057i = new C1150b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C1149a extends RemoteCallbackList<C1152b> {
        C1149a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C1152b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f3055g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C1150b extends C1155c.C1156a {
        C1150b() {
        }

        /* renamed from: c5 */
        public void mo3914c5(C1152b bVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f3056h) {
                MultiInstanceInvalidationService.this.f3056h.unregister(bVar);
                MultiInstanceInvalidationService.this.f3055g.remove(Integer.valueOf(i));
            }
        }

        /* renamed from: g3 */
        public int mo3915g3(C1152b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f3056h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f3054f + 1;
                multiInstanceInvalidationService.f3054f = i;
                if (multiInstanceInvalidationService.f3056h.register(bVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f3055g.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f3054f--;
                return 0;
            }
        }

        /* renamed from: s4 */
        public void mo3916s4(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f3056h) {
                String str = MultiInstanceInvalidationService.this.f3055g.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f3056h.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f3056h.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f3055g.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f3056h.getBroadcastItem(i2).mo3918e2(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f3056h.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f3056h.finishBroadcast();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f3057i;
    }
}
