package kg.AD.interfaceWorks.xml.containers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

import kg.AD.R;
import kg.AD.begin.DisplayMessageActivity;
import kg.AD.values.Classes;
import kg.AD.values.Strings;

public class TableLayoutContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        chapterButton();
    }

    public void sendTLMessage(View view) {
        Intent intent = new Intent(this, TLCDisplayMessage.class);
        EditText login = (EditText) findViewById(R.id.login);
        EditText mail = (EditText) findViewById(R.id.mail);
        String login_message = login.getText().toString();
        String mail_message = mail.getText().toString();
        ArrayList<String> messages = new ArrayList<>();
        messages.add(login_message);
        messages.add(mail_message);
        intent.putStringArrayListExtra(Strings.EXTRA_MESSAGE, messages);
        startActivity(intent);
    }

    private void chapterButton() {
        Button layout_change = (Button) findViewById(R.id.next_fl);
        layout_change.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Classes.XML_TABLE_LAYOUT);
                        startActivity(intent);
                    }
                }
        );
    }
}