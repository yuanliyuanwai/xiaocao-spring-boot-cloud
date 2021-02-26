package top.wanzc.commandLineRunner.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExceptionRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
    	// throw new RuntimeException();
    	// 在spring初始化线程中同步进行初始化，如果报错spring启动异常
    }
}