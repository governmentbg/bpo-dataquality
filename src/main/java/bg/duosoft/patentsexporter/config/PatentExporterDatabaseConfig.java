package bg.duosoft.patentsexporter.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@RequiredArgsConstructor
@EnableJpaRepositories(
        basePackages = {"bg.duosoft.patentsexporter.repository.patent_exporter"},
        entityManagerFactoryRef = "patentExporterDbEntityManager",
        transactionManagerRef = "patentExporterDbTransactionManager"
)
public class PatentExporterDatabaseConfig {

    private final Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean patentExporterDbEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(patentExporterDbDataSource());
        em.setPackagesToScan("bg.duosoft.patentsexporter.domain.entity.patent_exporter");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", env.getProperty("pdb.jpa.database-platform"));
        properties.put("hibernate.show_sql", env.getProperty("pdb.hibernate.show_sql"));
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean
    @ConfigurationProperties(prefix = "patent.exporter.db.datasource")
    public DataSource patentExporterDbDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public PlatformTransactionManager patentExporterDbTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(patentExporterDbEntityManager().getObject());
        return transactionManager;
    }

}