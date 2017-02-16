PhoneEditText [![](https://jitpack.io/v/leoxnidas/PhoneEditText.svg)](https://jitpack.io/#leoxnidas/PhoneEditText) [![API](https://img.shields.io/badge/API-15%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=15) [![API](https://img.shields.io/badge/API-16%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=16) [![API](https://img.shields.io/badge/API-17%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=17) [![API](https://img.shields.io/badge/API-18%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=18) [![API](https://img.shields.io/badge/API-19%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=19) [![API](https://img.shields.io/badge/API-20%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=20) [![API](https://img.shields.io/badge/API-21%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=21) [![API](https://img.shields.io/badge/API-22%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=22) [![API](https://img.shields.io/badge/API-23%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=23) [![API](https://img.shields.io/badge/API-24%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=24) [![API](https://img.shields.io/badge/API-25%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=25)
-------------
special phoneedittext library that allows you to have internationals phone codes in a simple edittext, all international phone codes came from [https://countrycode.org/](https://countrycode.org/)


Usage
-----
1- first of all, add gradle dependencie
```gradle

allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
        .
        .
        .


dependencies {
    compile 'com.github.leoxnidas:PhoneEditText:1.1'
}
```

2- add PhoneEditText to your layout
```xml
<com.github.leoxnidas.phoneedittext.PhoneEditText
        app:code="USA"
        android:layout_width="200dp"
        android:layout_height="wrap_content"/>
```

3- enjoy =P

![image](./img/phone.png)


License
--------
[LICENSE](./LICENSE.md)
