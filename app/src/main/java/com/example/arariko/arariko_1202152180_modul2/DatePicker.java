package com.example.arariko.arariko_1202152180_modul2;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import java.util.Calendar;

/**
 * Created by Arariko on 18/02/2018.
 */

@SuppressLint("ValidFragment")
class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    @NonNull
    @Override
    //sebagai format penaggalan
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        //memberi atribut (instance) pada datepicker dialog dan mengembalikannya
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    //setting date melalui class TakeAway
    public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {

        TakeAway takeAway = (TakeAway) getActivity();
        // memproses method processDatePickerResult()
        takeAway.processDatePickerResult(year, month, day);
    }
}

