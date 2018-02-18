package com.example.arariko.arariko_1202152180_modul2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import java.util.Calendar;

/**
 * Created by Arariko on 18/02/2018.
 */

@SuppressLint("ValidFragment")
public class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @NonNull
    public Dialog onCreateDialog (Bundle savedInstanceState){
        final Calendar c = Calendar.getInstance();

        //membuat object baru untuk timepickerdialog dan mengembalikannya
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));

    }

    @Override
    public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
        TakeAway takeAway = (TakeAway) getActivity();
        takeAway.processTimePickerResult(hourOfDay, minute);
    }
}
