package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {


    Sensor accelerometer,mLight,mProx,gyro,temp,orientation;
    LocationListener mlocListener;
    private SensorManager sensorManager;
    private LocationManager locationManager;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch swt1 = (Switch) findViewById(R.id.switch6);
        Switch swt2 = (Switch) findViewById(R.id.switch7);
        Switch swt3 = (Switch) findViewById(R.id.switch8);
        Switch swt4 = (Switch) findViewById(R.id.switch9);
        Switch swt5 = (Switch) findViewById(R.id.switch10);
        Switch swt6 = (Switch) findViewById(R.id.switch11);

        Button cht1 = (Button) findViewById(R.id.button2);
        Button cht2 = (Button) findViewById(R.id.button3);
        Button cht3 = (Button) findViewById(R.id.button4);
        Button cht4 = (Button) findViewById(R.id.button5);
        Button cht5 = (Button) findViewById(R.id.button6);
        Button cht6 = (Button) findViewById(R.id.button7);

        txt1 = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView3);
        txt4 = (TextView) findViewById(R.id.textView4);
        txt5 = (TextView) findViewById(R.id.textView5);
        txt6 = (TextView) findViewById(R.id.textView6);


//        swt1.setChecked(false);
//        swt2.setChecked(false);
//        swt3.setChecked(false);
//        swt4.setChecked(false);
//        swt5.setChecked(false);
//        swt6.setChecked(false);

        if(swt1.isChecked())
            cht1.setEnabled(true);
        else cht1.setEnabled(false);

        if(swt2.isChecked())
            cht2.setEnabled(true);
        else cht2.setEnabled(false);

        if(swt3.isChecked())
            cht3.setEnabled(true);
        else cht3.setEnabled(false);

        if(swt4.isChecked())
            cht4.setEnabled(true);
        else cht4.setEnabled(false);

        if(swt5.isChecked())
            cht5.setEnabled(true);
        else cht5.setEnabled(false);

        if(swt6.isChecked())
            cht6.setEnabled(true);
        else cht6.setEnabled(false);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        swt1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swt1.isChecked()){
                    cht1.setEnabled(true);
                    gyro = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
                    if (gyro != null) {

                        sensorManager.registerListener(MainActivity.this, gyro, SensorManager.SENSOR_DELAY_NORMAL);
                        Toast.makeText(MainActivity.this, "Gyro sensor started", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        Log.i(String.valueOf(1),"Gyro Not supported");
                    }
                    Toast.makeText(MainActivity.this, "Gyroscope is starting", Toast.LENGTH_SHORT).show();
                }
                else{ cht1.setEnabled(false);
                    Stop(5);
                    Toast.makeText(MainActivity.this, "Gyroscope is stopping", Toast.LENGTH_SHORT).show();
                }
            }
        });

        swt2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swt2.isChecked()){

                    cht2.setEnabled(true);
                    accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                    if (accelerometer != null) {

                        sensorManager.registerListener(MainActivity.this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
                        Toast.makeText(MainActivity.this, "Accelerometer sensor started", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        Log.i(String.valueOf(1),"Accelerometer Not supported");
                    }
                    Toast.makeText(MainActivity.this, "Accelerometer is starting", Toast.LENGTH_SHORT).show();
                }
                else {cht2.setEnabled(false);
                    Stop(1);

                    Toast.makeText(MainActivity.this, "Accelerometer is stopping", Toast.LENGTH_SHORT).show();
                }
            }
        });

        swt3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swt3.isChecked()){
                    cht3.setEnabled(true);
                    temp = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
                    if (temp != null) {

                        sensorManager.registerListener(MainActivity.this, temp, SensorManager.SENSOR_DELAY_NORMAL);
                        Toast.makeText(MainActivity.this, " Temp sensor started", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        Log.i(String.valueOf(2),"Temp Not supported");
                    }
                    Toast.makeText(MainActivity.this, "Temp is starting", Toast.LENGTH_SHORT).show();
                }
                else{ cht3.setEnabled(false);
                    Stop(6);
                    Toast.makeText(MainActivity.this, "Temp is stopping", Toast.LENGTH_SHORT).show();
                }
            }
        });

        swt4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swt4.isChecked()){
                    cht4.setEnabled(true);
                    mLight = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
                    if (mLight != null) {

                        sensorManager.registerListener(MainActivity.this, mLight, SensorManager.SENSOR_DELAY_NORMAL);
                        Toast.makeText(MainActivity.this, " Light sensor started", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        Log.i(String.valueOf(2),"Light Not supported");
                    }
                    Toast.makeText(MainActivity.this, "Light is starting", Toast.LENGTH_SHORT).show();
                }
                else{ cht4.setEnabled(false);
                    Stop(2);
                    Toast.makeText(MainActivity.this, "Light is stopping", Toast.LENGTH_SHORT).show();
                }
            }
        });

        swt5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swt5.isChecked()){
                    mProx = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
                    if (mProx != null) {

                        sensorManager.registerListener(MainActivity.this, mProx, SensorManager.SENSOR_DELAY_NORMAL);
                        Toast.makeText(MainActivity.this, " Proximity sensor started", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        Log.i(String.valueOf(3),"Not supported");
                    }
                    cht5.setEnabled(true);
                    Toast.makeText(MainActivity.this, "Proximity is starting", Toast.LENGTH_SHORT).show();
                }
                else {cht5.setEnabled(false);
                    Stop(3);
                    Toast.makeText(MainActivity.this, "Proximity is stopping", Toast.LENGTH_SHORT).show();
                }
            }
        });

        swt6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swt6.isChecked()) {
                    cht6.setEnabled(true);
                    orientation = sensorManager.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR);
                    if (orientation != null) {
                        sensorManager.registerListener(MainActivity.this, orientation, SensorManager.SENSOR_DELAY_NORMAL);
                        Toast.makeText(MainActivity.this, " Rotational Vector sensor started", Toast.LENGTH_SHORT).show();

                    } else {
                        Log.i(String.valueOf(66), "Rotational Vector not supported");

                    }
                }
                else {cht6.setEnabled(false);
                    Stop(7);
                    Toast.makeText(MainActivity.this, "Orientatioin is stopping", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void Stop(int i) {
        if(i == 1) {
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER));
        }
        else if(i == 2) {
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT));
        }

        else if(i == 3) {
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY));
        }

        else if(i == 4) {
            locationManager.removeUpdates(mlocListener);
        }

        else if (i==5){
            sensorManager.unregisterListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE));
        }
        else if (i==6){
            sensorManager.unregisterListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE));
        }
        else if (i==7){
            sensorManager.unregisterListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION));
        }

    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor = sensorEvent.sensor;
        if (sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float x, y, z;
            x = sensorEvent.values[0];
            y = sensorEvent.values[1];
            z = sensorEvent.values[2];

            Log.d(String.valueOf(11), "Accelerometer X:" + sensorEvent.values[0] + "Y:" + sensorEvent.values[1]
                    + "Z:" + sensorEvent.values[2]);

            txt1.setText("Accelerometer X:" + sensorEvent.values[0] + "Y:" + sensorEvent.values[1]
                    + "Z:" + sensorEvent.values[2]);

//            AccelerometerEntity accelerometerEntity = new AccelerometerEntity(x,y,z,System.currentTimeMillis());
//            sensorDatabase.dao().accDataInsert(accelerometerEntity);


//            Toast.makeText(this, String.valueOf(x)+String.valueOf(y)+String.valueOf(z), Toast.LENGTH_SHORT).show();

        }
        else  if (sensor.getType() == Sensor.TYPE_LIGHT) {
            Log.d(String.valueOf(22), "Light:" + sensorEvent.values[0]);
            Toast.makeText(this, String.valueOf(sensorEvent.values[0]), Toast.LENGTH_SHORT).show();
//            LightEntity lightEntity = new LightEntity(data,System.currentTimeMillis());
//            sensorDatabase.dao().lightDataInsert(lightEntity);
            txt2.setText("Light:" + sensorEvent.values[0]);

        }
        else  if (sensor.getType() == Sensor.TYPE_PROXIMITY) {
            Log.d(String.valueOf(33), "Proximity" + sensorEvent.values[0]);
            Toast.makeText(this, String.valueOf(sensorEvent.values[0]), Toast.LENGTH_SHORT).show();
//            ProximityEntity proximityentity = new ProximityEntity(dist,System.currentTimeMillis());
//            sensorDatabase.dao().proxDataInsert(proximityentity);
            txt3.setText("Proximity" + sensorEvent.values[0]);
        }
        else if(sensor.getType() == Sensor.TYPE_GYROSCOPE) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];

//            GyroscopeEntity gyroscopeEntity = new GyroscopeEntity(x,y,z,System.currentTimeMillis());
//            sensorDatabase.dao().gyroscopeData(gyroscopeEntity);
            txt4.setText("onSensorChanged: Gyroscope" + "x=" + x + ", y=" + y + ", z=" + z);
            Log.d(String.valueOf(55), "onSensorChanged: Gyroscope" + "x=" + x + ", y=" + y + ", z=" + z);
//            gyroscope_tv.setText("Gyroscope " + "x=" + x + ", y=" + y + ", z=" + z);
        }else if(sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE){

            float temp = sensorEvent.values[0];

//            TemperatureEntity temperatureEntity = new TemperatureEntity(temp,System.currentTimeMillis());
//            sensorDatabase.dao().tempDataInsert(temperatureEntity);
            txt5.setText("onSensorChanged: Temperature is "+String.valueOf(temp));
            Log.d(String.valueOf(77),"onSensorChanged: Temperature is "+String.valueOf(temp));
//            tv_temperature.setText(String.valueOf(temp));

        }
        else if(sensor.getType() == Sensor.TYPE_GAME_ROTATION_VECTOR) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];

//            OrientationEntity orientationEntity = new OrientationEntity(x,y,z,System.currentTimeMillis());
//            sensorDatabase.dao().orientationData(orientationEntity);
            txt6.setText("onSensorChanged: Rotational Vector" + "x=" + x + ", y=" + y + ", z=" + z);
            Log.d(String.valueOf(99), "onSensorChanged: Rotational Vector" + "x=" + x + ", y=" + y + ", z=" + z);
//            orientation_tv.setText("Rotational Vector " + "x=" + x + ", y=" + y + ", z=" + z);
        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}