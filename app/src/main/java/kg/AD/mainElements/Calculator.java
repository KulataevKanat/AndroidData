package kg.AD.mainElements;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kg.AD.R;
import kg.AD.values.Strings;

public class Calculator extends AppCompatActivity {

    private TextView resultField; //Тескстовое поле для вывода результата
    private EditText numberField; //Поле для вывода чисел
    private TextView operationField; //Тескстовое поле для вывода знака операции
    private Double operand = null; //Операнд операции
    private String lastOperation = Strings.EQUALLY; //Последняя операция


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        resultField = (TextView) findViewById(R.id.calc_resultField);
        numberField = (EditText) findViewById(R.id.calc_numberField);
        operationField = (TextView) findViewById(R.id.calc_operationField);
    }

    //сохранение состояние
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(Strings.OPERATION, lastOperation);
        if (operand != null)
            outState.putDouble(Strings.OPERAND, operand);
        super.onSaveInstanceState(outState);
    }

    //получение ранее сохраненного состояние
    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lastOperation = savedInstanceState.getString(Strings.OPERATION);
        operand = savedInstanceState.getDouble(Strings.OPERAND);
        resultField.setText(operand.toString());
        operationField.setText(lastOperation);
    }

    //обработка нажатия на числовую кнопку
    public void onNumberClick(View view) {
        Button button = (Button) view;
        numberField.append(button.getText());

        if (lastOperation.equals(Strings.EQUALLY) && operand != null) {
            operand = null;
        }
    }

    //обработка нажатия на кнопку операций
    public void onOperationClick(View view) {
        Button button = (Button) view;
        String op = button.getText().toString();
        String number = numberField.getText().toString();
        //если что-нибудь введено
        if (number.length() > 0) {
            number = number.replace(',', '.');
            try {
                performOperation(Double.valueOf(number), op);
            } catch (NumberFormatException ex) {
                numberField.setText("");
            }
        }
        lastOperation = op;
        operationField.setText(lastOperation);
    }

    @SuppressLint("SetTextI18n")
    private void performOperation(Double number, String operation) {
        //Если операнд ранне не был установлен (при вводе самой первой операции)
        if (operand == null) {
            operand = number;
        } else {
            if (lastOperation.equals(Strings.EQUALLY)) {
                lastOperation = operation;
            }
            switch (lastOperation) {
                case Strings.EQUALLY:
                    operand = number;
                    break;
                case Strings.DEGREE:
                    if (number == 0) {
                        operand = 0.0d;
                    } else {
                        operand /= number;
                    }
                    break;
                case Strings.MULTIPLICATIONS:
                    operand *= number;
                    break;
                case Strings.PLUS:
                    operand += number;
                    break;
                case Strings.MINUS:
                    operand -= number;
                    break;
            }
        }
        resultField.setText(operand.toString().replace(".", ","));
        numberField.setText("");
    }
}