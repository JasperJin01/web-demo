


### UserServiceTest测试报错：

在这个错误中，UserServiceTest 测试类尝试加载应用程序的上下文，但在加载过程中发生了错误。具体来说，userServiceImpl bean 无法满足其依赖关系，因为它需要一个 UserMapper bean，但是 Spring 容器中找不到这样的 bean。