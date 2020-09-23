package kg.AD.resources.java;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import kg.AD.R;

public class ResValues extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // получение ресурсов из файла strings.xml
        String hello_android = getResources().getString(R.string.hello_android);
        // получение ресурсов из файла colors.xml
        int hello_android_color = (int) getResources().getColor(R.color.dark_green);
        int chapter_color = (int) getResources().getColor(R.color.dark_magenta);
        // получение ресурсов из файла dimens.xml
        int dimenSP = (int) getResources().getDimension(R.dimen.twentiethSP);
        // получение ресурсов из файла plurals.xml
        String chapters = getResources().getQuantityString(R.plurals.chapters, 25, 25);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        TextView textView = new TextView(this);
        textView.setId(1);
        textView.setText(hello_android);
        textView.setTextSize(dimenSP);
        textView.setBackgroundColor(hello_android_color);
        textView.setGravity(Gravity.CENTER);

        ConstraintLayout.LayoutParams tv = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        tv.topToTop = constraintLayout.getTop();
        tv.bottomToBottom = constraintLayout.getBottom();
        tv.rightToRight = constraintLayout.getRight();
        tv.leftToLeft = constraintLayout.getLeft();
        constraintLayout.addView(textView, tv);

        int textPluralSize = 18;
        int size = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP,
                textPluralSize,
                getResources().getDisplayMetrics());
        TextView textPlural = new TextView(this);
        textPlural.setText(chapters);
        textPlural.setTextSize(size);
        textPlural.setBackgroundColor(chapter_color);
        textPlural.setGravity(Gravity.CENTER);

        ConstraintLayout.LayoutParams tp = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        tp.topToBottom = textView.getId();
        tp.rightToRight = constraintLayout.getRight();
        tp.leftToLeft = constraintLayout.getLeft();
        constraintLayout.addView(textPlural, tp);

        setContentView(constraintLayout);
    }
}
