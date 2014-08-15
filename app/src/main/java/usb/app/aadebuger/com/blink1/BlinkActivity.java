package usb.app.aadebuger.com.blink1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import  android.hardware.usb.*;
import java.util.HashMap;
import java.util.Iterator;
import android.widget.Toast;

public class BlinkActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blink);



        UsbManager manager = (UsbManager) getSystemService(Context.USB_SERVICE);

        HashMap<String, UsbDevice> deviceList = manager.getDeviceList();

        Iterator<UsbDevice> deviceIterator = deviceList.values().iterator();
        System.out.println("deviceList="+deviceList);
        Toast toast=Toast.makeText(getApplicationContext(), "默认的Toast2", Toast.LENGTH_SHORT);

        toast.show();
        while(deviceIterator.hasNext()){
            UsbDevice device = deviceIterator.next();
            //your code
            Toast toast1=Toast.makeText(getApplicationContext(), "默认的Toastdevice", Toast.LENGTH_SHORT);

            toast1.show();
            System.out.println("device="+device);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.blink, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
