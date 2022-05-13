package sg.edu.rp.c346.id21010860.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        link the field variables
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonDisplayreset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hr = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                String hour = tp.getCurrentHour().toString();
                String minutes = tp.getCurrentMinute().toString();
                
                tvDisplay.setText("Time is " + hour + ":" + minutes);

                btnDisplayDate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int day = dp.getDayOfMonth();
                        int yr = dp.getYear();
                        int month = dp.getMonth();
                        int monthupdate = month+1;
                        tvDisplay.setText(day + "/" + monthupdate + "/" + yr);


                    }

                });


                btnReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    int year = dp.getYear();
                    int month = dp.getMonth();
                    int dayOfMonth = dp.getDayOfMonth();
                    dp.updateDate( year=2020, month=0, dayOfMonth=01);

                    tp.setCurrentHour(12);
                    tp.setCurrentMinute(0);



                    }


                });

                    }
        });
    }
}