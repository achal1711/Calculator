package com.calca.CalculatorA;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    double input = 0, input2 = 0;
    EditText edt1;
    TextView edt2;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        Remainder = (Button) findViewById(R.id.Remainder);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonEqual = (Button) findViewById(R.id.buttoneql);

        edt1 = (EditText) findViewById(R.id.display);
        edt2 = (TextView) findViewById(R.id.holdDisplay);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try{
                        input = Double.parseDouble(edt1.getText() + "");
                        Addition = true;
                        decimal = false;
                        edt1.setText(null);
                        edt2.setTextColor(Color.parseColor("#000000"));
                        edt2.setText(input + "" + "+");
                    } catch (NumberFormatException e) {
                        edt2.setTextColor(Color.parseColor("#ff0000"));
                        edt2.setText("Invalid number");
                    }

                    }
               }
          });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try{
                    input = Double.parseDouble(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                        edt2.setTextColor(Color.parseColor("#000000"));
                        edt2.setText(input + "" + "-");
                    } catch (NumberFormatException e) {
                        edt2.setTextColor(Color.parseColor("#ff0000"));
                        edt2.setText("Invalid number");
                    }
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try{
                    input = Double.parseDouble(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                        edt2.setTextColor(Color.parseColor("#000000"));
                        edt2.setText(input + "" + "X");
                    } catch (NumberFormatException e) {
                        edt2.setTextColor(Color.parseColor("#ff0000"));
                        edt2.setText("Invalid number");
                    }
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try{
                    input = Double.parseDouble(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                        edt2.setTextColor(Color.parseColor("#000000"));
                        edt2.setText(input + "" + "/");
                    } catch (NumberFormatException e) {
                        edt2.setTextColor(Color.parseColor("#ff0000"));
                        edt2.setText("Invalid number");
                    }
                }
            }
        });

        Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    try{
                    input = Double.parseDouble(edt1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    edt1.setText(null);
                        edt2.setTextColor(Color.parseColor("#000000"));
                        edt2.setText(input + "" + "%");
                    } catch (NumberFormatException e) {
                        edt2.setTextColor(Color.parseColor("#ff0000"));
                        edt2.setText("Invalid number");
                    }
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    try {
                        input2 = Double.parseDouble(edt1.getText() + "");


                        if (Addition) {

                            edt1.setText(input + input2 + "");
                            Addition = false;
                            edt2.setText(null);
                        }

                        if (Subtract) {

                            edt1.setText(input - input2 + "");
                            Subtract = false;
                            edt2.setText(null);
                        }

                        if (Multiplication) {
                            edt1.setText(input * input2 + "");
                            Multiplication = false;
                            edt2.setText(null);
                        }

                        if (Division) {
                            edt1.setText(input / input2 + "");
                            Division = false;
                            edt2.setText(null);
                        }
                        if (mRemainder) {
                            edt1.setText(input % input2 + "");
                            mRemainder = false;
                            edt2.setText(null);
                        }
                    }
                catch(NumberFormatException e) {
                    edt2.setTextColor(Color.parseColor("#ff0000"));
                    edt2.setText("Invalid Operation");
                  }
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                input = 0.0;
                input2 = 0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "Developer: Achal Kumar Rai\n" +
                        " Icon By: Achal Kumar Rai", Toast.LENGTH_LONG).show();
                break;

            case R.id.version:
                Toast.makeText(this, "Version: 1.0", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

}



