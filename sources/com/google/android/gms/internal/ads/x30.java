package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p003a2.C0092o;
import p048g2.C2637b;
import p054h1.C2694t;

@ParametersAreNonnullByDefault
public final class x30 extends RelativeLayout {

    /* renamed from: g */
    private static final float[] f17016g = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: f */
    private AnimationDrawable f17017f;

    public x30(Context context, w30 w30, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C0092o.m313i(w30);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f17016g, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(w30.mo11568g());
        setLayoutParams(layoutParams);
        C2694t.m21609r();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(w30.mo6381e())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(w30.mo6381e());
            textView.setTextColor(w30.mo11566b());
            textView.setTextSize((float) w30.mo11563A5());
            C2125qw.m15897b();
            int s = bo0.m6995s(context, 4);
            C2125qw.m15897b();
            textView.setPadding(s, 0, bo0.m6995s(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<z30> B5 = w30.mo11564B5();
        if (B5 != null && B5.size() > 1) {
            this.f17017f = new AnimationDrawable();
            for (z30 d : B5) {
                try {
                    this.f17017f.addFrame((Drawable) C2637b.m21357C0(d.mo8871d()), w30.mo11565a());
                } catch (Exception e) {
                    io0.m11129e("Error while getting drawable.", e);
                }
            }
            C2694t.m21609r();
            imageView.setBackground(this.f17017f);
        } else if (B5.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C2637b.m21357C0(B5.get(0).mo8871d()));
            } catch (Exception e2) {
                io0.m11129e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f17017f;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
