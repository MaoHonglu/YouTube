
     let tags =[];
     let tags_amount=[];

      let weekday =[];
      let video_amount=[];


  (function(){
    axios.get('http://10.51.86.205:8080/youtube/tag').then(res=>{
      res.data.data.ustagList.forEach(item=>{
        tags.push(item.tags);
        tags_amount.push(item.tags_amount);
      });
      createChart();
    });
  }());

  (function(){
    axios.get('http://10.51.86.205:8080/youtube/publishvideoweek').then(res=>{
      res.data.data.publishVideoWeekList.forEach(item=>{
        weekday.push(item.weekday);
        video_amount.push(item.video_amount);
      });
      createChart3();
    });
  }());



 
    function createChart(){
      const dom = document.getElementById("tagdiv");
      const myChart = echarts.init(dom);
      var option = null;

      option = {
          color: ['red'],
          tooltip : {
              trigger: 'axis',
              axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                  type : 'line'        // 默认为直线，可选为：'line' | 'shadow'
              }
          },
          grid: {
              left: '3%',
              right: '4%',
              bottom: '3%',
              containLabel: true
          },
          xAxis : [
              {
                  type : 'category',
                  data : tags,
                  axisTick: {
                      alignWithLabel: true
                  }
              }
          ],
          yAxis : [
              {
                  type : 'value'
              }
          ],
          series : [
              {
                  name:'视频数量',
                  type:'bar',
                  barWidth: '60%',
                  data:tags_amount
              }
          ]
      };
      if (option && typeof option === "object") {
          myChart.setOption(option, true);
      }
    }

   function createChart3(){
      const dom = document.getElementById("mhlweekday");
      const myChart = echarts.init(dom);
      var option = null;

      option = {
          color: ['yellow'],
          tooltip : {
              trigger: 'axis',
              axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                  type : 'line'        // 默认为直线，可选为：'line' | 'shadow'
              }
          },
          grid: {
              left: '3%',
              right: '4%',
              bottom: '3%',
              containLabel: true
          },
          xAxis : [
              {
                  type : 'category',
                  data : weekday,
                  axisTick: {
                      alignWithLabel: true
                  }
              }
          ],
          yAxis : [
              {
                  type : 'value'
              }
          ],
          series : [
              {
                  name:'视频数量',
                  type:'bar',
                  barWidth: '60%',
                  data:video_amount
              }
          ]
      };
      if (option && typeof option === "object") {
          myChart.setOption(option, true);
      }
    }
