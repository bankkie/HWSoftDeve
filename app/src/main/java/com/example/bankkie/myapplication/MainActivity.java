package com.example.bankkie.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_Burnley:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.checkbox_Everton:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.checkbox_LeicesterCity:
                if (checked)
                    System.out.println("Excellent");
                break;
            case R.id.checkbox_CrystalPalace:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.checkbox_WestBromwichAlbion:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_MohamedSalah:
                if (checked)
                    System.out.println("Excellent");
                break;
            case R.id.radio_GabrielJesus:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_Willian:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_MesutÖzil:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_DeleAlli:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_DavidMoyes:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_AntonioConte:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_RafaelBenítez:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_SamAllardyce:
                if (checked)
                    System.out.println("Wrong, you try again.");
                break;
            case R.id.radio_JosepGuardiola:
                if (checked)
                    System.out.println("Excellent");
                break;
        }
    }
}
