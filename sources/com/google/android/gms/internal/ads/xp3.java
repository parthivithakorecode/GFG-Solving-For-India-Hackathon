package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aq3;
import com.google.android.gms.internal.ads.xp3;
import java.io.IOException;

public class xp3<MessageType extends aq3<MessageType, BuilderType>, BuilderType extends xp3<MessageType, BuilderType>> extends ao3<MessageType, BuilderType> {

    /* renamed from: f */
    private final MessageType f17301f;

    /* renamed from: g */
    protected MessageType f17302g;

    /* renamed from: h */
    protected boolean f17303h = false;

    protected xp3(MessageType messagetype) {
        this.f17301f = messagetype;
        this.f17302g = (aq3) messagetype.mo5181E(4, (Object) null, (Object) null);
    }

    /* renamed from: j */
    private static final void m19612j(MessageType messagetype, MessageType messagetype2) {
        tr3.m17481a().mo11101b(messagetype.getClass()).mo7066f(messagetype, messagetype2);
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5389a() {
        return this.f17301f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ ao3 mo5348h(bo3 bo3) {
        mo11892m((aq3) bo3);
        return this;
    }

    /* renamed from: l */
    public final BuilderType clone() {
        BuilderType buildertype = (xp3) this.f17301f.mo5181E(5, (Object) null, (Object) null);
        buildertype.mo11892m(mo8525i());
        return buildertype;
    }

    /* renamed from: m */
    public final BuilderType mo11892m(MessageType messagetype) {
        if (this.f17303h) {
            mo11896q();
            this.f17303h = false;
        }
        m19612j(this.f17302g, messagetype);
        return this;
    }

    /* renamed from: n */
    public final BuilderType mo11893n(byte[] bArr, int i, int i2, mp3 mp3) {
        if (this.f17303h) {
            mo11896q();
            this.f17303h = false;
        }
        try {
            tr3.m17481a().mo11101b(this.f17302g.getClass()).mo7068h(this.f17302g, bArr, 0, i2, new eo3(mp3));
            return this;
        } catch (mq3 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw mq3.m13459j();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: o */
    public final MessageType mo11894o() {
        MessageType p = mo8525i();
        if (p.mo5399w()) {
            return p;
        }
        throw new vs3(p);
    }

    /* renamed from: p */
    public MessageType mo8525i() {
        if (this.f17303h) {
            return this.f17302g;
        }
        MessageType messagetype = this.f17302g;
        tr3.m17481a().mo11101b(messagetype.getClass()).mo7064d(messagetype);
        this.f17303h = true;
        return this.f17302g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo11896q() {
        MessageType messagetype = (aq3) this.f17302g.mo5181E(4, (Object) null, (Object) null);
        m19612j(messagetype, this.f17302g);
        this.f17302g = messagetype;
    }
}
