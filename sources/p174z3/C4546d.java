package p174z3;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0120a;
import p005a4.C0128c;
import p005a4.C0140f;
import p099n3.C3768b;

/* renamed from: z3.d */
public class C4546d {

    /* renamed from: a */
    public final C0120a<Object> f23081a;

    /* renamed from: z3.d$a */
    public interface C4547a {
        /* renamed from: a */
        void mo13386a(boolean z);
    }

    /* renamed from: z3.d$b */
    public static class C4548b {

        /* renamed from: a */
        public final KeyEvent f23082a;

        /* renamed from: b */
        public final Character f23083b;

        public C4548b(KeyEvent keyEvent, Character ch) {
            this.f23082a = keyEvent;
            this.f23083b = ch;
        }
    }

    public C4546d(C0128c cVar) {
        this.f23081a = new C0120a<>(cVar, "flutter/keyevent", C0140f.f267a);
    }

    /* renamed from: b */
    private static C0120a.C0126e<Object> m27489b(C4547a aVar) {
        return new C4545c(aVar);
    }

    /* renamed from: c */
    private Map<String, Object> m27490c(C4548b bVar, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f23082a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f23082a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f23082a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f23082a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f23082a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f23082a.getMetaState()));
        Character ch = bVar.f23083b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f23082a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f23082a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f23082a.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m27491d(C4547a aVar, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                C3768b.m25588b("KeyEventChannel", "Unable to unpack JSON message: " + e);
            }
        }
        aVar.mo13386a(z);
    }

    /* renamed from: e */
    public void mo16224e(C4548b bVar, boolean z, C4547a aVar) {
        this.f23081a.mo306d(m27490c(bVar, z), m27489b(aVar));
    }
}
