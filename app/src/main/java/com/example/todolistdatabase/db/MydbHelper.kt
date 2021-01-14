package com.example.todolistdatabase.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.security.AccessControlContext

class MydbHelper(context: Context):SQLiteOpenHelper(
        context,
        "todos.db",
        null,
        1
){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(TodoTable.CMD_CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

}