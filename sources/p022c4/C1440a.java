package p022c4;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import java.util.HashMap;
import p174z3.C4553g;

@TargetApi(24)
/* renamed from: c4.a */
public class C1440a {

    /* renamed from: c */
    private static HashMap<String, Integer> f3656c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1443c f3657a;

    /* renamed from: b */
    private final C4553g f3658b;

    /* renamed from: c4.a$a */
    class C1441a implements C4553g.C4555b {
        C1441a() {
        }

        /* renamed from: a */
        public void mo4854a(String str) {
            C1440a.this.f3657a.setPointerIcon(C1440a.this.m5633d(str));
        }
    }

    /* renamed from: c4.a$b */
    class C1442b extends HashMap<String, Integer> {
        C1442b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: c4.a$c */
    public interface C1443c {
        /* renamed from: b */
        PointerIcon mo4855b(int i);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C1440a(C1443c cVar, C4553g gVar) {
        this.f3657a = cVar;
        this.f3658b = gVar;
        gVar.mo16231b(new C1441a());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public PointerIcon m5633d(String str) {
        if (f3656c == null) {
            f3656c = new C1442b();
        }
        return this.f3657a.mo4855b(f3656c.getOrDefault(str, 1000).intValue());
    }

    /* renamed from: c */
    public void mo4853c() {
        this.f3658b.mo16231b((C4553g.C4555b) null);
    }
}
