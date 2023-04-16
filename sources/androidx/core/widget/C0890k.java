package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0769c;
import androidx.core.view.C0828t;

/* renamed from: androidx.core.widget.k */
public final class C0890k implements C0828t {

    /* renamed from: androidx.core.widget.k$a */
    private static final class C0891a {
        /* renamed from: a */
        static CharSequence m3684a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: androidx.core.widget.k$b */
    private static final class C0892b {
        /* renamed from: a */
        static CharSequence m3685a(Context context, ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    private static CharSequence m3681b(Context context, ClipData.Item item, int i) {
        return Build.VERSION.SDK_INT >= 16 ? C0891a.m3684a(context, item, i) : C0892b.m3685a(context, item, i);
    }

    /* renamed from: c */
    private static void m3682c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: a */
    public C0769c mo2952a(View view, C0769c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        if (cVar.mo2828d() == 2) {
            return cVar;
        }
        ClipData b = cVar.mo2826b();
        int c = cVar.mo2827c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = m3681b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (!z) {
                    m3682c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}
