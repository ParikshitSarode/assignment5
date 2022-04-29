//package com.example.assignment4;
//
//import androidx.annotation.NonNull;
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.PrimaryKey;
//
//@Entity
//class ProximityEntity{
//
//    @PrimaryKey(autoGenerate = true)
//    @NonNull
//    int prox_id;
//    @ColumnInfo(name = "dist")
//    float dist;
//    @ColumnInfo(name = "time")
//    Long time;
//
//    public ProximityEntity(float dist, Long time) {
//        this.dist = dist;
//        this.time = time;
//    }
//
//    public int getProx_id() {
//        return prox_id;
//    }
//
//    public void setProx_id(int prox_id) {
//        this.prox_id = prox_id;
//    }
//
//    public float getDist() {
//        return dist;
//    }
//
//    public void setDist(float dist) {
//        this.dist = dist;
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