package p160x1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p003a2.C0092o;

/* renamed from: x1.c */
public class C4281c extends DialogFragment {

    /* renamed from: f */
    private Dialog f22579f;

    /* renamed from: g */
    private DialogInterface.OnCancelListener f22580g;

    /* renamed from: h */
    private Dialog f22581h;

    /* renamed from: a */
    public static C4281c m26826a(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C4281c cVar = new C4281c();
        Dialog dialog2 = (Dialog) C0092o.m314j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f22579f = dialog2;
        if (onCancelListener != null) {
            cVar.f22580g = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f22580g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f22579f;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f22581h == null) {
            this.f22581h = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f22581h;
    }

    public void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
