//package com.example.assignment4;
//
//
//
//import android.content.Context;
//
//import androidx.room.Database;
//import androidx.room.Room;
//import androidx.room.RoomDatabase;
//
//
//
////import com.assignment4.template.ProximityEntity;
////import com.assignment4.template.Linear_accelerationEntity;
////import com.assignment4.template.TemperatureEntity;
////import com.assignment4.template.LightEntity;
////import com.assignment4.template.AccelerometerEntity;
////import com.assignment4.template.GyroscopeEntity;
////import com.assignment4.template.OrientationEntity;
////
////
////import com.assignment4.template.GPSEntity;
////import com.example.assignment4.Models.Entities.AccelerometerEntity;
////import com.example.helloworld.Models.Entities.GPSEntity;
////import com.example.helloworld.Models.Entities.LightEntity;
////import com.example.helloworld.Models.Entities.Linear_accelerationEntity;
////import com.example.helloworld.Models.Entities.ProximityEntity;
////import com.example.helloworld.Models.Entities.TemperatureEntity;
//
////@Database(entities = {  AccelerometerEntity.class,
////        GPSEntity.class,
////        OrientationEntity.class,
////        LightEntity.class,
////        Linear_accelerationEntity.class,
////        ProximityEntity.class,
////        GyroscopeEntity.class,
////        TemperatureEntity.class},
////        version = 4)
//abstract class SensorDatabase extends RoomDatabase {
//
//    public abstract SensorDAO dao();
//
//    public static SensorDatabase myDatabaseinstance;
//
//    public static  SensorDatabase getInstance(Context context){
//
//        if(myDatabaseinstance == null){
//            myDatabaseinstance = Room.databaseBuilder(context.getApplicationContext(), SensorDatabase.class, "my_database").fallbackToDestructiveMigration().allowMainThreadQueries().build();
//        }
//
//        return myDatabaseinstance;
//    }
//
//
//}