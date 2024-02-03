package com.ronald.mapss.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class BbHelper(
    context: Context?,
   // name: String?,
   // factory: SQLiteDatabase.CursorFactory?,
   // version: Int
) : SQLiteOpenHelper(context, Constants.Nom_BD, null, Constants.VERSION_BD) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constants.TABLA)  // creando mi tabla en la base de datos

        //val ciudad = (nombre:"popayan",id:1)





    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}