package com.yubao.serverOne;

import com.yubao.serverOne.entity.Fund;
import com.yubao.serverOne.service.FundService;
import io.swagger.annotations.Authorization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author YuBao
 * @date 2022/10/10 17:00
 * 单元测试方式
 */
public class MyTest {

    @Autowired
    private FundService fundService;


    @Test
    public void test() {
        System.out.println("hello world");
    }


    @Test
    public void getList() {
        List<Fund> list = fundService.list();
        if (list != null) {
            System.out.println(list);
        } else {
            System.out.println("查询失败");
        }
    }

    @Test
    public void getOne() {
        Fund fund = fundService.getById(1);
        if (fund != null) {
            System.out.println(fund);
        } else {
            System.out.println("查询失败");
        }
    }


    @Test
    public void add() {
        Fund fund = new Fund();
        fund.setName("测试");
        fund.setAge(15);
        fund.setPhone("1577411230");
        fund.setAddress("测试地址");
        boolean save = fundService.save(fund);
        if (save) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    @Test
    public void delete() {
        boolean b = fundService.removeById(1);
        if (b) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }


    @Test
    public void update() {
        Fund fund = new Fund();
        fund.setId(2);
        fund.setName("测试2");
        fund.setAge(15);
        fund.setPhone("1577411230");
        fund.setAddress("测试地址");
        boolean b = fundService.updateById(fund);
        if (b) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

}
