package p066io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import p005a4.C0145k;
import p015b4.C1312a;
import p174z3.C4587n;

/* renamed from: io.flutter.plugin.editing.d */
public class C2984d implements C4587n.C4589b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a */
    private final C4587n f19904a;

    /* renamed from: b */
    private final TextServicesManager f19905b;

    /* renamed from: c */
    private SpellCheckerSession f19906c;

    /* renamed from: d */
    C0145k.C0150d f19907d;

    public C2984d(TextServicesManager textServicesManager, C4587n nVar) {
        this.f19905b = textServicesManager;
        this.f19904a = nVar;
        nVar.mo16250b(this);
    }

    /* renamed from: a */
    public void mo13595a(String str, String str2, C0145k.C0150d dVar) {
        if (this.f19907d != null) {
            dVar.mo339b("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f19907d = dVar;
        mo13597c(str, str2);
    }

    /* renamed from: b */
    public void mo13596b() {
        this.f19904a.mo16250b((C4587n.C4589b) null);
        SpellCheckerSession spellCheckerSession = this.f19906c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    /* renamed from: c */
    public void mo13597c(String str, String str2) {
        Locale b = C1312a.m5251b(str);
        if (this.f19906c == null) {
            this.f19906c = this.f19905b.newSpellCheckerSession((Bundle) null, b, this, true);
        }
        this.f19906c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        C0145k.C0150d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f19907d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    HashMap hashMap = new HashMap();
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                    int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                    hashMap.put("startIndex", Integer.valueOf(offsetAt));
                    hashMap.put("endIndex", Integer.valueOf(lengthAt));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < suggestionsCount; i2++) {
                        arrayList2.add(suggestionsInfoAt.getSuggestionAt(i2));
                    }
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
            dVar = this.f19907d;
        }
        dVar.mo338a(arrayList);
        this.f19907d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
