package net.bruce.web.zzim.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.bruce.web.zzim.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * Created by yang.jianan on 2017/07/20 15:35.
 */
public class Application extends ResourceConfig{
    public Application() {
        //注册逻辑处理的包名
        packages(AccountService.class.getPackage().getName());

        //注册gson解析器
        register(JacksonJsonProvider.class);

        //注册日志打印器
        register(Logger.class);
    }
}
