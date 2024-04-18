

# 错误记录
## 240405
* 运行报错：`java: 错误: 不支持发行版本 22`。
    应该是版本不匹配的问题。
    解决参考：https://blog.csdn.net/xiaobawangle/article/details/135760546
  
后续的处理：删掉了一些JDK的包，又参考后面的博客进行了设置。
（https://blog.csdn.net/weixin_37646636/article/details/120508899 ）
* IDEA configurations 框标红，报错：`Warning: Class 'com.jasper.bootlaunch.BootLaunchApplication' not found in module 'boot-launch'`。
    因为IDEA中的项目结构或配置与实际项目不完全一致，导致IDEA无法正确识别主类。但是，即使IDEA标记红色并显示错误，实际上你仍然可以正常执行和启动项目。这可能是因为Spring Boot应用程序使用了注解驱动的方式，而不是依赖于IDEA的配置来确定主类。（Chatgpt3.5说的，不保证正确性）
    解决办法：`File -> Invalidate Caches/ Restart`，参考：https://stackoverflow.com/questions/52091449/class-not-found-in-module-warning-when-try-to-create-run-debug-configuration-in
  


* （与Git有关）为什么我的项目路径上，有文件标成了绿色、红色、黄色？分别代表什么意思

绿色：表示该文件是已添加到版本控制的，并且与本地仓库的状态一致。

红色：未追踪的文件。
可以使用快捷键cmd+opt+A快速加入（然后文件会变成绿色），或者右击文件，Git->Add。

黄色：通常表示文件被标记为 "未加入版本控制" 或者 "已修改但未提交"

蓝色：


* 想让run的console中输出的内容自动换行


## 240409

* 出现了报错：Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.jasper.bootlaunch.model.Article]: No default constructor found] with root cause

    报错的原因是：**获取文章列表时，Spring JDBC 尝试实例化 Article 类对象，但没有找到默认的构造函数。**

    解决方法：在Article类上加入@NoArgsConstructor 和 @AllArgsConstructor就好使了。




  