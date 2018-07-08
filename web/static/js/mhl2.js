
      let cate =[];
      let likes_sum =[];
      let dislikes_sum=[];
      let viewcount=[];
      let commentcount=[];


    (function created(){
      axios.get('http://10.51.86.205:8080/youtube/usvideosum').then(res=>{
        res.data.data.usVideoSumList.forEach(item=>{
          cate.push(Array.from(item.category).slice(0,5).join('').toString());
          likes_sum.push(item.likes_sum);
          dislikes_sum.push(item.dislikes_sum);
          viewcount.push(item.views_sum);
          commentcount.push(item.comment_count_sum);
        });

        createChartLike();
        createView();
        createComment();
      });
    }());




    function createChartLike(){
      var dom = document.getElementById("mhl2");
      const myChart = echarts.init(dom);
      var app = {};
      var option = null;

      option = {
          tooltip: {
              trigger: 'axis',
              axisPointer: {
                  type: 'shadow'
              }
          },
          legend: {
              data: ['Like', 'disLike']
          },
          grid: {
              left: '3%',
              right: '4%',
              bottom: '3%',
              containLabel: true
          },
          xAxis: {
              type: 'value',
              boundaryGap: [0, 0.01]
          },
          yAxis: {
              type: 'category',
              data: cate
          },
          series: [
              {
                  name: 'Like',
                  type: 'bar',
                  data: likes_sum
              },
              {
                  name: 'disLike',
                  type: 'bar',
                  data:  dislikes_sum
              }
          ]
      };
      ;
      if (option && typeof option === "object") {
          myChart.setOption(option, true);
      }
    };
   function createView(){
      // 基于准备好的dom，初始化echarts实例
        const myChart = echarts.init(document.getElementById('view'));

        // 指定图表的配置项和数据
        var option = {
          color: ['#3398DB'],
            tooltip: {},
            legend: {
                data:['观看数量']
            },
            xAxis: {
                data: cate
            },
            yAxis: {},
            series: [{
                name: '观看数量',
                type: 'bar',
                data: viewcount
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    };
    function createComment(){
      // 基于准备好的dom，初始化echarts实例
        const myChart = echarts.init(document.getElementById('comment'));

        // 指定图表的配置项和数据
        var option = {
            tooltip: {},
            legend: {
                data:['评论数量']
            },
            xAxis: {
                data: cate
            },
            yAxis: {},
            series: [{
                name: '评论数量',
                type: 'bar',
                data: commentcount
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }

