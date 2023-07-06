#issue resolve
1. 在 docker 中 docker run mysql时报错
`
   sudo docker run -p 3306:3306 \
   --name mysql8 \
   -v /Volumes/dockermnt/mysql/mysql-files:/var/lib/mysql-files \
   -v /Volumes/dockermnt/mysql/conf:/etc/mysql/conf.d \
   -v /Volumes/dockermnt/mysql/log:/var/log/mysql \
   -v /Volumes/dockermnt/mysql/data:/var/lib/mysql \
   -e MYSQL_ROOT_PASSWORD=root \
   -d mysql
`
>如果报错说
   对/var/lib/mysql 目录权限不足时，
   其实要给其挂载目录(/Volumes/dockermnt/mysql/data) 赋权限，如 chmod -R 777  /Volumes/dockermnt/mysql/data

`chmod -R 777 /Volumes/dockermnt/`

2. resis

    `
   mkdir -p /mydata/redis/conf
   touch /mydata/redis/conf/redis.conf #必须的
    `

    `
    docker run -p 6379:6379 --name redis -v /mydata/redis/data:/data \
    -v /mydata/redis/conf/redis.conf:/etc/redis/redis.conf \
    -d redis redis-server /etc/redis/redis.conf
    `

redis 自描述文件：
https://raw.githubusercontent.com/antirez/redis/4.0/redis.conf
   
3. springboot initializer 生成脚手架代码
   springboot initializer生成脚手架代码时，只能选较高的 springboot version 
   为了和教程所用的 springboot版本一致，所以手动在 pom.xml 文件中改为了
   `2.1.8-RELEASE`

   发现 testcase跑不起来，是因为 testcase 脚手架代码是
   springboot initializer使用较高版本的 springboot 2.7 (更高版本)所生成的。

>解决方式是打开一个真正的2.1.8-RELEASE版本的 test 目录，复制过来就 OK.

4. 解决spring cloud版本不匹配问题：
   springboot initializer生成脚手架代码时，只能选较高的 springboot 2.7.12 版本
   为了和教程所用的 springboot版本一致，所以手动在 pom.xml 文件中改为了
   `2.1.8-RELEASE`

    发现项目报错

   `
   org.springframework.beans.factory.BeanCreationException: 
   Error creating bean with name 'gulimallProductApplication': 
   Initialization of bean failed; nested exception is java.lang.NoClassDefFoundError: 
   org/springframework/boot/context/properties/ConfigurationPropertiesBean
   `
   原因是springboot initializer 使用springboot 2.7.12 生成的脚手架代码中，使用的是spring cloud 2021.1.7。
   这个版本的 spring cloud中确实不存在类ConfigurationPropertiesBean。

>将 sping cloud 的版本调整为与 spring boot 2.1.8-RELEASE相匹配的版本就 OK 了
`
<spring-cloud.version>2021.0.7</spring-cloud.version>
`


5. ###### spring解决循环依赖的代码在：
类
`
org.springframework.beans.factory.support.AbstractBeanFactory.java
`

中的这个方法：

`
protected <T> T doGetBean(final String name, @Nullable final Class<T> requiredType,
@Nullable final Object[] args, boolean typeCheckOnly) throws BeansException
`

最终会调用到这个方法：

`
protected Object createBean(String beanName, RootBeanDefinition mbd, @Nullable Object[] args)
throws BeanCreationException {
`


