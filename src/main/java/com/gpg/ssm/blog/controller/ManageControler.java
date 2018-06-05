package com.gpg.ssm.blog.controller;

import com.gpg.ssm.blog.common.Capt;
import com.gpg.ssm.blog.common.CommonResult;
import com.gpg.ssm.blog.dao.CategoryMapper;
import com.gpg.ssm.blog.entity.Category;
import com.gpg.ssm.blog.entity.TypeCate;
import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.service.TypeCateService;
import com.gpg.ssm.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(value = "manage")
public class ManageControler {

    @Resource(name = "userServiceImpl")
    private UserService userServiceImpl;

    @Resource(name = "categoryServiceImpl")
    private CategoryMapper categoryServiceImpl;

    @Resource(name = "cypeCateServiceImpl")
    private TypeCateService cypeCateServiceImpl;

    /*登录成功*/
    @RequestMapping(value = "signin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody User user, HttpServletRequest request) {
        System.out.println(user);
        if (user == null) {
            return new CommonResult(500, user, "用户名或密码不能为空");
        } else {
            User u = userServiceImpl.queryByUserNmaeAndPwd(user);
            if (u != null) {
                request.getSession().setAttribute("user", u);
                return new CommonResult(200, u, "登录成功");
            } else {
                return new CommonResult(404, u, "用户名或密码错误");
            }
        }
    }

    /*验证码*/
    @RequestMapping(value = "getCaptcha", method = RequestMethod.GET)
    @ResponseBody
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.reset();
        response.setContentType("image/jpeg;charset=UTF-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
        HttpSession session = request.getSession();
        int width = 90;
        int height = 33;
        System.setProperty("java.awt.headless", "true");
        BufferedImage image = new BufferedImage(width, height, 1);
        Graphics g = image.getGraphics();
        Random random = new Random();
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, width, height);
        g.setColor(new Color(204, 204, 204));
        g.drawRect(0, 0, width - 1, height - 1);
        g.setFont(new Font("Consolas", Font.ITALIC, 19));
        //绘制干扰线
        g.setColor(new Color(160, 160, 200));// 设置线条的颜色
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(width - 1);
            int y = random.nextInt(height - 1);
            int xl = random.nextInt(6) + 1;
            int yl = random.nextInt(12) + 1;
            g.drawLine(x, y, x + xl + 40, y + yl + 20);
        }
        String sRand = "";
        for (int i = 0; i < 6; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand = sRand + rand;
            g.setColor(new Color(20 + random.nextInt(110), 20 + random
                    .nextInt(110), 20 + random.nextInt(110)));
            g.drawString(rand, 10 * i + 15, 22);
        }
        session.setAttribute("valKey", sRand);
        g.dispose();
        ServletOutputStream outStream = response.getOutputStream();
        // ImageIO encoder = ImageIO.createJPEGEncoder(outStream);
        ImageIO.write(image, "JPEG", outStream);
        outStream.close();
    }

    @RequestMapping(value = "checkCapt", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult checkCapt(@RequestBody Capt capt, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(capt.getCode());
        String key = (String) session.getAttribute("valKey");
        if (key.equals(capt.getCode())) {
            return new CommonResult(200, null, "验证码正确");
        }
        return new CommonResult(300, null, "验证码错误");
    }

    @RequestMapping(value = "author", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getInfo(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        User u = userServiceImpl.queryById(user.getId());
        if (u == null) {
            return new CommonResult(404, u, "");
        } else {
            return new CommonResult(200, u, "");
        }
    }

    @RequestMapping(value = "category", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCategory() {
        List<Category> list = categoryServiceImpl.list();
        return new CommonResult(200, list, "");
    }


    @RequestMapping(value = "category", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult putCategory(@RequestBody Category category) {
        System.out.println(category);
        return new CommonResult(200, null, "");
    }


    @RequestMapping(value = "typecate", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getTypeCate() {
        List<TypeCate> list = cypeCateServiceImpl.list();
        return new CommonResult(200, list, "");
    }
}
