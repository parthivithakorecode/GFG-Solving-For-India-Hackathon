package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p039f0.C2592a;
import p039f0.C2594c;
import p039f0.C2595d;
import p053h0.C2666b;
import p053h0.C2667c;

/* renamed from: androidx.room.j */
class C1181j implements C2667c {

    /* renamed from: f */
    private final Context f3164f;

    /* renamed from: g */
    private final String f3165g;

    /* renamed from: h */
    private final File f3166h;

    /* renamed from: i */
    private final int f3167i;

    /* renamed from: j */
    private final C2667c f3168j;

    /* renamed from: k */
    private C1151a f3169k;

    /* renamed from: l */
    private boolean f3170l;

    C1181j(Context context, String str, File file, int i, C2667c cVar) {
        this.f3164f = context;
        this.f3165g = str;
        this.f3166h = file;
        this.f3167i = i;
        this.f3168j = cVar;
    }

    /* renamed from: d */
    private void m4769d(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f3165g != null) {
            readableByteChannel = Channels.newChannel(this.f3164f.getAssets().open(this.f3165g));
        } else if (this.f3166h != null) {
            readableByteChannel = new FileInputStream(this.f3166h).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f3164f.getCacheDir());
        createTempFile.deleteOnExit();
        C2595d.m21279a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    /* renamed from: m */
    private void m4770m() {
        String databaseName = getDatabaseName();
        File databasePath = this.f3164f.getDatabasePath(databaseName);
        C1151a aVar = this.f3169k;
        C2592a aVar2 = new C2592a(databaseName, this.f3164f.getFilesDir(), aVar == null || aVar.f3069j);
        try {
            aVar2.mo12474b();
            if (!databasePath.exists()) {
                m4769d(databasePath);
                aVar2.mo12475c();
            } else if (this.f3169k == null) {
                aVar2.mo12475c();
            } else {
                try {
                    int c = C2594c.m21278c(databasePath);
                    int i = this.f3167i;
                    if (c == i) {
                        aVar2.mo12475c();
                    } else if (this.f3169k.mo3917a(c, i)) {
                        aVar2.mo12475c();
                    } else {
                        if (this.f3164f.deleteDatabase(databaseName)) {
                            try {
                                m4769d(databasePath);
                            } catch (IOException e) {
                                Log.w("ROOM", "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.mo12475c();
                    }
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar2.mo12475c();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (Throwable th) {
            aVar2.mo12475c();
            throw th;
        }
    }

    /* renamed from: J */
    public synchronized C2666b mo3991J() {
        if (!this.f3170l) {
            m4770m();
            this.f3170l = true;
        }
        return this.f3168j.mo3991J();
    }

    public synchronized void close() {
        this.f3168j.close();
        this.f3170l = false;
    }

    public String getDatabaseName() {
        return this.f3168j.getDatabaseName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3994h(C1151a aVar) {
        this.f3169k = aVar;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f3168j.setWriteAheadLoggingEnabled(z);
    }
}
