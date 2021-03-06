dataSource {
    pooled = true
    jmxExport = true
	driverClassName = "org.postgresql.Driver"
    dialect = "org.hibernate.dialect.PostgreSQLDialect"

    //username = "admin_db_sgg"
   // password = "vfr43edcxsw2"
	
	//usando esse
	username = "admin_db_sr"
	password = "bgt54rfvcde3"
	
	//username = "postgres"
	//password = "123"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
        dataSource {
            driverClassName = "org.postgresql.Driver"
			   //username = "admin_db_sgg"
			   //password = "vfr43edcxsw2"
			
			//usando esse
			username = "admin_db_sr"
			password = "bgt54rfvcde3"
			
			
			//username = "postgres"
		 	//password = "123"
		 
			
			dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			
			//url = "jdbc:postgresql://192.168.1.247:5667/db_sgg_testes"
			//url = "jdbc:postgresql://192.168.1.247:5667/db_sgg_testes"
			  url = "jdbc:postgresql://192.168.1.247:5667/db_sgg_testes"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = ""
        }
    }
    production {
        dataSource {
			
			driverClassName = "org.postgresql.Driver"
			//username = "admin_db_sr"
			//password = "bgt54rfvcde3"			
            dbCreate = "update"
            //url = "jdbc:postgresql://192.168.1.247:5667/db_sgg_testes"
			  url = "jdbc:postgresql://192.168.1.247:5667/db_sgg_testes"
			
			}
			 }
			
            properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               jmxEnabled = true
               initialSize = 5
               maxActive = 50
               minIdle = 5
               maxIdle = 25
               maxWait = 10000
               maxAge = 10 * 60000
               timeBetweenEvictionRunsMillis = 5000
               minEvictableIdleTimeMillis = 60000
               validationQuery = "SELECT 1"
               validationQueryTimeout = 3
               validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = false
               jdbcInterceptors = "ConnectionState"
               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            
       
    }
}

