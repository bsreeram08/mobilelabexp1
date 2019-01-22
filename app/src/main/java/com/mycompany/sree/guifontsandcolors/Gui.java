package com.mycompany.sree.guifontsandcolors;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Gui extends AppCompatActivity {
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui);
        Button button = findViewById(R.id.button);
        final EditText editText = findViewById(R.id.edittext);
        final Spinner color,fontfamily,size;
        color = findViewById(R.id.Color);
        fontfamily = findViewById(R.id.Fontfamily);
        size = findViewById(R.id.Size);
        final TextView textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string =editText.getText().toString();
                if(string.equals(""))
                {
                    Toast.makeText(Gui.this,"No Text Found",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    final String selectedColor = color.getSelectedItem().toString();
                    final String selectedSize = size.getSelectedItem().toString();
                    final String selectedFont = fontfamily.getSelectedItem().toString()+".ttf";
                    textView.setText(string);
                    textView.setTextSize(Float.parseFloat(selectedSize));
                    switch (selectedColor)
                    {
                        case "RED":textView.setTextColor(Color.RED);
                            break;
                        case "BLUE":textView.setTextColor(Color.BLUE);
                            break;
                        case "GREEN":textView.setTextColor(Color.GREEN);
                            break;
                        case "YELLOW":textView.setTextColor(Color.YELLOW);
                            break;
                        case "MAGENTA":textView.setTextColor(Color.MAGENTA);
                            break;
                        case "WHITE":textView.setTextColor(Color.WHITE);
                            break;
                        case "BLACK":textView.setTextColor(Color.BLACK);
                            break;
                        case "CYAN":textView.setTextColor(Color.CYAN);
                            break;
                    }
                    Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/"+selectedFont);
                    textView.setTypeface(typeface);
                }
            }
        });


    }

}
