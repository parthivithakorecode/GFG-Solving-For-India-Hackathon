package p066io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import p066io.flutter.embedding.engine.FlutterJNI;
import p066io.flutter.plugin.editing.C2981c;
import p099n3.C3768b;
import p174z3.C4591p;

/* renamed from: io.flutter.plugin.editing.b */
public class C2979b extends BaseInputConnection implements C2981c.C2983b {

    /* renamed from: a */
    private final View f19876a;

    /* renamed from: b */
    private final int f19877b;

    /* renamed from: c */
    private final C4591p f19878c;

    /* renamed from: d */
    private final C2981c f19879d;

    /* renamed from: e */
    private final EditorInfo f19880e;

    /* renamed from: f */
    private ExtractedTextRequest f19881f;

    /* renamed from: g */
    private boolean f19882g;

    /* renamed from: h */
    private CursorAnchorInfo.Builder f19883h;

    /* renamed from: i */
    private ExtractedText f19884i;

    /* renamed from: j */
    private InputMethodManager f19885j;

    /* renamed from: k */
    private final Layout f19886k;

    /* renamed from: l */
    private C2978a f19887l;

    /* renamed from: m */
    private final C2980a f19888m;

    /* renamed from: n */
    private int f19889n;

    /* renamed from: io.flutter.plugin.editing.b$a */
    public interface C2980a {
        /* renamed from: a */
        boolean mo13395a(KeyEvent keyEvent);
    }

    public C2979b(View view, int i, C4591p pVar, C2980a aVar, C2981c cVar, EditorInfo editorInfo) {
        this(view, i, pVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public C2979b(View view, int i, C4591p pVar, C2980a aVar, C2981c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f19882g = false;
        this.f19884i = new ExtractedText();
        this.f19889n = 0;
        this.f19876a = view;
        this.f19877b = i;
        this.f19878c = pVar;
        this.f19879d = cVar;
        cVar.mo13579a(this);
        this.f19880e = editorInfo;
        this.f19888m = aVar;
        this.f19887l = new C2978a(flutterJNI);
        this.f19886k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f19885j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    /* renamed from: b */
    private boolean m23106b(int i) {
        if (i == 16908319) {
            setSelection(0, this.f19879d.length());
            return true;
        } else if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f19879d);
            int selectionEnd = Selection.getSelectionEnd(this.f19879d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f19876a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f19879d.subSequence(min, max)));
                this.f19879d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f19879d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f19879d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f19876a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f19879d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f19876a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f19876a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f19879d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f19879d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f19879d.delete(min2, max4);
                }
                this.f19879d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    /* renamed from: c */
    private CursorAnchorInfo m23107c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f19883h;
        if (builder == null) {
            this.f19883h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f19883h.setSelectionRange(this.f19879d.mo13587i(), this.f19879d.mo13586h());
        int g = this.f19879d.mo13585g();
        int f = this.f19879d.mo13584f();
        if (g < 0 || f <= g) {
            this.f19883h.setComposingText(-1, "");
        } else {
            this.f19883h.setComposingText(g, this.f19879d.toString().subSequence(g, f));
        }
        return this.f19883h.build();
    }

    /* renamed from: d */
    private ExtractedText m23108d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f19884i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f19879d.mo13587i();
        this.f19884i.selectionEnd = this.f19879d.mo13586h();
        this.f19884i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f19879d.toString() : this.f19879d;
        return this.f19884i;
    }

    /* renamed from: e */
    private boolean m23109e(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.f19879d);
        int selectionEnd = Selection.getSelectionEnd(this.f19879d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z ? Math.max(this.f19887l.mo13550b(this.f19879d, selectionEnd), 0) : Math.min(this.f19887l.mo13549a(this.f19879d, selectionEnd), this.f19879d.length());
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        if (z3) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    /* renamed from: g */
    private boolean m23110g(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.f19879d);
        int selectionEnd = Selection.getSelectionEnd(this.f19879d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        if (z3) {
            if (z) {
                Selection.moveUp(this.f19879d, this.f19886k);
            } else {
                Selection.moveDown(this.f19879d, this.f19886k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f19879d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(this.f19879d, this.f19886k);
            } else {
                Selection.extendDown(this.f19879d, this.f19886k);
            }
            setSelection(Selection.getSelectionStart(this.f19879d), Selection.getSelectionEnd(this.f19879d));
        }
        endBatchEdit();
        return true;
    }

    /* renamed from: h */
    private byte[] m23111h(InputStream inputStream, int i) {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            try {
                i2 = inputStream.read(bArr);
            } catch (IOException unused) {
                i2 = -1;
            }
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    /* renamed from: a */
    public void mo13558a(boolean z, boolean z2, boolean z3) {
        this.f19885j.updateSelection(this.f19876a, this.f19879d.mo13587i(), this.f19879d.mo13586h(), this.f19879d.mo13585g(), this.f19879d.mo13584f());
        if (Build.VERSION.SDK_INT >= 21) {
            ExtractedTextRequest extractedTextRequest = this.f19881f;
            if (extractedTextRequest != null) {
                this.f19885j.updateExtractedText(this.f19876a, extractedTextRequest.token, m23108d(extractedTextRequest));
            }
            if (this.f19882g) {
                this.f19885j.updateCursorAnchorInfo(this.f19876a, m23107c());
            }
        }
    }

    public boolean beginBatchEdit() {
        this.f19879d.mo13580b();
        this.f19889n++;
        return super.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int i) {
        return super.clearMetaKeyStates(i);
    }

    public void closeConnection() {
        super.closeConnection();
        this.f19879d.mo13588l(this);
        while (this.f19889n > 0) {
            endBatchEdit();
            this.f19889n--;
        }
    }

    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f19876a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h = m23111h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h);
                                hashMap.put("uri", contentUri.toString());
                                this.f19878c.mo16252b(this.f19877b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f19879d.mo13587i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f19889n--;
        this.f19879d.mo13582d();
        return endBatchEdit;
    }

    /* renamed from: f */
    public boolean mo13567f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return m23109e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return m23109e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return m23110g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return m23110g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f19880e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f19879d);
            int selectionEnd = Selection.getSelectionEnd(this.f19879d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart < 0 || selectionEnd < 0 || unicodeChar == 0) {
                return false;
            }
            int min = Math.min(selectionStart, selectionEnd);
            int max = Math.max(selectionStart, selectionEnd);
            beginBatchEdit();
            if (min != max) {
                this.f19879d.delete(min, max);
            }
            this.f19879d.insert(min, String.valueOf((char) unicodeChar));
            int i = min + 1;
            setSelection(i, i);
            endBatchEdit();
            return true;
        } else if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
            return false;
        } else {
            int selectionEnd2 = Selection.getSelectionEnd(this.f19879d);
            setSelection(selectionEnd2, selectionEnd2);
            return true;
        }
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public Editable getEditable() {
        return this.f19879d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        boolean z2 = (i & 1) != 0;
        if (this.f19881f != null) {
            z = false;
        }
        if (z2 == z) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z2 ? "on" : "off");
            C3768b.m25587a("InputConnectionAdaptor", sb.toString());
        }
        this.f19881f = z2 ? extractedTextRequest : null;
        return m23108d(extractedTextRequest);
    }

    public boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean b = m23106b(i);
        endBatchEdit();
        return b;
    }

    public boolean performEditorAction(int i) {
        if (i == 0) {
            this.f19878c.mo16263o(this.f19877b);
        } else if (i == 1) {
            this.f19878c.mo16255g(this.f19877b);
        } else if (i == 2) {
            this.f19878c.mo16254f(this.f19877b);
        } else if (i == 3) {
            this.f19878c.mo16260l(this.f19877b);
        } else if (i == 4) {
            this.f19878c.mo16261m(this.f19877b);
        } else if (i == 5) {
            this.f19878c.mo16256h(this.f19877b);
        } else if (i != 7) {
            this.f19878c.mo16253e(this.f19877b);
        } else {
            this.f19878c.mo16258j(this.f19877b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f19878c.mo16257i(this.f19877b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i & 1) != 0) {
            this.f19885j.updateCursorAnchorInfo(this.f19876a, m23107c());
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if (z != this.f19882g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z ? "on" : "off");
            C3768b.m25587a("InputConnectionAdaptor", sb.toString());
        }
        this.f19882g = z;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f19888m.mo13395a(keyEvent);
    }

    public boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return commitText;
    }

    public boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }
}
