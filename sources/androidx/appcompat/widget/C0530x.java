package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0769c;
import androidx.core.view.C0833y;

/* renamed from: androidx.appcompat.widget.x */
final class C0530x {

    /* renamed from: androidx.appcompat.widget.x$a */
    private static final class C0531a {
        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        static boolean m2165a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0833y.m3323H(textView, new C0769c.C0770a(dragEvent.getClipData(), 3).mo2831a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m2166b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0833y.m3323H(view, new C0769c.C0770a(dragEvent.getClipData(), 3).mo2831a());
            return true;
        }
    }

    /* renamed from: a */
    static boolean m2162a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C0833y.m3364t(view) != null) {
            Activity c = m2164c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? C0531a.m2165a(dragEvent, (TextView) view, c) : C0531a.m2166b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    static boolean m2163b(TextView textView, int i) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C0833y.m3364t(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0769c.C0770a aVar = new C0769c.C0770a(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C0833y.m3323H(textView, aVar.mo2833c(i2).mo2831a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m2164c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
