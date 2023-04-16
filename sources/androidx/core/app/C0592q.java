package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: androidx.core.app.q */
public final class C0592q {

    /* renamed from: androidx.core.app.q$a */
    static class C0593a {
        /* renamed from: a */
        static void m2436a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m2437b(C0592q qVar) {
            throw null;
        }

        /* renamed from: c */
        static Bundle m2438c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: a */
    static RemoteInput m2434a(C0592q qVar) {
        return C0593a.m2437b(qVar);
    }

    /* renamed from: b */
    static RemoteInput[] m2435b(C0592q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[qVarArr.length];
        for (int i = 0; i < qVarArr.length; i++) {
            remoteInputArr[i] = m2434a(qVarArr[i]);
        }
        return remoteInputArr;
    }
}
