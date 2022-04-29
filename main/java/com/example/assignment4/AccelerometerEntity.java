//package com.example.assignment4;
//
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.PrimaryKey;
//
//@Entity
//class AccelerometerEntity {
//
//    @PrimaryKey(autoGenerate = true)
//    int acc_id;
//    @ColumnInfo(name = "x")
//    float x;
//    @ColumnInfo(name = "y")
//    float y;
//    @ColumnInfo(name = "z")
//    float z;
//    @ColumnInfo(name = "time")
//    Long time;
//
//    public AccelerometerEntity(float x, float y, float z, Long time) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        this.time = time;
//    }
//
//    public int getAcc_id() {
//        return acc_id;
//    }
//
//    public void setAcc_id(int acc_id) {
//        this.acc_id = acc_id;
//    }
//
//    public float getX() {
//        return x;
//    }
//
//    public void setX(float x) {
//        this.x = x;
//    }
//
//    public float getY() {
//        return y;
//    }
//
//    public void setY(float y) {
//        this.y = y;
//    }
//
//    public float getZ() {
//        return z;
//    }
//
//    public void setZ(float z) {
//        this.z = z;
//    }
//
//    public Long getTime() {
//        return time;
//    }
//
//    public void setTime(Long time) {
//        this.time = time;
//    }
//}
