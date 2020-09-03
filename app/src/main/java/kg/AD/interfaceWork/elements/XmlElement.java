package kg.AD.interfaceWork.elements;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kg.AD.R;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class XmlElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_activity_xml_element);
        TextView textView = (TextView) findViewById(R.id.tv_xml);
        textView.setText(Strings.HELLO_XML_ELEMENT);
        textView.setTextSize(30);
        chapterButton();
    }

    public void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_units);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_UNITS);
                        startActivity(intent);
                    }
                }
        );
    }

}
