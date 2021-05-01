# Android Template
The starting boilerplate code I use for Android projects. Completely working and setup with a single activity and bottom bar for fragment navigation. 

Built with MVVM architecture, using Koin for dependency injection, Room for local storage, Retrofit for network requests, as well as Jacoco, JUnit, Robolectric, and Mockito for testing. 

To build the app:
```
    gradlew build
```

To run unit tests:
```
    gradlew testDebugUnitTest
```

To generate code coverage report:
```
    gradlew jacocoTestReport
```