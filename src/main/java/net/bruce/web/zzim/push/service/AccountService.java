package net.bruce.web.zzim.push.service;

import net.bruce.web.zzim.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by yang.jianan on 2017/07/20 15:59.
 */
// 127.0.0.1/api/account/...
@Path("/account")
public class AccountService {

    // 127.0.0.1/api/account/login
    @GET
    @Path("/login")
    public String get() {
        return "login in successful.";
    }

    @POST
    @Path("/login")
    //指定请求的响应体为JSON
    @Consumes(MediaType.APPLICATION_JSON)
    //指定返回的响应体为JSON
    @Produces(MediaType.APPLICATION_JSON)
    public User post() {
        User user = new User();
        user.setName("帅哥");
        user.setSex(1);
        return user;
    }
}
