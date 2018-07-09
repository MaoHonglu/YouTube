# YouTube
YouTube视频数据分析前端后台项目


本项目采用前后端分离机制实现，后台采用Springmvc搭建了一个Rest风格的后台，返回JSON数据。
前端通过ajax访问指定的接口获取指定的数据展示。

根目录下的web文件夹下面是前端项目。可单独抽离部署，js文件夹下面的mhl.js,mhl2.js,mhl3.js 里面axios访问的接口IP地址即可。

后端项目的配置只需修改resources文件夹下面的application.development.properties里面的配置项即可。

根目录下的youtube.sql文件夹为YouTube视频数据统计结果。

![网站首页截图](https://github.com/MaoHonglu/YouTube/blob/master/web/10.119.128.23_8080_dist2_index.html.png)
