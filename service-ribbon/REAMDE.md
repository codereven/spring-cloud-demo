ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。
Feign默认集成了ribbon。
pom集成hystrix
//增加熔断监听
@HystrixCommand(fallbackMethod = "hiError")