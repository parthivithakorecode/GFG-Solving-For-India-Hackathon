package p066io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

/* renamed from: io.flutter.embedding.engine.d */
public final /* synthetic */ class C2972d implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ long f19861a;

    public /* synthetic */ C2972d(long j) {
        this.f19861a = j;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f19861a, imageDecoder, imageInfo, source);
    }
}
