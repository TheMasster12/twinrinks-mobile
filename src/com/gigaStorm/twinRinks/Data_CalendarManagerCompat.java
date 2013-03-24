package com.gigaStorm.twinRinks;

import android.content.Context;
import android.widget.Toast;

public class Data_CalendarManagerCompat {
    private Context context;

    public Data_CalendarManagerCompat(Context context) {
	this.context = context;
    }

    public void saveGamesToCalendar() {
	toast("Feature not yet supported on this version of android");
    }

    public void toast(Object obj) {
	Toast toast = Toast.makeText(context, obj.toString(), Toast.LENGTH_LONG);
	toast.show();
    }
}