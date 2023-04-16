package p125r2;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p070j2.C3228b;
import p070j2.C3229c;
import p160x1.C4280b;

/* renamed from: r2.e */
public abstract class C3981e extends C3228b implements C3982f {
    public C3981e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public final boolean mo14141Z2(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                C4280b bVar = (C4280b) C3229c.m24128a(parcel, C4280b.CREATOR);
                C3978b bVar2 = (C3978b) C3229c.m24128a(parcel, C3978b.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) C3229c.m24128a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) C3229c.m24128a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C3229c.m24128a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo15444n4((C3988l) C3229c.m24128a(parcel, C3988l.CREATOR));
                break;
            case 9:
                C3984h hVar = (C3984h) C3229c.m24128a(parcel, C3984h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
