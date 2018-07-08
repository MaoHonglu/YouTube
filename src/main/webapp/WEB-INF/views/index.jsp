<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>YouTube数据分析 | 后台首页</title>

    <link href="/youtube/static/bootstrap/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container-fluid">
    <h2>Hello YouTube!</h2>
    <h3>请访问相应的接口获取相应的数据</h3>
    <p>
        <a href="http://10.119.128.23:8080/youtube/videocntamount">获取视频流行趋势数据接口</a><br />
        <a href="http://10.119.128.23:8080/youtube/usvideosum">各类视频基本数据获取接口</a><br />
        <a href="http://10.119.128.23:8080/youtube/tag">Film类视频标签统计接口</a><br />
        <a href="http://10.119.128.23:8080/youtube/publishvideoweek">发布视频数量与星期之间的关系</a><br />
    </p>
</div>
</body>
</html>
