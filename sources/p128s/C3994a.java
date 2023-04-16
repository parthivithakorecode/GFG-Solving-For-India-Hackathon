package p128s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.C0743e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: s.a */
public final class C3994a {

    /* renamed from: a */
    private static final String[] f22162a = new String[0];

    /* renamed from: s.a$a */
    private static class C3995a {
        /* renamed from: a */
        static void m26229a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m26221a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f22162a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f22162a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f22162a;
    }

    /* renamed from: b */
    private static boolean m26222b(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    private static boolean m26223c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m26224d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m26225e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        C0743e.m2958f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C3995a.m26229a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            m26227g(editorInfo, (CharSequence) null, 0, 0);
        } else if (m26223c(editorInfo.inputType)) {
            m26227g(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            m26227g(editorInfo, charSequence, i4, i5);
        } else {
            m26228h(editorInfo, charSequence, i4, i5);
        }
    }

    /* renamed from: f */
    public static void m26226f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3995a.m26229a(editorInfo, charSequence, 0);
        } else {
            m26225e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m26227g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    private static void m26228h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m26222b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m26222b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i4 != i3 ? TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)}) : charSequence.subSequence(i6, min2 + i4 + min + i6);
        int i7 = min2 + 0;
        m26227g(editorInfo, concat, i7, i4 + i7);
    }
}
