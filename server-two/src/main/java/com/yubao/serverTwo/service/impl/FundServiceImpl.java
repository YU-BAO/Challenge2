package com.yubao.serverTwo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yubao.serverTwo.entity.Fund;
import com.yubao.serverTwo.mapper.FundMapper;
import com.yubao.serverTwo.service.FundService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YuBao
 * @since 2022-10-10
 */
@Service
public class FundServiceImpl extends ServiceImpl<FundMapper, Fund> implements FundService {

}
