package p160x1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.C0983d;
import androidx.fragment.app.C1011n;
import p003a2.C0092o;

/* renamed from: x1.m */
public class C4291m extends C0983d {

    /* renamed from: w0 */
    private Dialog f22598w0;

    /* renamed from: x0 */
    private DialogInterface.OnCancelListener f22599x0;

    /* renamed from: y0 */
    private Dialog f22600y0;

    /* renamed from: M1 */
    public static C4291m m26867M1(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C4291m mVar = new C4291m();
        Dialog dialog2 = (Dialog) C0092o.m314j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        mVar.f22598w0 = dialog2;
        if (onCancelListener != null) {
            mVar.f22599x0 = onCancelListener;
        }
        return mVar;
    }

    /* renamed from: F1 */
    public Dialog mo3445F1(Bundle bundle) {
        Dialog dialog = this.f22598w0;
        if (dialog != null) {
            return dialog;
        }
        mo3448J1(false);
        if (this.f22600y0 == null) {
            this.f22600y0 = new AlertDialog.Builder(mo3294j()).create();
        }
        return this.f22600y0;
    }

    /* renamed from: L1 */
    public void mo3450L1(@RecentlyNonNull C1011n nVar, String str) {
        super.mo3450L1(nVar, str);
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f22599x0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
