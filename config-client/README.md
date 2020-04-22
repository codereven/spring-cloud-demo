http请求地址和资源文件映射如下:
/{application}/{profile}/{label}
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties


远程仓库配置文件为：config-client-dev.properties 对应 /{application}-{profile}.properties 配置文件已经指定DEV
类name为foo 表示为文件内属性
