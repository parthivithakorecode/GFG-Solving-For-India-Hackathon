package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: androidx.core.text.b */
public final class C0720b {

    /* renamed from: androidx.core.text.b$a */
    static class C0721a {
        /* renamed from: a */
        static Spanned m2910a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        /* renamed from: b */
        static Spanned m2911b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        /* renamed from: c */
        static String m2912c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    /* renamed from: a */
    public static Spanned m2909a(String str, int i) {
        return Build.VERSION.SDK_INT >= 24 ? C0721a.m2910a(str, i) : Html.fromHtml(str);
    }
}
