package p048g2;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import p077k2.C3299b;

/* renamed from: g2.a */
public interface C2635a extends IInterface {

    /* renamed from: g2.a$a */
    public static abstract class C2636a extends C3299b implements C2635a {
        public C2636a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        /* renamed from: n0 */
        public static C2635a m21356n0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C2635a ? (C2635a) queryLocalInterface : new C2640d(iBinder);
        }
    }
}
