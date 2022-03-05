package com.example.designpatterns.creational.singleton

/**
 * @author Evdokimov on 04.03.2022.
 */
class DataBaseJavaLike private constructor() {

    companion object {

        private var db: DataBaseJavaLike? = null

        fun getInstance(): DataBaseJavaLike {
            if (db == null)
                db = DataBaseJavaLike()
            return db as DataBaseJavaLike
        }
    }
}