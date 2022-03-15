package com.example.designpatterns.creational.singleton

/**
 * @author Evdokimov on 04.03.2022.
 */
class DataBaseJavaLike private constructor() {

    companion object {

        private var db: DataBaseJavaLike? = null
        private val LOCK = Any()

        fun getInstance(): DataBaseJavaLike {
            db?.let {
                return it
            }
            synchronized(LOCK) {
                db?.let {
                    return it
                }
                db = DataBaseJavaLike()
                return db as DataBaseJavaLike
            }
        }
    }
}