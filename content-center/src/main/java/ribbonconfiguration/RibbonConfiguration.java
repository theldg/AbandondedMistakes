package ribbonconfiguration;

import com.ldg.app.contentcenter.configuration.NacosSameClusterWeightedRule;
import com.ldg.app.contentcenter.configuration.NacosWeightedRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author ldg
 * Ribbon配置类
 * 注意这个配置类要写在springboot启动类扫描不到的地方
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new NacosSameClusterWeightedRule();
    }


}
