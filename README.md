# gmall
商城系统

gmall-core核心模块

1. 包含了通用依赖：
   nacos注册中心、配置中心
   mybatis-plus
   mysql驱动
   swagger
   lombok
2. 通用工具类：
   请求参数包装类
   通用的响应数据
   日期工具类
   sql过滤工具类
3. 自定义异常



springboot的常用依赖有：

- data-redis
- web
- security

springCloud的常用依赖有：

- hystrix
- openfeign
- alibaba-nacos-discovery（已经在core中引入）
- alibaba-nacos-config（已经在core中引入）

核心是microservice这块儿，它分两类微服务：

- 后台CRUD微服务
  1. pms：商品管理系统（product） 8081
  2. ums：用户管理系统（user）8082
  3. wms：仓库管理系统（warehouse） 8083
  4. oms：订单管理系统（order） 8084
  5. sms：营销管理系统（sale） 8085
     。。。。
- 前台数据接口微服务
  1. cart：购物车微服务
  2. order：订单微服务
  3. search：搜索微服务
  4. item：商品详情微服务
  5. member：会员微服务

第三方微服务：物流、短信、支付、云存储。。。。

数据层：mysql（分库分表中间件：ShardingSphere）、redis、elasticsearch、activemq/rabbitmq、阿里OSS

后台管理前端：gmall-admin-vue（1000）

前台门户：gmall-shop （2000）

网关：gmall-gateway（8888）





