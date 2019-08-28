<h1>SSM框架整合(SpringMVC+Spring+Mybatis)</h1>
<hr/>
<img src="img/superStar.jpg"/>

<h3>整合流程：</h3>
<ul>
    <li>导入相关jar包（见web/lib目录)<br/></li>
    <li>Spring配置文件：applicationContext.xml
        <ul>
            <li>扫描dao、service。</li>
            <li>bean：配置数据源（dataSource)。</li>
            <li>bean：配置SqlSessionFactory
            （需要注入数据源等其他配置，此处相当于mybatis核心配置文件）。
            </li>
            <li>bean：配置MapperScannerConfigurer
            （需要注入sqlSessionFacotry、basePackage(dao层路径）等其他配置，
            根据dao层自动映射生成相应的实现类。
            </li>
            <li>配置事务等。</li>
        </ul><br/>
    </li>
    <li>SpringMVC配置文件：
        <ul>
            <li>扫描Controller。</li>
            <li>开启mvc注解驱动(<mvc:annotation-driven/>)</li>
        </ul><br/>
    </li>
    <li>Mybatis映射文件。</li>
</ul>


<hr/>
<h4>
    初学者搭建，不完备之处还请指教。           ______在线寻求志同道合的朋友，大家一起学习。
    <br/><br/>
    @edition: ssm_001  &nbsp&nbsp@date: Wed Aug 28 11:39:45 CST 2019  &nbsp&nbsp@author: XDD288
</h4>

