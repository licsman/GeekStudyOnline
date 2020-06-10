# MyBatis

## MyBatis Generator

Generate mybatis files if database schema updated.
```bash
# In root directory, ignore if you have done this.
mvn install

mvn -Dmybatis.generator.jdbcURL=jdbc:mysql://127.0.0.1:3306/geek?useSSL=false -Dmybatis.generator.jdbcUserId=root -Dmybatis.generator.jdbcPassword=MySQL!23 mybatis-generator:generate
```

You can also add a maven task in IDE and pass `mybatis.generator.jdbcURL`,
`mybatis.generator.jdbcUserId` and `mybatis.generator.jdbcPassword` to `mvn`
in IDE setting.

## New tables
Beside `liuquibase` for table schema, you should also generate `mybatis` files for new tables.
Mybatis generator uses file [`generatorConfig.xml`][] in `orange` directory to generate files.

## Links
* [MyBatis](http://www.mybatis.org/mybatis-3/index.html)
* [MyBatis Generator](http://www.mybatis.org/generator/running/running.html)

[`generatorConfig.xml`]: http://www.mybatis.org/generator/configreference/table.html
