package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0743e;

/* renamed from: androidx.appcompat.widget.b0 */
final class C0418b0 {

    /* renamed from: a */
    private TextView f1322a;

    /* renamed from: b */
    private TextClassifier f1323b;

    /* renamed from: androidx.appcompat.widget.b0$a */
    private static final class C0419a {
        /* renamed from: a */
        static TextClassifier m1683a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C0418b0(TextView textView) {
        this.f1322a = (TextView) C0743e.m2958f(textView);
    }

    /* renamed from: a */
    public TextClassifier mo1790a() {
        TextClassifier textClassifier = this.f1323b;
        return textClassifier == null ? C0419a.m1683a(this.f1322a) : textClassifier;
    }

    /* renamed from: b */
    public void mo1791b(TextClassifier textClassifier) {
        this.f1323b = textClassifier;
    }
}
