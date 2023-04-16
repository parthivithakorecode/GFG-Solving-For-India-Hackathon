package p078k3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.speech.tts.Voice;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p005a4.C0128c;
import p005a4.C0144j;
import p005a4.C0145k;
import p099n3.C3768b;
import p132s3.C4047a;

/* renamed from: k3.h */
public final class C3309h implements C0145k.C0149c, C4047a {

    /* renamed from: z */
    public static final C3310a f20794z = new C3310a((C3353e) null);

    /* renamed from: a */
    private Handler f20795a;

    /* renamed from: b */
    private C0145k f20796b;

    /* renamed from: c */
    private C0145k.C0150d f20797c;

    /* renamed from: d */
    private C0145k.C0150d f20798d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f20799e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f20800f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f20801g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f20802h;

    /* renamed from: i */
    private Context f20803i;

    /* renamed from: j */
    private TextToSpeech f20804j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final String f20805k = "TTS";

    /* renamed from: l */
    private final String f20806l = "com.google.android.tts";

    /* renamed from: m */
    private boolean f20807m;

    /* renamed from: n */
    private final ArrayList<Runnable> f20808n = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final HashMap<String, String> f20809o = new HashMap<>();

    /* renamed from: p */
    private Bundle f20810p;

    /* renamed from: q */
    private int f20811q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f20812r;

    /* renamed from: s */
    private String f20813s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f20814t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f20815u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f20816v;

    /* renamed from: w */
    private final UtteranceProgressListener f20817w = new C3311b(this);

    /* renamed from: x */
    private final TextToSpeech.OnInitListener f20818x = new C3303b(this);

    /* renamed from: y */
    private final TextToSpeech.OnInitListener f20819y = new C3302a(this);

    /* renamed from: k3.h$a */
    public static final class C3310a {
        private C3310a() {
        }

        public /* synthetic */ C3310a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: k3.h$b */
    public static final class C3311b extends UtteranceProgressListener {

        /* renamed from: a */
        final /* synthetic */ C3309h f20820a;

        C3311b(C3309h hVar) {
            this.f20820a = hVar;
        }

        /* renamed from: a */
        private final void m24437a(String str, int i, int i2) {
            if (str != null && !C0178n.m513m(str, "STF_", false, 2, (Object) null)) {
                String str2 = (String) this.f20820a.f20809o.get(str);
                HashMap hashMap = new HashMap();
                hashMap.put("text", str2);
                hashMap.put("start", String.valueOf(i));
                hashMap.put("end", String.valueOf(i2));
                C3357i.m24505b(str2);
                String substring = str2.substring(i, i2);
                C3357i.m24507d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                hashMap.put("word", substring);
                this.f20820a.m24390D("speak.onProgress", hashMap);
            }
        }

        public void onDone(String str) {
            String str2;
            Boolean bool;
            C3309h hVar;
            C3357i.m24508e(str, "utteranceId");
            if (!C0178n.m513m(str, "SIL_", false, 2, (Object) null)) {
                if (C0178n.m513m(str, "STF_", false, 2, (Object) null)) {
                    String k = this.f20820a.f20805k;
                    C3768b.m25587a(k, "Utterance ID has completed: " + str);
                    if (this.f20820a.f20801g) {
                        this.f20820a.mo14313V(1);
                    }
                    hVar = this.f20820a;
                    bool = Boolean.TRUE;
                    str2 = "synth.onComplete";
                } else {
                    String k2 = this.f20820a.f20805k;
                    C3768b.m25587a(k2, "Utterance ID has completed: " + str);
                    if (this.f20820a.f20799e && this.f20820a.f20816v == 0) {
                        this.f20820a.mo14312S(1);
                    }
                    hVar = this.f20820a;
                    bool = Boolean.TRUE;
                    str2 = "speak.onComplete";
                }
                hVar.m24390D(str2, bool);
                this.f20820a.f20812r = 0;
                this.f20820a.f20814t = null;
                this.f20820a.f20809o.remove(str);
            }
        }

        public void onError(String str) {
            C3309h hVar;
            String str2;
            String str3;
            C3357i.m24508e(str, "utteranceId");
            if (C0178n.m513m(str, "STF_", false, 2, (Object) null)) {
                if (this.f20820a.f20801g) {
                    this.f20820a.f20802h = false;
                }
                hVar = this.f20820a;
                str3 = "synth.onError";
                str2 = "Error from TextToSpeech (synth)";
            } else {
                if (this.f20820a.f20799e) {
                    this.f20820a.f20800f = false;
                }
                hVar = this.f20820a;
                str3 = "speak.onError";
                str2 = "Error from TextToSpeech (speak)";
            }
            hVar.m24390D(str3, str2);
        }

        public void onError(String str, int i) {
            String str2;
            C3309h hVar;
            String str3;
            C3357i.m24508e(str, "utteranceId");
            if (C0178n.m513m(str, "STF_", false, 2, (Object) null)) {
                if (this.f20820a.f20801g) {
                    this.f20820a.f20802h = false;
                }
                hVar = this.f20820a;
                str2 = "Error from TextToSpeech (synth) - " + i;
                str3 = "synth.onError";
            } else {
                if (this.f20820a.f20799e) {
                    this.f20820a.f20800f = false;
                }
                hVar = this.f20820a;
                str2 = "Error from TextToSpeech (speak) - " + i;
                str3 = "speak.onError";
            }
            hVar.m24390D(str3, str2);
        }

        public void onRangeStart(String str, int i, int i2, int i3) {
            C3357i.m24508e(str, "utteranceId");
            if (!C0178n.m513m(str, "STF_", false, 2, (Object) null)) {
                this.f20820a.f20812r = i;
                super.onRangeStart(str, i, i2, i3);
                m24437a(str, i, i2);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStart(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "utteranceId"
                kotlin.jvm.internal.C3357i.m24508e(r5, r0)
                java.lang.String r0 = "STF_"
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = p006a5.C0178n.m513m(r5, r0, r1, r2, r3)
                if (r0 == 0) goto L_0x001a
                k3.h r0 = r4.f20820a
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                java.lang.String r3 = "synth.onStart"
            L_0x0016:
                r0.m24390D(r3, r2)
                goto L_0x0052
            L_0x001a:
                k3.h r0 = r4.f20820a
                boolean r0 = r0.f20815u
                if (r0 == 0) goto L_0x0031
                k3.h r0 = r4.f20820a
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                java.lang.String r3 = "speak.onContinue"
                r0.m24390D(r3, r2)
                k3.h r0 = r4.f20820a
                r0.f20815u = r1
                goto L_0x0052
            L_0x0031:
                k3.h r0 = r4.f20820a
                java.lang.String r0 = r0.f20805k
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Utterance ID has started: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                p099n3.C3768b.m25587a(r0, r2)
                k3.h r0 = r4.f20820a
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                java.lang.String r3 = "speak.onStart"
                goto L_0x0016
            L_0x0052:
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r0 >= r2) goto L_0x006e
                k3.h r0 = r4.f20820a
                java.util.HashMap r0 = r0.f20809o
                java.lang.Object r0 = r0.get(r5)
                kotlin.jvm.internal.C3357i.m24505b(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = r0.length()
                r4.m24437a(r5, r1, r0)
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p078k3.C3309h.C3311b.onStart(java.lang.String):void");
        }

        public void onStop(String str, boolean z) {
            Boolean bool;
            C3309h hVar;
            String str2;
            C3357i.m24508e(str, "utteranceId");
            String k = this.f20820a.f20805k;
            C3768b.m25587a(k, "Utterance ID has been stopped: " + str + ". Interrupted: " + z);
            if (this.f20820a.f20799e) {
                this.f20820a.f20800f = false;
            }
            if (this.f20820a.f20815u) {
                hVar = this.f20820a;
                bool = Boolean.TRUE;
                str2 = "speak.onPause";
            } else {
                hVar = this.f20820a;
                bool = Boolean.TRUE;
                str2 = "speak.onCancel";
            }
            hVar.m24390D(str2, bool);
        }
    }

    /* renamed from: A */
    private final void m24387A(C0145k.C0150d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("min", "0");
        hashMap.put("normal", "0.5");
        hashMap.put("max", "1.5");
        hashMap.put("platform", "android");
        dVar.mo338a(hashMap);
    }

    /* renamed from: B */
    private final void m24388B(C0145k.C0150d dVar) {
        ArrayList arrayList = new ArrayList();
        try {
            TextToSpeech textToSpeech = this.f20804j;
            C3357i.m24505b(textToSpeech);
            for (Voice next : textToSpeech.getVoices()) {
                HashMap hashMap = new HashMap();
                String name = next.getName();
                C3357i.m24507d(name, "voice.name");
                hashMap.put("name", name);
                String languageTag = next.getLocale().toLanguageTag();
                C3357i.m24507d(languageTag, "voice.locale.toLanguageTag()");
                hashMap.put("locale", languageTag);
                arrayList.add(hashMap);
            }
            dVar.mo338a(arrayList);
        } catch (NullPointerException e) {
            String str = this.f20805k;
            C3768b.m25587a(str, "getVoices: " + e.getMessage());
            dVar.mo338a((Object) null);
        }
    }

    /* renamed from: C */
    private final void m24389C(C0128c cVar, Context context) {
        this.f20803i = context;
        C0145k kVar = new C0145k(cVar, "flutter_tts");
        this.f20796b = kVar;
        C3357i.m24505b(kVar);
        kVar.mo337e(this);
        this.f20795a = new Handler(Looper.getMainLooper());
        this.f20810p = new Bundle();
        this.f20804j = new TextToSpeech(context, this.f20819y, this.f20806l);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m24390D(String str, Object obj) {
        Handler handler = this.f20795a;
        C3357i.m24505b(handler);
        handler.post(new C3308g(this, str, obj));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final void m24391E(C3309h hVar, String str, Object obj) {
        C3357i.m24508e(hVar, "this$0");
        C3357i.m24508e(str, "$method");
        C3357i.m24508e(obj, "$arguments");
        C0145k kVar = hVar.f20796b;
        if (kVar != null) {
            C3357i.m24505b(kVar);
            kVar.mo335c(str, obj);
        }
    }

    /* renamed from: F */
    private final boolean m24392F(Locale locale) {
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        return textToSpeech.isLanguageAvailable(locale) >= 0;
    }

    /* renamed from: G */
    private final boolean m24393G(String str) {
        C3357i.m24505b(str);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C3357i.m24507d(forLanguageTag, "forLanguageTag(language!!)");
        if (!m24392F(forLanguageTag)) {
            return false;
        }
        Voice voice = null;
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        Iterator<Voice> it = textToSpeech.getVoices().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Voice next = it.next();
            if (C3357i.m24504a(next.getLocale(), forLanguageTag) && !next.isNetworkConnectionRequired()) {
                voice = next;
                break;
            }
        }
        if (voice == null) {
            return false;
        }
        Set<String> features = voice.getFeatures();
        C3357i.m24507d(features, "voiceToCheck.features");
        return !features.contains("notInstalled");
    }

    /* renamed from: H */
    private final boolean m24394H(TextToSpeech textToSpeech) {
        boolean z;
        IllegalArgumentException e;
        boolean z2;
        IllegalAccessException e2;
        boolean z3;
        Exception e3;
        if (textToSpeech == null) {
            return false;
        }
        Field[] declaredFields = textToSpeech.getClass().getDeclaredFields();
        C3357i.m24507d(declaredFields, "tts.javaClass.declaredFields");
        int length = declaredFields.length;
        boolean z4 = true;
        for (int i = 0; i < length; i++) {
            declaredFields[i].setAccessible(true);
            if (C3357i.m24504a("mServiceConnection", declaredFields[i].getName()) && C3357i.m24504a("android.speech.tts.TextToSpeech$Connection", declaredFields[i].getType().getName())) {
                try {
                    if (declaredFields[i].get(textToSpeech) == null) {
                        try {
                            C3768b.m25588b(this.f20805k, "*******TTS -> mServiceConnection == null*******");
                            z4 = false;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            z2 = false;
                            e.printStackTrace();
                            z4 = z;
                        } catch (IllegalAccessException e5) {
                            e2 = e5;
                            z3 = false;
                            e2.printStackTrace();
                            z4 = z;
                        } catch (Exception e6) {
                            e3 = e6;
                            z = false;
                            e3.printStackTrace();
                            z4 = z;
                        }
                    }
                } catch (IllegalArgumentException e7) {
                    IllegalArgumentException illegalArgumentException = e7;
                    z2 = z4;
                    e = illegalArgumentException;
                    e.printStackTrace();
                    z4 = z;
                } catch (IllegalAccessException e8) {
                    IllegalAccessException illegalAccessException = e8;
                    z3 = z4;
                    e2 = illegalAccessException;
                    e2.printStackTrace();
                    z4 = z;
                } catch (Exception e9) {
                    Exception exc = e9;
                    z = z4;
                    e3 = exc;
                    e3.printStackTrace();
                    z4 = z;
                }
            }
        }
        return z4;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e A[LOOP:0: B:13:0x0068->B:15:0x006e, LOOP_END] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24395I(p078k3.C3309h r4, int r5) {
        /*
            java.lang.String r0 = "getDefaultLocale: "
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.C3357i.m24508e(r4, r1)
            java.lang.String r1 = "tts.init"
            if (r5 != 0) goto L_0x0078
            android.speech.tts.TextToSpeech r5 = r4.f20804j
            kotlin.jvm.internal.C3357i.m24505b(r5)
            android.speech.tts.UtteranceProgressListener r2 = r4.f20817w
            r5.setOnUtteranceProgressListener(r2)
            android.speech.tts.TextToSpeech r5 = r4.f20804j     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            kotlin.jvm.internal.C3357i.m24505b(r5)     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            android.speech.tts.Voice r5 = r5.getDefaultVoice()     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            java.util.Locale r5 = r5.getLocale()     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            java.lang.String r2 = "tts!!.defaultVoice.locale"
            kotlin.jvm.internal.C3357i.m24507d(r5, r2)     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            boolean r2 = r4.m24392F(r5)     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            if (r2 == 0) goto L_0x005f
            android.speech.tts.TextToSpeech r2 = r4.f20804j     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            kotlin.jvm.internal.C3357i.m24505b(r2)     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            r2.setLanguage(r5)     // Catch:{ NullPointerException -> 0x0046, IllegalArgumentException -> 0x0036 }
            goto L_0x005f
        L_0x0036:
            r5 = move-exception
            java.lang.String r2 = r4.f20805k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r5 = r5.getMessage()
            goto L_0x0055
        L_0x0046:
            r5 = move-exception
            java.lang.String r2 = r4.f20805k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r5 = r5.getMessage()
        L_0x0055:
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            p099n3.C3768b.m25588b(r2, r5)
        L_0x005f:
            r5 = 1
            r4.f20807m = r5
            java.util.ArrayList<java.lang.Runnable> r5 = r4.f20808n
            java.util.Iterator r5 = r5.iterator()
        L_0x0068:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r5.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0068
        L_0x0078:
            java.lang.String r0 = r4.f20805k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to initialize TextToSpeech with status: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            p099n3.C3768b.m25588b(r0, r5)
        L_0x008e:
            boolean r5 = r4.f20807m
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.m24390D(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p078k3.C3309h.m24395I(k3.h, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m24396J(C3309h hVar, C0144j jVar, C0145k.C0150d dVar) {
        C3357i.m24508e(hVar, "this$0");
        C3357i.m24508e(jVar, "$call");
        C3357i.m24508e(dVar, "$result");
        hVar.onMethodCall(jVar, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m24397K(C3309h hVar, C0144j jVar, C0145k.C0150d dVar) {
        C3357i.m24508e(hVar, "this$0");
        C3357i.m24508e(jVar, "$call");
        C3357i.m24508e(dVar, "$result");
        hVar.onMethodCall(jVar, dVar);
    }

    /* renamed from: L */
    private final void m24398L(String str, C0145k.C0150d dVar) {
        this.f20804j = new TextToSpeech(this.f20803i, this.f20818x, str);
        this.f20807m = false;
        dVar.mo338a(1);
    }

    /* renamed from: M */
    private final void m24399M(String str, C0145k.C0150d dVar) {
        int i;
        C3357i.m24505b(str);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C3357i.m24507d(forLanguageTag, "forLanguageTag(language!!)");
        if (m24392F(forLanguageTag)) {
            TextToSpeech textToSpeech = this.f20804j;
            C3357i.m24505b(textToSpeech);
            textToSpeech.setLanguage(forLanguageTag);
            i = 1;
        } else {
            i = 0;
        }
        dVar.mo338a(Integer.valueOf(i));
    }

    /* renamed from: N */
    private final void m24400N(float f, C0145k.C0150d dVar) {
        int i;
        if (0.5f <= f && f <= 2.0f) {
            TextToSpeech textToSpeech = this.f20804j;
            C3357i.m24505b(textToSpeech);
            textToSpeech.setPitch(f);
            i = 1;
        } else {
            String str = this.f20805k;
            C3768b.m25587a(str, "Invalid pitch " + f + " value - Range is from 0.5 to 2.0");
            i = 0;
        }
        dVar.mo338a(i);
    }

    /* renamed from: O */
    private final void m24401O(float f) {
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        textToSpeech.setSpeechRate(f);
    }

    /* renamed from: P */
    private final void m24402P(HashMap<String, String> hashMap, C0145k.C0150d dVar) {
        int i;
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        Iterator<Voice> it = textToSpeech.getVoices().iterator();
        while (true) {
            if (!it.hasNext()) {
                String str = this.f20805k;
                C3768b.m25587a(str, "Voice name not found: " + hashMap);
                i = 0;
                break;
            }
            Voice next = it.next();
            if (C3357i.m24504a(next.getName(), hashMap.get("name")) && C3357i.m24504a(next.getLocale().toLanguageTag(), hashMap.get("locale"))) {
                TextToSpeech textToSpeech2 = this.f20804j;
                C3357i.m24505b(textToSpeech2);
                textToSpeech2.setVoice(next);
                i = 1;
                break;
            }
        }
        dVar.mo338a(Integer.valueOf(i));
    }

    /* renamed from: Q */
    private final void m24403Q(float f, C0145k.C0150d dVar) {
        int i;
        if (0.0f <= f && f <= 1.0f) {
            Bundle bundle = this.f20810p;
            C3357i.m24505b(bundle);
            bundle.putFloat("volume", f);
            i = 1;
        } else {
            String str = this.f20805k;
            C3768b.m25587a(str, "Invalid volume " + f + " value - Range is from 0.0 to 1.0");
            i = 0;
        }
        dVar.mo338a(i);
    }

    /* renamed from: R */
    private final boolean m24404R(String str) {
        String uuid = UUID.randomUUID().toString();
        C3357i.m24507d(uuid, "randomUUID().toString()");
        this.f20809o.put(uuid, str);
        if (!m24394H(this.f20804j)) {
            this.f20807m = false;
            this.f20804j = new TextToSpeech(this.f20803i, this.f20818x, this.f20806l);
        } else if (this.f20811q > 0) {
            TextToSpeech textToSpeech = this.f20804j;
            C3357i.m24505b(textToSpeech);
            textToSpeech.playSilentUtterance((long) this.f20811q, 0, "SIL_" + uuid);
            TextToSpeech textToSpeech2 = this.f20804j;
            C3357i.m24505b(textToSpeech2);
            if (textToSpeech2.speak(str, 1, this.f20810p, uuid) == 0) {
                return true;
            }
        } else {
            TextToSpeech textToSpeech3 = this.f20804j;
            C3357i.m24505b(textToSpeech3);
            if (textToSpeech3.speak(str, this.f20816v, this.f20810p, uuid) == 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static final void m24405T(C3309h hVar, int i) {
        C3357i.m24508e(hVar, "this$0");
        C0145k.C0150d dVar = hVar.f20797c;
        if (dVar != null) {
            dVar.mo338a(Integer.valueOf(i));
        }
    }

    /* renamed from: U */
    private final void m24406U() {
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        textToSpeech.stop();
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static final void m24407W(C3309h hVar, int i) {
        C3357i.m24508e(hVar, "this$0");
        C0145k.C0150d dVar = hVar.f20798d;
        if (dVar != null) {
            dVar.mo338a(Integer.valueOf(i));
        }
    }

    /* renamed from: X */
    private final void m24408X(String str, String str2) {
        StringBuilder sb;
        String str3;
        String str4;
        Context context = this.f20803i;
        C3357i.m24505b(context);
        File file = new File(context.getExternalFilesDir((String) null), str2);
        String uuid = UUID.randomUUID().toString();
        C3357i.m24507d(uuid, "randomUUID().toString()");
        Bundle bundle = this.f20810p;
        C3357i.m24505b(bundle);
        bundle.putString("utteranceId", "STF_" + uuid);
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        Bundle bundle2 = this.f20810p;
        if (textToSpeech.synthesizeToFile(str, bundle2, file, "STF_" + uuid) == 0) {
            str3 = this.f20805k;
            sb = new StringBuilder();
            str4 = "Successfully created file : ";
        } else {
            str3 = this.f20805k;
            sb = new StringBuilder();
            str4 = "Failed creating file : ";
        }
        sb.append(str4);
        sb.append(file.getPath());
        C3768b.m25587a(str3, sb.toString());
    }

    /* renamed from: t */
    private final Map<String, Boolean> m24428t(List<String> list) {
        HashMap hashMap = new HashMap();
        for (String next : list) {
            hashMap.put(next, Boolean.valueOf(m24393G(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[LOOP:0: B:13:0x0066->B:15:0x006c, LOOP_END] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m24429u(p078k3.C3309h r3, int r4) {
        /*
            java.lang.String r0 = "getDefaultLocale: "
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.C3357i.m24508e(r3, r1)
            if (r4 != 0) goto L_0x0076
            android.speech.tts.TextToSpeech r4 = r3.f20804j
            kotlin.jvm.internal.C3357i.m24505b(r4)
            android.speech.tts.UtteranceProgressListener r1 = r3.f20817w
            r4.setOnUtteranceProgressListener(r1)
            android.speech.tts.TextToSpeech r4 = r3.f20804j     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            kotlin.jvm.internal.C3357i.m24505b(r4)     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            android.speech.tts.Voice r4 = r4.getDefaultVoice()     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            java.util.Locale r4 = r4.getLocale()     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            java.lang.String r1 = "tts!!.defaultVoice.locale"
            kotlin.jvm.internal.C3357i.m24507d(r4, r1)     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            boolean r1 = r3.m24392F(r4)     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            if (r1 == 0) goto L_0x005d
            android.speech.tts.TextToSpeech r1 = r3.f20804j     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            kotlin.jvm.internal.C3357i.m24505b(r1)     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            r1.setLanguage(r4)     // Catch:{ NullPointerException -> 0x0044, IllegalArgumentException -> 0x0034 }
            goto L_0x005d
        L_0x0034:
            r4 = move-exception
            java.lang.String r1 = r3.f20805k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r4 = r4.getMessage()
            goto L_0x0053
        L_0x0044:
            r4 = move-exception
            java.lang.String r1 = r3.f20805k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r4 = r4.getMessage()
        L_0x0053:
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            p099n3.C3768b.m25588b(r1, r4)
        L_0x005d:
            r4 = 1
            r3.f20807m = r4
            java.util.ArrayList<java.lang.Runnable> r3 = r3.f20808n
            java.util.Iterator r3 = r3.iterator()
        L_0x0066:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r3.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L_0x0066
        L_0x0076:
            java.lang.String r3 = r3.f20805k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to initialize TextToSpeech with status: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            p099n3.C3768b.m25588b(r3, r4)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p078k3.C3309h.m24429u(k3.h, int):void");
    }

    /* renamed from: v */
    private final void m24430v(C0145k.C0150d dVar) {
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        String defaultEngine = textToSpeech.getDefaultEngine();
        C3357i.m24507d(defaultEngine, "tts!!.defaultEngine");
        dVar.mo338a(defaultEngine);
    }

    /* renamed from: w */
    private final void m24431w(C0145k.C0150d dVar) {
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        Voice defaultVoice = textToSpeech.getDefaultVoice();
        HashMap hashMap = new HashMap();
        if (defaultVoice != null) {
            String name = defaultVoice.getName();
            C3357i.m24507d(name, "defaultVoice.name");
            hashMap.put("name", name);
            String languageTag = defaultVoice.getLocale().toLanguageTag();
            C3357i.m24507d(languageTag, "defaultVoice.locale.toLanguageTag()");
            hashMap.put("locale", languageTag);
        }
        dVar.mo338a(hashMap);
    }

    /* renamed from: x */
    private final void m24432x(C0145k.C0150d dVar) {
        ArrayList arrayList = new ArrayList();
        try {
            TextToSpeech textToSpeech = this.f20804j;
            C3357i.m24505b(textToSpeech);
            for (TextToSpeech.EngineInfo engineInfo : textToSpeech.getEngines()) {
                arrayList.add(engineInfo.name);
            }
        } catch (Exception e) {
            String str = this.f20805k;
            C3768b.m25587a(str, "getEngines: " + e.getMessage());
        }
        dVar.mo338a(arrayList);
    }

    /* renamed from: y */
    private final void m24433y(C0145k.C0150d dVar) {
        StringBuilder sb;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                TextToSpeech textToSpeech = this.f20804j;
                C3357i.m24505b(textToSpeech);
                for (Locale languageTag : textToSpeech.getAvailableLanguages()) {
                    arrayList.add(languageTag.toLanguageTag());
                }
            } else {
                Locale[] availableLocales = Locale.getAvailableLocales();
                C3357i.m24507d(availableLocales, "getAvailableLocales()");
                for (Locale locale : availableLocales) {
                    String variant = locale.getVariant();
                    C3357i.m24507d(variant, "locale.variant");
                    if ((variant.length() == 0) && m24392F(locale)) {
                        arrayList.add(locale.toLanguageTag());
                    }
                }
            }
        } catch (MissingResourceException e) {
            str = this.f20805k;
            sb = new StringBuilder();
            sb.append("getLanguages: ");
            str2 = e.getMessage();
            sb.append(str2);
            C3768b.m25587a(str, sb.toString());
            dVar.mo338a(arrayList);
        } catch (NullPointerException e2) {
            str = this.f20805k;
            sb = new StringBuilder();
            sb.append("getLanguages: ");
            str2 = e2.getMessage();
            sb.append(str2);
            C3768b.m25587a(str, sb.toString());
            dVar.mo338a(arrayList);
        }
        dVar.mo338a(arrayList);
    }

    /* renamed from: z */
    private final int m24434z() {
        return TextToSpeech.getMaxSpeechInputLength();
    }

    /* renamed from: S */
    public final void mo14312S(int i) {
        this.f20800f = false;
        Handler handler = this.f20795a;
        C3357i.m24505b(handler);
        handler.post(new C3304c(this, i));
    }

    /* renamed from: V */
    public final void mo14313V(int i) {
        this.f20802h = false;
        Handler handler = this.f20795a;
        C3357i.m24505b(handler);
        handler.post(new C3305d(this, i));
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        C0128c b = bVar.mo15540b();
        C3357i.m24507d(b, "binding.binaryMessenger");
        Context a = bVar.mo15539a();
        C3357i.m24507d(a, "binding.applicationContext");
        m24389C(b, a);
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        m24406U();
        TextToSpeech textToSpeech = this.f20804j;
        C3357i.m24505b(textToSpeech);
        textToSpeech.shutdown();
        this.f20803i = null;
        C0145k kVar = this.f20796b;
        C3357i.m24505b(kVar);
        kVar.mo337e((C0145k.C0149c) null);
        this.f20796b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a2, code lost:
        if (r0.equals("setSharedInstance") == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d1, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d5, code lost:
        r7.mo338a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0178, code lost:
        r6 = java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0245, code lost:
        kotlin.jvm.internal.C3357i.m24505b(r6);
        r6.mo338a(0);
        r5.f20797c = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p005a4.C0144j r6, p005a4.C0145k.C0150d r7) {
        /*
            r5 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C3357i.m24508e(r6, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C3357i.m24508e(r7, r0)
            boolean r0 = r5.f20807m
            if (r0 != 0) goto L_0x0019
            k3.e r0 = new k3.e
            r0.<init>(r5, r6, r7)
            java.util.ArrayList<java.lang.Runnable> r6 = r5.f20808n
            r6.add(r0)
            return
        L_0x0019:
            java.lang.String r0 = r6.f269a
            if (r0 == 0) goto L_0x02d9
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 0
            r4 = 1
            switch(r1) {
                case -1360770792: goto L_0x02bc;
                case -1228785901: goto L_0x02a5;
                case -1153981156: goto L_0x029c;
                case -707999742: goto L_0x0286;
                case -566982085: goto L_0x0279;
                case -550697939: goto L_0x026b;
                case -200275950: goto L_0x0253;
                case 3540994: goto L_0x0227;
                case 106440182: goto L_0x01f8;
                case 109641682: goto L_0x0193;
                case 182735172: goto L_0x017e;
                case 277104199: goto L_0x015b;
                case 375730650: goto L_0x0146;
                case 670514716: goto L_0x012d;
                case 771325407: goto L_0x0115;
                case 885024887: goto L_0x0106;
                case 967798247: goto L_0x00f7;
                case 971982233: goto L_0x00e8;
                case 1040052984: goto L_0x00d2;
                case 1087344356: goto L_0x00b6;
                case 1326839649: goto L_0x007d;
                case 1401390078: goto L_0x0064;
                case 1407099376: goto L_0x004c;
                case 1508723045: goto L_0x003d;
                case 1742137472: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x02d9
        L_0x0029:
            java.lang.String r6 = "getMaxSpeechInputLength"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0033
            goto L_0x02d9
        L_0x0033:
            int r6 = r5.m24434z()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x02d5
        L_0x003d:
            java.lang.String r6 = "getLanguages"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0047
            goto L_0x02d9
        L_0x0047:
            r5.m24433y(r7)
            goto L_0x02dc
        L_0x004c:
            java.lang.String r1 = "setVoice"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0056
            goto L_0x02d9
        L_0x0056:
            java.lang.Object r6 = r6.mo333b()
            java.util.HashMap r6 = (java.util.HashMap) r6
            kotlin.jvm.internal.C3357i.m24505b(r6)
            r5.m24402P(r6, r7)
            goto L_0x02dc
        L_0x0064:
            java.lang.String r1 = "setPitch"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006e
            goto L_0x02d9
        L_0x006e:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            float r6 = java.lang.Float.parseFloat(r6)
            r5.m24400N(r6, r7)
            goto L_0x02dc
        L_0x007d:
            java.lang.String r1 = "synthesizeToFile"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
            goto L_0x02d9
        L_0x0087:
            java.lang.String r0 = "text"
            java.lang.Object r0 = r6.mo332a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r5.f20802h
            if (r1 == 0) goto L_0x009b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7.mo338a(r6)
            return
        L_0x009b:
            java.lang.String r1 = "fileName"
            java.lang.Object r6 = r6.mo332a(r1)
            java.lang.String r6 = (java.lang.String) r6
            kotlin.jvm.internal.C3357i.m24505b(r0)
            kotlin.jvm.internal.C3357i.m24505b(r6)
            r5.m24408X(r0, r6)
            boolean r6 = r5.f20801g
            if (r6 == 0) goto L_0x02d1
            r5.f20802h = r4
            r5.f20798d = r7
            goto L_0x02dc
        L_0x00b6:
            java.lang.String r1 = "setSpeechRate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c0
            goto L_0x02d9
        L_0x00c0:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            float r6 = java.lang.Float.parseFloat(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r0
            r5.m24401O(r6)
            goto L_0x02d1
        L_0x00d2:
            java.lang.String r1 = "isLanguageInstalled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00dc
            goto L_0x02d9
        L_0x00dc:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            boolean r6 = r5.m24393G(r6)
            goto L_0x0178
        L_0x00e8:
            java.lang.String r6 = "getSpeechRateValidRange"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00f2
            goto L_0x02d9
        L_0x00f2:
            r5.m24387A(r7)
            goto L_0x02dc
        L_0x00f7:
            java.lang.String r6 = "getDefaultVoice"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0101
            goto L_0x02d9
        L_0x0101:
            r5.m24431w(r7)
            goto L_0x02dc
        L_0x0106:
            java.lang.String r6 = "getVoices"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0110
            goto L_0x02d9
        L_0x0110:
            r5.m24388B(r7)
            goto L_0x02dc
        L_0x0115:
            java.lang.String r1 = "setSilence"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011f
            goto L_0x02d9
        L_0x011f:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            int r6 = java.lang.Integer.parseInt(r6)
            r5.f20811q = r6
            goto L_0x02dc
        L_0x012d:
            java.lang.String r1 = "setVolume"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0137
            goto L_0x02d9
        L_0x0137:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            float r6 = java.lang.Float.parseFloat(r6)
            r5.m24403Q(r6, r7)
            goto L_0x02dc
        L_0x0146:
            java.lang.String r1 = "setLanguage"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0150
            goto L_0x02d9
        L_0x0150:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            r5.m24399M(r6, r7)
            goto L_0x02dc
        L_0x015b:
            java.lang.String r1 = "isLanguageAvailable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0165
            goto L_0x02d9
        L_0x0165:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r6)
            java.lang.String r0 = "forLanguageTag(language)"
            kotlin.jvm.internal.C3357i.m24507d(r6, r0)
            boolean r6 = r5.m24392F(r6)
        L_0x0178:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x02d5
        L_0x017e:
            java.lang.String r1 = "setEngine"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0188
            goto L_0x02d9
        L_0x0188:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            r5.m24398L(r6, r7)
            goto L_0x02dc
        L_0x0193:
            java.lang.String r1 = "speak"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019d
            goto L_0x02d9
        L_0x019d:
            java.lang.Object r0 = r6.f270b
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r5.f20814t
            if (r1 != 0) goto L_0x01ae
            r5.f20814t = r0
            kotlin.jvm.internal.C3357i.m24505b(r0)
            r5.f20813s = r0
        L_0x01ae:
            boolean r1 = r5.f20815u
            if (r1 == 0) goto L_0x01c9
            java.lang.String r1 = r5.f20813s
            boolean r1 = kotlin.jvm.internal.C3357i.m24504a(r1, r0)
            if (r1 == 0) goto L_0x01c0
            java.lang.String r0 = r5.f20814t
            kotlin.jvm.internal.C3357i.m24505b(r0)
            goto L_0x01c9
        L_0x01c0:
            r5.f20814t = r0
            kotlin.jvm.internal.C3357i.m24505b(r0)
            r5.f20813s = r0
            r5.f20812r = r3
        L_0x01c9:
            boolean r1 = r5.f20800f
            if (r1 == 0) goto L_0x01d9
            int r1 = r5.f20816v
            if (r1 != 0) goto L_0x01d9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7.mo338a(r6)
            return
        L_0x01d9:
            boolean r0 = r5.m24404R(r0)
            if (r0 != 0) goto L_0x01ea
            k3.f r0 = new k3.f
            r0.<init>(r5, r6, r7)
            java.util.ArrayList<java.lang.Runnable> r6 = r5.f20808n
            r6.add(r0)
            return
        L_0x01ea:
            boolean r6 = r5.f20799e
            if (r6 == 0) goto L_0x02d1
            int r6 = r5.f20816v
            if (r6 != 0) goto L_0x02d1
            r5.f20800f = r4
            r5.f20797c = r7
            goto L_0x02dc
        L_0x01f8:
            java.lang.String r6 = "pause"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0202
            goto L_0x02d9
        L_0x0202:
            r5.f20815u = r4
            java.lang.String r6 = r5.f20814t
            if (r6 == 0) goto L_0x0218
            kotlin.jvm.internal.C3357i.m24505b(r6)
            int r0 = r5.f20812r
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C3357i.m24507d(r6, r0)
            r5.f20814t = r6
        L_0x0218:
            r5.m24406U()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r7.mo338a(r6)
            a4.k$d r6 = r5.f20797c
            if (r6 == 0) goto L_0x02dc
            goto L_0x0245
        L_0x0227:
            java.lang.String r6 = "stop"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0231
            goto L_0x02d9
        L_0x0231:
            r5.f20815u = r3
            r5.f20814t = r2
            r5.m24406U()
            r5.f20812r = r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r7.mo338a(r6)
            a4.k$d r6 = r5.f20797c
            if (r6 == 0) goto L_0x02dc
        L_0x0245:
            kotlin.jvm.internal.C3357i.m24505b(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.mo338a(r7)
            r5.f20797c = r2
            goto L_0x02dc
        L_0x0253:
            java.lang.String r1 = "setQueueMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025d
            goto L_0x02d9
        L_0x025d:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            int r6 = java.lang.Integer.parseInt(r6)
            r5.f20816v = r6
            goto L_0x02d1
        L_0x026b:
            java.lang.String r6 = "getDefaultEngine"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0275
            goto L_0x02d9
        L_0x0275:
            r5.m24430v(r7)
            goto L_0x02dc
        L_0x0279:
            java.lang.String r6 = "getEngines"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0282
            goto L_0x02d9
        L_0x0282:
            r5.m24432x(r7)
            goto L_0x02dc
        L_0x0286:
            java.lang.String r1 = "awaitSynthCompletion"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x028f
            goto L_0x02d9
        L_0x028f:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            r5.f20801g = r6
            goto L_0x02d1
        L_0x029c:
            java.lang.String r6 = "setSharedInstance"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x02d1
            goto L_0x02d9
        L_0x02a5:
            java.lang.String r1 = "areLanguagesInstalled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ae
            goto L_0x02d9
        L_0x02ae:
            java.lang.Object r6 = r6.mo333b()
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.internal.C3357i.m24505b(r6)
            java.util.Map r6 = r5.m24428t(r6)
            goto L_0x02d5
        L_0x02bc:
            java.lang.String r1 = "awaitSpeakCompletion"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c5
            goto L_0x02d9
        L_0x02c5:
            java.lang.Object r6 = r6.f270b
            java.lang.String r6 = r6.toString()
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            r5.f20799e = r6
        L_0x02d1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
        L_0x02d5:
            r7.mo338a(r6)
            goto L_0x02dc
        L_0x02d9:
            r7.mo340c()
        L_0x02dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p078k3.C3309h.onMethodCall(a4.j, a4.k$d):void");
    }
}
