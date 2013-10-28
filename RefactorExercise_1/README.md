2013-10-28 :
step 1
增加测试代码
查看代码覆盖率
1 使用了gradle 的JaCoCo插件，看不到那些代码没有被覆盖
2 安装了eclipse的eclemma插件，查看代码覆盖情况
3 增加了一个Junit Suite类，执行所有的测试用例
	
	
TODO
修改Junit，增加一个runwith类，可以自动加载所有的测试代码，这样可以保证不许要手动增加相关的测试类到Suite了