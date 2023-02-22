ZXing 是一个开源的、多格式的一维/二维条码图像处理库

1、maven引入依赖
```
<!--如果是非 web 应用则导入 core 包即可，如果是 web 应用，则 core 与 javase 一起导入。-->
<!-- https://mvnrepository.com/artifact/com.google.zxing/core -->
<dependency>
    <groupId>com.google.zxing</groupId>
    <artifactId>core</artifactId>
    <version>3.3.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.google.zxing/javase -->
<dependency>
    <groupId>com.google.zxing</groupId>
    <artifactId>javase</artifactId>
    <version>3.3.0</version>
</dependency>
```

2、略