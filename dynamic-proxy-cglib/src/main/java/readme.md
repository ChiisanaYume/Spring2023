```
Exception in thread "main" java.lang.NoSuchMethodError: 'java.lang.Boolean java.lang.Object.login(java.lang.String, java.lang.String)'
	at com.faintdream.proxy.service.UserService$$EnhancerByCGLIB$$5a1d5cf3.CGLIB$login$5(<generated>)
	at com.faintdream.proxy.service.UserService$$EnhancerByCGLIB$$5a1d5cf3$$FastClassByCGLIB$$d2023b81.invoke(<generated>)
	at net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)
	at com.faintdream.proxy.service.TimerMethodInterceptor.intercept(TimerMethodInterceptor.java:24)
	at com.faintdream.proxy.service.UserService$$EnhancerByCGLIB$$5a1d5cf3.login(<generated>)
	at com.faintdream.proxy.client.Client.main(Client.java:23)
```