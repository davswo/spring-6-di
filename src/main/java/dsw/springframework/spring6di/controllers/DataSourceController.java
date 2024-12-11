package dsw.springframework.spring6di.controllers;

import dsw.springframework.spring6di.services.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    
    private final DataSourceService dataSourceService;
    
    public DataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }
    
    public String getDataSource() {
        return dataSourceService.getDataSource();
    }
}
