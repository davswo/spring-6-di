package dsw.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevDataSourceService implements DataSourceService {
    
    @Override
    public String getDataSource() {
        return "dev-data-source";
    }
}
