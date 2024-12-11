package dsw.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaDataSourceService implements DataSourceService {
    
    @Override
    public String getDataSource() {
        return "qa-data-source";
    }
}
