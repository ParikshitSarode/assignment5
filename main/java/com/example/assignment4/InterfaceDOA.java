//package com.example.assignment4;
//
//
//
//import androidx.room.Dao;
//import androidx.room.Insert;
//import androidx.room.Query;
//
////import com.assignment4.template.ProximityEntity;
////import com.assignment4.template.Linear_accelerationEntity;
////import com.assignment4.template.TemperatureEntity;
////import com.assignment4.template.LightEntity;
////import com.assignment4.template.AccelerometerEntity;
////import com.assignment4.template.GPSEntity;
////import com.assignment4.template.GyroscopeEntity;
////
//////import com.example.assignment4.Models.Entities.GPSEntity;
//////import com.example.assignment4.Models.Entities.LightEntity;
//////import com.example.assignment4.Models.Entities.Linear_accelerationEntity;
//////import com.example.assignment4.Models.Entities.ProximityEntity;
//////import com.example.assignment4.Models.Entities.TemperatureEntity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Dao
//interface SensorDAO {
//
//    @Insert
//    public void accDataInsert(AccelerometerEntity accelerometerEntity);
//
//    @Query("SELECT * FROM AccelerometerEntity")
//    List<AccelerometerEntity> getAccData();
//    @Query("SELECT * FROM AccelerometerEntity where time >= :present_time  ")
//    List<AccelerometerEntity> getAccDataPast1Hour(Long present_time);
//
//
//    @Query("SELECT avg(x) from AccelerometerEntity where time >= :present_time")
//    Float getAccDataGenX(Long present_time);
//
//    @Query("SELECT avg(y) from AccelerometerEntity where time >= :present_time")
//    Float getAccDataGenY(Long present_time);
//
//    @Query("SELECT avg(z) from AccelerometerEntity where time >= :present_time")
//    Float getAccDataGenZ(Long present_time);
//
//
//    @Query("SELECT x from AccelerometerEntity where time >= :present_time")
//    List<Float> getAverageAccDataGenX(Long present_time);
//
//    @Query("SELECT y from AccelerometerEntity where time >= :present_time")
//    List<Float> getAverageAccDataGenY(Long present_time);
//
//    @Query("SELECT z from AccelerometerEntity where time >= :present_time")
//    List<Float> getAverageAccDataGenZ(Long present_time);
//
//
////    @Insert
////    public void tempDataInsert(TemperatureEntity temperatureEntity);
////
////    @Query("SELECT * FROM TemperatureEntity")
////    List<TemperatureEntity> getTempData();
////
////
////    @Query("SELECT * from TemperatureEntity  where time >= :present_time ")
////    List<TemperatureEntity> getTempDataPast1Hour(Long present_time);
////
////    @Query("SELECT  avg(`temp`) FROM  TemperatureEntity  where time >= :present_time")
////    float getTempDataGen(Long present_time);
////
////    @Insert
////    public void gpsDataInsert(GPSEntity gpsEntity);
////
////    @Insert
////    public void linaccDataInsert(Linear_accelerationEntity linear_accelerationEntity);
//
////    @Query("SELECT avg(x) from AccelerometerEntity where time >= :present_time")
////    Float getLinearAccGenX(Long present_time);
//
//    @Insert
//    public void proxDataInsert(ProximityEntity proximityEntity);
//
//    @Query("SELECT dist FROM ProximityEntity  where time >= :present_time")
//    List<Float> getProximityValues(Long present_time);
////
////    @Insert
////    public void lightDataInsert(LightEntity lightEntity);
////
////    @Insert
////    public void gyroscopeData(GyroscopeEntity gyroscopeEntity);
////
////    @Insert
////    public void orientationData(OrientationEntity orientationEntity);
////
//
//}
