package p128s;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.C0740c;
import androidx.core.util.C0743e;
import androidx.core.view.C0769c;
import androidx.core.view.C0833y;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: s.c */
public final class C3997c {

    /* renamed from: s.c$a */
    class C3998a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C4000c f22164a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3998a(InputConnection inputConnection, boolean z, C4000c cVar) {
            super(inputConnection, z);
            this.f22164a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f22164a.mo15466a(C4001d.m26238f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: s.c$b */
    class C3999b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ C4000c f22165a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3999b(InputConnection inputConnection, boolean z, C4000c cVar) {
            super(inputConnection, z);
            this.f22165a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C3997c.m26235e(str, bundle, this.f22165a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: s.c$c */
    public interface C4000c {
        /* renamed from: a */
        boolean mo15466a(C4001d dVar, int i, Bundle bundle);
    }

    /* renamed from: b */
    private static C4000c m26232b(View view) {
        C0743e.m2958f(view);
        return new C3996b(view);
    }

    /* renamed from: c */
    public static InputConnection m26233c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m26234d(inputConnection, editorInfo, m26232b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m26234d(InputConnection inputConnection, EditorInfo editorInfo, C4000c cVar) {
        C0740c.m2949d(inputConnection, "inputConnection must be non-null");
        C0740c.m2949d(editorInfo, "editorInfo must be non-null");
        C0740c.m2949d(cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new C3998a(inputConnection, false, cVar) : C3994a.m26221a(editorInfo).length == 0 ? inputConnection : new C3999b(inputConnection, false, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m26235e(java.lang.String r7, android.os.Bundle r8, p128s.C3997c.C4000c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = r0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            s.d r8 = new s.d     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo15466a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p128s.C3997c.m26235e(java.lang.String, android.os.Bundle, s.c$c):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ boolean m26236f(View view, C4001d dVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                dVar.mo15472d();
                InputContentInfo inputContentInfo = (InputContentInfo) dVar.mo15473e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return C0833y.m3323H(view, new C0769c.C0770a(new ClipData(dVar.mo15470b(), new ClipData.Item(dVar.mo15469a())), 2).mo2834d(dVar.mo15471c()).mo2832b(bundle).mo2831a()) == null;
    }
}
