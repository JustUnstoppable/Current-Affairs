package com.example.currentaffairs.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
//Hilt component is attached to the Application object's lifecycle and provides dependencies to it.
// Additionally, it is the parent component of the app, which means that other components can access the dependencies that it provides.
/*
This is application class annotated with HiltAndoridApp
 */
//Hilt provides a standard way to use DI in your application by providing containers for
// every Android class in your project and managing their lifecycles automatically.
@HiltAndroidApp
class NewsApp:Application() {
}
//This generated Hilt component is attached to the Application object's lifecycle and provides dependencies to it.
// Additionally, it is the parent component of the app,
// which means that other components can access the dependencies that it provides.