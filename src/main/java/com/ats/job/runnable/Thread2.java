package com.ats.job.runnable;

import com.ats.job.server.CDACreateServer;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by xu on 2019/01/21.
 */
public class Thread2 extends CDACreateServer implements Runnable{
    private String tableName;
    public Thread2(String tableName ) {
        this.tableName=tableName;
    }

    @Override
    public void run() {
             initCDAData(tableName);
    }



}
