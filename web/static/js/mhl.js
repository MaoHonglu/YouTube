let cnt = [];
let cnt_amount = [];

  (function(){
    axios.get('http://10.51.86.205:8080/youtube/videocntamount').then(res=>{
      res.data.data.videoCntAmountList.forEach(item=>{
        cnt.push(item.cnt);
        cnt_amount.push(item.cnt_amount);
      });
      this.createChart1();
    });
  }());



function createChart1(){
      // 基于准备好的dom，初始化echarts实例
        const myChart = echarts.init(document.getElementById('mhl'));

        // 指定图表的配置项和数据
        var option = {
          color: ['#3398DB'],
            tooltip: {},
            legend: {
                data:['流行天数']
            },
            xAxis: {
                data: cnt
            },
            yAxis: {},
            series: [{
                name: '流行天数',
                type: 'bar',
                data: cnt_amount
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    };

    //文档加载完成之后开始执行
    $(document).ready(function(){
        //1.初始化字符云
        var chart = echarts.init(document.getElementById('clound'));
        var option = {
            tooltip: {},
            series: [ {
                type: 'wordCloud',
                gridSize: 2,
                sizeRange: [12, 50],
                rotationRange: [-90, 90],
                shape: 'pentagon',
                width: 600,
                height: 300,
                drawOutOfBound: true,
                textStyle: {
                    normal: {
                        color: function () {
                            return 'rgb(' + [
                                Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160),
                                Math.round(Math.random() * 160)
                            ].join(',') + ')';
                        }
                    },
                    emphasis: {
                        shadowBlur: 10,
                        shadowColor: '#333'
                    }
                },
                data: [
                    {
                        name: 'movie',
                        value: 1585,
                        textStyle: {
                            normal: {
                                color: 'black'
                            },
                            emphasis: {
                                color: 'red'
                            }
                        }
                    },
                    {
                        name: 'trailer',
                        value: 1240
                    },
                    {
                        name: 'the',
                        value: 1000
                    },
                    {
                        name: 'Trailer',
                        value: 864
                    },
                    {
                        name: 'film',
                        value: 730
                    },
                    {
                        name: 'alex',
                        value: 701
                    },
                    {
                        name: '2018',
                        value: 582
                    },
                    {
                        name: 'Movie',
                        value: 534
                    },
                    {
                        name: 'honest',
                        value: 523
                    },
                    {
                        name: 'trailers',
                        value: 485
                    },
                    {
                        name: 'itsalexclark',
                        value: 451
                    },
                    {
                        name: 'theroy',
                        value: 442
                    },
                    {
                        name: 'to',
                        value: 409
                    },
                    {
                        name: 'youtube',
                        value: 407
                    },
                    {
                        name: 'animation',
                        value: 395
                    },
                    {
                        name: 'wars',
                        value: 386
                    },
                    {
                        name: 'star',
                        value: 374
                    },
                    {
                        name: 'new',
                        value: 371
                    },
                    {
                        name: 'review',
                        value: 370
                    },
                    {
                        name: '2',
                        value: 358
                    },
                    {
                        name: 'deadpool',
                        value: 348
                    },
                    {
                        name: 'animated',
                        value: 328
                    },
                    {
                        name: 'movies',
                        value: 320
                    },
                    {
                        name: 'disney',
                        value: 320
                    }
                ]
            } ]
        };
        chart.setOption(option);
        window.onresize = chart.resize;
    });
