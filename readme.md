
注释详解
 ##dddd<br/>werwsdfdsfsdfsdfsdsfsdf<br/>sdfsdfsdfsdfdsf
 
[我的博客](http://blog.csdn.net/guodongxiaren)  
[我的博客](http://blog.csdn.net/guodongxiaren "悬停显示")  

* 你妹
  * 你没灭
    * 她妹妹
      * 他的没没没
        * 的防晒霜的
        
        
> 苏醒接口
>>大叔
>>>打打数
>>>>老老头
>>>>>姥姥的方法是
>>>>>>>>>爽肤水的方式
<br/> //换行

图片加超链接
[baidu]:http://www.baidu.com/img/bdlogo.gif
[![baidu]](http://wwww.baidu.com)


![](https://github.com/guodongxiaren/ImageCache/raw/master/Logo/foryou.gif)  //图片


[百度](http://www.baidu.com)//超链接



# amqp复习

## 分三种模式，direct,fanout,topic

### direct 模式
 ![](http://www.gaort.com/wp-content/uploads/2013/08/0ec0f465-49c6-361c-ae2b-dd951a6ed1a9.png)
 >####任何发送到Topic Exchange的消息都会被转发到所有关心RouteKey中指定话题的Queue上
 >>* 这种模式模式不是必须绑定EXchange(交换机),如果不绑定会走默认的交换机<br/>
 >>* 发送时需要RouteKey,可以理解为queue名字，定义的话，就是定义的，如果不定义就是默认queue名字
  
### fanout模式
![](http://www.gaort.com/wp-content/uploads/2013/08/0bbdcd3d-9fc6-3107-b7e0-db67c174d46a.png)
>####任何发送到Fanout Exchange的消息都会被转发到与该Exchange绑定(Binding)的所有Queue上。
>>* 这种模式，必须绑定Exchange(交换机),一个交换机可以绑定多个queue,一个queue可以绑定多个Exchange<br/>
>>* 这种模式不需要RoutKey<br/>
>>* 如果不绑定Exchange,数据将会自动抛弃<br/>

### topic模式

![](https://camo.githubusercontent.com/db40ae7234033fe9d8e4ad42e41e690575170b61/687474703a2f2f7777772e67616f72742e636f6d2f77702d636f6e74656e742f75706c6f6164732f323031332f30382f30626264636433642d396663362d333130372d623765302d6462363763313734643436612e706e67)


